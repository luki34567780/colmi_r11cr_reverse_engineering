package com.qcwireless.qcwatch.ui.base.api;

/* compiled from: QcRetrofitChinaClient.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/api/QcRetrofitChinaClient;", "Lcom/qcwireless/qcwatch/ui/base/api/BaseRetrofitClient;", "()V", "service", "Lcom/qcwireless/qcwatch/ui/base/api/QcService;", "getService", "()Lcom/qcwireless/qcwatch/ui/base/api/QcService;", "service$delegate", "Lkotlin/Lazy;", "handleBuilder", "", "builder", "Lokhttp3/OkHttpClient$Builder;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QcRetrofitChinaClient extends com.qcwireless.qcwatch.ui.base.api.BaseRetrofitClient {
    public static final com.qcwireless.qcwatch.ui.base.api.QcRetrofitChinaClient INSTANCE = new com.qcwireless.qcwatch.ui.base.api.QcRetrofitChinaClient();

    /* renamed from: service$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy service = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.api.QcService>() { // from class: com.qcwireless.qcwatch.ui.base.api.QcRetrofitChinaClient$service$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.api.QcService m509invoke() {
            return (com.qcwireless.qcwatch.ui.base.api.QcService) com.qcwireless.qcwatch.ui.base.api.QcRetrofitChinaClient.INSTANCE.getService(com.qcwireless.qcwatch.ui.base.api.QcService.class, "https://china.qcwxwire.com/qcwx/");
        }
    });

    private QcRetrofitChinaClient() {
    }

    public final com.qcwireless.qcwatch.ui.base.api.QcService getService() {
        return (com.qcwireless.qcwatch.ui.base.api.QcService) service.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.api.BaseRetrofitClient
    protected void handleBuilder(okhttp3.OkHttpClient.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        try {
            builder.addInterceptor(new okhttp3.Interceptor() { // from class: com.qcwireless.qcwatch.ui.base.api.QcRetrofitChinaClient$handleBuilder$$inlined$-addInterceptor$1
                public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
                    return chain.proceed(chain.request().newBuilder().addHeader("token", com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUserToken()).build());
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
