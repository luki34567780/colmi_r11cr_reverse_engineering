package com.qcwireless.qcwatch;

/* compiled from: QCApplication.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.QCApplication$mLocationListener$1$1", f = "QCApplication.kt", i = {}, l = {468, 469}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class QCApplication$mLocationListener$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest $bean;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.QCApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QCApplication$mLocationListener$1$1(com.qcwireless.qcwatch.QCApplication qCApplication, com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest weatherRequest, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.QCApplication$mLocationListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = qCApplication;
        this.$bean = weatherRequest;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.QCApplication$mLocationListener$1$1(this.this$0, this.$bean, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository.INSTANCE.getGetInstance().getWeatherFromServer(this.this$0.getPingHwServer(), this.$bean, (kotlin.coroutines.Continuation) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.qcwireless.qcwatch.QCApplication qCApplication = this.this$0;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.QCApplication$mLocationListener$1$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp>>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                if (netState.getRetCode() == 0) {
                    try {
                        com.qcwireless.qcwatch.base.pref.UserConfig companion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance();
                        java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp> isSuccess = netState.isSuccess();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(isSuccess);
                        companion.setWeatherInfo(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(isSuccess));
                        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGpsLocationTime(new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + 21600);
                        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                        com.qcwireless.qcwatch.QCApplication.this.weatherToDevice(netState.isSuccess());
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGpsLocationTime(0L);
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                    java.lang.String weatherInfo = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWeatherInfo();
                    if (weatherInfo.length() > 0) {
                        com.qcwireless.qcwatch.base.utils.MoshiUtils moshiUtils = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE;
                        java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.List.class, new java.lang.reflect.Type[]{com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp.class});
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, T::class.java)");
                        java.util.ArrayList arrayList = (java.util.List) moshiUtils.fromJson(weatherInfo, newParameterizedType);
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        com.qcwireless.qcwatch.QCApplication.this.weatherToDevice(arrayList);
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
