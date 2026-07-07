package com.amap.api.location;

/* loaded from: classes.dex */
public class AMapLocationClient {
    android.content.Context a;
    com.amap.api.col.p0003sl.d b;

    public java.lang.String getVersion() {
        return "6.4.0";
    }

    public AMapLocationClient(android.content.Context context) throws java.lang.Exception {
        a(context);
        try {
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context参数不能为null");
            }
            android.content.Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            com.autonavi.aps.amapapi.utils.d.a(applicationContext);
            this.b = new com.amap.api.col.p0003sl.d(context, null, null);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "ne1");
        }
    }

    public AMapLocationClient(android.content.Context context, android.content.Intent intent) throws java.lang.Exception {
        a(context);
        try {
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context参数不能为null");
            }
            this.a = context.getApplicationContext();
            this.b = new com.amap.api.col.p0003sl.d(this.a, intent, null);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "ne2");
        }
    }

    public AMapLocationClient(android.os.Looper looper, android.content.Context context) throws java.lang.Exception {
        a(context);
        try {
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context参数不能为null");
            }
            this.a = context.getApplicationContext();
            this.b = new com.amap.api.col.p0003sl.d(this.a, null, looper);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "ne3");
        }
    }

    private static void a(android.content.Context context) throws java.lang.Exception {
        com.amap.api.col.p0003sl.io a = com.amap.api.col.p0003sl.in.a(context, com.autonavi.aps.amapapi.utils.b.c());
        if (a.a == com.amap.api.col.3sl.in.c.SuccessCode) {
            return;
        }
        android.util.Log.e("AMapLocationClient", a.b);
        throw new java.lang.Exception(a.b);
    }

    public void setLocationOption(com.amap.api.location.AMapLocationClientOption aMapLocationClientOption) {
        try {
            if (aMapLocationClientOption == null) {
                throw new java.lang.IllegalArgumentException("LocationManagerOption参数不能为null");
            }
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                dVar.a(aMapLocationClientOption);
            }
            if (aMapLocationClientOption.b) {
                aMapLocationClientOption.b = false;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (!android.text.TextUtils.isEmpty(aMapLocationClientOption.c)) {
                    jSONObject.put("amap_loc_scenes_type", aMapLocationClientOption.c);
                }
                com.autonavi.aps.amapapi.utils.h.a(this.a, "O019", jSONObject);
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "sLocnO");
        }
    }

    public void setLocationListener(com.amap.api.location.AMapLocationListener aMapLocationListener) {
        try {
            if (aMapLocationListener == null) {
                throw new java.lang.IllegalArgumentException("listener参数不能为null");
            }
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                dVar.a(aMapLocationListener);
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "sLocL");
        }
    }

    public void startLocation() {
        try {
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                dVar.b();
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "stl");
        }
    }

    public void stopLocation() {
        try {
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                dVar.c();
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "stl");
        }
    }

    public com.amap.api.location.AMapLocation getLastKnownLocation() {
        try {
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                return dVar.e();
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "gLastL");
            return null;
        }
    }

    public void startAssistantLocation(android.webkit.WebView webView) {
        try {
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                dVar.a(webView);
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "sttAssL1");
        }
    }

    public void stopAssistantLocation() {
        try {
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                dVar.f();
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "stAssL");
        }
    }

    public static void updatePrivacyShow(android.content.Context context, boolean z, boolean z2) {
        com.amap.api.col.p0003sl.in.a(context, z, z2, com.autonavi.aps.amapapi.utils.b.c());
    }

    public static void updatePrivacyAgree(android.content.Context context, boolean z) {
        com.amap.api.col.p0003sl.in.a(context, z, com.autonavi.aps.amapapi.utils.b.c());
    }

    public static void setApiKey(java.lang.String str) {
        try {
            com.amap.api.location.AMapLocationClientOption.a = str;
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "sKey");
        }
    }

    public boolean isStarted() {
        try {
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                return dVar.a();
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "isS");
            return false;
        }
    }

    public void unRegisterLocationListener(com.amap.api.location.AMapLocationListener aMapLocationListener) {
        try {
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                dVar.b(aMapLocationListener);
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "unRL");
        }
    }

    public void onDestroy() {
        try {
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                dVar.d();
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "onDy");
        }
    }

    public void enableBackgroundLocation(int i, android.app.Notification notification) {
        try {
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                dVar.a(i, notification);
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "eBackL");
        }
    }

    public void disableBackgroundLocation(boolean z) {
        try {
            com.amap.api.col.p0003sl.d dVar = this.b;
            if (dVar != null) {
                dVar.a(z);
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMClt", "dBackL");
        }
    }

    public static java.lang.String getDeviceId(android.content.Context context) {
        return com.amap.api.col.p0003sl.ii.q(context);
    }

    public static void setHost(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.amap.api.col.p0003sl.ks.a = -1;
            com.amap.api.col.p0003sl.ks.b = "";
        } else {
            com.amap.api.col.p0003sl.ks.a = 1;
            com.amap.api.col.p0003sl.ks.b = str;
        }
    }
}
