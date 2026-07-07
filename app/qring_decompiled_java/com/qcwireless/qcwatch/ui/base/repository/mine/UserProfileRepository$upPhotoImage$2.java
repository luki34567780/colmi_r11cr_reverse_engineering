package com.qcwireless.qcwatch.ui.base.repository.mine;

/* compiled from: UserProfileRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2", f = "UserProfileRepository.kt", i = {0, 1}, l = {253, 254, 256}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class UserProfileRepository$upPhotoImage$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.io.File $file;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileRepository$upPhotoImage$2(java.io.File file, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2> continuation) {
        super(2, continuation);
        this.$file = file;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> userProfileRepository$upPhotoImage$2 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2(this.$file, continuation);
        userProfileRepository$upPhotoImage$2.L$0 = obj;
        return userProfileRepository$upPhotoImage$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.ResultKt.throwOnFailure(r12)
            goto La3
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L8c
        L27:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L75
        L2f:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            okhttp3.RequestBody$Companion r1 = okhttp3.RequestBody.Companion
            java.io.File r6 = r11.$file
            okhttp3.MediaType$Companion r7 = okhttp3.MediaType.Companion
            java.lang.String r8 = "multipart/form-data"
            okhttp3.MediaType r7 = r7.parse(r8)
            okhttp3.RequestBody r1 = r1.create(r6, r7)
            okhttp3.MultipartBody$Part$Companion r6 = okhttp3.MultipartBody.Part.Companion
            java.io.File r7 = r11.$file
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "file"
            okhttp3.MultipartBody$Part r1 = r6.createFormData(r8, r7, r1)
            com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient r6 = com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient.INSTANCE
            com.qcwireless.qcwatch.ui.base.api.QcService r6 = r6.service()
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r7 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r7 = r7.getInstance()
            long r7 = r7.getUid()
            r9 = r11
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            r11.L$0 = r12
            r11.label = r4
            java.lang.Object r1 = r6.protoImage(r7, r1, r9)
            if (r1 != r0) goto L72
            return r0
        L72:
            r10 = r1
            r1 = r12
            r12 = r10
        L75:
            com.qcwireless.qcwatch.ui.base.api.QcResponse r12 = (com.qcwireless.qcwatch.ui.base.api.QcResponse) r12
            com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2$1 r4 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2$1
            r4.<init>(r1, r5)
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
            r6 = r11
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r11.L$0 = r1
            r11.label = r3
            java.lang.Object r12 = com.qcwireless.qcwatch.ui.base.api.QcResponseKt.success(r12, r4, r6)
            if (r12 != r0) goto L8c
            return r0
        L8c:
            com.qcwireless.qcwatch.ui.base.api.QcResponse r12 = (com.qcwireless.qcwatch.ui.base.api.QcResponse) r12
            com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2$2 r3 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2$2
            r3.<init>(r1, r5)
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
            r1 = r11
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r11.L$0 = r5
            r11.label = r2
            java.lang.Object r12 = com.qcwireless.qcwatch.ui.base.api.QcResponseKt.error(r12, r3, r1)
            if (r12 != r0) goto La3
            return r0
        La3:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: UserProfileRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "resp", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2$1", f = "UserProfileRepository.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String>> $$this$flow;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2.AnonymousClass1> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2.AnonymousClass1 anonymousClass1 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2.AnonymousClass1(this.$$this$flow, continuation);
            anonymousClass1.L$0 = str;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str = (java.lang.String) this.L$0;
                this.label = 1;
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, str, 0, false, 12, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2$2", f = "UserProfileRepository.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2.AnonymousClass2 anonymousClass2 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2.AnonymousClass2(this.$$this$flow, continuation);
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
