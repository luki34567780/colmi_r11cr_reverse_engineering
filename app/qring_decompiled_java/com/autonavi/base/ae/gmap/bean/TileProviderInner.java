package com.autonavi.base.ae.gmap.bean;

/* loaded from: classes.dex */
public class TileProviderInner {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private java.util.List<com.amap.api.maps.model.TileOverlaySource> mTileSource;
    private java.lang.String overlayName;
    private final java.util.HashMap<java.lang.String, com.amap.api.col.p0003sl.ma> reqTaskHandleHashMap = new java.util.HashMap<>();
    private final com.amap.api.maps.model.TileProvider tileProvider;

    private java.lang.String createKey(int i, int i2, int i3, long j) {
        return i + " " + i2 + " " + i3 + "-" + j;
    }

    public TileProviderInner(com.amap.api.maps.model.TileProvider tileProvider) {
        this.tileProvider = tileProvider;
    }

    public void setTileSource(java.util.List<com.amap.api.maps.model.TileOverlaySource> list) {
        this.mTileSource = list;
    }

    public void getTile(final com.autonavi.base.ae.gmap.bean.TileSourceReq tileSourceReq, final com.autonavi.base.ae.gmap.bean.TileReqTaskHandle tileReqTaskHandle) {
        final java.lang.String createKey = createKey(tileSourceReq.x, tileSourceReq.y, tileSourceReq.zoom, tileReqTaskHandle.nativeObj);
        com.amap.api.col.p0003sl.ma maVar = new com.amap.api.col.p0003sl.ma() { // from class: com.autonavi.base.ae.gmap.bean.TileProviderInner.1
            @Override // com.amap.api.col.p0003sl.ma
            public void runTask() {
                try {
                    synchronized (com.autonavi.base.ae.gmap.bean.TileProviderInner.this.reqTaskHandleHashMap) {
                        if (com.autonavi.base.ae.gmap.bean.TileProviderInner.this.reqTaskHandleHashMap.containsKey(createKey)) {
                            if (com.autonavi.base.ae.gmap.bean.TileProviderInner.this.tileProvider != null) {
                                com.amap.api.maps.model.Tile tile = com.amap.api.maps.model.TileProvider.NO_TILE;
                                try {
                                    tile = com.autonavi.base.ae.gmap.bean.TileProviderInner.this.tileProvider instanceof com.autonavi.base.ae.gmap.bean.TileSourceProvider ? ((com.autonavi.base.ae.gmap.bean.TileSourceProvider) com.autonavi.base.ae.gmap.bean.TileProviderInner.this.tileProvider).getTile(tileSourceReq) : com.autonavi.base.ae.gmap.bean.TileProviderInner.this.tileProvider.getTile(tileSourceReq.x, tileSourceReq.y, tileSourceReq.zoom);
                                } catch (java.lang.Throwable unused) {
                                }
                                com.autonavi.base.ae.gmap.bean.TileProviderInner.this.finishDownload(tile, tileReqTaskHandle, createKey);
                            }
                        }
                    }
                } catch (java.lang.Throwable th) {
                    com.autonavi.base.ae.gmap.bean.TileProviderInner.this.finishDownload(com.amap.api.maps.model.TileProvider.NO_TILE, tileReqTaskHandle, createKey);
                    th.printStackTrace();
                }
            }
        };
        synchronized (this.reqTaskHandleHashMap) {
            if (this.reqTaskHandleHashMap.containsKey(createKey)) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 5) {
                this.reqTaskHandleHashMap.put(createKey, maVar);
            }
            com.amap.api.col.p0003sl.dv.a().a(maVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishDownload(final com.amap.api.maps.model.Tile tile, final com.autonavi.base.ae.gmap.bean.TileReqTaskHandle tileReqTaskHandle, final java.lang.String str) {
        com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
        if (iGlOverlayLayer == null) {
            return;
        }
        iGlOverlayLayer.getMap().queueEvent(new java.lang.Runnable() { // from class: com.autonavi.base.ae.gmap.bean.TileProviderInner.2
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                synchronized (com.autonavi.base.ae.gmap.bean.TileProviderInner.this.reqTaskHandleHashMap) {
                    if (com.autonavi.base.ae.gmap.bean.TileProviderInner.this.reqTaskHandleHashMap.containsKey(str)) {
                        if (com.autonavi.base.ae.gmap.bean.TileProviderInner.this.reqTaskHandleHashMap.containsKey(str)) {
                            com.autonavi.base.ae.gmap.bean.TileProviderInner.this.reqTaskHandleHashMap.remove(str);
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            tileReqTaskHandle.finish(tile);
                            com.autonavi.base.ae.gmap.bean.TileProviderInner.this.callNativeFunction("finishTileReqTask", new java.lang.Object[]{tileReqTaskHandle});
                        }
                    }
                }
            }
        });
    }

    public void cancelTile(com.autonavi.base.ae.gmap.bean.TileSourceReq tileSourceReq, com.autonavi.base.ae.gmap.bean.TileReqTaskHandle tileReqTaskHandle) {
        java.lang.String createKey = createKey(tileSourceReq.x, tileSourceReq.y, tileSourceReq.zoom, tileReqTaskHandle.nativeObj);
        synchronized (this.reqTaskHandleHashMap) {
            if (this.reqTaskHandleHashMap.containsKey(createKey)) {
                com.amap.api.col.p0003sl.ma maVar = this.reqTaskHandleHashMap.get(createKey);
                if (maVar != null) {
                    com.amap.api.col.p0003sl.dv.a();
                    com.amap.api.col.p0003sl.dv.b(maVar);
                }
                if (tileReqTaskHandle != null) {
                    tileReqTaskHandle.status = 1;
                    finishDownload(com.amap.api.maps.model.TileProvider.NO_TILE, tileReqTaskHandle, createKey);
                }
                try {
                    com.amap.api.maps.model.TileProvider tileProvider = this.tileProvider;
                    if (tileProvider instanceof com.autonavi.base.ae.gmap.bean.TileSourceProvider) {
                        ((com.autonavi.base.ae.gmap.bean.TileSourceProvider) tileProvider).cancel(tileSourceReq);
                    }
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public int getTileWidth() {
        com.amap.api.maps.model.TileProvider tileProvider = this.tileProvider;
        if (tileProvider != null) {
            return tileProvider.getTileWidth();
        }
        return 0;
    }

    public int getTileHeight() {
        com.amap.api.maps.model.TileProvider tileProvider = this.tileProvider;
        if (tileProvider != null) {
            return tileProvider.getTileHeight();
        }
        return 0;
    }

    public void init(com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer, java.lang.String str) {
        this.glOverlayLayerRef = new java.lang.ref.WeakReference<>(iGlOverlayLayer);
        this.overlayName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object callNativeFunction(java.lang.String str, java.lang.Object[] objArr) {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (android.text.TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return null;
            }
            return iGlOverlayLayer.getNativeProperties(this.overlayName, str, objArr);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
