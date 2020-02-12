package com.example.space.Models;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Fairings {

    @SerializedName("reused")

    private Boolean reused;
    @SerializedName("recovery_attempt")

    private Boolean recoveryAttempt;
    @SerializedName("recovered")

    private Boolean recovered;
    @SerializedName("ship")

    private String ship;

    /**
     * No args constructor for use in serialization
     */
    public Fairings() {
    }

    /**
     * @param recovered
     * @param recoveryAttempt
     * @param ship
     * @param reused
     */
    public Fairings(Boolean reused, Boolean recoveryAttempt, Boolean recovered, String ship) {
        super();
        this.reused = reused;
        this.recoveryAttempt = recoveryAttempt;
        this.recovered = recovered;
        this.ship = ship;
    }

    public Boolean getReused() {
        return reused;
    }

    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    public Boolean getRecoveryAttempt() {
        return recoveryAttempt;
    }

    public void setRecoveryAttempt(Boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
    }

    public Boolean getRecovered() {
        return recovered;
    }

    public void setRecovered(Boolean recovered) {
        this.recovered = recovered;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    @Override
    public String toString() {
        return "Fairings{" +
                "reused=" + reused +
                ", recoveryAttempt=" + recoveryAttempt +
                ", recovered=" + recovered +
                ", ship='" + ship + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fairings fairings = (Fairings) o;
        return Objects.equals(reused, fairings.reused) &&
                Objects.equals(recoveryAttempt, fairings.recoveryAttempt) &&
                Objects.equals(recovered, fairings.recovered) &&
                Objects.equals(ship, fairings.ship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reused, recoveryAttempt, recovered, ship);
    }
}