package com.bumptech.glide.request;

/* loaded from: /tmp/dex/classes2.dex */
public class RequestFutureTarget<R> implements com.bumptech.glide.request.FutureTarget<R>, com.bumptech.glide.request.RequestListener<R> {
    private static final com.bumptech.glide.request.RequestFutureTarget.Waiter DEFAULT_WAITER = new com.bumptech.glide.request.RequestFutureTarget.Waiter();
    private final boolean assertBackgroundThread;
    private com.bumptech.glide.load.engine.GlideException exception;
    private final int height;
    private boolean isCancelled;
    private boolean loadFailed;
    private com.bumptech.glide.request.Request request;
    private R resource;
    private boolean resultReceived;
    private final com.bumptech.glide.request.RequestFutureTarget.Waiter waiter;
    private final int width;

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(android.graphics.drawable.Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(android.graphics.drawable.Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
    }

    public RequestFutureTarget(int i, int i2) {
        this(i, i2, true, DEFAULT_WAITER);
    }

    RequestFutureTarget(int i, int i2, boolean z, com.bumptech.glide.request.RequestFutureTarget.Waiter waiter) {
        this.width = i;
        this.height = i2;
        this.assertBackgroundThread = z;
        this.waiter = waiter;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.isCancelled = true;
            this.waiter.notifyAll(this);
            com.bumptech.glide.request.Request request = null;
            if (z) {
                com.bumptech.glide.request.Request request2 = this.request;
                this.request = null;
                request = request2;
            }
            if (request != null) {
                request.clear();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.isCancelled;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.isCancelled && !this.resultReceived) {
            z = this.loadFailed;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public R get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        try {
            return doGet(null);
        } catch (java.util.concurrent.TimeoutException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public R get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return doGet(java.lang.Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // com.bumptech.glide.request.target.Target
    public void getSize(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.width, this.height);
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void setRequest(com.bumptech.glide.request.Request request) {
        this.request = request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized com.bumptech.glide.request.Request getRequest() {
        return this.request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onLoadFailed(android.graphics.drawable.Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onResourceReady(R r, com.bumptech.glide.request.transition.Transition<? super R> transition) {
    }

    private synchronized R doGet(java.lang.Long l) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (this.assertBackgroundThread && !isDone()) {
            com.bumptech.glide.util.Util.assertBackgroundThread();
        }
        if (this.isCancelled) {
            throw new java.util.concurrent.CancellationException();
        }
        if (this.loadFailed) {
            throw new java.util.concurrent.ExecutionException((java.lang.Throwable) this.exception);
        }
        if (this.resultReceived) {
            return this.resource;
        }
        if (l == null) {
            this.waiter.waitForTimeout(this, 0L);
        } else if (l.longValue() > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long longValue = l.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                this.waiter.waitForTimeout(this, longValue - currentTimeMillis);
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
        }
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        if (this.loadFailed) {
            throw new java.util.concurrent.ExecutionException((java.lang.Throwable) this.exception);
        }
        if (this.isCancelled) {
            throw new java.util.concurrent.CancellationException();
        }
        if (!this.resultReceived) {
            throw new java.util.concurrent.TimeoutException();
        }
        return this.resource;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onLoadFailed(com.bumptech.glide.load.engine.GlideException glideException, java.lang.Object obj, com.bumptech.glide.request.target.Target<R> target, boolean z) {
        this.loadFailed = true;
        this.exception = glideException;
        this.waiter.notifyAll(this);
        return false;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onResourceReady(R r, java.lang.Object obj, com.bumptech.glide.request.target.Target<R> target, com.bumptech.glide.load.DataSource dataSource, boolean z) {
        this.resultReceived = true;
        this.resource = r;
        this.waiter.notifyAll(this);
        return false;
    }

    static class Waiter {
        Waiter() {
        }

        void waitForTimeout(java.lang.Object obj, long j) throws java.lang.InterruptedException {
            obj.wait(j);
        }

        void notifyAll(java.lang.Object obj) {
            obj.notifyAll();
        }
    }
}
