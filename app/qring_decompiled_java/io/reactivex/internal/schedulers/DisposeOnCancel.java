package io.reactivex.internal.schedulers;

/* loaded from: classes3.dex */
final class DisposeOnCancel implements java.util.concurrent.Future<java.lang.Object> {
    final io.reactivex.disposables.Disposable upstream;

    @Override // java.util.concurrent.Future
    public java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    DisposeOnCancel(io.reactivex.disposables.Disposable disposable) {
        this.upstream = disposable;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.upstream.dispose();
        return false;
    }
}
