package com.qcwireless.qcwatch.ui.home.healthy.vm;

/* compiled from: HealthyViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistorySleepDetail$1", f = "HealthyViewModel.kt", i = {}, l = {417}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class HealthyViewModel$syncHistorySleepDetail$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthyViewModel$syncHistorySleepDetail$1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistorySleepDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = healthyViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistorySleepDetail$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.this$0.handler.sendEmptyMessageDelayed(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.Type_Sync_TimeOut, 3000L);
            sleepDetailRepository = this.this$0.sleepDetailRepository;
            final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel = this.this$0;
            java.lang.String deviceName = com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().getDeviceName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceName, "getInstance().deviceName");
            java.lang.String deviceAddress = com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().getDeviceAddress();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceAddress, "getInstance().deviceAddress");
            com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp> baseDeviceResult = new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistorySleepDetail$1$1$1
                @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp t) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(7);
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.Type_Sync_TimeOut);
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-------------syncHistorySleepDetail");
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncHistoryPressure();
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.sendEmptyMessageDelayed(21, 3000L);
                }
            };
            this.label = 1;
            if (sleepDetailRepository.syncSleepDetail(deviceName, deviceAddress, baseDeviceResult, this) == coroutine_suspended) {
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
