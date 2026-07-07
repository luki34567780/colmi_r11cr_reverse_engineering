package io.reactivex.observers;

/* loaded from: classes3.dex */
public class TestObserver<T> extends io.reactivex.observers.BaseTestConsumer<T, io.reactivex.observers.TestObserver<T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.MaybeObserver<T>, io.reactivex.SingleObserver<T>, io.reactivex.CompletableObserver {
    private final io.reactivex.Observer<? super T> downstream;
    private io.reactivex.internal.fuseable.QueueDisposable<T> qd;
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream;

    enum EmptyObserver implements io.reactivex.Observer<java.lang.Object> {
        INSTANCE;

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object obj) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        }
    }

    public static <T> io.reactivex.observers.TestObserver<T> create() {
        return new io.reactivex.observers.TestObserver<>();
    }

    public static <T> io.reactivex.observers.TestObserver<T> create(io.reactivex.Observer<? super T> observer) {
        return new io.reactivex.observers.TestObserver<>(observer);
    }

    public TestObserver() {
        this(io.reactivex.observers.TestObserver.EmptyObserver.INSTANCE);
    }

    public TestObserver(io.reactivex.Observer<? super T> observer) {
        this.upstream = new java.util.concurrent.atomic.AtomicReference<>();
        this.downstream = observer;
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        this.lastThread = java.lang.Thread.currentThread();
        if (disposable == null) {
            this.errors.add(new java.lang.NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!this.upstream.compareAndSet(null, disposable)) {
            disposable.dispose();
            if (this.upstream.get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.errors.add(new java.lang.IllegalStateException("onSubscribe received multiple subscriptions: " + disposable));
                return;
            }
            return;
        }
        if (this.initialFusionMode != 0 && (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable)) {
            io.reactivex.internal.fuseable.QueueDisposable<T> queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
            this.qd = queueDisposable;
            int requestFusion = queueDisposable.requestFusion(this.initialFusionMode);
            this.establishedFusionMode = requestFusion;
            if (requestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = java.lang.Thread.currentThread();
                while (true) {
                    try {
                        T poll = this.qd.poll();
                        if (poll != null) {
                            this.values.add(poll);
                        } else {
                            this.completions++;
                            this.upstream.lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        this.errors.add(th);
                        return;
                    }
                }
            }
        }
        this.downstream.onSubscribe(disposable);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new java.lang.IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = java.lang.Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t);
            if (t == null) {
                this.errors.add(new java.lang.NullPointerException("onNext received a null value"));
            }
            this.downstream.onNext(t);
            return;
        }
        while (true) {
            try {
                T poll = this.qd.poll();
                if (poll == null) {
                    return;
                } else {
                    this.values.add(poll);
                }
            } catch (java.lang.Throwable th) {
                this.errors.add(th);
                this.qd.dispose();
                return;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new java.lang.IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = java.lang.Thread.currentThread();
            if (th == null) {
                this.errors.add(new java.lang.NullPointerException("onError received a null Throwable"));
            } else {
                this.errors.add(th);
            }
            this.downstream.onError(th);
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new java.lang.IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = java.lang.Thread.currentThread();
            this.completions++;
            this.downstream.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    public final boolean isCancelled() {
        return isDisposed();
    }

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.upstream.get());
    }

    public final boolean hasSubscription() {
        return this.upstream.get() != null;
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final io.reactivex.observers.TestObserver<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final io.reactivex.observers.TestObserver<T> assertNotSubscribed() {
        if (this.upstream.get() != null) {
            throw fail("Subscribed!");
        }
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Not subscribed but errors found");
    }

    public final io.reactivex.observers.TestObserver<T> assertOf(io.reactivex.functions.Consumer<? super io.reactivex.observers.TestObserver<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    final io.reactivex.observers.TestObserver<T> setInitialFusionMode(int i) {
        this.initialFusionMode = i;
        return this;
    }

    final io.reactivex.observers.TestObserver<T> assertFusionMode(int i) {
        int i2 = this.establishedFusionMode;
        if (i2 == i) {
            return this;
        }
        if (this.qd != null) {
            throw new java.lang.AssertionError("Fusion mode different. Expected: " + fusionModeToString(i) + ", actual: " + fusionModeToString(i2));
        }
        throw fail("Upstream is not fuseable");
    }

    static java.lang.String fusionModeToString(int i) {
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return "SYNC";
        }
        if (i == 2) {
            return "ASYNC";
        }
        return "Unknown(" + i + ")";
    }

    final io.reactivex.observers.TestObserver<T> assertFuseable() {
        if (this.qd != null) {
            return this;
        }
        throw new java.lang.AssertionError("Upstream is not fuseable.");
    }

    final io.reactivex.observers.TestObserver<T> assertNotFuseable() {
        if (this.qd == null) {
            return this;
        }
        throw new java.lang.AssertionError("Upstream is fuseable.");
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }
}
