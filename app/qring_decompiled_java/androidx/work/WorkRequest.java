package androidx.work;

/* loaded from: classes.dex */
public abstract class WorkRequest {
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private java.util.UUID mId;
    private java.util.Set<java.lang.String> mTags;
    private androidx.work.impl.model.WorkSpec mWorkSpec;

    protected WorkRequest(java.util.UUID id, androidx.work.impl.model.WorkSpec workSpec, java.util.Set<java.lang.String> tags) {
        this.mId = id;
        this.mWorkSpec = workSpec;
        this.mTags = tags;
    }

    public java.util.UUID getId() {
        return this.mId;
    }

    public java.lang.String getStringId() {
        return this.mId.toString();
    }

    public androidx.work.impl.model.WorkSpec getWorkSpec() {
        return this.mWorkSpec;
    }

    public java.util.Set<java.lang.String> getTags() {
        return this.mTags;
    }

    public static abstract class Builder<B extends androidx.work.WorkRequest.Builder<?, ?>, W extends androidx.work.WorkRequest> {
        androidx.work.impl.model.WorkSpec mWorkSpec;
        java.lang.Class<? extends androidx.work.ListenableWorker> mWorkerClass;
        boolean mBackoffCriteriaSet = false;
        java.util.Set<java.lang.String> mTags = new java.util.HashSet();
        java.util.UUID mId = java.util.UUID.randomUUID();

        abstract W buildInternal();

        abstract B getThis();

        Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass) {
            this.mWorkerClass = workerClass;
            this.mWorkSpec = new androidx.work.impl.model.WorkSpec(this.mId.toString(), workerClass.getName());
            addTag(workerClass.getName());
        }

        public final B setBackoffCriteria(androidx.work.BackoffPolicy backoffPolicy, long backoffDelay, java.util.concurrent.TimeUnit timeUnit) {
            this.mBackoffCriteriaSet = true;
            this.mWorkSpec.backoffPolicy = backoffPolicy;
            this.mWorkSpec.setBackoffDelayDuration(timeUnit.toMillis(backoffDelay));
            return getThis();
        }

        public final B setBackoffCriteria(androidx.work.BackoffPolicy backoffPolicy, java.time.Duration duration) {
            this.mBackoffCriteriaSet = true;
            this.mWorkSpec.backoffPolicy = backoffPolicy;
            this.mWorkSpec.setBackoffDelayDuration(duration.toMillis());
            return getThis();
        }

        public final B setConstraints(androidx.work.Constraints constraints) {
            this.mWorkSpec.constraints = constraints;
            return getThis();
        }

        public final B setInputData(androidx.work.Data inputData) {
            this.mWorkSpec.input = inputData;
            return getThis();
        }

        public final B addTag(java.lang.String tag) {
            this.mTags.add(tag);
            return getThis();
        }

        public final B keepResultsForAtLeast(long duration, java.util.concurrent.TimeUnit timeUnit) {
            this.mWorkSpec.minimumRetentionDuration = timeUnit.toMillis(duration);
            return getThis();
        }

        public final B keepResultsForAtLeast(java.time.Duration duration) {
            this.mWorkSpec.minimumRetentionDuration = duration.toMillis();
            return getThis();
        }

        public B setInitialDelay(long duration, java.util.concurrent.TimeUnit timeUnit) {
            this.mWorkSpec.initialDelay = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - java.lang.System.currentTimeMillis() <= this.mWorkSpec.initialDelay) {
                throw new java.lang.IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
            return getThis();
        }

        public B setInitialDelay(java.time.Duration duration) {
            this.mWorkSpec.initialDelay = duration.toMillis();
            if (Long.MAX_VALUE - java.lang.System.currentTimeMillis() <= this.mWorkSpec.initialDelay) {
                throw new java.lang.IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
            return getThis();
        }

        public B setExpedited(androidx.work.OutOfQuotaPolicy policy) {
            this.mWorkSpec.expedited = true;
            this.mWorkSpec.outOfQuotaPolicy = policy;
            return getThis();
        }

        public final W build() {
            W buildInternal = buildInternal();
            androidx.work.Constraints constraints = this.mWorkSpec.constraints;
            boolean z = (android.os.Build.VERSION.SDK_INT >= 24 && constraints.hasContentUriTriggers()) || constraints.requiresBatteryNotLow() || constraints.requiresCharging() || (android.os.Build.VERSION.SDK_INT >= 23 && constraints.requiresDeviceIdle());
            if (this.mWorkSpec.expedited) {
                if (z) {
                    throw new java.lang.IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (this.mWorkSpec.initialDelay > 0) {
                    throw new java.lang.IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.mId = java.util.UUID.randomUUID();
            androidx.work.impl.model.WorkSpec workSpec = new androidx.work.impl.model.WorkSpec(this.mWorkSpec);
            this.mWorkSpec = workSpec;
            workSpec.id = this.mId.toString();
            return buildInternal;
        }

        public final B setInitialState(androidx.work.WorkInfo.State state) {
            this.mWorkSpec.state = state;
            return getThis();
        }

        public final B setInitialRunAttemptCount(int runAttemptCount) {
            this.mWorkSpec.runAttemptCount = runAttemptCount;
            return getThis();
        }

        public final B setPeriodStartTime(long periodStartTime, java.util.concurrent.TimeUnit timeUnit) {
            this.mWorkSpec.periodStartTime = timeUnit.toMillis(periodStartTime);
            return getThis();
        }

        public final B setScheduleRequestedAt(long scheduleRequestedAt, java.util.concurrent.TimeUnit timeUnit) {
            this.mWorkSpec.scheduleRequestedAt = timeUnit.toMillis(scheduleRequestedAt);
            return getThis();
        }
    }
}
