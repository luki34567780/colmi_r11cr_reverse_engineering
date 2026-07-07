package com.qcwireless.qcwatch.ui.base.api;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: QcResponse.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/qcwireless/qcwatch/ui/base/api/Result;", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.api.QcResponseKt$executeResponse$2", f = "QcResponse.kt", i = {}, l = {19, 26}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class QcResponseKt$executeResponse$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.Result<? extends T>>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $errorBlock;
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $successBlock;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.api.QcResponse<T> $this_executeResponse;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    QcResponseKt$executeResponse$2(com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T> qcResponse, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcResponseKt$executeResponse$2> continuation) {
        super(2, continuation);
        this.$this_executeResponse = qcResponse;
        this.$errorBlock = function2;
        this.$successBlock = function22;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> qcResponseKt$executeResponse$2 = new com.qcwireless.qcwatch.ui.base.api.QcResponseKt$executeResponse$2<>(this.$this_executeResponse, this.$errorBlock, this.$successBlock, continuation);
        qcResponseKt$executeResponse$2.L$0 = obj;
        return qcResponseKt$executeResponse$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.Result<? extends T>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r5)
            goto L7a
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3a
        L1e:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            com.qcwireless.qcwatch.ui.base.api.QcResponse<T> r1 = r4.$this_executeResponse
            int r1 = r1.getRetCode()
            if (r1 == 0) goto L6d
            kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.$errorBlock
            if (r1 == 0) goto L3a
            r4.label = r3
            java.lang.Object r5 = r1.invoke(r5, r4)
            if (r5 != r0) goto L3a
            return r0
        L3a:
            com.qcwireless.qcwatch.ui.base.api.QcResponse<T> r5 = r4.$this_executeResponse
            int r5 = r5.getRetCode()
            r0 = 401(0x191, float:5.62E-43)
            if (r5 != r0) goto L58
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r5 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r5 = r5.getInstance()
            java.lang.String r0 = "15ef6eb5403406c1da0dc4a4defa2ea1"
            r5.setUserToken(r0)
            com.qcwireless.qcwatch.base.pref.UserConfig$Companion r5 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
            com.qcwireless.qcwatch.base.pref.UserConfig r5 = r5.getInstance()
            r5.save()
        L58:
            com.qcwireless.qcwatch.ui.base.api.Result$Error r5 = new com.qcwireless.qcwatch.ui.base.api.Result$Error
            java.io.IOException r0 = new java.io.IOException
            com.qcwireless.qcwatch.ui.base.api.QcResponse<T> r1 = r4.$this_executeResponse
            java.lang.String r1 = r1.getMessage()
            r0.<init>(r1)
            java.lang.Exception r0 = (java.lang.Exception) r0
            r5.<init>(r0)
            com.qcwireless.qcwatch.ui.base.api.Result r5 = (com.qcwireless.qcwatch.ui.base.api.Result) r5
            goto L87
        L6d:
            kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.$successBlock
            if (r1 == 0) goto L7a
            r4.label = r2
            java.lang.Object r5 = r1.invoke(r5, r4)
            if (r5 != r0) goto L7a
            return r0
        L7a:
            com.qcwireless.qcwatch.ui.base.api.Result$Success r5 = new com.qcwireless.qcwatch.ui.base.api.Result$Success
            com.qcwireless.qcwatch.ui.base.api.QcResponse<T> r0 = r4.$this_executeResponse
            java.lang.Object r0 = r0.getData()
            r5.<init>(r0)
            com.qcwireless.qcwatch.ui.base.api.Result r5 = (com.qcwireless.qcwatch.ui.base.api.Result) r5
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.api.QcResponseKt$executeResponse$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
