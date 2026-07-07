package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableCount<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, java.lang.Long> {
    public ObservableCount(io.reactivex.ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super java.lang.Long> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableCount.CountObserver(observer));
    }

    static final class CountObserver implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        long count;
        final io.reactivex.Observer<? super java.lang.Long> downstream;
        io.reactivex.disposables.Disposable upstream;

        CountObserver(io.reactivex.Observer<? super java.lang.Long> observer) {
            this.downstream = observer;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object obj) {
            this.count++;
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onNext(java.lang.Long.valueOf(this.count));
            this.downstream.onComplete();
        }
    }
}
