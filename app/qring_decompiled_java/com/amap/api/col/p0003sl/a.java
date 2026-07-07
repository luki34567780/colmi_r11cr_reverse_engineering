package com.amap.api.col.p0003sl;

/* compiled from: GeoFenceManager.java */
/* loaded from: classes.dex */
public final class a {
    private static boolean A;
    android.content.Context b;
    com.autonavi.aps.amapapi.utils.h a = null;
    android.app.PendingIntent c = null;
    java.lang.String d = null;
    com.amap.api.fence.GeoFenceListener e = null;
    private java.lang.Object z = new java.lang.Object();
    volatile int f = 1;
    java.util.ArrayList<com.amap.api.fence.GeoFence> g = new java.util.ArrayList<>();
    com.amap.api.col.3sl.a.c h = null;
    java.lang.Object i = new java.lang.Object();
    java.lang.Object j = new java.lang.Object();
    com.amap.api.col.p0003sl.a.HandlerC0011a k = null;
    com.amap.api.col.3sl.a.b l = null;
    volatile boolean m = false;
    volatile boolean n = false;
    volatile boolean o = false;
    com.amap.api.col.p0003sl.b p = null;
    com.amap.api.col.p0003sl.c q = null;
    com.amap.api.location.AMapLocationClient r = null;
    volatile com.amap.api.location.AMapLocation s = null;
    long t = 0;
    com.amap.api.location.AMapLocationClientOption u = null;
    int v = 0;
    com.amap.api.location.AMapLocationListener w = new com.amap.api.location.AMapLocationListener() { // from class: com.amap.api.col.3sl.a.1
        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(com.amap.api.location.AMapLocation aMapLocation) {
            boolean z;
            int i;
            try {
                if (!com.amap.api.col.p0003sl.a.this.y && com.amap.api.col.p0003sl.a.this.o) {
                    com.amap.api.col.p0003sl.a.this.s = aMapLocation;
                    if (aMapLocation != null) {
                        i = aMapLocation.getErrorCode();
                        if (aMapLocation.getErrorCode() == 0) {
                            com.amap.api.col.p0003sl.a.this.t = com.autonavi.aps.amapapi.utils.j.b();
                            com.amap.api.col.p0003sl.a.this.a(5, (android.os.Bundle) null, 0L);
                            z = true;
                        } else {
                            com.amap.api.col.p0003sl.a.a("定位失败", aMapLocation.getErrorCode(), aMapLocation.getErrorInfo(), "locationDetail:" + aMapLocation.getLocationDetail());
                            z = false;
                        }
                    } else {
                        z = false;
                        i = 8;
                    }
                    if (z) {
                        com.amap.api.col.p0003sl.a.this.v = 0;
                        com.amap.api.col.p0003sl.a.this.a(6, (android.os.Bundle) null, 0L);
                        return;
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    if (!com.amap.api.col.p0003sl.a.this.m) {
                        com.amap.api.col.p0003sl.a.this.b(7);
                        bundle.putLong("interval", com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
                        com.amap.api.col.p0003sl.a.this.a(8, bundle, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
                    }
                    com.amap.api.col.p0003sl.a.this.v++;
                    if (com.amap.api.col.p0003sl.a.this.v >= 3) {
                        bundle.putInt(com.amap.api.fence.GeoFence.BUNDLE_KEY_LOCERRORCODE, i);
                        com.amap.api.col.p0003sl.a.this.a(1002, bundle);
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    };
    final int x = 3;
    volatile boolean y = false;

    public a(android.content.Context context) {
        this.b = null;
        try {
            this.b = context.getApplicationContext();
            j();
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManger", "<init>");
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x002b -> B:12:0x0030). Please report as a decompilation issue!!! */
    private void j() {
        if (!this.o) {
            this.o = true;
        }
        if (this.n) {
            return;
        }
        try {
            if (android.os.Looper.myLooper() == null) {
                this.h = new com.amap.api.col.3sl.a.c(this.b.getMainLooper());
            } else {
                this.h = new com.amap.api.col.3sl.a.c();
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManger", "init 1");
        }
        try {
            com.amap.api.col.3sl.a.b bVar = new com.amap.api.col.3sl.a.b("fenceActionThread");
            this.l = bVar;
            bVar.setPriority(5);
            this.l.start();
            this.k = new com.amap.api.col.p0003sl.a.HandlerC0011a(this.l.getLooper());
        } catch (java.lang.Throwable th2) {
            com.autonavi.aps.amapapi.utils.b.a(th2, "GeoFenceManger", "init 2");
        }
        try {
            this.p = new com.amap.api.col.p0003sl.b(this.b);
            this.q = new com.amap.api.col.p0003sl.c();
            this.u = new com.amap.api.location.AMapLocationClientOption();
            this.r = new com.amap.api.location.AMapLocationClient(this.b);
            this.u.setLocationCacheEnable(true);
            this.u.setNeedAddress(false);
            this.r.setLocationListener(this.w);
            if (this.a == null) {
                this.a = new com.autonavi.aps.amapapi.utils.h();
            }
        } catch (java.lang.Throwable th3) {
            com.autonavi.aps.amapapi.utils.b.a(th3, "GeoFenceManger", "initBase");
        }
        this.n = true;
        try {
            java.lang.String str = this.d;
            if (str != null && this.c == null) {
                a(str);
            }
        } catch (java.lang.Throwable th4) {
            com.autonavi.aps.amapapi.utils.b.a(th4, "GeoFenceManger", "init 4");
        }
        if (A) {
            return;
        }
        A = true;
        com.autonavi.aps.amapapi.utils.h.a(this.b, "O020", (org.json.JSONObject) null);
    }

    /* compiled from: GeoFenceManager.java */
    static class b extends android.os.HandlerThread {
        public b(java.lang.String str) {
            super(str);
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    /* compiled from: GeoFenceManager.java */
    /* renamed from: com.amap.api.col.3sl.a$a, reason: collision with other inner class name */
    class HandlerC0011a extends android.os.Handler {
        public HandlerC0011a(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            try {
                switch (message.what) {
                    case 0:
                        com.amap.api.col.p0003sl.a.this.b(message.getData());
                        break;
                    case 1:
                        com.amap.api.col.p0003sl.a.this.c(message.getData());
                        break;
                    case 2:
                        com.amap.api.col.p0003sl.a.this.e(message.getData());
                        break;
                    case 3:
                        com.amap.api.col.p0003sl.a.this.d(message.getData());
                        break;
                    case 4:
                        com.amap.api.col.p0003sl.a.this.f(message.getData());
                        break;
                    case 5:
                        com.amap.api.col.p0003sl.a.this.e();
                        break;
                    case 6:
                        com.amap.api.col.p0003sl.a aVar = com.amap.api.col.p0003sl.a.this;
                        aVar.a(aVar.s);
                        break;
                    case 7:
                        com.amap.api.col.p0003sl.a.this.d();
                        break;
                    case 8:
                        com.amap.api.col.p0003sl.a.this.j(message.getData());
                        break;
                    case 9:
                        com.amap.api.col.p0003sl.a.this.a(message.getData());
                        break;
                    case 10:
                        com.amap.api.col.p0003sl.a.this.c();
                        break;
                    case 11:
                        com.amap.api.col.p0003sl.a.this.h(message.getData());
                        break;
                    case 12:
                        com.amap.api.col.p0003sl.a.this.g(message.getData());
                        break;
                    case 13:
                        com.amap.api.col.p0003sl.a.this.g();
                        break;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    /* compiled from: GeoFenceManager.java */
    class c extends android.os.Handler {
        public c(android.os.Looper looper) {
            super(looper);
        }

        public c() {
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            try {
                android.os.Bundle data = message.getData();
                switch (message.what) {
                    case 1000:
                        com.amap.api.col.p0003sl.a.this.i(data);
                        return;
                    case 1001:
                        try {
                            com.amap.api.col.p0003sl.a.this.b((com.amap.api.fence.GeoFence) data.getParcelable("geoFence"));
                            return;
                        } catch (java.lang.Throwable th) {
                            th.printStackTrace();
                            return;
                        }
                    case 1002:
                        try {
                            com.amap.api.col.p0003sl.a.this.c(data.getInt(com.amap.api.fence.GeoFence.BUNDLE_KEY_LOCERRORCODE));
                            return;
                        } catch (java.lang.Throwable th2) {
                            th2.printStackTrace();
                            return;
                        }
                    default:
                        return;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public final android.app.PendingIntent a(java.lang.String str) {
        synchronized (this.z) {
            try {
                android.content.Intent intent = new android.content.Intent(str);
                intent.setPackage(com.amap.api.col.p0003sl.ie.c(this.b));
                if (android.os.Build.VERSION.SDK_INT >= 31 && this.b.getApplicationInfo().targetSdkVersion >= 31) {
                    this.c = android.app.PendingIntent.getBroadcast(this.b, 0, intent, 33554432);
                } else {
                    this.c = android.app.PendingIntent.getBroadcast(this.b, 0, intent, 0);
                }
                this.d = str;
                java.util.ArrayList<com.amap.api.fence.GeoFence> arrayList = this.g;
                if (arrayList != null && !arrayList.isEmpty()) {
                    java.util.Iterator<com.amap.api.fence.GeoFence> it = this.g.iterator();
                    while (it.hasNext()) {
                        com.amap.api.fence.GeoFence next = it.next();
                        next.setPendingIntent(this.c);
                        next.setPendingIntentAction(this.d);
                    }
                }
            } finally {
                return this.c;
            }
        }
        return this.c;
    }

    public final void a(int i) {
        try {
            j();
            if (i > 7 || i <= 0) {
                i = 1;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("activatesAction", i);
            a(9, bundle, 0L);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "setActivateAction");
        }
    }

    final void a(android.os.Bundle bundle) {
        int i = 1;
        if (bundle != null) {
            try {
                i = bundle.getInt("activatesAction", 1);
            } catch (java.lang.Throwable th) {
                com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doSetActivatesAction");
                return;
            }
        }
        if (this.f != i) {
            java.util.ArrayList<com.amap.api.fence.GeoFence> arrayList = this.g;
            if (arrayList != null && !arrayList.isEmpty()) {
                java.util.Iterator<com.amap.api.fence.GeoFence> it = this.g.iterator();
                while (it.hasNext()) {
                    com.amap.api.fence.GeoFence next = it.next();
                    next.setStatus(0);
                    next.setEnterTime(-1L);
                }
            }
            n();
        }
        this.f = i;
    }

    public final void a(com.amap.api.fence.GeoFenceListener geoFenceListener) {
        try {
            this.e = geoFenceListener;
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void a(com.amap.api.location.DPoint dPoint, float f, java.lang.String str) {
        try {
            j();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("centerPoint", dPoint);
            bundle.putFloat("fenceRadius", f);
            bundle.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, str);
            a(0, bundle, 0L);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "addRoundGeoFence");
        }
    }

    final void b(android.os.Bundle bundle) {
        java.lang.String str;
        try {
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
            java.lang.String str2 = "";
            int i = 1;
            if (bundle != null && !bundle.isEmpty()) {
                com.amap.api.location.DPoint dPoint = (com.amap.api.location.DPoint) bundle.getParcelable("centerPoint");
                str = bundle.getString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID);
                if (dPoint != null) {
                    if (dPoint.getLatitude() <= 90.0d && dPoint.getLatitude() >= -90.0d && dPoint.getLongitude() <= 180.0d && dPoint.getLongitude() >= -180.0d) {
                        com.amap.api.fence.GeoFence a = a(bundle, false);
                        i = c(a);
                        if (i == 0) {
                            arrayList.add(a);
                        }
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putInt(com.amap.api.maps.model.MyLocationStyle.ERROR_CODE, i);
                        bundle2.putParcelableArrayList("resultList", arrayList);
                        bundle2.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, str);
                        a(1000, bundle2);
                    }
                    a("添加围栏失败", 1, "经纬度错误，传入的纬度：" + dPoint.getLatitude() + "传入的经度:" + dPoint.getLongitude(), new java.lang.String[0]);
                    android.os.Bundle bundle22 = new android.os.Bundle();
                    bundle22.putInt(com.amap.api.maps.model.MyLocationStyle.ERROR_CODE, i);
                    bundle22.putParcelableArrayList("resultList", arrayList);
                    bundle22.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, str);
                    a(1000, bundle22);
                }
                str2 = str;
            }
            str = str2;
            android.os.Bundle bundle222 = new android.os.Bundle();
            bundle222.putInt(com.amap.api.maps.model.MyLocationStyle.ERROR_CODE, i);
            bundle222.putParcelableArrayList("resultList", arrayList);
            bundle222.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, str);
            a(1000, bundle222);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doAddGeoFenceRound");
        }
    }

    public final void a(java.util.List<com.amap.api.location.DPoint> list, java.lang.String str) {
        try {
            j();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("pointList", new java.util.ArrayList<>(list));
            bundle.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, str);
            a(1, bundle, 0L);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "addPolygonGeoFence");
        }
    }

    final void c(android.os.Bundle bundle) {
        com.amap.api.fence.GeoFence a;
        try {
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
            java.lang.String str = "";
            int i = 1;
            if (bundle != null && !bundle.isEmpty()) {
                java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("pointList");
                java.lang.String string = bundle.getString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID);
                if (parcelableArrayList != null && parcelableArrayList.size() > 2 && (i = c((a = a(bundle, true)))) == 0) {
                    arrayList.add(a);
                }
                str = string;
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, str);
            bundle2.putInt(com.amap.api.maps.model.MyLocationStyle.ERROR_CODE, i);
            bundle2.putParcelableArrayList("resultList", arrayList);
            a(1000, bundle2);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doAddGeoFencePolygon");
        }
    }

    private com.amap.api.fence.GeoFence a(android.os.Bundle bundle, boolean z) {
        com.amap.api.fence.GeoFence geoFence = new com.amap.api.fence.GeoFence();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.amap.api.location.DPoint dPoint = new com.amap.api.location.DPoint();
        if (z) {
            geoFence.setType(1);
            arrayList = bundle.getParcelableArrayList("pointList");
            if (arrayList != null) {
                dPoint = b(arrayList);
            }
            geoFence.setMaxDis2Center(b(dPoint, arrayList));
            geoFence.setMinDis2Center(a(dPoint, arrayList));
        } else {
            geoFence.setType(0);
            dPoint = (com.amap.api.location.DPoint) bundle.getParcelable("centerPoint");
            if (dPoint != null) {
                arrayList.add(dPoint);
            }
            float f = bundle.getFloat("fenceRadius", 1000.0f);
            float f2 = f > 0.0f ? f : 1000.0f;
            geoFence.setRadius(f2);
            geoFence.setMinDis2Center(f2);
            geoFence.setMaxDis2Center(f2);
        }
        geoFence.setActivatesAction(this.f);
        geoFence.setCustomId(bundle.getString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(arrayList);
        geoFence.setPointList(arrayList2);
        geoFence.setCenter(dPoint);
        geoFence.setPendingIntentAction(this.d);
        geoFence.setExpiration(-1L);
        geoFence.setPendingIntent(this.c);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.amap.api.col.p0003sl.c.a());
        geoFence.setFenceId(sb.toString());
        com.autonavi.aps.amapapi.utils.h hVar = this.a;
        if (hVar != null) {
            hVar.a(this.b, 2);
        }
        return geoFence;
    }

    public final void a(java.lang.String str, java.lang.String str2, com.amap.api.location.DPoint dPoint, float f, int i, java.lang.String str3) {
        try {
            j();
            if (f <= 0.0f || f > 50000.0f) {
                f = 3000.0f;
            }
            if (i <= 0) {
                i = 10;
            }
            if (i > 25) {
                i = 25;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("keyWords", str);
            bundle.putString("poiType", str2);
            bundle.putParcelable("centerPoint", dPoint);
            bundle.putFloat("aroundRadius", f);
            bundle.putInt("searchSize", i);
            bundle.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, str3);
            a(3, bundle, 0L);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "addNearbyGeoFence");
        }
    }

    final void d(android.os.Bundle bundle) {
        b(2, bundle);
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4) {
        try {
            j();
            if (i <= 0) {
                i = 10;
            }
            if (i > 25) {
                i = 25;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("keyWords", str);
            bundle.putString("poiType", str2);
            bundle.putString(com.amap.api.services.district.DistrictSearchQuery.KEYWORDS_CITY, str3);
            bundle.putInt("searchSize", i);
            bundle.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, str4);
            a(2, bundle, 0L);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "addKeywordGeoFence");
        }
    }

    final void e(android.os.Bundle bundle) {
        b(1, bundle);
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        try {
            j();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("keyWords", str);
            bundle.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, str2);
            a(4, bundle, 0L);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "addDistricetGeoFence");
        }
    }

    final void f(android.os.Bundle bundle) {
        b(3, bundle);
    }

    private static boolean a(int i, java.lang.String str, java.lang.String str2, com.amap.api.location.DPoint dPoint) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                if (dPoint == null) {
                    return false;
                }
                if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d || dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
                    a("添加围栏失败", 0, "经纬度错误，传入的纬度：" + dPoint.getLatitude() + "传入的经度:" + dPoint.getLongitude(), new java.lang.String[0]);
                    return false;
                }
            }
        } else if (android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        return true;
    }

    private void b(int i, android.os.Bundle bundle) {
        java.lang.String str;
        int i2;
        java.lang.String str2;
        int i3;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String a;
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
            if (bundle == null || bundle.isEmpty()) {
                str2 = com.amap.api.maps.model.MyLocationStyle.ERROR_CODE;
                i3 = 1;
            } else {
                java.util.List<com.amap.api.fence.GeoFence> arrayList2 = new java.util.ArrayList<>();
                java.lang.String string = bundle.getString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID);
                java.lang.String string2 = bundle.getString("keyWords");
                java.lang.String string3 = bundle.getString(com.amap.api.services.district.DistrictSearchQuery.KEYWORDS_CITY);
                java.lang.String string4 = bundle.getString("poiType");
                com.amap.api.location.DPoint dPoint = (com.amap.api.location.DPoint) bundle.getParcelable("centerPoint");
                int i4 = bundle.getInt("searchSize", 10);
                float f = bundle.getFloat("aroundRadius", 3000.0f);
                if (a(i, string2, string4, dPoint)) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, string);
                    bundle3.putString("pendingIntentAction", this.d);
                    str3 = com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID;
                    str4 = com.amap.api.maps.model.MyLocationStyle.ERROR_CODE;
                    try {
                        bundle3.putLong("expiration", -1L);
                        bundle3.putInt("activatesAction", this.f);
                        if (i == 1) {
                            bundle3.putFloat("fenceRadius", 1000.0f);
                            a = this.p.a(this.b, "http://restsdk.amap.com/v3/place/text?", string2, string4, string3, java.lang.String.valueOf(i4));
                        } else if (i == 2) {
                            double b2 = com.autonavi.aps.amapapi.utils.j.b(dPoint.getLatitude());
                            double b3 = com.autonavi.aps.amapapi.utils.j.b(dPoint.getLongitude());
                            int intValue = java.lang.Float.valueOf(f).intValue();
                            bundle3.putFloat("fenceRadius", 200.0f);
                            a = this.p.a(this.b, "http://restsdk.amap.com/v3/place/around?", string2, string4, java.lang.String.valueOf(i4), java.lang.String.valueOf(b2), java.lang.String.valueOf(b3), java.lang.String.valueOf(intValue));
                        } else {
                            a = i != 3 ? null : this.p.a(this.b, "http://restsdk.amap.com/v3/config/district?", string2);
                        }
                        if (a != null) {
                            int a2 = 1 == i ? com.amap.api.col.p0003sl.c.a(a, arrayList2, bundle3) : 0;
                            if (2 == i) {
                                a2 = com.amap.api.col.p0003sl.c.b(a, arrayList2, bundle3);
                            }
                            if (3 == i) {
                                a2 = this.q.c(a, arrayList2, bundle3);
                            }
                            if (a2 == 10000) {
                                if (arrayList2.isEmpty()) {
                                    i2 = 16;
                                } else {
                                    i2 = a(arrayList2);
                                    if (i2 == 0) {
                                        try {
                                            arrayList.addAll(arrayList2);
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            str = str4;
                                            try {
                                                com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doAddGeoFenceNearby");
                                                bundle2.putInt(str, 8);
                                                a(1000, bundle2);
                                                return;
                                            } catch (java.lang.Throwable th2) {
                                                bundle2.putInt(str, i2);
                                                a(1000, bundle2);
                                                throw th2;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i2 = d(a2);
                            }
                        } else {
                            i2 = 4;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        str = str4;
                        i2 = 0;
                        com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doAddGeoFenceNearby");
                        bundle2.putInt(str, 8);
                        a(1000, bundle2);
                        return;
                    }
                } else {
                    str3 = com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID;
                    str4 = com.amap.api.maps.model.MyLocationStyle.ERROR_CODE;
                    i2 = 1;
                }
                bundle2.putString(str3, string);
                bundle2.putParcelableArrayList("resultList", arrayList);
                i3 = i2;
                str2 = str4;
            }
            bundle2.putInt(str2, i3);
            a(1000, bundle2);
        } catch (java.lang.Throwable th4) {
            th = th4;
            str = com.amap.api.maps.model.MyLocationStyle.ERROR_CODE;
        }
    }

    public final void a() {
        try {
            this.o = false;
            a(10, (android.os.Bundle) null, 0L);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "removeGeoFence");
        }
    }

    public final boolean a(com.amap.api.fence.GeoFence geoFence) {
        try {
            java.util.ArrayList<com.amap.api.fence.GeoFence> arrayList = this.g;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (!this.g.contains(geoFence)) {
                    return false;
                }
                if (this.g.size() == 1) {
                    this.o = false;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("fc", geoFence);
                a(11, bundle, 0L);
                return true;
            }
            this.o = false;
            a(10, (android.os.Bundle) null, 0L);
            return true;
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "removeGeoFence(GeoFence)");
            return false;
        }
    }

    public final void a(java.lang.String str, boolean z) {
        try {
            j();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("fid", str);
            bundle.putBoolean("ab", z);
            a(12, bundle, 0L);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "setGeoFenceAble");
        }
    }

    final void g(android.os.Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                java.lang.String string = bundle.getString("fid");
                if (android.text.TextUtils.isEmpty(string)) {
                    return;
                }
                boolean z = bundle.getBoolean("ab", true);
                java.util.ArrayList<com.amap.api.fence.GeoFence> arrayList = this.g;
                if (arrayList != null && !arrayList.isEmpty()) {
                    java.util.Iterator<com.amap.api.fence.GeoFence> it = this.g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.amap.api.fence.GeoFence next = it.next();
                        if (next.getFenceId().equals(string)) {
                            next.setAble(z);
                            break;
                        }
                    }
                }
                if (!z) {
                    if (k()) {
                        g();
                        return;
                    }
                    return;
                }
                n();
            } catch (java.lang.Throwable th) {
                com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doSetGeoFenceAble");
            }
        }
    }

    private boolean k() {
        java.util.ArrayList<com.amap.api.fence.GeoFence> arrayList = this.g;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        java.util.Iterator<com.amap.api.fence.GeoFence> it = this.g.iterator();
        while (it.hasNext()) {
            if (it.next().isAble()) {
                return false;
            }
        }
        return true;
    }

    public final java.util.List<com.amap.api.fence.GeoFence> b() {
        try {
            if (this.g == null) {
                this.g = new java.util.ArrayList<>();
            }
            return (java.util.ArrayList) this.g.clone();
        } catch (java.lang.Throwable unused) {
            return new java.util.ArrayList();
        }
    }

    final void h(android.os.Bundle bundle) {
        try {
            if (this.g != null) {
                com.amap.api.fence.GeoFence geoFence = (com.amap.api.fence.GeoFence) bundle.getParcelable("fc");
                if (this.g.contains(geoFence)) {
                    this.g.remove(geoFence);
                }
                if (this.g.size() <= 0) {
                    c();
                } else {
                    n();
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    final void c() {
        if (this.n) {
            java.util.ArrayList<com.amap.api.fence.GeoFence> arrayList = this.g;
            if (arrayList != null) {
                arrayList.clear();
                this.g = null;
            }
            if (this.o) {
                return;
            }
            m();
            com.amap.api.location.AMapLocationClient aMapLocationClient = this.r;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
                this.r.onDestroy();
            }
            this.r = null;
            if (this.l != null) {
                if (android.os.Build.VERSION.SDK_INT >= 18) {
                    this.l.quitSafely();
                } else {
                    this.l.quit();
                }
            }
            this.l = null;
            this.p = null;
            synchronized (this.z) {
                android.app.PendingIntent pendingIntent = this.c;
                if (pendingIntent != null) {
                    pendingIntent.cancel();
                }
                this.c = null;
            }
            l();
            com.autonavi.aps.amapapi.utils.h hVar = this.a;
            if (hVar != null) {
                hVar.b(this.b);
            }
            this.m = false;
            this.n = false;
        }
    }

    private void l() {
        try {
            synchronized (this.j) {
                com.amap.api.col.3sl.a.c cVar = this.h;
                if (cVar != null) {
                    cVar.removeCallbacksAndMessages(null);
                }
                this.h = null;
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "destroyResultHandler");
        }
    }

    private int c(com.amap.api.fence.GeoFence geoFence) {
        try {
            if (this.g == null) {
                this.g = new java.util.ArrayList<>();
            }
            if (this.g.contains(geoFence)) {
                return 17;
            }
            this.g.add(geoFence);
            return 0;
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "addGeoFence2List");
            a("添加围栏失败", 8, th.getMessage(), new java.lang.String[0]);
            return 8;
        }
    }

    private int a(java.util.List<com.amap.api.fence.GeoFence> list) {
        try {
            if (this.g == null) {
                this.g = new java.util.ArrayList<>();
            }
            java.util.Iterator<com.amap.api.fence.GeoFence> it = list.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            return 0;
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "addGeoFenceList");
            a("添加围栏失败", 8, th.getMessage(), new java.lang.String[0]);
            return 8;
        }
    }

    final void a(int i, android.os.Bundle bundle, long j) {
        try {
            synchronized (this.i) {
                com.amap.api.col.p0003sl.a.HandlerC0011a handlerC0011a = this.k;
                if (handlerC0011a != null) {
                    android.os.Message obtainMessage = handlerC0011a.obtainMessage();
                    obtainMessage.what = i;
                    obtainMessage.setData(bundle);
                    this.k.sendMessageDelayed(obtainMessage, j);
                }
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "sendActionHandlerMessage");
        }
    }

    final void b(int i) {
        try {
            synchronized (this.i) {
                com.amap.api.col.p0003sl.a.HandlerC0011a handlerC0011a = this.k;
                if (handlerC0011a != null) {
                    handlerC0011a.removeMessages(i);
                }
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "removeActionHandlerMessage");
        }
    }

    private void m() {
        try {
            synchronized (this.i) {
                com.amap.api.col.p0003sl.a.HandlerC0011a handlerC0011a = this.k;
                if (handlerC0011a != null) {
                    handlerC0011a.removeCallbacksAndMessages(null);
                }
                this.k = null;
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "destroyActionHandler");
        }
    }

    final void a(int i, android.os.Bundle bundle) {
        try {
            synchronized (this.j) {
                com.amap.api.col.3sl.a.c cVar = this.h;
                if (cVar != null) {
                    android.os.Message obtainMessage = cVar.obtainMessage();
                    obtainMessage.what = i;
                    obtainMessage.setData(bundle);
                    this.h.sendMessage(obtainMessage);
                }
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "sendResultHandlerMessage");
        }
    }

    final void i(android.os.Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                int i = bundle.getInt(com.amap.api.maps.model.MyLocationStyle.ERROR_CODE);
                java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("resultList");
                if (parcelableArrayList == null) {
                    parcelableArrayList = new java.util.ArrayList();
                }
                java.lang.String string = bundle.getString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID);
                if (string == null) {
                    string = "";
                }
                com.amap.api.fence.GeoFenceListener geoFenceListener = this.e;
                if (geoFenceListener != null) {
                    geoFenceListener.onGeoFenceCreateFinished((java.util.ArrayList) parcelableArrayList.clone(), i, string);
                }
                if (i == 0) {
                    n();
                }
            } catch (java.lang.Throwable th) {
                com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "resultAddGeoFenceFinished");
            }
        }
    }

    private void n() {
        if (this.y || this.k == null) {
            return;
        }
        if (p()) {
            a(6, (android.os.Bundle) null, 0L);
            a(5, (android.os.Bundle) null, 0L);
        } else {
            b(7);
            a(7, (android.os.Bundle) null, 0L);
        }
    }

    private static android.os.Bundle a(com.amap.api.fence.GeoFence geoFence, java.lang.String str, java.lang.String str2, int i, int i2) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (str == null) {
            str = "";
        }
        bundle.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_FENCEID, str);
        bundle.putString(com.amap.api.fence.GeoFence.BUNDLE_KEY_CUSTOMID, str2);
        bundle.putInt("event", i);
        bundle.putInt(com.amap.api.fence.GeoFence.BUNDLE_KEY_LOCERRORCODE, i2);
        bundle.putParcelable(com.amap.api.fence.GeoFence.BUNDLE_KEY_FENCE, geoFence);
        return bundle;
    }

    final void c(int i) {
        try {
            if (this.b != null) {
                synchronized (this.z) {
                    if (this.c == null) {
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtras(a((com.amap.api.fence.GeoFence) null, (java.lang.String) null, (java.lang.String) null, 4, i));
                    this.c.send(this.b, 0, intent);
                }
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "resultRemindLocationError");
        }
    }

    final void b(com.amap.api.fence.GeoFence geoFence) {
        try {
            synchronized (this.z) {
                if (this.b != null) {
                    if (this.c == null && geoFence.getPendingIntent() == null) {
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtras(a(geoFence, geoFence.getFenceId(), geoFence.getCustomId(), geoFence.getStatus(), 0));
                    java.lang.String str = this.d;
                    if (str != null) {
                        intent.setAction(str);
                    }
                    intent.setPackage(com.amap.api.col.p0003sl.ie.c(this.b));
                    if (geoFence.getPendingIntent() != null) {
                        geoFence.getPendingIntent().send(this.b, 0, intent);
                    } else {
                        this.c.send(this.b, 0, intent);
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "resultTriggerGeoFence");
        }
    }

    final void a(com.amap.api.location.AMapLocation aMapLocation) {
        java.util.ArrayList<com.amap.api.fence.GeoFence> arrayList;
        try {
            if (this.y || (arrayList = this.g) == null || arrayList.isEmpty() || aMapLocation == null || aMapLocation.getErrorCode() != 0) {
                return;
            }
            java.util.Iterator<com.amap.api.fence.GeoFence> it = this.g.iterator();
            while (it.hasNext()) {
                com.amap.api.fence.GeoFence next = it.next();
                if (next.isAble() && b(aMapLocation, next) && a(next, this.f)) {
                    next.setCurrentLocation(aMapLocation);
                    d(next);
                }
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doCheckFence");
        }
    }

    private void d(com.amap.api.fence.GeoFence geoFence) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("geoFence", geoFence);
        a(1001, bundle);
    }

    final void d() {
        try {
            if (this.r != null) {
                o();
                this.u.setOnceLocation(true);
                this.r.setLocationOption(this.u);
                this.r.startLocation();
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doStartOnceLocation");
        }
    }

    private void o() {
        try {
            if (this.m) {
                b(8);
            }
            com.amap.api.location.AMapLocationClient aMapLocationClient = this.r;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
            }
            this.m = false;
        } catch (java.lang.Throwable unused) {
        }
    }

    final void j(android.os.Bundle bundle) {
        try {
            if (this.r != null) {
                long j = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL;
                if (bundle != null && !bundle.isEmpty()) {
                    j = bundle.getLong("interval", com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
                }
                this.u.setOnceLocation(false);
                this.u.setInterval(j);
                this.r.setLocationOption(this.u);
                if (this.m) {
                    return;
                }
                this.r.stopLocation();
                this.r.startLocation();
                this.m = true;
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doStartContinueLocation");
        }
    }

    private boolean p() {
        return this.s != null && com.autonavi.aps.amapapi.utils.j.a(this.s) && com.autonavi.aps.amapapi.utils.j.b() - this.t < androidx.work.WorkRequest.MIN_BACKOFF_MILLIS;
    }

    final void e() {
        try {
            if (!this.y && com.autonavi.aps.amapapi.utils.j.a(this.s)) {
                float a = a(this.s, this.g);
                if (a == Float.MAX_VALUE) {
                    return;
                }
                if (a < 1000.0f) {
                    b(7);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putLong("interval", com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
                    a(8, bundle, 500L);
                    return;
                }
                if (a < 5000.0f) {
                    o();
                    b(7);
                    a(7, (android.os.Bundle) null, androidx.work.WorkRequest.MIN_BACKOFF_MILLIS);
                } else {
                    o();
                    b(7);
                    a(7, (android.os.Bundle) null, (long) (((a - 4000.0f) / 100.0f) * 1000.0f));
                }
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doCheckLocationPolicy");
        }
    }

    private static com.amap.api.location.DPoint b(java.util.List<com.amap.api.location.DPoint> list) {
        com.amap.api.location.DPoint dPoint = new com.amap.api.location.DPoint();
        if (list == null) {
            return dPoint;
        }
        try {
            double d = 0.0d;
            double d2 = 0.0d;
            for (com.amap.api.location.DPoint dPoint2 : list) {
                d += dPoint2.getLatitude();
                d2 += dPoint2.getLongitude();
            }
            return new com.amap.api.location.DPoint(com.autonavi.aps.amapapi.utils.j.b(d / list.size()), com.autonavi.aps.amapapi.utils.j.b(d2 / list.size()));
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceUtil", "getPolygonCenter");
            return dPoint;
        }
    }

    private static float a(com.amap.api.location.AMapLocation aMapLocation, java.util.List<com.amap.api.fence.GeoFence> list) {
        float f = Float.MAX_VALUE;
        if (aMapLocation != null && aMapLocation.getErrorCode() == 0 && list != null && !list.isEmpty()) {
            com.amap.api.location.DPoint dPoint = new com.amap.api.location.DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude());
            for (com.amap.api.fence.GeoFence geoFence : list) {
                if (geoFence.isAble()) {
                    float a = com.autonavi.aps.amapapi.utils.j.a(dPoint, geoFence.getCenter());
                    if (a > geoFence.getMinDis2Center() && a < geoFence.getMaxDis2Center()) {
                        return 0.0f;
                    }
                    if (a > geoFence.getMaxDis2Center()) {
                        f = java.lang.Math.min(f, a - geoFence.getMaxDis2Center());
                    }
                    if (a < geoFence.getMinDis2Center()) {
                        f = java.lang.Math.min(f, geoFence.getMinDis2Center() - a);
                    }
                }
            }
        }
        return f;
    }

    static float a(com.amap.api.location.DPoint dPoint, java.util.List<com.amap.api.location.DPoint> list) {
        float f = Float.MAX_VALUE;
        if (dPoint != null && list != null && !list.isEmpty()) {
            java.util.Iterator<com.amap.api.location.DPoint> it = list.iterator();
            while (it.hasNext()) {
                f = java.lang.Math.min(f, com.autonavi.aps.amapapi.utils.j.a(dPoint, it.next()));
            }
        }
        return f;
    }

    static float b(com.amap.api.location.DPoint dPoint, java.util.List<com.amap.api.location.DPoint> list) {
        float f = Float.MIN_VALUE;
        if (dPoint != null && list != null && !list.isEmpty()) {
            java.util.Iterator<com.amap.api.location.DPoint> it = list.iterator();
            while (it.hasNext()) {
                f = java.lang.Math.max(f, com.autonavi.aps.amapapi.utils.j.a(dPoint, it.next()));
            }
        }
        return f;
    }

    private static boolean a(com.amap.api.location.AMapLocation aMapLocation, com.amap.api.location.DPoint dPoint, float f) {
        return com.autonavi.aps.amapapi.utils.j.a(new double[]{dPoint.getLatitude(), dPoint.getLongitude(), aMapLocation.getLatitude(), aMapLocation.getLongitude()}) <= f;
    }

    private static boolean b(com.amap.api.location.AMapLocation aMapLocation, java.util.List<com.amap.api.location.DPoint> list) {
        if (list.size() < 3) {
            return false;
        }
        return com.autonavi.aps.amapapi.utils.b.a(new com.amap.api.location.DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()), list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0056, code lost:
    
        if (a(r4, r5.getCenter(), r5.getRadius()) != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.amap.api.location.AMapLocation r4, com.amap.api.fence.GeoFence r5) {
        /*
            r0 = 1
            r1 = 0
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r4)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L59
            if (r5 == 0) goto L59
            java.util.List r2 = r5.getPointList()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L59
            java.util.List r2 = r5.getPointList()     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r2 != 0) goto L59
            int r2 = r5.getType()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L4a
            if (r2 == r0) goto L29
            r3 = 2
            if (r2 == r3) goto L4a
            r3 = 3
            if (r2 == r3) goto L29
            goto L59
        L29:
            java.util.List r5 = r5.getPointList()     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5b
        L31:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L45
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L47
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L47
            boolean r2 = b(r4, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L31
            r1 = 1
            goto L31
        L45:
            r0 = r1
            goto L64
        L47:
            r4 = move-exception
            r0 = r1
            goto L5d
        L4a:
            com.amap.api.location.DPoint r2 = r5.getCenter()     // Catch: java.lang.Throwable -> L5b
            float r5 = r5.getRadius()     // Catch: java.lang.Throwable -> L5b
            boolean r4 = a(r4, r2, r5)     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L59
            goto L64
        L59:
            r0 = 0
            goto L64
        L5b:
            r4 = move-exception
            r0 = 0
        L5d:
            java.lang.String r5 = "Utils"
            java.lang.String r1 = "isInGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r1)
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.a.a(com.amap.api.location.AMapLocation, com.amap.api.fence.GeoFence):boolean");
    }

    private static boolean b(com.amap.api.location.AMapLocation aMapLocation, com.amap.api.fence.GeoFence geoFence) {
        boolean z = true;
        try {
            if (!a(aMapLocation, geoFence)) {
                if (geoFence.getStatus() != 2) {
                    try {
                        geoFence.setStatus(2);
                        geoFence.setEnterTime(-1L);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        com.autonavi.aps.amapapi.utils.b.a(th, "Utils", "isFenceStatusChanged");
                        return z;
                    }
                }
                z = false;
            } else if (geoFence.getEnterTime() == -1) {
                if (geoFence.getStatus() != 1) {
                    geoFence.setEnterTime(com.autonavi.aps.amapapi.utils.j.b());
                    geoFence.setStatus(1);
                }
                z = false;
            } else {
                if (geoFence.getStatus() != 3 && com.autonavi.aps.amapapi.utils.j.b() - geoFence.getEnterTime() > 600000) {
                    geoFence.setStatus(3);
                }
                z = false;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r4.getStatus() == 3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.amap.api.fence.GeoFence r4, int r5) {
        /*
            r0 = r5 & 1
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L10
            int r0 = r4.getStatus()     // Catch: java.lang.Throwable -> Le
            if (r0 != r1) goto L10
            r2 = 1
            goto L10
        Le:
            r4 = move-exception
            goto L28
        L10:
            r0 = r5 & 2
            r3 = 2
            if (r0 != r3) goto L1c
            int r0 = r4.getStatus()     // Catch: java.lang.Throwable -> Le
            if (r0 != r3) goto L1c
            r2 = 1
        L1c:
            r0 = 4
            r5 = r5 & r0
            if (r5 != r0) goto L30
            int r4 = r4.getStatus()     // Catch: java.lang.Throwable -> Le
            r5 = 3
            if (r4 != r5) goto L30
            goto L31
        L28:
            java.lang.String r5 = "Utils"
            java.lang.String r0 = "remindStatus"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r0)
            goto L32
        L30:
            r1 = r2
        L31:
            r2 = r1
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.a.a(com.amap.api.fence.GeoFence, int):boolean");
    }

    private static int d(int i) {
        if (i != 1 && i != 7 && i != 4 && i != 5 && i != 16 && i != 17) {
            switch (i) {
                case 10000:
                    i = 0;
                    break;
                case 10001:
                case 10002:
                case 10007:
                case 10008:
                case 10009:
                case 10012:
                case 10013:
                    i = 7;
                    break;
                case com.autonavi.base.amap.mapcore.tools.GLMapStaticValue.AM_CALLBACK_INDOOR_NETWORK_ERR /* 10003 */:
                case 10004:
                case 10005:
                case 10006:
                case 10010:
                case 10011:
                case 10014:
                case 10015:
                case 10016:
                case 10017:
                    i = 4;
                    break;
                default:
                    switch (i) {
                        case 20000:
                        case 20001:
                        case 20002:
                            i = 1;
                            break;
                        case 20003:
                        default:
                            i = 8;
                            break;
                    }
            }
        }
        if (i != 0) {
            a("添加围栏失败", i, "searchErrCode is ".concat(java.lang.String.valueOf(i)), new java.lang.String[0]);
        }
        return i;
    }

    static void a(java.lang.String str, int i, java.lang.String str2, java.lang.String... strArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("===========================================\n");
        stringBuffer.append("              " + str + "                ");
        stringBuffer.append("\n");
        stringBuffer.append("-------------------------------------------\n");
        stringBuffer.append("errorCode:".concat(java.lang.String.valueOf(i)));
        stringBuffer.append("\n");
        stringBuffer.append("错误信息:".concat(java.lang.String.valueOf(str2)));
        stringBuffer.append("\n");
        if (strArr.length > 0) {
            for (java.lang.String str3 : strArr) {
                stringBuffer.append(str3);
                stringBuffer.append("\n");
            }
        }
        stringBuffer.append("===========================================\n");
        android.util.Log.i("fenceErrLog", stringBuffer.toString());
    }

    public final void f() {
        try {
            j();
            this.y = true;
            a(13, (android.os.Bundle) null, 0L);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "pauseGeoFence");
        }
    }

    final void g() {
        try {
            b(7);
            b(8);
            com.amap.api.location.AMapLocationClient aMapLocationClient = this.r;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
            }
            this.m = false;
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "doPauseGeoFence");
        }
    }

    public final void h() {
        try {
            j();
            if (this.y) {
                this.y = false;
                n();
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "GeoFenceManager", "resumeGeoFence");
        }
    }

    public final boolean i() {
        return this.y;
    }
}
