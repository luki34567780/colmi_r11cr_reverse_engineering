package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDelay<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    public ObservableDelay(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        super(observableSource);
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver(this.delayError ? observer : new io.reactivex.observers.SerializedObserver(observer), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }

    static final class DelayObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final long delay;
        final boolean delayError;
        final io.reactivex.Observer<? super T> downstream;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.disposables.Disposable upstream;
        final io.reactivex.Scheduler.Worker w;

        DelayObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, boolean z) {
            this.downstream = observer;
            this.delay = j;
            this.unit = timeUnit;
            this.w = worker;
            this.delayError = z;
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
            this.w.schedule(new io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.OnNext(t), this.delay, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.w.schedule(new io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.w.schedule(new io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.w.isDisposed();
        }

        final class OnNext implements java.lang.Runnable {
            private final T t;

            OnNext(T t) {
                this.t = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.this.downstream.onNext(this.t);
            }
        }

        final class OnError implements java.lang.Runnable {
            private final java.lang.Throwable throwable;

            OnError(java.lang.Throwable th) {
                this.throwable = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.this.downstream.onError(this.throwable);
                } finally {
                    io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.this.w.dispose();
                }
            }
        }

        final class OnComplete implements java.lang.Runnable {
            OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.this.downstream.onComplete();
                } finally {
                    io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.this.w.dispose();
                }
            }
        }
    }
}
