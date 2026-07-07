package com.amap.api.col.p0003sl;

/* compiled from: CoreUtil.java */
/* loaded from: classes.dex */
public final class hy {
    private static java.lang.String[] a = {"com.amap.api.trace", "com.amap.api.trace.core"};

    public static void a(java.lang.String str) throws com.amap.api.col.p0003sl.hv {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("errcode")) {
                a(jSONObject.getInt("errcode"), jSONObject.getString("errmsg"));
                return;
            }
            if (jSONObject.has(androidx.core.app.NotificationCompat.CATEGORY_STATUS) && jSONObject.has("infocode")) {
                java.lang.String string = jSONObject.getString(androidx.core.app.NotificationCompat.CATEGORY_STATUS);
                int i = jSONObject.getInt("infocode");
                if (coil.disk.DiskLruCache.VERSION.equals(string)) {
                    return;
                }
                java.lang.String string2 = jSONObject.getString("info");
                if ("0".equals(string)) {
                    a(i, string2);
                }
            }
        } catch (org.json.JSONException unused) {
            throw new com.amap.api.col.p0003sl.hv("协议解析错误 - ProtocolException");
        }
    }

    private static void a(int i, java.lang.String str) throws com.amap.api.col.p0003sl.hv {
        if (i != 0) {
            switch (i) {
                case 10000:
                    return;
                case 10001:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_INVALID_USER_KEY);
                case 10002:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_SERVICE_NOT_AVAILBALE);
                case com.autonavi.base.amap.mapcore.tools.GLMapStaticValue.AM_CALLBACK_INDOOR_NETWORK_ERR /* 10003 */:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_DAILY_QUERY_OVER_LIMIT);
                case 10004:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_ACCESS_TOO_FREQUENT);
                case 10005:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_INVALID_USER_IP);
                case 10006:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_INVALID_USER_DOMAIN);
                case 10007:
                    throw new com.amap.api.col.p0003sl.hv("用户签名未通过");
                case 10008:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_INVALID_USER_SCODE);
                case 10009:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_USERKEY_PLAT_NOMATCH);
                case 10010:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_IP_QUERY_OVER_LIMIT);
                case 10011:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_NOT_SUPPORT_HTTPS);
                case 10012:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_INSUFFICIENT_PRIVILEGES);
                case 10013:
                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_USER_KEY_RECYCLED);
                default:
                    switch (i) {
                        case 20000:
                            throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_SERVICE_INVALID_PARAMS);
                        case 20001:
                            throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_SERVICE_MISSING_REQUIRED_PARAMS);
                        case 20002:
                            throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_SERVICE_ILLEGAL_REQUEST);
                        case 20003:
                            throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_SERVICE_UNKNOWN_ERROR);
                        default:
                            switch (i) {
                                case 30000:
                                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_ENGINE_RESPONSE_ERROR);
                                case 30001:
                                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_ENGINE_RESPONSE_DATA_ERROR);
                                case 30002:
                                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_ENGINE_CONNECT_TIMEOUT);
                                case 30003:
                                    throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_ENGINE_RETURN_TIMEOUT);
                                default:
                                    throw new com.amap.api.col.p0003sl.hv(str);
                            }
                    }
            }
        }
    }

    public static int a(java.util.List<com.amap.api.maps.model.LatLng> list) {
        int i = 0;
        if (list == null || list.size() == 0) {
            return 0;
        }
        int i2 = 0;
        while (i < list.size() - 1) {
            com.amap.api.maps.model.LatLng latLng = list.get(i);
            i++;
            com.amap.api.maps.model.LatLng latLng2 = list.get(i);
            if (latLng == null || latLng2 == null) {
                break;
            }
            i2 = (int) (i2 + com.amap.api.maps.AMapUtils.calculateLineDistance(latLng, latLng2));
        }
        return i2;
    }
}
