package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSampleWithObservable<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final boolean emitLast;
    final io.reactivex.ObservableSource<?> other;

    public ObservableSampleWithObservable(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<?> observableSource2, boolean z) {
        super(observableSource);
        this.other = observableSource2;
        this.emitLast = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.observers.SerializedObserver serializedObserver = new io.reactivex.observers.SerializedObserver(observer);
        if (this.emitLast) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainEmitLast(serializedObserver, this.other));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainNoLast(serializedObserver, this.other));
        }
    }

    static abstract class SampleMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -3517602651313910099L;
        final io.reactivex.Observer<? super T> downstream;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> other = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.ObservableSource<?> sampler;
        io.reactivex.disposables.Disposable upstream;

        abstract void completion();

        abstract void run();

        SampleMainObserver(io.reactivex.Observer<? super T> observer, io.reactivex.ObservableSource<?> observableSource) {
            this.downstream = observer;
            this.sampler = observableSource;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SamplerObserver(this));
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
            completion();
        }

        boolean setOther(io.reactivex.disposables.Disposable disposable) {
            return io.reactivex.internal.disposables.DisposableHelper.setOnce(this.other, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.other);
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.other.get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        public void error(java.lang.Throwable th) {
            this.upstream.dispose();
            this.downstream.onError(th);
        }

        public void complete() {
            this.upstream.dispose();
            completion();
        }

        void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }
    }

    static final class SamplerObserver<T> implements io.reactivex.Observer<java.lang.Object> {
        final io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> parent;

        SamplerObserver(io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> sampleMainObserver) {
            this.parent = sampleMainObserver;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.parent.setOther(disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object obj) {
            this.parent.run();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.parent.error(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.complete();
        }
    }

    static final class SampleMainNoLast<T> extends io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(io.reactivex.Observer<? super T> observer, io.reactivex.ObservableSource<?> observableSource) {
            super(observer, observableSource);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void completion() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void run() {
            emit();
        }
    }

    static final class SampleMainEmitLast<T> extends io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final java.util.concurrent.atomic.AtomicInteger wip;

        SampleMainEmitLast(io.reactivex.Observer<? super T> observer, io.reactivex.ObservableSource<?> observableSource) {
            super(observer, observableSource);
            this.wip = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void completion() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z = this.done;
                    emit();
                    if (z) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }
    }
}
