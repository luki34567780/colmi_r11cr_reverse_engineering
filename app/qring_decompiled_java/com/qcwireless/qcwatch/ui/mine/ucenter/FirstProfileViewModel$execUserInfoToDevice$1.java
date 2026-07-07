package com.qcwireless.qcwatch.ui.mine.ucenter;

/* compiled from: FirstProfileViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel$execUserInfoToDevice$1", f = "FirstProfileViewModel.kt", i = {}, l = {46, 47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class FirstProfileViewModel$execUserInfoToDevice$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int $age;
    final /* synthetic */ int $boy;
    final /* synthetic */ int $height;
    final /* synthetic */ int $weight;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FirstProfileViewModel$execUserInfoToDevice$1(int i, int i2, int i3, int i4, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel$execUserInfoToDevice$1> continuation) {
        super(2, continuation);
        this.$boy = i;
        this.$age = i2;
        this.$height = i3;
        this.$weight = i4;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel$execUserInfoToDevice$1(this.$boy, this.$age, this.$height, this.$weight, continuation);
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
            obj = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().getDeviceSetting(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
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
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel$execUserInfoToDevice$1.AnonymousClass1(this.$boy, this.$age, this.$height, this.$weight), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: FirstProfileViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "emit", "(Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel$execUserInfoToDevice$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ int $age;
        final /* synthetic */ int $boy;
        final /* synthetic */ int $height;
        final /* synthetic */ int $weight;

        AnonymousClass1(int i, int i2, int i3, int i4) {
            this.$boy = i;
            this.$age = i2;
            this.$height = i3;
            this.$weight = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: emit$lambda-0, reason: not valid java name */
        public static final void m1342emit$lambda0(com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
        }

        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return emit((com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }

        public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            if (deviceSetting != null) {
                com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getWriteInstance(deviceSetting.getTimeFormat() == 0, deviceSetting.getMetricUnit(), this.$boy, this.$age, this.$height, this.$weight, 120, 90, 160), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel$execUserInfoToDevice$1$1$$ExternalSyntheticLambda0
                    @Override // com.oudmon.ble.base.communication.ICommandResponse
                    public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                        com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel$execUserInfoToDevice$1.AnonymousClass1.m1342emit$lambda0((com.oudmon.ble.base.communication.rsp.TimeFormatRsp) baseRspCmd);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
