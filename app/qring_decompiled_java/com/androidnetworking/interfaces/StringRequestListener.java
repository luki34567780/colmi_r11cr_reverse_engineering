package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface StringRequestListener {
    void onError(com.androidnetworking.error.ANError aNError);

    void onResponse(java.lang.String str);
}
