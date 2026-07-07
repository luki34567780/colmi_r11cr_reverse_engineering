package androidx.camera.core.impl.utils.futures;

/* loaded from: classes.dex */
abstract class ImmediateFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    private static final java.lang.String TAG = "ImmediateFuture";

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws java.util.concurrent.ExecutionException;

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    ImmediateFuture() {
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> nullFuture() {
        return androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture.NULL_FUTURE;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor) {
        androidx.core.util.Preconditions.checkNotNull(listener);
        androidx.core.util.Preconditions.checkNotNull(executor);
        try {
            executor.execute(listener);
        } catch (java.lang.RuntimeException e) {
            androidx.camera.core.Logger.e(TAG, "Experienced RuntimeException while attempting to notify " + listener + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.ExecutionException {
        androidx.core.util.Preconditions.checkNotNull(unit);
        return get();
    }

    static final class ImmediateSuccessfulFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture<V> {
        static final androidx.camera.core.impl.utils.futures.ImmediateFuture<java.lang.Object> NULL_FUTURE = new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture(null);
        private final V mValue;

        ImmediateSuccessfulFuture(V value) {
            this.mValue = value;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        public V get() {
            return this.mValue;
        }

        public java.lang.String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.mValue + "]]";
        }
    }

    static class ImmediateFailedFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture<V> {
        private final java.lang.Throwable mCause;

        ImmediateFailedFuture(java.lang.Throwable cause) {
            this.mCause = cause;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        public V get() throws java.util.concurrent.ExecutionException {
            throw new java.util.concurrent.ExecutionException(this.mCause);
        }

        public java.lang.String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.mCause + "]]";
        }
    }

    static final class ImmediateFailedScheduledFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateFailedFuture<V> implements java.util.concurrent.ScheduledFuture<V> {
        @Override // java.lang.Comparable
        public int compareTo(java.util.concurrent.Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(java.util.concurrent.TimeUnit timeUnit) {
            return 0L;
        }

        ImmediateFailedScheduledFuture(java.lang.Throwable cause) {
            super(cause);
        }
    }
}
