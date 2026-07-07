package com.androidnetworking.internal;

/* loaded from: classes.dex */
public class UploadProgressHandler extends android.os.Handler {
    private final com.androidnetworking.interfaces.UploadProgressListener mUploadProgressListener;

    public UploadProgressHandler(com.androidnetworking.interfaces.UploadProgressListener uploadProgressListener) {
        super(android.os.Looper.getMainLooper());
        this.mUploadProgressListener = uploadProgressListener;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            if (this.mUploadProgressListener != null) {
                com.androidnetworking.model.Progress progress = (com.androidnetworking.model.Progress) message.obj;
                this.mUploadProgressListener.onProgress(progress.currentBytes, progress.totalBytes);
                return;
            }
            return;
        }
        super.handleMessage(message);
    }
}
