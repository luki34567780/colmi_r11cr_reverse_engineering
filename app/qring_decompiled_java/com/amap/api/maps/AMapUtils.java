package com.amap.api.maps;

/* loaded from: classes.dex */
public class AMapUtils {
    private static final java.lang.String AMAPNAVIURL = "androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=0&style=%d";
    private static final java.lang.String AMAPPOISEARCHURL = "androidamap://arroundpoi?sourceApplication=%s&keywords=%s&dev=0";
    private static final java.lang.String AMAPROUTEURL = "androidamap://route?sourceApplication=%s&slat=%f&slon=%f&sname=%s&dlat=%f&dlon=%f&dname=%s&dev=0&t=%d";
    public static final int BUS_COMFORT = 4;
    public static final int BUS_MONEY_LITTLE = 1;
    public static final int BUS_NO_SUBWAY = 5;
    public static final int BUS_TIME_FIRST = 0;
    public static final int BUS_TRANSFER_LITTLE = 2;
    public static final int BUS_WALK_LITTLE = 3;
    private static final double DEG_TO_RAD = 0.017453292519943295d;
    private static final int DRING_ROUTE_MODEL = 2;
    public static final int DRIVING_AVOID_CONGESTION = 4;
    public static final int DRIVING_DEFAULT = 0;
    public static final int DRIVING_NO_HIGHWAY = 3;
    public static final int DRIVING_NO_HIGHWAY_AVOID_CONGESTION = 6;
    public static final int DRIVING_NO_HIGHWAY_AVOID_SHORT_MONEY = 5;
    public static final int DRIVING_NO_HIGHWAY_SAVE_MONEY_AVOID_CONGESTION = 8;
    public static final int DRIVING_SAVE_MONEY = 1;
    public static final int DRIVING_SAVE_MONEY_AVOID_CONGESTION = 7;
    public static final int DRIVING_SHORT_DISTANCE = 2;
    private static final double EARTHRADIUS = 6378137.0d;
    private static final double NF_PI = 0.01745329251994329d;
    private static final double R = 6378137.0d;
    private static final int TRANSIT_ROUTE_MODEL = 1;

    public static float calculateLineDistance(com.amap.api.maps.model.LatLng latLng, com.amap.api.maps.model.LatLng latLng2) {
        if (latLng == null || latLng2 == null) {
            try {
                throw new com.amap.api.maps.AMapException(com.amap.api.maps.AMapException.ERROR_ILLEGAL_VALUE);
            } catch (com.amap.api.maps.AMapException e) {
                e.printStackTrace();
                return 0.0f;
            }
        }
        try {
            double d = latLng.longitude;
            double d2 = latLng.latitude;
            double d3 = latLng2.longitude;
            double d4 = latLng2.latitude;
            double d5 = d * NF_PI;
            double d6 = d2 * NF_PI;
            double d7 = d3 * NF_PI;
            double d8 = d4 * NF_PI;
            double sin = java.lang.Math.sin(d5);
            double sin2 = java.lang.Math.sin(d6);
            double cos = java.lang.Math.cos(d5);
            double cos2 = java.lang.Math.cos(d6);
            double sin3 = java.lang.Math.sin(d7);
            double sin4 = java.lang.Math.sin(d8);
            double cos3 = java.lang.Math.cos(d7);
            double cos4 = java.lang.Math.cos(d8);
            double[] dArr = {cos * cos2, cos2 * sin, sin2};
            double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
            return (float) (java.lang.Math.asin(java.lang.Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public static float calculateArea(com.amap.api.maps.model.LatLng latLng, com.amap.api.maps.model.LatLng latLng2) {
        if (latLng == null || latLng2 == null) {
            try {
                throw new com.amap.api.maps.AMapException(com.amap.api.maps.AMapException.ERROR_ILLEGAL_VALUE);
            } catch (com.amap.api.maps.AMapException e) {
                e.printStackTrace();
                return 0.0f;
            }
        }
        try {
            double sin = java.lang.Math.sin((latLng.latitude * 3.141592653589793d) / 180.0d) - java.lang.Math.sin((latLng2.latitude * 3.141592653589793d) / 180.0d);
            double d = (latLng2.longitude - latLng.longitude) / 360.0d;
            if (d < 0.0d) {
                d += 1.0d;
            }
            return (float) (sin * 2.5560394669790553E14d * d);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public static float calculateArea(java.util.List<com.amap.api.maps.model.LatLng> list) {
        if (list == null || list.size() < 3) {
            return 0.0f;
        }
        double d = 0.0d;
        int size = list.size();
        int i = 0;
        while (i < size) {
            com.amap.api.maps.model.LatLng latLng = list.get(i);
            i++;
            com.amap.api.maps.model.LatLng latLng2 = list.get(i % size);
            double cos = latLng.longitude * 111319.49079327357d * java.lang.Math.cos(latLng.latitude * DEG_TO_RAD);
            double d2 = latLng.latitude * 111319.49079327357d;
            d += (cos * (latLng2.latitude * 111319.49079327357d)) - (((latLng2.longitude * 111319.49079327357d) * java.lang.Math.cos(latLng2.latitude * DEG_TO_RAD)) * d2);
        }
        return java.lang.Math.abs((float) (d / 2.0d));
    }

    public static void getLatestAMapApp(android.content.Context context) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.addFlags(276824064);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(android.net.Uri.parse("http://wap.amap.com/"));
            new com.amap.api.maps.AMapUtils.a("glaa", context).start();
            context.startActivity(intent);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public static void openAMapNavi(com.amap.api.maps.model.NaviPara naviPara, android.content.Context context) throws com.amap.api.maps.AMapException {
        if (naviPara.getTargetPoint() != null) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.addFlags(276824064);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(android.net.Uri.parse(a(naviPara, context)));
            intent.setPackage("com.autonavi.minimap");
            new com.amap.api.maps.AMapUtils.a("oan", context).start();
            context.startActivity(intent);
            return;
        }
        throw new com.amap.api.maps.AMapException(com.amap.api.maps.AMapException.ILLEGAL_AMAP_ARGUMENT);
    }

    public static void openAMapPoiNearbySearch(com.amap.api.maps.model.PoiPara poiPara, android.content.Context context) throws com.amap.api.maps.AMapException {
        if (poiPara.getKeywords() != null && poiPara.getKeywords().trim().length() > 0) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.addFlags(276824064);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(android.net.Uri.parse(a(poiPara, context)));
            intent.setPackage("com.autonavi.minimap");
            new com.amap.api.maps.AMapUtils.a("oan", context).start();
            context.startActivity(intent);
            return;
        }
        throw new com.amap.api.maps.AMapException(com.amap.api.maps.AMapException.ILLEGAL_AMAP_ARGUMENT);
    }

    public static void openAMapDrivingRoute(com.amap.api.maps.model.RoutePara routePara, android.content.Context context) throws com.amap.api.maps.AMapException {
        a(routePara, context, 2);
    }

    public static void openAMapTransitRoute(com.amap.api.maps.model.RoutePara routePara, android.content.Context context) throws com.amap.api.maps.AMapException {
        a(routePara, context, 1);
    }

    public static void openAMapWalkingRoute(com.amap.api.maps.model.RoutePara routePara, android.content.Context context) throws com.amap.api.maps.AMapException {
        a(routePara, context, 4);
    }

    private static void a(com.amap.api.maps.model.RoutePara routePara, android.content.Context context, int i) throws com.amap.api.maps.AMapException {
        if (a(routePara)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.addFlags(276824064);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(android.net.Uri.parse(b(routePara, context, i)));
            intent.setPackage("com.autonavi.minimap");
            new com.amap.api.maps.AMapUtils.a("oan", context).start();
            context.startActivity(intent);
            return;
        }
        throw new com.amap.api.maps.AMapException(com.amap.api.maps.AMapException.ILLEGAL_AMAP_ARGUMENT);
    }

    private static boolean a(com.amap.api.maps.model.RoutePara routePara) {
        return (routePara.getStartPoint() == null || routePara.getEndPoint() == null || routePara.getStartName() == null || routePara.getStartName().trim().length() <= 0 || routePara.getEndName() == null || routePara.getEndName().trim().length() <= 0) ? false : true;
    }

    static class a extends java.lang.Thread {
        java.lang.String a;
        android.content.Context b;

        public a(java.lang.String str, android.content.Context context) {
            this.a = "";
            this.a = str;
            if (context != null) {
                this.b = context.getApplicationContext();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            if (this.b != null) {
                try {
                    com.amap.api.col.p0003sl.Cif.a(this.b, new com.amap.api.col.3sl.iq.a(this.a, "9.8.2", com.amap.api.col.p0003sl.w.c).a(new java.lang.String[]{"com.amap.api.maps"}).a(), "", (java.util.Map<java.lang.String, java.lang.String>) null);
                    interrupt();
                } catch (com.amap.api.col.p0003sl.id e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static java.lang.String a(com.amap.api.maps.model.NaviPara naviPara, android.content.Context context) {
        return java.lang.String.format(java.util.Locale.US, AMAPNAVIURL, com.amap.api.col.p0003sl.ie.b(context), java.lang.Double.valueOf(naviPara.getTargetPoint().latitude), java.lang.Double.valueOf(naviPara.getTargetPoint().longitude), java.lang.Integer.valueOf(naviPara.getNaviStyle()));
    }

    private static java.lang.String b(com.amap.api.maps.model.RoutePara routePara, android.content.Context context, int i) {
        java.lang.String format = java.lang.String.format(java.util.Locale.US, AMAPROUTEURL, com.amap.api.col.p0003sl.ie.b(context), java.lang.Double.valueOf(routePara.getStartPoint().latitude), java.lang.Double.valueOf(routePara.getStartPoint().longitude), routePara.getStartName(), java.lang.Double.valueOf(routePara.getEndPoint().latitude), java.lang.Double.valueOf(routePara.getEndPoint().longitude), routePara.getEndName(), java.lang.Integer.valueOf(i));
        if (i == 1) {
            return format + "&m=" + routePara.getTransitRouteStyle();
        }
        if (i != 2) {
            return format;
        }
        return format + "&m=" + routePara.getDrivingRouteStyle();
    }

    private static java.lang.String a(com.amap.api.maps.model.PoiPara poiPara, android.content.Context context) {
        java.lang.String format = java.lang.String.format(java.util.Locale.US, AMAPPOISEARCHURL, com.amap.api.col.p0003sl.ie.b(context), poiPara.getKeywords());
        if (poiPara.getCenter() == null) {
            return format;
        }
        return format + "&lat=" + poiPara.getCenter().latitude + "&lon=" + poiPara.getCenter().longitude;
    }
}
