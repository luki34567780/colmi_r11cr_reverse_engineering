package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public abstract class QueueDrainObserver<T, U, V> extends io.reactivex.internal.observers.QueueDrainSubscriberPad2 implements io.reactivex.Observer<T>, io.reactivex.internal.util.ObservableQueueDrain<U, V> {
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final io.reactivex.Observer<? super V> downstream;
    protected java.lang.Throwable error;
    protected final io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public void accept(io.reactivex.Observer<? super V> observer, U u) {
    }

    public QueueDrainObserver(io.reactivex.Observer<? super V> observer, io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue) {
        this.downstream = observer;
        this.queue = simplePlainQueue;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean enter() {
        return this.wip.getAndIncrement() == 0;
    }

    public final boolean fastEnter() {
        return this.wip.get() == 0 && this.wip.compareAndSet(0, 1);
    }

    protected final void fastPathEmit(U u, boolean z, io.reactivex.disposables.Disposable disposable) {
        io.reactivex.Observer<? super V> observer = this.downstream;
        io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (this.wip.get() == 0 && this.wip.compareAndSet(0, 1)) {
            accept(observer, u);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            simplePlainQueue.offer(u);
            if (!enter()) {
                return;
            }
        }
        io.reactivex.internal.util.QueueDrainHelper.drainLoop(simplePlainQueue, observer, z, disposable, this);
    }

    protected final void fastPathOrderedEmit(U u, boolean z, io.reactivex.disposables.Disposable disposable) {
        io.reactivex.Observer<? super V> observer = this.downstream;
        io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (this.wip.get() == 0 && this.wip.compareAndSet(0, 1)) {
            if (simplePlainQueue.isEmpty()) {
                accept(observer, u);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                simplePlainQueue.offer(u);
            }
        } else {
            simplePlainQueue.offer(u);
            if (!enter()) {
                return;
            }
        }
        io.reactivex.internal.util.QueueDrainHelper.drainLoop(simplePlainQueue, observer, z, disposable, this);
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final java.lang.Throwable error() {
        return this.error;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final int leave(int i) {
        return this.wip.addAndGet(i);
    }
}
