package com.bumptech.glide.request;

/* loaded from: /tmp/dex/classes2.dex */
public final class SingleRequest<R> implements com.bumptech.glide.request.Request, com.bumptech.glide.request.target.SizeReadyCallback, com.bumptech.glide.request.ResourceCallback {
    private static final java.lang.String GLIDE_TAG = "Glide";
    private final com.bumptech.glide.request.transition.TransitionFactory<? super R> animationFactory;
    private final java.util.concurrent.Executor callbackExecutor;
    private final android.content.Context context;
    private volatile com.bumptech.glide.load.engine.Engine engine;
    private android.graphics.drawable.Drawable errorDrawable;
    private android.graphics.drawable.Drawable fallbackDrawable;
    private final com.bumptech.glide.GlideContext glideContext;
    private int height;
    private boolean isCallingCallbacks;
    private com.bumptech.glide.load.engine.Engine.LoadStatus loadStatus;
    private final java.lang.Object model;
    private final int overrideHeight;
    private final int overrideWidth;
    private android.graphics.drawable.Drawable placeholderDrawable;
    private final com.bumptech.glide.Priority priority;
    private final com.bumptech.glide.request.RequestCoordinator requestCoordinator;
    private final java.util.List<com.bumptech.glide.request.RequestListener<R>> requestListeners;
    private final java.lang.Object requestLock;
    private final com.bumptech.glide.request.BaseRequestOptions<?> requestOptions;
    private java.lang.RuntimeException requestOrigin;
    private com.bumptech.glide.load.engine.Resource<R> resource;
    private long startTime;
    private final com.bumptech.glide.util.pool.StateVerifier stateVerifier;
    private com.bumptech.glide.request.SingleRequest.Status status;
    private final java.lang.String tag;
    private final com.bumptech.glide.request.target.Target<R> target;
    private final com.bumptech.glide.request.RequestListener<R> targetListener;
    private final java.lang.Class<R> transcodeClass;
    private int width;
    private static final java.lang.String TAG = "Request";
    private static final boolean IS_VERBOSE_LOGGABLE = android.util.Log.isLoggable(TAG, 2);

    private enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public static <R> com.bumptech.glide.request.SingleRequest<R> obtain(android.content.Context context, com.bumptech.glide.GlideContext glideContext, java.lang.Object obj, java.lang.Object obj2, java.lang.Class<R> cls, com.bumptech.glide.request.BaseRequestOptions<?> baseRequestOptions, int i, int i2, com.bumptech.glide.Priority priority, com.bumptech.glide.request.target.Target<R> target, com.bumptech.glide.request.RequestListener<R> requestListener, java.util.List<com.bumptech.glide.request.RequestListener<R>> list, com.bumptech.glide.request.RequestCoordinator requestCoordinator, com.bumptech.glide.load.engine.Engine engine, com.bumptech.glide.request.transition.TransitionFactory<? super R> transitionFactory, java.util.concurrent.Executor executor) {
        return new com.bumptech.glide.request.SingleRequest<>(context, glideContext, obj, obj2, cls, baseRequestOptions, i, i2, priority, target, requestListener, list, requestCoordinator, engine, transitionFactory, executor);
    }

    private SingleRequest(android.content.Context context, com.bumptech.glide.GlideContext glideContext, java.lang.Object obj, java.lang.Object obj2, java.lang.Class<R> cls, com.bumptech.glide.request.BaseRequestOptions<?> baseRequestOptions, int i, int i2, com.bumptech.glide.Priority priority, com.bumptech.glide.request.target.Target<R> target, com.bumptech.glide.request.RequestListener<R> requestListener, java.util.List<com.bumptech.glide.request.RequestListener<R>> list, com.bumptech.glide.request.RequestCoordinator requestCoordinator, com.bumptech.glide.load.engine.Engine engine, com.bumptech.glide.request.transition.TransitionFactory<? super R> transitionFactory, java.util.concurrent.Executor executor) {
        this.tag = IS_VERBOSE_LOGGABLE ? java.lang.String.valueOf(super.hashCode()) : null;
        this.stateVerifier = com.bumptech.glide.util.pool.StateVerifier.newInstance();
        this.requestLock = obj;
        this.context = context;
        this.glideContext = glideContext;
        this.model = obj2;
        this.transcodeClass = cls;
        this.requestOptions = baseRequestOptions;
        this.overrideWidth = i;
        this.overrideHeight = i2;
        this.priority = priority;
        this.target = target;
        this.targetListener = requestListener;
        this.requestListeners = list;
        this.requestCoordinator = requestCoordinator;
        this.engine = engine;
        this.animationFactory = transitionFactory;
        this.callbackExecutor = executor;
        this.status = com.bumptech.glide.request.SingleRequest.Status.PENDING;
        if (this.requestOrigin == null && glideContext.getExperiments().isEnabled(com.bumptech.glide.GlideBuilder.LogRequestOrigins.class)) {
            this.requestOrigin = new java.lang.RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        synchronized (this.requestLock) {
            assertNotCallingCallbacks();
            this.stateVerifier.throwIfRecycled();
            this.startTime = com.bumptech.glide.util.LogTime.getLogTime();
            if (this.model == null) {
                if (com.bumptech.glide.util.Util.isValidDimensions(this.overrideWidth, this.overrideHeight)) {
                    this.width = this.overrideWidth;
                    this.height = this.overrideHeight;
                }
                onLoadFailed(new com.bumptech.glide.load.engine.GlideException("Received null model"), getFallbackDrawable() == null ? 5 : 3);
                return;
            }
            if (this.status == com.bumptech.glide.request.SingleRequest.Status.RUNNING) {
                throw new java.lang.IllegalArgumentException("Cannot restart a running request");
            }
            if (this.status == com.bumptech.glide.request.SingleRequest.Status.COMPLETE) {
                onResourceReady(this.resource, com.bumptech.glide.load.DataSource.MEMORY_CACHE, false);
                return;
            }
            this.status = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE;
            if (com.bumptech.glide.util.Util.isValidDimensions(this.overrideWidth, this.overrideHeight)) {
                onSizeReady(this.overrideWidth, this.overrideHeight);
            } else {
                this.target.getSize(this);
            }
            if ((this.status == com.bumptech.glide.request.SingleRequest.Status.RUNNING || this.status == com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE) && canNotifyStatusChanged()) {
                this.target.onLoadStarted(getPlaceholderDrawable());
            }
            if (IS_VERBOSE_LOGGABLE) {
                logV("finished run method in " + com.bumptech.glide.util.LogTime.getElapsedMillis(this.startTime));
            }
        }
    }

    private void cancel() {
        assertNotCallingCallbacks();
        this.stateVerifier.throwIfRecycled();
        this.target.removeCallback(this);
        com.bumptech.glide.load.engine.Engine.LoadStatus loadStatus = this.loadStatus;
        if (loadStatus != null) {
            loadStatus.cancel();
            this.loadStatus = null;
        }
    }

    private void assertNotCallingCallbacks() {
        if (this.isCallingCallbacks) {
            throw new java.lang.IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.requestLock) {
            assertNotCallingCallbacks();
            this.stateVerifier.throwIfRecycled();
            if (this.status == com.bumptech.glide.request.SingleRequest.Status.CLEARED) {
                return;
            }
            cancel();
            com.bumptech.glide.load.engine.Resource<R> resource = this.resource;
            if (resource != null) {
                this.resource = null;
            } else {
                resource = null;
            }
            if (canNotifyCleared()) {
                this.target.onLoadCleared(getPlaceholderDrawable());
            }
            this.status = com.bumptech.glide.request.SingleRequest.Status.CLEARED;
            if (resource != null) {
                this.engine.release(resource);
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.requestLock) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.status == com.bumptech.glide.request.SingleRequest.Status.RUNNING || this.status == com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.status == com.bumptech.glide.request.SingleRequest.Status.COMPLETE;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.status == com.bumptech.glide.request.SingleRequest.Status.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.status == com.bumptech.glide.request.SingleRequest.Status.COMPLETE;
        }
        return z;
    }

    private android.graphics.drawable.Drawable getErrorDrawable() {
        if (this.errorDrawable == null) {
            android.graphics.drawable.Drawable errorPlaceholder = this.requestOptions.getErrorPlaceholder();
            this.errorDrawable = errorPlaceholder;
            if (errorPlaceholder == null && this.requestOptions.getErrorId() > 0) {
                this.errorDrawable = loadDrawable(this.requestOptions.getErrorId());
            }
        }
        return this.errorDrawable;
    }

    private android.graphics.drawable.Drawable getPlaceholderDrawable() {
        if (this.placeholderDrawable == null) {
            android.graphics.drawable.Drawable placeholderDrawable = this.requestOptions.getPlaceholderDrawable();
            this.placeholderDrawable = placeholderDrawable;
            if (placeholderDrawable == null && this.requestOptions.getPlaceholderId() > 0) {
                this.placeholderDrawable = loadDrawable(this.requestOptions.getPlaceholderId());
            }
        }
        return this.placeholderDrawable;
    }

    private android.graphics.drawable.Drawable getFallbackDrawable() {
        if (this.fallbackDrawable == null) {
            android.graphics.drawable.Drawable fallbackDrawable = this.requestOptions.getFallbackDrawable();
            this.fallbackDrawable = fallbackDrawable;
            if (fallbackDrawable == null && this.requestOptions.getFallbackId() > 0) {
                this.fallbackDrawable = loadDrawable(this.requestOptions.getFallbackId());
            }
        }
        return this.fallbackDrawable;
    }

    private android.graphics.drawable.Drawable loadDrawable(int i) {
        return com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat.getDrawable((android.content.Context) this.glideContext, i, this.requestOptions.getTheme() != null ? this.requestOptions.getTheme() : this.context.getTheme());
    }

    private void setErrorPlaceholder() {
        if (canNotifyStatusChanged()) {
            android.graphics.drawable.Drawable fallbackDrawable = this.model == null ? getFallbackDrawable() : null;
            if (fallbackDrawable == null) {
                fallbackDrawable = getErrorDrawable();
            }
            if (fallbackDrawable == null) {
                fallbackDrawable = getPlaceholderDrawable();
            }
            this.target.onLoadFailed(fallbackDrawable);
        }
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i, int i2) {
        java.lang.Object obj;
        this.stateVerifier.throwIfRecycled();
        java.lang.Object obj2 = this.requestLock;
        synchronized (obj2) {
            try {
                try {
                    boolean z = IS_VERBOSE_LOGGABLE;
                    if (z) {
                        logV("Got onSizeReady in " + com.bumptech.glide.util.LogTime.getElapsedMillis(this.startTime));
                    }
                    if (this.status == com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE) {
                        this.status = com.bumptech.glide.request.SingleRequest.Status.RUNNING;
                        float sizeMultiplier = this.requestOptions.getSizeMultiplier();
                        this.width = maybeApplySizeMultiplier(i, sizeMultiplier);
                        this.height = maybeApplySizeMultiplier(i2, sizeMultiplier);
                        if (z) {
                            logV("finished setup for calling load in " + com.bumptech.glide.util.LogTime.getElapsedMillis(this.startTime));
                        }
                        obj = obj2;
                        try {
                            this.loadStatus = this.engine.load(this.glideContext, this.model, this.requestOptions.getSignature(), this.width, this.height, this.requestOptions.getResourceClass(), this.transcodeClass, this.priority, this.requestOptions.getDiskCacheStrategy(), this.requestOptions.getTransformations(), this.requestOptions.isTransformationRequired(), this.requestOptions.isScaleOnlyOrNoTransform(), this.requestOptions.getOptions(), this.requestOptions.isMemoryCacheable(), this.requestOptions.getUseUnlimitedSourceGeneratorsPool(), this.requestOptions.getUseAnimationPool(), this.requestOptions.getOnlyRetrieveFromCache(), this, this.callbackExecutor);
                            if (this.status != com.bumptech.glide.request.SingleRequest.Status.RUNNING) {
                                this.loadStatus = null;
                            }
                            if (z) {
                                logV("finished onSizeReady in " + com.bumptech.glide.util.LogTime.getElapsedMillis(this.startTime));
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    private static int maybeApplySizeMultiplier(int i, float f) {
        return i == Integer.MIN_VALUE ? i : java.lang.Math.round(f * i);
    }

    private boolean canSetResource() {
        com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.requestCoordinator;
        return requestCoordinator == null || requestCoordinator.canSetImage(this);
    }

    private boolean canNotifyCleared() {
        com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.requestCoordinator;
        return requestCoordinator == null || requestCoordinator.canNotifyCleared(this);
    }

    private boolean canNotifyStatusChanged() {
        com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.requestCoordinator;
        return requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this);
    }

    private boolean isFirstReadyResource() {
        com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.requestCoordinator;
        return requestCoordinator == null || !requestCoordinator.getRoot().isAnyResourceSet();
    }

    private void notifyLoadSuccess() {
        com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.requestCoordinator;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestSuccess(this);
        }
    }

    private void notifyLoadFailed() {
        com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.requestCoordinator;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestFailed(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r6 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r5.engine.release(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r6 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        r5.engine.release(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.ResourceCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResourceReady(com.bumptech.glide.load.engine.Resource<?> r6, com.bumptech.glide.load.DataSource r7, boolean r8) {
        /*
            r5 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r5.stateVerifier
            r0.throwIfRecycled()
            r0 = 0
            java.lang.Object r1 = r5.requestLock     // Catch: java.lang.Throwable -> Lb9
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb9
            r5.loadStatus = r0     // Catch: java.lang.Throwable -> Lb6
            if (r6 != 0) goto L2f
            com.bumptech.glide.load.engine.GlideException r6 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lb6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r7.<init>()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = "Expected to receive a Resource<R> with an object of "
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class<R> r8 = r5.transcodeClass     // Catch: java.lang.Throwable -> Lb6
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = " inside, but instead got null."
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lb6
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb6
            r5.onLoadFailed(r6)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb6
            return
        L2f:
            java.lang.Object r2 = r6.get()     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto L5c
            java.lang.Class<R> r3 = r5.transcodeClass     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r3 != 0) goto L42
            goto L5c
        L42:
            boolean r3 = r5.canSetResource()     // Catch: java.lang.Throwable -> Lb6
            if (r3 != 0) goto L57
            r5.resource = r0     // Catch: java.lang.Throwable -> Lb2
            com.bumptech.glide.request.SingleRequest$Status r7 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> Lb2
            r5.status = r7     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L56
            com.bumptech.glide.load.engine.Engine r7 = r5.engine
            r7.release(r6)
        L56:
            return
        L57:
            r5.onResourceReady(r6, r2, r7, r8)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb6
            return
        L5c:
            r5.resource = r0     // Catch: java.lang.Throwable -> Lb2
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r8.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "Expected to receive an object of "
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Class<R> r0 = r5.transcodeClass     // Catch: java.lang.Throwable -> Lb2
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = " but instead got "
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto L7b
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> Lb2
            goto L7d
        L7b:
            java.lang.String r0 = ""
        L7d:
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "{"
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb2
            r8.append(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "} inside Resource{"
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb2
            r8.append(r6)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "}."
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto L9a
            java.lang.String r0 = ""
            goto L9c
        L9a:
            java.lang.String r0 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L9c:
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lb2
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lb2
            r5.onLoadFailed(r7)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto Lb1
            com.bumptech.glide.load.engine.Engine r7 = r5.engine
            r7.release(r6)
        Lb1:
            return
        Lb2:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto Lb7
        Lb6:
            r6 = move-exception
        Lb7:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb6
            throw r6     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r6 = move-exception
            if (r0 == 0) goto Lc1
            com.bumptech.glide.load.engine.Engine r7 = r5.engine
            r7.release(r0)
        Lc1:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.onResourceReady(com.bumptech.glide.load.engine.Resource, com.bumptech.glide.load.DataSource, boolean):void");
    }

    private void onResourceReady(com.bumptech.glide.load.engine.Resource<R> resource, R r, com.bumptech.glide.load.DataSource dataSource, boolean z) {
        boolean z2;
        boolean isFirstReadyResource = isFirstReadyResource();
        this.status = com.bumptech.glide.request.SingleRequest.Status.COMPLETE;
        this.resource = resource;
        if (this.glideContext.getLogLevel() <= 3) {
            android.util.Log.d(GLIDE_TAG, "Finished loading " + r.getClass().getSimpleName() + " from " + dataSource + " for " + this.model + " with size [" + this.width + "x" + this.height + "] in " + com.bumptech.glide.util.LogTime.getElapsedMillis(this.startTime) + " ms");
        }
        boolean z3 = true;
        this.isCallingCallbacks = true;
        try {
            java.util.List<com.bumptech.glide.request.RequestListener<R>> list = this.requestListeners;
            if (list != null) {
                java.util.Iterator<com.bumptech.glide.request.RequestListener<R>> it = list.iterator();
                z2 = false;
                while (it.hasNext()) {
                    z2 |= it.next().onResourceReady(r, this.model, this.target, dataSource, isFirstReadyResource);
                }
            } else {
                z2 = false;
            }
            com.bumptech.glide.request.RequestListener<R> requestListener = this.targetListener;
            if (requestListener == null || !requestListener.onResourceReady(r, this.model, this.target, dataSource, isFirstReadyResource)) {
                z3 = false;
            }
            if (!(z3 | z2)) {
                this.target.onResourceReady(r, this.animationFactory.build(dataSource, isFirstReadyResource));
            }
            this.isCallingCallbacks = false;
            notifyLoadSuccess();
        } catch (java.lang.Throwable th) {
            this.isCallingCallbacks = false;
            throw th;
        }
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onLoadFailed(com.bumptech.glide.load.engine.GlideException glideException) {
        onLoadFailed(glideException, 5);
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public java.lang.Object getLock() {
        this.stateVerifier.throwIfRecycled();
        return this.requestLock;
    }

    private void onLoadFailed(com.bumptech.glide.load.engine.GlideException glideException, int i) {
        boolean z;
        this.stateVerifier.throwIfRecycled();
        synchronized (this.requestLock) {
            glideException.setOrigin(this.requestOrigin);
            int logLevel = this.glideContext.getLogLevel();
            if (logLevel <= i) {
                android.util.Log.w(GLIDE_TAG, "Load failed for " + this.model + " with size [" + this.width + "x" + this.height + "]", glideException);
                if (logLevel <= 4) {
                    glideException.logRootCauses(GLIDE_TAG);
                }
            }
            this.loadStatus = null;
            this.status = com.bumptech.glide.request.SingleRequest.Status.FAILED;
            boolean z2 = true;
            this.isCallingCallbacks = true;
            try {
                java.util.List<com.bumptech.glide.request.RequestListener<R>> list = this.requestListeners;
                if (list != null) {
                    java.util.Iterator<com.bumptech.glide.request.RequestListener<R>> it = list.iterator();
                    z = false;
                    while (it.hasNext()) {
                        z |= it.next().onLoadFailed(glideException, this.model, this.target, isFirstReadyResource());
                    }
                } else {
                    z = false;
                }
                com.bumptech.glide.request.RequestListener<R> requestListener = this.targetListener;
                if (requestListener == null || !requestListener.onLoadFailed(glideException, this.model, this.target, isFirstReadyResource())) {
                    z2 = false;
                }
                if (!(z | z2)) {
                    setErrorPlaceholder();
                }
                this.isCallingCallbacks = false;
                notifyLoadFailed();
            } catch (java.lang.Throwable th) {
                this.isCallingCallbacks = false;
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(com.bumptech.glide.request.Request request) {
        int i;
        int i2;
        java.lang.Object obj;
        java.lang.Class<R> cls;
        com.bumptech.glide.request.BaseRequestOptions<?> baseRequestOptions;
        com.bumptech.glide.Priority priority;
        int size;
        int i3;
        int i4;
        java.lang.Object obj2;
        java.lang.Class<R> cls2;
        com.bumptech.glide.request.BaseRequestOptions<?> baseRequestOptions2;
        com.bumptech.glide.Priority priority2;
        int size2;
        if (!(request instanceof com.bumptech.glide.request.SingleRequest)) {
            return false;
        }
        synchronized (this.requestLock) {
            i = this.overrideWidth;
            i2 = this.overrideHeight;
            obj = this.model;
            cls = this.transcodeClass;
            baseRequestOptions = this.requestOptions;
            priority = this.priority;
            java.util.List<com.bumptech.glide.request.RequestListener<R>> list = this.requestListeners;
            size = list != null ? list.size() : 0;
        }
        com.bumptech.glide.request.SingleRequest singleRequest = (com.bumptech.glide.request.SingleRequest) request;
        synchronized (singleRequest.requestLock) {
            i3 = singleRequest.overrideWidth;
            i4 = singleRequest.overrideHeight;
            obj2 = singleRequest.model;
            cls2 = singleRequest.transcodeClass;
            baseRequestOptions2 = singleRequest.requestOptions;
            priority2 = singleRequest.priority;
            java.util.List<com.bumptech.glide.request.RequestListener<R>> list2 = singleRequest.requestListeners;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && com.bumptech.glide.util.Util.bothModelsNullEquivalentOrEquals(obj, obj2) && cls.equals(cls2) && baseRequestOptions.equals(baseRequestOptions2) && priority == priority2 && size == size2;
    }

    private void logV(java.lang.String str) {
        android.util.Log.v(TAG, str + " this: " + this.tag);
    }
}
