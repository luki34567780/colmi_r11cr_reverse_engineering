package androidx.work.impl.utils.futures;

/* loaded from: classes.dex */
public abstract class AbstractFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    static final androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper ATOMIC_HELPER;
    private static final java.lang.Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile androidx.work.impl.utils.futures.AbstractFuture.Listener listeners;
    volatile java.lang.Object value;
    volatile androidx.work.impl.utils.futures.AbstractFuture.Waiter waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(androidx.work.impl.utils.futures.AbstractFuture.class.getName());

    protected void afterDone() {
    }

    protected void interruptTask() {
    }

    static {
        androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new androidx.work.impl.utils.futures.AbstractFuture.SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.AbstractFuture.Waiter.class, java.lang.Thread.class, "thread"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.AbstractFuture.Waiter.class, androidx.work.impl.utils.futures.AbstractFuture.Waiter.class, "next"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.AbstractFuture.class, androidx.work.impl.utils.futures.AbstractFuture.Waiter.class, "waiters"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.AbstractFuture.class, androidx.work.impl.utils.futures.AbstractFuture.Listener.class, "listeners"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.AbstractFuture.class, java.lang.Object.class, "value"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            synchronizedHelper = new androidx.work.impl.utils.futures.AbstractFuture.SynchronizedHelper();
        }
        ATOMIC_HELPER = synchronizedHelper;
        if (th != null) {
            log.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new java.lang.Object();
    }

    private static final class Waiter {
        static final androidx.work.impl.utils.futures.AbstractFuture.Waiter TOMBSTONE = new androidx.work.impl.utils.futures.AbstractFuture.Waiter(false);
        volatile androidx.work.impl.utils.futures.AbstractFuture.Waiter next;
        volatile java.lang.Thread thread;

        Waiter(boolean unused) {
        }

        Waiter() {
            androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER.putThread(this, java.lang.Thread.currentThread());
        }

        void setNext(androidx.work.impl.utils.futures.AbstractFuture.Waiter next) {
            androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER.putNext(this, next);
        }

        void unpark() {
            java.lang.Thread thread = this.thread;
            if (thread != null) {
                this.thread = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
        }
    }

    private void removeWaiter(androidx.work.impl.utils.futures.AbstractFuture.Waiter node) {
        node.thread = null;
        while (true) {
            androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter = this.waiters;
            if (waiter == androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE) {
                return;
            }
            androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2 = null;
            while (waiter != null) {
                androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter3 = waiter.next;
                if (waiter.thread != null) {
                    waiter2 = waiter;
                } else if (waiter2 != null) {
                    waiter2.next = waiter3;
                    if (waiter2.thread == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.casWaiters(this, waiter, waiter3)) {
                    break;
                }
                waiter = waiter3;
            }
            return;
        }
    }

    private static final class Listener {
        static final androidx.work.impl.utils.futures.AbstractFuture.Listener TOMBSTONE = new androidx.work.impl.utils.futures.AbstractFuture.Listener(null, null);
        final java.util.concurrent.Executor executor;
        androidx.work.impl.utils.futures.AbstractFuture.Listener next;
        final java.lang.Runnable task;

        Listener(java.lang.Runnable task, java.util.concurrent.Executor executor) {
            this.task = task;
            this.executor = executor;
        }
    }

    private static final class Failure {
        static final androidx.work.impl.utils.futures.AbstractFuture.Failure FALLBACK_INSTANCE = new androidx.work.impl.utils.futures.AbstractFuture.Failure(new java.lang.Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized java.lang.Throwable fillInStackTrace() {
                return this;
            }
        });
        final java.lang.Throwable exception;

        Failure(java.lang.Throwable exception) {
            this.exception = (java.lang.Throwable) androidx.work.impl.utils.futures.AbstractFuture.checkNotNull(exception);
        }
    }

    private static final class Cancellation {
        static final androidx.work.impl.utils.futures.AbstractFuture.Cancellation CAUSELESS_CANCELLED;
        static final androidx.work.impl.utils.futures.AbstractFuture.Cancellation CAUSELESS_INTERRUPTED;
        final java.lang.Throwable cause;
        final boolean wasInterrupted;

        static {
            if (androidx.work.impl.utils.futures.AbstractFuture.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
            } else {
                CAUSELESS_CANCELLED = new androidx.work.impl.utils.futures.AbstractFuture.Cancellation(false, null);
                CAUSELESS_INTERRUPTED = new androidx.work.impl.utils.futures.AbstractFuture.Cancellation(true, null);
            }
        }

        Cancellation(boolean wasInterrupted, java.lang.Throwable cause) {
            this.wasInterrupted = wasInterrupted;
            this.cause = cause;
        }
    }

    private static final class SetFuture<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.ListenableFuture<? extends V> future;
        final androidx.work.impl.utils.futures.AbstractFuture<V> owner;

        SetFuture(androidx.work.impl.utils.futures.AbstractFuture<V> owner, com.google.common.util.concurrent.ListenableFuture<? extends V> future) {
            this.owner = owner;
            this.future = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.owner.value != this) {
                return;
            }
            if (androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER.casValue(this.owner, this, androidx.work.impl.utils.futures.AbstractFuture.getFutureValue(this.future))) {
                androidx.work.impl.utils.futures.AbstractFuture.complete(this.owner);
            }
        }
    }

    protected AbstractFuture() {
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        long nanos = unit.toNanos(timeout);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.value;
        if ((obj != null) & (!(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))) {
            return getDoneValue(obj);
        }
        long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter = this.waiters;
            if (waiter != androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE) {
                androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2 = new androidx.work.impl.utils.futures.AbstractFuture.Waiter();
                do {
                    waiter2.setNext(waiter);
                    if (ATOMIC_HELPER.casWaiters(this, waiter, waiter2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                removeWaiter(waiter2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.value;
                            if ((obj2 != null) & (!(obj2 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))) {
                                return getDoneValue(obj2);
                            }
                            nanos = nanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(waiter2);
                    } else {
                        waiter = this.waiters;
                    }
                } while (waiter != androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE);
            }
            return getDoneValue(this.value);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))) {
                return getDoneValue(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = nanoTime - java.lang.System.nanoTime();
        }
        java.lang.String abstractFuture = toString();
        java.lang.String lowerCase = unit.toString().toLowerCase(java.util.Locale.ROOT);
        java.lang.String str = "Waited " + timeout + " " + unit.toString().toLowerCase(java.util.Locale.ROOT);
        if (nanos + 1000 < 0) {
            java.lang.String str2 = str + " (plus ";
            long j = -nanos;
            long convert = unit.convert(j, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j - unit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                java.lang.String str3 = str2 + convert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(str + " but future completed as timeout expired");
        }
        throw new java.util.concurrent.TimeoutException(str + " for " + abstractFuture);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))) {
            return getDoneValue(obj2);
        }
        androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter = this.waiters;
        if (waiter != androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE) {
            androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter2 = new androidx.work.impl.utils.futures.AbstractFuture.Waiter();
            do {
                waiter2.setNext(waiter);
                if (ATOMIC_HELPER.casWaiters(this, waiter, waiter2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            removeWaiter(waiter2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))));
                    return getDoneValue(obj);
                }
                waiter = this.waiters;
            } while (waiter != androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE);
        }
        return getDoneValue(this.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((androidx.work.impl.utils.futures.AbstractFuture.Cancellation) obj).cause);
        }
        if (obj instanceof androidx.work.impl.utils.futures.AbstractFuture.Failure) {
            throw new java.util.concurrent.ExecutionException(((androidx.work.impl.utils.futures.AbstractFuture.Failure) obj).exception);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture)) & (this.value != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        androidx.work.impl.utils.futures.AbstractFuture.Cancellation cancellation;
        java.lang.Object obj = this.value;
        if (!(obj == null) && !(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            cancellation = new androidx.work.impl.utils.futures.AbstractFuture.Cancellation(mayInterruptIfRunning, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else if (mayInterruptIfRunning) {
            cancellation = androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED;
        } else {
            cancellation = androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_CANCELLED;
        }
        boolean z = false;
        androidx.work.impl.utils.futures.AbstractFuture<V> abstractFuture = this;
        while (true) {
            if (ATOMIC_HELPER.casValue(abstractFuture, obj, cancellation)) {
                if (mayInterruptIfRunning) {
                    abstractFuture.interruptTask();
                }
                complete(abstractFuture);
                if (!(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture)) {
                    return true;
                }
                com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = ((androidx.work.impl.utils.futures.AbstractFuture.SetFuture) obj).future;
                if (listenableFuture instanceof androidx.work.impl.utils.futures.AbstractFuture) {
                    abstractFuture = (androidx.work.impl.utils.futures.AbstractFuture) listenableFuture;
                    obj = abstractFuture.value;
                    if (!(obj == null) && !(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture)) {
                        return true;
                    }
                    z = true;
                } else {
                    listenableFuture.cancel(mayInterruptIfRunning);
                    return true;
                }
            } else {
                obj = abstractFuture.value;
                if (!(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture)) {
                    return z;
                }
            }
        }
    }

    protected final boolean wasInterrupted() {
        java.lang.Object obj = this.value;
        return (obj instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation) && ((androidx.work.impl.utils.futures.AbstractFuture.Cancellation) obj).wasInterrupted;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor) {
        checkNotNull(listener);
        checkNotNull(executor);
        androidx.work.impl.utils.futures.AbstractFuture.Listener listener2 = this.listeners;
        if (listener2 != androidx.work.impl.utils.futures.AbstractFuture.Listener.TOMBSTONE) {
            androidx.work.impl.utils.futures.AbstractFuture.Listener listener3 = new androidx.work.impl.utils.futures.AbstractFuture.Listener(listener, executor);
            do {
                listener3.next = listener2;
                if (ATOMIC_HELPER.casListeners(this, listener2, listener3)) {
                    return;
                } else {
                    listener2 = this.listeners;
                }
            } while (listener2 != androidx.work.impl.utils.futures.AbstractFuture.Listener.TOMBSTONE);
        }
        executeListener(listener, executor);
    }

    protected boolean set(V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!ATOMIC_HELPER.casValue(this, null, v)) {
            return false;
        }
        complete(this);
        return true;
    }

    protected boolean setException(java.lang.Throwable throwable) {
        if (!ATOMIC_HELPER.casValue(this, null, new androidx.work.impl.utils.futures.AbstractFuture.Failure((java.lang.Throwable) checkNotNull(throwable)))) {
            return false;
        }
        complete(this);
        return true;
    }

    protected boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> future) {
        androidx.work.impl.utils.futures.AbstractFuture.Failure failure;
        checkNotNull(future);
        java.lang.Object obj = this.value;
        if (obj == null) {
            if (future.isDone()) {
                if (!ATOMIC_HELPER.casValue(this, null, getFutureValue(future))) {
                    return false;
                }
                complete(this);
                return true;
            }
            androidx.work.impl.utils.futures.AbstractFuture.SetFuture setFuture = new androidx.work.impl.utils.futures.AbstractFuture.SetFuture(this, future);
            if (ATOMIC_HELPER.casValue(this, null, setFuture)) {
                try {
                    future.addListener(setFuture, androidx.work.impl.utils.futures.DirectExecutor.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        failure = new androidx.work.impl.utils.futures.AbstractFuture.Failure(th);
                    } catch (java.lang.Throwable unused) {
                        failure = androidx.work.impl.utils.futures.AbstractFuture.Failure.FALLBACK_INSTANCE;
                    }
                    ATOMIC_HELPER.casValue(this, setFuture, failure);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation) {
            future.cancel(((androidx.work.impl.utils.futures.AbstractFuture.Cancellation) obj).wasInterrupted);
        }
        return false;
    }

    static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> future) {
        if (future instanceof androidx.work.impl.utils.futures.AbstractFuture) {
            java.lang.Object obj = ((androidx.work.impl.utils.futures.AbstractFuture) future).value;
            if (!(obj instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation)) {
                return obj;
            }
            androidx.work.impl.utils.futures.AbstractFuture.Cancellation cancellation = (androidx.work.impl.utils.futures.AbstractFuture.Cancellation) obj;
            return cancellation.wasInterrupted ? cancellation.cause != null ? new androidx.work.impl.utils.futures.AbstractFuture.Cancellation(false, cancellation.cause) : androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_CANCELLED : obj;
        }
        boolean isCancelled = future.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) & isCancelled) {
            return androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_CANCELLED;
        }
        try {
            java.lang.Object uninterruptibly = getUninterruptibly(future);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (java.util.concurrent.CancellationException e) {
            if (!isCancelled) {
                return new androidx.work.impl.utils.futures.AbstractFuture.Failure(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e));
            }
            return new androidx.work.impl.utils.futures.AbstractFuture.Cancellation(false, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            return new androidx.work.impl.utils.futures.AbstractFuture.Failure(e2.getCause());
        } catch (java.lang.Throwable th) {
            return new androidx.work.impl.utils.futures.AbstractFuture.Failure(th);
        }
    }

    private static <V> V getUninterruptibly(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return v;
    }

    static void complete(androidx.work.impl.utils.futures.AbstractFuture<?> abstractFuture) {
        androidx.work.impl.utils.futures.AbstractFuture.Listener listener = null;
        while (true) {
            abstractFuture.releaseWaiters();
            abstractFuture.afterDone();
            androidx.work.impl.utils.futures.AbstractFuture.Listener clearListeners = abstractFuture.clearListeners(listener);
            while (clearListeners != null) {
                listener = clearListeners.next;
                java.lang.Runnable runnable = clearListeners.task;
                if (runnable instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture) {
                    androidx.work.impl.utils.futures.AbstractFuture.SetFuture setFuture = (androidx.work.impl.utils.futures.AbstractFuture.SetFuture) runnable;
                    abstractFuture = setFuture.owner;
                    if (abstractFuture.value == setFuture) {
                        if (ATOMIC_HELPER.casValue(abstractFuture, setFuture, getFutureValue(setFuture.future))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, clearListeners.executor);
                }
                clearListeners = listener;
            }
            return;
        }
    }

    final void maybePropagateCancellationTo(java.util.concurrent.Future<?> related) {
        if ((related != null) && isCancelled()) {
            related.cancel(wasInterrupted());
        }
    }

    private void releaseWaiters() {
        androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter;
        do {
            waiter = this.waiters;
        } while (!ATOMIC_HELPER.casWaiters(this, waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE));
        while (waiter != null) {
            waiter.unpark();
            waiter = waiter.next;
        }
    }

    private androidx.work.impl.utils.futures.AbstractFuture.Listener clearListeners(androidx.work.impl.utils.futures.AbstractFuture.Listener onto) {
        androidx.work.impl.utils.futures.AbstractFuture.Listener listener;
        do {
            listener = this.listeners;
        } while (!ATOMIC_HELPER.casListeners(this, listener, androidx.work.impl.utils.futures.AbstractFuture.Listener.TOMBSTONE));
        androidx.work.impl.utils.futures.AbstractFuture.Listener listener2 = onto;
        androidx.work.impl.utils.futures.AbstractFuture.Listener listener3 = listener;
        while (listener3 != null) {
            androidx.work.impl.utils.futures.AbstractFuture.Listener listener4 = listener3.next;
            listener3.next = listener2;
            listener2 = listener3;
            listener3 = listener4;
        }
        return listener2;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            try {
                str = pendingToString();
            } catch (java.lang.RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                addDoneString(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String pendingToString() {
        java.lang.Object obj = this.value;
        if (obj instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture) {
            return "setFuture=[" + userObjectToString(((androidx.work.impl.utils.futures.AbstractFuture.SetFuture) obj).future) + "]";
        }
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    private void addDoneString(java.lang.StringBuilder builder) {
        try {
            java.lang.Object uninterruptibly = getUninterruptibly(this);
            builder.append("SUCCESS, result=[");
            builder.append(userObjectToString(uninterruptibly));
            builder.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            builder.append("CANCELLED");
        } catch (java.lang.RuntimeException e) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e.getClass());
            builder.append(" thrown from get()]");
        } catch (java.util.concurrent.ExecutionException e2) {
            builder.append("FAILURE, cause=[");
            builder.append(e2.getCause());
            builder.append("]");
        }
    }

    private java.lang.String userObjectToString(java.lang.Object o) {
        return o == this ? "this future" : java.lang.String.valueOf(o);
    }

    private static void executeListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e) {
            log.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e);
        }
    }

    private static abstract class AtomicHelper {
        abstract boolean casListeners(androidx.work.impl.utils.futures.AbstractFuture<?> future, androidx.work.impl.utils.futures.AbstractFuture.Listener expect, androidx.work.impl.utils.futures.AbstractFuture.Listener update);

        abstract boolean casValue(androidx.work.impl.utils.futures.AbstractFuture<?> future, java.lang.Object expect, java.lang.Object update);

        abstract boolean casWaiters(androidx.work.impl.utils.futures.AbstractFuture<?> future, androidx.work.impl.utils.futures.AbstractFuture.Waiter expect, androidx.work.impl.utils.futures.AbstractFuture.Waiter update);

        abstract void putNext(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter newValue);

        abstract void putThread(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, java.lang.Thread newValue);

        private AtomicHelper() {
        }
    }

    private static final class SafeAtomicHelper extends androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Listener> listenersUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, java.lang.Object> valueUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter> waiterNextUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, java.lang.Thread> waiterThreadUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Waiter> waitersUpdater;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, java.lang.Thread> waiterThreadUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter> waiterNextUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Waiter> waitersUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Listener> listenersUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, java.lang.Object> valueUpdater) {
            super();
            this.waiterThreadUpdater = waiterThreadUpdater;
            this.waiterNextUpdater = waiterNextUpdater;
            this.waitersUpdater = waitersUpdater;
            this.listenersUpdater = listenersUpdater;
            this.valueUpdater = valueUpdater;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putThread(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, java.lang.Thread newValue) {
            this.waiterThreadUpdater.lazySet(waiter, newValue);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putNext(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter newValue) {
            this.waiterNextUpdater.lazySet(waiter, newValue);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casWaiters(androidx.work.impl.utils.futures.AbstractFuture<?> future, androidx.work.impl.utils.futures.AbstractFuture.Waiter expect, androidx.work.impl.utils.futures.AbstractFuture.Waiter update) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.waitersUpdater, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casListeners(androidx.work.impl.utils.futures.AbstractFuture<?> future, androidx.work.impl.utils.futures.AbstractFuture.Listener expect, androidx.work.impl.utils.futures.AbstractFuture.Listener update) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.listenersUpdater, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casValue(androidx.work.impl.utils.futures.AbstractFuture<?> future, java.lang.Object expect, java.lang.Object update) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.valueUpdater, future, expect, update);
        }
    }

    private static final class SynchronizedHelper extends androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper {
        SynchronizedHelper() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putThread(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, java.lang.Thread newValue) {
            waiter.thread = newValue;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putNext(androidx.work.impl.utils.futures.AbstractFuture.Waiter waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter newValue) {
            waiter.next = newValue;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casWaiters(androidx.work.impl.utils.futures.AbstractFuture<?> future, androidx.work.impl.utils.futures.AbstractFuture.Waiter expect, androidx.work.impl.utils.futures.AbstractFuture.Waiter update) {
            synchronized (future) {
                if (future.waiters != expect) {
                    return false;
                }
                future.waiters = update;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casListeners(androidx.work.impl.utils.futures.AbstractFuture<?> future, androidx.work.impl.utils.futures.AbstractFuture.Listener expect, androidx.work.impl.utils.futures.AbstractFuture.Listener update) {
            synchronized (future) {
                if (future.listeners != expect) {
                    return false;
                }
                future.listeners = update;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casValue(androidx.work.impl.utils.futures.AbstractFuture<?> future, java.lang.Object expect, java.lang.Object update) {
            synchronized (future) {
                if (future.value != expect) {
                    return false;
                }
                future.value = update;
                return true;
            }
        }
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(java.lang.String message, java.lang.Throwable cause) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    static <T> T checkNotNull(T reference) {
        java.util.Objects.requireNonNull(reference);
        return reference;
    }
}
