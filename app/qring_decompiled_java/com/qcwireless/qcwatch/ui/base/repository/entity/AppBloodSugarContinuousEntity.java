package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: AppBloodSugarContinuousEntity.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0014¨\u0006%"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/AppBloodSugarContinuousEntity;", "", "mac", "", "dateStr", "timestamp", "", "minSugar", "maxSugar", "hour", "(Ljava/lang/String;Ljava/lang/String;IIII)V", "getDateStr", "()Ljava/lang/String;", "setDateStr", "(Ljava/lang/String;)V", "getHour", "()I", "getMac", "getMaxSugar", "setMaxSugar", "(I)V", "getMinSugar", "setMinSugar", "getTimestamp", "setTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class AppBloodSugarContinuousEntity {
    private java.lang.String dateStr;
    private final int hour;
    private final java.lang.String mac;
    private int maxSugar;
    private int minSugar;
    private int timestamp;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity copy$default(com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity appBloodSugarContinuousEntity, java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            str = appBloodSugarContinuousEntity.mac;
        }
        if ((i5 & 2) != 0) {
            str2 = appBloodSugarContinuousEntity.dateStr;
        }
        java.lang.String str3 = str2;
        if ((i5 & 4) != 0) {
            i = appBloodSugarContinuousEntity.timestamp;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = appBloodSugarContinuousEntity.minSugar;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = appBloodSugarContinuousEntity.maxSugar;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = appBloodSugarContinuousEntity.hour;
        }
        return appBloodSugarContinuousEntity.copy(str, str3, i6, i7, i8, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMac() {
        return this.mac;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMinSugar() {
        return this.minSugar;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxSugar() {
        return this.maxSugar;
    }

    /* renamed from: component6, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity copy(java.lang.String mac, java.lang.String dateStr, int timestamp, int minSugar, int maxSugar, int hour) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        return new com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity(mac, dateStr, timestamp, minSugar, maxSugar, hour);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity appBloodSugarContinuousEntity = (com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.mac, appBloodSugarContinuousEntity.mac) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateStr, appBloodSugarContinuousEntity.dateStr) && this.timestamp == appBloodSugarContinuousEntity.timestamp && this.minSugar == appBloodSugarContinuousEntity.minSugar && this.maxSugar == appBloodSugarContinuousEntity.maxSugar && this.hour == appBloodSugarContinuousEntity.hour;
    }

    public int hashCode() {
        return (((((((((this.mac.hashCode() * 31) + this.dateStr.hashCode()) * 31) + this.timestamp) * 31) + this.minSugar) * 31) + this.maxSugar) * 31) + this.hour;
    }

    public java.lang.String toString() {
        return "AppBloodSugarContinuousEntity(mac=" + this.mac + ", dateStr=" + this.dateStr + ", timestamp=" + this.timestamp + ", minSugar=" + this.minSugar + ", maxSugar=" + this.maxSugar + ", hour=" + this.hour + ')';
    }

    public AppBloodSugarContinuousEntity(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "dateStr");
        this.mac = str;
        this.dateStr = str2;
        this.timestamp = i;
        this.minSugar = i2;
        this.maxSugar = i3;
        this.hour = i4;
    }

    public final java.lang.String getMac() {
        return this.mac;
    }

    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    public final void setDateStr(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateStr = str;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(int i) {
        this.timestamp = i;
    }

    public final int getMinSugar() {
        return this.minSugar;
    }

    public final void setMinSugar(int i) {
        this.minSugar = i;
    }

    public final int getMaxSugar() {
        return this.maxSugar;
    }

    public final void setMaxSugar(int i) {
        this.maxSugar = i;
    }

    public final int getHour() {
        return this.hour;
    }
}
