package com.qcwireless.qcwatch.ui.base.repository.mine;

/* compiled from: FindPwdRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2", f = "FindPwdRepository.kt", i = {1, 2}, l = {25, 29, 29, 31}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class FindPwdRepository$sendVerifyCode$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $account;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FindPwdRepository$sendVerifyCode$2(java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2> continuation) {
        super(2, continuation);
        this.$account = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> findPwdRepository$sendVerifyCode$2 = new com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2(this.$account, continuation);
        findPwdRepository$sendVerifyCode$2.L$0 = obj;
        return findPwdRepository$sendVerifyCode$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L31
            if (r2 == r4) goto L27
            if (r2 != r3) goto L1f
            kotlin.ResultKt.throwOnFailure(r17)     // Catch: java.lang.Exception -> L1c
            goto Lb8
        L1c:
            r0 = move-exception
            goto Lb5
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L27:
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r17)     // Catch: java.lang.Exception -> L1c
            r4 = r17
            goto L9e
        L31:
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r17)     // Catch: java.lang.Exception -> L1c
            r5 = r17
            goto L87
        L3b:
            kotlin.ResultKt.throwOnFailure(r17)
            goto L69
        L3f:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.String r8 = r1.$account
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = kotlin.text.StringsKt.isBlank(r8)
            if (r8 == 0) goto L6c
            com.qcwireless.qcwatch.ui.base.repository.mine.NetState r3 = new com.qcwireless.qcwatch.ui.base.repository.mine.NetState
            r10 = 0
            r11 = 0
            r12 = -10001(0xffffffffffffd8ef, float:NaN)
            r13 = 0
            r14 = 3
            r15 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r4 = r1
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r1.label = r6
            java.lang.Object r2 = r2.emit(r3, r4)
            if (r2 != r0) goto L69
            return r0
        L69:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L6c:
            com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient r6 = com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient.INSTANCE     // Catch: java.lang.Exception -> L1c
            com.qcwireless.qcwatch.ui.base.api.QcService r6 = r6.service()     // Catch: java.lang.Exception -> L1c
            com.qcwireless.qcwatch.ui.base.bean.request.user.FindPwdRequest r8 = new com.qcwireless.qcwatch.ui.base.bean.request.user.FindPwdRequest     // Catch: java.lang.Exception -> L1c
            java.lang.String r9 = r1.$account     // Catch: java.lang.Exception -> L1c
            r8.<init>(r9)     // Catch: java.lang.Exception -> L1c
            r9 = r1
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9     // Catch: java.lang.Exception -> L1c
            r1.L$0 = r2     // Catch: java.lang.Exception -> L1c
            r1.label = r5     // Catch: java.lang.Exception -> L1c
            java.lang.Object r5 = r6.getVerifyCode(r8, r9)     // Catch: java.lang.Exception -> L1c
            if (r5 != r0) goto L87
            return r0
        L87:
            com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse r5 = (com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse) r5     // Catch: java.lang.Exception -> L1c
            com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2$1 r6 = new com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2$1     // Catch: java.lang.Exception -> L1c
            r6.<init>(r2, r7)     // Catch: java.lang.Exception -> L1c
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6     // Catch: java.lang.Exception -> L1c
            r8 = r1
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8     // Catch: java.lang.Exception -> L1c
            r1.L$0 = r2     // Catch: java.lang.Exception -> L1c
            r1.label = r4     // Catch: java.lang.Exception -> L1c
            java.lang.Object r4 = com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt.success(r5, r6, r8)     // Catch: java.lang.Exception -> L1c
            if (r4 != r0) goto L9e
            return r0
        L9e:
            com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse r4 = (com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse) r4     // Catch: java.lang.Exception -> L1c
            com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2$2 r5 = new com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2$2     // Catch: java.lang.Exception -> L1c
            r5.<init>(r2, r7)     // Catch: java.lang.Exception -> L1c
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5     // Catch: java.lang.Exception -> L1c
            r2 = r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2     // Catch: java.lang.Exception -> L1c
            r1.L$0 = r7     // Catch: java.lang.Exception -> L1c
            r1.label = r3     // Catch: java.lang.Exception -> L1c
            java.lang.Object r2 = com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt.error(r4, r5, r2)     // Catch: java.lang.Exception -> L1c
            if (r2 != r0) goto Lb8
            return r0
        Lb5:
            r0.printStackTrace()
        Lb8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: FindPwdRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2$1", f = "FindPwdRepository.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> $$this$flow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2.AnonymousClass1> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2.AnonymousClass1(this.$$this$flow, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
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
            return kotlin.Unit.INSTANCE;
        }
    }

    /* compiled from: FindPwdRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "errorCode", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2$2", f = "FindPwdRepository.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2.AnonymousClass2 anonymousClass2 = new com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository$sendVerifyCode$2.AnonymousClass2(this.$$this$flow, continuation);
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
