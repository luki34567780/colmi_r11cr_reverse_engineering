package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableGroupBy<T, K, V> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.observables.GroupedObservable<K, V>> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.functions.Function<? super T, ? extends K> keySelector;
    final io.reactivex.functions.Function<? super T, ? extends V> valueSelector;

    public ObservableGroupBy(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends K> function, io.reactivex.functions.Function<? super T, ? extends V> function2, int i, boolean z) {
        super(observableSource);
        this.keySelector = function;
        this.valueSelector = function2;
        this.bufferSize = i;
        this.delayError = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver(observer, this.keySelector, this.valueSelector, this.bufferSize, this.delayError));
    }

    public static final class GroupByObserver<T, K, V> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final java.lang.Object NULL_KEY = new java.lang.Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final boolean delayError;
        final io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> downstream;
        final io.reactivex.functions.Function<? super T, ? extends K> keySelector;
        io.reactivex.disposables.Disposable upstream;
        final io.reactivex.functions.Function<? super T, ? extends V> valueSelector;
        final java.util.concurrent.atomic.AtomicBoolean cancelled = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast<K, V>> groups = new java.util.concurrent.ConcurrentHashMap();

        public GroupByObserver(io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> observer, io.reactivex.functions.Function<? super T, ? extends K> function, io.reactivex.functions.Function<? super T, ? extends V> function2, int i, boolean z) {
            this.downstream = observer;
            this.keySelector = function;
            this.valueSelector = function2;
            this.bufferSize = i;
            this.delayError = z;
            lazySet(1);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast<K, V>>] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v3, types: [io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast] */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            try {
                K apply = this.keySelector.apply(t);
                java.lang.Object obj = apply != null ? apply : NULL_KEY;
                io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast<K, V> groupedUnicast = this.groups.get(obj);
                ?? r2 = groupedUnicast;
                if (groupedUnicast == false) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    java.lang.Object createWith = io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast.createWith(apply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, createWith);
                    getAndIncrement();
                    this.downstream.onNext(createWith);
                    r2 = createWith;
                }
                try {
                    r2.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.valueSelector.apply(t), "The value supplied is null"));
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.upstream.dispose();
                    onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.groups.values());
            this.groups.clear();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast) it.next()).onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.groups.values());
            this.groups.clear();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast) it.next()).onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled.get();
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) NULL_KEY;
            }
            this.groups.remove(k);
            if (decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }
    }

    static final class GroupedUnicast<K, T> extends io.reactivex.observables.GroupedObservable<K, T> {
        final io.reactivex.internal.operators.observable.ObservableGroupBy.State<T, K> state;

        public static <T, K> io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast<K, T> createWith(K k, int i, io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver<?, K, T> groupByObserver, boolean z) {
            return new io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast<>(k, new io.reactivex.internal.operators.observable.ObservableGroupBy.State(i, groupByObserver, k, z));
        }

        protected GroupedUnicast(K k, io.reactivex.internal.operators.observable.ObservableGroupBy.State<T, K> state) {
            super(k);
            this.state = state;
        }

        @Override // io.reactivex.Observable
        protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
            this.state.subscribe(observer);
        }

        public void onNext(T t) {
            this.state.onNext(t);
        }

        public void onError(java.lang.Throwable th) {
            this.state.onError(th);
        }

        public void onComplete() {
            this.state.onComplete();
        }
    }

    static final class State<T, K> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.ObservableSource<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final K key;
        final io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver<?, K, T> parent;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
        final java.util.concurrent.atomic.AtomicBoolean cancelled = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> actual = new java.util.concurrent.atomic.AtomicReference<>();

        State(int i, io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver<?, K, T> groupByObserver, K k, boolean z) {
            this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.parent = groupByObserver;
            this.key = k;
            this.delayError = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.actual.lazySet(null);
                this.parent.cancel(this.key);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled.get();
        }

        @Override // io.reactivex.ObservableSource
        public void subscribe(io.reactivex.Observer<? super T> observer) {
            if (this.once.compareAndSet(false, true)) {
                observer.onSubscribe(this);
                this.actual.lazySet(observer);
                if (this.cancelled.get()) {
                    this.actual.lazySet(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.IllegalStateException("Only one Observer allowed!"), observer);
        }

        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        public void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            boolean z = this.delayError;
            io.reactivex.Observer<? super T> observer = this.actual.get();
            int i = 1;
            while (true) {
                if (observer != null) {
                    while (true) {
                        boolean z2 = this.done;
                        T poll = spscLinkedArrayQueue.poll();
                        boolean z3 = poll == null;
                        if (checkTerminated(z2, z3, observer, z)) {
                            return;
                        }
                        if (z3) {
                            break;
                        } else {
                            observer.onNext(poll);
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (observer == null) {
                    observer = this.actual.get();
                }
            }
        }

        boolean checkTerminated(boolean z, boolean z2, io.reactivex.Observer<? super T> observer, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.cancel(this.key);
                this.actual.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                java.lang.Throwable th = this.error;
                this.actual.lazySet(null);
                if (th != null) {
                    observer.onError(th);
                } else {
                    observer.onComplete();
                }
                return true;
            }
            java.lang.Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                this.actual.lazySet(null);
                observer.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.actual.lazySet(null);
            observer.onComplete();
            return true;
        }
    }
}
