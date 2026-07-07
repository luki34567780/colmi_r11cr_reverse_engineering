package io.reactivex;

/* loaded from: classes3.dex */
public interface ObservableEmitter<T> extends io.reactivex.Emitter<T> {
    boolean isDisposed();

    io.reactivex.ObservableEmitter<T> serialize();

    void setCancellable(io.reactivex.functions.Cancellable cancellable);

    void setDisposable(io.reactivex.disposables.Disposable disposable);

    boolean tryOnError(java.lang.Throwable th);
}
