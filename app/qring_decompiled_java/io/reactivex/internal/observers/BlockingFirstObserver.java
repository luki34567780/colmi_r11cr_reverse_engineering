package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class BlockingFirstObserver<T> extends io.reactivex.internal.observers.BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.value == null) {
            this.value = t;
            this.upstream.dispose();
            countDown();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        if (this.value == null) {
            this.error = th;
        }
        countDown();
    }
}
