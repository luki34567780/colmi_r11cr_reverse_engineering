package com.yalantis.ucrop.callback;

/* loaded from: classes3.dex */
public interface BitmapCropCallback {
    void onBitmapCropped(android.net.Uri uri, int i, int i2, int i3, int i4);

    void onCropFailure(java.lang.Throwable th);
}
