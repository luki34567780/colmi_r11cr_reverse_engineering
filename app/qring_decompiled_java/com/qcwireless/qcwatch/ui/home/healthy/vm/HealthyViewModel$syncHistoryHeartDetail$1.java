package com.qcwireless.qcwatch.ui.home.healthy.vm;

/* compiled from: HealthyViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryHeartDetail$1", f = "HealthyViewModel.kt", i = {}, l = {447}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class HealthyViewModel$syncHistoryHeartDetail$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthyViewModel$syncHistoryHeartDetail$1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryHeartDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = healthyViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryHeartDetail$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            heartRateDetailRepository = this.this$0.heartDetailRepository;
            final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel = this.this$0;
            java.lang.String deviceAddress = com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().getDeviceAddress();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceAddress, "getInstance().deviceAddress");
            com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp> baseDeviceResult = new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryHeartDetail$1$1$1
                @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp t) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                    com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSync(false);
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(8);
                    org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DataSyncEvent(false));
                    org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.ui.base.bean.event.HealthItemRefreshEvent());
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "历史同步结束");
                    org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.LoginSuccessEvent());
                    if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().saveSyncHistoryDataInfo(new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                    }
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastTenMinSyncTime(600 + new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                }
            };
            this.label = 1;
            if (heartRateDetailRepository.syncHistoryHeartDetail(deviceAddress, baseDeviceResult, this) == coroutine_suspended) {
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
