package com.qcwireless.qcwatch.ui.base.repository.watchface;

/* compiled from: WatchFaceRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceState;", "", "Lcom/qcwireless/qcwatch/ui/base/bean/response/watchface/WatchFaceResp;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$4", f = "WatchFaceRepository.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class WatchFaceRepository$getWatchFaceFromServer$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<? extends com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;

    WatchFaceRepository$getWatchFaceFromServer$4(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$4> continuation) {
        super(3, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$4 watchFaceRepository$getWatchFaceFromServer$4 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$4(continuation);
        watchFaceRepository$getWatchFaceFromServer$4.L$0 = flowCollector;
        return watchFaceRepository$getWatchFaceFromServer$4.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (((kotlinx.coroutines.flow.FlowCollector) this.L$0).emit(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState(null, com.qcwireless.qcwatch.ui.base.api.RetCodeValue.ErrorCode_0, 1, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
