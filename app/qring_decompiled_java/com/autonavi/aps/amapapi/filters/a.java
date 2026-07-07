package com.autonavi.aps.amapapi.filters;

/* compiled from: LocFilter.java */
/* loaded from: classes.dex */
public final class a {
    com.autonavi.aps.amapapi.model.a a = null;
    long b = 0;
    long c = 0;
    private boolean h = true;
    int d = 0;
    long e = 0;
    com.amap.api.location.AMapLocation f = null;
    long g = 0;

    public final void a() {
        this.a = null;
        this.b = 0L;
        this.c = 0L;
        this.f = null;
        this.g = 0L;
    }

    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.model.a aVar) {
        if (com.autonavi.aps.amapapi.utils.j.b() - this.e > androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            this.a = aVar;
            this.e = com.autonavi.aps.amapapi.utils.j.b();
            return this.a;
        }
        this.e = com.autonavi.aps.amapapi.utils.j.b();
        if (!com.autonavi.aps.amapapi.utils.j.a(this.a) || !com.autonavi.aps.amapapi.utils.j.a(aVar)) {
            this.b = com.autonavi.aps.amapapi.utils.j.b();
            this.a = aVar;
            return aVar;
        }
        if (aVar.getTime() == this.a.getTime() && aVar.getAccuracy() < 300.0f) {
            return aVar;
        }
        if (com.amap.api.services.geocoder.GeocodeSearch.GPS.equals(aVar.getProvider())) {
            this.b = com.autonavi.aps.amapapi.utils.j.b();
            this.a = aVar;
            return aVar;
        }
        if (aVar.c() != this.a.c()) {
            this.b = com.autonavi.aps.amapapi.utils.j.b();
            this.a = aVar;
            return aVar;
        }
        if (aVar.getBuildingId() != null && !aVar.getBuildingId().equals(this.a.getBuildingId()) && !android.text.TextUtils.isEmpty(aVar.getBuildingId())) {
            this.b = com.autonavi.aps.amapapi.utils.j.b();
            this.a = aVar;
            return aVar;
        }
        this.d = aVar.getLocationType();
        float a = com.autonavi.aps.amapapi.utils.j.a(aVar, this.a);
        float accuracy = this.a.getAccuracy();
        float accuracy2 = aVar.getAccuracy();
        float f = accuracy2 - accuracy;
        long b = com.autonavi.aps.amapapi.utils.j.b();
        long j = b - this.b;
        boolean z = accuracy <= 100.0f && accuracy2 > 299.0f;
        boolean z2 = accuracy > 299.0f && accuracy2 > 299.0f;
        if (z || z2) {
            long j2 = this.c;
            if (j2 == 0) {
                this.c = b;
            } else if (b - j2 > androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                this.b = b;
                this.a = aVar;
                this.c = 0L;
                return aVar;
            }
            com.autonavi.aps.amapapi.model.a b2 = b(this.a);
            this.a = b2;
            return b2;
        }
        if (accuracy2 < 100.0f && accuracy > 299.0f) {
            this.b = b;
            this.a = aVar;
            this.c = 0L;
            return aVar;
        }
        if (accuracy2 <= 299.0f) {
            this.c = 0L;
        }
        if (a >= 10.0f || a <= 0.1d || accuracy2 <= 5.0f) {
            if (f < 300.0f) {
                this.b = com.autonavi.aps.amapapi.utils.j.b();
                this.a = aVar;
                return aVar;
            }
            if (j >= androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                this.b = com.autonavi.aps.amapapi.utils.j.b();
                this.a = aVar;
                return aVar;
            }
            com.autonavi.aps.amapapi.model.a b3 = b(this.a);
            this.a = b3;
            return b3;
        }
        if (f >= -300.0f) {
            com.autonavi.aps.amapapi.model.a b4 = b(this.a);
            this.a = b4;
            return b4;
        }
        if (accuracy / accuracy2 >= 2.0f) {
            this.b = b;
            this.a = aVar;
            return aVar;
        }
        com.autonavi.aps.amapapi.model.a b5 = b(this.a);
        this.a = b5;
        return b5;
    }

    private com.autonavi.aps.amapapi.model.a b(com.autonavi.aps.amapapi.model.a aVar) {
        if (com.autonavi.aps.amapapi.utils.j.a(aVar)) {
            if (this.h && com.autonavi.aps.amapapi.utils.a.a(aVar.getTime())) {
                if (aVar.getLocationType() == 5 || aVar.getLocationType() == 6) {
                    aVar.setLocationType(4);
                }
            } else {
                aVar.setLocationType(this.d);
            }
        }
        return aVar;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final com.amap.api.location.AMapLocation a(com.amap.api.location.AMapLocation aMapLocation) {
        if (!com.autonavi.aps.amapapi.utils.j.a(aMapLocation)) {
            return aMapLocation;
        }
        long b = com.autonavi.aps.amapapi.utils.j.b() - this.g;
        this.g = com.autonavi.aps.amapapi.utils.j.b();
        if (b > 5000) {
            return aMapLocation;
        }
        com.amap.api.location.AMapLocation aMapLocation2 = this.f;
        if (aMapLocation2 == null) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        if (1 != aMapLocation2.getLocationType() && !com.amap.api.services.geocoder.GeocodeSearch.GPS.equalsIgnoreCase(this.f.getProvider())) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        if (this.f.getAltitude() == aMapLocation.getAltitude() && this.f.getLongitude() == aMapLocation.getLongitude()) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        long abs = java.lang.Math.abs(aMapLocation.getTime() - this.f.getTime());
        if (androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS < abs) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        if (com.autonavi.aps.amapapi.utils.j.a(aMapLocation, this.f) > (((this.f.getSpeed() + aMapLocation.getSpeed()) * abs) / 2000.0f) + ((this.f.getAccuracy() + aMapLocation.getAccuracy()) * 2.0f) + 3000.0f) {
            return this.f;
        }
        this.f = aMapLocation;
        return aMapLocation;
    }
}
