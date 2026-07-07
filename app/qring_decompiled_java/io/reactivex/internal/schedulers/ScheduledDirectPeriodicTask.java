package io.reactivex.internal.schedulers;

/* loaded from: classes3.dex */
public final class ScheduledDirectPeriodicTask extends io.reactivex.internal.schedulers.AbstractDirectTask implements java.lang.Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // io.reactivex.internal.schedulers.AbstractDirectTask, io.reactivex.schedulers.SchedulerRunnableIntrospection
    public /* bridge */ /* synthetic */ java.lang.Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public ScheduledDirectPeriodicTask(java.lang.Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.runner = java.lang.Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (java.lang.Throwable th) {
            this.runner = null;
            lazySet(FINISHED);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }
}
