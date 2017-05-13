
package com.example.quad2.houselistings.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("imagesMap")
    @Expose
    private ImagesMap imagesMap;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("displayPic")
    @Expose
    private boolean displayPic;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Photo() {
    }

    /**
     * 
     * @param title
     * @param imagesMap
     * @param name
     * @param displayPic
     */
    public Photo(ImagesMap imagesMap, String title, String name, boolean displayPic) {
        super();
        this.imagesMap = imagesMap;
        this.title = title;
        this.name = name;
        this.displayPic = displayPic;
    }

    public ImagesMap getImagesMap() {
        return imagesMap;
    }

    public void setImagesMap(ImagesMap imagesMap) {
        this.imagesMap = imagesMap;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDisplayPic() {
        return displayPic;
    }

    public void setDisplayPic(boolean displayPic) {
        this.displayPic = displayPic;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "imagesMap=" + imagesMap +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", displayPic=" + displayPic +
                '}';
    }
}
