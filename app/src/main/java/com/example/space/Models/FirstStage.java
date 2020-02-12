package com.example.space.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class FirstStage {

    @SerializedName("cores")

    private List<Core> cores;

    /**
     * No args constructor for use in serialization
     *
     */
    public FirstStage() {
    }

    /**
     *
     * @param cores
     */
    public FirstStage(List<Core> cores) {
        super();
        this.cores = cores;
    }

    public List<Core> getCores() {
        return cores;
    }

    public void setCores(List<Core> cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "FirstStage{" +
                "cores=" + cores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstStage that = (FirstStage) o;
        return Objects.equals(cores, that.cores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cores);
    }
}