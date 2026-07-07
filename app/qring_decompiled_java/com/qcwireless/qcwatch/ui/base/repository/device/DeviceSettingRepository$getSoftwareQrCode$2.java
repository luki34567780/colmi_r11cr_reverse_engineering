package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: DeviceSettingRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/DeviceSettingEntity;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$getSoftwareQrCode$2", f = "DeviceSettingRepository.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class DeviceSettingRepository$getSoftwareQrCode$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $mac;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceSettingRepository$getSoftwareQrCode$2(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$getSoftwareQrCode$2> continuation) {
        super(2, continuation);
        this.this$0 = deviceSettingRepository;
        this.$mac = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> deviceSettingRepository$getSoftwareQrCode$2 = new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$getSoftwareQrCode$2(this.this$0, this.$mac, continuation);
        deviceSettingRepository$getSoftwareQrCode$2.L$0 = obj;
        return deviceSettingRepository$getSoftwareQrCode$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            qcDeviceSettingDao = this.this$0.qcDeviceSettingDao;
            this.label = 1;
            if (flowCollector.emit(qcDeviceSettingDao.queryByMacAndAction(this.$mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.DeviceSoftWareQrCode), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
