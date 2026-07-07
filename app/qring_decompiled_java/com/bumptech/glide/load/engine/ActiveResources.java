package com.bumptech.glide.load.engine;

/* loaded from: classes.dex */
final class ActiveResources {
    final java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference> activeEngineResources;
    private volatile com.bumptech.glide.load.engine.ActiveResources.DequeuedResourceCallback cb;
    private final boolean isActiveResourceRetentionAllowed;
    private volatile boolean isShutdown;
    private com.bumptech.glide.load.engine.EngineResource.ResourceListener listener;
    private final java.util.concurrent.Executor monitorClearedResourcesExecutor;
    private final java.lang.ref.ReferenceQueue<com.bumptech.glide.load.engine.EngineResource<?>> resourceReferenceQueue;

    interface DequeuedResourceCallback {
        void onResourceDequeued();
    }

    ActiveResources(boolean z) {
        this(z, java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: com.bumptech.glide.load.engine.ActiveResources.1
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(final java.lang.Runnable runnable) {
                return new java.lang.Thread(new java.lang.Runnable() { // from class: com.bumptech.glide.load.engine.ActiveResources.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        android.os.Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    ActiveResources(boolean z, java.util.concurrent.Executor executor) {
        this.activeEngineResources = new java.util.HashMap();
        this.resourceReferenceQueue = new java.lang.ref.ReferenceQueue<>();
        this.isActiveResourceRetentionAllowed = z;
        this.monitorClearedResourcesExecutor = executor;
        executor.execute(new java.lang.Runnable() { // from class: com.bumptech.glide.load.engine.ActiveResources.2
            @Override // java.lang.Runnable
            public void run() {
                com.bumptech.glide.load.engine.ActiveResources.this.cleanReferenceQueue();
            }
        });
    }

    void setListener(com.bumptech.glide.load.engine.EngineResource.ResourceListener resourceListener) {
        synchronized (resourceListener) {
            synchronized (this) {
                this.listener = resourceListener;
            }
        }
    }

    synchronized void activate(com.bumptech.glide.load.Key key, com.bumptech.glide.load.engine.EngineResource<?> engineResource) {
        com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference put = this.activeEngineResources.put(key, new com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference(key, engineResource, this.resourceReferenceQueue, this.isActiveResourceRetentionAllowed));
        if (put != null) {
            put.reset();
        }
    }

    synchronized void deactivate(com.bumptech.glide.load.Key key) {
        com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference remove = this.activeEngineResources.remove(key);
        if (remove != null) {
            remove.reset();
        }
    }

    synchronized com.bumptech.glide.load.engine.EngineResource<?> get(com.bumptech.glide.load.Key key) {
        com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference resourceWeakReference = this.activeEngineResources.get(key);
        if (resourceWeakReference == null) {
            return null;
        }
        com.bumptech.glide.load.engine.EngineResource<?> engineResource = (com.bumptech.glide.load.engine.EngineResource) resourceWeakReference.get();
        if (engineResource == null) {
            cleanupActiveReference(resourceWeakReference);
        }
        return engineResource;
    }

    void cleanupActiveReference(com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference resourceWeakReference) {
        synchronized (this) {
            this.activeEngineResources.remove(resourceWeakReference.key);
            if (resourceWeakReference.isCacheable && resourceWeakReference.resource != null) {
                this.listener.onResourceReleased(resourceWeakReference.key, new com.bumptech.glide.load.engine.EngineResource<>(resourceWeakReference.resource, true, false, resourceWeakReference.key, this.listener));
            }
        }
    }

    void cleanReferenceQueue() {
        while (!this.isShutdown) {
            try {
                cleanupActiveReference((com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference) this.resourceReferenceQueue.remove());
                com.bumptech.glide.load.engine.ActiveResources.DequeuedResourceCallback dequeuedResourceCallback = this.cb;
                if (dequeuedResourceCallback != null) {
                    dequeuedResourceCallback.onResourceDequeued();
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    void setDequeuedResourceCallback(com.bumptech.glide.load.engine.ActiveResources.DequeuedResourceCallback dequeuedResourceCallback) {
        this.cb = dequeuedResourceCallback;
    }

    void shutdown() {
        this.isShutdown = true;
        java.util.concurrent.Executor executor = this.monitorClearedResourcesExecutor;
        if (executor instanceof java.util.concurrent.ExecutorService) {
            com.bumptech.glide.util.Executors.shutdownAndAwaitTermination((java.util.concurrent.ExecutorService) executor);
        }
    }

    static final class ResourceWeakReference extends java.lang.ref.WeakReference<com.bumptech.glide.load.engine.EngineResource<?>> {
        final boolean isCacheable;
        final com.bumptech.glide.load.Key key;
        com.bumptech.glide.load.engine.Resource<?> resource;

        ResourceWeakReference(com.bumptech.glide.load.Key key, com.bumptech.glide.load.engine.EngineResource<?> engineResource, java.lang.ref.ReferenceQueue<? super com.bumptech.glide.load.engine.EngineResource<?>> referenceQueue, boolean z) {
            super(engineResource, referenceQueue);
            this.key = (com.bumptech.glide.load.Key) com.bumptech.glide.util.Preconditions.checkNotNull(key);
            this.resource = (engineResource.isMemoryCacheable() && z) ? (com.bumptech.glide.load.engine.Resource) com.bumptech.glide.util.Preconditions.checkNotNull(engineResource.getResource()) : null;
            this.isCacheable = engineResource.isMemoryCacheable();
        }

        void reset() {
            this.resource = null;
            clear();
        }
    }
}
