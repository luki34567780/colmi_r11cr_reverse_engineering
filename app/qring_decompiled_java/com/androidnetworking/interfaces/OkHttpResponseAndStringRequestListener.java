package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface OkHttpResponseAndStringRequestListener {
    void onError(com.androidnetworking.error.ANError aNError);

    void onResponse(okhttp3.Response response, java.lang.String str);
}
