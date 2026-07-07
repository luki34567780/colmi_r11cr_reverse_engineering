package androidx.work.impl.model;

/* loaded from: classes.dex */
public final class WorkSpec {
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WorkSpec");
    public static final androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>, java.util.List<androidx.work.WorkInfo>> WORK_INFO_MAPPER = new androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>, java.util.List<androidx.work.WorkInfo>>() { // from class: androidx.work.impl.model.WorkSpec.1
        @Override // androidx.arch.core.util.Function
        public java.util.List<androidx.work.WorkInfo> apply(java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> input) {
            if (input == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(input.size());
            java.util.Iterator<androidx.work.impl.model.WorkSpec.WorkInfoPojo> it = input.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toWorkInfo());
            }
            return arrayList;
        }
    };
    public long backoffDelayDuration;
    public androidx.work.BackoffPolicy backoffPolicy;
    public androidx.work.Constraints constraints;
    public boolean expedited;
    public long flexDuration;
    public java.lang.String id;
    public long initialDelay;
    public androidx.work.Data input;
    public java.lang.String inputMergerClassName;
    public long intervalDuration;
    public long minimumRetentionDuration;
    public androidx.work.OutOfQuotaPolicy outOfQuotaPolicy;
    public androidx.work.Data output;
    public long periodStartTime;
    public int runAttemptCount;
    public long scheduleRequestedAt;
    public androidx.work.WorkInfo.State state;
    public java.lang.String workerClassName;

    public WorkSpec(java.lang.String id, java.lang.String workerClassName) {
        this.state = androidx.work.WorkInfo.State.ENQUEUED;
        this.input = androidx.work.Data.EMPTY;
        this.output = androidx.work.Data.EMPTY;
        this.constraints = androidx.work.Constraints.NONE;
        this.backoffPolicy = androidx.work.BackoffPolicy.EXPONENTIAL;
        this.backoffDelayDuration = androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.scheduleRequestedAt = -1L;
        this.outOfQuotaPolicy = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.id = id;
        this.workerClassName = workerClassName;
    }

    public WorkSpec(androidx.work.impl.model.WorkSpec other) {
        this.state = androidx.work.WorkInfo.State.ENQUEUED;
        this.input = androidx.work.Data.EMPTY;
        this.output = androidx.work.Data.EMPTY;
        this.constraints = androidx.work.Constraints.NONE;
        this.backoffPolicy = androidx.work.BackoffPolicy.EXPONENTIAL;
        this.backoffDelayDuration = androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.scheduleRequestedAt = -1L;
        this.outOfQuotaPolicy = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.id = other.id;
        this.workerClassName = other.workerClassName;
        this.state = other.state;
        this.inputMergerClassName = other.inputMergerClassName;
        this.input = new androidx.work.Data(other.input);
        this.output = new androidx.work.Data(other.output);
        this.initialDelay = other.initialDelay;
        this.intervalDuration = other.intervalDuration;
        this.flexDuration = other.flexDuration;
        this.constraints = new androidx.work.Constraints(other.constraints);
        this.runAttemptCount = other.runAttemptCount;
        this.backoffPolicy = other.backoffPolicy;
        this.backoffDelayDuration = other.backoffDelayDuration;
        this.periodStartTime = other.periodStartTime;
        this.minimumRetentionDuration = other.minimumRetentionDuration;
        this.scheduleRequestedAt = other.scheduleRequestedAt;
        this.expedited = other.expedited;
        this.outOfQuotaPolicy = other.outOfQuotaPolicy;
    }

    public void setBackoffDelayDuration(long backoffDelayDuration) {
        if (backoffDelayDuration > androidx.work.WorkRequest.MAX_BACKOFF_MILLIS) {
            androidx.work.Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value", new java.lang.Throwable[0]);
            backoffDelayDuration = 18000000;
        }
        if (backoffDelayDuration < androidx.work.WorkRequest.MIN_BACKOFF_MILLIS) {
            androidx.work.Logger.get().warning(TAG, "Backoff delay duration less than minimum value", new java.lang.Throwable[0]);
            backoffDelayDuration = 10000;
        }
        this.backoffDelayDuration = backoffDelayDuration;
    }

    public boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public boolean isBackedOff() {
        return this.state == androidx.work.WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public void setPeriodic(long intervalDuration) {
        if (intervalDuration < androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            androidx.work.Logger.get().warning(TAG, java.lang.String.format("Interval duration lesser than minimum allowed value; Changed to %s", java.lang.Long.valueOf(androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS)), new java.lang.Throwable[0]);
            intervalDuration = 900000;
        }
        setPeriodic(intervalDuration, intervalDuration);
    }

    public void setPeriodic(long intervalDuration, long flexDuration) {
        if (intervalDuration < androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            androidx.work.Logger.get().warning(TAG, java.lang.String.format("Interval duration lesser than minimum allowed value; Changed to %s", java.lang.Long.valueOf(androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS)), new java.lang.Throwable[0]);
            intervalDuration = 900000;
        }
        if (flexDuration < androidx.work.PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            androidx.work.Logger.get().warning(TAG, java.lang.String.format("Flex duration lesser than minimum allowed value; Changed to %s", java.lang.Long.valueOf(androidx.work.PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS)), new java.lang.Throwable[0]);
            flexDuration = 300000;
        }
        if (flexDuration > intervalDuration) {
            androidx.work.Logger.get().warning(TAG, java.lang.String.format("Flex duration greater than interval duration; Changed to %s", java.lang.Long.valueOf(intervalDuration)), new java.lang.Throwable[0]);
            flexDuration = intervalDuration;
        }
        this.intervalDuration = intervalDuration;
        this.flexDuration = flexDuration;
    }

    public long calculateNextRunTime() {
        long scalb;
        if (isBackedOff()) {
            if (this.backoffPolicy == androidx.work.BackoffPolicy.LINEAR) {
                scalb = this.backoffDelayDuration * this.runAttemptCount;
            } else {
                scalb = (long) java.lang.Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1);
            }
            return this.periodStartTime + java.lang.Math.min(androidx.work.WorkRequest.MAX_BACKOFF_MILLIS, scalb);
        }
        if (isPeriodic()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j = this.periodStartTime;
            long j2 = j == 0 ? currentTimeMillis + this.initialDelay : j;
            long j3 = this.flexDuration;
            long j4 = this.intervalDuration;
            if (j3 != j4) {
                return j2 + j4 + (j == 0 ? j3 * (-1) : 0L);
            }
            return j2 + (j != 0 ? j4 : 0L);
        }
        long j5 = this.periodStartTime;
        if (j5 == 0) {
            j5 = java.lang.System.currentTimeMillis();
        }
        return j5 + this.initialDelay;
    }

    public boolean hasConstraints() {
        return !androidx.work.Constraints.NONE.equals(this.constraints);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        androidx.work.impl.model.WorkSpec workSpec = (androidx.work.impl.model.WorkSpec) o;
        if (this.initialDelay != workSpec.initialDelay || this.intervalDuration != workSpec.intervalDuration || this.flexDuration != workSpec.flexDuration || this.runAttemptCount != workSpec.runAttemptCount || this.backoffDelayDuration != workSpec.backoffDelayDuration || this.periodStartTime != workSpec.periodStartTime || this.minimumRetentionDuration != workSpec.minimumRetentionDuration || this.scheduleRequestedAt != workSpec.scheduleRequestedAt || this.expedited != workSpec.expedited || !this.id.equals(workSpec.id) || this.state != workSpec.state || !this.workerClassName.equals(workSpec.workerClassName)) {
            return false;
        }
        java.lang.String str = this.inputMergerClassName;
        if (str == null ? workSpec.inputMergerClassName == null : str.equals(workSpec.inputMergerClassName)) {
            return this.input.equals(workSpec.input) && this.output.equals(workSpec.output) && this.constraints.equals(workSpec.constraints) && this.backoffPolicy == workSpec.backoffPolicy && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        java.lang.String str = this.inputMergerClassName;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31;
        long j = this.initialDelay;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.intervalDuration;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.flexDuration;
        int hashCode3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31;
        long j4 = this.backoffDelayDuration;
        int i3 = (hashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.periodStartTime;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.minimumRetentionDuration;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.scheduleRequestedAt;
        return ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.expedited ? 1 : 0)) * 31) + this.outOfQuotaPolicy.hashCode();
    }

    public java.lang.String toString() {
        return "{WorkSpec: " + this.id + "}";
    }

    public static class IdAndState {
        public java.lang.String id;
        public androidx.work.WorkInfo.State state;

        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof androidx.work.impl.model.WorkSpec.IdAndState)) {
                return false;
            }
            androidx.work.impl.model.WorkSpec.IdAndState idAndState = (androidx.work.impl.model.WorkSpec.IdAndState) o;
            if (this.state != idAndState.state) {
                return false;
            }
            return this.id.equals(idAndState.id);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }
    }

    public static class WorkInfoPojo {
        public java.lang.String id;
        public androidx.work.Data output;
        public java.util.List<androidx.work.Data> progress;
        public int runAttemptCount;
        public androidx.work.WorkInfo.State state;
        public java.util.List<java.lang.String> tags;

        public androidx.work.WorkInfo toWorkInfo() {
            androidx.work.Data data;
            java.util.List<androidx.work.Data> list = this.progress;
            if (list != null && !list.isEmpty()) {
                data = this.progress.get(0);
            } else {
                data = androidx.work.Data.EMPTY;
            }
            return new androidx.work.WorkInfo(java.util.UUID.fromString(this.id), this.state, this.output, this.tags, data, this.runAttemptCount);
        }

        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof androidx.work.impl.model.WorkSpec.WorkInfoPojo)) {
                return false;
            }
            androidx.work.impl.model.WorkSpec.WorkInfoPojo workInfoPojo = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) o;
            if (this.runAttemptCount != workInfoPojo.runAttemptCount) {
                return false;
            }
            java.lang.String str = this.id;
            if (str == null ? workInfoPojo.id != null : !str.equals(workInfoPojo.id)) {
                return false;
            }
            if (this.state != workInfoPojo.state) {
                return false;
            }
            androidx.work.Data data = this.output;
            if (data == null ? workInfoPojo.output != null : !data.equals(workInfoPojo.output)) {
                return false;
            }
            java.util.List<java.lang.String> list = this.tags;
            if (list == null ? workInfoPojo.tags != null : !list.equals(workInfoPojo.tags)) {
                return false;
            }
            java.util.List<androidx.work.Data> list2 = this.progress;
            java.util.List<androidx.work.Data> list3 = workInfoPojo.progress;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            java.lang.String str = this.id;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            androidx.work.WorkInfo.State state = this.state;
            int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 31;
            androidx.work.Data data = this.output;
            int hashCode3 = (((hashCode2 + (data != null ? data.hashCode() : 0)) * 31) + this.runAttemptCount) * 31;
            java.util.List<java.lang.String> list = this.tags;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            java.util.List<androidx.work.Data> list2 = this.progress;
            return hashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }
}
