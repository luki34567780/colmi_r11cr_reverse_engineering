package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class SerialExecutor implements java.util.concurrent.Executor {
    private volatile java.lang.Runnable mActive;
    private final java.util.concurrent.Executor mExecutor;
    private final java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutor.Task> mTasks = new java.util.ArrayDeque<>();
    private final java.lang.Object mLock = new java.lang.Object();

    public SerialExecutor(java.util.concurrent.Executor executor) {
        this.mExecutor = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        synchronized (this.mLock) {
            this.mTasks.add(new androidx.work.impl.utils.SerialExecutor.Task(this, command));
            if (this.mActive == null) {
                scheduleNext();
            }
        }
    }

    void scheduleNext() {
        synchronized (this.mLock) {
            androidx.work.impl.utils.SerialExecutor.Task poll = this.mTasks.poll();
            this.mActive = poll;
            if (poll != null) {
                this.mExecutor.execute(this.mActive);
            }
        }
    }

    public boolean hasPendingTasks() {
        boolean z;
        synchronized (this.mLock) {
            z = !this.mTasks.isEmpty();
        }
        return z;
    }

    public java.util.concurrent.Executor getDelegatedExecutor() {
        return this.mExecutor;
    }

    static class Task implements java.lang.Runnable {
        final java.lang.Runnable mRunnable;
        final androidx.work.impl.utils.SerialExecutor mSerialExecutor;

        Task(androidx.work.impl.utils.SerialExecutor serialExecutor, java.lang.Runnable runnable) {
            this.mSerialExecutor = serialExecutor;
            this.mRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mRunnable.run();
            } finally {
                this.mSerialExecutor.scheduleNext();
            }
        }
    }
}
