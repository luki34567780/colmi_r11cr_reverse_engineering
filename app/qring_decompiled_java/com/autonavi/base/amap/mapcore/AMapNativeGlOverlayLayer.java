package com.autonavi.base.amap.mapcore;

/* loaded from: classes.dex */
public class AMapNativeGlOverlayLayer extends com.autonavi.base.amap.mapcore.NativeBase {
    private com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener;
    protected long mNative = 0;
    private int mEngineId = 0;
    private java.util.concurrent.locks.ReentrantReadWriteLock readWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();

    public interface NativeFunCallListener {
        void getAMapResource(com.autonavi.base.ae.gmap.AMapAppRequestParam aMapAppRequestParam);

        com.amap.api.maps.model.BitmapDescriptor getBuildInImageData(int i);

        com.amap.api.maps.model.BitmapDescriptor getCustomImageData(com.amap.api.maps.model.ImageOptions imageOptions);

        com.amap.api.maps.model.BitmapDescriptor getInfoContents(java.lang.String str);

        com.amap.api.maps.model.BitmapDescriptor getInfoWindow(java.lang.String str);

        com.amap.api.maps.model.BitmapDescriptor getInfoWindowClick(java.lang.String str);

        long getInfoWindowUpdateOffsetTime(java.lang.String str);

        com.amap.api.maps.model.BitmapDescriptor getOverturnInfoWindow(java.lang.String str);

        com.amap.api.maps.model.BitmapDescriptor getOverturnInfoWindowClick(java.lang.String str);

        void onRedrawInfowindow();

        void onSetRunLowFrame(boolean z);
    }

    private native void nativeClear(java.lang.String[] strArr);

    private native java.lang.String nativeContain(java.lang.Object obj, int i);

    private native void nativeCreate(long j);

    private native void nativeCreateOverlay(java.lang.String str, java.lang.Object obj);

    private native void nativeDestroy();

    private native void nativeFinalize();

    private native int nativeGetCurrentParticleNum(java.lang.String str);

    private native java.lang.Object nativeGetNativeOverlayProperties(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr);

    private native void nativeRemoveOverlay(java.lang.String str);

    private native void nativeRender(int i, int i2, boolean z);

    private native void nativeSetAMapEngine(long j);

    private native void nativeUpdateOptions(java.lang.String str, java.lang.Object obj);

    @Override // com.autonavi.base.amap.mapcore.NativeBase
    public void createNative() {
    }

    @Override // com.autonavi.base.amap.mapcore.NativeBase
    protected long getNative() {
        return this.mNative;
    }

    public void setEngineId(int i) {
        this.mEngineId = i;
    }

    public int getEngineId() {
        return this.mEngineId;
    }

    public void createOverlay(final java.lang.String str, final com.amap.api.maps.model.BaseOptions baseOptions) {
        if (!isReady()) {
            storeUncallFunction(this, new java.lang.Runnable() { // from class: com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.1
                @Override // java.lang.Runnable
                public void run() {
                    com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.this.createOverlay(str, baseOptions);
                }
            }, str, baseOptions);
            return;
        }
        callAllFunction();
        try {
            this.readWriteLock.readLock().lock();
            nativeCreateOverlay(str, baseOptions);
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    @com.autonavi.base.amap.mapcore.annotations.ParameterIsClass
    public void removeOverlay(final java.lang.String str) {
        if (!isReady()) {
            storeUncallFunction(this, new java.lang.Runnable() { // from class: com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.2
                @Override // java.lang.Runnable
                public void run() {
                    com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.this.removeOverlay(str);
                }
            }, str);
            return;
        }
        callAllFunction();
        try {
            this.readWriteLock.readLock().lock();
            nativeRemoveOverlay(str);
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    @com.autonavi.base.amap.mapcore.annotations.ParameterIsClass
    public void clear(final java.lang.String... strArr) {
        if (!isReady()) {
            storeUncallFunctionArray(this, new java.lang.Runnable() { // from class: com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.3
                @Override // java.lang.Runnable
                public void run() {
                    com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.this.clear(strArr);
                }
            }, strArr);
            return;
        }
        callAllFunction();
        try {
            this.readWriteLock.readLock().lock();
            nativeClear(strArr);
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    @com.autonavi.base.amap.mapcore.annotations.ParameterIsClass
    public void updateOptions(final java.lang.String str, final com.amap.api.maps.model.BaseOptions baseOptions) {
        try {
            if (!isReady()) {
                storeUncallFunction(this, new java.lang.Runnable() { // from class: com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.this.updateOptions(str, baseOptions);
                        com.amap.api.maps.model.BaseOptions baseOptions2 = baseOptions;
                        if (baseOptions2 != null) {
                            baseOptions2.resetUpdateFlags();
                        }
                        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.this.setRunLowFrame(false);
                    }
                }, str, baseOptions);
                return;
            }
            callAllFunction();
            try {
                this.readWriteLock.readLock().lock();
                nativeUpdateOptions(str, baseOptions);
                if (baseOptions != null) {
                    baseOptions.resetUpdateFlags();
                }
            } finally {
                this.readWriteLock.readLock().unlock();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            android.util.Log.d("amapApi", "AMapNativeGlOverlayLayer updateOptions error:" + th.getMessage());
        }
    }

    public java.lang.String contain(com.amap.api.maps.model.LatLng latLng, int i) {
        if (!isReady()) {
            return "";
        }
        callAllFunction();
        try {
            this.readWriteLock.readLock().lock();
            return nativeContain(latLng, i);
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    public int getCurrentParticleNum(java.lang.String str) {
        if (!isReady()) {
            return 0;
        }
        callAllFunction();
        try {
            this.readWriteLock.readLock().lock();
            return nativeGetCurrentParticleNum(str);
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    public java.lang.Object getNativeProperties(final java.lang.String str, final java.lang.String str2, final java.lang.Object[] objArr) {
        if (!isReady() || str == null) {
            storeUncallFunction(this, new java.lang.Runnable() { // from class: com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.5
                @Override // java.lang.Runnable
                public void run() {
                    com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.this.getNativeProperties(str, str2, objArr);
                }
            }, str, str2, objArr);
            return null;
        }
        try {
            this.readWriteLock.readLock().lock();
            if (this.destroy) {
                return null;
            }
            return nativeGetNativeOverlayProperties(str, str2, objArr);
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    public void render(int i, int i2, boolean z) {
        callAllFunction();
        try {
            this.readWriteLock.readLock().lock();
            nativeRender(i, i2, z);
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    public void setNativeFunCallListener(com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener) {
        this.nativeFunCallListener = nativeFunCallListener;
    }

    @Override // com.autonavi.base.amap.mapcore.NativeBase
    public void destroy() {
        try {
            super.destroy();
            this.readWriteLock.writeLock().lock();
            nativeDestroy();
        } finally {
            this.readWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRunLowFrame(boolean z) {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener != null) {
            nativeFunCallListener.onSetRunLowFrame(z);
        }
    }

    private void redrawInfoWindow() {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener != null) {
            nativeFunCallListener.onRedrawInfowindow();
        }
    }

    private com.amap.api.maps.model.BitmapDescriptor getInfoWindow(java.lang.String str) {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener != null) {
            return nativeFunCallListener.getInfoWindow(str);
        }
        return null;
    }

    private com.amap.api.maps.model.BitmapDescriptor getInfoContents(java.lang.String str) {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener != null) {
            return nativeFunCallListener.getInfoContents(str);
        }
        return null;
    }

    private long getInfoWindowUpdateOffsetTime(java.lang.String str) {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener != null) {
            return nativeFunCallListener.getInfoWindowUpdateOffsetTime(str);
        }
        return 0L;
    }

    private com.amap.api.maps.model.BitmapDescriptor getInfoWindowClick(java.lang.String str) {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener != null) {
            return nativeFunCallListener.getInfoWindowClick(str);
        }
        return null;
    }

    private com.amap.api.maps.model.BitmapDescriptor getOverturnInfoWindow(java.lang.String str) {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener != null) {
            return nativeFunCallListener.getOverturnInfoWindow(str);
        }
        return null;
    }

    private com.amap.api.maps.model.BitmapDescriptor getOverturnInfoWindowClick(java.lang.String str) {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener != null) {
            return nativeFunCallListener.getOverturnInfoWindowClick(str);
        }
        return null;
    }

    private com.amap.api.maps.model.BitmapDescriptor getBuildInImageData(int i) {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener != null) {
            return nativeFunCallListener.getBuildInImageData(i);
        }
        return null;
    }

    private com.amap.api.maps.model.BitmapDescriptor getImagedData(com.amap.api.maps.model.ImageOptions imageOptions) {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener != null) {
            return nativeFunCallListener.getCustomImageData(imageOptions);
        }
        return null;
    }

    private void getAMapResource(com.autonavi.base.ae.gmap.AMapAppRequestParam aMapAppRequestParam) {
        com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener = this.nativeFunCallListener;
        if (nativeFunCallListener == null) {
            return;
        }
        nativeFunCallListener.getAMapResource(aMapAppRequestParam);
    }

    public void setAMapEngine(long j) {
        try {
            this.readWriteLock.readLock().lock();
            nativeSetAMapEngine(j);
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    public void createNative(long j) {
        try {
            if (this.mNative == 0) {
                try {
                    java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = this.readWriteLock;
                    if (reentrantReadWriteLock != null) {
                        reentrantReadWriteLock.writeLock().lock();
                    }
                    nativeCreate(j);
                    java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2 = this.readWriteLock;
                    if (reentrantReadWriteLock2 != null) {
                        reentrantReadWriteLock2.writeLock().unlock();
                    }
                } catch (java.lang.Throwable unused) {
                    java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock3 = this.readWriteLock;
                    if (reentrantReadWriteLock3 != null) {
                        reentrantReadWriteLock3.writeLock().unlock();
                    }
                }
            }
        } catch (java.lang.UnsatisfiedLinkError e) {
            getClass().getSimpleName();
            e.toString();
        }
    }

    @Override // com.autonavi.base.amap.mapcore.NativeBase
    protected void finalizeNative() {
        nativeFinalize();
    }
}
