package com.qcwireless.qcwatch.ui.base.repository.watchface;

/* compiled from: WatchFaceRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/CustomFaceEntity;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomizeParamsFromLocalByType$2", f = "WatchFaceRepository.kt", i = {}, l = {475}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class WatchFaceRepository$getCustomizeParamsFromLocalByType$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchFaceRepository$getCustomizeParamsFromLocalByType$2(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomizeParamsFromLocalByType$2> continuation) {
        super(2, continuation);
        this.this$0 = watchFaceRepository;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> watchFaceRepository$getCustomizeParamsFromLocalByType$2 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomizeParamsFromLocalByType$2(this.this$0, continuation);
        watchFaceRepository$getCustomizeParamsFromLocalByType$2.L$0 = obj;
        return watchFaceRepository$getCustomizeParamsFromLocalByType$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao qcCustomFaceDao;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            qcCustomFaceDao = this.this$0.qcCustomFaceDao;
            this.label = 1;
            if (flowCollector.emit(qcCustomFaceDao.queryWatchFaceCustom(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion()), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
