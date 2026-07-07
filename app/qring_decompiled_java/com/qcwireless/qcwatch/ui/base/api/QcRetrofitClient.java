package com.qcwireless.qcwatch.ui.base.api;

/* compiled from: QcRetrofitClient.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/api/QcRetrofitClient;", "Lcom/qcwireless/qcwatch/ui/base/api/BaseRetrofitClient;", "()V", "handleBuilder", "", "builder", "Lokhttp3/OkHttpClient$Builder;", "serverSwitching", "Lcom/qcwireless/qcwatch/ui/base/api/QcService;", "hw", "", "service", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QcRetrofitClient extends com.qcwireless.qcwatch.ui.base.api.BaseRetrofitClient {
    public static final com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient INSTANCE = new com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient();

    private QcRetrofitClient() {
    }

    public final com.qcwireless.qcwatch.ui.base.api.QcService service() {
        if (com.qcwireless.qc_utils.date.LanguageUtil.isChina()) {
            if (com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getChinaServer()) {
                return serverSwitching(false);
            }
            return serverSwitching(true);
        }
        if (com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getPingHwServer()) {
            return serverSwitching(true);
        }
        return serverSwitching(false);
    }

    private final com.qcwireless.qcwatch.ui.base.api.QcService serverSwitching(boolean hw) {
        if (hw) {
            return (com.qcwireless.qcwatch.ui.base.api.QcService) getService(com.qcwireless.qcwatch.ui.base.api.QcService.class, "https://api1.qcwxkjvip.com/qcwx/");
        }
        return (com.qcwireless.qcwatch.ui.base.api.QcService) getService(com.qcwireless.qcwatch.ui.base.api.QcService.class, "https://china.qcwxwire.com/qcwx/");
    }

    @Override // com.qcwireless.qcwatch.ui.base.api.BaseRetrofitClient
    protected void handleBuilder(okhttp3.OkHttpClient.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        try {
            builder.addInterceptor(new okhttp3.Interceptor() { // from class: com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient$handleBuilder$$inlined$-addInterceptor$1
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
