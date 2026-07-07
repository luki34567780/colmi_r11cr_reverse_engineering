package com.king.zxing;

/* loaded from: /tmp/dex/classes2.dex */
public interface ICamera {
    androidx.camera.core.Camera getCamera();

    void release();

    void startCamera();

    void stopCamera();
}
