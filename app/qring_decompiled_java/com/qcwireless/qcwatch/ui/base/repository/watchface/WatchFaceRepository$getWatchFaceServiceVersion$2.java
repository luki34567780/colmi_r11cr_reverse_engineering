package com.qcwireless.qcwatch.ui.base.repository.watchface;

/* compiled from: WatchFaceRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceState;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2", f = "WatchFaceRepository.kt", i = {1, 2}, l = {111, 115, 115, 117}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class WatchFaceRepository$getWatchFaceServiceVersion$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.lang.String>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $hardwareVersion;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchFaceRepository$getWatchFaceServiceVersion$2(java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2> continuation) {
        super(2, continuation);
        this.$hardwareVersion = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> watchFaceRepository$getWatchFaceServiceVersion$2 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2(this.$hardwareVersion, continuation);
        watchFaceRepository$getWatchFaceServiceVersion$2.L$0 = obj;
        return watchFaceRepository$getWatchFaceServiceVersion$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.lang.String>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L39
            if (r1 == r5) goto L35
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L1a
            goto Laa
        L1a:
            r10 = move-exception
            goto La7
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L1a
            goto L90
        L2d:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L1a
            goto L79
        L35:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L5d
        L39:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            java.lang.String r1 = r9.$hardwareVersion
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 == 0) goto L60
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState r1 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState
            r2 = -10001(0xffffffffffffd8ef, float:NaN)
            r1.<init>(r6, r2, r5, r6)
            r2 = r9
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r9.label = r5
            java.lang.Object r10 = r10.emit(r1, r2)
            if (r10 != r0) goto L5d
            return r0
        L5d:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L60:
            com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient r1 = com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient.INSTANCE     // Catch: java.lang.Exception -> L1a
            com.qcwireless.qcwatch.ui.base.api.QcService r1 = r1.service()     // Catch: java.lang.Exception -> L1a
            java.lang.String r5 = r9.$hardwareVersion     // Catch: java.lang.Exception -> L1a
            r7 = r9
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7     // Catch: java.lang.Exception -> L1a
            r9.L$0 = r10     // Catch: java.lang.Exception -> L1a
            r9.label = r4     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = r1.getWatchFaceVersion(r5, r7)     // Catch: java.lang.Exception -> L1a
            if (r1 != r0) goto L76
            return r0
        L76:
            r8 = r1
            r1 = r10
            r10 = r8
        L79:
            com.qcwireless.qcwatch.ui.base.api.QcResponse r10 = (com.qcwireless.qcwatch.ui.base.api.QcResponse) r10     // Catch: java.lang.Exception -> L1a
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2$1 r4 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2$1     // Catch: java.lang.Exception -> L1a
            r4.<init>(r1, r6)     // Catch: java.lang.Exception -> L1a
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4     // Catch: java.lang.Exception -> L1a
            r5 = r9
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Exception -> L1a
            r9.L$0 = r1     // Catch: java.lang.Exception -> L1a
            r9.label = r3     // Catch: java.lang.Exception -> L1a
            java.lang.Object r10 = com.qcwireless.qcwatch.ui.base.api.QcResponseKt.success(r10, r4, r5)     // Catch: java.lang.Exception -> L1a
            if (r10 != r0) goto L90
            return r0
        L90:
            com.qcwireless.qcwatch.ui.base.api.QcResponse r10 = (com.qcwireless.qcwatch.ui.base.api.QcResponse) r10     // Catch: java.lang.Exception -> L1a
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2$2 r3 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2$2     // Catch: java.lang.Exception -> L1a
            r3.<init>(r1, r6)     // Catch: java.lang.Exception -> L1a
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3     // Catch: java.lang.Exception -> L1a
            r1 = r9
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1     // Catch: java.lang.Exception -> L1a
            r9.L$0 = r6     // Catch: java.lang.Exception -> L1a
            r9.label = r2     // Catch: java.lang.Exception -> L1a
            java.lang.Object r10 = com.qcwireless.qcwatch.ui.base.api.QcResponseKt.error(r10, r3, r1)     // Catch: java.lang.Exception -> L1a
            if (r10 != r0) goto Laa
            return r0
        La7:
            r10.printStackTrace()
        Laa:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: WatchFaceRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "version", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2$1", f = "WatchFaceRepository.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.lang.String>> $$this$flow;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.lang.String>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2.AnonymousClass1> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2.AnonymousClass1 anonymousClass1 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2.AnonymousClass1(this.$$this$flow, continuation);
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
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState(str, 0), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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

    /* compiled from: WatchFaceRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "errorCode", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2$2", f = "WatchFaceRepository.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.lang.String>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.lang.String>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2.AnonymousClass2 anonymousClass2 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2.AnonymousClass2(this.$$this$flow, continuation);
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
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState(null, i2, 1, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
