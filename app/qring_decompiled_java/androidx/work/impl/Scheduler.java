package androidx.work.impl;

/* loaded from: classes.dex */
public interface Scheduler {
    public static final int MAX_GREEDY_SCHEDULER_LIMIT = 200;
    public static final int MAX_SCHEDULER_LIMIT = 50;

    void cancel(java.lang.String workSpecId);

    boolean hasLimitedSchedulingSlots();

    void schedule(androidx.work.impl.model.WorkSpec... workSpecs);
}
