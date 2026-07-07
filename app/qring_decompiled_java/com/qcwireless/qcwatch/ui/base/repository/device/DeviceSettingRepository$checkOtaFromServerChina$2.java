package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: DeviceSettingRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/FirmwareOtaResp;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2", f = "DeviceSettingRepository.kt", i = {1, 2}, l = {352, 360, 369, com.haibin.calendarview.BuildConfig.VERSION_CODE}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class DeviceSettingRepository$checkOtaFromServerChina$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $hardwareVersion;
    final /* synthetic */ java.lang.String $romVersion;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceSettingRepository$checkOtaFromServerChina$2(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2> continuation) {
        super(2, continuation);
        this.$hardwareVersion = str;
        this.$romVersion = str2;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> deviceSettingRepository$checkOtaFromServerChina$2 = new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2(this.$hardwareVersion, this.$romVersion, continuation);
        deviceSettingRepository$checkOtaFromServerChina$2.L$0 = obj;
        return deviceSettingRepository$checkOtaFromServerChina$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: DeviceSettingRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "otaResp", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/FirmwareOtaResp;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2$1", f = "DeviceSettingRepository.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp>> $$this$flow;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2.AnonymousClass1> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp firmwareOtaResp, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2.AnonymousClass1 anonymousClass1 = new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2.AnonymousClass1(this.$$this$flow, continuation);
            anonymousClass1.L$0 = firmwareOtaResp;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp firmwareOtaResp = (com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp) this.L$0;
                this.label = 1;
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, firmwareOtaResp, 0, false, 9, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* compiled from: DeviceSettingRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "errorCode", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2$2", f = "DeviceSettingRepository.kt", i = {}, l = {372}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2.AnonymousClass2 anonymousClass2 = new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$checkOtaFromServerChina$2.AnonymousClass2(this.$$this$flow, continuation);
            anonymousClass2.I$0 = i;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                int i2 = this.I$0;
                this.label = 1;
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, null, i2, false, 11, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
