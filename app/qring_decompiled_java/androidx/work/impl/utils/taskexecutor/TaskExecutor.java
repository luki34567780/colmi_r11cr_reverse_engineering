package androidx.work.impl.utils.taskexecutor;

/* loaded from: classes.dex */
public interface TaskExecutor {
    void executeOnBackgroundThread(java.lang.Runnable runnable);

    androidx.work.impl.utils.SerialExecutor getBackgroundExecutor();

    java.util.concurrent.Executor getMainThreadExecutor();

    void postToMainThread(java.lang.Runnable runnable);
}
