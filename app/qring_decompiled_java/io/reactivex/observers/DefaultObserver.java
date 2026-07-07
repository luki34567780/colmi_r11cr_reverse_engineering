package io.reactivex.observers;

/* loaded from: classes3.dex */
public abstract class DefaultObserver<T> implements io.reactivex.Observer<T> {
    private io.reactivex.disposables.Disposable upstream;

    protected void onStart() {
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.util.EndConsumerHelper.validate(this.upstream, disposable, getClass())) {
            this.upstream = disposable;
            onStart();
        }
    }

    protected final void cancel() {
        io.reactivex.disposables.Disposable disposable = this.upstream;
        this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        disposable.dispose();
    }
}
