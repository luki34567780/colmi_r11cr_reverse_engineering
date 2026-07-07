package io.fotoapparat.hardware;

/* compiled from: Executor.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0000\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0000\"\u001c\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\b\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0004¨\u0006\u0010"}, d2 = {"frameProcessingExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getFrameProcessingExecutor", "()Ljava/util/concurrent/ExecutorService;", "loggingExecutor", "mainThreadHandler", "Landroid/os/Handler;", "pendingResultExecutor", "getPendingResultExecutor", "executeLoggingThread", "", "function", "Lkotlin/Function0;", "executeMainThread", "", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class ExecutorKt {
    private static final java.util.concurrent.ExecutorService loggingExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
    private static final android.os.Handler mainThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private static final java.util.concurrent.ExecutorService pendingResultExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
    private static final java.util.concurrent.ExecutorService frameProcessingExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();

    public static final java.util.concurrent.ExecutorService getPendingResultExecutor() {
        return pendingResultExecutor;
    }

    public static final java.util.concurrent.ExecutorService getFrameProcessingExecutor() {
        return frameProcessingExecutor;
    }

    public static final void executeLoggingThread(final kotlin.jvm.functions.Function0<kotlin.Unit> function) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function, "function");
        loggingExecutor.execute(new java.lang.Runnable() { // from class: io.fotoapparat.hardware.ExecutorKt$executeLoggingThread$1
            @Override // java.lang.Runnable
            public final void run() {
                kotlin.jvm.functions.Function0.this.invoke();
            }
        });
    }

    public static final boolean executeMainThread(final kotlin.jvm.functions.Function0<kotlin.Unit> function) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function, "function");
        return mainThreadHandler.post(new java.lang.Runnable() { // from class: io.fotoapparat.hardware.ExecutorKt$executeMainThread$1
            @Override // java.lang.Runnable
            public final void run() {
                kotlin.jvm.functions.Function0.this.invoke();
            }
        });
    }
}
