package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface BitmapRequestListener {
    void onError(com.androidnetworking.error.ANError aNError);

    void onResponse(android.graphics.Bitmap bitmap);
}
