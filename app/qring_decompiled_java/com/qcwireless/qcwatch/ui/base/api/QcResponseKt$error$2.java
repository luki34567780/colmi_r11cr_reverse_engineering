package com.qcwireless.qcwatch.ui.base.api;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: QcResponse.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/qcwireless/qcwatch/ui/base/api/QcResponse;", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.api.QcResponseKt$error$2", f = "QcResponse.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class QcResponseKt$error$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T>>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $errorBlock;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.api.QcResponse<T> $this_error;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    QcResponseKt$error$2(com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T> qcResponse, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcResponseKt$error$2> continuation) {
        super(2, continuation);
        this.$this_error = qcResponse;
        this.$errorBlock = function3;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> qcResponseKt$error$2 = new com.qcwireless.qcwatch.ui.base.api.QcResponseKt$error$2<>(this.$this_error, this.$errorBlock, continuation);
        qcResponseKt$error$2.L$0 = obj;
        return qcResponseKt$error$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            if (this.$this_error.getRetCode() == 401) {
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setUserToken("15ef6eb5403406c1da0dc4a4defa2ea1");
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            }
            if (this.$this_error.getRetCode() != 0 && (function3 = this.$errorBlock) != null) {
                java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$this_error.getRetCode());
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
        return this.$this_error;
    }
}
