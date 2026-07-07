package com.amap.api.maps.offlinemap;

/* loaded from: classes.dex */
public final class OfflineMapManager {
    com.amap.api.col.p0003sl.bc a;
    com.amap.api.col.p0003sl.ay b;
    private android.content.Context c;
    private com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener d;
    private com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener e;
    private android.os.Handler f;
    private android.os.Handler g;

    public interface OfflineLoadedListener {
        void onVerifyComplete();
    }

    public interface OfflineMapDownloadListener {
        void onCheckUpdate(boolean z, java.lang.String str);

        void onDownload(int i, int i2, java.lang.String str);

        void onRemove(boolean z, java.lang.String str, java.lang.String str2);
    }

    public final void restart() {
    }

    public OfflineMapManager(android.content.Context context, com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener offlineMapDownloadListener) throws java.lang.Exception {
        com.amap.api.col.p0003sl.io a = com.amap.api.col.p0003sl.in.a(context, com.amap.api.col.p0003sl.dx.a());
        if (a.a != com.amap.api.col.3sl.in.c.SuccessCode) {
            throw new java.lang.Exception(a.b);
        }
        this.d = offlineMapDownloadListener;
        this.c = context.getApplicationContext();
        this.f = new android.os.Handler(this.c.getMainLooper());
        this.g = new android.os.Handler(this.c.getMainLooper());
        a(context);
        com.amap.api.col.p0003sl.ik.a().a(this.c);
    }

    public OfflineMapManager(android.content.Context context, com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener offlineMapDownloadListener, com.amap.api.maps.AMap aMap) {
        this.d = offlineMapDownloadListener;
        this.c = context.getApplicationContext();
        this.f = new android.os.Handler(this.c.getMainLooper());
        this.g = new android.os.Handler(this.c.getMainLooper());
        try {
            a(context);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(android.content.Context context) {
        this.c = context.getApplicationContext();
        com.amap.api.col.p0003sl.ay.b = false;
        com.amap.api.col.p0003sl.ay a = com.amap.api.col.p0003sl.ay.a(this.c);
        this.b = a;
        a.a(new com.amap.api.col.3sl.ay.a() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1
            @Override // com.amap.api.col.3sl.ay.a
            public final void a(final com.amap.api.col.p0003sl.ax axVar) {
                if (com.amap.api.maps.offlinemap.OfflineMapManager.this.d == null || axVar == null) {
                    return;
                }
                com.amap.api.maps.offlinemap.OfflineMapManager.this.f.post(new java.lang.Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.amap.api.maps.offlinemap.OfflineMapManager.this.d.onDownload(axVar.c().b(), axVar.getcompleteCode(), axVar.getCity());
                        } catch (java.lang.Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }

            @Override // com.amap.api.col.3sl.ay.a
            public final void b(final com.amap.api.col.p0003sl.ax axVar) {
                if (com.amap.api.maps.offlinemap.OfflineMapManager.this.d == null || axVar == null) {
                    return;
                }
                com.amap.api.maps.offlinemap.OfflineMapManager.this.f.post(new java.lang.Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (!axVar.c().equals(axVar.g) && !axVar.c().equals(axVar.a)) {
                                com.amap.api.maps.offlinemap.OfflineMapManager.this.d.onCheckUpdate(false, axVar.getCity());
                                return;
                            }
                            com.amap.api.maps.offlinemap.OfflineMapManager.this.d.onCheckUpdate(true, axVar.getCity());
                        } catch (java.lang.Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }

            @Override // com.amap.api.col.3sl.ay.a
            public final void c(final com.amap.api.col.p0003sl.ax axVar) {
                if (com.amap.api.maps.offlinemap.OfflineMapManager.this.d == null || axVar == null) {
                    return;
                }
                com.amap.api.maps.offlinemap.OfflineMapManager.this.f.post(new java.lang.Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (axVar.c().equals(axVar.a)) {
                                com.amap.api.maps.offlinemap.OfflineMapManager.this.d.onRemove(true, axVar.getCity(), "");
                            } else {
                                com.amap.api.maps.offlinemap.OfflineMapManager.this.d.onRemove(false, axVar.getCity(), "");
                            }
                        } catch (java.lang.Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }

            @Override // com.amap.api.col.3sl.ay.a
            public final void a() {
                if (com.amap.api.maps.offlinemap.OfflineMapManager.this.e != null) {
                    com.amap.api.maps.offlinemap.OfflineMapManager.this.f.post(new java.lang.Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                com.amap.api.maps.offlinemap.OfflineMapManager.this.e.onVerifyComplete();
                            } catch (java.lang.Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    });
                }
            }
        });
        try {
            this.b.a();
            this.a = this.b.f;
            com.amap.api.col.p0003sl.du.b(context);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final void downloadByCityCode(java.lang.String str) throws com.amap.api.maps.AMapException {
        try {
            this.b.f(str);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final void downloadByCityName(java.lang.String str) throws com.amap.api.maps.AMapException {
        try {
            this.b.e(str);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final void downloadByProvinceName(java.lang.String str) throws com.amap.api.maps.AMapException {
        try {
            a();
            com.amap.api.maps.offlinemap.OfflineMapProvince itemByProvinceName = getItemByProvinceName(str);
            if (itemByProvinceName == null) {
                throw new com.amap.api.maps.AMapException("无效的参数 - IllegalArgumentException");
            }
            java.util.Iterator<com.amap.api.maps.offlinemap.OfflineMapCity> it = itemByProvinceName.getCityList().iterator();
            while (it.hasNext()) {
                final java.lang.String city = it.next().getCity();
                this.g.post(new java.lang.Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.amap.api.maps.offlinemap.OfflineMapManager.this.b.e(city);
                        } catch (com.amap.api.maps.AMapException e) {
                            com.amap.api.col.p0003sl.ju.c(e, "OfflineMapManager", "downloadByProvinceName");
                        }
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            if (th instanceof com.amap.api.maps.AMapException) {
                throw th;
            }
            com.amap.api.col.p0003sl.ju.c(th, "OfflineMapManager", "downloadByProvinceName");
        }
    }

    public final void remove(java.lang.String str) {
        try {
            if (this.b.b(str)) {
                this.b.c(str);
                return;
            }
            com.amap.api.maps.offlinemap.OfflineMapProvince c = this.a.c(str);
            if (c != null && c.getCityList() != null) {
                java.util.Iterator<com.amap.api.maps.offlinemap.OfflineMapCity> it = c.getCityList().iterator();
                while (it.hasNext()) {
                    final java.lang.String city = it.next().getCity();
                    this.g.post(new java.lang.Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.amap.api.maps.offlinemap.OfflineMapManager.this.b.c(city);
                        }
                    });
                }
                return;
            }
            com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener offlineMapDownloadListener = this.d;
            if (offlineMapDownloadListener != null) {
                offlineMapDownloadListener.onRemove(false, str, "没有该城市");
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> getOfflineMapProvinceList() {
        return this.a.a();
    }

    public final com.amap.api.maps.offlinemap.OfflineMapCity getItemByCityCode(java.lang.String str) {
        return this.a.a(str);
    }

    public final com.amap.api.maps.offlinemap.OfflineMapCity getItemByCityName(java.lang.String str) {
        return this.a.b(str);
    }

    public final com.amap.api.maps.offlinemap.OfflineMapProvince getItemByProvinceName(java.lang.String str) {
        return this.a.c(str);
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> getOfflineMapCityList() {
        return this.a.b();
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> getDownloadingCityList() {
        return this.a.e();
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> getDownloadingProvinceList() {
        return this.a.f();
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> getDownloadOfflineMapCityList() {
        return this.a.c();
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> getDownloadOfflineMapProvinceList() {
        return this.a.d();
    }

    private void a(java.lang.String str) throws com.amap.api.maps.AMapException {
        this.b.a(str);
    }

    public final void updateOfflineCityByCode(java.lang.String str) throws com.amap.api.maps.AMapException {
        com.amap.api.maps.offlinemap.OfflineMapCity itemByCityCode = getItemByCityCode(str);
        if (itemByCityCode == null || itemByCityCode.getCity() == null) {
            throw new com.amap.api.maps.AMapException("无效的参数 - IllegalArgumentException");
        }
        a(itemByCityCode.getCity());
    }

    public final void updateOfflineCityByName(java.lang.String str) throws com.amap.api.maps.AMapException {
        a(str);
    }

    public final void updateOfflineMapProvinceByName(java.lang.String str) throws com.amap.api.maps.AMapException {
        a(str);
    }

    private void a() throws com.amap.api.maps.AMapException {
        if (!com.amap.api.col.p0003sl.dx.d(this.c)) {
            throw new com.amap.api.maps.AMapException(com.amap.api.maps.AMapException.ERROR_CONNECTION);
        }
    }

    public final void stop() {
        this.b.d();
    }

    public final void pause() {
        this.b.e();
    }

    public final void pauseByName(java.lang.String str) {
        this.b.d(str);
    }

    public final void destroy() {
        try {
            com.amap.api.col.p0003sl.ay ayVar = this.b;
            if (ayVar != null) {
                ayVar.f();
            }
            b();
            android.os.Handler handler = this.f;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f = null;
            android.os.Handler handler2 = this.g;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            this.g = null;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        this.d = null;
    }

    public final void setOnOfflineLoadedListener(com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener offlineLoadedListener) {
        this.e = offlineLoadedListener;
    }
}
