package com.example.space.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class Payload {

    @SerializedName("payload_id")

    private String payloadId;
    @SerializedName("norad_id")

    private List<Integer> noradId = null;
    @SerializedName("reused")

    private Boolean reused;
    @SerializedName("customers")

    private List<String> customers = null;
    @SerializedName("nationality")

    private String nationality;
    @SerializedName("manufacturer")

    private String manufacturer;

    @SerializedName("payload_type")
    private String payloadType;

    @SerializedName("payload_mass_kg")
    private Double payloadMassKg;

    @SerializedName("payload_mass_lbs")

    private Double payloadMassLbs;
    @SerializedName("orbit")

    private String orbit;
    @SerializedName("orbit_params")

    private OrbitParams orbitParams;
    @SerializedName("uid")

    private String uid;

    /**
     * No args constructor for use in serialization
     */
    public Payload() {
    }

    /**
     * @param payloadId
     * @param payloadMassLbs
     * @param uid
     * @param noradId
     * @param nationality
     * @param payloadType
     * @param payloadMassKg
     * @param customers
     * @param orbit
     * @param reused
     * @param orbitParams
     * @param manufacturer
     */
    public Payload(String payloadId, List<Integer> noradId, Boolean reused, List<String> customers, String nationality, String manufacturer, String payloadType, Double payloadMassKg, Double payloadMassLbs, String orbit, OrbitParams orbitParams, String uid) {
        super();
        this.payloadId = payloadId;
        this.noradId = noradId;
        this.reused = reused;
        this.customers = customers;
        this.nationality = nationality;
        this.manufacturer = manufacturer;
        this.payloadType = payloadType;
        this.payloadMassKg = payloadMassKg;
        this.payloadMassLbs = payloadMassLbs;
        this.orbit = orbit;
        this.orbitParams = orbitParams;
        this.uid = uid;
    }

    public String getPayloadId() {
        return payloadId;
    }

    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    public List<Integer> getNoradId() {
        return noradId;
    }

    public void setNoradId(List<Integer> noradId) {
        this.noradId = noradId;
    }

    public Boolean getReused() {
        return reused;
    }

    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    public List<String> getCustomers() {
        return customers;
    }

    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    public Double getPayloadMassKg() {
        return payloadMassKg;
    }

    public void setPayloadMassKg(Double payloadMassKg) {
        this.payloadMassKg = payloadMassKg;
    }

    public Double getPayloadMassLbs() {
        return payloadMassLbs;
    }

    public void setPayloadMassLbs(Double payloadMassLbs) {
        this.payloadMassLbs = payloadMassLbs;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public OrbitParams getOrbitParams() {
        return orbitParams;
    }

    public void setOrbitParams(OrbitParams orbitParams) {
        this.orbitParams = orbitParams;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Payload{" +
                "payloadId='" + payloadId + '\'' +
                ", noradId=" + noradId +
                ", reused=" + reused +
                ", customers=" + customers +
                ", nationality='" + nationality + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", payloadType='" + payloadType + '\'' +
                ", payloadMassKg=" + payloadMassKg +
                ", payloadMassLbs=" + payloadMassLbs +
                ", orbit='" + orbit + '\'' +
                ", orbitParams=" + orbitParams +
                ", uid='" + uid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payload payload = (Payload) o;
        return Objects.equals(payloadId, payload.payloadId) &&
                Objects.equals(noradId, payload.noradId) &&
                Objects.equals(reused, payload.reused) &&
                Objects.equals(customers, payload.customers) &&
                Objects.equals(nationality, payload.nationality) &&
                Objects.equals(manufacturer, payload.manufacturer) &&
                Objects.equals(payloadType, payload.payloadType) &&
                Objects.equals(payloadMassKg, payload.payloadMassKg) &&
                Objects.equals(payloadMassLbs, payload.payloadMassLbs) &&
                Objects.equals(orbit, payload.orbit) &&
                Objects.equals(orbitParams, payload.orbitParams) &&
                Objects.equals(uid, payload.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payloadId, noradId, reused, customers, nationality, manufacturer, payloadType, payloadMassKg, payloadMassLbs, orbit, orbitParams, uid);
    }
}