package com.example.space.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class SecondStage {

    @SerializedName("block")

    private Integer block;
    @SerializedName("payloads")

    private List<Payload> payloads = null;

    /**
     * No args constructor for use in serialization
     */
    public SecondStage() {
    }

    /**
     * @param payloads
     * @param block
     */
    public SecondStage(Integer block, List<Payload> payloads) {
        super();
        this.block = block;
        this.payloads = payloads;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public List<Payload> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<Payload> payloads) {
        this.payloads = payloads;
    }

    @Override
    public String toString() {
        return "SecondStage{" +
                "block=" + block +
                ", payloads=" + payloads +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondStage that = (SecondStage) o;
        return Objects.equals(block, that.block) &&
                Objects.equals(payloads, that.payloads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(block, payloads);
    }
}