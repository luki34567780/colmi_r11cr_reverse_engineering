package io.reactivex;

/* loaded from: classes3.dex */
public interface Emitter<T> {
    void onComplete();

    void onError(java.lang.Throwable th);

    void onNext(T t);
}
