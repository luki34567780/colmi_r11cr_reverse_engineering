package com.oudmon.ble.base.communication.file;

/* loaded from: /tmp/dex/classes2.dex */
public interface IRecordCallback {
    public static final java.lang.String TAG = "RecordEntity";

    void onActionResult(int i);

    void onComplete();

    void onFileNames(java.util.ArrayList<com.oudmon.ble.base.communication.entity.RecordEntity> arrayList);

    void onProgress(float f);

    void onReceiver(byte[] bArr);
}
