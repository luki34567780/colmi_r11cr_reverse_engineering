package com.qcwireless.qcwatch.ui.home.sport.bean;

/* compiled from: SportDetail.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006("}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/bean/SportDetail;", "", "sportType", "", "step", "startTime", "", "duration", "calorie", "", "distance", "heartData", "", "Lcom/qcwireless/qcwatch/ui/home/sport/bean/HeartDetail;", "(IIJIFFLjava/util/List;)V", "getCalorie", "()F", "getDistance", "getDuration", "()I", "getHeartData", "()Ljava/util/List;", "getSportType", "getStartTime", "()J", "getStep", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class SportDetail {
    private final float calorie;
    private final float distance;
    private final int duration;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.HeartDetail> heartData;
    private final int sportType;
    private final long startTime;
    private final int step;

    /* renamed from: component1, reason: from getter */
    public final int getSportType() {
        return this.sportType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component5, reason: from getter */
    public final float getCalorie() {
        return this.calorie;
    }

    /* renamed from: component6, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.HeartDetail> component7() {
        return this.heartData;
    }

    public final com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail copy(int sportType, int step, long startTime, int duration, float calorie, float distance, java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.HeartDetail> heartData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartData, "heartData");
        return new com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail(sportType, step, startTime, duration, calorie, distance, heartData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail sportDetail = (com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail) other;
        return this.sportType == sportDetail.sportType && this.step == sportDetail.step && this.startTime == sportDetail.startTime && this.duration == sportDetail.duration && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.calorie), java.lang.Float.valueOf(sportDetail.calorie)) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.distance), java.lang.Float.valueOf(sportDetail.distance)) && kotlin.jvm.internal.Intrinsics.areEqual(this.heartData, sportDetail.heartData);
    }

    public int hashCode() {
        return (((((((((((this.sportType * 31) + this.step) * 31) + com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest$$ExternalSyntheticBackport0.m(this.startTime)) * 31) + this.duration) * 31) + java.lang.Float.floatToIntBits(this.calorie)) * 31) + java.lang.Float.floatToIntBits(this.distance)) * 31) + this.heartData.hashCode();
    }

    public java.lang.String toString() {
        return "SportDetail(sportType=" + this.sportType + ", step=" + this.step + ", startTime=" + this.startTime + ", duration=" + this.duration + ", calorie=" + this.calorie + ", distance=" + this.distance + ", heartData=" + this.heartData + ')';
    }

    public SportDetail(int i, int i2, long j, int i3, float f, float f2, java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.HeartDetail> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "heartData");
        this.sportType = i;
        this.step = i2;
        this.startTime = j;
        this.duration = i3;
        this.calorie = f;
        this.distance = f2;
        this.heartData = list;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getStep() {
        return this.step;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final float getCalorie() {
        return this.calorie;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.HeartDetail> getHeartData() {
        return this.heartData;
    }
}
