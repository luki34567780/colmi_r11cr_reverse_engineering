package com.qcwireless.qcwatch.ui.device.disturb;

/* compiled from: DisturbViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel$saveDisturbSwitch$1", f = "DisturbViewModel.kt", i = {}, l = {57, 57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class DisturbViewModel$saveDisturbSwitch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI $disturb;
    final /* synthetic */ java.lang.String $mac;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisturbViewModel$saveDisturbSwitch$1(com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel disturbViewModel, java.lang.String str, com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel$saveDisturbSwitch$1> continuation) {
        super(2, continuation);
        this.this$0 = disturbViewModel;
        this.$mac = str;
        this.$disturb = disturbUI;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel$saveDisturbSwitch$1(this.this$0, this.$mac, this.$disturb, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* compiled from: DisturbViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "emit", "(Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel$saveDisturbSwitch$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI $disturb;
        final /* synthetic */ java.lang.String $mac;
        final /* synthetic */ com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel this$0;

        AnonymousClass1(com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel disturbViewModel, java.lang.String str, com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI) {
            this.this$0 = disturbViewModel;
            this.$mac = str;
            this.$disturb = disturbUI;
        }

        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return emit((com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }

        public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
            androidx.lifecycle.MutableLiveData mutableLiveData;
            if (deviceSetting != null) {
                com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI = this.$disturb;
                deviceSetting.setDisturbSwitch(disturbUI.getSwitch());
                deviceSetting.setDisturbStart(disturbUI.getStart());
                deviceSetting.setDisturbEnd(disturbUI.getEnd());
            }
            if (deviceSetting != null) {
                deviceSettingRepository = this.this$0.deviceSettingRepository;
                deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(this.$mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(deviceSetting)));
                com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.DndReq.getWriteInstance(deviceSetting.getDisturbSwitch(), new com.oudmon.ble.base.communication.entity.StartEndTimeEntity(deviceSetting.getDisturbStart() / 60, deviceSetting.getDisturbStart() % 60, deviceSetting.getDisturbEnd() / 60, deviceSetting.getDisturbEnd() % 60)), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel$saveDisturbSwitch$1$1$$ExternalSyntheticLambda0
                    @Override // com.oudmon.ble.base.communication.ICommandResponse
                    public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                        com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel$saveDisturbSwitch$1.AnonymousClass1.m718emit$lambda1((com.oudmon.ble.base.communication.rsp.DndRsp) baseRspCmd);
                    }
                });
                mutableLiveData = this.this$0._uiState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI(deviceSetting.getDisturbSwitch(), deviceSetting.getDisturbStart(), deviceSetting.getDisturbEnd(), deviceSetting.getDisturbManualSwitch()));
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: emit$lambda-1, reason: not valid java name */
        public static final void m718emit$lambda1(com.oudmon.ble.base.communication.rsp.DndRsp dndRsp) {
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.device.DeviceFragment.class));
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            deviceSettingRepository = this.this$0.deviceSettingRepository;
            this.label = 1;
            obj = deviceSettingRepository.getDeviceSetting(this.$mac, (kotlin.coroutines.Continuation) this);
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
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel$saveDisturbSwitch$1.AnonymousClass1(this.this$0, this.$mac, this.$disturb), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
