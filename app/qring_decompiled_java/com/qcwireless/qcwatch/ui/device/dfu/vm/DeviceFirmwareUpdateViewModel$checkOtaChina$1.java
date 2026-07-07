package com.qcwireless.qcwatch.ui.device.dfu.vm;

/* compiled from: DeviceFirmwareUpdateViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel$checkOtaChina$1", f = "DeviceFirmwareUpdateViewModel.kt", i = {}, l = {65, 68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class DeviceFirmwareUpdateViewModel$checkOtaChina$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceFirmwareUpdateViewModel$checkOtaChina$1(com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel deviceFirmwareUpdateViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel$checkOtaChina$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceFirmwareUpdateViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel$checkOtaChina$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.device.OTARepository oTARepository;
        final com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel deviceFirmwareUpdateViewModel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oTARepository = this.this$0.otaRepository;
            deviceFirmwareUpdateViewModel = this.this$0;
            java.lang.String hwVersion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion();
            java.lang.String fmVersion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion();
            this.L$0 = deviceFirmwareUpdateViewModel;
            this.label = 1;
            obj = oTARepository.checkOtaFromServerChina(hwVersion, fmVersion, this);
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
            deviceFirmwareUpdateViewModel = (com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.flow.FlowCollector flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel$checkOtaChina$1$1$1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                androidx.lifecycle.MutableLiveData mutableLiveData;
                mutableLiveData = com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.this._updateUiInfo;
                com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp isSuccess = netState.isSuccess();
                kotlin.jvm.internal.Intrinsics.checkNotNull(isSuccess);
                mutableLiveData.postValue(isSuccess);
                return kotlin.Unit.INSTANCE;
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
