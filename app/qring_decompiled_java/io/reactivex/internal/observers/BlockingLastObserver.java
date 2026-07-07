package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class BlockingLastObserver<T> extends io.reactivex.internal.observers.BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onNext(T t) {
        this.value = t;
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        this.value = null;
        this.error = th;
        countDown();
    }
}
