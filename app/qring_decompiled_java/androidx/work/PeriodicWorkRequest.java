package androidx.work;

/* loaded from: classes.dex */
public final class PeriodicWorkRequest extends androidx.work.WorkRequest {
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    PeriodicWorkRequest(androidx.work.PeriodicWorkRequest.Builder builder) {
        super(builder.mId, builder.mWorkSpec, builder.mTags);
    }

    public static final class Builder extends androidx.work.WorkRequest.Builder<androidx.work.PeriodicWorkRequest.Builder, androidx.work.PeriodicWorkRequest> {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public androidx.work.PeriodicWorkRequest.Builder getThis() {
            return this;
        }

        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass, long repeatInterval, java.util.concurrent.TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            this.mWorkSpec.setPeriodic(repeatIntervalTimeUnit.toMillis(repeatInterval));
        }

        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass, java.time.Duration repeatInterval) {
            super(workerClass);
            this.mWorkSpec.setPeriodic(repeatInterval.toMillis());
        }

        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass, long repeatInterval, java.util.concurrent.TimeUnit repeatIntervalTimeUnit, long flexInterval, java.util.concurrent.TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            this.mWorkSpec.setPeriodic(repeatIntervalTimeUnit.toMillis(repeatInterval), flexIntervalTimeUnit.toMillis(flexInterval));
        }

        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass, java.time.Duration repeatInterval, java.time.Duration flexInterval) {
            super(workerClass);
            this.mWorkSpec.setPeriodic(repeatInterval.toMillis(), flexInterval.toMillis());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public androidx.work.PeriodicWorkRequest buildInternal() {
            if (this.mBackoffCriteriaSet && android.os.Build.VERSION.SDK_INT >= 23 && this.mWorkSpec.constraints.requiresDeviceIdle()) {
                throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (this.mWorkSpec.expedited) {
                throw new java.lang.IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new androidx.work.PeriodicWorkRequest(this);
        }
    }
}
