package com.qcwireless.qcwatch.ui.mine.feedback;

/* compiled from: FeedbackViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$submitFeedback$1", f = "FeedbackViewModel.kt", i = {}, l = {83, 83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class FeedbackViewModel$submitFeedback$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<java.io.File> $files;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest $params;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackViewModel$submitFeedback$1(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel feedbackViewModel, com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest feedbackRequest, java.util.List<java.io.File> list, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$submitFeedback$1> continuation) {
        super(2, continuation);
        this.this$0 = feedbackViewModel;
        this.$params = feedbackRequest;
        this.$files = list;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$submitFeedback$1(this.this$0, this.$params, this.$files, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository feedbackRepository;
        final com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel feedbackViewModel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            feedbackRepository = this.this$0.feedbackRepository;
            com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest feedbackRequest = this.$params;
            java.util.List<java.io.File> list = this.$files;
            com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel feedbackViewModel2 = this.this$0;
            this.L$0 = feedbackViewModel2;
            this.label = 1;
            obj = feedbackRepository.upFeedbackImages(feedbackRequest, list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            feedbackViewModel = feedbackViewModel2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            feedbackViewModel = (com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.flow.FlowCollector flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$submitFeedback$1$1$1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                androidx.lifecycle.MutableLiveData mutableLiveData;
                mutableLiveData = com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.this._uiState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI(netState.getRetCode() == 0));
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
