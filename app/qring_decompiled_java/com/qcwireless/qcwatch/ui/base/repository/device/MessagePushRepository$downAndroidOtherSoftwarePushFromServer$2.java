package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: MessagePushRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/AndroidMessagePush;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2", f = "MessagePushRepository.kt", i = {0, 1}, l = {83, 83, 85}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<? extends com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;

    MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2> continuation) {
        super(2, continuation);
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> messagePushRepository$downAndroidOtherSoftwarePushFromServer$2 = new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2(continuation);
        messagePushRepository$downAndroidOtherSoftwarePushFromServer$2.L$0 = obj;
        return messagePushRepository$downAndroidOtherSoftwarePushFromServer$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush>>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* compiled from: MessagePushRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "resp", "", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/AndroidMessagePush;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2$1", f = "MessagePushRepository.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.util.List<? extends com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush>>> $$this$flow;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush>>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2.AnonymousClass1> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2.AnonymousClass1 anonymousClass1 = new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2.AnonymousClass1(this.$$this$flow, continuation);
            anonymousClass1.L$0 = list;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List list = (java.util.List) this.L$0;
                this.label = 1;
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, list, 0, false, 12, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7a
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L63
        L26:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4c
        L2e:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient r1 = com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient.INSTANCE
            com.qcwireless.qcwatch.ui.base.api.QcService r1 = r1.service()
            r6 = r8
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r8.L$0 = r9
            r8.label = r4
            java.lang.Object r1 = r1.getDeviceMessagePush(r6)
            if (r1 != r0) goto L49
            return r0
        L49:
            r7 = r1
            r1 = r9
            r9 = r7
        L4c:
            com.qcwireless.qcwatch.ui.base.api.QcResponse r9 = (com.qcwireless.qcwatch.ui.base.api.QcResponse) r9
            com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2$1 r4 = new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2$1
            r4.<init>(r1, r5)
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
            r6 = r8
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = com.qcwireless.qcwatch.ui.base.api.QcResponseKt.success(r9, r4, r6)
            if (r9 != r0) goto L63
            return r0
        L63:
            com.qcwireless.qcwatch.ui.base.api.QcResponse r9 = (com.qcwireless.qcwatch.ui.base.api.QcResponse) r9
            com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2$2 r3 = new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2$2
            r3.<init>(r1, r5)
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
            r1 = r8
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r8.L$0 = r5
            r8.label = r2
            java.lang.Object r9 = com.qcwireless.qcwatch.ui.base.api.QcResponseKt.error(r9, r3, r1)
            if (r9 != r0) goto L7a
            return r0
        L7a:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: MessagePushRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "errorCode", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2$2", f = "MessagePushRepository.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush>>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush>>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2.AnonymousClass2 anonymousClass2 = new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2.AnonymousClass2(this.$$this$flow, continuation);
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
