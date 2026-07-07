package com.liulishuo.okdownload.core.download;

/* loaded from: /tmp/dex/classes2.dex */
public class BreakpointRemoteCheck {
    private boolean acceptRange;
    com.liulishuo.okdownload.core.cause.ResumeFailedCause failedCause;
    private final com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info;
    private long instanceLength;
    private boolean resumable;
    private final com.liulishuo.okdownload.DownloadTask task;

    boolean isTrialSpecialPass(int i, long j, boolean z) {
        return i == 416 && j >= 0 && z;
    }

    public BreakpointRemoteCheck(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        this.task = downloadTask;
        this.info = breakpointInfo;
    }

    public java.lang.String toString() {
        return "acceptRange[" + this.acceptRange + "] resumable[" + this.resumable + "] failedCause[" + this.failedCause + "] instanceLength[" + this.instanceLength + "] " + super.toString();
    }

    public com.liulishuo.okdownload.core.cause.ResumeFailedCause getCause() {
        return this.failedCause;
    }

    public com.liulishuo.okdownload.core.cause.ResumeFailedCause getCauseOrThrow() {
        com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause = this.failedCause;
        if (resumeFailedCause != null) {
            return resumeFailedCause;
        }
        throw new java.lang.IllegalStateException("No cause find with resumable: " + this.resumable);
    }

    public boolean isResumable() {
        return this.resumable;
    }

    public boolean isAcceptRange() {
        return this.acceptRange;
    }

    public long getInstanceLength() {
        return this.instanceLength;
    }

    public void check() throws java.io.IOException {
        com.liulishuo.okdownload.core.download.DownloadStrategy downloadStrategy = com.liulishuo.okdownload.OkDownload.with().downloadStrategy();
        com.liulishuo.okdownload.core.download.ConnectTrial createConnectTrial = createConnectTrial();
        createConnectTrial.executeTrial();
        boolean isAcceptRange = createConnectTrial.isAcceptRange();
        boolean isChunked = createConnectTrial.isChunked();
        long instanceLength = createConnectTrial.getInstanceLength();
        java.lang.String responseEtag = createConnectTrial.getResponseEtag();
        java.lang.String responseFilename = createConnectTrial.getResponseFilename();
        int responseCode = createConnectTrial.getResponseCode();
        downloadStrategy.validFilenameFromResponse(responseFilename, this.task, this.info);
        this.info.setChunked(isChunked);
        this.info.setEtag(responseEtag);
        if (com.liulishuo.okdownload.OkDownload.with().downloadDispatcher().isFileConflictAfterRun(this.task)) {
            throw com.liulishuo.okdownload.core.exception.FileBusyAfterRunException.SIGNAL;
        }
        com.liulishuo.okdownload.core.cause.ResumeFailedCause preconditionFailedCause = downloadStrategy.getPreconditionFailedCause(responseCode, this.info.getTotalOffset() != 0, this.info, responseEtag);
        boolean z = preconditionFailedCause == null;
        this.resumable = z;
        this.failedCause = preconditionFailedCause;
        this.instanceLength = instanceLength;
        this.acceptRange = isAcceptRange;
        if (isTrialSpecialPass(responseCode, instanceLength, z)) {
            return;
        }
        if (downloadStrategy.isServerCanceled(responseCode, this.info.getTotalOffset() != 0)) {
            throw new com.liulishuo.okdownload.core.exception.ServerCanceledException(responseCode, this.info.getTotalOffset());
        }
    }

    com.liulishuo.okdownload.core.download.ConnectTrial createConnectTrial() {
        return new com.liulishuo.okdownload.core.download.ConnectTrial(this.task, this.info);
    }
}
