package com.qcwireless.qcwatch.ui.home.sport.bean;

/* compiled from: HomeSportDetail.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\bHÖ\u0001R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/bean/HomeSportDetail;", "", "sportType", "", "distance", "", "calorie", "dateTime", "", "heartArray", "duration", "startTime", "", "avgHeart", "(IFFLjava/lang/String;Ljava/lang/String;IJI)V", "getAvgHeart", "()I", "setAvgHeart", "(I)V", "getCalorie", "()F", "getDateTime", "()Ljava/lang/String;", "getDistance", "getDuration", "setDuration", "getHeartArray", "getSportType", "getStartTime", "()J", "setStartTime", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class HomeSportDetail {
    private int avgHeart;
    private final float calorie;
    private final java.lang.String dateTime;
    private final float distance;
    private int duration;
    private final java.lang.String heartArray;
    private final int sportType;
    private long startTime;

    /* renamed from: component1, reason: from getter */
    public final int getSportType() {
        return this.sportType;
    }

    /* renamed from: component2, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCalorie() {
        return this.calorie;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDateTime() {
        return this.dateTime;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getHeartArray() {
        return this.heartArray;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component7, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAvgHeart() {
        return this.avgHeart;
    }

    public final com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail copy(int sportType, float distance, float calorie, java.lang.String dateTime, java.lang.String heartArray, int duration, long startTime, int avgHeart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartArray, "heartArray");
        return new com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail(sportType, distance, calorie, dateTime, heartArray, duration, startTime, avgHeart);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail homeSportDetail = (com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail) other;
        return this.sportType == homeSportDetail.sportType && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.distance), java.lang.Float.valueOf(homeSportDetail.distance)) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.calorie), java.lang.Float.valueOf(homeSportDetail.calorie)) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateTime, homeSportDetail.dateTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.heartArray, homeSportDetail.heartArray) && this.duration == homeSportDetail.duration && this.startTime == homeSportDetail.startTime && this.avgHeart == homeSportDetail.avgHeart;
    }

    public int hashCode() {
        return (((((((((((((this.sportType * 31) + java.lang.Float.floatToIntBits(this.distance)) * 31) + java.lang.Float.floatToIntBits(this.calorie)) * 31) + this.dateTime.hashCode()) * 31) + this.heartArray.hashCode()) * 31) + this.duration) * 31) + com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest$$ExternalSyntheticBackport0.m(this.startTime)) * 31) + this.avgHeart;
    }

    public java.lang.String toString() {
        return "HomeSportDetail(sportType=" + this.sportType + ", distance=" + this.distance + ", calorie=" + this.calorie + ", dateTime=" + this.dateTime + ", heartArray=" + this.heartArray + ", duration=" + this.duration + ", startTime=" + this.startTime + ", avgHeart=" + this.avgHeart + ')';
    }

    public HomeSportDetail(int i, float f, float f2, java.lang.String str, java.lang.String str2, int i2, long j, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "dateTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "heartArray");
        this.sportType = i;
        this.distance = f;
        this.calorie = f2;
        this.dateTime = str;
        this.heartArray = str2;
        this.duration = i2;
        this.startTime = j;
        this.avgHeart = i3;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final float getCalorie() {
        return this.calorie;
    }

    public final java.lang.String getDateTime() {
        return this.dateTime;
    }

    public final java.lang.String getHeartArray() {
        return this.heartArray;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final int getAvgHeart() {
        return this.avgHeart;
    }

    public final void setAvgHeart(int i) {
        this.avgHeart = i;
    }
}
