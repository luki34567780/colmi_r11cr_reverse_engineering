package com.qcwireless.qcwatch.ui.device.remind.longsit;

/* compiled from: LongSitViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel$saveLongSitSetting$1", f = "LongSitViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class LongSitViewModel$saveLongSitSetting$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $mac;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting $setting;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongSitViewModel$saveLongSitSetting$1(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel longSitViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel$saveLongSitSetting$1> continuation) {
        super(2, continuation);
        this.$setting = deviceSetting;
        this.this$0 = longSitViewModel;
        this.$mac = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
    public static final void m891invokeSuspend$lambda0(com.oudmon.ble.base.communication.rsp.SimpleStatusRsp simpleStatusRsp) {
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel$saveLongSitSetting$1(this.$setting, this.this$0, this.$mac, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
        com.oudmon.ble.base.communication.req.SetSitLongReq sedentaryInput;
        androidx.lifecycle.MutableLiveData mutableLiveData;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.$setting.getLongSitSwitch()) {
            this.$setting.setLongSitWeek(0);
        }
        deviceSettingRepository = this.this$0.deviceSettingRepository;
        deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(this.$mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(this.$setting)));
        sedentaryInput = this.this$0.getSedentaryInput(this.$setting.getLongSitStart(), this.$setting.getLongSitEnd(), this.$setting.getLongSitDuring(), this.$setting.getLongSitWeek());
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(sedentaryInput, new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel$saveLongSitSetting$1$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel$saveLongSitSetting$1.m891invokeSuspend$lambda0((com.oudmon.ble.base.communication.rsp.SimpleStatusRsp) baseRspCmd);
            }
        });
        mutableLiveData = this.this$0._uiState;
        mutableLiveData.postValue(this.$setting);
        return kotlin.Unit.INSTANCE;
    }
}
