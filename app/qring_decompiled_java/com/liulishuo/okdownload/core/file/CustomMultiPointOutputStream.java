package com.liulishuo.okdownload.core.file;

/* loaded from: /tmp/dex/classes2.dex */
public class CustomMultiPointOutputStream extends com.liulishuo.okdownload.core.file.MultiPointOutputStream {
    private static final java.lang.String TAG = "CustomMultiPointOutputStream";
    private final com.liulishuo.okdownload.DownloadTask task;

    CustomMultiPointOutputStream(final com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info, com.liulishuo.okdownload.core.breakpoint.DownloadStore store, java.lang.Runnable syncRunnable) {
        super(task, info, store, syncRunnable);
        this.task = task;
    }

    public CustomMultiPointOutputStream(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info, com.liulishuo.okdownload.core.breakpoint.DownloadStore store) {
        this(task, info, store, null);
    }

    @Override // com.liulishuo.okdownload.core.file.MultiPointOutputStream
    synchronized void close(int blockIndex) throws java.io.IOException {
        com.liulishuo.okdownload.core.file.DownloadOutputStream downloadOutputStream = this.outputStreamMap.get(blockIndex);
        if (downloadOutputStream != null) {
            downloadOutputStream.close();
            synchronized (this.noSyncLengthMap) {
                this.outputStreamMap.remove(blockIndex);
                this.noSyncLengthMap.remove(blockIndex);
            }
            com.liulishuo.okdownload.core.Util.d(TAG, "OutputStream close task[" + this.task.getId() + "] block[" + blockIndex + "]");
        }
    }
}
