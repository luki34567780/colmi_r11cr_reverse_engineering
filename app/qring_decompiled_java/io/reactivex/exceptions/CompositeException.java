package io.reactivex.exceptions;

/* loaded from: classes3.dex */
public final class CompositeException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private java.lang.Throwable cause;
    private final java.util.List<java.lang.Throwable> exceptions;
    private final java.lang.String message;

    public CompositeException(java.lang.Throwable... thArr) {
        this(thArr == null ? java.util.Collections.singletonList(new java.lang.NullPointerException("exceptions was null")) : java.util.Arrays.asList(thArr));
    }

    public CompositeException(java.lang.Iterable<? extends java.lang.Throwable> iterable) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (iterable != null) {
            for (java.lang.Throwable th : iterable) {
                if (th instanceof io.reactivex.exceptions.CompositeException) {
                    linkedHashSet.addAll(((io.reactivex.exceptions.CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new java.lang.NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new java.lang.NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new java.lang.IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        java.util.List<java.lang.Throwable> unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        this.exceptions = unmodifiableList;
        this.message = unmodifiableList.size() + " exceptions occurred. ";
    }

    public java.util.List<java.lang.Throwable> getExceptions() {
        return this.exceptions;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public synchronized java.lang.Throwable getCause() {
        if (this.cause == null) {
            io.reactivex.exceptions.CompositeException.CompositeExceptionCausalChain compositeExceptionCausalChain = new io.reactivex.exceptions.CompositeException.CompositeExceptionCausalChain();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<java.lang.Throwable> it = this.exceptions.iterator();
            java.lang.Throwable th = compositeExceptionCausalChain;
            while (it.hasNext()) {
                java.lang.Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (java.lang.Throwable th2 : getListOfCauses(next)) {
                        if (hashSet.contains(th2)) {
                            next = new java.lang.RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th2);
                        }
                    }
                    try {
                        th.initCause(next);
                    } catch (java.lang.Throwable unused) {
                    }
                    th = getRootCause(th);
                }
            }
            this.cause = compositeExceptionCausalChain;
        }
        return this.cause;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(java.lang.System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream printStream) {
        printStackTrace(new io.reactivex.exceptions.CompositeException.WrappedPrintStream(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter printWriter) {
        printStackTrace(new io.reactivex.exceptions.CompositeException.WrappedPrintWriter(printWriter));
    }

    private void printStackTrace(io.reactivex.exceptions.CompositeException.PrintStreamOrWriter printStreamOrWriter) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (java.lang.StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (java.lang.Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            appendStackTrace(sb, th, "\t");
            i++;
        }
        printStreamOrWriter.println(sb.toString());
    }

    private void appendStackTrace(java.lang.StringBuilder sb, java.lang.Throwable th, java.lang.String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (java.lang.StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            appendStackTrace(sb, th.getCause(), "");
        }
    }

    static abstract class PrintStreamOrWriter {
        abstract void println(java.lang.Object obj);

        PrintStreamOrWriter() {
        }
    }

    static final class WrappedPrintStream extends io.reactivex.exceptions.CompositeException.PrintStreamOrWriter {
        private final java.io.PrintStream printStream;

        WrappedPrintStream(java.io.PrintStream printStream) {
            this.printStream = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        void println(java.lang.Object obj) {
            this.printStream.println(obj);
        }
    }

    static final class WrappedPrintWriter extends io.reactivex.exceptions.CompositeException.PrintStreamOrWriter {
        private final java.io.PrintWriter printWriter;

        WrappedPrintWriter(java.io.PrintWriter printWriter) {
            this.printWriter = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        void println(java.lang.Object obj) {
            this.printWriter.println(obj);
        }
    }

    static final class CompositeExceptionCausalChain extends java.lang.RuntimeException {
        static final java.lang.String MESSAGE = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
            return MESSAGE;
        }

        CompositeExceptionCausalChain() {
        }
    }

    private java.util.List<java.lang.Throwable> getListOfCauses(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                java.lang.Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    public int size() {
        return this.exceptions.size();
    }

    java.lang.Throwable getRootCause(java.lang.Throwable th) {
        java.lang.Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            java.lang.Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }
}
