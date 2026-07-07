package androidx.work.impl.background.greedy;

/* loaded from: classes.dex */
public class GreedyScheduler implements androidx.work.impl.Scheduler, androidx.work.impl.constraints.WorkConstraintsCallback, androidx.work.impl.ExecutionListener {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("GreedyScheduler");
    private final android.content.Context mContext;
    private androidx.work.impl.background.greedy.DelayedWorkTracker mDelayedWorkTracker;
    java.lang.Boolean mInDefaultProcess;
    private boolean mRegisteredExecutionListener;
    private final androidx.work.impl.constraints.WorkConstraintsTracker mWorkConstraintsTracker;
    private final androidx.work.impl.WorkManagerImpl mWorkManagerImpl;
    private final java.util.Set<androidx.work.impl.model.WorkSpec> mConstrainedWorkSpecs = new java.util.HashSet();
    private final java.lang.Object mLock = new java.lang.Object();

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    public GreedyScheduler(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkManagerImpl workManagerImpl) {
        this.mContext = context;
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkConstraintsTracker = new androidx.work.impl.constraints.WorkConstraintsTracker(context, taskExecutor, this);
        this.mDelayedWorkTracker = new androidx.work.impl.background.greedy.DelayedWorkTracker(this, configuration.getRunnableScheduler());
    }

    public GreedyScheduler(android.content.Context context, androidx.work.impl.WorkManagerImpl workManagerImpl, androidx.work.impl.constraints.WorkConstraintsTracker workConstraintsTracker) {
        this.mContext = context;
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkConstraintsTracker = workConstraintsTracker;
    }

    public void setDelayedWorkTracker(androidx.work.impl.background.greedy.DelayedWorkTracker delayedWorkTracker) {
        this.mDelayedWorkTracker = delayedWorkTracker;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(androidx.work.impl.model.WorkSpec... workSpecs) {
        if (this.mInDefaultProcess == null) {
            checkDefaultProcess();
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            androidx.work.Logger.get().info(TAG, "Ignoring schedule request in a secondary process", new java.lang.Throwable[0]);
            return;
        }
        registerExecutionListenerIfNeeded();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (androidx.work.impl.model.WorkSpec workSpec : workSpecs) {
            long calculateNextRunTime = workSpec.calculateNextRunTime();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (workSpec.state == androidx.work.WorkInfo.State.ENQUEUED) {
                if (currentTimeMillis < calculateNextRunTime) {
                    androidx.work.impl.background.greedy.DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
                    if (delayedWorkTracker != null) {
                        delayedWorkTracker.schedule(workSpec);
                    }
                } else if (workSpec.hasConstraints()) {
                    if (android.os.Build.VERSION.SDK_INT >= 23 && workSpec.constraints.requiresDeviceIdle()) {
                        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Ignoring WorkSpec %s, Requires device idle.", workSpec), new java.lang.Throwable[0]);
                    } else if (android.os.Build.VERSION.SDK_INT >= 24 && workSpec.constraints.hasContentUriTriggers()) {
                        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", workSpec), new java.lang.Throwable[0]);
                    } else {
                        hashSet.add(workSpec);
                        hashSet2.add(workSpec.id);
                    }
                } else {
                    androidx.work.Logger.get().debug(TAG, java.lang.String.format("Starting work for %s", workSpec.id), new java.lang.Throwable[0]);
                    this.mWorkManagerImpl.startWork(workSpec.id);
                }
            }
        }
        synchronized (this.mLock) {
            if (!hashSet.isEmpty()) {
                androidx.work.Logger.get().debug(TAG, java.lang.String.format("Starting tracking for [%s]", android.text.TextUtils.join(",", hashSet2)), new java.lang.Throwable[0]);
                this.mConstrainedWorkSpecs.addAll(hashSet);
                this.mWorkConstraintsTracker.replace(this.mConstrainedWorkSpecs);
            }
        }
    }

    private void checkDefaultProcess() {
        this.mInDefaultProcess = java.lang.Boolean.valueOf(androidx.work.impl.utils.ProcessUtils.isDefaultProcess(this.mContext, this.mWorkManagerImpl.getConfiguration()));
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(java.lang.String workSpecId) {
        if (this.mInDefaultProcess == null) {
            checkDefaultProcess();
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            androidx.work.Logger.get().info(TAG, "Ignoring schedule request in non-main process", new java.lang.Throwable[0]);
            return;
        }
        registerExecutionListenerIfNeeded();
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Cancelling work ID %s", workSpecId), new java.lang.Throwable[0]);
        androidx.work.impl.background.greedy.DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
        if (delayedWorkTracker != null) {
            delayedWorkTracker.unschedule(workSpecId);
        }
        this.mWorkManagerImpl.stopWork(workSpecId);
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(java.util.List<java.lang.String> workSpecIds) {
        for (java.lang.String str : workSpecIds) {
            androidx.work.Logger.get().debug(TAG, java.lang.String.format("Constraints met: Scheduling work ID %s", str), new java.lang.Throwable[0]);
            this.mWorkManagerImpl.startWork(str);
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(java.util.List<java.lang.String> workSpecIds) {
        for (java.lang.String str : workSpecIds) {
            androidx.work.Logger.get().debug(TAG, java.lang.String.format("Constraints not met: Cancelling work ID %s", str), new java.lang.Throwable[0]);
            this.mWorkManagerImpl.stopWork(str);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(java.lang.String workSpecId, boolean needsReschedule) {
        removeConstraintTrackingFor(workSpecId);
    }

    private void removeConstraintTrackingFor(java.lang.String workSpecId) {
        synchronized (this.mLock) {
            java.util.Iterator<androidx.work.impl.model.WorkSpec> it = this.mConstrainedWorkSpecs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.work.impl.model.WorkSpec next = it.next();
                if (next.id.equals(workSpecId)) {
                    androidx.work.Logger.get().debug(TAG, java.lang.String.format("Stopping tracking for %s", workSpecId), new java.lang.Throwable[0]);
                    this.mConstrainedWorkSpecs.remove(next);
                    this.mWorkConstraintsTracker.replace(this.mConstrainedWorkSpecs);
                    break;
                }
            }
        }
    }

    private void registerExecutionListenerIfNeeded() {
        if (this.mRegisteredExecutionListener) {
            return;
        }
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
        this.mRegisteredExecutionListener = true;
    }
}
