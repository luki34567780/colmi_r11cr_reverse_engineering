package io.reactivex.subscribers;

/* loaded from: classes3.dex */
public class TestSubscriber<T> extends io.reactivex.observers.BaseTestConsumer<T, io.reactivex.subscribers.TestSubscriber<T>> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
    private volatile boolean cancelled;
    private final org.reactivestreams.Subscriber<? super T> downstream;
    private final java.util.concurrent.atomic.AtomicLong missedRequested;
    private io.reactivex.internal.fuseable.QueueSubscription<T> qs;
    private final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;

    enum EmptySubscriber implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        INSTANCE;

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
        }
    }

    protected void onStart() {
    }

    public static <T> io.reactivex.subscribers.TestSubscriber<T> create() {
        return new io.reactivex.subscribers.TestSubscriber<>();
    }

    public static <T> io.reactivex.subscribers.TestSubscriber<T> create(long j) {
        return new io.reactivex.subscribers.TestSubscriber<>(j);
    }

    public static <T> io.reactivex.subscribers.TestSubscriber<T> create(org.reactivestreams.Subscriber<? super T> subscriber) {
        return new io.reactivex.subscribers.TestSubscriber<>(subscriber);
    }

    public TestSubscriber() {
        this(io.reactivex.subscribers.TestSubscriber.EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public TestSubscriber(long j) {
        this(io.reactivex.subscribers.TestSubscriber.EmptySubscriber.INSTANCE, j);
    }

    public TestSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
        this(subscriber, Long.MAX_VALUE);
    }

    public TestSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Negative initial request not allowed");
        }
        this.downstream = subscriber;
        this.upstream = new java.util.concurrent.atomic.AtomicReference<>();
        this.missedRequested = new java.util.concurrent.atomic.AtomicLong(j);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        this.lastThread = java.lang.Thread.currentThread();
        if (subscription == null) {
            this.errors.add(new java.lang.NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!this.upstream.compareAndSet(null, subscription)) {
            subscription.cancel();
            if (this.upstream.get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.errors.add(new java.lang.IllegalStateException("onSubscribe received multiple subscriptions: " + subscription));
                return;
            }
            return;
        }
        if (this.initialFusionMode != 0 && (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription)) {
            io.reactivex.internal.fuseable.QueueSubscription<T> queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
            this.qs = queueSubscription;
            int requestFusion = queueSubscription.requestFusion(this.initialFusionMode);
            this.establishedFusionMode = requestFusion;
            if (requestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = java.lang.Thread.currentThread();
                while (true) {
                    try {
                        T poll = this.qs.poll();
                        if (poll != null) {
                            this.values.add(poll);
                        } else {
                            this.completions++;
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        this.errors.add(th);
                        return;
                    }
                }
            }
        }
        this.downstream.onSubscribe(subscription);
        long andSet = this.missedRequested.getAndSet(0L);
        if (andSet != 0) {
            subscription.request(andSet);
        }
        onStart();
    }

    @Override // org.reactivestreams.Subscriber
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
                T poll = this.qs.poll();
                if (poll == null) {
                    return;
                } else {
                    this.values.add(poll);
                }
            } catch (java.lang.Throwable th) {
                this.errors.add(th);
                this.qs.cancel();
                return;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new java.lang.NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = java.lang.Thread.currentThread();
            this.errors.add(th);
            if (th == null) {
                this.errors.add(new java.lang.IllegalStateException("onError received a null Throwable"));
            }
            this.downstream.onError(th);
        } finally {
            this.done.countDown();
        }
    }

    @Override // org.reactivestreams.Subscriber
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

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.upstream);
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    public final boolean hasSubscription() {
        return this.upstream.get() != null;
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final io.reactivex.subscribers.TestSubscriber<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final io.reactivex.subscribers.TestSubscriber<T> assertNotSubscribed() {
        if (this.upstream.get() != null) {
            throw fail("Subscribed!");
        }
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Not subscribed but errors found");
    }

    final io.reactivex.subscribers.TestSubscriber<T> setInitialFusionMode(int i) {
        this.initialFusionMode = i;
        return this;
    }

    final io.reactivex.subscribers.TestSubscriber<T> assertFusionMode(int i) {
        int i2 = this.establishedFusionMode;
        if (i2 == i) {
            return this;
        }
        if (this.qs != null) {
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

    final io.reactivex.subscribers.TestSubscriber<T> assertFuseable() {
        if (this.qs != null) {
            return this;
        }
        throw new java.lang.AssertionError("Upstream is not fuseable.");
    }

    final io.reactivex.subscribers.TestSubscriber<T> assertNotFuseable() {
        if (this.qs == null) {
            return this;
        }
        throw new java.lang.AssertionError("Upstream is fuseable.");
    }

    public final io.reactivex.subscribers.TestSubscriber<T> assertOf(io.reactivex.functions.Consumer<? super io.reactivex.subscribers.TestSubscriber<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    public final io.reactivex.subscribers.TestSubscriber<T> requestMore(long j) {
        request(j);
        return this;
    }
}
