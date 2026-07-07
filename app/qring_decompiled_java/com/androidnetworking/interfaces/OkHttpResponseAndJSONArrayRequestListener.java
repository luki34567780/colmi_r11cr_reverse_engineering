package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface OkHttpResponseAndJSONArrayRequestListener {
    void onError(com.androidnetworking.error.ANError aNError);

    void onResponse(okhttp3.Response response, org.json.JSONArray jSONArray);
}
