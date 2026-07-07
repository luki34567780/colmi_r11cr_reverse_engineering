package io.reactivex.internal.schedulers;

/* loaded from: classes3.dex */
public final class ImmediateThinScheduler extends io.reactivex.Scheduler {
    static final io.reactivex.disposables.Disposable DISPOSED;
    public static final io.reactivex.Scheduler INSTANCE = new io.reactivex.internal.schedulers.ImmediateThinScheduler();
    static final io.reactivex.Scheduler.Worker WORKER = new io.reactivex.internal.schedulers.ImmediateThinScheduler.ImmediateThinWorker();

    static {
        io.reactivex.disposables.Disposable empty = io.reactivex.disposables.Disposables.empty();
        DISPOSED = empty;
        empty.dispose();
    }

    private ImmediateThinScheduler() {
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable) {
        runnable.run();
        return DISPOSED;
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        return WORKER;
    }

    static final class ImmediateThinWorker extends io.reactivex.Scheduler.Worker {
        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return false;
        }

        ImmediateThinWorker() {
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            runnable.run();
            return io.reactivex.internal.schedulers.ImmediateThinScheduler.DISPOSED;
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            throw new java.lang.UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedulePeriodically(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            throw new java.lang.UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }
    }
}
