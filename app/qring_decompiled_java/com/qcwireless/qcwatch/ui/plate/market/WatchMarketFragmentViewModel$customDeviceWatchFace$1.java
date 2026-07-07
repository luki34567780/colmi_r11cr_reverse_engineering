package com.qcwireless.qcwatch.ui.plate.market;

/* compiled from: WatchMarketFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$customDeviceWatchFace$1", f = "WatchMarketFragmentViewModel.kt", i = {}, l = {195, 195}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class WatchMarketFragmentViewModel$customDeviceWatchFace$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $hwVersion;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchMarketFragmentViewModel$customDeviceWatchFace$1(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel watchMarketFragmentViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$customDeviceWatchFace$1> continuation) {
        super(2, continuation);
        this.this$0 = watchMarketFragmentViewModel;
        this.$hwVersion = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$customDeviceWatchFace$1(this.this$0, this.$hwVersion, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
        final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel watchMarketFragmentViewModel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            watchFaceRepository = this.this$0.watchFaceRepository;
            java.lang.String str = this.$hwVersion;
            com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel watchMarketFragmentViewModel2 = this.this$0;
            this.L$0 = watchMarketFragmentViewModel2;
            this.label = 1;
            obj = watchFaceRepository.getCustomWatchFaceParams(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            watchMarketFragmentViewModel = watchMarketFragmentViewModel2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            watchMarketFragmentViewModel = (com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.flow.FlowCollector flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$customDeviceWatchFace$1$1$1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp> watchFaceState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp isSuccess;
                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp.ElementUI> elements;
                com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository2;
                if (watchFaceState.isSuccess() != null && (elements = (isSuccess = watchFaceState.isSuccess()).getElements()) != null) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---customDeviceWatchFace");
                    watchFaceRepository2 = com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this.watchFaceRepository;
                    watchFaceRepository2.downloadCustomImage(watchFaceState.isSuccess().getBgImage(), elements, isSuccess.getWidth(), isSuccess.getHeight());
                }
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
