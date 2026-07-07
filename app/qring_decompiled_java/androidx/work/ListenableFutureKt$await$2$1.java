package androidx.work;

/* compiled from: ListenableFuture.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "", "R"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ListenableFutureKt$await$2$1 implements java.lang.Runnable {
    final /* synthetic */ kotlinx.coroutines.CancellableContinuation<R> $cancellableContinuation;
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture<R> $this_await;

    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$await$2$1(kotlinx.coroutines.CancellableContinuation<? super R> cancellableContinuation, com.google.common.util.concurrent.ListenableFuture<R> listenableFuture) {
        this.$cancellableContinuation = cancellableContinuation;
        this.$this_await = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            kotlin.coroutines.Continuation continuation = this.$cancellableContinuation;
            java.lang.Object obj = this.$this_await.get();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m1091constructorimpl(obj));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof java.util.concurrent.CancellationException) {
                this.$cancellableContinuation.cancel(cause);
                return;
            }
            kotlin.coroutines.Continuation continuation2 = this.$cancellableContinuation;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation2.resumeWith(kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(cause)));
        }
    }
}
