package com.qcwireless.qcwatch.ui.device.remind.drink;

/* compiled from: DrinkViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel$saveDrinkSetting$1", f = "DrinkViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class DrinkViewModel$saveDrinkSetting$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $mac;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting $setting;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrinkViewModel$saveDrinkSetting$1(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel drinkViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel$saveDrinkSetting$1> continuation) {
        super(2, continuation);
        this.$setting = deviceSetting;
        this.this$0 = drinkViewModel;
        this.$mac = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel$saveDrinkSetting$1(this.$setting, this.this$0, this.$mac, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
        androidx.lifecycle.MutableLiveData mutableLiveData;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.$setting.getDrinkSwitch()) {
            this.$setting.setDrinkWeek(0);
        }
        deviceSettingRepository = this.this$0.deviceSettingRepository;
        deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(this.$mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(this.$setting)));
        com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] drinkArray = this.$setting.getDrinkArray();
        int length = drinkArray.length;
        for (int i = 0; i < length; i++) {
            com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean drinkBean = drinkArray[i];
            boolean z = drinkBean.getSwitch();
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.SetDrinkAlarmReq(new com.oudmon.ble.base.communication.entity.AlarmEntity(i, z ? 1 : 0, drinkBean.getTime() / 60, drinkBean.getTime() % 60, (byte) this.$setting.getDrinkWeek())));
        }
        mutableLiveData = this.this$0._uiState;
        mutableLiveData.postValue(this.$setting);
        return kotlin.Unit.INSTANCE;
    }
}
