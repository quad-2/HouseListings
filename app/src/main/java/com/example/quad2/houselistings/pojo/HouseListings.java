
package com.example.quad2.houselistings.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HouseListings {

    @SerializedName("status")
    @Expose
    private long status;
    @SerializedName("statusCode")
    @Expose
    private long statusCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("otherParams")
    @Expose
    private OtherParams otherParams;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HouseListings() {
    }

    /**
     * 
     * @param message
     * @param statusCode
     * @param otherParams
     * @param status
     * @param data
     */
    public HouseListings(long status, long statusCode, String message, OtherParams otherParams, List<Datum> data) {
        super();
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
        this.otherParams = otherParams;
        this.data = data;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(long statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OtherParams getOtherParams() {
        return otherParams;
    }

    public void setOtherParams(OtherParams otherParams) {
        this.otherParams = otherParams;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HouseListings{" +
                "status=" + status +
                ", statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", otherParams=" + otherParams +
                ", data=" + data +
                '}';
    }
}
