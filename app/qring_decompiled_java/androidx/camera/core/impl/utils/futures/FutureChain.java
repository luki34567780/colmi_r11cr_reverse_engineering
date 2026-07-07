package androidx.camera.core.impl.utils.futures;

/* loaded from: classes.dex */
public class FutureChain<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> mCompleter;
    private final com.google.common.util.concurrent.ListenableFuture<V> mDelegate;

    public static <V> androidx.camera.core.impl.utils.futures.FutureChain<V> from(com.google.common.util.concurrent.ListenableFuture<V> future) {
        return future instanceof androidx.camera.core.impl.utils.futures.FutureChain ? (androidx.camera.core.impl.utils.futures.FutureChain) future : new androidx.camera.core.impl.utils.futures.FutureChain<>(future);
    }

    public final <T> androidx.camera.core.impl.utils.futures.FutureChain<T> transformAsync(androidx.camera.core.impl.utils.futures.AsyncFunction<? super V, T> function, java.util.concurrent.Executor executor) {
        return (androidx.camera.core.impl.utils.futures.FutureChain) androidx.camera.core.impl.utils.futures.Futures.transformAsync(this, function, executor);
    }

    public final <T> androidx.camera.core.impl.utils.futures.FutureChain<T> transform(androidx.arch.core.util.Function<? super V, T> function, java.util.concurrent.Executor executor) {
        return (androidx.camera.core.impl.utils.futures.FutureChain) androidx.camera.core.impl.utils.futures.Futures.transform(this, function, executor);
    }

    public final void addCallback(androidx.camera.core.impl.utils.futures.FutureCallback<? super V> callback, java.util.concurrent.Executor executor) {
        androidx.camera.core.impl.utils.futures.Futures.addCallback(this, callback, executor);
    }

    FutureChain(com.google.common.util.concurrent.ListenableFuture<V> delegate) {
        this.mDelegate = (com.google.common.util.concurrent.ListenableFuture) androidx.core.util.Preconditions.checkNotNull(delegate);
    }

    FutureChain() {
        this.mDelegate = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<V>() { // from class: androidx.camera.core.impl.utils.futures.FutureChain.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> completer) {
                androidx.core.util.Preconditions.checkState(androidx.camera.core.impl.utils.futures.FutureChain.this.mCompleter == null, "The result can only set once!");
                androidx.camera.core.impl.utils.futures.FutureChain.this.mCompleter = completer;
                return "FutureChain[" + androidx.camera.core.impl.utils.futures.FutureChain.this + "]";
            }
        });
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor) {
        this.mDelegate.addListener(listener, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return this.mDelegate.cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mDelegate.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return this.mDelegate.get();
    }

    @Override // java.util.concurrent.Future
    public V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return this.mDelegate.get(timeout, unit);
    }

    boolean set(V value) {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> completer = this.mCompleter;
        if (completer != null) {
            return completer.set(value);
        }
        return false;
    }

    boolean setException(java.lang.Throwable throwable) {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> completer = this.mCompleter;
        if (completer != null) {
            return completer.setException(throwable);
        }
        return false;
    }
}
