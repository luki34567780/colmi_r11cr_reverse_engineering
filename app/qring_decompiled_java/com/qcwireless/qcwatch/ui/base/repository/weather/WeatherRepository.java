package com.qcwireless.qcwatch.ui.base.repository.weather;

/* compiled from: WeatherRepository.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/weather/WeatherRepository;", "", "()V", "getWeatherFromServer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "", "Lcom/qcwireless/qcwatch/ui/base/bean/response/weather/WeatherResp;", "hw", "", "request", "Lcom/qcwireless/qcwatch/ui/base/bean/request/weather/WeatherRequest;", "(ZLcom/qcwireless/qcwatch/ui/base/bean/request/weather/WeatherRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WeatherRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository m572invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository();
        }
    });

    public final java.lang.Object getWeatherFromServer(boolean z, com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest weatherRequest, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp>>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository$getWeatherFromServer$2(z, weatherRequest, null)), new com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository$getWeatherFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository$getWeatherFromServer$4(null));
    }

    /* compiled from: WeatherRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/weather/WeatherRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/weather/WeatherRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/weather/WeatherRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository) com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository.getInstance$delegate.getValue();
        }
    }
}
