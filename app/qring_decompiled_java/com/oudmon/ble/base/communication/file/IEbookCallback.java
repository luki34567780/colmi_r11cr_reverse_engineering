package com.oudmon.ble.base.communication.file;

/* loaded from: /tmp/dex/classes2.dex */
public interface IEbookCallback {
    public static final java.lang.String TAG = "IEbookCallback";

    void onActionResult(int i);

    void onComplete();

    void onDeleteSuccess(int i);

    void onFileNames(java.util.ArrayList<java.lang.String> arrayList);

    void onProgress(float f);
}
