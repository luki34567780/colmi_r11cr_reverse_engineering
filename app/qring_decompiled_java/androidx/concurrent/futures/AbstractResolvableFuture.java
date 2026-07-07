package androidx.concurrent.futures;

/* loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    static final androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper ATOMIC_HELPER;
    private static final java.lang.Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile androidx.concurrent.futures.AbstractResolvableFuture.Listener listeners;
    volatile java.lang.Object value;
    volatile androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(androidx.concurrent.futures.AbstractResolvableFuture.class.getName());

    protected void afterDone() {
    }

    protected void interruptTask() {
    }

    static {
        androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new androidx.concurrent.futures.AbstractResolvableFuture.SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class, java.lang.Thread.class, "thread"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class, androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class, "next"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.AbstractResolvableFuture.class, androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class, "waiters"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.AbstractResolvableFuture.class, androidx.concurrent.futures.AbstractResolvableFuture.Listener.class, "listeners"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.AbstractResolvableFuture.class, java.lang.Object.class, "value"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            synchronizedHelper = new androidx.concurrent.futures.AbstractResolvableFuture.SynchronizedHelper();
        }
        ATOMIC_HELPER = synchronizedHelper;
        if (th != null) {
            log.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new java.lang.Object();
    }

    private static final class Waiter {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Waiter TOMBSTONE = new androidx.concurrent.futures.AbstractResolvableFuture.Waiter(false);
        volatile androidx.concurrent.futures.AbstractResolvableFuture.Waiter next;
        volatile java.lang.Thread thread;

        Waiter(boolean z) {
        }

        Waiter() {
            androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER.putThread(this, java.lang.Thread.currentThread());
        }

        void setNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter) {
            androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER.putNext(this, waiter);
        }

        void unpark() {
            java.lang.Thread thread = this.thread;
            if (thread != null) {
                this.thread = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
        }
    }

    private void removeWaiter(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter) {
        waiter.thread = null;
        while (true) {
            androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2 = this.waiters;
            if (waiter2 == androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE) {
                return;
            }
            androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter3 = null;
            while (waiter2 != null) {
                androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter4 = waiter2.next;
                if (waiter2.thread != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.next = waiter4;
                    if (waiter3.thread == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.casWaiters(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    private static final class Listener {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Listener TOMBSTONE = new androidx.concurrent.futures.AbstractResolvableFuture.Listener(null, null);
        final java.util.concurrent.Executor executor;
        androidx.concurrent.futures.AbstractResolvableFuture.Listener next;
        final java.lang.Runnable task;

        Listener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.task = runnable;
            this.executor = executor;
        }
    }

    private static final class Failure {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Failure FALLBACK_INSTANCE = new androidx.concurrent.futures.AbstractResolvableFuture.Failure(new java.lang.Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized java.lang.Throwable fillInStackTrace() {
                return this;
            }
        });
        final java.lang.Throwable exception;

        Failure(java.lang.Throwable th) {
            this.exception = (java.lang.Throwable) androidx.concurrent.futures.AbstractResolvableFuture.checkNotNull(th);
        }
    }

    private static final class Cancellation {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Cancellation CAUSELESS_CANCELLED;
        static final androidx.concurrent.futures.AbstractResolvableFuture.Cancellation CAUSELESS_INTERRUPTED;
        final java.lang.Throwable cause;
        final boolean wasInterrupted;

        static {
            if (androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
            } else {
                CAUSELESS_CANCELLED = new androidx.concurrent.futures.AbstractResolvableFuture.Cancellation(false, null);
                CAUSELESS_INTERRUPTED = new androidx.concurrent.futures.AbstractResolvableFuture.Cancellation(true, null);
            }
        }

        Cancellation(boolean z, java.lang.Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }
    }

    private static final class SetFuture<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.ListenableFuture<? extends V> future;
        final androidx.concurrent.futures.AbstractResolvableFuture<V> owner;

        SetFuture(androidx.concurrent.futures.AbstractResolvableFuture<V> abstractResolvableFuture, com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
            this.owner = abstractResolvableFuture;
            this.future = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.owner.value != this) {
                return;
            }
            if (androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER.casValue(this.owner, this, androidx.concurrent.futures.AbstractResolvableFuture.getFutureValue(this.future))) {
                androidx.concurrent.futures.AbstractResolvableFuture.complete(this.owner);
            }
        }
    }

    protected AbstractResolvableFuture() {
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.value;
        if ((obj != null) & (!(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture))) {
            return getDoneValue(obj);
        }
        long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter = this.waiters;
            if (waiter != androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE) {
                androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2 = new androidx.concurrent.futures.AbstractResolvableFuture.Waiter();
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
                            if ((obj2 != null) & (!(obj2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture))) {
                                return getDoneValue(obj2);
                            }
                            nanos = nanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(waiter2);
                    } else {
                        waiter = this.waiters;
                    }
                } while (waiter != androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE);
            }
            return getDoneValue(this.value);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture))) {
                return getDoneValue(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = nanoTime - java.lang.System.nanoTime();
        }
        java.lang.String abstractResolvableFuture = toString();
        java.lang.String lowerCase = timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        java.lang.String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        if (nanos + 1000 < 0) {
            java.lang.String str2 = str + " (plus ";
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
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
        throw new java.util.concurrent.TimeoutException(str + " for " + abstractResolvableFuture);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture))) {
            return getDoneValue(obj2);
        }
        androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter = this.waiters;
        if (waiter != androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE) {
            androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2 = new androidx.concurrent.futures.AbstractResolvableFuture.Waiter();
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
                    } while (!((obj != null) & (!(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture))));
                    return getDoneValue(obj);
                }
                waiter = this.waiters;
            } while (waiter != androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE);
        }
        return getDoneValue(this.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) obj).cause);
        }
        if (obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.Failure) {
            throw new java.util.concurrent.ExecutionException(((androidx.concurrent.futures.AbstractResolvableFuture.Failure) obj).exception);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture)) & (this.value != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        java.lang.Object obj = this.value;
        if (!(obj == null) && !(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture)) {
            return false;
        }
        androidx.concurrent.futures.AbstractResolvableFuture.Cancellation cancellation = GENERATE_CANCELLATION_CAUSES ? new androidx.concurrent.futures.AbstractResolvableFuture.Cancellation(z, new java.util.concurrent.CancellationException("Future.cancel() was called.")) : z ? androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_INTERRUPTED : androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED;
        boolean z2 = false;
        androidx.concurrent.futures.AbstractResolvableFuture<V> abstractResolvableFuture = this;
        while (true) {
            if (ATOMIC_HELPER.casValue(abstractResolvableFuture, obj, cancellation)) {
                if (z) {
                    abstractResolvableFuture.interruptTask();
                }
                complete(abstractResolvableFuture);
                if (!(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture)) {
                    return true;
                }
                com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = ((androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) obj).future;
                if (listenableFuture instanceof androidx.concurrent.futures.AbstractResolvableFuture) {
                    abstractResolvableFuture = (androidx.concurrent.futures.AbstractResolvableFuture) listenableFuture;
                    obj = abstractResolvableFuture.value;
                    if (!(obj == null) && !(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    listenableFuture.cancel(z);
                    return true;
                }
            } else {
                obj = abstractResolvableFuture.value;
                if (!(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture)) {
                    return z2;
                }
            }
        }
    }

    protected final boolean wasInterrupted() {
        java.lang.Object obj = this.value;
        return (obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) && ((androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) obj).wasInterrupted;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        androidx.concurrent.futures.AbstractResolvableFuture.Listener listener = this.listeners;
        if (listener != androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE) {
            androidx.concurrent.futures.AbstractResolvableFuture.Listener listener2 = new androidx.concurrent.futures.AbstractResolvableFuture.Listener(runnable, executor);
            do {
                listener2.next = listener;
                if (ATOMIC_HELPER.casListeners(this, listener, listener2)) {
                    return;
                } else {
                    listener = this.listeners;
                }
            } while (listener != androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE);
        }
        executeListener(runnable, executor);
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

    protected boolean setException(java.lang.Throwable th) {
        if (!ATOMIC_HELPER.casValue(this, null, new androidx.concurrent.futures.AbstractResolvableFuture.Failure((java.lang.Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    protected boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
        androidx.concurrent.futures.AbstractResolvableFuture.Failure failure;
        checkNotNull(listenableFuture);
        java.lang.Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!ATOMIC_HELPER.casValue(this, null, getFutureValue(listenableFuture))) {
                    return false;
                }
                complete(this);
                return true;
            }
            androidx.concurrent.futures.AbstractResolvableFuture.SetFuture setFuture = new androidx.concurrent.futures.AbstractResolvableFuture.SetFuture(this, listenableFuture);
            if (ATOMIC_HELPER.casValue(this, null, setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, androidx.concurrent.futures.DirectExecutor.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        failure = new androidx.concurrent.futures.AbstractResolvableFuture.Failure(th);
                    } catch (java.lang.Throwable unused) {
                        failure = androidx.concurrent.futures.AbstractResolvableFuture.Failure.FALLBACK_INSTANCE;
                    }
                    ATOMIC_HELPER.casValue(this, setFuture, failure);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) {
            listenableFuture.cancel(((androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) obj).wasInterrupted);
        }
        return false;
    }

    static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof androidx.concurrent.futures.AbstractResolvableFuture) {
            java.lang.Object obj = ((androidx.concurrent.futures.AbstractResolvableFuture) listenableFuture).value;
            if (!(obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation)) {
                return obj;
            }
            androidx.concurrent.futures.AbstractResolvableFuture.Cancellation cancellation = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) obj;
            return cancellation.wasInterrupted ? cancellation.cause != null ? new androidx.concurrent.futures.AbstractResolvableFuture.Cancellation(false, cancellation.cause) : androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED : obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) & isCancelled) {
            return androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED;
        }
        try {
            java.lang.Object uninterruptibly = getUninterruptibly(listenableFuture);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (java.util.concurrent.CancellationException e) {
            if (!isCancelled) {
                return new androidx.concurrent.futures.AbstractResolvableFuture.Failure(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
            }
            return new androidx.concurrent.futures.AbstractResolvableFuture.Cancellation(false, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            return new androidx.concurrent.futures.AbstractResolvableFuture.Failure(e2.getCause());
        } catch (java.lang.Throwable th) {
            return new androidx.concurrent.futures.AbstractResolvableFuture.Failure(th);
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

    static void complete(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture) {
        androidx.concurrent.futures.AbstractResolvableFuture.Listener listener = null;
        while (true) {
            abstractResolvableFuture.releaseWaiters();
            abstractResolvableFuture.afterDone();
            androidx.concurrent.futures.AbstractResolvableFuture.Listener clearListeners = abstractResolvableFuture.clearListeners(listener);
            while (clearListeners != null) {
                listener = clearListeners.next;
                java.lang.Runnable runnable = clearListeners.task;
                if (runnable instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) {
                    androidx.concurrent.futures.AbstractResolvableFuture.SetFuture setFuture = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) runnable;
                    abstractResolvableFuture = setFuture.owner;
                    if (abstractResolvableFuture.value == setFuture) {
                        if (ATOMIC_HELPER.casValue(abstractResolvableFuture, setFuture, getFutureValue(setFuture.future))) {
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

    final void maybePropagateCancellationTo(java.util.concurrent.Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    private void releaseWaiters() {
        androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter;
        do {
            waiter = this.waiters;
        } while (!ATOMIC_HELPER.casWaiters(this, waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE));
        while (waiter != null) {
            waiter.unpark();
            waiter = waiter.next;
        }
    }

    private androidx.concurrent.futures.AbstractResolvableFuture.Listener clearListeners(androidx.concurrent.futures.AbstractResolvableFuture.Listener listener) {
        androidx.concurrent.futures.AbstractResolvableFuture.Listener listener2;
        do {
            listener2 = this.listeners;
        } while (!ATOMIC_HELPER.casListeners(this, listener2, androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE));
        androidx.concurrent.futures.AbstractResolvableFuture.Listener listener3 = listener;
        androidx.concurrent.futures.AbstractResolvableFuture.Listener listener4 = listener2;
        while (listener4 != null) {
            androidx.concurrent.futures.AbstractResolvableFuture.Listener listener5 = listener4.next;
            listener4.next = listener3;
            listener3 = listener4;
            listener4 = listener5;
        }
        return listener3;
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
        if (obj instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) {
            return "setFuture=[" + userObjectToString(((androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) obj).future) + "]";
        }
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    private void addDoneString(java.lang.StringBuilder sb) {
        try {
            java.lang.Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.lang.RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (java.util.concurrent.ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private java.lang.String userObjectToString(java.lang.Object obj) {
        return obj == this ? "this future" : java.lang.String.valueOf(obj);
    }

    private static void executeListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e) {
            log.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e);
        }
    }

    private static abstract class AtomicHelper {
        abstract boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener2);

        abstract boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, java.lang.Object obj, java.lang.Object obj2);

        abstract boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2);

        abstract void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2);

        abstract void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, java.lang.Thread thread);

        private AtomicHelper() {
        }
    }

    private static final class SafeAtomicHelper extends androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener> listenersUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> valueUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> waiterNextUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, java.lang.Thread> waiterThreadUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> waitersUpdater;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, java.lang.Thread> atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener> atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> atomicReferenceFieldUpdater5) {
            super();
            this.waiterThreadUpdater = atomicReferenceFieldUpdater;
            this.waiterNextUpdater = atomicReferenceFieldUpdater2;
            this.waitersUpdater = atomicReferenceFieldUpdater3;
            this.listenersUpdater = atomicReferenceFieldUpdater4;
            this.valueUpdater = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, java.lang.Thread thread) {
            this.waiterThreadUpdater.lazySet(waiter, thread);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2) {
            this.waiterNextUpdater.lazySet(waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.waitersUpdater, abstractResolvableFuture, waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.listenersUpdater, abstractResolvableFuture, listener, listener2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, java.lang.Object obj, java.lang.Object obj2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.valueUpdater, abstractResolvableFuture, obj, obj2);
        }
    }

    private static final class SynchronizedHelper extends androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper {
        SynchronizedHelper() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, java.lang.Thread thread) {
            waiter.thread = thread;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2) {
            waiter.next = waiter2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiter2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.waiters != waiter) {
                    return false;
                }
                abstractResolvableFuture.waiters = waiter2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener, androidx.concurrent.futures.AbstractResolvableFuture.Listener listener2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.listeners != listener) {
                    return false;
                }
                abstractResolvableFuture.listeners = listener2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> abstractResolvableFuture, java.lang.Object obj, java.lang.Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.value != obj) {
                    return false;
                }
                abstractResolvableFuture.value = obj2;
                return true;
            }
        }
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T checkNotNull(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }
}
