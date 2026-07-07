package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class WorkForegroundRunnable implements java.lang.Runnable {
    static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WorkForegroundRunnable");
    final android.content.Context mContext;
    final androidx.work.ForegroundUpdater mForegroundUpdater;
    final androidx.work.impl.utils.futures.SettableFuture<java.lang.Void> mFuture = androidx.work.impl.utils.futures.SettableFuture.create();
    final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final androidx.work.impl.model.WorkSpec mWorkSpec;
    final androidx.work.ListenableWorker mWorker;

    public WorkForegroundRunnable(android.content.Context context, androidx.work.impl.model.WorkSpec workSpec, androidx.work.ListenableWorker worker, androidx.work.ForegroundUpdater foregroundUpdater, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        this.mContext = context;
        this.mWorkSpec = workSpec;
        this.mWorker = worker;
        this.mForegroundUpdater = foregroundUpdater;
        this.mTaskExecutor = taskExecutor;
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getFuture() {
        return this.mFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.mWorkSpec.expedited || androidx.core.os.BuildCompat.isAtLeastS()) {
            this.mFuture.set(null);
            return;
        }
        final androidx.work.impl.utils.futures.SettableFuture create = androidx.work.impl.utils.futures.SettableFuture.create();
        this.mTaskExecutor.getMainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.impl.utils.WorkForegroundRunnable.1
            @Override // java.lang.Runnable
            public void run() {
                create.setFuture(androidx.work.impl.utils.WorkForegroundRunnable.this.mWorker.getForegroundInfoAsync());
            }
        });
        create.addListener(new java.lang.Runnable() { // from class: androidx.work.impl.utils.WorkForegroundRunnable.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    androidx.work.ForegroundInfo foregroundInfo = (androidx.work.ForegroundInfo) create.get();
                    if (foregroundInfo == null) {
                        throw new java.lang.IllegalStateException(java.lang.String.format("Worker was marked important (%s) but did not provide ForegroundInfo", androidx.work.impl.utils.WorkForegroundRunnable.this.mWorkSpec.workerClassName));
                    }
                    androidx.work.Logger.get().debug(androidx.work.impl.utils.WorkForegroundRunnable.TAG, java.lang.String.format("Updating notification for %s", androidx.work.impl.utils.WorkForegroundRunnable.this.mWorkSpec.workerClassName), new java.lang.Throwable[0]);
                    androidx.work.impl.utils.WorkForegroundRunnable.this.mWorker.setRunInForeground(true);
                    androidx.work.impl.utils.WorkForegroundRunnable.this.mFuture.setFuture(androidx.work.impl.utils.WorkForegroundRunnable.this.mForegroundUpdater.setForegroundAsync(androidx.work.impl.utils.WorkForegroundRunnable.this.mContext, androidx.work.impl.utils.WorkForegroundRunnable.this.mWorker.getId(), foregroundInfo));
                } catch (java.lang.Throwable th) {
                    androidx.work.impl.utils.WorkForegroundRunnable.this.mFuture.setException(th);
                }
            }
        }, this.mTaskExecutor.getMainThreadExecutor());
    }
}
