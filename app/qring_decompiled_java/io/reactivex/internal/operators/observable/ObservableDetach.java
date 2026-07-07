package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDetach<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    public ObservableDetach(io.reactivex.ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDetach.DetachObserver(observer));
    }

    static final class DetachObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.Observer<? super T> downstream;
        io.reactivex.disposables.Disposable upstream;

        DetachObserver(io.reactivex.Observer<? super T> observer) {
            this.downstream = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.disposables.Disposable disposable = this.upstream;
            this.upstream = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.downstream = io.reactivex.internal.util.EmptyComponent.asObserver();
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            io.reactivex.Observer<? super T> observer = this.downstream;
            this.upstream = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.downstream = io.reactivex.internal.util.EmptyComponent.asObserver();
            observer.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            io.reactivex.Observer<? super T> observer = this.downstream;
            this.upstream = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.downstream = io.reactivex.internal.util.EmptyComponent.asObserver();
            observer.onComplete();
        }
    }
}
