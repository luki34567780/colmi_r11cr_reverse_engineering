package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class ResumeSingleObserver<T> implements io.reactivex.SingleObserver<T> {
    final io.reactivex.SingleObserver<? super T> downstream;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

    public ResumeSingleObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.SingleObserver<? super T> singleObserver) {
        this.parent = atomicReference;
        this.downstream = singleObserver;
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.replace(this.parent, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable th) {
        this.downstream.onError(th);
    }
}
