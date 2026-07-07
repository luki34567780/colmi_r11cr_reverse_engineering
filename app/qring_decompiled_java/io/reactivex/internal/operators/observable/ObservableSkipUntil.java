package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSkipUntil<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<U> other;

    public ObservableSkipUntil(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<U> observableSource2) {
        super(observableSource);
        this.other = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.observers.SerializedObserver serializedObserver = new io.reactivex.observers.SerializedObserver(observer);
        io.reactivex.internal.disposables.ArrayCompositeDisposable arrayCompositeDisposable = new io.reactivex.internal.disposables.ArrayCompositeDisposable(2);
        serializedObserver.onSubscribe(arrayCompositeDisposable);
        io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntilObserver skipUntilObserver = new io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntilObserver(serializedObserver, arrayCompositeDisposable);
        this.other.subscribe(new io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntil(arrayCompositeDisposable, skipUntilObserver, serializedObserver));
        this.source.subscribe(skipUntilObserver);
    }

    static final class SkipUntilObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.internal.disposables.ArrayCompositeDisposable frc;
        volatile boolean notSkipping;
        boolean notSkippingLocal;
        io.reactivex.disposables.Disposable upstream;

        SkipUntilObserver(io.reactivex.Observer<? super T> observer, io.reactivex.internal.disposables.ArrayCompositeDisposable arrayCompositeDisposable) {
            this.downstream = observer;
            this.frc = arrayCompositeDisposable;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.frc.setResource(0, disposable);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.notSkippingLocal) {
                this.downstream.onNext(t);
            } else if (this.notSkipping) {
                this.notSkippingLocal = true;
                this.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.frc.dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.frc.dispose();
            this.downstream.onComplete();
        }
    }

    final class SkipUntil implements io.reactivex.Observer<U> {
        final io.reactivex.internal.disposables.ArrayCompositeDisposable frc;
        final io.reactivex.observers.SerializedObserver<T> serial;
        final io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntilObserver<T> sus;
        io.reactivex.disposables.Disposable upstream;

        SkipUntil(io.reactivex.internal.disposables.ArrayCompositeDisposable arrayCompositeDisposable, io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntilObserver<T> skipUntilObserver, io.reactivex.observers.SerializedObserver<T> serializedObserver) {
            this.frc = arrayCompositeDisposable;
            this.sus = skipUntilObserver;
            this.serial = serializedObserver;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.frc.setResource(1, disposable);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(U u) {
            this.upstream.dispose();
            this.sus.notSkipping = true;
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.frc.dispose();
            this.serial.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.sus.notSkipping = true;
        }
    }
}
