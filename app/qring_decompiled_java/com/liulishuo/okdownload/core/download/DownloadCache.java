package com.liulishuo.okdownload.core.download;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadCache {
    private volatile boolean fileBusyAfterRun;
    private final com.liulishuo.okdownload.core.file.MultiPointOutputStream outputStream;
    private volatile boolean preAllocateFailed;
    private volatile boolean preconditionFailed;
    private volatile java.io.IOException realCause;
    private java.lang.String redirectLocation;
    private volatile boolean serverCanceled;
    private volatile boolean unknownError;
    private volatile boolean userCanceled;

    DownloadCache(com.liulishuo.okdownload.core.file.MultiPointOutputStream multiPointOutputStream) {
        this.outputStream = multiPointOutputStream;
    }

    private DownloadCache() {
        this.outputStream = null;
    }

    com.liulishuo.okdownload.core.file.MultiPointOutputStream getOutputStream() {
        com.liulishuo.okdownload.core.file.MultiPointOutputStream multiPointOutputStream = this.outputStream;
        if (multiPointOutputStream != null) {
            return multiPointOutputStream;
        }
        throw new java.lang.IllegalArgumentException();
    }

    void setRedirectLocation(java.lang.String str) {
        this.redirectLocation = str;
    }

    java.lang.String getRedirectLocation() {
        return this.redirectLocation;
    }

    boolean isPreconditionFailed() {
        return this.preconditionFailed;
    }

    public boolean isUserCanceled() {
        return this.userCanceled;
    }

    boolean isServerCanceled() {
        return this.serverCanceled;
    }

    boolean isUnknownError() {
        return this.unknownError;
    }

    boolean isFileBusyAfterRun() {
        return this.fileBusyAfterRun;
    }

    public boolean isPreAllocateFailed() {
        return this.preAllocateFailed;
    }

    java.io.IOException getRealCause() {
        return this.realCause;
    }

    com.liulishuo.okdownload.core.cause.ResumeFailedCause getResumeFailedCause() {
        return ((com.liulishuo.okdownload.core.exception.ResumeFailedException) this.realCause).getResumeFailedCause();
    }

    public boolean isInterrupt() {
        return this.preconditionFailed || this.userCanceled || this.serverCanceled || this.unknownError || this.fileBusyAfterRun || this.preAllocateFailed;
    }

    public void setPreconditionFailed(java.io.IOException iOException) {
        this.preconditionFailed = true;
        this.realCause = iOException;
    }

    void setUserCanceled() {
        this.userCanceled = true;
    }

    public void setFileBusyAfterRun() {
        this.fileBusyAfterRun = true;
    }

    public void setServerCanceled(java.io.IOException iOException) {
        this.serverCanceled = true;
        this.realCause = iOException;
    }

    public void setUnknownError(java.io.IOException iOException) {
        this.unknownError = true;
        this.realCause = iOException;
    }

    public void setPreAllocateFailed(java.io.IOException iOException) {
        this.preAllocateFailed = true;
        this.realCause = iOException;
    }

    public void catchException(java.io.IOException iOException) {
        if (isUserCanceled()) {
            return;
        }
        if (iOException instanceof com.liulishuo.okdownload.core.exception.ResumeFailedException) {
            setPreconditionFailed(iOException);
            return;
        }
        if (iOException instanceof com.liulishuo.okdownload.core.exception.ServerCanceledException) {
            setServerCanceled(iOException);
            return;
        }
        if (iOException == com.liulishuo.okdownload.core.exception.FileBusyAfterRunException.SIGNAL) {
            setFileBusyAfterRun();
            return;
        }
        if (iOException instanceof com.liulishuo.okdownload.core.exception.PreAllocateException) {
            setPreAllocateFailed(iOException);
            return;
        }
        if (iOException != com.liulishuo.okdownload.core.exception.InterruptException.SIGNAL) {
            setUnknownError(iOException);
            if (iOException instanceof java.net.SocketException) {
                return;
            }
            com.liulishuo.okdownload.core.Util.d("DownloadCache", "catch unknown error " + iOException);
        }
    }

    static class PreError extends com.liulishuo.okdownload.core.download.DownloadCache {
        PreError(java.io.IOException iOException) {
            super(null);
            setUnknownError(iOException);
        }
    }
}
