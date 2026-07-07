package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public abstract class BleScanCallback {
    public abstract void onDeviceFound(com.google.android.gms.fitness.data.BleDevice bleDevice);

    public abstract void onScanStopped();
}
