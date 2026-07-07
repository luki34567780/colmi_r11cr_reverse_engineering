package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableOnErrorReturn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;

    public ObservableOnErrorReturn(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> function) {
        super(observableSource);
        this.valueSupplier = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableOnErrorReturn.OnErrorReturnObserver(observer, this.valueSupplier));
    }

    static final class OnErrorReturnObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> downstream;
        io.reactivex.disposables.Disposable upstream;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;

        OnErrorReturnObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> function) {
            this.downstream = observer;
            this.valueSupplier = function;
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
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            try {
                T apply = this.valueSupplier.apply(th);
                if (apply == null) {
                    java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.downstream.onError(nullPointerException);
                } else {
                    this.downstream.onNext(apply);
                    this.downstream.onComplete();
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.downstream.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
