package com.qcwireless.qcwatch.ui.base.api;

/* compiled from: BaseRepository.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JE\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0089\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00042+\b\u0002\u0010\r\u001a%\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u00112+\b\u0002\u0010\u0012\u001a%\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013JM\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/api/BaseRepository;", "", "()V", "apiCall", "Lcom/qcwireless/qcwatch/ui/base/api/QcResponse;", "T", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeResponse", "Lcom/qcwireless/qcwatch/ui/base/api/Result;", "response", "successBlock", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "", "Lkotlin/ExtensionFunctionType;", "errorBlock", "(Lcom/qcwireless/qcwatch/ui/base/api/QcResponse;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeApiCall", "errorMessage", "", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class BaseRepository {
    public final <T> java.lang.Object apiCall(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T>>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T>> continuation) {
        return function1.invoke(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object safeApiCall(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.Result<? extends T>>, ? extends java.lang.Object> r5, java.lang.String r6, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.Result<? extends T>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.qcwireless.qcwatch.ui.base.api.BaseRepository$safeApiCall$1
            if (r0 == 0) goto L14
            r0 = r7
            com.qcwireless.qcwatch.ui.base.api.BaseRepository$safeApiCall$1 r0 = (com.qcwireless.qcwatch.ui.base.api.BaseRepository$safeApiCall$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.qcwireless.qcwatch.ui.base.api.BaseRepository$safeApiCall$1 r0 = new com.qcwireless.qcwatch.ui.base.api.BaseRepository$safeApiCall$1
            r0.<init>(r4, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L48
            goto L45
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.L$0 = r6     // Catch: java.lang.Exception -> L48
            r0.label = r3     // Catch: java.lang.Exception -> L48
            java.lang.Object r7 = r5.invoke(r0)     // Catch: java.lang.Exception -> L48
            if (r7 != r1) goto L45
            return r1
        L45:
            com.qcwireless.qcwatch.ui.base.api.Result r7 = (com.qcwireless.qcwatch.ui.base.api.Result) r7     // Catch: java.lang.Exception -> L48
            goto L59
        L48:
            r5 = move-exception
            com.qcwireless.qcwatch.ui.base.api.Result$Error r7 = new com.qcwireless.qcwatch.ui.base.api.Result$Error
            java.io.IOException r0 = new java.io.IOException
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r0.<init>(r6, r5)
            java.lang.Exception r0 = (java.lang.Exception) r0
            r7.<init>(r0)
            com.qcwireless.qcwatch.ui.base.api.Result r7 = (com.qcwireless.qcwatch.ui.base.api.Result) r7
        L59:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.api.BaseRepository.safeApiCall(kotlin.jvm.functions.Function1, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object executeResponse$default(com.qcwireless.qcwatch.ui.base.api.BaseRepository baseRepository, com.qcwireless.qcwatch.ui.base.api.QcResponse qcResponse, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeResponse");
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = null;
        }
        return baseRepository.executeResponse(qcResponse, function2, function22, continuation);
    }

    public final <T> java.lang.Object executeResponse(com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T> qcResponse, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.Result<? extends T>> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.qcwireless.qcwatch.ui.base.api.BaseRepository$executeResponse$2(qcResponse, function22, function2, null), continuation);
    }
}
