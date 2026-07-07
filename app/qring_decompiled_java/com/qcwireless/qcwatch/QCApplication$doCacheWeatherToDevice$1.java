package com.qcwireless.qcwatch;

/* compiled from: QCApplication.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1", f = "QCApplication.kt", i = {}, l = {519, 520}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class QCApplication$doCacheWeatherToDevice$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.QCApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QCApplication$doCacheWeatherToDevice$1(com.qcwireless.qcwatch.QCApplication qCApplication, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1> continuation) {
        super(2, continuation);
        this.this$0 = qCApplication;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1(this.this$0, continuation);
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
            obj = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().getDeviceLocation(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
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
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1.AnonymousClass1(this.this$0), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: QCApplication.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/qcwireless/qcwatch/ui/base/bean/weather/MyLocationBean;", "emit", "(Lcom/qcwireless/qcwatch/ui/base/bean/weather/MyLocationBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.qcwireless.qcwatch.QCApplication this$0;

        AnonymousClass1(com.qcwireless.qcwatch.QCApplication qCApplication) {
            this.this$0 = qCApplication;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1$1$emit$1
                if (r0 == 0) goto L14
                r0 = r9
                com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1$1$emit$1 r0 = (com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 - r2
                r0.label = r9
                goto L19
            L14:
                com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1$1$emit$1 r0 = new com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1$1$emit$1
                r0.<init>(r7, r9)
            L19:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2e
                kotlin.ResultKt.throwOnFailure(r9)
                goto La0
            L2e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L36:
                java.lang.Object r8 = r0.L$0
                com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1$1 r8 = (com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1.AnonymousClass1) r8
                kotlin.ResultKt.throwOnFailure(r9)
                goto L89
            L3e:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
                float r9 = r8.getLatitude()
                r2 = 0
                r5 = 0
                int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r9 != 0) goto L50
                r9 = 1
                goto L51
            L50:
                r9 = 0
            L51:
                if (r9 != 0) goto La3
                float r9 = r8.getLongitude()
                int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r9 != 0) goto L5c
                r2 = 1
            L5c:
                if (r2 != 0) goto La3
                com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest r9 = new com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest
                float r2 = r8.getLongitude()
                float r5 = r8.getLatitude()
                java.lang.String r8 = r8.getCity()
                java.lang.String r6 = "en"
                r9.<init>(r2, r5, r6, r8)
                com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository$Companion r8 = com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository.INSTANCE
                com.qcwireless.qcwatch.ui.base.repository.weather.WeatherRepository r8 = r8.getGetInstance()
                com.qcwireless.qcwatch.QCApplication r2 = r7.this$0
                boolean r2 = r2.getPingHwServer()
                r0.L$0 = r7
                r0.label = r4
                java.lang.Object r9 = r8.getWeatherFromServer(r2, r9, r0)
                if (r9 != r1) goto L88
                return r1
            L88:
                r8 = r7
            L89:
                kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
                com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1$1$1 r2 = new com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1$1$1
                com.qcwireless.qcwatch.QCApplication r8 = r8.this$0
                r2.<init>()
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                r8 = 0
                r0.L$0 = r8
                r0.label = r3
                java.lang.Object r8 = r9.collect(r2, r0)
                if (r8 != r1) goto La0
                return r1
            La0:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            La3:
                com.qcwireless.qcwatch.base.pref.UserConfig$Companion r8 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
                com.qcwireless.qcwatch.base.pref.UserConfig r8 = r8.getInstance()
                r0 = 0
                r8.setGpsLocationTime(r0)
                com.qcwireless.qcwatch.base.pref.UserConfig$Companion r8 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
                com.qcwireless.qcwatch.base.pref.UserConfig r8 = r8.getInstance()
                r8.save()
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.QCApplication$doCacheWeatherToDevice$1.AnonymousClass1.emit(com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return emit((com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }
    }
}
