package com.example.space.Models;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Core {

    @SerializedName("flight")
    private Integer flight;

    @SerializedName("landing_type")
    private String landingType;

    @SerializedName("gridfins")
    private boolean gridfins;

    @SerializedName("landing_intent")
    private boolean landingIntent;

    @SerializedName("legs")
    private boolean legs;

    @SerializedName("land_success")
    private boolean landSuccess;

    @SerializedName("landing_vehicle")
    private String landingVehicle;

    @SerializedName("block")
    private Integer block;

    @SerializedName("reused")
    private boolean reused;

    @SerializedName("core_serial")
    private String coreSerial;

    /**
     * No args constructor for use in serialization
     */
    public Core() {
    }

    public Core(String coreSerial, Integer flight, Integer block, Boolean gridfins, Boolean legs, Boolean reused, Boolean landSuccess, Boolean landingIntent, String landingType, String landingVehicle) {
        super();
        this.coreSerial = coreSerial;
        this.flight = flight;
        this.block = block;
        this.gridfins = gridfins;
        this.legs = legs;
        this.reused = reused;
        this.landSuccess = landSuccess;
        this.landingIntent = landingIntent;
        this.landingType = landingType;
        this.landingVehicle = landingVehicle;
    }

    public String getCoreSerial() {
        return coreSerial;
    }

    public void setCoreSerial(String coreSerial) {
        this.coreSerial = coreSerial;
    }

    public Integer getFlight() {
        return flight;
    }

    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Boolean getGridfins() {
        return gridfins;
    }

    public void setGridfins(Boolean gridfins) {
        this.gridfins = gridfins;
    }

    public Boolean getLegs() {
        return legs;
    }

    public void setLegs(Boolean legs) {
        this.legs = legs;
    }

    public Boolean getReused() {
        return reused;
    }

    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    public Boolean getLandSuccess() {
        return landSuccess;
    }

    public void setLandSuccess(Boolean landSuccess) {
        this.landSuccess = landSuccess;
    }

    public Boolean getLandingIntent() {
        return landingIntent;
    }

    public void setLandingIntent(Boolean landingIntent) {
        this.landingIntent = landingIntent;
    }

    public String getLandingType() {
        return landingType;
    }

    public void setLandingType(String landingType) {
        this.landingType = landingType;
    }

    public String getLandingVehicle() {
        return landingVehicle;
    }

    public void setLandingVehicle(String landingVehicle) {
        this.landingVehicle = landingVehicle;
    }

    @Override
    public String toString() {
        return "Core{" +
                "coreSerial='" + coreSerial + '\'' +
                ", flight=" + flight +
                ", block=" + block +
                ", gridfins=" + gridfins +
                ", legs=" + legs +
                ", reused=" + reused +
                ", landSuccess=" + landSuccess +
                ", landingIntent=" + landingIntent +
                ", landingType='" + landingType + '\'' +
                ", landingVehicle='" + landingVehicle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Core core = (Core) o;
        return Objects.equals(coreSerial, core.coreSerial) &&
                Objects.equals(flight, core.flight) &&
                Objects.equals(block, core.block) &&
                Objects.equals(gridfins, core.gridfins) &&
                Objects.equals(legs, core.legs) &&
                Objects.equals(reused, core.reused) &&
                Objects.equals(landSuccess, core.landSuccess) &&
                Objects.equals(landingIntent, core.landingIntent) &&
                Objects.equals(landingType, core.landingType) &&
                Objects.equals(landingVehicle, core.landingVehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coreSerial, flight, block, gridfins, legs, reused, landSuccess, landingIntent, landingType, landingVehicle);
    }

}