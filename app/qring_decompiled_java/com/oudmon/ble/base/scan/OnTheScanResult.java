package com.oudmon.ble.base.scan;

/* loaded from: /tmp/dex/classes2.dex */
public interface OnTheScanResult {
    void onResult(android.bluetooth.BluetoothDevice bluetoothDevice);

    void onScanFailed(int i);
}
