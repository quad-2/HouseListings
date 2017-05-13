package com.example.quad2.houselistings.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quad2.houselistings.R;
import com.example.quad2.houselistings.adapter.EndlessRecyclerViewScrollListener;
import com.example.quad2.houselistings.adapter.PostAdapter;
import com.example.quad2.houselistings.interfaces.RestAPIInterface;
import com.example.quad2.houselistings.pojo.Datum;
import com.example.quad2.houselistings.pojo.HouseListings;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HouseListingActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://www.nobroker.in/api/v1/property/filter/";
    private final int REQUEST_CODE = 20;

    private RecyclerView postsRV;
    private ProgressDialog dialog;
    private List<Datum> datumList = new ArrayList<>();
    private PostAdapter postAdapter;
    private EndlessRecyclerViewScrollListener scrollListener;
    private TextView noResultText;

    private String buildingType, furnishing, type;
    private int pageNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_listing);
        postsRV = (RecyclerView) findViewById(R.id.posts_rv);
        noResultText = (TextView) findViewById(R.id.no_result_text);
        dialog = new ProgressDialog(HouseListingActivity.this);
        dialog.setMessage("Loading...");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.filter_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {

            case R.id.filter:
                Intent intent = new Intent(HouseListingActivity.this, FilterActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // REQUEST_CODE is defined above
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            Bundle bundle = data.getExtras();
            if (bundle != null) {
                buildingType = bundle.getString("buildingPara");
                type = bundle.getString("typePara");
                furnishing = bundle.getString("furnishPara");
            }
            //Log.d("log3", type + "***" + buildingType + "***" + furnishing);
            pageNumber = 1;
            datumList.clear();
            getData(pageNumber, type, buildingType, furnishing);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        pageNumber = 1;
        datumList.clear();
        getData(pageNumber, type, buildingType, furnishing);
    }

    public void setPostAdapter() {
        if (datumList.size() == 0) {
            noResultText.setVisibility(View.VISIBLE);
            postsRV.setVisibility(View.GONE);
        } else if (datumList.size() > 0) {
            postsRV.setVisibility(View.VISIBLE);
            noResultText.setVisibility(View.GONE);
        }
        postAdapter = new PostAdapter(HouseListingActivity.this, datumList);
        LinearLayoutManager llm = new LinearLayoutManager(HouseListingActivity.this, LinearLayoutManager.VERTICAL, false);
        postsRV.setLayoutManager(llm);
        postsRV.setAdapter(postAdapter);
        scrollListener = new EndlessRecyclerViewScrollListener(llm) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                ++pageNumber;
                dialog.show();
                loadNextPage(pageNumber);
            }
        };
        postsRV.addOnScrollListener(scrollListener);
        postAdapter.notifyDataSetChanged();
    }

    //getting the house list
    public void getData(int pageNumber, String type, String buildingType, String furnishing) {
        //Log.d("log4", "***" + pageNumber + "***" + type + "***" + buildingType + "***" + furnishing);
        dialog.show();
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.readTimeout(15, TimeUnit.SECONDS);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient.build())
                .build();

        RestAPIInterface dataAPI = retrofit.create(RestAPIInterface.class);
        Call<HouseListings> call = dataAPI.getPosts(pageNumber, type, buildingType, furnishing);
        call.enqueue(new Callback<HouseListings>() {
            @Override
            public void onResponse(Call<HouseListings> call, Response<HouseListings> response) {
                dialog.dismiss();
                if (response != null && response.body() != null) {

                    if (response.body().getStatusCode() == 200) {

                        HouseListings responseBody = response.body();
                        //Log.d("log1", responseBody.toString());
                        datumList.addAll(responseBody.getData());
                        setPostAdapter();
                    }

                }
            }

            @Override
            public void onFailure(Call<HouseListings> call, Throwable t) {
                t.printStackTrace();
                dialog.dismiss();
                Toast.makeText(HouseListingActivity.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // pagination api call
    public void loadNextPage(int number) {
        //Log.d("log5", "***" + pageNumber + "***" + type + "***" + buildingType + "***" + furnishing);
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.readTimeout(15, TimeUnit.SECONDS);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient.build())
                .build();

        RestAPIInterface dataAPI = retrofit.create(RestAPIInterface.class);
        Call<HouseListings> call = dataAPI.getPosts(number, type, buildingType, furnishing);
        call.enqueue(new Callback<HouseListings>() {
            @Override
            public void onResponse(Call<HouseListings> call, Response<HouseListings> response) {
                dialog.dismiss();

                if (response != null && response.body() != null) {

                    if (response.body().getStatusCode() == 200) {

                        HouseListings responseBody = response.body();
                        //Log.d("log2", responseBody.toString());
                        datumList.addAll(responseBody.getData());
                        postAdapter.notifyDataSetChanged();
                    }
                }
            }

            @Override
            public void onFailure(Call<HouseListings> call, Throwable t) {
                t.printStackTrace();
                dialog.dismiss();
                Toast.makeText(HouseListingActivity.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
