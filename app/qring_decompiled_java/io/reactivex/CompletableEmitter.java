package io.reactivex;

/* loaded from: classes3.dex */
public interface CompletableEmitter {
    boolean isDisposed();

    void onComplete();

    void onError(java.lang.Throwable th);

    void setCancellable(io.reactivex.functions.Cancellable cancellable);

    void setDisposable(io.reactivex.disposables.Disposable disposable);

    boolean tryOnError(java.lang.Throwable th);
}
