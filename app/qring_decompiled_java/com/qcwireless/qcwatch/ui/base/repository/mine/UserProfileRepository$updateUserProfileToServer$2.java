package com.qcwireless.qcwatch.ui.base.repository.mine;

/* compiled from: UserProfileRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2", f = "UserProfileRepository.kt", i = {0, 1}, l = {122, 122, 124}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class UserProfileRepository$updateUserProfileToServer$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity $userEntity;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileRepository$updateUserProfileToServer$2(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2> continuation) {
        super(2, continuation);
        this.$userEntity = userEntity;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> userProfileRepository$updateUserProfileToServer$2 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2(this.$userEntity, continuation);
        userProfileRepository$updateUserProfileToServer$2.L$0 = obj;
        return userProfileRepository$updateUserProfileToServer$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad A[RETURN] */
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
            if (r2 == 0) goto L35
            if (r2 == r5) goto L2b
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            kotlin.ResultKt.throwOnFailure(r17)
            goto Lae
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
            goto L97
        L2b:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r17)
            r5 = r17
            goto L80
        L35:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            com.qcwireless.qcwatch.ui.base.bean.request.user.UserProfileRequest r15 = new com.qcwireless.qcwatch.ui.base.bean.request.user.UserProfileRequest
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r7 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r7 = r7.getInstance()
            long r8 = r7.getUid()
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity r7 = r0.$userEntity
            int r10 = r7.getGender()
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity r7 = r0.$userEntity
            float r7 = r7.getWeight()
            int r11 = (int) r7
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity r7 = r0.$userEntity
            float r7 = r7.getHeight()
            int r12 = (int) r7
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity r7 = r0.$userEntity
            java.lang.String r13 = r7.getBirthday()
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity r7 = r0.$userEntity
            java.lang.String r14 = r7.getNickName()
            r7 = r15
            r7.<init>(r8, r10, r11, r12, r13, r14)
            com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient r7 = com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient.INSTANCE
            com.qcwireless.qcwatch.ui.base.api.QcService r7 = r7.service()
            r8 = r0
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r5 = r7.updateProfile(r15, r8)
            if (r5 != r1) goto L80
            return r1
        L80:
            com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse r5 = (com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse) r5
            com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2$1 r7 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2$1
            r7.<init>(r2, r6)
            kotlin.jvm.functions.Function3 r7 = (kotlin.jvm.functions.Function3) r7
            r8 = r0
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r4 = com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt.success(r5, r7, r8)
            if (r4 != r1) goto L97
            return r1
        L97:
            com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse r4 = (com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse) r4
            com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2$2 r5 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2$2
            r5.<init>(r2, r6)
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            r2 = r0
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r2 = com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt.error(r4, r5, r2)
            if (r2 != r1) goto Lae
            return r1
        Lae:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: UserProfileRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2$1", f = "UserProfileRepository.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> $$this$flow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2.AnonymousClass1> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2.AnonymousClass1(this.$$this$flow, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
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

    /* compiled from: UserProfileRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "errorCode", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2$2", f = "UserProfileRepository.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2.AnonymousClass2 anonymousClass2 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2.AnonymousClass2(this.$$this$flow, continuation);
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
