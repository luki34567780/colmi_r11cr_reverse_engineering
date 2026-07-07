package io.reactivex;

/* loaded from: classes3.dex */
public interface SingleEmitter<T> {
    boolean isDisposed();

    void onError(java.lang.Throwable th);

    void onSuccess(T t);

    void setCancellable(io.reactivex.functions.Cancellable cancellable);

    void setDisposable(io.reactivex.disposables.Disposable disposable);

    boolean tryOnError(java.lang.Throwable th);
}
