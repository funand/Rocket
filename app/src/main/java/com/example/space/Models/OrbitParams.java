package com.example.space.Models;


import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class OrbitParams {

    @SerializedName("reference_system")

    private String referenceSystem;
    @SerializedName("regime")

    private String regime;
    @SerializedName("longitude")

    private Object longitude;
    @SerializedName("semi_major_axis_km")

    private Double semiMajorAxisKm;
    @SerializedName("eccentricity")

    private Double eccentricity;
    @SerializedName("periapsis_km")

    private Double periapsisKm;
    @SerializedName("apoapsis_km")

    private Double apoapsisKm;
    @SerializedName("inclination_deg")

    private Double inclinationDeg;
    @SerializedName("period_min")

    private Double periodMin;
    @SerializedName("lifespan_years")

    private Object lifespanYears;
    @SerializedName("epoch")

    private String epoch;
    @SerializedName("mean_motion")

    private Double meanMotion;
    @SerializedName("raan")

    private Double raan;
    @SerializedName("arg_of_pericenter")

    private Double argOfPericenter;
    @SerializedName("mean_anomaly")

    private Double meanAnomaly;

    /**
     * No args constructor for use in serialization
     *
     */
    public OrbitParams() {
    }

    /**
     *
     * @param argOfPericenter
     * @param regime
     * @param semiMajorAxisKm
     * @param meanMotion
     * @param eccentricity
     * @param raan
     * @param epoch
     * @param periodMin
     * @param lifespanYears
     * @param apoapsisKm
     * @param periapsisKm
     * @param meanAnomaly
     * @param referenceSystem
     * @param inclinationDeg
     * @param longitude
     */
    public OrbitParams(String referenceSystem, String regime, Object longitude, Double semiMajorAxisKm, Double eccentricity, Double periapsisKm, Double apoapsisKm, Double inclinationDeg, Double periodMin, Object lifespanYears, String epoch, Double meanMotion, Double raan, Double argOfPericenter, Double meanAnomaly) {
        super();
        this.referenceSystem = referenceSystem;
        this.regime = regime;
        this.longitude = longitude;
        this.semiMajorAxisKm = semiMajorAxisKm;
        this.eccentricity = eccentricity;
        this.periapsisKm = periapsisKm;
        this.apoapsisKm = apoapsisKm;
        this.inclinationDeg = inclinationDeg;
        this.periodMin = periodMin;
        this.lifespanYears = lifespanYears;
        this.epoch = epoch;
        this.meanMotion = meanMotion;
        this.raan = raan;
        this.argOfPericenter = argOfPericenter;
        this.meanAnomaly = meanAnomaly;
    }

    public String getReferenceSystem() {
        return referenceSystem;
    }

    public void setReferenceSystem(String referenceSystem) {
        this.referenceSystem = referenceSystem;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public Double getSemiMajorAxisKm() {
        return semiMajorAxisKm;
    }

    public void setSemiMajorAxisKm(Double semiMajorAxisKm) {
        this.semiMajorAxisKm = semiMajorAxisKm;
    }

    public Double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(Double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public Double getPeriapsisKm() {
        return periapsisKm;
    }

    public void setPeriapsisKm(Double periapsisKm) {
        this.periapsisKm = periapsisKm;
    }

    public Double getApoapsisKm() {
        return apoapsisKm;
    }

    public void setApoapsisKm(Double apoapsisKm) {
        this.apoapsisKm = apoapsisKm;
    }

    public Double getInclinationDeg() {
        return inclinationDeg;
    }

    public void setInclinationDeg(Double inclinationDeg) {
        this.inclinationDeg = inclinationDeg;
    }

    public Double getPeriodMin() {
        return periodMin;
    }

    public void setPeriodMin(Double periodMin) {
        this.periodMin = periodMin;
    }

    public Object getLifespanYears() {
        return lifespanYears;
    }

    public void setLifespanYears(Object lifespanYears) {
        this.lifespanYears = lifespanYears;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public Double getMeanMotion() {
        return meanMotion;
    }

    public void setMeanMotion(Double meanMotion) {
        this.meanMotion = meanMotion;
    }

    public Double getRaan() {
        return raan;
    }

    public void setRaan(Double raan) {
        this.raan = raan;
    }

    public Double getArgOfPericenter() {
        return argOfPericenter;
    }

    public void setArgOfPericenter(Double argOfPericenter) {
        this.argOfPericenter = argOfPericenter;
    }

    public Double getMeanAnomaly() {
        return meanAnomaly;
    }

    public void setMeanAnomaly(Double meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    @Override
    public String toString() {
        return "OrbitParams{" +
                "referenceSystem='" + referenceSystem + '\'' +
                ", regime='" + regime + '\'' +
                ", longitude=" + longitude +
                ", semiMajorAxisKm=" + semiMajorAxisKm +
                ", eccentricity=" + eccentricity +
                ", periapsisKm=" + periapsisKm +
                ", apoapsisKm=" + apoapsisKm +
                ", inclinationDeg=" + inclinationDeg +
                ", periodMin=" + periodMin +
                ", lifespanYears=" + lifespanYears +
                ", epoch='" + epoch + '\'' +
                ", meanMotion=" + meanMotion +
                ", raan=" + raan +
                ", argOfPericenter=" + argOfPericenter +
                ", meanAnomaly=" + meanAnomaly +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrbitParams that = (OrbitParams) o;
        return Objects.equals(referenceSystem, that.referenceSystem) &&
                Objects.equals(regime, that.regime) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(semiMajorAxisKm, that.semiMajorAxisKm) &&
                Objects.equals(eccentricity, that.eccentricity) &&
                Objects.equals(periapsisKm, that.periapsisKm) &&
                Objects.equals(apoapsisKm, that.apoapsisKm) &&
                Objects.equals(inclinationDeg, that.inclinationDeg) &&
                Objects.equals(periodMin, that.periodMin) &&
                Objects.equals(lifespanYears, that.lifespanYears) &&
                Objects.equals(epoch, that.epoch) &&
                Objects.equals(meanMotion, that.meanMotion) &&
                Objects.equals(raan, that.raan) &&
                Objects.equals(argOfPericenter, that.argOfPericenter) &&
                Objects.equals(meanAnomaly, that.meanAnomaly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referenceSystem, regime, longitude, semiMajorAxisKm, eccentricity, periapsisKm, apoapsisKm, inclinationDeg, periodMin, lifespanYears, epoch, meanMotion, raan, argOfPericenter, meanAnomaly);
    }
}