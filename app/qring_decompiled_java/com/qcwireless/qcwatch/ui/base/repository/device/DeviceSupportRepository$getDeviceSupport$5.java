package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: DeviceSupportRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/ItemEntity;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$5", f = "DeviceSupportRepository.kt", i = {0, 0}, l = {49}, m = "invokeSuspend", n = {"$this$catch", "map"}, s = {"L$0", "L$1"})
/* loaded from: /tmp/dex/classes2.dex */
final class DeviceSupportRepository$getDeviceSupport$5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $mac;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceSupportRepository$getDeviceSupport$5(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository deviceSupportRepository, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$5> continuation) {
        super(3, continuation);
        this.this$0 = deviceSupportRepository;
        this.$mac = str;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$5 deviceSupportRepository$getDeviceSupport$5 = new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$5(this.this$0, this.$mac, continuation);
        deviceSupportRepository$getDeviceSupport$5.L$0 = flowCollector;
        return deviceSupportRepository$getDeviceSupport$5.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        final java.util.HashMap hashMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.HashMap hashMap3 = hashMap2;
            hashMap3.put(kotlin.coroutines.jvm.internal.Boxing.boxInt(1), new com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getString(com.qcwireless.qcwatch.R.string.qc_text_84), true, 1, false, 8, null));
            hashMap3.put(kotlin.coroutines.jvm.internal.Boxing.boxInt(2), new com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getString(com.qcwireless.qcwatch.R.string.qc_text_85), true, 2, false, 8, null));
            hashMap3.put(kotlin.coroutines.jvm.internal.Boxing.boxInt(3), new com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getString(com.qcwireless.qcwatch.R.string.qc_text_83), true, 3, false, 8, null));
            this.L$0 = flowCollector;
            this.L$1 = hashMap2;
            this.label = 1;
            if (flowCollector.emit(hashMap2, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            hashMap = hashMap2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hashMap = (java.util.HashMap) this.L$1;
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository deviceSupportRepository = this.this$0;
        final java.lang.String str = this.$mac;
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(flowCollector, new kotlin.jvm.functions.Function1<kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity>>, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$5.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                invoke((kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity>>) obj2);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity>> flowCollector2) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowCollector2, "$this$ktxRunOnBgSingle");
                qcDeviceSettingDao = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.this.qcDeviceSettingDao;
                qcDeviceSettingDao.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(str, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.DeviceSupport, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(hashMap)));
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
