package com.liulishuo.okdownload.core.download;

/* loaded from: /tmp/dex/classes2.dex */
public class BreakpointLocalCheck {
    private boolean dirty;
    boolean fileExist;
    private final com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info;
    boolean infoRight;
    boolean outputStreamSupport;
    private final long responseInstanceLength;
    private final com.liulishuo.okdownload.DownloadTask task;

    public BreakpointLocalCheck(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, long j) {
        this.task = downloadTask;
        this.info = breakpointInfo;
        this.responseInstanceLength = j;
    }

    public boolean isDirty() {
        return this.dirty;
    }

    public com.liulishuo.okdownload.core.cause.ResumeFailedCause getCauseOrThrow() {
        if (!this.infoRight) {
            return com.liulishuo.okdownload.core.cause.ResumeFailedCause.INFO_DIRTY;
        }
        if (!this.fileExist) {
            return com.liulishuo.okdownload.core.cause.ResumeFailedCause.FILE_NOT_EXIST;
        }
        if (!this.outputStreamSupport) {
            return com.liulishuo.okdownload.core.cause.ResumeFailedCause.OUTPUT_STREAM_NOT_SUPPORT;
        }
        throw new java.lang.IllegalStateException("No cause find with dirty: " + this.dirty);
    }

    public boolean isInfoRightToResume() {
        int blockCount = this.info.getBlockCount();
        if (blockCount <= 0 || this.info.isChunked() || this.info.getFile() == null) {
            return false;
        }
        if (!this.info.getFile().equals(this.task.getFile()) || this.info.getFile().length() > this.info.getTotalLength()) {
            return false;
        }
        if (this.responseInstanceLength > 0 && this.info.getTotalLength() != this.responseInstanceLength) {
            return false;
        }
        for (int i = 0; i < blockCount; i++) {
            if (this.info.getBlock(i).getContentLength() <= 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isOutputStreamSupportResume() {
        if (com.liulishuo.okdownload.OkDownload.with().outputStreamFactory().supportSeek()) {
            return true;
        }
        return this.info.getBlockCount() == 1 && !com.liulishuo.okdownload.OkDownload.with().processFileStrategy().isPreAllocateLength(this.task);
    }

    public boolean isFileExistToResume() {
        android.net.Uri uri = this.task.getUri();
        if (com.liulishuo.okdownload.core.Util.isUriContentScheme(uri)) {
            return com.liulishuo.okdownload.core.Util.getSizeFromContentUri(uri) > 0;
        }
        java.io.File file = this.task.getFile();
        return file != null && file.exists();
    }

    public void check() {
        this.fileExist = isFileExistToResume();
        this.infoRight = isInfoRightToResume();
        boolean isOutputStreamSupportResume = isOutputStreamSupportResume();
        this.outputStreamSupport = isOutputStreamSupportResume;
        this.dirty = (this.infoRight && this.fileExist && isOutputStreamSupportResume) ? false : true;
    }

    public java.lang.String toString() {
        return "fileExist[" + this.fileExist + "] infoRight[" + this.infoRight + "] outputStreamSupport[" + this.outputStreamSupport + "] " + super.toString();
    }
}
