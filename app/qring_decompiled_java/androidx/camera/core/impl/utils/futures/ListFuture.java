package androidx.camera.core.impl.utils.futures;

/* loaded from: classes.dex */
class ListFuture<V> implements com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> {
    private final boolean mAllMustSucceed;
    java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> mFutures;
    private final java.util.concurrent.atomic.AtomicInteger mRemaining;
    private final com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> mResult = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<java.util.List<V>>() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.util.List<V>> completer) {
            androidx.core.util.Preconditions.checkState(androidx.camera.core.impl.utils.futures.ListFuture.this.mResultNotifier == null, "The result can only set once!");
            androidx.camera.core.impl.utils.futures.ListFuture.this.mResultNotifier = completer;
            return "ListFuture[" + this + "]";
        }
    });
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.util.List<V>> mResultNotifier;
    java.util.List<V> mValues;

    ListFuture(java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures, boolean allMustSucceed, java.util.concurrent.Executor listenerExecutor) {
        this.mFutures = (java.util.List) androidx.core.util.Preconditions.checkNotNull(futures);
        this.mValues = new java.util.ArrayList(futures.size());
        this.mAllMustSucceed = allMustSucceed;
        this.mRemaining = new java.util.concurrent.atomic.AtomicInteger(futures.size());
        init(listenerExecutor);
    }

    private void init(java.util.concurrent.Executor listenerExecutor) {
        addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.camera.core.impl.utils.futures.ListFuture.this.mValues = null;
                androidx.camera.core.impl.utils.futures.ListFuture.this.mFutures = null;
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.set(new java.util.ArrayList(this.mValues));
            return;
        }
        for (int i = 0; i < this.mFutures.size(); i++) {
            this.mValues.add(null);
        }
        java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> list = this.mFutures;
        for (final int i2 = 0; i2 < list.size(); i2++) {
            final com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = list.get(i2);
            listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.core.impl.utils.futures.ListFuture.this.setOneValue(i2, listenableFuture);
                }
            }, listenerExecutor);
        }
    }

    void setOneValue(int i, java.util.concurrent.Future<? extends V> future) {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.util.List<V>> completer;
        java.util.ArrayList arrayList;
        int decrementAndGet;
        java.util.List<V> list = this.mValues;
        if (isDone() || list == null) {
            androidx.core.util.Preconditions.checkState(this.mAllMustSucceed, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        androidx.core.util.Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i, androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(future));
                        decrementAndGet = this.mRemaining.decrementAndGet();
                        androidx.core.util.Preconditions.checkState(decrementAndGet >= 0, "Less than 0 remaining futures");
                    } catch (java.util.concurrent.ExecutionException e) {
                        if (this.mAllMustSucceed) {
                            this.mResultNotifier.setException(e.getCause());
                        }
                        int decrementAndGet2 = this.mRemaining.decrementAndGet();
                        androidx.core.util.Preconditions.checkState(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet2 != 0) {
                            return;
                        }
                        java.util.List<V> list2 = this.mValues;
                        if (list2 != null) {
                            completer = this.mResultNotifier;
                            arrayList = new java.util.ArrayList(list2);
                        }
                    }
                } catch (java.lang.RuntimeException e2) {
                    if (this.mAllMustSucceed) {
                        this.mResultNotifier.setException(e2);
                    }
                    int decrementAndGet3 = this.mRemaining.decrementAndGet();
                    androidx.core.util.Preconditions.checkState(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet3 != 0) {
                        return;
                    }
                    java.util.List<V> list3 = this.mValues;
                    if (list3 != null) {
                        completer = this.mResultNotifier;
                        arrayList = new java.util.ArrayList(list3);
                    }
                }
            } catch (java.lang.Error e3) {
                this.mResultNotifier.setException(e3);
                int decrementAndGet4 = this.mRemaining.decrementAndGet();
                androidx.core.util.Preconditions.checkState(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet4 != 0) {
                    return;
                }
                java.util.List<V> list4 = this.mValues;
                if (list4 != null) {
                    completer = this.mResultNotifier;
                    arrayList = new java.util.ArrayList(list4);
                }
            } catch (java.util.concurrent.CancellationException unused) {
                if (this.mAllMustSucceed) {
                    cancel(false);
                }
                int decrementAndGet5 = this.mRemaining.decrementAndGet();
                androidx.core.util.Preconditions.checkState(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet5 != 0) {
                    return;
                }
                java.util.List<V> list5 = this.mValues;
                if (list5 != null) {
                    completer = this.mResultNotifier;
                    arrayList = new java.util.ArrayList(list5);
                }
            }
            if (decrementAndGet == 0) {
                java.util.List<V> list6 = this.mValues;
                if (list6 != null) {
                    completer = this.mResultNotifier;
                    arrayList = new java.util.ArrayList(list6);
                    completer.set(arrayList);
                    return;
                }
                androidx.core.util.Preconditions.checkState(isDone());
            }
        } catch (java.lang.Throwable th) {
            int decrementAndGet6 = this.mRemaining.decrementAndGet();
            androidx.core.util.Preconditions.checkState(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                java.util.List<V> list7 = this.mValues;
                if (list7 != null) {
                    this.mResultNotifier.set(new java.util.ArrayList(list7));
                } else {
                    androidx.core.util.Preconditions.checkState(isDone());
                }
            }
            throw th;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor) {
        this.mResult.addListener(listener, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> list = this.mFutures;
        if (list != null) {
            java.util.Iterator<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(mayInterruptIfRunning);
            }
        }
        return this.mResult.cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mResult.isDone();
    }

    @Override // java.util.concurrent.Future
    public java.util.List<V> get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        callAllGets();
        return this.mResult.get();
    }

    @Override // java.util.concurrent.Future
    public java.util.List<V> get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return this.mResult.get(timeout, unit);
    }

    private void callAllGets() throws java.lang.InterruptedException {
        java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> list = this.mFutures;
        if (list == null || isDone()) {
            return;
        }
        for (com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture : list) {
            while (!listenableFuture.isDone()) {
                try {
                    listenableFuture.get();
                } catch (java.lang.Error e) {
                    throw e;
                } catch (java.lang.InterruptedException e2) {
                    throw e2;
                } catch (java.lang.Throwable unused) {
                    if (this.mAllMustSucceed) {
                        return;
                    }
                }
            }
        }
    }
}
