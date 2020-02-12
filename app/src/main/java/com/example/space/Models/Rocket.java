package com.example.space.Models;

import com.google.gson.annotations.SerializedName;

public class Rocket {

    @SerializedName("rocket_id")

    private String rocketId;
    @SerializedName("rocket_name")

    private String rocketName;
    @SerializedName("rocket_type")

    private String rocketType;
    @SerializedName("first_stage")

    private FirstStage firstStage;
    @SerializedName("second_stage")

    private SecondStage secondStage;
    @SerializedName("fairings")

    private Fairings fairings;

    /**
     * No args constructor for use in serialization
     *
     */
    public Rocket() {
    }

    /**
     *
     * @param rocketId
     * @param secondStage
     * @param fairings
     * @param rocketType
     * @param rocketName
     * @param firstStage
     */
    public Rocket(String rocketId, String rocketName, String rocketType, FirstStage firstStage, SecondStage secondStage, Fairings fairings) {
        super();
        this.rocketId = rocketId;
        this.rocketName = rocketName;
        this.rocketType = rocketType;
        this.firstStage = firstStage;
        this.secondStage = secondStage;
        this.fairings = fairings;
    }

    public String getRocketId() {
        return rocketId;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public String getRocketName() {
        return rocketName;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }

    public FirstStage getFirstStage() {
        return firstStage;
    }

    public void setFirstStage(FirstStage firstStage) {
        this.firstStage = firstStage;
    }

    public SecondStage getSecondStage() {
        return secondStage;
    }

    public void setSecondStage(SecondStage secondStage) {
        this.secondStage = secondStage;
    }

    public Fairings getFairings() {
        return fairings;
    }

    public void setFairings(Fairings fairings) {
        this.fairings = fairings;
    }

}