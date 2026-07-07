package com.oudmon.ble.base.scan;

/* loaded from: /tmp/dex/classes2.dex */
class BluetoothScannerImplJB extends com.oudmon.ble.base.scan.BleScannerCompat {
    private android.bluetooth.BluetoothAdapter.LeScanCallback leScanCallback = new android.bluetooth.BluetoothAdapter.LeScanCallback() { // from class: com.oudmon.ble.base.scan.BluetoothScannerImplJB.1
        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            com.oudmon.ble.base.scan.BluetoothScannerImplJB.this.scanWrapperCallback.onLeScan(bluetoothDevice, i, bArr);
        }
    };

    BluetoothScannerImplJB() {
    }

    @Override // com.oudmon.ble.base.scan.BleScannerCompat
    public void startScan(com.oudmon.ble.base.scan.ScanWrapperCallback scanWrapperCallback) {
        super.startScan(scanWrapperCallback);
        this.scanning = true;
        this.bluetoothAdapter.startLeScan(this.leScanCallback);
    }

    @Override // com.oudmon.ble.base.scan.BleScannerCompat
    public void stopScan() {
        super.stopScan();
        this.scanning = false;
        this.bluetoothAdapter.stopLeScan(this.leScanCallback);
    }
}
