package com.autonavi.base.ae.gmap;

/* loaded from: classes.dex */
public class ResourceCallback {
    private long instance;

    private static native void nativeCallCancel();

    private static native void nativeCallFailed(long j, java.lang.String str);

    private static native void nativeCallSuccess(long j, com.autonavi.base.ae.gmap.AMapAppResourceItem aMapAppResourceItem);

    public ResourceCallback() {
        this.instance = 0L;
    }

    public ResourceCallback(long j) {
        this.instance = 0L;
        this.instance = j;
    }

    public long getInstance() {
        return this.instance;
    }

    public void setInstance(long j) {
        this.instance = j;
    }

    public void callSuccess(com.autonavi.base.ae.gmap.AMapAppResourceItem aMapAppResourceItem) {
        nativeCallSuccess(this.instance, aMapAppResourceItem);
    }

    public void callFailed(java.lang.String str) {
        nativeCallFailed(this.instance, str);
    }

    public void callCancel() {
        nativeCallCancel();
    }
}
