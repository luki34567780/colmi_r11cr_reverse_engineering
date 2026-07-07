package androidx.work;

/* loaded from: classes.dex */
public final class WorkerParameters {
    private java.util.concurrent.Executor mBackgroundExecutor;
    private androidx.work.ForegroundUpdater mForegroundUpdater;
    private java.util.UUID mId;
    private androidx.work.Data mInputData;
    private androidx.work.ProgressUpdater mProgressUpdater;
    private int mRunAttemptCount;
    private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
    private java.util.Set<java.lang.String> mTags;
    private androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;
    private androidx.work.WorkerFactory mWorkerFactory;

    public static class RuntimeExtras {
        public android.net.Network network;
        public java.util.List<java.lang.String> triggeredContentAuthorities = java.util.Collections.emptyList();
        public java.util.List<android.net.Uri> triggeredContentUris = java.util.Collections.emptyList();
    }

    public WorkerParameters(java.util.UUID id, androidx.work.Data inputData, java.util.Collection<java.lang.String> tags, androidx.work.WorkerParameters.RuntimeExtras runtimeExtras, int runAttemptCount, java.util.concurrent.Executor backgroundExecutor, androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor, androidx.work.WorkerFactory workerFactory, androidx.work.ProgressUpdater progressUpdater, androidx.work.ForegroundUpdater foregroundUpdater) {
        this.mId = id;
        this.mInputData = inputData;
        this.mTags = new java.util.HashSet(tags);
        this.mRuntimeExtras = runtimeExtras;
        this.mRunAttemptCount = runAttemptCount;
        this.mBackgroundExecutor = backgroundExecutor;
        this.mWorkTaskExecutor = workTaskExecutor;
        this.mWorkerFactory = workerFactory;
        this.mProgressUpdater = progressUpdater;
        this.mForegroundUpdater = foregroundUpdater;
    }

    public java.util.UUID getId() {
        return this.mId;
    }

    public androidx.work.Data getInputData() {
        return this.mInputData;
    }

    public java.util.Set<java.lang.String> getTags() {
        return this.mTags;
    }

    public java.util.List<android.net.Uri> getTriggeredContentUris() {
        return this.mRuntimeExtras.triggeredContentUris;
    }

    public java.util.List<java.lang.String> getTriggeredContentAuthorities() {
        return this.mRuntimeExtras.triggeredContentAuthorities;
    }

    public android.net.Network getNetwork() {
        return this.mRuntimeExtras.network;
    }

    public int getRunAttemptCount() {
        return this.mRunAttemptCount;
    }

    public java.util.concurrent.Executor getBackgroundExecutor() {
        return this.mBackgroundExecutor;
    }

    public androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    public androidx.work.WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }

    public androidx.work.ProgressUpdater getProgressUpdater() {
        return this.mProgressUpdater;
    }

    public androidx.work.ForegroundUpdater getForegroundUpdater() {
        return this.mForegroundUpdater;
    }

    public androidx.work.WorkerParameters.RuntimeExtras getRuntimeExtras() {
        return this.mRuntimeExtras;
    }
}
