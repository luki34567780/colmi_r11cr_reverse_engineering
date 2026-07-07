package com.bumptech.glide;

/* loaded from: classes.dex */
public class RequestManager implements android.content.ComponentCallbacks2, com.bumptech.glide.manager.LifecycleListener, com.bumptech.glide.ModelTypes<com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable>> {
    private static final com.bumptech.glide.request.RequestOptions DECODE_TYPE_BITMAP = com.bumptech.glide.request.RequestOptions.decodeTypeOf(android.graphics.Bitmap.class).lock();
    private static final com.bumptech.glide.request.RequestOptions DECODE_TYPE_GIF = com.bumptech.glide.request.RequestOptions.decodeTypeOf(com.bumptech.glide.load.resource.gif.GifDrawable.class).lock();
    private static final com.bumptech.glide.request.RequestOptions DOWNLOAD_ONLY_OPTIONS = com.bumptech.glide.request.RequestOptions.diskCacheStrategyOf(com.bumptech.glide.load.engine.DiskCacheStrategy.DATA).priority(com.bumptech.glide.Priority.LOW).skipMemoryCache(true);
    private final java.lang.Runnable addSelfToLifecycle;
    private final com.bumptech.glide.manager.ConnectivityMonitor connectivityMonitor;
    protected final android.content.Context context;
    private final java.util.concurrent.CopyOnWriteArrayList<com.bumptech.glide.request.RequestListener<java.lang.Object>> defaultRequestListeners;
    protected final com.bumptech.glide.Glide glide;
    final com.bumptech.glide.manager.Lifecycle lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private com.bumptech.glide.request.RequestOptions requestOptions;
    private final com.bumptech.glide.manager.RequestTracker requestTracker;
    private final com.bumptech.glide.manager.TargetTracker targetTracker;
    private final com.bumptech.glide.manager.RequestManagerTreeNode treeNode;

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public RequestManager(com.bumptech.glide.Glide glide, com.bumptech.glide.manager.Lifecycle lifecycle, com.bumptech.glide.manager.RequestManagerTreeNode requestManagerTreeNode, android.content.Context context) {
        this(glide, lifecycle, requestManagerTreeNode, new com.bumptech.glide.manager.RequestTracker(), glide.getConnectivityMonitorFactory(), context);
    }

    RequestManager(com.bumptech.glide.Glide glide, com.bumptech.glide.manager.Lifecycle lifecycle, com.bumptech.glide.manager.RequestManagerTreeNode requestManagerTreeNode, com.bumptech.glide.manager.RequestTracker requestTracker, com.bumptech.glide.manager.ConnectivityMonitorFactory connectivityMonitorFactory, android.content.Context context) {
        this.targetTracker = new com.bumptech.glide.manager.TargetTracker();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.bumptech.glide.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                com.bumptech.glide.RequestManager.this.lifecycle.addListener(com.bumptech.glide.RequestManager.this);
            }
        };
        this.addSelfToLifecycle = runnable;
        this.glide = glide;
        this.lifecycle = lifecycle;
        this.treeNode = requestManagerTreeNode;
        this.requestTracker = requestTracker;
        this.context = context;
        com.bumptech.glide.manager.ConnectivityMonitor build = connectivityMonitorFactory.build(context.getApplicationContext(), new com.bumptech.glide.RequestManager.RequestManagerConnectivityListener(requestTracker));
        this.connectivityMonitor = build;
        if (com.bumptech.glide.util.Util.isOnBackgroundThread()) {
            com.bumptech.glide.util.Util.postOnUiThread(runnable);
        } else {
            lifecycle.addListener(this);
        }
        lifecycle.addListener(build);
        this.defaultRequestListeners = new java.util.concurrent.CopyOnWriteArrayList<>(glide.getGlideContext().getDefaultRequestListeners());
        setRequestOptions(glide.getGlideContext().getDefaultRequestOptions());
        glide.registerRequestManager(this);
    }

    protected synchronized void setRequestOptions(com.bumptech.glide.request.RequestOptions requestOptions) {
        this.requestOptions = requestOptions.mo234clone().autoClone();
    }

    private synchronized void updateRequestOptions(com.bumptech.glide.request.RequestOptions requestOptions) {
        this.requestOptions = this.requestOptions.apply(requestOptions);
    }

    public synchronized com.bumptech.glide.RequestManager applyDefaultRequestOptions(com.bumptech.glide.request.RequestOptions requestOptions) {
        updateRequestOptions(requestOptions);
        return this;
    }

    public synchronized com.bumptech.glide.RequestManager setDefaultRequestOptions(com.bumptech.glide.request.RequestOptions requestOptions) {
        setRequestOptions(requestOptions);
        return this;
    }

    public com.bumptech.glide.RequestManager addDefaultRequestListener(com.bumptech.glide.request.RequestListener<java.lang.Object> requestListener) {
        this.defaultRequestListeners.add(requestListener);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z) {
        this.pauseAllRequestsOnTrimMemoryModerate = z;
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.isPaused();
    }

    public synchronized void pauseRequests() {
        this.requestTracker.pauseRequests();
    }

    public synchronized void pauseAllRequests() {
        this.requestTracker.pauseAllRequests();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        java.util.Iterator<com.bumptech.glide.RequestManager> it = this.treeNode.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseAllRequests();
        }
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        java.util.Iterator<com.bumptech.glide.RequestManager> it = this.treeNode.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.requestTracker.resumeRequests();
    }

    public synchronized void resumeRequestsRecursive() {
        com.bumptech.glide.util.Util.assertMainThread();
        resumeRequests();
        java.util.Iterator<com.bumptech.glide.RequestManager> it = this.treeNode.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().resumeRequests();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStop() {
        pauseRequests();
        this.targetTracker.onStop();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        java.util.Iterator<com.bumptech.glide.request.target.Target<?>> it = this.targetTracker.getAll().iterator();
        while (it.hasNext()) {
            clear(it.next());
        }
        this.targetTracker.clear();
        this.requestTracker.clearRequests();
        this.lifecycle.removeListener(this);
        this.lifecycle.removeListener(this.connectivityMonitor);
        com.bumptech.glide.util.Util.removeCallbacksOnUiThread(this.addSelfToLifecycle);
        this.glide.unregisterRequestManager(this);
    }

    public com.bumptech.glide.RequestBuilder<android.graphics.Bitmap> asBitmap() {
        return as(android.graphics.Bitmap.class).apply((com.bumptech.glide.request.BaseRequestOptions<?>) DECODE_TYPE_BITMAP);
    }

    public com.bumptech.glide.RequestBuilder<com.bumptech.glide.load.resource.gif.GifDrawable> asGif() {
        return as(com.bumptech.glide.load.resource.gif.GifDrawable.class).apply((com.bumptech.glide.request.BaseRequestOptions<?>) DECODE_TYPE_GIF);
    }

    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> asDrawable() {
        return as(android.graphics.drawable.Drawable.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(android.graphics.Bitmap bitmap) {
        return asDrawable().load(bitmap);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(android.graphics.drawable.Drawable drawable) {
        return asDrawable().load(drawable);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(java.lang.String str) {
        return asDrawable().load(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(android.net.Uri uri) {
        return asDrawable().load(uri);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(java.io.File file) {
        return asDrawable().load(file);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(java.lang.Integer num) {
        return asDrawable().load(num);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @java.lang.Deprecated
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(java.net.URL url) {
        return asDrawable().load(url);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(byte[] bArr) {
        return asDrawable().load(bArr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(java.lang.Object obj) {
        return asDrawable().load(obj);
    }

    public com.bumptech.glide.RequestBuilder<java.io.File> downloadOnly() {
        return as(java.io.File.class).apply((com.bumptech.glide.request.BaseRequestOptions<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    public com.bumptech.glide.RequestBuilder<java.io.File> download(java.lang.Object obj) {
        return downloadOnly().load(obj);
    }

    public com.bumptech.glide.RequestBuilder<java.io.File> asFile() {
        return as(java.io.File.class).apply((com.bumptech.glide.request.BaseRequestOptions<?>) com.bumptech.glide.request.RequestOptions.skipMemoryCacheOf(true));
    }

    public <ResourceType> com.bumptech.glide.RequestBuilder<ResourceType> as(java.lang.Class<ResourceType> cls) {
        return new com.bumptech.glide.RequestBuilder<>(this.glide, this, cls, this.context);
    }

    public void clear(android.view.View view) {
        clear(new com.bumptech.glide.RequestManager.ClearTarget(view));
    }

    public void clear(com.bumptech.glide.request.target.Target<?> target) {
        if (target == null) {
            return;
        }
        untrackOrDelegate(target);
    }

    private void untrackOrDelegate(com.bumptech.glide.request.target.Target<?> target) {
        boolean untrack = untrack(target);
        com.bumptech.glide.request.Request request = target.getRequest();
        if (untrack || this.glide.removeFromManagers(target) || request == null) {
            return;
        }
        target.setRequest(null);
        request.clear();
    }

    synchronized boolean untrack(com.bumptech.glide.request.target.Target<?> target) {
        com.bumptech.glide.request.Request request = target.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.requestTracker.clearAndRemove(request)) {
            return false;
        }
        this.targetTracker.untrack(target);
        target.setRequest(null);
        return true;
    }

    synchronized void track(com.bumptech.glide.request.target.Target<?> target, com.bumptech.glide.request.Request request) {
        this.targetTracker.track(target);
        this.requestTracker.runRequest(request);
    }

    java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    synchronized com.bumptech.glide.request.RequestOptions getDefaultRequestOptions() {
        return this.requestOptions;
    }

    <T> com.bumptech.glide.TransitionOptions<?, T> getDefaultTransitionOptions(java.lang.Class<T> cls) {
        return this.glide.getGlideContext().getDefaultTransitionOptions(cls);
    }

    public synchronized java.lang.String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    private class RequestManagerConnectivityListener implements com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener {
        private final com.bumptech.glide.manager.RequestTracker requestTracker;

        RequestManagerConnectivityListener(com.bumptech.glide.manager.RequestTracker requestTracker) {
            this.requestTracker = requestTracker;
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public void onConnectivityChanged(boolean z) {
            if (z) {
                synchronized (com.bumptech.glide.RequestManager.this) {
                    this.requestTracker.restartRequests();
                }
            }
        }
    }

    private static class ClearTarget extends com.bumptech.glide.request.target.CustomViewTarget<android.view.View, java.lang.Object> {
        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(android.graphics.drawable.Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        protected void onResourceCleared(android.graphics.drawable.Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition<? super java.lang.Object> transition) {
        }

        ClearTarget(android.view.View view) {
            super(view);
        }
    }
}
