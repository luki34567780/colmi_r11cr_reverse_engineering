package com.qcwireless.qcwatch.ui.home.healthy.vm;

/* compiled from: HealthyViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryPressure$1", f = "HealthyViewModel.kt", i = {}, l = {434}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class HealthyViewModel$syncHistoryPressure$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthyViewModel$syncHistoryPressure$1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryPressure$1> continuation) {
        super(2, continuation);
        this.this$0 = healthyViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryPressure$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pressureRepository = this.this$0.pressureRepository;
            java.lang.String deviceAddress = com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().getDeviceAddress();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceAddress, "getInstance().deviceAddress");
            final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel = this.this$0;
            this.label = 1;
            if (pressureRepository.syncHistoryPressureDetail(deviceAddress, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.PressureRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryPressure$1.1
                @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                public void result(int errorCode, com.oudmon.ble.base.communication.rsp.PressureRsp t) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(21);
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncHistoryHeartDetail();
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.sendEmptyMessageDelayed(8, 3000L);
                }
            }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
