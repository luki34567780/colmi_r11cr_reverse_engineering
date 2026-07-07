package androidx.work.impl.background.greedy;

/* loaded from: classes.dex */
public class DelayedWorkTracker {
    static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("DelayedWorkTracker");
    final androidx.work.impl.background.greedy.GreedyScheduler mGreedyScheduler;
    private final androidx.work.RunnableScheduler mRunnableScheduler;
    private final java.util.Map<java.lang.String, java.lang.Runnable> mRunnables = new java.util.HashMap();

    public DelayedWorkTracker(androidx.work.impl.background.greedy.GreedyScheduler scheduler, androidx.work.RunnableScheduler runnableScheduler) {
        this.mGreedyScheduler = scheduler;
        this.mRunnableScheduler = runnableScheduler;
    }

    public void schedule(final androidx.work.impl.model.WorkSpec workSpec) {
        java.lang.Runnable remove = this.mRunnables.remove(workSpec.id);
        if (remove != null) {
            this.mRunnableScheduler.cancel(remove);
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.work.impl.background.greedy.DelayedWorkTracker.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.work.Logger.get().debug(androidx.work.impl.background.greedy.DelayedWorkTracker.TAG, java.lang.String.format("Scheduling work %s", workSpec.id), new java.lang.Throwable[0]);
                androidx.work.impl.background.greedy.DelayedWorkTracker.this.mGreedyScheduler.schedule(workSpec);
            }
        };
        this.mRunnables.put(workSpec.id, runnable);
        this.mRunnableScheduler.scheduleWithDelay(workSpec.calculateNextRunTime() - java.lang.System.currentTimeMillis(), runnable);
    }

    public void unschedule(java.lang.String workSpecId) {
        java.lang.Runnable remove = this.mRunnables.remove(workSpecId);
        if (remove != null) {
            this.mRunnableScheduler.cancel(remove);
        }
    }
}
