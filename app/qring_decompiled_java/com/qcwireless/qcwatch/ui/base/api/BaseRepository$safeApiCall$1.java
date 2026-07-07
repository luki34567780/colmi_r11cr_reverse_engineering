package com.qcwireless.qcwatch.ui.base.api;

/* compiled from: BaseRepository.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.api.BaseRepository", f = "BaseRepository.kt", i = {0}, l = {21}, m = "safeApiCall", n = {"errorMessage"}, s = {"L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class BaseRepository$safeApiCall$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.api.BaseRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseRepository$safeApiCall$1(com.qcwireless.qcwatch.ui.base.api.BaseRepository baseRepository, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.api.BaseRepository$safeApiCall$1> continuation) {
        super(continuation);
        this.this$0 = baseRepository;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= com.bumptech.glide.request.target.Target.SIZE_ORIGINAL;
        return this.this$0.safeApiCall(null, null, (kotlin.coroutines.Continuation) this);
    }
}
