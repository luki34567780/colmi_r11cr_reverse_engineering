package com.luck.picture.lib.entity;

/* loaded from: /tmp/dex/classes2.dex */
public class MediaExtraInfo {
    private long duration;
    private int height;
    private java.lang.String orientation;
    private java.lang.String videoThumbnail;
    private int width;

    public java.lang.String getVideoThumbnail() {
        return this.videoThumbnail;
    }

    public void setVideoThumbnail(java.lang.String str) {
        this.videoThumbnail = str;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public java.lang.String getOrientation() {
        return this.orientation;
    }

    public void setOrientation(java.lang.String str) {
        this.orientation = str;
    }

    public java.lang.String toString() {
        return "MediaExtraInfo{videoThumbnail='" + this.videoThumbnail + "', width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", orientation='" + this.orientation + "'}";
    }
}
