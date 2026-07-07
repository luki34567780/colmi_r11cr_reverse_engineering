package com.qcwireless.qcwatch.ui.home.gps.bean;

/* compiled from: Gps.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/bean/Gps;", "", "wgLat", "", "wgLon", "(DD)V", "getWgLat", "()D", "setWgLat", "(D)V", "getWgLon", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class Gps {
    private double wgLat;
    private final double wgLon;

    public Gps() {
        this(0.0d, 0.0d, 3, null);
    }

    public static /* synthetic */ com.qcwireless.qcwatch.ui.home.gps.bean.Gps copy$default(com.qcwireless.qcwatch.ui.home.gps.bean.Gps gps, double d, double d2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = gps.wgLat;
        }
        if ((i & 2) != 0) {
            d2 = gps.wgLon;
        }
        return gps.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getWgLat() {
        return this.wgLat;
    }

    /* renamed from: component2, reason: from getter */
    public final double getWgLon() {
        return this.wgLon;
    }

    public final com.qcwireless.qcwatch.ui.home.gps.bean.Gps copy(double wgLat, double wgLon) {
        return new com.qcwireless.qcwatch.ui.home.gps.bean.Gps(wgLat, wgLon);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.home.gps.bean.Gps)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.home.gps.bean.Gps gps = (com.qcwireless.qcwatch.ui.home.gps.bean.Gps) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Double.valueOf(this.wgLat), java.lang.Double.valueOf(gps.wgLat)) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Double.valueOf(this.wgLon), java.lang.Double.valueOf(gps.wgLon));
    }

    public int hashCode() {
        return (com.qcwireless.qcwatch.ui.home.gps.bean.Gps$$ExternalSyntheticBackport0.m(this.wgLat) * 31) + com.qcwireless.qcwatch.ui.home.gps.bean.Gps$$ExternalSyntheticBackport0.m(this.wgLon);
    }

    public java.lang.String toString() {
        return "Gps(wgLat=" + this.wgLat + ", wgLon=" + this.wgLon + ')';
    }

    public Gps(double d, double d2) {
        this.wgLat = d;
        this.wgLon = d2;
    }

    public /* synthetic */ Gps(double d, double d2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }

    public final double getWgLat() {
        return this.wgLat;
    }

    public final void setWgLat(double d) {
        this.wgLat = d;
    }

    public final double getWgLon() {
        return this.wgLon;
    }
}
