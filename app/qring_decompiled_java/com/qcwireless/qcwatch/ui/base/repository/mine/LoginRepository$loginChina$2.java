package com.qcwireless.qcwatch.ui.base.repository.mine;

/* compiled from: LoginRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "Lcom/qcwireless/qcwatch/ui/base/bean/response/mine/UserLoginResp;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2", f = "LoginRepository.kt", i = {1, 2}, l = {41, 44, 44, 46}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class LoginRepository$loginChina$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $account;
    final /* synthetic */ java.lang.String $passWord;
    final /* synthetic */ int $type;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginRepository$loginChina$2(java.lang.String str, java.lang.String str2, int i, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2> continuation) {
        super(2, continuation);
        this.$account = str;
        this.$passWord = str2;
        this.$type = i;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> loginRepository$loginChina$2 = new com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2(this.$account, this.$passWord, this.$type, continuation);
        loginRepository$loginChina$2.L$0 = obj;
        return loginRepository$loginChina$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L37
            if (r1 == r5) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            kotlin.ResultKt.throwOnFailure(r15)
            goto La3
        L1a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L22:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L8c
        L2a:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L75
        L32:
            kotlin.ResultKt.throwOnFailure(r15)
            goto Lbf
        L37:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.L$0
            kotlinx.coroutines.flow.FlowCollector r15 = (kotlinx.coroutines.flow.FlowCollector) r15
            java.lang.String r1 = r14.$account
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 != 0) goto La6
            java.lang.String r1 = r14.$passWord
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 == 0) goto L53
            goto La6
        L53:
            com.qcwireless.qcwatch.ui.base.api.QcRetrofitChinaClient r1 = com.qcwireless.qcwatch.ui.base.api.QcRetrofitChinaClient.INSTANCE
            com.qcwireless.qcwatch.ui.base.api.QcService r1 = r1.getService()
            com.qcwireless.qcwatch.ui.base.bean.request.user.LoginRequest r5 = new com.qcwireless.qcwatch.ui.base.bean.request.user.LoginRequest
            java.lang.String r7 = r14.$account
            java.lang.String r8 = r14.$passWord
            int r9 = r14.$type
            r5.<init>(r7, r8, r9)
            r7 = r14
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r14.L$0 = r15
            r14.label = r4
            java.lang.Object r1 = r1.login(r5, r7)
            if (r1 != r0) goto L72
            return r0
        L72:
            r13 = r1
            r1 = r15
            r15 = r13
        L75:
            com.qcwireless.qcwatch.ui.base.api.QcResponse r15 = (com.qcwireless.qcwatch.ui.base.api.QcResponse) r15
            com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2$1 r4 = new com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2$1
            r4.<init>(r1, r6)
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
            r5 = r14
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r14.L$0 = r1
            r14.label = r3
            java.lang.Object r15 = com.qcwireless.qcwatch.ui.base.api.QcResponseKt.success(r15, r4, r5)
            if (r15 != r0) goto L8c
            return r0
        L8c:
            com.qcwireless.qcwatch.ui.base.api.QcResponse r15 = (com.qcwireless.qcwatch.ui.base.api.QcResponse) r15
            com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2$2 r3 = new com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2$2
            r3.<init>(r1, r6)
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
            r1 = r14
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r14.L$0 = r6
            r14.label = r2
            java.lang.Object r15 = com.qcwireless.qcwatch.ui.base.api.QcResponseKt.error(r15, r3, r1)
            if (r15 != r0) goto La3
            return r0
        La3:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        La6:
            com.qcwireless.qcwatch.ui.base.repository.mine.NetState r1 = new com.qcwireless.qcwatch.ui.base.repository.mine.NetState
            r7 = 0
            r8 = 0
            r9 = -10001(0xffffffffffffd8ef, float:NaN)
            r10 = 0
            r11 = 3
            r12 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2 = r14
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r14.label = r5
            java.lang.Object r15 = r15.emit(r1, r2)
            if (r15 != r0) goto Lbf
            return r0
        Lbf:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: LoginRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "userLoginResp", "Lcom/qcwireless/qcwatch/ui/base/bean/response/mine/UserLoginResp;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2$1", f = "LoginRepository.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp>> $$this$flow;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2.AnonymousClass1> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp userLoginResp, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2.AnonymousClass1 anonymousClass1 = new com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2.AnonymousClass1(this.$$this$flow, continuation);
            anonymousClass1.L$0 = userLoginResp;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp userLoginResp = (com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp) this.L$0;
                this.label = 1;
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, userLoginResp, 0, false, 12, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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

    /* compiled from: LoginRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "errorCode", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2$2", f = "LoginRepository.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2.AnonymousClass2 anonymousClass2 = new com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository$loginChina$2.AnonymousClass2(this.$$this$flow, continuation);
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
