package com.qcwireless.qcwatch.ui.home.gps.bean;

/* compiled from: QLatLon.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/bean/QLatLon;", "", "latitude", "", "longitude", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class QLatLon {
    private final double latitude;
    private final double longitude;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.home.gps.bean.QLatLon copy$default(com.qcwireless.qcwatch.ui.home.gps.bean.QLatLon qLatLon, double d, double d2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = qLatLon.latitude;
        }
        if ((i & 2) != 0) {
            d2 = qLatLon.longitude;
        }
        return qLatLon.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final com.qcwireless.qcwatch.ui.home.gps.bean.QLatLon copy(double latitude, double longitude) {
        return new com.qcwireless.qcwatch.ui.home.gps.bean.QLatLon(latitude, longitude);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.home.gps.bean.QLatLon)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.home.gps.bean.QLatLon qLatLon = (com.qcwireless.qcwatch.ui.home.gps.bean.QLatLon) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Double.valueOf(this.latitude), java.lang.Double.valueOf(qLatLon.latitude)) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Double.valueOf(this.longitude), java.lang.Double.valueOf(qLatLon.longitude));
    }

    public int hashCode() {
        return (com.qcwireless.qcwatch.ui.home.gps.bean.Gps$$ExternalSyntheticBackport0.m(this.latitude) * 31) + com.qcwireless.qcwatch.ui.home.gps.bean.Gps$$ExternalSyntheticBackport0.m(this.longitude);
    }

    public java.lang.String toString() {
        return "QLatLon(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    public QLatLon(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }
}
