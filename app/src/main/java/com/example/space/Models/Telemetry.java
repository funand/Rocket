package com.example.space.Models;


import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Telemetry {

    @SerializedName("flight_club")

    private Object flightClub;

    /**
     * No args constructor for use in serialization
     *
     */
    public Telemetry() {
    }

    /**
     *
     * @param flightClub
     */
    public Telemetry(Object flightClub) {
        super();
        this.flightClub = flightClub;
    }

    public Object getFlightClub() {
        return flightClub;
    }

    public void setFlightClub(Object flightClub) {
        this.flightClub = flightClub;
    }

    @Override
    public String toString() {
        return "Telemetry{" +
                "flightClub=" + flightClub +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telemetry telemetry = (Telemetry) o;
        return Objects.equals(flightClub, telemetry.flightClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightClub);
    }
}