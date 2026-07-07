package com.amap.api.fence;

/* loaded from: classes.dex */
public class GeoFenceClient {
    public static final int GEOFENCE_IN = 1;
    public static final int GEOFENCE_OUT = 2;
    public static final int GEOFENCE_STAYED = 4;
    android.content.Context a;
    com.amap.api.col.p0003sl.a b;

    public GeoFenceClient(android.content.Context context) {
        this.a = null;
        this.b = null;
        try {
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context参数不能为null");
            }
            android.content.Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            this.b = a(applicationContext);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "<init>");
        }
    }

    private static com.amap.api.col.p0003sl.a a(android.content.Context context) {
        return new com.amap.api.col.p0003sl.a(context);
    }

    public android.app.PendingIntent createPendingIntent(java.lang.String str) {
        try {
            return this.b.a(str);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "creatPendingIntent");
            return null;
        }
    }

    public void setActivateAction(int i) {
        try {
            this.b.a(i);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "setActivatesAction");
        }
    }

    public void setGeoFenceListener(com.amap.api.fence.GeoFenceListener geoFenceListener) {
        try {
            this.b.a(geoFenceListener);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "setGeoFenceListener");
        }
    }

    public void addGeoFence(com.amap.api.location.DPoint dPoint, float f, java.lang.String str) {
        try {
            this.b.a(dPoint, f, str);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "addGeoFence round");
        }
    }

    public void addGeoFence(java.util.List<com.amap.api.location.DPoint> list, java.lang.String str) {
        try {
            this.b.a(list, str);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "addGeoFence polygon");
        }
    }

    public void addGeoFence(java.lang.String str, java.lang.String str2, com.amap.api.location.DPoint dPoint, float f, int i, java.lang.String str3) {
        try {
            this.b.a(str, str2, dPoint, f, i, str3);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4) {
        try {
            this.b.a(str, str2, str3, i, str4);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(java.lang.String str, java.lang.String str2) {
        try {
            this.b.a(str, str2);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "addGeoFence district");
        }
    }

    public void removeGeoFence() {
        try {
            this.b.a();
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "removeGeoFence");
        }
    }

    public boolean removeGeoFence(com.amap.api.fence.GeoFence geoFence) {
        try {
            return this.b.a(geoFence);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "removeGeoFence1");
            return false;
        }
    }

    public java.util.List<com.amap.api.fence.GeoFence> getAllGeoFence() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            return this.b.b();
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "getGeoFenceList");
            return arrayList;
        }
    }

    public void setGeoFenceAble(java.lang.String str, boolean z) {
        try {
            this.b.a(str, z);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "setGeoFenceAble");
        }
    }

    public void pauseGeoFence() {
        try {
            this.b.f();
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "pauseGeoFence");
        }
    }

    public void resumeGeoFence() {
        try {
            this.b.h();
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "resumeGeoFence");
        }
    }

    public boolean isPause() {
        try {
            return this.b.i();
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceClient", "isPause");
            return true;
        }
    }
}
