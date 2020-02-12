package com.example.space.Models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Launch implements Parcelable {

    @SerializedName("flight_number")
    
    private Integer flightNumber;
    @SerializedName("mission_name")
    
    private String missionName;
    @SerializedName("mission_id")
    
    private List<Object> missionId = null;
    @SerializedName("launch_year")
    
    private String launchYear;
    @SerializedName("launch_date_unix")
    
    private Integer launchDateUnix;
    @SerializedName("launch_date_utc")
    
    private String launchDateUtc;
    @SerializedName("launch_date_local")
    
    private String launchDateLocal;
    @SerializedName("is_tentative")
    
    private Boolean isTentative;
    @SerializedName("tentative_max_precision")
    
    private String tentativeMaxPrecision;
    @SerializedName("tbd")
    
    private Boolean tbd;
    @SerializedName("launch_window")
    
    private Object launchWindow;
    @SerializedName("rocket")
    
    private Rocket rocket;
    @SerializedName("ships")
    
    private List<String> ships = null;
    @SerializedName("telemetry")
    
    private Telemetry telemetry;
    @SerializedName("launch_site")
    
    private LaunchSite launchSite;
    @SerializedName("launch_success")
    
    private Boolean launchSuccess;
    @SerializedName("links")
    
    private Links links;
    @SerializedName("details")
    
    private String details;
    @SerializedName("upcoming")
    
    private Boolean upcoming;
    @SerializedName("static_fire_date_utc")
    
    private String staticFireDateUtc;
    @SerializedName("static_fire_date_unix")
    
    private Integer staticFireDateUnix;
    @SerializedName("timeline")
    
    private Object timeline;
    @SerializedName("crew")
    
    private Object crew;
    @SerializedName("last_date_update")
    
    private String lastDateUpdate;
    @SerializedName("last_ll_launch_date")
    
    private String lastLlLaunchDate;
    @SerializedName("last_ll_update")
    
    private String lastLlUpdate;
    @SerializedName("last_wiki_launch_date")
    
    private String lastWikiLaunchDate;
    @SerializedName("last_wiki_revision")
    
    private String lastWikiRevision;
    @SerializedName("last_wiki_update")
    
    private String lastWikiUpdate;
    @SerializedName("launch_date_source")
    
    private String launchDateSource;

    /**
     * No args constructor for use in serialization
     *
     */
    public Launch() {
    }

    /**
     *
     * @param tentativeMaxPrecision
     * @param staticFireDateUtc
     * @param launchYear
     * @param rocket
     * @param launchDateSource
     * @param launchSite
     * @param launchDateLocal
     * @param lastWikiRevision
     * @param crew
     * @param lastWikiUpdate
     * @param lastLlLaunchDate
     * @param missionName
     * @param launchSuccess
     * @param links
     * @param details
     * @param staticFireDateUnix
     * @param lastDateUpdate
     * @param launchWindow
     * @param missionId
     * @param lastWikiLaunchDate
     * @param lastLlUpdate
     * @param isTentative
     * @param flightNumber
     * @param ships
     * @param tbd
     * @param launchDateUtc
     * @param timeline
     * @param telemetry
     * @param launchDateUnix
     * @param upcoming
     */
    public Launch(Integer flightNumber, String missionName, List<Object> missionId, String launchYear, Integer launchDateUnix, String launchDateUtc, String launchDateLocal, Boolean isTentative, String tentativeMaxPrecision, Boolean tbd, Object launchWindow, Rocket rocket, List<String> ships, Telemetry telemetry, LaunchSite launchSite, Boolean launchSuccess, Links links, String details, Boolean upcoming, String staticFireDateUtc, Integer staticFireDateUnix, Object timeline, Object crew, String lastDateUpdate, String lastLlLaunchDate, String lastLlUpdate, String lastWikiLaunchDate, String lastWikiRevision, String lastWikiUpdate, String launchDateSource) {
        super();
        this.flightNumber = flightNumber;
        this.missionName = missionName;
        this.missionId = missionId;
        this.launchYear = launchYear;
        this.launchDateUnix = launchDateUnix;
        this.launchDateUtc = launchDateUtc;
        this.launchDateLocal = launchDateLocal;
        this.isTentative = isTentative;
        this.tentativeMaxPrecision = tentativeMaxPrecision;
        this.tbd = tbd;
        this.launchWindow = launchWindow;
        this.rocket = rocket;
        this.ships = ships;
        this.telemetry = telemetry;
        this.launchSite = launchSite;
        this.launchSuccess = launchSuccess;
        this.links = links;
        this.details = details;
        this.upcoming = upcoming;
        this.staticFireDateUtc = staticFireDateUtc;
        this.staticFireDateUnix = staticFireDateUnix;
        this.timeline = timeline;
        this.crew = crew;
        this.lastDateUpdate = lastDateUpdate;
        this.lastLlLaunchDate = lastLlLaunchDate;
        this.lastLlUpdate = lastLlUpdate;
        this.lastWikiLaunchDate = lastWikiLaunchDate;
        this.lastWikiRevision = lastWikiRevision;
        this.lastWikiUpdate = lastWikiUpdate;
        this.launchDateSource = launchDateSource;
    }

    protected Launch(Parcel in) {
        if (in.readByte() == 0) {
            flightNumber = null;
        } else {
            flightNumber = in.readInt();
        }
        missionName = in.readString();
        launchYear = in.readString();
        if (in.readByte() == 0) {
            launchDateUnix = null;
        } else {
            launchDateUnix = in.readInt();
        }
        launchDateUtc = in.readString();
        launchDateLocal = in.readString();
        byte tmpIsTentative = in.readByte();
        isTentative = tmpIsTentative == 0 ? null : tmpIsTentative == 1;
        tentativeMaxPrecision = in.readString();
        byte tmpTbd = in.readByte();
        tbd = tmpTbd == 0 ? null : tmpTbd == 1;
        ships = in.createStringArrayList();
        byte tmpLaunchSuccess = in.readByte();
        launchSuccess = tmpLaunchSuccess == 0 ? null : tmpLaunchSuccess == 1;
        details = in.readString();
        byte tmpUpcoming = in.readByte();
        upcoming = tmpUpcoming == 0 ? null : tmpUpcoming == 1;
        staticFireDateUtc = in.readString();
        if (in.readByte() == 0) {
            staticFireDateUnix = null;
        } else {
            staticFireDateUnix = in.readInt();
        }
        lastDateUpdate = in.readString();
        lastLlLaunchDate = in.readString();
        lastLlUpdate = in.readString();
        lastWikiLaunchDate = in.readString();
        lastWikiRevision = in.readString();
        lastWikiUpdate = in.readString();
        launchDateSource = in.readString();
    }

    public static final Creator<Launch> CREATOR = new Creator<Launch>() {
        @Override
        public Launch createFromParcel(Parcel in) {
            return new Launch(in);
        }

        @Override
        public Launch[] newArray(int size) {
            return new Launch[size];
        }
    };

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public List<Object> getMissionId() {
        return missionId;
    }

    public void setMissionId(List<Object> missionId) {
        this.missionId = missionId;
    }

    public String getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }

    public Integer getLaunchDateUnix() {
        return launchDateUnix;
    }

    public void setLaunchDateUnix(Integer launchDateUnix) {
        this.launchDateUnix = launchDateUnix;
    }

    public String getLaunchDateUtc() {
        return launchDateUtc;
    }

    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }

    public String getLaunchDateLocal() {
        return launchDateLocal;
    }

    public void setLaunchDateLocal(String launchDateLocal) {
        this.launchDateLocal = launchDateLocal;
    }

    public Boolean getIsTentative() {
        return isTentative;
    }

    public void setIsTentative(Boolean isTentative) {
        this.isTentative = isTentative;
    }

    public String getTentativeMaxPrecision() {
        return tentativeMaxPrecision;
    }

    public void setTentativeMaxPrecision(String tentativeMaxPrecision) {
        this.tentativeMaxPrecision = tentativeMaxPrecision;
    }

    public Boolean getTbd() {
        return tbd;
    }

    public void setTbd(Boolean tbd) {
        this.tbd = tbd;
    }

    public Object getLaunchWindow() {
        return launchWindow;
    }

    public void setLaunchWindow(Object launchWindow) {
        this.launchWindow = launchWindow;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public List<String> getShips() {
        return ships;
    }

    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    public void setTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry;
    }

    public LaunchSite getLaunchSite() {
        return launchSite;
    }

    public void setLaunchSite(LaunchSite launchSite) {
        this.launchSite = launchSite;
    }

    public Boolean getLaunchSuccess() {
        return launchSuccess;
    }

    public void setLaunchSuccess(Boolean launchSuccess) {
        this.launchSuccess = launchSuccess;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Boolean getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }

    public String getStaticFireDateUtc() {
        return staticFireDateUtc;
    }

    public void setStaticFireDateUtc(String staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }

    public Integer getStaticFireDateUnix() {
        return staticFireDateUnix;
    }

    public void setStaticFireDateUnix(Integer staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }

    public Object getTimeline() {
        return timeline;
    }

    public void setTimeline(Object timeline) {
        this.timeline = timeline;
    }

    public Object getCrew() {
        return crew;
    }

    public void setCrew(Object crew) {
        this.crew = crew;
    }

    public String getLastDateUpdate() {
        return lastDateUpdate;
    }

    public void setLastDateUpdate(String lastDateUpdate) {
        this.lastDateUpdate = lastDateUpdate;
    }

    public String getLastLlLaunchDate() {
        return lastLlLaunchDate;
    }

    public void setLastLlLaunchDate(String lastLlLaunchDate) {
        this.lastLlLaunchDate = lastLlLaunchDate;
    }

    public String getLastLlUpdate() {
        return lastLlUpdate;
    }

    public void setLastLlUpdate(String lastLlUpdate) {
        this.lastLlUpdate = lastLlUpdate;
    }

    public String getLastWikiLaunchDate() {
        return lastWikiLaunchDate;
    }

    public void setLastWikiLaunchDate(String lastWikiLaunchDate) {
        this.lastWikiLaunchDate = lastWikiLaunchDate;
    }

    public String getLastWikiRevision() {
        return lastWikiRevision;
    }

    public void setLastWikiRevision(String lastWikiRevision) {
        this.lastWikiRevision = lastWikiRevision;
    }

    public String getLastWikiUpdate() {
        return lastWikiUpdate;
    }

    public void setLastWikiUpdate(String lastWikiUpdate) {
        this.lastWikiUpdate = lastWikiUpdate;
    }

    public String getLaunchDateSource() {
        return launchDateSource;
    }

    public void setLaunchDateSource(String launchDateSource) {
        this.launchDateSource = launchDateSource;
    }

    @Override
    public String toString() {
        return "Launch{" +
                "flightNumber=" + flightNumber +
                ", missionName='" + missionName + '\'' +
                ", missionId=" + missionId +
                ", launchYear='" + launchYear + '\'' +
                ", launchDateUnix=" + launchDateUnix +
                ", launchDateUtc='" + launchDateUtc + '\'' +
                ", launchDateLocal='" + launchDateLocal + '\'' +
                ", isTentative=" + isTentative +
                ", tentativeMaxPrecision='" + tentativeMaxPrecision + '\'' +
                ", tbd=" + tbd +
                ", launchWindow=" + launchWindow +
                ", rocket=" + rocket +
                ", ships=" + ships +
                ", telemetry=" + telemetry +
                ", launchSite=" + launchSite +
                ", launchSuccess=" + launchSuccess +
                ", links=" + links +
                ", details='" + details + '\'' +
                ", upcoming=" + upcoming +
                ", staticFireDateUtc='" + staticFireDateUtc + '\'' +
                ", staticFireDateUnix=" + staticFireDateUnix +
                ", timeline=" + timeline +
                ", crew=" + crew +
                ", lastDateUpdate='" + lastDateUpdate + '\'' +
                ", lastLlLaunchDate='" + lastLlLaunchDate + '\'' +
                ", lastLlUpdate='" + lastLlUpdate + '\'' +
                ", lastWikiLaunchDate='" + lastWikiLaunchDate + '\'' +
                ", lastWikiRevision='" + lastWikiRevision + '\'' +
                ", lastWikiUpdate='" + lastWikiUpdate + '\'' +
                ", launchDateSource='" + launchDateSource + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(flightNumber);
        parcel.writeString(missionName);
        parcel.writeString(launchYear);
        parcel.writeString(launchDateUtc);
    }
}

