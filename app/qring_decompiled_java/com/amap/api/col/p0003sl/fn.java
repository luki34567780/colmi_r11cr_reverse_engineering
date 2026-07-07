package com.amap.api.col.p0003sl;

/* compiled from: CoreUtil.java */
/* loaded from: classes.dex */
public final class fn {
    public static boolean a(java.lang.String str) {
        return str == null || str.trim().length() == 0;
    }

    public static void b(java.lang.String str) throws com.amap.api.services.core.AMapException {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("errcode")) {
                a(jSONObject.getInt("errcode"), jSONObject.getString("errmsg"));
                return;
            }
            if (jSONObject.has(androidx.core.app.NotificationCompat.CATEGORY_STATUS)) {
                java.lang.String string = jSONObject.getString(androidx.core.app.NotificationCompat.CATEGORY_STATUS);
                if (string.equals(coil.disk.DiskLruCache.VERSION)) {
                    return;
                }
                if (string.equals("0") && !jSONObject.has("infocode")) {
                    throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
                }
                int i = jSONObject.getInt("infocode");
                if (string.equals("0")) {
                    a(i, jSONObject.getString("info"));
                }
            }
        } catch (org.json.JSONException e) {
            a(e, "CoreUtil", "paseAuthFailurJson");
            throw new com.amap.api.services.core.AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static void c(java.lang.String str) throws com.amap.api.services.core.AMapException {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("errcode")) {
                a(jSONObject.getInt("errcode"), jSONObject.getString("errmsg"));
                return;
            }
            if (jSONObject.has(androidx.core.app.NotificationCompat.CATEGORY_STATUS)) {
                if (jSONObject.optInt(androidx.core.app.NotificationCompat.CATEGORY_STATUS) == 0) {
                    if (!jSONObject.has("infocode")) {
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
                    }
                    a(jSONObject.getInt("infocode"), jSONObject.getString("info"));
                }
                int optInt = jSONObject.optInt("code");
                if (optInt == 0) {
                    return;
                }
                java.lang.String optString = jSONObject.optString("message");
                throw new com.amap.api.services.core.AMapException(optString, 2, optString, java.lang.Integer.parseInt(coil.disk.DiskLruCache.VERSION.concat(java.lang.String.valueOf(optInt))));
            }
        } catch (org.json.JSONException e) {
            a(e, "CoreUtil", "paseAuthFailurJson");
            throw new com.amap.api.services.core.AMapException("协议解析错误 - ProtocolException");
        }
    }

    private static void a(int i, java.lang.String str) throws com.amap.api.services.core.AMapException, org.json.JSONException {
        if (i != 0) {
            if (i == 22000) {
                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_SERVICE_TABLEID_NOT_EXIST, 2, str);
            }
            if (i == 32200) {
                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_NEARBY_INVALID_USERID, 2, str);
            }
            if (i != 32201) {
                switch (i) {
                    case 10000:
                        return;
                    case 10001:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_INVALID_USER_KEY, 2, str);
                    case 10002:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_SERVICE_NOT_AVAILBALE, 2, str);
                    case com.autonavi.base.amap.mapcore.tools.GLMapStaticValue.AM_CALLBACK_INDOOR_NETWORK_ERR /* 10003 */:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_DAILY_QUERY_OVER_LIMIT, 2, str);
                    case 10004:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_ACCESS_TOO_FREQUENT, 2, str);
                    case 10005:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_INVALID_USER_IP, 2, str);
                    case 10006:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_INVALID_USER_DOMAIN, 2, str);
                    case 10007:
                        throw new com.amap.api.services.core.AMapException("用户签名未通过", 2, str);
                    case 10008:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_INVALID_USER_SCODE, 2, str);
                    case 10009:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_USERKEY_PLAT_NOMATCH, 2, str);
                    case 10010:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_IP_QUERY_OVER_LIMIT, 2, str);
                    case 10011:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_NOT_SUPPORT_HTTPS, 2, str);
                    case 10012:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_INSUFFICIENT_PRIVILEGES, 2, str);
                    case 10013:
                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_USER_KEY_RECYCLED, 2, str);
                    default:
                        switch (i) {
                            case 20000:
                                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_SERVICE_INVALID_PARAMS, 2, str);
                            case 20001:
                                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_SERVICE_MISSING_REQUIRED_PARAMS, 2, str);
                            case 20002:
                                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_SERVICE_ILLEGAL_REQUEST, 2, str);
                            case 20003:
                                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_SERVICE_UNKNOWN_ERROR, 2, str);
                            default:
                                switch (i) {
                                    case 20800:
                                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_ROUTE_OUT_OF_SERVICE, 2, str);
                                    case 20801:
                                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_ROUTE_NO_ROADS_NEARBY, 2, str);
                                    case 20802:
                                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_ROUTE_FAIL, 2, str);
                                    case 20803:
                                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_OVER_DIRECTION_RANGE, 2, str);
                                    default:
                                        switch (i) {
                                            case 30000:
                                                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_ENGINE_RESPONSE_ERROR, 2, str);
                                            case 30001:
                                                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_ENGINE_RESPONSE_DATA_ERROR, 2, str);
                                            case 30002:
                                                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_ENGINE_CONNECT_TIMEOUT, 2, str);
                                            case 30003:
                                                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_ENGINE_RETURN_TIMEOUT, 2, str);
                                            default:
                                                switch (i) {
                                                    case 32000:
                                                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_ENGINE_TABLEID_NOT_EXIST, 2, str);
                                                    case 32001:
                                                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_ID_NOT_EXIST, 2, str);
                                                    case 32002:
                                                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_SERVICE_MAINTENANCE, 2, str);
                                                    default:
                                                        if (!android.text.TextUtils.isEmpty(str) && i > 0) {
                                                            throw new com.amap.api.services.core.AMapException(str, 2, str, i);
                                                        }
                                                        throw new com.amap.api.services.core.AMapException(str, 2, str);
                                                }
                                        }
                                }
                        }
                }
            }
            throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_NEARBY_KEY_NOT_BIND, 2, str);
        }
    }

    public static double a(double d) {
        return java.lang.Double.parseDouble(new java.text.DecimalFormat("0.000000", new java.text.DecimalFormatSymbols(java.util.Locale.US)).format(d));
    }

    public static java.lang.String a(com.amap.api.services.core.LatLonPoint latLonPoint) {
        if (latLonPoint == null) {
            return "";
        }
        return a(latLonPoint.getLongitude()) + "," + a(latLonPoint.getLatitude());
    }

    public static java.util.Date d(java.lang.String str) {
        if (str == null || str.trim().equals("")) {
            return null;
        }
        try {
            return new java.text.SimpleDateFormat("HHmm").parse(str);
        } catch (java.text.ParseException e) {
            a(e, "CoreUtil", "parseString2Time");
            return null;
        }
    }

    public static java.lang.String a(java.util.Date date) {
        return date != null ? new java.text.SimpleDateFormat("HH:mm").format(date) : "";
    }

    public static java.util.Date e(java.lang.String str) {
        if (str == null || str.trim().equals("")) {
            return null;
        }
        try {
            return new java.text.SimpleDateFormat("HH:mm").parse(str);
        } catch (java.text.ParseException e) {
            a(e, "CoreUtil", "parseTime");
            return null;
        }
    }

    public static java.lang.String a(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
        return a(list, ";");
    }

    public static java.lang.String a(java.util.List<com.amap.api.services.core.LatLonPoint> list, java.lang.String str) {
        if (list == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            com.amap.api.services.core.LatLonPoint latLonPoint = list.get(i);
            if (latLonPoint != null) {
                double a = a(latLonPoint.getLongitude());
                double a2 = a(latLonPoint.getLatitude());
                stringBuffer.append(a);
                stringBuffer.append(",");
                stringBuffer.append(a2);
                stringBuffer.append(str);
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }

    public static void a(java.lang.Throwable th, java.lang.String str, java.lang.String str2) {
        try {
            com.amap.api.col.p0003sl.ju e = com.amap.api.col.p0003sl.ju.e();
            if (e != null) {
                e.b(th, str, str2);
            }
            th.printStackTrace();
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static float a(com.amap.api.services.core.LatLonPoint latLonPoint, com.amap.api.services.core.LatLonPoint latLonPoint2) {
        if (latLonPoint == null || latLonPoint2 == null) {
            return 0.0f;
        }
        try {
            double longitude = latLonPoint.getLongitude();
            double d = longitude * 0.01745329251994329d;
            double latitude = latLonPoint.getLatitude() * 0.01745329251994329d;
            double longitude2 = latLonPoint2.getLongitude() * 0.01745329251994329d;
            double latitude2 = latLonPoint2.getLatitude() * 0.01745329251994329d;
            double sin = java.lang.Math.sin(d);
            double sin2 = java.lang.Math.sin(latitude);
            double cos = java.lang.Math.cos(d);
            double cos2 = java.lang.Math.cos(latitude);
            double sin3 = java.lang.Math.sin(longitude2);
            double sin4 = java.lang.Math.sin(latitude2);
            double cos3 = java.lang.Math.cos(longitude2);
            double cos4 = java.lang.Math.cos(latitude2);
            double[] dArr = {cos * cos2, cos2 * sin, sin2};
            double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
            return (float) (java.lang.Math.asin(java.lang.Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public static double b(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
        double d = 0.0d;
        if (list == null || list.size() < 3) {
            return 0.0d;
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            com.amap.api.services.core.LatLonPoint latLonPoint = list.get(i);
            i++;
            com.amap.api.services.core.LatLonPoint latLonPoint2 = list.get(i % size);
            double longitude = latLonPoint.getLongitude() * 111319.49079327357d * java.lang.Math.cos(latLonPoint.getLatitude() * 0.017453292519943295d);
            double latitude = latLonPoint.getLatitude() * 111319.49079327357d;
            d += (longitude * (latLonPoint2.getLatitude() * 111319.49079327357d)) - (((latLonPoint2.getLongitude() * 111319.49079327357d) * java.lang.Math.cos(latLonPoint2.getLatitude() * 0.017453292519943295d)) * latitude);
        }
        return java.lang.Math.abs(d / 2.0d);
    }

    public static java.lang.String a(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((i & 1) != 0) {
            sb.append("cost,");
        }
        if ((i & 2) != 0) {
            sb.append("tmcs,");
        }
        if ((i & 4) != 0) {
            sb.append("navi,");
        }
        if ((i & 8) != 0) {
            sb.append("cities,");
        }
        if ((i & 16) != 0) {
            sb.append("polyline,");
        }
        if ((i & 32) != 0) {
            sb.append("elec_consume_info,");
        }
        if ((i & 64) != 0) {
            sb.append("charge_station_info,");
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        return sb.toString();
    }
}
