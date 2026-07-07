package com.qcwireless.qcwatch.ui.base.service;

/* compiled from: NetService.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1", f = "NetService.kt", i = {}, l = {251, 251, 253, 253}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class NetService$upSleepDetail$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;

    NetService$upSleepDetail$1(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1> continuation) {
        super(2, continuation);
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1(continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L21
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6e
        L21:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L80
        L25:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4a
        L29:
            kotlin.ResultKt.throwOnFailure(r7)
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r7 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r7 = r7.getInstance()
            boolean r7 = r7.getNewSleepProtocol()
            if (r7 == 0) goto L5c
            com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$Companion r7 = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE
            com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository r7 = r7.getGetInstance()
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r6.label = r5
            java.lang.Object r7 = r7.updateSleepDetailToServerNewProtocol(r1)
            if (r7 != r0) goto L4a
            return r0
        L4a:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1$1<T> r1 = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.1
                static {
                    /*
                        com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1$1 r0 = new com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1$1<T>) com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.1.INSTANCE com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.AnonymousClass1.<init>():void");
                }

                public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                    /*
                        r0 = this;
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.AnonymousClass1.emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r1, kotlin.coroutines.Continuation r2) {
                    /*
                        r0 = this;
                        com.qcwireless.qcwatch.ui.base.repository.mine.NetState r1 = (com.qcwireless.qcwatch.ui.base.repository.mine.NetState) r1
                        java.lang.Object r1 = r0.emit(r1, r2)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r2 = r6
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r6.label = r4
            java.lang.Object r7 = r7.collect(r1, r2)
            if (r7 != r0) goto L80
            return r0
        L5c:
            com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$Companion r7 = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE
            com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository r7 = r7.getGetInstance()
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r6.label = r3
            java.lang.Object r7 = r7.updateSleepDetailToServer(r1)
            if (r7 != r0) goto L6e
            return r0
        L6e:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1$2<T> r1 = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.2
                static {
                    /*
                        com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1$2 r0 = new com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1$2<T>) com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.2.INSTANCE com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.AnonymousClass2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.AnonymousClass2.<init>():void");
                }

                public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                    /*
                        r0 = this;
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.AnonymousClass2.emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r1, kotlin.coroutines.Continuation r2) {
                    /*
                        r0 = this;
                        com.qcwireless.qcwatch.ui.base.repository.mine.NetState r1 = (com.qcwireless.qcwatch.ui.base.repository.mine.NetState) r1
                        java.lang.Object r1 = r0.emit(r1, r2)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r3 = r6
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r6.label = r2
            java.lang.Object r7 = r7.collect(r1, r3)
            if (r7 != r0) goto L80
            return r0
        L80:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
