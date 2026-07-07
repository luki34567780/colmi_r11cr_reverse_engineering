package com.yalantis.ucrop.callback;

/* loaded from: classes3.dex */
public interface BitmapLoadCallback {
    void onBitmapLoaded(android.graphics.Bitmap bitmap, com.yalantis.ucrop.model.ExifInfo exifInfo, android.net.Uri uri, android.net.Uri uri2);

    void onFailure(java.lang.Exception exc);
}
