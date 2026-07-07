package com.autonavi.base.ae.gmap.maploader;

/* loaded from: classes.dex */
public class ProcessingTile {
    private static final com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool<com.autonavi.base.ae.gmap.maploader.ProcessingTile> M_POOL = new com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool<>(30);
    public long mCreateTime = 0;
    public java.lang.String mKeyName;

    public static com.autonavi.base.ae.gmap.maploader.ProcessingTile obtain(java.lang.String str) {
        com.autonavi.base.ae.gmap.maploader.ProcessingTile acquire = M_POOL.acquire();
        if (acquire != null) {
            acquire.setParams(str);
            return acquire;
        }
        return new com.autonavi.base.ae.gmap.maploader.ProcessingTile(str);
    }

    public void recycle() {
        this.mKeyName = null;
        this.mCreateTime = 0L;
        M_POOL.release(this);
    }

    public ProcessingTile(java.lang.String str) {
        setParams(str);
    }

    private void setParams(java.lang.String str) {
        this.mKeyName = str;
        this.mCreateTime = java.lang.System.currentTimeMillis() / 1000;
    }
}
