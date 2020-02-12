package com.example.space.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class Links {

    @SerializedName("mission_patch")

    private String missionPatch;
    @SerializedName("mission_patch_small")

    private String missionPatchSmall;
    @SerializedName("reddit_campaign")

    private String redditCampaign;
    @SerializedName("reddit_launch")

    private String redditLaunch;
    @SerializedName("reddit_recovery")

    private String redditRecovery;
    @SerializedName("reddit_media")

    private String redditMedia;
    @SerializedName("presskit")

    private String presskit;
    @SerializedName("article_link")

    private String articleLink;
    @SerializedName("wikipedia")

    private String wikipedia;
    @SerializedName("video_link")

    private String videoLink;
    @SerializedName("youtube_id")

    private String youtubeId;
    @SerializedName("flickr_images")

    private List<String> flickrImages = null;

    /**
     * No args constructor for use in serialization
     */
    public Links() {
    }

    /**
     * @param articleLink
     * @param flickrImages
     * @param missionPatch
     * @param missionPatchSmall
     * @param redditRecovery
     * @param redditMedia
     * @param redditCampaign
     * @param videoLink
     * @param youtubeId
     * @param wikipedia
     * @param presskit
     * @param redditLaunch
     */
    public Links(String missionPatch, String missionPatchSmall, String redditCampaign, String redditLaunch, String redditRecovery, String redditMedia, String presskit, String articleLink, String wikipedia, String videoLink, String youtubeId, List<String> flickrImages) {
        super();
        this.missionPatch = missionPatch;
        this.missionPatchSmall = missionPatchSmall;
        this.redditCampaign = redditCampaign;
        this.redditLaunch = redditLaunch;
        this.redditRecovery = redditRecovery;
        this.redditMedia = redditMedia;
        this.presskit = presskit;
        this.articleLink = articleLink;
        this.wikipedia = wikipedia;
        this.videoLink = videoLink;
        this.youtubeId = youtubeId;
        this.flickrImages = flickrImages;
    }

    public String getMissionPatch() {
        return missionPatch;
    }

    public void setMissionPatch(String missionPatch) {
        this.missionPatch = missionPatch;
    }

    public String getMissionPatchSmall() {
        return missionPatchSmall;
    }

    public void setMissionPatchSmall(String missionPatchSmall) {
        this.missionPatchSmall = missionPatchSmall;
    }

    public String getRedditCampaign() {
        return redditCampaign;
    }

    public void setRedditCampaign(String redditCampaign) {
        this.redditCampaign = redditCampaign;
    }

    public String getRedditLaunch() {
        return redditLaunch;
    }

    public void setRedditLaunch(String redditLaunch) {
        this.redditLaunch = redditLaunch;
    }

    public String getRedditRecovery() {
        return redditRecovery;
    }

    public void setRedditRecovery(String redditRecovery) {
        this.redditRecovery = redditRecovery;
    }

    public String getRedditMedia() {
        return redditMedia;
    }

    public void setRedditMedia(String redditMedia) {
        this.redditMedia = redditMedia;
    }

    public String getPresskit() {
        return presskit;
    }

    public void setPresskit(String presskit) {
        this.presskit = presskit;
    }

    public String getArticleLink() {
        return articleLink;
    }

    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public List<String> getFlickrImages() {
        return flickrImages;
    }

    public void setFlickrImages(List<String> flickrImages) {
        this.flickrImages = flickrImages;
    }

    @Override
    public String toString() {
        return "Links{" +
                "missionPatch='" + missionPatch + '\'' +
                ", missionPatchSmall='" + missionPatchSmall + '\'' +
                ", redditCampaign='" + redditCampaign + '\'' +
                ", redditLaunch='" + redditLaunch + '\'' +
                ", redditRecovery='" + redditRecovery + '\'' +
                ", redditMedia='" + redditMedia + '\'' +
                ", presskit='" + presskit + '\'' +
                ", articleLink='" + articleLink + '\'' +
                ", wikipedia='" + wikipedia + '\'' +
                ", videoLink='" + videoLink + '\'' +
                ", youtubeId='" + youtubeId + '\'' +
                ", flickrImages=" + flickrImages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Links links = (Links) o;
        return Objects.equals(missionPatch, links.missionPatch) &&
                Objects.equals(missionPatchSmall, links.missionPatchSmall) &&
                Objects.equals(redditCampaign, links.redditCampaign) &&
                Objects.equals(redditLaunch, links.redditLaunch) &&
                Objects.equals(redditRecovery, links.redditRecovery) &&
                Objects.equals(redditMedia, links.redditMedia) &&
                Objects.equals(presskit, links.presskit) &&
                Objects.equals(articleLink, links.articleLink) &&
                Objects.equals(wikipedia, links.wikipedia) &&
                Objects.equals(videoLink, links.videoLink) &&
                Objects.equals(youtubeId, links.youtubeId) &&
                Objects.equals(flickrImages, links.flickrImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(missionPatch, missionPatchSmall, redditCampaign, redditLaunch, redditRecovery, redditMedia, presskit, articleLink, wikipedia, videoLink, youtubeId, flickrImages);
    }
}
