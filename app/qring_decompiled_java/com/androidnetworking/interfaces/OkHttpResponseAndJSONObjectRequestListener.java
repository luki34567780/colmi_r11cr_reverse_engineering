package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface OkHttpResponseAndJSONObjectRequestListener {
    void onError(com.androidnetworking.error.ANError aNError);

    void onResponse(okhttp3.Response response, org.json.JSONObject jSONObject);
}
