package com.qcwireless.qcwatch.ui.mine.feedback;

/* compiled from: FeedbackViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$queryAll$1", f = "FeedbackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class FeedbackViewModel$queryAll$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackViewModel$queryAll$1(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel feedbackViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$queryAll$1> continuation) {
        super(2, continuation);
        this.this$0 = feedbackViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$queryAll$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository feedbackRepository;
        androidx.lifecycle.MutableLiveData mutableLiveData;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        feedbackRepository = this.this$0.feedbackRepository;
        com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel feedbackViewModel = this.this$0;
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity> queryAllFeedbackList = feedbackRepository.queryAllFeedbackList();
        if (queryAllFeedbackList != null) {
            for (com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity feedbackEntity : queryAllFeedbackList) {
                int typeId = feedbackEntity.getTypeId();
                if (typeId == 1) {
                    feedbackViewModel.getFeaturesList().add(feedbackEntity);
                } else if (typeId == 2) {
                    feedbackViewModel.getFirmwareList().add(feedbackEntity);
                } else if (typeId == 3) {
                    feedbackViewModel.getHardwareList().add(feedbackEntity);
                }
            }
        }
        mutableLiveData = feedbackViewModel._uiState;
        mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI(true));
        return kotlin.Unit.INSTANCE;
    }
}
