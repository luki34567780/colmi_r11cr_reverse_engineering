package com.qcwireless.qcwatch.ui.device.vm;

/* compiled from: DeviceViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$checkOta$1", f = "DeviceViewModel.kt", i = {}, l = {98, 101, 110, 113}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class DeviceViewModel$checkOta$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceViewModel$checkOta$1(com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel deviceViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$checkOta$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$checkOta$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L33
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            goto L26
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.L$0
            com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel r1 = (com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L96
        L26:
            kotlin.ResultKt.throwOnFailure(r9)
            goto Laa
        L2b:
            java.lang.Object r1 = r8.L$0
            com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel r1 = (com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L63
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
            com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel r9 = r8.this$0
            com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository r9 = com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.access$getDeviceSettingRepository$p(r9)
            com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel r1 = r8.this$0
            boolean r7 = com.qcwireless.qc_utils.date.LanguageUtil.isChina()
            if (r7 == 0) goto L77
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r3 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r3 = r3.getInstance()
            java.lang.String r3 = r3.getHwVersion()
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r4 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r4 = r4.getInstance()
            java.lang.String r4 = r4.getFmVersion()
            r8.L$0 = r1
            r8.label = r6
            java.lang.Object r9 = r9.checkOtaFromServerChina(r3, r4, r8)
            if (r9 != r0) goto L63
            return r0
        L63:
            kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
            com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$checkOta$1$1$1 r3 = new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$checkOta$1$1$1
            r3.<init>()
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r8.L$0 = r2
            r8.label = r5
            java.lang.Object r9 = r9.collect(r3, r8)
            if (r9 != r0) goto Laa
            return r0
        L77:
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r5 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r5 = r5.getInstance()
            java.lang.String r5 = r5.getHwVersion()
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r6 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r6 = r6.getInstance()
            java.lang.String r6 = r6.getFmVersion()
            r8.L$0 = r1
            r8.label = r4
            java.lang.Object r9 = r9.checkOtaFromServer(r5, r6, r8)
            if (r9 != r0) goto L96
            return r0
        L96:
            kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
            com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$checkOta$1$1$2 r4 = new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$checkOta$1$1$2
            r4.<init>()
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            r8.L$0 = r2
            r8.label = r3
            java.lang.Object r9 = r9.collect(r4, r8)
            if (r9 != r0) goto Laa
            return r0
        Laa:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$checkOta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
