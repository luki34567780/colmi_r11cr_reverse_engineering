package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface ParsedRequestListener<T> {
    void onError(com.androidnetworking.error.ANError aNError);

    void onResponse(T t);
}
