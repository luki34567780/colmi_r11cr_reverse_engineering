package com.qcwireless.qcwatch.ui.device.more;

/* compiled from: MoreSettingViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel$initData$1", f = "MoreSettingViewModel.kt", i = {}, l = {66, 66}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MoreSettingViewModel$initData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $mac;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoreSettingViewModel$initData$1(com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel moreSettingViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel$initData$1> continuation) {
        super(2, continuation);
        this.this$0 = moreSettingViewModel;
        this.$mac = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel$initData$1(this.this$0, this.$mac, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
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
        final com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel moreSettingViewModel = this.this$0;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel$initData$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                androidx.lifecycle.MutableLiveData mutableLiveData;
                if (deviceSetting != null) {
                    mutableLiveData = com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.this._uiDeviceState;
                    mutableLiveData.postValue(deviceSetting);
                }
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
