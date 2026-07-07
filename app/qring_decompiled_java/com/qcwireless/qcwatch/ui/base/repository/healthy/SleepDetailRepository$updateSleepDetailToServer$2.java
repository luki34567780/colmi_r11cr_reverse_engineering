package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: SleepDetailRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2", f = "SleepDetailRepository.kt", i = {0, 0, 1}, l = {838, 838, 844}, m = "invokeSuspend", n = {"$this$flow", "notUpList", "$this$flow"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class SleepDetailRepository$updateSleepDetailToServer$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepDetailRepository$updateSleepDetailToServer$2(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2> continuation) {
        super(2, continuation);
        this.this$0 = sleepDetailRepository;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> sleepDetailRepository$updateSleepDetailToServer$2 = new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2(this.this$0, continuation);
        sleepDetailRepository$updateSleepDetailToServer$2.L$0 = obj;
        return sleepDetailRepository$updateSleepDetailToServer$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fe A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: SleepDetailRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2$1", f = "SleepDetailRepository.kt", i = {}, l = {839}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> $$this$flow;
        final /* synthetic */ java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> $notUpList;
        int label;
        final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail> list, com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2.AnonymousClass1> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
            this.$notUpList = list;
            this.this$0 = sleepDetailRepository;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2.AnonymousClass1(this.$$this$flow, this.$notUpList, this.this$0, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, kotlin.coroutines.jvm.internal.Boxing.boxInt(1), 0, false, 12, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            for (com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail sleepDetail : this.$notUpList) {
                sleepDetail.setSync(true);
                qcSleepDetailDao = this.this$0.sleepDetailDao;
                qcSleepDetailDao.insert(sleepDetail);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* compiled from: SleepDetailRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "errorCode", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2$2", f = "SleepDetailRepository.kt", i = {}, l = {845}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2.AnonymousClass2 anonymousClass2 = new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2.AnonymousClass2(this.$$this$flow, continuation);
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
