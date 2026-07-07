package com.amap.api.col.p0003sl;

/* compiled from: GeoFenceSearchResultParser.java */
/* loaded from: classes.dex */
public final class c {
    private static long a;

    public static int a(java.lang.String str, java.util.List<com.amap.api.fence.GeoFence> list, android.os.Bundle bundle) {
        org.json.JSONArray optJSONArray;
        int i;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            char c = 0;
            int optInt = jSONObject.optInt(androidx.core.app.NotificationCompat.CATEGORY_STATUS, 0);
            int optInt2 = jSONObject.optInt("infocode", 0);
            if (optInt == 1 && (optJSONArray = jSONObject.optJSONArray("pois")) != null) {
                int i2 = 0;
                while (i2 < optJSONArray.length()) {
                    com.amap.api.fence.GeoFence geoFence = new com.amap.api.fence.GeoFence();
                    com.amap.api.fence.PoiItem poiItem = new com.amap.api.fence.PoiItem();
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    poiItem.setPoiId(jSONObject2.optString(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID));
                    poiItem.setPoiName(jSONObject2.optString("name"));
                    poiItem.setPoiType(jSONObject2.optString("type"));
                    poiItem.setTypeCode(jSONObject2.optString("typecode"));
                    poiItem.setAddress(jSONObject2.optString("address"));
                    java.lang.String optString = jSONObject2.optString("location");
                    if (optString != null) {
                        java.lang.String[] split = optString.split(",");
                        poiItem.setLongitude(java.lang.Double.parseDouble(split[c]));
                        poiItem.setLatitude(java.lang.Double.parseDouble(split[1]));
                        java.util.List<java.util.List<com.amap.api.location.DPoint>> arrayList = new java.util.ArrayList<>();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        i = optInt2;
                        com.amap.api.location.DPoint dPoint = new com.amap.api.location.DPoint(poiItem.getLatitude(), poiItem.getLongitude());
                        arrayList2.add(dPoint);
                        arrayList.add(arrayList2);
                        geoFence.setPointList(arrayList);
                        geoFence.setCenter(dPoint);
                    } else {
                        i = optInt2;
                    }
                    poiItem.setTel(jSONObject2.optString("tel"));
                    poiItem.setProvince(jSONObject2.optString("pname"));
                    poiItem.setCity(jSONObject2.optString("cityname"));
                    poiItem.setAdname(jSONObject2.optString("adname"));
                    geoFence.setPoiItem(poiItem);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(a());
                    geoFence.setFenceId(sb.toString());
                    if (bundle != null) {
                        geoFence.setCustomId(bundle.getString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID));
                        geoFence.setPendingIntentAction(bundle.getString("pendingIntentAction"));
                        geoFence.setType(2);
                        geoFence.setRadius(bundle.getFloat("fenceRadius"));
                        geoFence.setExpiration(bundle.getLong("expiration"));
                        geoFence.setActivatesAction(bundle.getInt("activatesAction", 1));
                    }
                    if (list != null) {
                        list.add(geoFence);
                    }
                    i2++;
                    optInt2 = i;
                    c = 0;
                }
            }
            return optInt2;
        } catch (java.lang.Throwable unused) {
            return 5;
        }
    }

    public static int b(java.lang.String str, java.util.List<com.amap.api.fence.GeoFence> list, android.os.Bundle bundle) {
        return a(str, list, bundle);
    }

    public final int c(java.lang.String str, java.util.List<com.amap.api.fence.GeoFence> list, android.os.Bundle bundle) {
        org.json.JSONArray optJSONArray;
        java.util.ArrayList arrayList;
        java.lang.String str2;
        int i;
        java.lang.String str3;
        java.lang.String str4;
        float f;
        long j;
        long j2;
        int i2;
        java.lang.String str5;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt(androidx.core.app.NotificationCompat.CATEGORY_STATUS, 0);
            int optInt2 = jSONObject.optInt("infocode", 0);
            java.lang.String string = bundle.getString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID);
            java.lang.String string2 = bundle.getString("pendingIntentAction");
            float f2 = bundle.getFloat("fenceRadius");
            long j3 = bundle.getLong("expiration");
            int i3 = bundle.getInt("activatesAction", 1);
            if (optInt == 1 && (optJSONArray = jSONObject.optJSONArray("districts")) != null) {
                int i4 = 0;
                while (i4 < optJSONArray.length()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    com.amap.api.fence.GeoFence geoFence = new com.amap.api.fence.GeoFence();
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                    java.lang.String optString = jSONObject2.optString("citycode");
                    java.lang.String optString2 = jSONObject2.optString("adcode");
                    java.lang.String optString3 = jSONObject2.optString("name");
                    org.json.JSONArray jSONArray = optJSONArray;
                    java.lang.String string3 = jSONObject2.getString("center");
                    int i5 = optInt2;
                    com.amap.api.location.DPoint dPoint = new com.amap.api.location.DPoint();
                    int i6 = i4;
                    java.lang.String str6 = ",";
                    if (string3 != null) {
                        java.lang.String[] split = string3.split(",");
                        arrayList = arrayList2;
                        str2 = optString3;
                        dPoint.setLatitude(java.lang.Double.parseDouble(split[1]));
                        dPoint.setLongitude(java.lang.Double.parseDouble(split[0]));
                        geoFence.setCenter(dPoint);
                    } else {
                        arrayList = arrayList2;
                        str2 = optString3;
                    }
                    geoFence.setCustomId(string);
                    geoFence.setPendingIntentAction(string2);
                    geoFence.setType(3);
                    geoFence.setRadius(f2);
                    geoFence.setExpiration(j3);
                    geoFence.setActivatesAction(i3);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(a());
                    geoFence.setFenceId(sb.toString());
                    java.lang.String optString4 = jSONObject2.optString("polyline");
                    if (optString4 != null) {
                        java.lang.String[] split2 = optString4.split("\\|");
                        int length = split2.length;
                        i = i3;
                        float f3 = Float.MAX_VALUE;
                        int i7 = 0;
                        float f4 = Float.MIN_VALUE;
                        while (i7 < length) {
                            java.lang.String str7 = string;
                            java.lang.String str8 = split2[i7];
                            java.lang.String[] strArr = split2;
                            com.amap.api.fence.DistrictItem districtItem = new com.amap.api.fence.DistrictItem();
                            java.lang.String str9 = string2;
                            java.util.List<com.amap.api.location.DPoint> arrayList4 = new java.util.ArrayList<>();
                            districtItem.setCitycode(optString);
                            districtItem.setAdcode(optString2);
                            java.lang.String str10 = optString2;
                            java.lang.String str11 = str2;
                            districtItem.setDistrictName(str11);
                            str2 = str11;
                            java.lang.String[] split3 = str8.split(";");
                            float f5 = f2;
                            int i8 = 0;
                            while (i8 < split3.length) {
                                java.lang.String[] split4 = split3[i8].split(str6);
                                java.lang.String str12 = str6;
                                java.lang.String[] strArr2 = split3;
                                if (split4.length > 1) {
                                    java.lang.String str13 = split4[1];
                                    java.lang.String str14 = split4[0];
                                    j2 = j3;
                                    double parseDouble = java.lang.Double.parseDouble(str13);
                                    i2 = length;
                                    str5 = optString;
                                    arrayList4.add(new com.amap.api.location.DPoint(parseDouble, java.lang.Double.parseDouble(str14)));
                                } else {
                                    j2 = j3;
                                    i2 = length;
                                    str5 = optString;
                                }
                                i8++;
                                optString = str5;
                                str6 = str12;
                                split3 = strArr2;
                                j3 = j2;
                                length = i2;
                            }
                            java.lang.String str15 = str6;
                            long j4 = j3;
                            int i9 = length;
                            java.lang.String str16 = optString;
                            if (arrayList4.size() > 100.0f) {
                                try {
                                    arrayList4 = a(arrayList4, 100.0f);
                                } catch (java.lang.Throwable unused) {
                                    return 5;
                                }
                            }
                            arrayList3.add(arrayList4);
                            districtItem.setPolyline(arrayList4);
                            java.util.ArrayList arrayList5 = arrayList;
                            arrayList5.add(districtItem);
                            f4 = java.lang.Math.max(f4, com.amap.api.col.p0003sl.a.b(dPoint, arrayList4));
                            f3 = java.lang.Math.min(f3, com.amap.api.col.p0003sl.a.a(dPoint, arrayList4));
                            i7++;
                            optString = str16;
                            arrayList = arrayList5;
                            string = str7;
                            split2 = strArr;
                            string2 = str9;
                            optString2 = str10;
                            f2 = f5;
                            str6 = str15;
                            j3 = j4;
                            length = i9;
                        }
                        str3 = string;
                        str4 = string2;
                        f = f2;
                        j = j3;
                        geoFence.setMaxDis2Center(f4);
                        geoFence.setMinDis2Center(f3);
                        geoFence.setDistrictItemList(arrayList);
                        geoFence.setPointList(arrayList3);
                        list.add(geoFence);
                    } else {
                        i = i3;
                        str3 = string;
                        str4 = string2;
                        f = f2;
                        j = j3;
                    }
                    i4 = i6 + 1;
                    optJSONArray = jSONArray;
                    optInt2 = i5;
                    i3 = i;
                    string = str3;
                    string2 = str4;
                    f2 = f;
                    j3 = j;
                }
            }
            return optInt2;
        } catch (java.lang.Throwable unused2) {
        }
    }

    public static synchronized long a() {
        long j;
        synchronized (com.amap.api.col.p0003sl.c.class) {
            long b = com.autonavi.aps.amapapi.utils.j.b();
            long j2 = a;
            if (b > j2) {
                a = b;
            } else {
                a = j2 + 1;
            }
            j = a;
        }
        return j;
    }

    private java.util.List<com.amap.api.location.DPoint> a(java.util.List<com.amap.api.location.DPoint> list, float f) {
        if (list == null) {
            return null;
        }
        if (list.size() <= 2) {
            return list;
        }
        double d = 0.0d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.amap.api.location.DPoint dPoint = list.get(0);
        com.amap.api.location.DPoint dPoint2 = list.get(list.size() - 1);
        int i = 0;
        for (int i2 = 1; i2 < list.size() - 1; i2++) {
            double a2 = a(list.get(i2), dPoint, dPoint2);
            if (a2 > d) {
                i = i2;
                d = a2;
            }
        }
        if (d < f) {
            arrayList.add(dPoint);
            arrayList.add(dPoint2);
            return arrayList;
        }
        java.util.List<com.amap.api.location.DPoint> a3 = a(list.subList(0, i + 1), f);
        java.util.List<com.amap.api.location.DPoint> a4 = a(list.subList(i, list.size()), f);
        arrayList.addAll(a3);
        arrayList.remove(arrayList.size() - 1);
        arrayList.addAll(a4);
        return arrayList;
    }

    private static double a(com.amap.api.location.DPoint dPoint, com.amap.api.location.DPoint dPoint2, com.amap.api.location.DPoint dPoint3) {
        double longitude;
        double latitude;
        double longitude2 = dPoint.getLongitude() - dPoint2.getLongitude();
        double latitude2 = dPoint.getLatitude() - dPoint2.getLatitude();
        double longitude3 = dPoint3.getLongitude() - dPoint2.getLongitude();
        double latitude3 = dPoint3.getLatitude() - dPoint2.getLatitude();
        double d = ((longitude2 * longitude3) + (latitude2 * latitude3)) / ((longitude3 * longitude3) + (latitude3 * latitude3));
        boolean z = dPoint2.getLongitude() == dPoint3.getLongitude() && dPoint2.getLatitude() == dPoint3.getLatitude();
        if (d < 0.0d || z) {
            longitude = dPoint2.getLongitude();
            latitude = dPoint2.getLatitude();
        } else if (d > 1.0d) {
            longitude = dPoint3.getLongitude();
            latitude = dPoint3.getLatitude();
        } else {
            double longitude4 = dPoint2.getLongitude() + (longitude3 * d);
            latitude = dPoint2.getLatitude() + (d * latitude3);
            longitude = longitude4;
        }
        return com.autonavi.aps.amapapi.utils.j.a(new com.amap.api.location.DPoint(dPoint.getLatitude(), dPoint.getLongitude()), new com.amap.api.location.DPoint(latitude, longitude));
    }
}
