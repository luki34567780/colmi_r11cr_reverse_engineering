package com.qcwireless.qcwatch.ui.mine.ucenter;

/* compiled from: UserProfileViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1", f = "UserProfileViewModel.kt", i = {}, l = {191, 192}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class UserProfileViewModel$devicePicture$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $hardwareVersion;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileViewModel$devicePicture$1(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel userProfileViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1> continuation) {
        super(2, continuation);
        this.this$0 = userProfileViewModel;
        this.$hardwareVersion = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1(this.this$0, this.$hardwareVersion, continuation);
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
            obj = deviceSettingRepository.getDevicePictureFromLocal(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
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
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1.AnonymousClass1(this.this$0, this.$hardwareVersion), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: UserProfileViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DevicePictureBean;", "emit", "(Lcom/qcwireless/qcwatch/ui/base/bean/device/DevicePictureBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String $hardwareVersion;
        final /* synthetic */ com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel this$0;

        AnonymousClass1(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel userProfileViewModel, java.lang.String str) {
            this.this$0 = userProfileViewModel;
            this.$hardwareVersion = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1$1$emit$1
                if (r0 == 0) goto L14
                r0 = r7
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1$1$emit$1 r0 = (com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r7 = r0.label
                int r7 = r7 - r2
                r0.label = r7
                goto L19
            L14:
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1$1$emit$1 r0 = new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1$1$emit$1
                r0.<init>(r5, r7)
            L19:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3d
                if (r2 == r4) goto L35
                if (r2 != r3) goto L2d
                kotlin.ResultKt.throwOnFailure(r7)
                goto L80
            L2d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L35:
                java.lang.Object r6 = r0.L$0
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1$1 r6 = (com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1.AnonymousClass1) r6
                kotlin.ResultKt.throwOnFailure(r7)
                goto L67
            L3d:
                kotlin.ResultKt.throwOnFailure(r7)
                if (r6 == 0) goto L99
                java.lang.String r7 = r6.getLocalUrl()
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                int r7 = r7.length()
                if (r7 != 0) goto L50
                r7 = 1
                goto L51
            L50:
                r7 = 0
            L51:
                if (r7 == 0) goto L83
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel r6 = r5.this$0
                com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository r6 = com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.access$getDeviceSettingRepository$p(r6)
                java.lang.String r7 = r5.$hardwareVersion
                r0.L$0 = r5
                r0.label = r4
                java.lang.Object r7 = r6.getDevicePictureFromServer(r7, r0)
                if (r7 != r1) goto L66
                return r1
            L66:
                r6 = r5
            L67:
                kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1$1$1 r2 = new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1$1$1
                java.lang.String r4 = r6.$hardwareVersion
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel r6 = r6.this$0
                r2.<init>()
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                r6 = 0
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r6 = r7.collect(r2, r0)
                if (r6 != r1) goto L80
                return r1
            L80:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L83:
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel r7 = r5.this$0
                androidx.lifecycle.MutableLiveData r7 = com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.access$get_picUiState$p(r7)
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$DevicePictureUI r0 = new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$DevicePictureUI
                java.lang.String r1 = r6.getPictureUrl()
                java.lang.String r6 = r6.getLocalUrl()
                r0.<init>(r1, r6)
                r7.postValue(r0)
            L99:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1.AnonymousClass1.emit(com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return emit((com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }
    }
}
