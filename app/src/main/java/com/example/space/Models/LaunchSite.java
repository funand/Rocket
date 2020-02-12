package com.example.space.Models;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class LaunchSite {

    @SerializedName("site_id")

    private String siteId;
    @SerializedName("site_name")

    private String siteName;
    @SerializedName("site_name_long")

    private String siteNameLong;

    /**
     * No args constructor for use in serialization
     *
     */
    public LaunchSite() {
    }

    /**
     *
     * @param siteNameLong
     * @param siteId
     * @param siteName
     */
    public LaunchSite(String siteId, String siteName, String siteNameLong) {
        super();
        this.siteId = siteId;
        this.siteName = siteName;
        this.siteNameLong = siteNameLong;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteNameLong() {
        return siteNameLong;
    }

    public void setSiteNameLong(String siteNameLong) {
        this.siteNameLong = siteNameLong;
    }

    @Override
    public String toString() {
        return "LaunchSite{" +
                "siteId='" + siteId + '\'' +
                ", siteName='" + siteName + '\'' +
                ", siteNameLong='" + siteNameLong + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaunchSite that = (LaunchSite) o;
        return Objects.equals(siteId, that.siteId) &&
                Objects.equals(siteName, that.siteName) &&
                Objects.equals(siteNameLong, that.siteNameLong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, siteName, siteNameLong);
    }
}