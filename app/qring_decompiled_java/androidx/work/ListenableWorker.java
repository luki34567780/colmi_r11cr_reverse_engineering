package androidx.work;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private android.content.Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private androidx.work.WorkerParameters mWorkerParams;

    public void onStopped() {
    }

    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork();

    public ListenableWorker(android.content.Context appContext, androidx.work.WorkerParameters workerParams) {
        if (appContext == null) {
            throw new java.lang.IllegalArgumentException("Application Context is null");
        }
        if (workerParams == null) {
            throw new java.lang.IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = appContext;
        this.mWorkerParams = workerParams;
    }

    public final android.content.Context getApplicationContext() {
        return this.mAppContext;
    }

    public final java.util.UUID getId() {
        return this.mWorkerParams.getId();
    }

    public final androidx.work.Data getInputData() {
        return this.mWorkerParams.getInputData();
    }

    public final java.util.Set<java.lang.String> getTags() {
        return this.mWorkerParams.getTags();
    }

    public final java.util.List<android.net.Uri> getTriggeredContentUris() {
        return this.mWorkerParams.getTriggeredContentUris();
    }

    public final java.util.List<java.lang.String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.getTriggeredContentAuthorities();
    }

    public final android.net.Network getNetwork() {
        return this.mWorkerParams.getNetwork();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.getRunAttemptCount();
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setProgressAsync(androidx.work.Data data) {
        return this.mWorkerParams.getProgressUpdater().updateProgress(getApplicationContext(), getId(), data);
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(androidx.work.ForegroundInfo foregroundInfo) {
        this.mRunInForeground = true;
        return this.mWorkerParams.getForegroundUpdater().setForegroundAsync(getApplicationContext(), getId(), foregroundInfo);
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ForegroundInfo> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.SettableFuture create = androidx.work.impl.utils.futures.SettableFuture.create();
        create.setException(new java.lang.IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return create;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public void setRunInForeground(boolean runInForeground) {
        this.mRunInForeground = runInForeground;
    }

    public java.util.concurrent.Executor getBackgroundExecutor() {
        return this.mWorkerParams.getBackgroundExecutor();
    }

    public androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.getTaskExecutor();
    }

    public androidx.work.WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.getWorkerFactory();
    }

    public static abstract class Result {
        public abstract androidx.work.Data getOutputData();

        public static androidx.work.ListenableWorker.Result success() {
            return new androidx.work.ListenableWorker.Result.Success();
        }

        public static androidx.work.ListenableWorker.Result success(androidx.work.Data outputData) {
            return new androidx.work.ListenableWorker.Result.Success(outputData);
        }

        public static androidx.work.ListenableWorker.Result retry() {
            return new androidx.work.ListenableWorker.Result.Retry();
        }

        public static androidx.work.ListenableWorker.Result failure() {
            return new androidx.work.ListenableWorker.Result.Failure();
        }

        public static androidx.work.ListenableWorker.Result failure(androidx.work.Data outputData) {
            return new androidx.work.ListenableWorker.Result.Failure(outputData);
        }

        Result() {
        }

        public static final class Success extends androidx.work.ListenableWorker.Result {
            private final androidx.work.Data mOutputData;

            public Success() {
                this(androidx.work.Data.EMPTY);
            }

            public Success(androidx.work.Data outputData) {
                this.mOutputData = outputData;
            }

            @Override // androidx.work.ListenableWorker.Result
            public androidx.work.Data getOutputData() {
                return this.mOutputData;
            }

            public boolean equals(java.lang.Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                return this.mOutputData.equals(((androidx.work.ListenableWorker.Result.Success) o).mOutputData);
            }

            public int hashCode() {
                return (-1876823561) + this.mOutputData.hashCode();
            }

            public java.lang.String toString() {
                return "Success {mOutputData=" + this.mOutputData + '}';
            }
        }

        public static final class Failure extends androidx.work.ListenableWorker.Result {
            private final androidx.work.Data mOutputData;

            public Failure() {
                this(androidx.work.Data.EMPTY);
            }

            public Failure(androidx.work.Data outputData) {
                this.mOutputData = outputData;
            }

            @Override // androidx.work.ListenableWorker.Result
            public androidx.work.Data getOutputData() {
                return this.mOutputData;
            }

            public boolean equals(java.lang.Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                return this.mOutputData.equals(((androidx.work.ListenableWorker.Result.Failure) o).mOutputData);
            }

            public int hashCode() {
                return 846803280 + this.mOutputData.hashCode();
            }

            public java.lang.String toString() {
                return "Failure {mOutputData=" + this.mOutputData + '}';
            }
        }

        public static final class Retry extends androidx.work.ListenableWorker.Result {
            public int hashCode() {
                return 25945934;
            }

            public java.lang.String toString() {
                return "Retry";
            }

            public boolean equals(java.lang.Object o) {
                if (this == o) {
                    return true;
                }
                return o != null && getClass() == o.getClass();
            }

            @Override // androidx.work.ListenableWorker.Result
            public androidx.work.Data getOutputData() {
                return androidx.work.Data.EMPTY;
            }
        }
    }
}
