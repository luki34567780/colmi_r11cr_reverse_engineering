package com.androidnetworking.internal;

/* loaded from: classes.dex */
public class DownloadProgressHandler extends android.os.Handler {
    private final com.androidnetworking.interfaces.DownloadProgressListener mDownloadProgressListener;

    public DownloadProgressHandler(com.androidnetworking.interfaces.DownloadProgressListener downloadProgressListener) {
        super(android.os.Looper.getMainLooper());
        this.mDownloadProgressListener = downloadProgressListener;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            if (this.mDownloadProgressListener != null) {
                com.androidnetworking.model.Progress progress = (com.androidnetworking.model.Progress) message.obj;
                this.mDownloadProgressListener.onProgress(progress.currentBytes, progress.totalBytes);
                return;
            }
            return;
        }
        super.handleMessage(message);
    }
}
