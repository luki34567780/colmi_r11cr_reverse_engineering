package com.qcwireless.qcwatch.ui.device.vm;

/* compiled from: DeviceSettingViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$execGesture$2", f = "DeviceSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class DeviceSettingViewModel$execGesture$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting $setting;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceSettingViewModel$execGesture$2(com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingViewModel, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$execGesture$2> continuation) {
        super(2, continuation);
        this.this$0 = deviceSettingViewModel;
        this.$setting = deviceSetting;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$execGesture$2(this.this$0, this.$setting, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        deviceSettingRepository = this.this$0.deviceSettingRepository;
        deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(this.$setting)));
        return kotlin.Unit.INSTANCE;
    }
}
