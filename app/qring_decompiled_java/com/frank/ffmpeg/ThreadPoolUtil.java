package com.frank.ffmpeg;

/* compiled from: ThreadPoolUtil.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/frank/ffmpeg/ThreadPoolUtil;", "", "()V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executeSingleThreadPool", "runnable", "Ljava/lang/Runnable;", "libmp3_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ThreadPoolUtil {
    public static final com.frank.ffmpeg.ThreadPoolUtil INSTANCE = new com.frank.ffmpeg.ThreadPoolUtil();
    private static final java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();

    private ThreadPoolUtil() {
    }

    public final java.util.concurrent.ExecutorService executeSingleThreadPool(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        java.util.concurrent.ExecutorService executorService = executor;
        executorService.submit(runnable);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(executorService, "executor");
        return executorService;
    }
}
