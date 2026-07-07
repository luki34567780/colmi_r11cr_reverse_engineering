package com.amap.api.col.p0003sl;

/* compiled from: SegmentsIntersect.java */
/* loaded from: classes.dex */
public final class ds {
    private static double a(com.amap.api.maps.model.LatLng latLng, com.amap.api.maps.model.LatLng latLng2, com.amap.api.maps.model.LatLng latLng3) {
        double d = latLng.latitude - latLng3.latitude;
        return ((latLng.longitude - latLng3.longitude) * (latLng.latitude - latLng2.latitude)) - ((latLng.longitude - latLng2.longitude) * d);
    }

    private static boolean b(com.amap.api.maps.model.LatLng latLng, com.amap.api.maps.model.LatLng latLng2, com.amap.api.maps.model.LatLng latLng3) {
        double d = latLng.longitude - latLng2.longitude > 0.0d ? latLng.longitude : latLng2.longitude;
        return (((latLng.longitude - latLng2.longitude) > 0.0d ? 1 : ((latLng.longitude - latLng2.longitude) == 0.0d ? 0 : -1)) < 0 ? latLng.longitude : latLng2.longitude) <= latLng3.longitude && latLng3.longitude <= d && (((latLng.latitude - latLng2.latitude) > 0.0d ? 1 : ((latLng.latitude - latLng2.latitude) == 0.0d ? 0 : -1)) < 0 ? latLng.latitude : latLng2.latitude) <= latLng3.latitude && latLng3.latitude <= (((latLng.latitude - latLng2.latitude) > 0.0d ? 1 : ((latLng.latitude - latLng2.latitude) == 0.0d ? 0 : -1)) > 0 ? latLng.latitude : latLng2.latitude);
    }

    public static boolean a(com.amap.api.maps.model.LatLng latLng, com.amap.api.maps.model.LatLng latLng2, com.amap.api.maps.model.LatLng latLng3, com.amap.api.maps.model.LatLng latLng4) {
        double a = a(latLng3, latLng4, latLng);
        double a2 = a(latLng3, latLng4, latLng2);
        double a3 = a(latLng, latLng2, latLng3);
        double a4 = a(latLng, latLng2, latLng4);
        if (((a > 0.0d && a2 < 0.0d) || (a < 0.0d && a2 > 0.0d)) && ((a3 > 0.0d && a4 < 0.0d) || (a3 < 0.0d && a4 > 0.0d))) {
            return true;
        }
        if (a == 0.0d && b(latLng3, latLng4, latLng)) {
            return true;
        }
        if (a2 == 0.0d && b(latLng3, latLng4, latLng2)) {
            return true;
        }
        if (a3 == 0.0d && b(latLng, latLng2, latLng3)) {
            return true;
        }
        return a4 == 0.0d && b(latLng, latLng2, latLng4);
    }
}
