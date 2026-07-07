package com.autonavi.amap.mapcore;

/* loaded from: classes.dex */
public class IPoint extends android.graphics.Point implements java.lang.Cloneable {
    private static final com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool<com.autonavi.amap.mapcore.IPoint> M_POOL = new com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool<>(32);

    public static com.autonavi.amap.mapcore.IPoint obtain() {
        com.autonavi.amap.mapcore.IPoint acquire = M_POOL.acquire();
        if (acquire == null) {
            return new com.autonavi.amap.mapcore.IPoint();
        }
        acquire.set(0, 0);
        return acquire;
    }

    public static com.autonavi.amap.mapcore.IPoint obtain(int i, int i2) {
        com.autonavi.amap.mapcore.IPoint acquire = M_POOL.acquire();
        if (acquire == null) {
            return new com.autonavi.amap.mapcore.IPoint(i, i2);
        }
        acquire.set(i, i2);
        return acquire;
    }

    public void recycle() {
        M_POOL.release(this);
    }

    public IPoint() {
    }

    public IPoint(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public java.lang.Object clone() {
        try {
            return (com.autonavi.amap.mapcore.IPoint) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public double distance(com.autonavi.amap.mapcore.IPoint iPoint) {
        return java.lang.Math.sqrt(java.lang.Math.pow(iPoint.x - this.x, 2.0d) + java.lang.Math.pow(iPoint.y - this.y, 2.0d));
    }
}
