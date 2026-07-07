package io.reactivex;

/* loaded from: classes3.dex */
public abstract class Scheduler {
    static final long CLOCK_DRIFT_TOLERANCE_NANOSECONDS = java.util.concurrent.TimeUnit.MINUTES.toNanos(java.lang.Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract io.reactivex.Scheduler.Worker createWorker();

    public void shutdown() {
    }

    public void start() {
    }

    public static long clockDriftTolerance() {
        return CLOCK_DRIFT_TOLERANCE_NANOSECONDS;
    }

    public long now(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable) {
        return scheduleDirect(runnable, 0L, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        io.reactivex.Scheduler.Worker createWorker = createWorker();
        io.reactivex.Scheduler.DisposeTask disposeTask = new io.reactivex.Scheduler.DisposeTask(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable), createWorker);
        createWorker.schedule(disposeTask, j, timeUnit);
        return disposeTask;
    }

    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        io.reactivex.Scheduler.Worker createWorker = createWorker();
        io.reactivex.Scheduler.PeriodicDirectTask periodicDirectTask = new io.reactivex.Scheduler.PeriodicDirectTask(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable), createWorker);
        io.reactivex.disposables.Disposable schedulePeriodically = createWorker.schedulePeriodically(periodicDirectTask, j, j2, timeUnit);
        return schedulePeriodically == io.reactivex.internal.disposables.EmptyDisposable.INSTANCE ? schedulePeriodically : periodicDirectTask;
    }

    public <S extends io.reactivex.Scheduler & io.reactivex.disposables.Disposable> S when(io.reactivex.functions.Function<io.reactivex.Flowable<io.reactivex.Flowable<io.reactivex.Completable>>, io.reactivex.Completable> function) {
        return new io.reactivex.internal.schedulers.SchedulerWhen(function, this);
    }

    public static abstract class Worker implements io.reactivex.disposables.Disposable {
        public abstract io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit);

        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            return schedule(runnable, 0L, java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        public io.reactivex.disposables.Disposable schedulePeriodically(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
            io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable2 = new io.reactivex.internal.disposables.SequentialDisposable(sequentialDisposable);
            java.lang.Runnable onSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
            long nanos = timeUnit.toNanos(j2);
            long now = now(java.util.concurrent.TimeUnit.NANOSECONDS);
            io.reactivex.disposables.Disposable schedule = schedule(new io.reactivex.Scheduler.Worker.PeriodicTask(now + timeUnit.toNanos(j), onSchedule, now, sequentialDisposable2, nanos), j, timeUnit);
            if (schedule == io.reactivex.internal.disposables.EmptyDisposable.INSTANCE) {
                return schedule;
            }
            sequentialDisposable.replace(schedule);
            return sequentialDisposable2;
        }

        public long now(java.util.concurrent.TimeUnit timeUnit) {
            return timeUnit.convert(java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        final class PeriodicTask implements java.lang.Runnable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
            long count;
            final java.lang.Runnable decoratedRun;
            long lastNowNanoseconds;
            final long periodInNanoseconds;
            final io.reactivex.internal.disposables.SequentialDisposable sd;
            long startInNanoseconds;

            PeriodicTask(long j, java.lang.Runnable runnable, long j2, io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, long j3) {
                this.decoratedRun = runnable;
                this.sd = sequentialDisposable;
                this.periodInNanoseconds = j3;
                this.lastNowNanoseconds = j2;
                this.startInNanoseconds = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j;
                this.decoratedRun.run();
                if (this.sd.isDisposed()) {
                    return;
                }
                long now = io.reactivex.Scheduler.Worker.this.now(java.util.concurrent.TimeUnit.NANOSECONDS);
                long j2 = io.reactivex.Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS + now;
                long j3 = this.lastNowNanoseconds;
                if (j2 < j3 || now >= j3 + this.periodInNanoseconds + io.reactivex.Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS) {
                    long j4 = this.periodInNanoseconds;
                    long j5 = now + j4;
                    long j6 = this.count + 1;
                    this.count = j6;
                    this.startInNanoseconds = j5 - (j4 * j6);
                    j = j5;
                } else {
                    long j7 = this.startInNanoseconds;
                    long j8 = this.count + 1;
                    this.count = j8;
                    j = j7 + (j8 * this.periodInNanoseconds);
                }
                this.lastNowNanoseconds = now;
                this.sd.replace(io.reactivex.Scheduler.Worker.this.schedule(this, j - now, java.util.concurrent.TimeUnit.NANOSECONDS));
            }

            @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
            public java.lang.Runnable getWrappedRunnable() {
                return this.decoratedRun;
            }
        }
    }

    static final class PeriodicDirectTask implements io.reactivex.disposables.Disposable, java.lang.Runnable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
        volatile boolean disposed;
        final java.lang.Runnable run;
        final io.reactivex.Scheduler.Worker worker;

        PeriodicDirectTask(java.lang.Runnable runnable, io.reactivex.Scheduler.Worker worker) {
            this.run = runnable;
            this.worker = worker;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.disposed) {
                return;
            }
            try {
                this.run.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.worker.dispose();
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.worker.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public java.lang.Runnable getWrappedRunnable() {
            return this.run;
        }
    }

    static final class DisposeTask implements io.reactivex.disposables.Disposable, java.lang.Runnable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
        final java.lang.Runnable decoratedRun;
        java.lang.Thread runner;
        final io.reactivex.Scheduler.Worker w;

        DisposeTask(java.lang.Runnable runnable, io.reactivex.Scheduler.Worker worker) {
            this.decoratedRun = runnable;
            this.w = worker;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.runner = java.lang.Thread.currentThread();
            try {
                this.decoratedRun.run();
            } finally {
                dispose();
                this.runner = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.runner == java.lang.Thread.currentThread()) {
                io.reactivex.Scheduler.Worker worker = this.w;
                if (worker instanceof io.reactivex.internal.schedulers.NewThreadWorker) {
                    ((io.reactivex.internal.schedulers.NewThreadWorker) worker).shutdown();
                    return;
                }
            }
            this.w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.w.isDisposed();
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public java.lang.Runnable getWrappedRunnable() {
            return this.decoratedRun;
        }
    }
}
