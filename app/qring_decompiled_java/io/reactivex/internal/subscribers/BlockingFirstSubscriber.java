package io.reactivex.internal.subscribers;

/* loaded from: classes3.dex */
public final class BlockingFirstSubscriber<T> extends io.reactivex.internal.subscribers.BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.value == null) {
            this.value = t;
            this.upstream.cancel();
            countDown();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        if (this.value == null) {
            this.error = th;
        } else {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
        countDown();
    }
}
