package io.reactivex;

/* loaded from: classes3.dex */
public interface FlowableEmitter<T> extends io.reactivex.Emitter<T> {
    boolean isCancelled();

    long requested();

    io.reactivex.FlowableEmitter<T> serialize();

    void setCancellable(io.reactivex.functions.Cancellable cancellable);

    void setDisposable(io.reactivex.disposables.Disposable disposable);

    boolean tryOnError(java.lang.Throwable th);
}
