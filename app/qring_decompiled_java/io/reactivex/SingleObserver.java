package io.reactivex;

/* loaded from: classes3.dex */
public interface SingleObserver<T> {
    void onError(java.lang.Throwable th);

    void onSubscribe(io.reactivex.disposables.Disposable disposable);

    void onSuccess(T t);
}
