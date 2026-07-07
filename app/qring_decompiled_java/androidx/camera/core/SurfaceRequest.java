package androidx.camera.core;

/* loaded from: classes.dex */
public final class SurfaceRequest {
    private final androidx.camera.core.impl.CameraInternal mCamera;
    private final androidx.camera.core.impl.DeferrableSurface mInternalDeferrableSurface;
    private final boolean mRGBA8888Required;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mRequestCancellationCompleter;
    private final android.util.Size mResolution;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mSessionStatusFuture;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<android.view.Surface> mSurfaceCompleter;
    final com.google.common.util.concurrent.ListenableFuture<android.view.Surface> mSurfaceFuture;
    private androidx.camera.core.SurfaceRequest.TransformationInfo mTransformationInfo;
    private java.util.concurrent.Executor mTransformationInfoExecutor;
    private androidx.camera.core.SurfaceRequest.TransformationInfoListener mTransformationInfoListener;

    public interface TransformationInfoListener {
        void onTransformationInfoUpdate(androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo);
    }

    public SurfaceRequest(android.util.Size resolution, androidx.camera.core.impl.CameraInternal camera, boolean isRGBA8888Required) {
        this.mResolution = resolution;
        this.mCamera = camera;
        this.mRGBA8888Required = isRGBA8888Required;
        final java.lang.String str = "SurfaceRequest[size: " + resolution + ", id: " + hashCode() + "]";
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(null);
        final com.google.common.util.concurrent.ListenableFuture future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.SurfaceRequest.lambda$new$0(atomicReference, str, completer);
            }
        });
        final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference.get());
        this.mRequestCancellationCompleter = completer;
        final java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference(null);
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> future2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2) {
                return androidx.camera.core.SurfaceRequest.lambda$new$1(atomicReference2, str, completer2);
            }
        });
        this.mSessionStatusFuture = future2;
        androidx.camera.core.impl.utils.futures.Futures.addCallback(future2, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.lang.Void result) {
                androidx.core.util.Preconditions.checkState(completer.set(null));
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable t) {
                if (t instanceof androidx.camera.core.SurfaceRequest.RequestCancelledException) {
                    androidx.core.util.Preconditions.checkState(future.cancel(false));
                } else {
                    androidx.core.util.Preconditions.checkState(completer.set(null));
                }
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference2.get());
        final java.util.concurrent.atomic.AtomicReference atomicReference3 = new java.util.concurrent.atomic.AtomicReference(null);
        com.google.common.util.concurrent.ListenableFuture<android.view.Surface> future3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer3) {
                return androidx.camera.core.SurfaceRequest.lambda$new$2(atomicReference3, str, completer3);
            }
        });
        this.mSurfaceFuture = future3;
        this.mSurfaceCompleter = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference3.get());
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = new androidx.camera.core.impl.DeferrableSurface() { // from class: androidx.camera.core.SurfaceRequest.2
            @Override // androidx.camera.core.impl.DeferrableSurface
            protected com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface() {
                return androidx.camera.core.SurfaceRequest.this.mSurfaceFuture;
            }
        };
        this.mInternalDeferrableSurface = deferrableSurface;
        final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> terminationFuture = deferrableSurface.getTerminationFuture();
        androidx.camera.core.impl.utils.futures.Futures.addCallback(future3, new androidx.camera.core.impl.utils.futures.FutureCallback<android.view.Surface>() { // from class: androidx.camera.core.SurfaceRequest.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(android.view.Surface result) {
                androidx.camera.core.impl.utils.futures.Futures.propagate(terminationFuture, completer2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable t) {
                if (t instanceof java.util.concurrent.CancellationException) {
                    androidx.core.util.Preconditions.checkState(completer2.setException(new androidx.camera.core.SurfaceRequest.RequestCancelledException(str + " cancelled.", t)));
                    return;
                }
                completer2.set(null);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        terminationFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.SurfaceRequest.this.m99lambda$new$3$androidxcameracoreSurfaceRequest();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    static /* synthetic */ java.lang.Object lambda$new$0(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        return str + "-cancellation";
    }

    static /* synthetic */ java.lang.Object lambda$new$1(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        return str + "-status";
    }

    static /* synthetic */ java.lang.Object lambda$new$2(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        return str + "-Surface";
    }

    /* renamed from: lambda$new$3$androidx-camera-core-SurfaceRequest, reason: not valid java name */
    public /* synthetic */ void m99lambda$new$3$androidxcameracoreSurfaceRequest() {
        this.mSurfaceFuture.cancel(true);
    }

    public androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
        return this.mInternalDeferrableSurface;
    }

    public android.util.Size getResolution() {
        return this.mResolution;
    }

    public androidx.camera.core.impl.CameraInternal getCamera() {
        return this.mCamera;
    }

    public boolean isRGBA8888Required() {
        return this.mRGBA8888Required;
    }

    public void provideSurface(final android.view.Surface surface, java.util.concurrent.Executor executor, final androidx.core.util.Consumer<androidx.camera.core.SurfaceRequest.Result> resultListener) {
        if (this.mSurfaceCompleter.set(surface) || this.mSurfaceFuture.isCancelled()) {
            androidx.camera.core.impl.utils.futures.Futures.addCallback(this.mSessionStatusFuture, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.4
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(java.lang.Void result) {
                    resultListener.accept(androidx.camera.core.SurfaceRequest.Result.of(0, surface));
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(java.lang.Throwable t) {
                    androidx.core.util.Preconditions.checkState(t instanceof androidx.camera.core.SurfaceRequest.RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + t);
                    resultListener.accept(androidx.camera.core.SurfaceRequest.Result.of(1, surface));
                }
            }, executor);
            return;
        }
        androidx.core.util.Preconditions.checkState(this.mSurfaceFuture.isDone());
        try {
            this.mSurfaceFuture.get();
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.util.Consumer.this.accept(androidx.camera.core.SurfaceRequest.Result.of(3, surface));
                }
            });
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.util.Consumer.this.accept(androidx.camera.core.SurfaceRequest.Result.of(4, surface));
                }
            });
        }
    }

    public boolean willNotProvideSurface() {
        return this.mSurfaceCompleter.setException(new androidx.camera.core.impl.DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    public void addRequestCancellationListener(java.util.concurrent.Executor executor, java.lang.Runnable listener) {
        this.mRequestCancellationCompleter.addCancellationListener(listener, executor);
    }

    public void updateTransformationInfo(final androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
        this.mTransformationInfo = transformationInfo;
        final androidx.camera.core.SurfaceRequest.TransformationInfoListener transformationInfoListener = this.mTransformationInfoListener;
        if (transformationInfoListener != null) {
            this.mTransformationInfoExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.SurfaceRequest.TransformationInfoListener.this.onTransformationInfoUpdate(transformationInfo);
                }
            });
        }
    }

    public void setTransformationInfoListener(java.util.concurrent.Executor executor, final androidx.camera.core.SurfaceRequest.TransformationInfoListener listener) {
        this.mTransformationInfoListener = listener;
        this.mTransformationInfoExecutor = executor;
        final androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo = this.mTransformationInfo;
        if (transformationInfo != null) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.SurfaceRequest.TransformationInfoListener.this.onTransformationInfoUpdate(transformationInfo);
                }
            });
        }
    }

    public void clearTransformationInfoListener() {
        this.mTransformationInfoListener = null;
        this.mTransformationInfoExecutor = null;
    }

    private static final class RequestCancelledException extends java.lang.RuntimeException {
        RequestCancelledException(java.lang.String message, java.lang.Throwable cause) {
            super(message, cause);
        }
    }

    public static abstract class Result {
        public static final int RESULT_INVALID_SURFACE = 2;
        public static final int RESULT_REQUEST_CANCELLED = 1;
        public static final int RESULT_SURFACE_ALREADY_PROVIDED = 3;
        public static final int RESULT_SURFACE_USED_SUCCESSFULLY = 0;
        public static final int RESULT_WILL_NOT_PROVIDE_SURFACE = 4;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        public abstract int getResultCode();

        public abstract android.view.Surface getSurface();

        static androidx.camera.core.SurfaceRequest.Result of(int code, android.view.Surface surface) {
            return new androidx.camera.core.AutoValue_SurfaceRequest_Result(code, surface);
        }

        Result() {
        }
    }

    public static abstract class TransformationInfo {
        public abstract android.graphics.Rect getCropRect();

        public abstract int getRotationDegrees();

        public abstract int getTargetRotation();

        public static androidx.camera.core.SurfaceRequest.TransformationInfo of(android.graphics.Rect cropRect, int rotationDegrees, int targetRotation) {
            return new androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo(cropRect, rotationDegrees, targetRotation);
        }

        TransformationInfo() {
        }
    }
}
