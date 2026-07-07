package io.reactivex.internal.schedulers;

/* loaded from: classes3.dex */
public final class NewThreadScheduler extends io.reactivex.Scheduler {
    final java.util.concurrent.ThreadFactory threadFactory;
    private static final java.lang.String THREAD_NAME_PREFIX = "RxNewThreadScheduler";
    private static final java.lang.String KEY_NEWTHREAD_PRIORITY = "rx2.newthread-priority";
    private static final io.reactivex.internal.schedulers.RxThreadFactory THREAD_FACTORY = new io.reactivex.internal.schedulers.RxThreadFactory(THREAD_NAME_PREFIX, java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger(KEY_NEWTHREAD_PRIORITY, 5).intValue())));

    public NewThreadScheduler() {
        this(THREAD_FACTORY);
    }

    public NewThreadScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.NewThreadWorker(this.threadFactory);
    }
}
