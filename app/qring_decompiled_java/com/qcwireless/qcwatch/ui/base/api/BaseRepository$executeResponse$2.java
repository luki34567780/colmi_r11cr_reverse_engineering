package com.qcwireless.qcwatch.ui.base.api;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: BaseRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/qcwireless/qcwatch/ui/base/api/Result;", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.api.BaseRepository$executeResponse$2", f = "BaseRepository.kt", i = {}, l = {31, 34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class BaseRepository$executeResponse$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.Result<? extends T>>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $errorBlock;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.api.QcResponse<T> $response;
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $successBlock;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BaseRepository$executeResponse$2(com.qcwireless.qcwatch.ui.base.api.QcResponse<? extends T> qcResponse, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.BaseRepository$executeResponse$2> continuation) {
        super(2, continuation);
        this.$response = qcResponse;
        this.$errorBlock = function2;
        this.$successBlock = function22;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> baseRepository$executeResponse$2 = new com.qcwireless.qcwatch.ui.base.api.BaseRepository$executeResponse$2<>(this.$response, this.$errorBlock, this.$successBlock, continuation);
        baseRepository$executeResponse$2.L$0 = obj;
        return baseRepository$executeResponse$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.Result<? extends T>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return new com.qcwireless.qcwatch.ui.base.api.Result.Error(new java.io.IOException(this.$response.getMessage()));
            }
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return new com.qcwireless.qcwatch.ui.base.api.Result.Success(this.$response.getData());
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
        if (this.$response.getRetCode() != 0) {
            kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$errorBlock;
            if (function2 != null) {
                this.label = 1;
                if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new com.qcwireless.qcwatch.ui.base.api.Result.Error(new java.io.IOException(this.$response.getMessage()));
        }
        kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function22 = this.$successBlock;
        if (function22 != null) {
            this.label = 2;
            if (function22.invoke(coroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return new com.qcwireless.qcwatch.ui.base.api.Result.Success(this.$response.getData());
    }
}
