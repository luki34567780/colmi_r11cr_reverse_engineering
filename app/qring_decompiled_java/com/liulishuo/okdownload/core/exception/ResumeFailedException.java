package com.liulishuo.okdownload.core.exception;

/* loaded from: /tmp/dex/classes2.dex */
public class ResumeFailedException extends java.io.IOException {
    private final com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause;

    public ResumeFailedException(com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
        super("Resume failed because of " + resumeFailedCause);
        this.resumeFailedCause = resumeFailedCause;
    }

    public com.liulishuo.okdownload.core.cause.ResumeFailedCause getResumeFailedCause() {
        return this.resumeFailedCause;
    }
}
