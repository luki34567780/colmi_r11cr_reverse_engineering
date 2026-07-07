package androidx.work.impl.utils.taskexecutor;

/* loaded from: classes.dex */
public class WorkManagerTaskExecutor implements androidx.work.impl.utils.taskexecutor.TaskExecutor {
    private final androidx.work.impl.utils.SerialExecutor mBackgroundExecutor;
    private final android.os.Handler mMainThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.concurrent.Executor mMainThreadExecutor = new java.util.concurrent.Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable command) {
            androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.this.postToMainThread(command);
        }
    };

    public WorkManagerTaskExecutor(java.util.concurrent.Executor backgroundExecutor) {
        this.mBackgroundExecutor = new androidx.work.impl.utils.SerialExecutor(backgroundExecutor);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public void postToMainThread(java.lang.Runnable runnable) {
        this.mMainThreadHandler.post(runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public java.util.concurrent.Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public void executeOnBackgroundThread(java.lang.Runnable runnable) {
        this.mBackgroundExecutor.execute(runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public androidx.work.impl.utils.SerialExecutor getBackgroundExecutor() {
        return this.mBackgroundExecutor;
    }
}
