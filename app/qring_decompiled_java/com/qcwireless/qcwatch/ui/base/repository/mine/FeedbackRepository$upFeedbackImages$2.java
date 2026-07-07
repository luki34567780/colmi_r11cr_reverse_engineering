package com.qcwireless.qcwatch.ui.base.repository.mine;

/* compiled from: FeedbackRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2", f = "FeedbackRepository.kt", i = {0, 1}, l = {57, 58, 60}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class FeedbackRepository$upFeedbackImages$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<java.io.File> $files;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest $params;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackRepository$upFeedbackImages$2(java.util.List<java.io.File> list, com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest feedbackRequest, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2> continuation) {
        super(2, continuation);
        this.$files = list;
        this.$params = feedbackRequest;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> feedbackRepository$upFeedbackImages$2 = new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2(this.$files, this.$params, continuation);
        feedbackRepository$upFeedbackImages$2.L$0 = obj;
        return feedbackRepository$upFeedbackImages$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L36
            if (r2 == r5) goto L2c
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            kotlin.ResultKt.throwOnFailure(r17)
            goto Ld1
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r17)
            r4 = r17
            goto Lba
        L2c:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r17)
            r5 = r17
            goto La3
        L36:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List<java.io.File> r8 = r0.$files
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L4a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L74
            java.lang.Object r9 = r8.next()
            java.io.File r9 = (java.io.File) r9
            okhttp3.RequestBody$Companion r10 = okhttp3.RequestBody.Companion
            okhttp3.MediaType$Companion r11 = okhttp3.MediaType.Companion
            java.lang.String r12 = "multipart/form-data"
            okhttp3.MediaType r11 = r11.parse(r12)
            okhttp3.RequestBody r10 = r10.create(r9, r11)
            okhttp3.MultipartBody$Part$Companion r11 = okhttp3.MultipartBody.Part.Companion
            java.lang.String r9 = r9.getName()
            java.lang.String r12 = "image"
            okhttp3.MultipartBody$Part r9 = r11.createFormData(r12, r9, r10)
            r7.add(r9)
            goto L4a
        L74:
            com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient r8 = com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient.INSTANCE
            com.qcwireless.qcwatch.ui.base.api.QcService r9 = r8.service()
            com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest r8 = r0.$params
            int r10 = r8.getTypeId()
            com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest r8 = r0.$params
            int r11 = r8.getFeedbackId()
            com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest r8 = r0.$params
            java.lang.String r12 = r8.getEmail()
            com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest r8 = r0.$params
            java.lang.String r13 = r8.getContent()
            r14 = r7
            java.util.List r14 = (java.util.List) r14
            r15 = r0
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r5 = r9.feedbackSubmit(r10, r11, r12, r13, r14, r15)
            if (r5 != r1) goto La3
            return r1
        La3:
            com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse r5 = (com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse) r5
            com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2$2 r7 = new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2$2
            r7.<init>(r2, r6)
            kotlin.jvm.functions.Function3 r7 = (kotlin.jvm.functions.Function3) r7
            r8 = r0
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r4 = com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt.success(r5, r7, r8)
            if (r4 != r1) goto Lba
            return r1
        Lba:
            com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse r4 = (com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse) r4
            com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2$3 r5 = new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2$3
            r5.<init>(r2, r6)
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            r2 = r0
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r2 = com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt.error(r4, r5, r2)
            if (r2 != r1) goto Ld1
            return r1
        Ld1:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: FeedbackRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "resp", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2$2", f = "FeedbackRepository.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2.AnonymousClass2 anonymousClass2 = new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2.AnonymousClass2(this.$$this$flow, continuation);
            anonymousClass2.I$0 = i;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                int i2 = this.I$0;
                this.label = 1;
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, null, i2, false, 10, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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

    /* compiled from: FeedbackRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "errorCode", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2$3", f = "FeedbackRepository.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2.AnonymousClass3> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2.AnonymousClass3 anonymousClass3 = new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2.AnonymousClass3(this.$$this$flow, continuation);
            anonymousClass3.I$0 = i;
            return anonymousClass3.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                int i2 = this.I$0;
                this.label = 1;
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, null, i2, true, 3, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
}
