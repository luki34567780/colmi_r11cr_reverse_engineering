package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface OkHttpResponseAndParsedRequestListener<T> {
    void onError(com.androidnetworking.error.ANError aNError);

    void onResponse(okhttp3.Response response, T t);
}
