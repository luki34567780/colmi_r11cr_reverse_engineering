package com.qcwireless.qcwatch.ui.home.healthy.vm;

/* compiled from: HealthyViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1", f = "HealthyViewModel.kt", i = {}, l = {732, 732}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class HealthyViewModel$checkWatchFaceDownload$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $version;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthyViewModel$checkWatchFaceDownload$1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1> continuation) {
        super(2, continuation);
        this.this$0 = healthyViewModel;
        this.$version = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1(this.this$0, this.$version, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* compiled from: HealthyViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceState;", "", "emit", "(Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel this$0;

        AnonymousClass1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
            this.this$0 = healthyViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.lang.String> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1$emit$1
                if (r0 == 0) goto L14
                r0 = r9
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1$emit$1 r0 = (com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 - r2
                r0.label = r9
                goto L19
            L14:
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1$emit$1 r0 = new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1$emit$1
                r0.<init>(r7, r9)
            L19:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3f
                if (r2 == r4) goto L35
                if (r2 != r3) goto L2d
                kotlin.ResultKt.throwOnFailure(r9)
                goto L9c
            L2d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L35:
                int r8 = r0.I$0
                java.lang.Object r2 = r0.L$0
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1 r2 = (com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1.AnonymousClass1) r2
                kotlin.ResultKt.throwOnFailure(r9)
                goto L85
            L3f:
                kotlin.ResultKt.throwOnFailure(r9)
                int r9 = r8.getRetCode()
                if (r9 != 0) goto L9f
                java.lang.Object r8 = r8.isSuccess()
                java.lang.String r8 = java.lang.String.valueOf(r8)
                int r8 = java.lang.Integer.parseInt(r8)
                com.qcwireless.qcwatch.base.pref.UserConfig$Companion r9 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
                com.qcwireless.qcwatch.base.pref.UserConfig r9 = r9.getInstance()
                long r5 = (long) r8
                r9.setWatchFaceMarketVersion(r5)
                com.qcwireless.qcwatch.base.pref.UserConfig$Companion r9 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
                com.qcwireless.qcwatch.base.pref.UserConfig r9 = r9.getInstance()
                r9.save()
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel r9 = r7.this$0
                com.qcwireless.qcwatch.ui.base.repository.healthy.HealthyRepository r9 = com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.access$getHealthyRepository$p(r9)
                com.qcwireless.qcwatch.base.pref.UserConfig$Companion r2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
                com.qcwireless.qcwatch.base.pref.UserConfig r2 = r2.getInstance()
                java.lang.String r2 = r2.getDeviceAddressNoClear()
                r0.L$0 = r7
                r0.I$0 = r8
                r0.label = r4
                java.lang.Object r9 = r9.getLocalWatchFaceVersion(r2, r0)
                if (r9 != r1) goto L84
                return r1
            L84:
                r2 = r7
            L85:
                kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1$1 r4 = new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1$1
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel r2 = r2.this$0
                r4.<init>()
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                r8 = 0
                r0.L$0 = r8
                r0.label = r3
                java.lang.Object r8 = r9.collect(r4, r0)
                if (r8 != r1) goto L9c
                return r1
            L9c:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L9f:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1.AnonymousClass1.emit(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return emit((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.lang.String>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            watchFaceRepository = this.this$0.watchFaceRepository;
            this.label = 1;
            obj = watchFaceRepository.getWatchFaceServiceVersion(this.$version, (kotlin.coroutines.Continuation) this);
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
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1.AnonymousClass1(this.this$0), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
