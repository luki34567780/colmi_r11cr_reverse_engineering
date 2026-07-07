package com.androidnetworking.common;

/* loaded from: classes.dex */
public interface RequestBuilder {
    com.androidnetworking.common.RequestBuilder addHeaders(java.lang.Object obj);

    com.androidnetworking.common.RequestBuilder addHeaders(java.lang.String str, java.lang.String str2);

    com.androidnetworking.common.RequestBuilder addHeaders(java.util.Map<java.lang.String, java.lang.String> map);

    com.androidnetworking.common.RequestBuilder addPathParameter(java.lang.Object obj);

    com.androidnetworking.common.RequestBuilder addPathParameter(java.lang.String str, java.lang.String str2);

    com.androidnetworking.common.RequestBuilder addPathParameter(java.util.Map<java.lang.String, java.lang.String> map);

    com.androidnetworking.common.RequestBuilder addQueryParameter(java.lang.Object obj);

    com.androidnetworking.common.RequestBuilder addQueryParameter(java.lang.String str, java.lang.String str2);

    com.androidnetworking.common.RequestBuilder addQueryParameter(java.util.Map<java.lang.String, java.lang.String> map);

    com.androidnetworking.common.RequestBuilder doNotCacheResponse();

    com.androidnetworking.common.RequestBuilder getResponseOnlyFromNetwork();

    com.androidnetworking.common.RequestBuilder getResponseOnlyIfCached();

    com.androidnetworking.common.RequestBuilder setExecutor(java.util.concurrent.Executor executor);

    com.androidnetworking.common.RequestBuilder setMaxAgeCacheControl(int i, java.util.concurrent.TimeUnit timeUnit);

    com.androidnetworking.common.RequestBuilder setMaxStaleCacheControl(int i, java.util.concurrent.TimeUnit timeUnit);

    com.androidnetworking.common.RequestBuilder setOkHttpClient(okhttp3.OkHttpClient okHttpClient);

    com.androidnetworking.common.RequestBuilder setPriority(com.androidnetworking.common.Priority priority);

    com.androidnetworking.common.RequestBuilder setTag(java.lang.Object obj);

    com.androidnetworking.common.RequestBuilder setUserAgent(java.lang.String str);
}
