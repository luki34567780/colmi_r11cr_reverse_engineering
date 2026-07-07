package com.qcwireless.qcwatch.ui.base.api;

/* compiled from: QcResponse.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a^\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000121\b\u0002\u0010\u0004\u001a+\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\u0002\b\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0085\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012+\b\u0002\u0010\u000e\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000f¢\u0006\u0002\b\n2+\b\u0002\u0010\u0004\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000f¢\u0006\u0002\b\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a^\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000121\b\u0002\u0010\u000e\u001a+\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\u0002\b\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"error", "Lcom/qcwireless/qcwatch/ui/base/api/QcResponse;", "T", "", "errorBlock", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/qcwireless/qcwatch/ui/base/api/QcResponse;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeResponse", "Lcom/qcwireless/qcwatch/ui/base/api/Result;", "successBlock", "Lkotlin/Function2;", "(Lcom/qcwireless/qcwatch/ui/base/api/QcResponse;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "success", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QcResponseKt {
    public static /* synthetic */ java.lang.Object executeResponse$default(com.qcwireless.qcwatch.ui.base.api.QcResponse qcResponse, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        if ((i & 2) != 0) {
            function22 = null;
        }
        return executeResponse(qcResponse, function2, function22, continuation);
    }

    public static final <T> java.lang.Object executeResponse(com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T> qcResponse, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.Result<? extends T>> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.qcwireless.qcwatch.ui.base.api.QcResponseKt$executeResponse$2(qcResponse, function22, function2, null), continuation);
    }

    public static /* synthetic */ java.lang.Object success$default(com.qcwireless.qcwatch.ui.base.api.QcResponse qcResponse, kotlin.jvm.functions.Function3 function3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function3 = null;
        }
        return success(qcResponse, function3, continuation);
    }

    public static final <T> java.lang.Object success(com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T> qcResponse, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T>> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.qcwireless.qcwatch.ui.base.api.QcResponseKt$success$2(qcResponse, function3, null), continuation);
    }

    public static /* synthetic */ java.lang.Object error$default(com.qcwireless.qcwatch.ui.base.api.QcResponse qcResponse, kotlin.jvm.functions.Function3 function3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function3 = null;
        }
        return error(qcResponse, function3, continuation);
    }

    public static final <T> java.lang.Object error(com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T> qcResponse, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T>> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.qcwireless.qcwatch.ui.base.api.QcResponseKt$error$2(qcResponse, function3, null), continuation);
    }
}
