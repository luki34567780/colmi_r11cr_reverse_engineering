package androidx.camera.core.impl.utils.futures;

/* loaded from: classes.dex */
public final class Futures {
    private static final androidx.arch.core.util.Function<?, ?> IDENTITY_FUNCTION = new androidx.arch.core.util.Function<java.lang.Object, java.lang.Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // androidx.arch.core.util.Function
        public java.lang.Object apply(java.lang.Object input) {
            return input;
        }
    };

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(V value) {
        if (value == null) {
            return androidx.camera.core.impl.utils.futures.ImmediateFuture.nullFuture();
        }
        return new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture(value);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable cause) {
        return new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateFailedFuture(cause);
    }

    public static <V> java.util.concurrent.ScheduledFuture<V> immediateFailedScheduledFuture(java.lang.Throwable cause) {
        return new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateFailedScheduledFuture(cause);
    }

    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> input, androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        androidx.camera.core.impl.utils.futures.ChainingListenableFuture chainingListenableFuture = new androidx.camera.core.impl.utils.futures.ChainingListenableFuture(function, input);
        input.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> input, final androidx.arch.core.util.Function<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        androidx.core.util.Preconditions.checkNotNull(function);
        return transformAsync(input, new androidx.camera.core.impl.utils.futures.AsyncFunction<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public com.google.common.util.concurrent.ListenableFuture<O> apply(I input2) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(androidx.arch.core.util.Function.this.apply(input2));
            }
        }, executor);
    }

    public static <V> void propagate(com.google.common.util.concurrent.ListenableFuture<V> input, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> completer) {
        propagateTransform(input, IDENTITY_FUNCTION, completer, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public static <I, O> void propagateTransform(final com.google.common.util.concurrent.ListenableFuture<I> input, final androidx.arch.core.util.Function<? super I, ? extends O> function, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<O> completer, java.util.concurrent.Executor executor) {
        propagateTransform(true, input, function, completer, executor);
    }

    private static <I, O> void propagateTransform(boolean propagateCancellation, final com.google.common.util.concurrent.ListenableFuture<I> input, final androidx.arch.core.util.Function<? super I, ? extends O> function, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<O> completer, java.util.concurrent.Executor executor) {
        androidx.core.util.Preconditions.checkNotNull(input);
        androidx.core.util.Preconditions.checkNotNull(function);
        androidx.core.util.Preconditions.checkNotNull(completer);
        androidx.core.util.Preconditions.checkNotNull(executor);
        addCallback(input, new androidx.camera.core.impl.utils.futures.FutureCallback<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(I result) {
                try {
                    androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this.set(function.apply(result));
                } catch (java.lang.Throwable th) {
                    androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this.setException(th);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable t) {
                androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this.setException(t);
            }
        }, executor);
        if (propagateCancellation) {
            completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public void run() {
                    com.google.common.util.concurrent.ListenableFuture.this.cancel(true);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> nonCancellationPropagating(final com.google.common.util.concurrent.ListenableFuture<V> future) {
        androidx.core.util.Preconditions.checkNotNull(future);
        return future.isDone() ? future : androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.impl.utils.futures.Futures.lambda$nonCancellationPropagating$0(com.google.common.util.concurrent.ListenableFuture.this, completer);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$nonCancellationPropagating$0(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        propagateTransform(false, listenableFuture, IDENTITY_FUNCTION, completer, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        return "nonCancellationPropagating[" + listenableFuture + "]";
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(java.util.Collection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures) {
        return new androidx.camera.core.impl.utils.futures.ListFuture(new java.util.ArrayList(futures), false, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(java.util.Collection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures) {
        return new androidx.camera.core.impl.utils.futures.ListFuture(new java.util.ArrayList(futures), true, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public static <V> void addCallback(final com.google.common.util.concurrent.ListenableFuture<V> future, final androidx.camera.core.impl.utils.futures.FutureCallback<? super V> callback, java.util.concurrent.Executor executor) {
        androidx.core.util.Preconditions.checkNotNull(callback);
        future.addListener(new androidx.camera.core.impl.utils.futures.Futures.CallbackListener(future, callback), executor);
    }

    private static final class CallbackListener<V> implements java.lang.Runnable {
        final androidx.camera.core.impl.utils.futures.FutureCallback<? super V> mCallback;
        final java.util.concurrent.Future<V> mFuture;

        CallbackListener(java.util.concurrent.Future<V> future, androidx.camera.core.impl.utils.futures.FutureCallback<? super V> callback) {
            this.mFuture = future;
            this.mCallback = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mCallback.onSuccess(androidx.camera.core.impl.utils.futures.Futures.getDone(this.mFuture));
            } catch (java.lang.Error e) {
                e = e;
                this.mCallback.onFailure(e);
            } catch (java.lang.RuntimeException e2) {
                e = e2;
                this.mCallback.onFailure(e);
            } catch (java.util.concurrent.ExecutionException e3) {
                this.mCallback.onFailure(e3.getCause());
            }
        }

        public java.lang.String toString() {
            return getClass().getSimpleName() + "," + this.mCallback;
        }
    }

    public static <V> V getDone(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        androidx.core.util.Preconditions.checkState(future.isDone(), "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return v;
    }

    private Futures() {
    }
}
