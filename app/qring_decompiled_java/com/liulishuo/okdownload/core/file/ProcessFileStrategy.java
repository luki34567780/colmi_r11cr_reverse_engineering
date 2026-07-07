package com.liulishuo.okdownload.core.file;

/* loaded from: /tmp/dex/classes2.dex */
public class ProcessFileStrategy {
    private final com.liulishuo.okdownload.core.file.FileLock fileLock = new com.liulishuo.okdownload.core.file.FileLock();

    public void completeProcessStream(com.liulishuo.okdownload.core.file.MultiPointOutputStream multiPointOutputStream, com.liulishuo.okdownload.DownloadTask downloadTask) {
    }

    public com.liulishuo.okdownload.core.file.MultiPointOutputStream createProcessStream(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
        return new com.liulishuo.okdownload.core.file.MultiPointOutputStream(downloadTask, breakpointInfo, downloadStore);
    }

    public void discardProcess(com.liulishuo.okdownload.DownloadTask downloadTask) throws java.io.IOException {
        java.io.File file = downloadTask.getFile();
        if (file != null && file.exists() && !file.delete()) {
            throw new java.io.IOException("Delete file failed!");
        }
    }

    public com.liulishuo.okdownload.core.file.FileLock getFileLock() {
        return this.fileLock;
    }

    public boolean isPreAllocateLength(com.liulishuo.okdownload.DownloadTask downloadTask) {
        if (!com.liulishuo.okdownload.OkDownload.with().outputStreamFactory().supportSeek()) {
            return false;
        }
        if (downloadTask.getSetPreAllocateLength() != null) {
            return downloadTask.getSetPreAllocateLength().booleanValue();
        }
        return true;
    }
}
