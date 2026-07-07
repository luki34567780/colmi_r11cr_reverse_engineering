package com.qcwireless.qcwatch.ui.base.api;

/* compiled from: QcNoDataResponse.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/qcwireless/qcwatch/ui/base/api/QcNoDataResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt$success$2", f = "QcNoDataResponse.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class QcNoDataResponseKt$success$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $successBlock;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse $this_success;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QcNoDataResponseKt$success$2(com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse qcNoDataResponse, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt$success$2> continuation) {
        super(2, continuation);
        this.$this_success = qcNoDataResponse;
        this.$successBlock = function3;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> qcNoDataResponseKt$success$2 = new com.qcwireless.qcwatch.ui.base.api.QcNoDataResponseKt$success$2(this.$this_success, this.$successBlock, continuation);
        qcNoDataResponseKt$success$2.L$0 = obj;
        return qcNoDataResponseKt$success$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcNoDataResponse> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            if (this.$this_success.getRetCode() == 0 && (function3 = this.$successBlock) != null) {
                java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$this_success.getRetCode());
                this.label = 1;
                if (function3.invoke(coroutineScope, boxInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return this.$this_success;
    }
}
