package androidx.work;

/* loaded from: classes.dex */
public final class Configuration {
    public static final int MIN_SCHEDULER_LIMIT = 20;
    final java.lang.String mDefaultProcessName;
    final androidx.work.InitializationExceptionHandler mExceptionHandler;
    final java.util.concurrent.Executor mExecutor;
    final androidx.work.InputMergerFactory mInputMergerFactory;
    private final boolean mIsUsingDefaultTaskExecutor;
    final int mLoggingLevel;
    final int mMaxJobSchedulerId;
    final int mMaxSchedulerLimit;
    final int mMinJobSchedulerId;
    final androidx.work.RunnableScheduler mRunnableScheduler;
    final java.util.concurrent.Executor mTaskExecutor;
    final androidx.work.WorkerFactory mWorkerFactory;

    public interface Provider {
        androidx.work.Configuration getWorkManagerConfiguration();
    }

    Configuration(androidx.work.Configuration.Builder builder) {
        if (builder.mExecutor == null) {
            this.mExecutor = createDefaultExecutor(false);
        } else {
            this.mExecutor = builder.mExecutor;
        }
        if (builder.mTaskExecutor == null) {
            this.mIsUsingDefaultTaskExecutor = true;
            this.mTaskExecutor = createDefaultExecutor(true);
        } else {
            this.mIsUsingDefaultTaskExecutor = false;
            this.mTaskExecutor = builder.mTaskExecutor;
        }
        if (builder.mWorkerFactory == null) {
            this.mWorkerFactory = androidx.work.WorkerFactory.getDefaultWorkerFactory();
        } else {
            this.mWorkerFactory = builder.mWorkerFactory;
        }
        if (builder.mInputMergerFactory == null) {
            this.mInputMergerFactory = androidx.work.InputMergerFactory.getDefaultInputMergerFactory();
        } else {
            this.mInputMergerFactory = builder.mInputMergerFactory;
        }
        if (builder.mRunnableScheduler == null) {
            this.mRunnableScheduler = new androidx.work.impl.DefaultRunnableScheduler();
        } else {
            this.mRunnableScheduler = builder.mRunnableScheduler;
        }
        this.mLoggingLevel = builder.mLoggingLevel;
        this.mMinJobSchedulerId = builder.mMinJobSchedulerId;
        this.mMaxJobSchedulerId = builder.mMaxJobSchedulerId;
        this.mMaxSchedulerLimit = builder.mMaxSchedulerLimit;
        this.mExceptionHandler = builder.mExceptionHandler;
        this.mDefaultProcessName = builder.mDefaultProcessName;
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.mExecutor;
    }

    public java.util.concurrent.Executor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    public androidx.work.WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }

    public androidx.work.InputMergerFactory getInputMergerFactory() {
        return this.mInputMergerFactory;
    }

    public androidx.work.RunnableScheduler getRunnableScheduler() {
        return this.mRunnableScheduler;
    }

    public int getMinimumLoggingLevel() {
        return this.mLoggingLevel;
    }

    public int getMinJobSchedulerId() {
        return this.mMinJobSchedulerId;
    }

    public int getMaxJobSchedulerId() {
        return this.mMaxJobSchedulerId;
    }

    public java.lang.String getDefaultProcessName() {
        return this.mDefaultProcessName;
    }

    public int getMaxSchedulerLimit() {
        if (android.os.Build.VERSION.SDK_INT == 23) {
            return this.mMaxSchedulerLimit / 2;
        }
        return this.mMaxSchedulerLimit;
    }

    public boolean isUsingDefaultTaskExecutor() {
        return this.mIsUsingDefaultTaskExecutor;
    }

    public androidx.work.InitializationExceptionHandler getExceptionHandler() {
        return this.mExceptionHandler;
    }

    private java.util.concurrent.Executor createDefaultExecutor(boolean isTaskExecutor) {
        return java.util.concurrent.Executors.newFixedThreadPool(java.lang.Math.max(2, java.lang.Math.min(java.lang.Runtime.getRuntime().availableProcessors() - 1, 4)), createDefaultThreadFactory(isTaskExecutor));
    }

    private java.util.concurrent.ThreadFactory createDefaultThreadFactory(final boolean isTaskExecutor) {
        return new java.util.concurrent.ThreadFactory() { // from class: androidx.work.Configuration.1
            private final java.util.concurrent.atomic.AtomicInteger mThreadCount = new java.util.concurrent.atomic.AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                return new java.lang.Thread(runnable, (isTaskExecutor ? "WM.task-" : "androidx.work-") + this.mThreadCount.incrementAndGet());
            }
        };
    }

    public static final class Builder {
        java.lang.String mDefaultProcessName;
        androidx.work.InitializationExceptionHandler mExceptionHandler;
        java.util.concurrent.Executor mExecutor;
        androidx.work.InputMergerFactory mInputMergerFactory;
        int mLoggingLevel;
        int mMaxJobSchedulerId;
        int mMaxSchedulerLimit;
        int mMinJobSchedulerId;
        androidx.work.RunnableScheduler mRunnableScheduler;
        java.util.concurrent.Executor mTaskExecutor;
        androidx.work.WorkerFactory mWorkerFactory;

        public Builder() {
            this.mLoggingLevel = 4;
            this.mMinJobSchedulerId = 0;
            this.mMaxJobSchedulerId = Integer.MAX_VALUE;
            this.mMaxSchedulerLimit = 20;
        }

        public Builder(androidx.work.Configuration configuration) {
            this.mExecutor = configuration.mExecutor;
            this.mWorkerFactory = configuration.mWorkerFactory;
            this.mInputMergerFactory = configuration.mInputMergerFactory;
            this.mTaskExecutor = configuration.mTaskExecutor;
            this.mLoggingLevel = configuration.mLoggingLevel;
            this.mMinJobSchedulerId = configuration.mMinJobSchedulerId;
            this.mMaxJobSchedulerId = configuration.mMaxJobSchedulerId;
            this.mMaxSchedulerLimit = configuration.mMaxSchedulerLimit;
            this.mRunnableScheduler = configuration.mRunnableScheduler;
            this.mExceptionHandler = configuration.mExceptionHandler;
            this.mDefaultProcessName = configuration.mDefaultProcessName;
        }

        public androidx.work.Configuration.Builder setWorkerFactory(androidx.work.WorkerFactory workerFactory) {
            this.mWorkerFactory = workerFactory;
            return this;
        }

        public androidx.work.Configuration.Builder setInputMergerFactory(androidx.work.InputMergerFactory inputMergerFactory) {
            this.mInputMergerFactory = inputMergerFactory;
            return this;
        }

        public androidx.work.Configuration.Builder setExecutor(java.util.concurrent.Executor executor) {
            this.mExecutor = executor;
            return this;
        }

        public androidx.work.Configuration.Builder setTaskExecutor(java.util.concurrent.Executor taskExecutor) {
            this.mTaskExecutor = taskExecutor;
            return this;
        }

        public androidx.work.Configuration.Builder setJobSchedulerJobIdRange(int minJobSchedulerId, int maxJobSchedulerId) {
            if (maxJobSchedulerId - minJobSchedulerId < 1000) {
                throw new java.lang.IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.mMinJobSchedulerId = minJobSchedulerId;
            this.mMaxJobSchedulerId = maxJobSchedulerId;
            return this;
        }

        public androidx.work.Configuration.Builder setMaxSchedulerLimit(int maxSchedulerLimit) {
            if (maxSchedulerLimit < 20) {
                throw new java.lang.IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.mMaxSchedulerLimit = java.lang.Math.min(maxSchedulerLimit, 50);
            return this;
        }

        public androidx.work.Configuration.Builder setMinimumLoggingLevel(int loggingLevel) {
            this.mLoggingLevel = loggingLevel;
            return this;
        }

        public androidx.work.Configuration.Builder setRunnableScheduler(androidx.work.RunnableScheduler runnableScheduler) {
            this.mRunnableScheduler = runnableScheduler;
            return this;
        }

        public androidx.work.Configuration.Builder setInitializationExceptionHandler(androidx.work.InitializationExceptionHandler exceptionHandler) {
            this.mExceptionHandler = exceptionHandler;
            return this;
        }

        public androidx.work.Configuration.Builder setDefaultProcessName(java.lang.String processName) {
            this.mDefaultProcessName = processName;
            return this;
        }

        public androidx.work.Configuration build() {
            return new androidx.work.Configuration(this);
        }
    }
}
