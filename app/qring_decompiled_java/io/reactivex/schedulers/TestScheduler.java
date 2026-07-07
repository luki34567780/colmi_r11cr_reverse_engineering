package io.reactivex.schedulers;

/* loaded from: classes3.dex */
public final class TestScheduler extends io.reactivex.Scheduler {
    long counter;
    final java.util.Queue<io.reactivex.schedulers.TestScheduler.TimedRunnable> queue = new java.util.concurrent.PriorityBlockingQueue(11);
    volatile long time;

    public TestScheduler() {
    }

    public TestScheduler(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.time = timeUnit.toNanos(j);
    }

    static final class TimedRunnable implements java.lang.Comparable<io.reactivex.schedulers.TestScheduler.TimedRunnable> {
        final long count;
        final java.lang.Runnable run;
        final io.reactivex.schedulers.TestScheduler.TestWorker scheduler;
        final long time;

        TimedRunnable(io.reactivex.schedulers.TestScheduler.TestWorker testWorker, long j, java.lang.Runnable runnable, long j2) {
            this.time = j;
            this.run = runnable;
            this.scheduler = testWorker;
            this.count = j2;
        }

        public java.lang.String toString() {
            return java.lang.String.format("TimedRunnable(time = %d, run = %s)", java.lang.Long.valueOf(this.time), this.run.toString());
        }

        @Override // java.lang.Comparable
        public int compareTo(io.reactivex.schedulers.TestScheduler.TimedRunnable timedRunnable) {
            long j = this.time;
            long j2 = timedRunnable.time;
            if (j == j2) {
                return io.reactivex.internal.functions.ObjectHelper.compare(this.count, timedRunnable.count);
            }
            return io.reactivex.internal.functions.ObjectHelper.compare(j, j2);
        }
    }

    @Override // io.reactivex.Scheduler
    public long now(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.time, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public void advanceTimeBy(long j, java.util.concurrent.TimeUnit timeUnit) {
        advanceTimeTo(this.time + timeUnit.toNanos(j), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, java.util.concurrent.TimeUnit timeUnit) {
        triggerActions(timeUnit.toNanos(j));
    }

    public void triggerActions() {
        triggerActions(this.time);
    }

    private void triggerActions(long j) {
        while (true) {
            io.reactivex.schedulers.TestScheduler.TimedRunnable peek = this.queue.peek();
            if (peek == null || peek.time > j) {
                break;
            }
            this.time = peek.time == 0 ? this.time : peek.time;
            this.queue.remove(peek);
            if (!peek.scheduler.disposed) {
                peek.run.run();
            }
        }
        this.time = j;
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.schedulers.TestScheduler.TestWorker();
    }

    final class TestWorker extends io.reactivex.Scheduler.Worker {
        volatile boolean disposed;

        TestWorker() {
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (this.disposed) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            long nanos = io.reactivex.schedulers.TestScheduler.this.time + timeUnit.toNanos(j);
            io.reactivex.schedulers.TestScheduler testScheduler = io.reactivex.schedulers.TestScheduler.this;
            long j2 = testScheduler.counter;
            testScheduler.counter = 1 + j2;
            io.reactivex.schedulers.TestScheduler.TimedRunnable timedRunnable = new io.reactivex.schedulers.TestScheduler.TimedRunnable(this, nanos, runnable, j2);
            io.reactivex.schedulers.TestScheduler.this.queue.add(timedRunnable);
            return io.reactivex.disposables.Disposables.fromRunnable(new io.reactivex.schedulers.TestScheduler.TestWorker.QueueRemove(timedRunnable));
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            if (this.disposed) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            io.reactivex.schedulers.TestScheduler testScheduler = io.reactivex.schedulers.TestScheduler.this;
            long j = testScheduler.counter;
            testScheduler.counter = 1 + j;
            io.reactivex.schedulers.TestScheduler.TimedRunnable timedRunnable = new io.reactivex.schedulers.TestScheduler.TimedRunnable(this, 0L, runnable, j);
            io.reactivex.schedulers.TestScheduler.this.queue.add(timedRunnable);
            return io.reactivex.disposables.Disposables.fromRunnable(new io.reactivex.schedulers.TestScheduler.TestWorker.QueueRemove(timedRunnable));
        }

        @Override // io.reactivex.Scheduler.Worker
        public long now(java.util.concurrent.TimeUnit timeUnit) {
            return io.reactivex.schedulers.TestScheduler.this.now(timeUnit);
        }

        final class QueueRemove implements java.lang.Runnable {
            final io.reactivex.schedulers.TestScheduler.TimedRunnable timedAction;

            QueueRemove(io.reactivex.schedulers.TestScheduler.TimedRunnable timedRunnable) {
                this.timedAction = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                io.reactivex.schedulers.TestScheduler.this.queue.remove(this.timedAction);
            }
        }
    }
}
