package com.qcwireless.qcwatch.ui.home.healthy.vm;

/* compiled from: HealthyViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$getWatchFaceFromService$1", f = "HealthyViewModel.kt", i = {0, 0}, l = {758, 758}, m = "invokeSuspend", n = {"$this$launchOnUI", "version"}, s = {"L$0", "I$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class HealthyViewModel$getWatchFaceFromService$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $hardwareVersion;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthyViewModel$getWatchFaceFromService$1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$getWatchFaceFromService$1> continuation) {
        super(2, continuation);
        this.this$0 = healthyViewModel;
        this.$hardwareVersion = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> healthyViewModel$getWatchFaceFromService$1 = new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$getWatchFaceFromService$1(this.this$0, this.$hardwareVersion, continuation);
        healthyViewModel$getWatchFaceFromService$1.L$0 = obj;
        return healthyViewModel$getWatchFaceFromService$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final int watchFaceMarketVersion;
        com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
        final kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
            watchFaceMarketVersion = (int) com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWatchFaceMarketVersion();
            watchFaceRepository = this.this$0.watchFaceRepository;
            this.L$0 = coroutineScope2;
            this.I$0 = watchFaceMarketVersion;
            this.label = 1;
            java.lang.Object watchFaceFromServer = watchFaceRepository.getWatchFaceFromServer(this.$hardwareVersion, watchFaceMarketVersion, (kotlin.coroutines.Continuation) this);
            if (watchFaceFromServer == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            obj = watchFaceFromServer;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            watchFaceMarketVersion = this.I$0;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$getWatchFaceFromService$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(final com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>> watchFaceState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                if (watchFaceState.isSuccess() != null) {
                    kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                    final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel2 = healthyViewModel;
                    final int i2 = watchFaceMarketVersion;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgFix(coroutineScope3, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.getWatchFaceFromService.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                            invoke((kotlinx.coroutines.CoroutineScope) obj2);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(kotlinx.coroutines.CoroutineScope coroutineScope4) {
                            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope4, "$this$ktxRunOnBgFix");
                            if (!com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getDownloadWatchFace()) {
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---准备下载表盘" + watchFaceState.isSuccess().size());
                                watchFaceRepository2 = healthyViewModel2.watchFaceRepository;
                                watchFaceRepository2.downloadWatchFaceImageFile(watchFaceState.isSuccess(), i2);
                                return;
                            }
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---正在下载中");
                        }
                    });
                }
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
