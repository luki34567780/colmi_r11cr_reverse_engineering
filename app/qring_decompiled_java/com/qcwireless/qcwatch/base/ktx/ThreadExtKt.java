package com.qcwireless.qcwatch.base.ktx;

/* compiled from: ThreadExt.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\u001a.\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\u0002H\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0002\b\u000f¢\u0006\u0002\u0010\u0010\u001a.\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\u0002H\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0002\b\u000f¢\u0006\u0002\u0010\u0010\u001a.\u0010\u0012\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\u0002H\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0002\b\u000f¢\u0006\u0002\u0010\u0010\u001a.\u0010\u0013\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\u0002H\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0002\b\u000f¢\u0006\u0002\u0010\u0010\u001a.\u0010\u0014\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\u0002H\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0002\b\u000f¢\u0006\u0002\u0010\u0010\u001a6\u0010\u0015\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\u0002H\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0002\b\u000f¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"cache", "Ljava/util/concurrent/ExecutorService;", "coreSize", "", "fix", "handler", "Landroid/os/Handler;", "scheduled", "single", "singleAnother", "ktxRunOnBgCache", "", "T", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "ktxRunOnBgFix", "ktxRunOnBgSingle", "ktxRunOnBgSingleAnother", "ktxRunOnUi", "ktxRunOnUiDelay", "delayMillis", "", "(Ljava/lang/Object;JLkotlin/jvm/functions/Function1;)V", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ThreadExtKt {
    private static final java.util.concurrent.ExecutorService cache;
    private static final int coreSize;
    private static final java.util.concurrent.ExecutorService fix;
    private static final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
    private static final java.util.concurrent.ExecutorService scheduled;
    private static final java.util.concurrent.ExecutorService single;
    private static final java.util.concurrent.ExecutorService singleAnother;

    static {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors() + 1;
        coreSize = availableProcessors;
        java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(availableProcessors);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(coreSize)");
        fix = newFixedThreadPool;
        java.util.concurrent.ExecutorService newCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "newCachedThreadPool()");
        cache = newCachedThreadPool;
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor()");
        single = newSingleThreadExecutor;
        java.util.concurrent.ExecutorService newSingleThreadExecutor2 = java.util.concurrent.Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor2, "newSingleThreadExecutor()");
        singleAnother = newSingleThreadExecutor2;
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(availableProcessors);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "newScheduledThreadPool(coreSize)");
        scheduled = newScheduledThreadPool;
    }

    public static final <T> void ktxRunOnUi(final T t, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "block");
        handler.post(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.base.ktx.ThreadExtKt$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.m232ktxRunOnUi$lambda0(function1, t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ktxRunOnUi$lambda-0, reason: not valid java name */
    public static final void m232ktxRunOnUi$lambda0(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "$block");
        function1.invoke(obj);
    }

    public static final <T> void ktxRunOnUiDelay(final T t, long j, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "block");
        handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.base.ktx.ThreadExtKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.m233ktxRunOnUiDelay$lambda1(function1, t);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ktxRunOnUiDelay$lambda-1, reason: not valid java name */
    public static final void m233ktxRunOnUiDelay$lambda1(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "$block");
        function1.invoke(obj);
    }

    public static final <T> void ktxRunOnBgSingle(final T t, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "block");
        single.execute(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.base.ktx.ThreadExtKt$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.m230ktxRunOnBgSingle$lambda2(function1, t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ktxRunOnBgSingle$lambda-2, reason: not valid java name */
    public static final void m230ktxRunOnBgSingle$lambda2(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "$block");
        function1.invoke(obj);
    }

    public static final <T> void ktxRunOnBgSingleAnother(final T t, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "block");
        singleAnother.execute(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.base.ktx.ThreadExtKt$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.m231ktxRunOnBgSingleAnother$lambda3(function1, t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ktxRunOnBgSingleAnother$lambda-3, reason: not valid java name */
    public static final void m231ktxRunOnBgSingleAnother$lambda3(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "$block");
        function1.invoke(obj);
    }

    public static final <T> void ktxRunOnBgFix(final T t, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "block");
        fix.execute(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.base.ktx.ThreadExtKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.m229ktxRunOnBgFix$lambda4(function1, t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ktxRunOnBgFix$lambda-4, reason: not valid java name */
    public static final void m229ktxRunOnBgFix$lambda4(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "$block");
        function1.invoke(obj);
    }

    public static final <T> void ktxRunOnBgCache(final T t, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "block");
        cache.execute(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.base.ktx.ThreadExtKt$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.m228ktxRunOnBgCache$lambda5(function1, t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ktxRunOnBgCache$lambda-5, reason: not valid java name */
    public static final void m228ktxRunOnBgCache$lambda5(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "$block");
        function1.invoke(obj);
    }
}
