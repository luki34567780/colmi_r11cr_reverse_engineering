package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureMediaScannerConnection implements android.media.MediaScannerConnection.MediaScannerConnectionClient {
    private com.luck.picture.lib.basic.PictureMediaScannerConnection.ScanListener mListener;
    private final android.media.MediaScannerConnection mMs;
    private final java.lang.String mPath;

    public interface ScanListener {
        void onScanFinish();
    }

    public PictureMediaScannerConnection(android.content.Context context, java.lang.String str, com.luck.picture.lib.basic.PictureMediaScannerConnection.ScanListener scanListener) {
        this.mListener = scanListener;
        this.mPath = str;
        android.media.MediaScannerConnection mediaScannerConnection = new android.media.MediaScannerConnection(context.getApplicationContext(), this);
        this.mMs = mediaScannerConnection;
        mediaScannerConnection.connect();
    }

    public PictureMediaScannerConnection(android.content.Context context, java.lang.String str) {
        this.mPath = str;
        android.media.MediaScannerConnection mediaScannerConnection = new android.media.MediaScannerConnection(context.getApplicationContext(), this);
        this.mMs = mediaScannerConnection;
        mediaScannerConnection.connect();
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public void onMediaScannerConnected() {
        if (android.text.TextUtils.isEmpty(this.mPath)) {
            return;
        }
        this.mMs.scanFile(this.mPath, null);
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public void onScanCompleted(java.lang.String str, android.net.Uri uri) {
        this.mMs.disconnect();
        com.luck.picture.lib.basic.PictureMediaScannerConnection.ScanListener scanListener = this.mListener;
        if (scanListener != null) {
            scanListener.onScanFinish();
        }
    }
}
