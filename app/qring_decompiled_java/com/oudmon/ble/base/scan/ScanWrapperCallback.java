package com.oudmon.ble.base.scan;

/* loaded from: /tmp/dex/classes2.dex */
public interface ScanWrapperCallback {
    void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> list);

    void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i, byte[] bArr);

    void onParsedData(android.bluetooth.BluetoothDevice bluetoothDevice, com.oudmon.ble.base.scan.ScanRecord scanRecord);

    void onScanFailed(int i);

    void onStart();

    void onStop();
}
