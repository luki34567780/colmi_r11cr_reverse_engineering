package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class MaterializeSingleObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.MaybeObserver<T>, io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
    final io.reactivex.SingleObserver<? super io.reactivex.Notification<T>> downstream;
    io.reactivex.disposables.Disposable upstream;

    public MaterializeSingleObserver(io.reactivex.SingleObserver<? super io.reactivex.Notification<T>> singleObserver) {
        this.downstream = singleObserver;
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        this.downstream.onSuccess(io.reactivex.Notification.createOnComplete());
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        this.downstream.onSuccess(io.reactivex.Notification.createOnNext(t));
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable th) {
        this.downstream.onSuccess(io.reactivex.Notification.createOnError(th));
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.upstream.dispose();
    }
}
