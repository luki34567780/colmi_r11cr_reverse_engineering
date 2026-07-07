package com.qcwireless.qcwatch.ui.base.api;

/* compiled from: QcNoDataResponse.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u000121\b\u0002\u0010\u0002\u001a+\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001aH\u0010\u000b\u001a\u00020\u0001*\u00020\u000121\b\u0002\u0010\f\u001a+\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"error", "Lcom/qcwireless/qcwatch/ui/base/api/QcNoDataResponse;", "errorBlock", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/qcwireless/qcwatch/ui/base/api/QcNoDataResponse;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "success", "successBlock", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QcNoDataResponseKt {
    public static /* synthetic */ java.lang.Object success$default(com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse qcNoDataResponse, kotlin.jvm.functions.Function3 function3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function3 = null;
        }
        return success(qcNoDataResponse, function3, continuation);
    }

    public static final java.lang.Object success(com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse qcNoDataResponse, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt$success$2(qcNoDataResponse, function3, null), continuation);
    }

    public static /* synthetic */ java.lang.Object error$default(com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse qcNoDataResponse, kotlin.jvm.functions.Function3 function3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function3 = null;
        }
        return error(qcNoDataResponse, function3, continuation);
    }

    public static final java.lang.Object error(com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse qcNoDataResponse, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt$error$2(qcNoDataResponse, function3, null), continuation);
    }
}
