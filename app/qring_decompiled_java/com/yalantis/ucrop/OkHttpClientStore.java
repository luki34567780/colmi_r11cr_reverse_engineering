package com.yalantis.ucrop;

/* loaded from: classes3.dex */
public class OkHttpClientStore {
    public static final com.yalantis.ucrop.OkHttpClientStore INSTANCE = new com.yalantis.ucrop.OkHttpClientStore();
    private okhttp3.OkHttpClient client;

    private OkHttpClientStore() {
    }

    public okhttp3.OkHttpClient getClient() {
        if (this.client == null) {
            this.client = new okhttp3.OkHttpClient();
        }
        return this.client;
    }

    void setClient(okhttp3.OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }
}
