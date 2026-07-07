package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface JSONObjectRequestListener {
    void onError(com.androidnetworking.error.ANError aNError);

    void onResponse(org.json.JSONObject jSONObject);
}
