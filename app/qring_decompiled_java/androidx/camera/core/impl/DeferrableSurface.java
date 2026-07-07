package androidx.camera.core.impl;

/* loaded from: classes.dex */
public abstract class DeferrableSurface {
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mTerminationCompleter;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mTerminationFuture;
    private static final java.lang.String TAG = "DeferrableSurface";
    private static final boolean DEBUG = androidx.camera.core.Logger.isDebugEnabled(TAG);
    private static final java.util.concurrent.atomic.AtomicInteger USED_COUNT = new java.util.concurrent.atomic.AtomicInteger(0);
    private static final java.util.concurrent.atomic.AtomicInteger TOTAL_COUNT = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.lang.Object mLock = new java.lang.Object();
    private int mUseCount = 0;
    private boolean mClosed = false;

    protected abstract com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface();

    public static final class SurfaceUnavailableException extends java.lang.Exception {
        public SurfaceUnavailableException(java.lang.String message) {
            super(message);
        }
    }

    public static final class SurfaceClosedException extends java.lang.Exception {
        androidx.camera.core.impl.DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(java.lang.String s, androidx.camera.core.impl.DeferrableSurface surface) {
            super(s);
            this.mDeferrableSurface = surface;
        }

        public androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
            return this.mDeferrableSurface;
        }
    }

    public DeferrableSurface() {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.DeferrableSurface$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.impl.DeferrableSurface.this.m110lambda$new$0$androidxcameracoreimplDeferrableSurface(completer);
            }
        });
        this.mTerminationFuture = future;
        if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
            printGlobalDebugCounts("Surface created", TOTAL_COUNT.incrementAndGet(), USED_COUNT.get());
            final java.lang.String stackTraceString = android.util.Log.getStackTraceString(new java.lang.Exception());
            future.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.DeferrableSurface$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.DeferrableSurface.this.m111lambda$new$1$androidxcameracoreimplDeferrableSurface(stackTraceString);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
    }

    /* renamed from: lambda$new$0$androidx-camera-core-impl-DeferrableSurface, reason: not valid java name */
    public /* synthetic */ java.lang.Object m110lambda$new$0$androidxcameracoreimplDeferrableSurface(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        synchronized (this.mLock) {
            this.mTerminationCompleter = completer;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* renamed from: lambda$new$1$androidx-camera-core-impl-DeferrableSurface, reason: not valid java name */
    public /* synthetic */ void m111lambda$new$1$androidxcameracoreimplDeferrableSurface(java.lang.String str) {
        try {
            this.mTerminationFuture.get();
            printGlobalDebugCounts("Surface terminated", TOTAL_COUNT.decrementAndGet(), USED_COUNT.get());
        } catch (java.lang.Exception e) {
            androidx.camera.core.Logger.e(TAG, "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.mLock) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, java.lang.Boolean.valueOf(this.mClosed), java.lang.Integer.valueOf(this.mUseCount)), e);
            }
        }
    }

    private void printGlobalDebugCounts(java.lang.String prefix, int totalCount, int useCount) {
        if (!DEBUG && androidx.camera.core.Logger.isDebugEnabled(TAG)) {
            androidx.camera.core.Logger.d(TAG, "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        androidx.camera.core.Logger.d(TAG, prefix + "[total_surfaces=" + totalCount + ", used_surfaces=" + useCount + "](" + this + "}");
    }

    public final com.google.common.util.concurrent.ListenableFuture<android.view.Surface> getSurface() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException("DeferrableSurface already closed.", this));
            }
            return provideSurface();
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getTerminationFuture() {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    public void incrementUseCount() throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
        synchronized (this.mLock) {
            int i = this.mUseCount;
            if (i == 0 && this.mClosed) {
                throw new androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException("Cannot begin use on a closed surface.", this);
            }
            this.mUseCount = i + 1;
            if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
                if (this.mUseCount == 1) {
                    printGlobalDebugCounts("New surface in use", TOTAL_COUNT.get(), USED_COUNT.incrementAndGet());
                }
                androidx.camera.core.Logger.d(TAG, "use count+1, useCount=" + this.mUseCount + " " + this);
            }
        }
    }

    public final void close() {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer;
        synchronized (this.mLock) {
            if (this.mClosed) {
                completer = null;
            } else {
                this.mClosed = true;
                if (this.mUseCount == 0) {
                    completer = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                } else {
                    completer = null;
                }
                if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
                    androidx.camera.core.Logger.d(TAG, "surface closed,  useCount=" + this.mUseCount + " closed=true " + this);
                }
            }
        }
        if (completer != null) {
            completer.set(null);
        }
    }

    public void decrementUseCount() {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer;
        synchronized (this.mLock) {
            int i = this.mUseCount;
            if (i == 0) {
                throw new java.lang.IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i2 = i - 1;
            this.mUseCount = i2;
            if (i2 == 0 && this.mClosed) {
                completer = this.mTerminationCompleter;
                this.mTerminationCompleter = null;
            } else {
                completer = null;
            }
            if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
                androidx.camera.core.Logger.d(TAG, "use count-1,  useCount=" + this.mUseCount + " closed=" + this.mClosed + " " + this);
                if (this.mUseCount == 0) {
                    printGlobalDebugCounts("Surface no longer in use", TOTAL_COUNT.get(), USED_COUNT.decrementAndGet());
                }
            }
        }
        if (completer != null) {
            completer.set(null);
        }
    }

    public int getUseCount() {
        int i;
        synchronized (this.mLock) {
            i = this.mUseCount;
        }
        return i;
    }
}
