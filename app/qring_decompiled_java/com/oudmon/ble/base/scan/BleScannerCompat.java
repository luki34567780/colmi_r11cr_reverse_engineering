package com.oudmon.ble.base.scan;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class BleScannerCompat {
    private static com.oudmon.ble.base.scan.BleScannerCompat mInstance;
    android.bluetooth.BluetoothAdapter bluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    com.oudmon.ble.base.scan.ScanWrapperCallback scanWrapperCallback;
    public boolean scanning;

    public static com.oudmon.ble.base.scan.BleScannerCompat getScanner(android.content.Context context) {
        com.oudmon.ble.base.scan.BleScannerCompat bleScannerCompat = mInstance;
        if (bleScannerCompat != null) {
            return bleScannerCompat;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            com.oudmon.ble.base.scan.BluetoothScannerImplLollipop bluetoothScannerImplLollipop = new com.oudmon.ble.base.scan.BluetoothScannerImplLollipop(context);
            mInstance = bluetoothScannerImplLollipop;
            return bluetoothScannerImplLollipop;
        }
        com.oudmon.ble.base.scan.BluetoothScannerImplJB bluetoothScannerImplJB = new com.oudmon.ble.base.scan.BluetoothScannerImplJB();
        mInstance = bluetoothScannerImplJB;
        return bluetoothScannerImplJB;
    }

    public void startScan(com.oudmon.ble.base.scan.ScanWrapperCallback scanWrapperCallback) {
        this.scanning = true;
        this.scanWrapperCallback = scanWrapperCallback;
        scanWrapperCallback.onStart();
    }

    public void stopScan() {
        this.scanning = false;
        com.oudmon.ble.base.scan.ScanWrapperCallback scanWrapperCallback = this.scanWrapperCallback;
        if (scanWrapperCallback != null) {
            scanWrapperCallback.onStop();
        }
    }

    public boolean isScanning() {
        return this.scanning;
    }
}
