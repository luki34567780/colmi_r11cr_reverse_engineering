package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface JSONArrayRequestListener {
    void onError(com.androidnetworking.error.ANError aNError);

    void onResponse(org.json.JSONArray jSONArray);
}
