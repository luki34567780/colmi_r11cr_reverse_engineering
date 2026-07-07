package com.qcwireless.qcwatch.ui.mine.feedback;

/* compiled from: FeedbackViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$downloadListFromServer$1", f = "FeedbackViewModel.kt", i = {0}, l = {61, 61}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class FeedbackViewModel$downloadListFromServer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $language;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackViewModel$downloadListFromServer$1(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel feedbackViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$downloadListFromServer$1> continuation) {
        super(2, continuation);
        this.this$0 = feedbackViewModel;
        this.$language = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> feedbackViewModel$downloadListFromServer$1 = new com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$downloadListFromServer$1(this.this$0, this.$language, continuation);
        feedbackViewModel$downloadListFromServer$1.L$0 = obj;
        return feedbackViewModel$downloadListFromServer$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.CoroutineScope coroutineScope;
        com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository feedbackRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            feedbackRepository = this.this$0.feedbackRepository;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = feedbackRepository.downFeedbackFromServer(this.$language, (kotlin.coroutines.Continuation) this);
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
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel feedbackViewModel = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$downloadListFromServer$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.mine.feedback.FeedbackResp>>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(final com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.mine.feedback.FeedbackResp>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, netState);
                kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                final com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel feedbackViewModel2 = feedbackViewModel;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.downloadListFromServer.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                        invoke((kotlinx.coroutines.CoroutineScope) obj2);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(kotlinx.coroutines.CoroutineScope coroutineScope3) {
                        com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository feedbackRepository2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope3, "$this$ktxRunOnBgSingle");
                        try {
                            if (netState.getRetCode() == 0) {
                                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.mine.feedback.FeedbackResp> isSuccess = netState.isSuccess();
                                if (isSuccess != null) {
                                    com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel feedbackViewModel3 = feedbackViewModel2;
                                    for (com.qcwireless.qcwatch.ui.base.bean.response.mine.feedback.FeedbackResp feedbackResp : isSuccess) {
                                        com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity feedbackEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity(feedbackResp.getTypeId(), feedbackResp.getFeedbackId(), feedbackResp.getContent());
                                        feedbackRepository2 = feedbackViewModel3.feedbackRepository;
                                        feedbackRepository2.saveEntity(feedbackEntity);
                                    }
                                }
                                feedbackViewModel2.queryAll();
                            }
                        } catch (java.lang.Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
