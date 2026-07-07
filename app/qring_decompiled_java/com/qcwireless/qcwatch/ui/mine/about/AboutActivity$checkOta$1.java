package com.qcwireless.qcwatch.ui.mine.about;

/* compiled from: AboutActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.about.AboutActivity$checkOta$1", f = "AboutActivity.kt", i = {0, 2}, l = {com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE, 206, 220, 223}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u2d0", "$this$invokeSuspend_u24lambda_u2d0"}, s = {"L$1", "L$1"})
/* loaded from: /tmp/dex/classes2.dex */
final class AboutActivity$checkOta$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean $netWork;
    java.lang.Object L$0;
    java.lang.Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.mine.about.AboutActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AboutActivity$checkOta$1(com.qcwireless.qcwatch.ui.mine.about.AboutActivity aboutActivity, boolean z, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.about.AboutActivity$checkOta$1> continuation) {
        super(2, continuation);
        this.this$0 = aboutActivity;
        this.$netWork = z;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.mine.about.AboutActivity$checkOta$1(this.this$0, this.$netWork, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L40
            if (r1 == r5) goto L32
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L2d
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            boolean r1 = r10.Z$0
            java.lang.Object r3 = r10.L$1
            com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository r3 = (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) r3
            java.lang.Object r4 = r10.L$0
            com.qcwireless.qcwatch.ui.mine.about.AboutActivity r4 = (com.qcwireless.qcwatch.ui.mine.about.AboutActivity) r4
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lbf
        L2d:
            kotlin.ResultKt.throwOnFailure(r11)
            goto Ld5
        L32:
            boolean r1 = r10.Z$0
            java.lang.Object r2 = r10.L$1
            com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository r2 = (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) r2
            java.lang.Object r3 = r10.L$0
            com.qcwireless.qcwatch.ui.mine.about.AboutActivity r3 = (com.qcwireless.qcwatch.ui.mine.about.AboutActivity) r3
            kotlin.ResultKt.throwOnFailure(r11)
            goto L81
        L40:
            kotlin.ResultKt.throwOnFailure(r11)
            com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository$Companion r11 = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE
            com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository r11 = r11.getGetInstance()
            com.qcwireless.qcwatch.ui.mine.about.AboutActivity r1 = r10.this$0
            boolean r7 = r10.$netWork
            com.qcwireless.qcwatch.QCApplication$Companion r8 = com.qcwireless.qcwatch.QCApplication.INSTANCE
            com.qcwireless.qcwatch.QCApplication r8 = r8.getGetInstance()
            boolean r8 = r8.getPingHwServer()
            if (r8 == 0) goto L97
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r2 = r2.getInstance()
            java.lang.String r2 = r2.getHwVersion()
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r3 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r3 = r3.getInstance()
            java.lang.String r3 = r3.getFmVersion()
            r10.L$0 = r1
            r10.L$1 = r11
            r10.Z$0 = r7
            r10.label = r5
            java.lang.Object r2 = r11.checkOtaFromServer(r2, r3, r10)
            if (r2 != r0) goto L7c
            return r0
        L7c:
            r3 = r1
            r1 = r7
            r9 = r2
            r2 = r11
            r11 = r9
        L81:
            kotlinx.coroutines.flow.Flow r11 = (kotlinx.coroutines.flow.Flow) r11
            com.qcwireless.qcwatch.ui.mine.about.AboutActivity$checkOta$1$1$1 r5 = new com.qcwireless.qcwatch.ui.mine.about.AboutActivity$checkOta$1$1$1
            r5.<init>()
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            r10.L$0 = r6
            r10.L$1 = r6
            r10.label = r4
            java.lang.Object r11 = r11.collect(r5, r10)
            if (r11 != r0) goto Ld5
            return r0
        L97:
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r4 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r4 = r4.getInstance()
            java.lang.String r4 = r4.getHwVersion()
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r5 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r5 = r5.getInstance()
            java.lang.String r5 = r5.getFmVersion()
            r10.L$0 = r1
            r10.L$1 = r11
            r10.Z$0 = r7
            r10.label = r3
            java.lang.Object r3 = r11.checkOtaFromServerChina(r4, r5, r10)
            if (r3 != r0) goto Lba
            return r0
        Lba:
            r4 = r1
            r1 = r7
            r9 = r3
            r3 = r11
            r11 = r9
        Lbf:
            kotlinx.coroutines.flow.Flow r11 = (kotlinx.coroutines.flow.Flow) r11
            com.qcwireless.qcwatch.ui.mine.about.AboutActivity$checkOta$1$1$2 r5 = new com.qcwireless.qcwatch.ui.mine.about.AboutActivity$checkOta$1$1$2
            r5.<init>()
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            r10.L$0 = r6
            r10.L$1 = r6
            r10.label = r2
            java.lang.Object r11 = r11.collect(r5, r10)
            if (r11 != r0) goto Ld5
            return r0
        Ld5:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.mine.about.AboutActivity$checkOta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
