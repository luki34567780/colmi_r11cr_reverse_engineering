package io.reactivex;

/* loaded from: classes3.dex */
public interface CompletableObserver {
    void onComplete();

    void onError(java.lang.Throwable th);

    void onSubscribe(io.reactivex.disposables.Disposable disposable);
}
