package com.qcwireless.qcwatch.ui.base.api;

/* compiled from: BaseRetrofitClient.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H$R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/api/BaseRetrofitClient;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "getService", "S", "serviceClass", "Ljava/lang/Class;", "baseUrl", "", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "handleBuilder", "", "builder", "Lokhttp3/OkHttpClient$Builder;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseRetrofitClient {
    private static final int TIME_OUT = 120;

    protected abstract void handleBuilder(okhttp3.OkHttpClient.Builder builder);

    private final okhttp3.OkHttpClient getClient() {
        okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();
        okhttp3.Interceptor httpLoggingInterceptor = new okhttp3.logging.HttpLoggingInterceptor((okhttp3.logging.HttpLoggingInterceptor.Logger) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getIsDebug()) {
            httpLoggingInterceptor.level(okhttp3.logging.HttpLoggingInterceptor.Level.BODY);
        } else {
            httpLoggingInterceptor.level(okhttp3.logging.HttpLoggingInterceptor.Level.NONE);
        }
        builder.addInterceptor(httpLoggingInterceptor).connectTimeout(120L, java.util.concurrent.TimeUnit.SECONDS).writeTimeout(120L, java.util.concurrent.TimeUnit.SECONDS).readTimeout(120L, java.util.concurrent.TimeUnit.SECONDS).dns(new com.qcwireless.qcwatch.ui.base.api.XDns(120L));
        handleBuilder(builder);
        return builder.build();
    }

    public final <S> S getService(java.lang.Class<S> serviceClass, java.lang.String baseUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        return (S) new retrofit2.Retrofit.Builder().client(getClient()).addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create(new com.google.gson.GsonBuilder().serializeNulls().create())).addCallAdapterFactory(retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory.create()).baseUrl(baseUrl).build().create(serviceClass);
    }
}
