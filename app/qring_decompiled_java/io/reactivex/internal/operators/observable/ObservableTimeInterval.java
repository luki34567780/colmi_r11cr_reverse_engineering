package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTimeInterval<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.schedulers.Timed<T>> {
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    public ObservableTimeInterval(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(observableSource);
        this.scheduler = scheduler;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableTimeInterval.TimeIntervalObserver(observer, this.unit, this.scheduler));
    }

    static final class TimeIntervalObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> downstream;
        long lastTime;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.disposables.Disposable upstream;

        TimeIntervalObserver(io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> observer, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.downstream = observer;
            this.scheduler = scheduler;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.lastTime = this.scheduler.now(this.unit);
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
            long now = this.scheduler.now(this.unit);
            long j = this.lastTime;
            this.lastTime = now;
            this.downstream.onNext(new io.reactivex.schedulers.Timed(t, now - j, this.unit));
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
