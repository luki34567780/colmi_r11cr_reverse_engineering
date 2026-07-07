package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: AppBloodSugarEntity.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/AppBloodSugarEntity;", "", "mac", "", "dateStr", "timestamp", "", com.google.android.gms.fitness.data.Field.NUTRIENT_SUGAR, "(Ljava/lang/String;Ljava/lang/String;II)V", "getDateStr", "()Ljava/lang/String;", "setDateStr", "(Ljava/lang/String;)V", "getMac", "getSugar", "()I", "getTimestamp", "setTimestamp", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class AppBloodSugarEntity {
    private java.lang.String dateStr;
    private final java.lang.String mac;
    private final int sugar;
    private int timestamp;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity copy$default(com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity appBloodSugarEntity, java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = appBloodSugarEntity.mac;
        }
        if ((i3 & 2) != 0) {
            str2 = appBloodSugarEntity.dateStr;
        }
        if ((i3 & 4) != 0) {
            i = appBloodSugarEntity.timestamp;
        }
        if ((i3 & 8) != 0) {
            i2 = appBloodSugarEntity.sugar;
        }
        return appBloodSugarEntity.copy(str, str2, i, i2);
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
    public final int getSugar() {
        return this.sugar;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity copy(java.lang.String mac, java.lang.String dateStr, int timestamp, int sugar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        return new com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity(mac, dateStr, timestamp, sugar);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity appBloodSugarEntity = (com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.mac, appBloodSugarEntity.mac) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateStr, appBloodSugarEntity.dateStr) && this.timestamp == appBloodSugarEntity.timestamp && this.sugar == appBloodSugarEntity.sugar;
    }

    public int hashCode() {
        return (((((this.mac.hashCode() * 31) + this.dateStr.hashCode()) * 31) + this.timestamp) * 31) + this.sugar;
    }

    public java.lang.String toString() {
        return "AppBloodSugarEntity(mac=" + this.mac + ", dateStr=" + this.dateStr + ", timestamp=" + this.timestamp + ", sugar=" + this.sugar + ')';
    }

    public AppBloodSugarEntity(java.lang.String str, java.lang.String str2, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "dateStr");
        this.mac = str;
        this.dateStr = str2;
        this.timestamp = i;
        this.sugar = i2;
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

    public final int getSugar() {
        return this.sugar;
    }
}
