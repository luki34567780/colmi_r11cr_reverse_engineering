package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSwitchIfEmpty<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<? extends T> other;

    public ObservableSwitchIfEmpty(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<? extends T> observableSource2) {
        super(observableSource);
        this.other = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty.SwitchIfEmptyObserver switchIfEmptyObserver = new io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty.SwitchIfEmptyObserver(observer, this.other);
        observer.onSubscribe(switchIfEmptyObserver.arbiter);
        this.source.subscribe(switchIfEmptyObserver);
    }

    static final class SwitchIfEmptyObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.ObservableSource<? extends T> other;
        boolean empty = true;
        final io.reactivex.internal.disposables.SequentialDisposable arbiter = new io.reactivex.internal.disposables.SequentialDisposable();

        SwitchIfEmptyObserver(io.reactivex.Observer<? super T> observer, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.other = observableSource;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.arbiter.update(disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.empty) {
                this.empty = false;
            }
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.empty) {
                this.empty = false;
                this.other.subscribe(this);
            } else {
                this.downstream.onComplete();
            }
        }
    }
}
