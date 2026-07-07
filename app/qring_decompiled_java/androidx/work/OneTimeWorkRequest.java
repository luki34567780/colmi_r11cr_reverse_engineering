package androidx.work;

/* loaded from: classes.dex */
public final class OneTimeWorkRequest extends androidx.work.WorkRequest {
    public static androidx.work.OneTimeWorkRequest from(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass) {
        return new androidx.work.OneTimeWorkRequest.Builder(workerClass).build();
    }

    public static java.util.List<androidx.work.OneTimeWorkRequest> from(java.util.List<java.lang.Class<? extends androidx.work.ListenableWorker>> workerClasses) {
        java.util.ArrayList arrayList = new java.util.ArrayList(workerClasses.size());
        java.util.Iterator<java.lang.Class<? extends androidx.work.ListenableWorker>> it = workerClasses.iterator();
        while (it.hasNext()) {
            arrayList.add(new androidx.work.OneTimeWorkRequest.Builder(it.next()).build());
        }
        return arrayList;
    }

    OneTimeWorkRequest(androidx.work.OneTimeWorkRequest.Builder builder) {
        super(builder.mId, builder.mWorkSpec, builder.mTags);
    }

    public static final class Builder extends androidx.work.WorkRequest.Builder<androidx.work.OneTimeWorkRequest.Builder, androidx.work.OneTimeWorkRequest> {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public androidx.work.OneTimeWorkRequest.Builder getThis() {
            return this;
        }

        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass) {
            super(workerClass);
            this.mWorkSpec.inputMergerClassName = androidx.work.OverwritingInputMerger.class.getName();
        }

        public androidx.work.OneTimeWorkRequest.Builder setInputMerger(java.lang.Class<? extends androidx.work.InputMerger> inputMerger) {
            this.mWorkSpec.inputMergerClassName = inputMerger.getName();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public androidx.work.OneTimeWorkRequest buildInternal() {
            if (this.mBackoffCriteriaSet && android.os.Build.VERSION.SDK_INT >= 23 && this.mWorkSpec.constraints.requiresDeviceIdle()) {
                throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new androidx.work.OneTimeWorkRequest(this);
        }
    }
}
