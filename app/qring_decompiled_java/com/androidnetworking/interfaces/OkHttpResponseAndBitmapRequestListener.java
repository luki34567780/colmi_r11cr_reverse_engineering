package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface OkHttpResponseAndBitmapRequestListener {
    void onError(com.androidnetworking.error.ANError aNError);

    void onResponse(okhttp3.Response response, android.graphics.Bitmap bitmap);
}
