package com.liulishuo.okdownload.core.exception;

/* loaded from: /tmp/dex/classes2.dex */
public class InterruptException extends java.io.IOException {
    public static final com.liulishuo.okdownload.core.exception.InterruptException SIGNAL = new com.liulishuo.okdownload.core.exception.InterruptException() { // from class: com.liulishuo.okdownload.core.exception.InterruptException.1
        @Override // java.lang.Throwable
        public void printStackTrace() {
            throw new java.lang.IllegalAccessError("Stack is ignored for signal");
        }
    };

    private InterruptException() {
        super("Interrupted");
    }
}
