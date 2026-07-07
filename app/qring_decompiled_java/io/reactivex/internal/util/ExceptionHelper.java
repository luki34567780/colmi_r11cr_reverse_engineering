package io.reactivex.internal.util;

/* loaded from: classes3.dex */
public final class ExceptionHelper {
    public static final java.lang.Throwable TERMINATED = new io.reactivex.internal.util.ExceptionHelper.Termination();

    private ExceptionHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static java.lang.RuntimeException wrapOrThrow(java.lang.Throwable th) {
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
        if (th instanceof java.lang.RuntimeException) {
            return (java.lang.RuntimeException) th;
        }
        return new java.lang.RuntimeException(th);
    }

    public static <T> boolean addThrowable(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> atomicReference, java.lang.Throwable th) {
        java.lang.Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == TERMINATED) {
                return false;
            }
        } while (!atomicReference.compareAndSet(th2, th2 == null ? th : new io.reactivex.exceptions.CompositeException(th2, th)));
        return true;
    }

    public static <T> java.lang.Throwable terminate(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> atomicReference) {
        java.lang.Throwable th = atomicReference.get();
        java.lang.Throwable th2 = TERMINATED;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static java.util.List<java.lang.Throwable> flatten(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.offer(th);
        while (!arrayDeque.isEmpty()) {
            java.lang.Throwable th2 = (java.lang.Throwable) arrayDeque.removeFirst();
            if (th2 instanceof io.reactivex.exceptions.CompositeException) {
                java.util.List<java.lang.Throwable> exceptions = ((io.reactivex.exceptions.CompositeException) th2).getExceptions();
                for (int size = exceptions.size() - 1; size >= 0; size--) {
                    arrayDeque.offerFirst(exceptions.get(size));
                }
            } else {
                arrayList.add(th2);
            }
        }
        return arrayList;
    }

    public static <E extends java.lang.Throwable> java.lang.Exception throwIfThrowable(java.lang.Throwable th) throws java.lang.Throwable {
        if (th instanceof java.lang.Exception) {
            return (java.lang.Exception) th;
        }
        throw th;
    }

    public static java.lang.String timeoutMessage(long j, java.util.concurrent.TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    static final class Termination extends java.lang.Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        @Override // java.lang.Throwable
        public java.lang.Throwable fillInStackTrace() {
            return this;
        }

        Termination() {
            super("No further exceptions");
        }
    }
}
