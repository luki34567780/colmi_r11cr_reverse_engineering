package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableMaterialize<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Notification<T>> {
    public ObservableMaterialize(io.reactivex.ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Notification<T>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableMaterialize.MaterializeObserver(observer));
    }

    static final class MaterializeObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super io.reactivex.Notification<T>> downstream;
        io.reactivex.disposables.Disposable upstream;

        MaterializeObserver(io.reactivex.Observer<? super io.reactivex.Notification<T>> observer) {
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
        public void onNext(T t) {
            this.downstream.onNext(io.reactivex.Notification.createOnNext(t));
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.downstream.onNext(io.reactivex.Notification.createOnError(th));
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onNext(io.reactivex.Notification.createOnComplete());
            this.downstream.onComplete();
        }
    }
}
