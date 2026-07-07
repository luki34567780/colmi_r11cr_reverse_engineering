package com.qcwireless.qcwatch.ui.home.healthy.vm;

/* compiled from: HealthyViewModel.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1", f = "HealthyViewModel.kt", i = {0, 0}, l = {737, 738}, m = "emit", n = {"this", "version"}, s = {"L$0", "I$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class HealthyViewModel$checkWatchFaceDownload$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HealthyViewModel$checkWatchFaceDownload$1$1$emit$1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= com.bumptech.glide.request.target.Target.SIZE_ORIGINAL;
        return this.this$0.emit((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.lang.String>) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }
}
