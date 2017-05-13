
package com.example.quad2.houselistings.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Score {

    @SerializedName("lifestyle")
    @Expose
    private double lifestyle;
    @SerializedName("lastUpdatedDate")
    @Expose
    private long lastUpdatedDate;
    @SerializedName("transit")
    @Expose
    private double transit;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Score() {
    }

    /**
     * 
     * @param lifestyle
     * @param lastUpdatedDate
     * @param transit
     */
    public Score(double lifestyle, long lastUpdatedDate, double transit) {
        super();
        this.lifestyle = lifestyle;
        this.lastUpdatedDate = lastUpdatedDate;
        this.transit = transit;
    }

    public double getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(double lifestyle) {
        this.lifestyle = lifestyle;
    }

    public long getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(long lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public double getTransit() {
        return transit;
    }

    public void setTransit(double transit) {
        this.transit = transit;
    }

    @Override
    public String toString() {
        return "Score{" +
                "lifestyle=" + lifestyle +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", transit=" + transit +
                '}';
    }
}
