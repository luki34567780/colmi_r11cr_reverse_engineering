package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: GpsDetail.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\nHÖ\u0001R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00061"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/GpsDetail;", "", "startTime", "", "duration", "", "distance", "", "calorie", "locations", "", "dateStr", "gpsType", "(JIFFLjava/lang/String;Ljava/lang/String;I)V", "getCalorie", "()F", "setCalorie", "(F)V", "getDateStr", "()Ljava/lang/String;", "setDateStr", "(Ljava/lang/String;)V", "getDistance", "setDistance", "getDuration", "()I", "setDuration", "(I)V", "getGpsType", "setGpsType", "getLocations", "setLocations", "getStartTime", "()J", "setStartTime", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class GpsDetail {
    private float calorie;
    private java.lang.String dateStr;
    private float distance;
    private int duration;
    private int gpsType;
    private java.lang.String locations;
    private long startTime;

    /* renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component3, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    /* renamed from: component4, reason: from getter */
    public final float getCalorie() {
        return this.calorie;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getLocations() {
        return this.locations;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    /* renamed from: component7, reason: from getter */
    public final int getGpsType() {
        return this.gpsType;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail copy(long startTime, int duration, float distance, float calorie, java.lang.String locations, java.lang.String dateStr, int gpsType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locations, "locations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        return new com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail(startTime, duration, distance, calorie, locations, dateStr, gpsType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail gpsDetail = (com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail) other;
        return this.startTime == gpsDetail.startTime && this.duration == gpsDetail.duration && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.distance), java.lang.Float.valueOf(gpsDetail.distance)) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.calorie), java.lang.Float.valueOf(gpsDetail.calorie)) && kotlin.jvm.internal.Intrinsics.areEqual(this.locations, gpsDetail.locations) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateStr, gpsDetail.dateStr) && this.gpsType == gpsDetail.gpsType;
    }

    public int hashCode() {
        return (((((((((((com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest$$ExternalSyntheticBackport0.m(this.startTime) * 31) + this.duration) * 31) + java.lang.Float.floatToIntBits(this.distance)) * 31) + java.lang.Float.floatToIntBits(this.calorie)) * 31) + this.locations.hashCode()) * 31) + this.dateStr.hashCode()) * 31) + this.gpsType;
    }

    public java.lang.String toString() {
        return "GpsDetail(startTime=" + this.startTime + ", duration=" + this.duration + ", distance=" + this.distance + ", calorie=" + this.calorie + ", locations=" + this.locations + ", dateStr=" + this.dateStr + ", gpsType=" + this.gpsType + ')';
    }

    public GpsDetail(long j, int i, float f, float f2, java.lang.String str, java.lang.String str2, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "locations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "dateStr");
        this.startTime = j;
        this.duration = i;
        this.distance = f;
        this.calorie = f2;
        this.locations = str;
        this.dateStr = str2;
        this.gpsType = i2;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final void setDistance(float f) {
        this.distance = f;
    }

    public final float getCalorie() {
        return this.calorie;
    }

    public final void setCalorie(float f) {
        this.calorie = f;
    }

    public final java.lang.String getLocations() {
        return this.locations;
    }

    public final void setLocations(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locations = str;
    }

    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    public final void setDateStr(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateStr = str;
    }

    public final int getGpsType() {
        return this.gpsType;
    }

    public final void setGpsType(int i) {
        this.gpsType = i;
    }
}
