package io.reactivex.disposables;

/* loaded from: classes3.dex */
public final class SerialDisposable implements io.reactivex.disposables.Disposable {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> resource;

    public SerialDisposable() {
        this.resource = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public SerialDisposable(io.reactivex.disposables.Disposable disposable) {
        this.resource = new java.util.concurrent.atomic.AtomicReference<>(disposable);
    }

    public boolean set(io.reactivex.disposables.Disposable disposable) {
        return io.reactivex.internal.disposables.DisposableHelper.set(this.resource, disposable);
    }

    public boolean replace(io.reactivex.disposables.Disposable disposable) {
        return io.reactivex.internal.disposables.DisposableHelper.replace(this.resource, disposable);
    }

    public io.reactivex.disposables.Disposable get() {
        io.reactivex.disposables.Disposable disposable = this.resource.get();
        return disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED ? io.reactivex.disposables.Disposables.disposed() : disposable;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this.resource);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.resource.get());
    }
}
