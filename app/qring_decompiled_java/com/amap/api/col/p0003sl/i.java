package com.amap.api.col.p0003sl;

/* compiled from: H5LocationClient.java */
/* loaded from: classes.dex */
public final class i {
    com.amap.api.col.3sl.i.a c;
    private android.content.Context d;
    private android.webkit.WebView f;
    java.lang.Object a = new java.lang.Object();
    private com.amap.api.location.AMapLocationClient e = null;
    private java.lang.String g = "AMap.Geolocation.cbk";
    com.amap.api.location.AMapLocationClientOption b = null;
    private volatile boolean h = false;

    public i(android.content.Context context, android.webkit.WebView webView) {
        this.f = null;
        this.c = null;
        this.d = context.getApplicationContext();
        this.f = webView;
        this.c = new com.amap.api.col.3sl.i.a();
    }

    public final void a() {
        if (this.f == null || this.d == null || android.os.Build.VERSION.SDK_INT < 17 || this.h) {
            return;
        }
        try {
            this.f.getSettings().setJavaScriptEnabled(true);
            this.f.addJavascriptInterface(this, "AMapAndroidLoc");
            if (!android.text.TextUtils.isEmpty(this.f.getUrl())) {
                this.f.reload();
            }
            if (this.e == null) {
                com.amap.api.location.AMapLocationClient aMapLocationClient = new com.amap.api.location.AMapLocationClient(this.d);
                this.e = aMapLocationClient;
                aMapLocationClient.setLocationListener(this.c);
            }
            this.h = true;
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void b() {
        synchronized (this.a) {
            this.h = false;
            com.amap.api.location.AMapLocationClient aMapLocationClient = this.e;
            if (aMapLocationClient != null) {
                aMapLocationClient.unRegisterLocationListener(this.c);
                this.e.stopLocation();
                this.e.onDestroy();
                this.e = null;
            }
            this.b = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x004e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:19:0x004e, B:24:0x0055, B:25:0x0064, B:28:0x006a, B:30:0x006f, B:36:0x005d), top: B:18:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:19:0x004e, B:24:0x0055, B:25:0x0064, B:28:0x006a, B:30:0x006f, B:36:0x005d), top: B:18:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:19:0x004e, B:24:0x0055, B:25:0x0064, B:28:0x006a, B:30:0x006f, B:36:0x005d), top: B:18:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r10) {
        /*
            r9 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r9.b
            if (r0 != 0) goto Lb
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            r9.b = r0
        Lb:
            r0 = 5
            r1 = 30000(0x7530, double:1.4822E-319)
            r3 = 1
            r4 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r10 = "to"
            long r1 = r5.optLong(r10, r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r10 = "useGPS"
            int r10 = r5.optInt(r10, r3)     // Catch: java.lang.Throwable -> L4c
            if (r10 != r3) goto L25
            r10 = 1
            goto L26
        L25:
            r10 = 0
        L26:
            java.lang.String r6 = "watch"
            int r6 = r5.optInt(r6, r4)     // Catch: java.lang.Throwable -> L4d
            if (r6 != r3) goto L30
            r6 = 1
            goto L31
        L30:
            r6 = 0
        L31:
            java.lang.String r7 = "interval"
            int r0 = r5.optInt(r7, r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = "callback"
            r8 = 0
            java.lang.String r5 = r5.optString(r7, r8)     // Catch: java.lang.Throwable -> L4e
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L4e
            if (r7 != 0) goto L47
            r9.g = r5     // Catch: java.lang.Throwable -> L4e
            goto L4e
        L47:
            java.lang.String r5 = "AMap.Geolocation.cbk"
            r9.g = r5     // Catch: java.lang.Throwable -> L4e
            goto L4e
        L4c:
            r10 = 0
        L4d:
            r6 = 0
        L4e:
            com.amap.api.location.AMapLocationClientOption r5 = r9.b     // Catch: java.lang.Throwable -> L77
            r5.setHttpTimeOut(r1)     // Catch: java.lang.Throwable -> L77
            if (r10 == 0) goto L5d
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: java.lang.Throwable -> L77
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy     // Catch: java.lang.Throwable -> L77
            r10.setLocationMode(r1)     // Catch: java.lang.Throwable -> L77
            goto L64
        L5d:
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: java.lang.Throwable -> L77
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving     // Catch: java.lang.Throwable -> L77
            r10.setLocationMode(r1)     // Catch: java.lang.Throwable -> L77
        L64:
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: java.lang.Throwable -> L77
            if (r6 != 0) goto L69
            goto L6a
        L69:
            r3 = 0
        L6a:
            r10.setOnceLocation(r3)     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L77
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: java.lang.Throwable -> L77
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L77
            r10.setInterval(r0)     // Catch: java.lang.Throwable -> L77
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.i.a(java.lang.String):void");
    }

    @android.webkit.JavascriptInterface
    public final void getLocation(java.lang.String str) {
        synchronized (this.a) {
            if (this.h) {
                a(str);
                com.amap.api.location.AMapLocationClient aMapLocationClient = this.e;
                if (aMapLocationClient != null) {
                    aMapLocationClient.setLocationOption(this.b);
                    this.e.stopLocation();
                    this.e.startLocation();
                }
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void stopLocation() {
        com.amap.api.location.AMapLocationClient aMapLocationClient;
        if (this.h && (aMapLocationClient = this.e) != null) {
            aMapLocationClient.stopLocation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final java.lang.String str) {
        try {
            if (this.f != null) {
                if (android.os.Build.VERSION.SDK_INT >= 19) {
                    this.f.evaluateJavascript("javascript:" + this.g + "('" + str + "')", new android.webkit.ValueCallback<java.lang.String>() { // from class: com.amap.api.col.3sl.i.1
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(java.lang.String str2) {
                        }
                    });
                    return;
                }
                this.f.post(new java.lang.Runnable() { // from class: com.amap.api.col.3sl.i.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.amap.api.col.p0003sl.i.this.f.loadUrl("javascript:" + com.amap.api.col.p0003sl.i.this.g + "('" + str + "')");
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "H5LocationClient", "callbackJs()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String b(com.amap.api.location.AMapLocation aMapLocation) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (aMapLocation == null) {
                jSONObject.put(com.amap.api.maps.model.MyLocationStyle.ERROR_CODE, -1);
                jSONObject.put(com.amap.api.maps.model.MyLocationStyle.ERROR_INFO, "unknownError");
            } else if (aMapLocation.getErrorCode() == 0) {
                jSONObject.put(com.amap.api.maps.model.MyLocationStyle.ERROR_CODE, 0);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("x", aMapLocation.getLongitude());
                jSONObject2.put("y", aMapLocation.getLatitude());
                jSONObject2.put("precision", aMapLocation.getAccuracy());
                jSONObject2.put("type", aMapLocation.getLocationType());
                jSONObject2.put(com.amap.api.services.district.DistrictSearchQuery.KEYWORDS_COUNTRY, aMapLocation.getCountry());
                jSONObject2.put(com.amap.api.services.district.DistrictSearchQuery.KEYWORDS_PROVINCE, aMapLocation.getProvince());
                jSONObject2.put(com.amap.api.services.district.DistrictSearchQuery.KEYWORDS_CITY, aMapLocation.getCity());
                jSONObject2.put("cityCode", aMapLocation.getCityCode());
                jSONObject2.put(com.amap.api.services.district.DistrictSearchQuery.KEYWORDS_DISTRICT, aMapLocation.getDistrict());
                jSONObject2.put("adCode", aMapLocation.getAdCode());
                jSONObject2.put("street", aMapLocation.getStreet());
                jSONObject2.put("streetNum", aMapLocation.getStreetNum());
                jSONObject2.put("floor", aMapLocation.getFloor());
                jSONObject2.put("address", aMapLocation.getAddress());
                jSONObject.put("result", jSONObject2);
            } else {
                jSONObject.put(com.amap.api.maps.model.MyLocationStyle.ERROR_CODE, aMapLocation.getErrorCode());
                jSONObject.put(com.amap.api.maps.model.MyLocationStyle.ERROR_INFO, aMapLocation.getErrorInfo());
                jSONObject.put("locationDetail", aMapLocation.getLocationDetail());
            }
        } catch (java.lang.Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* compiled from: H5LocationClient.java */
    class a implements com.amap.api.location.AMapLocationListener {
        a() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(com.amap.api.location.AMapLocation aMapLocation) {
            if (com.amap.api.col.p0003sl.i.this.h) {
                com.amap.api.col.p0003sl.i.this.b(com.amap.api.col.p0003sl.i.b(aMapLocation));
            }
        }
    }
}
