package kotlinx.coroutines;

/* compiled from: ThreadPoolDispatcher.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "newSingleThreadContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadPoolDispatcherKt {
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newSingleThreadContext(java.lang.String str) {
        return newFixedThreadPoolContext(1, str);
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newFixedThreadPoolContext(final int i, final java.lang.String str) {
        if (!(i >= 1)) {
            throw new java.lang.IllegalArgumentException(("Expected at least one thread, but " + i + " specified").toString());
        }
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.ExecutorService) java.util.concurrent.Executors.newScheduledThreadPool(i, new java.util.concurrent.ThreadFactory() { // from class: kotlinx.coroutines.ThreadPoolDispatcherKt$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread m2520newFixedThreadPoolContext$lambda1;
                m2520newFixedThreadPoolContext$lambda1 = kotlinx.coroutines.ThreadPoolDispatcherKt.m2520newFixedThreadPoolContext$lambda1(i, str, atomicInteger, runnable);
                return m2520newFixedThreadPoolContext$lambda1;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: newFixedThreadPoolContext$lambda-1, reason: not valid java name */
    public static final java.lang.Thread m2520newFixedThreadPoolContext$lambda1(int i, java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.lang.Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        java.lang.Thread thread = new java.lang.Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
