package com.oudmon.ble.base.scan;

/* loaded from: /tmp/dex/classes2.dex */
class BluetoothScannerImplLollipop extends com.oudmon.ble.base.scan.BleScannerCompat {
    private static final java.lang.String TAG = "BluetoothScannerImplLol";
    private android.content.Context context;
    private android.bluetooth.le.ScanSettings scanSettings;
    private android.bluetooth.le.BluetoothLeScanner scanner;
    private java.util.List<android.bluetooth.le.ScanFilter> filters = new java.util.ArrayList();
    private android.bluetooth.le.ScanCallback scannerCallback = new android.bluetooth.le.ScanCallback() { // from class: com.oudmon.ble.base.scan.BluetoothScannerImplLollipop.1
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, android.bluetooth.le.ScanResult scanResult) {
            android.bluetooth.BluetoothDevice device = scanResult.getDevice();
            byte[] bytes = scanResult.getScanRecord().getBytes();
            if (com.oudmon.ble.base.scan.BluetoothScannerImplLollipop.this.scanWrapperCallback != null) {
                com.oudmon.ble.base.scan.BluetoothScannerImplLollipop.this.scanWrapperCallback.onLeScan(device, scanResult.getRssi(), bytes);
            }
            com.oudmon.ble.base.scan.ScanRecord parseFromBytes = com.oudmon.ble.base.scan.ScanRecord.parseFromBytes(bytes);
            if (parseFromBytes == null || com.oudmon.ble.base.scan.BluetoothScannerImplLollipop.this.scanWrapperCallback == null) {
                return;
            }
            com.oudmon.ble.base.scan.BluetoothScannerImplLollipop.this.scanWrapperCallback.onParsedData(device, parseFromBytes);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> list) {
            if (list == null || list.size() <= 0 || com.oudmon.ble.base.scan.BluetoothScannerImplLollipop.this.scanWrapperCallback == null) {
                return;
            }
            com.oudmon.ble.base.scan.BluetoothScannerImplLollipop.this.scanWrapperCallback.onBatchScanResults(list);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "Scan Failed Error Code: " + i);
            if (com.oudmon.ble.base.scan.BluetoothScannerImplLollipop.this.scanWrapperCallback != null) {
                com.oudmon.ble.base.scan.BluetoothScannerImplLollipop.this.scanWrapperCallback.onScanFailed(i);
            }
        }
    };

    public BluetoothScannerImplLollipop(android.content.Context context) {
        this.context = context;
    }

    @Override // com.oudmon.ble.base.scan.BleScannerCompat
    public void startScan(com.oudmon.ble.base.scan.ScanWrapperCallback scanWrapperCallback) {
        super.startScan(scanWrapperCallback);
        this.scanning = true;
        if (this.scanner == null) {
            this.scanner = this.bluetoothAdapter.getBluetoothLeScanner();
        }
        if (com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(this.context)) {
            setScanSettings();
            if (this.scanner != null) {
                if (android.os.Build.VERSION.SDK_INT < 31 || androidx.core.app.ActivityCompat.checkSelfPermission(this.context, com.hjq.permissions.Permission.BLUETOOTH_SCAN) == 0) {
                    this.scanner.startScan(this.filters, this.scanSettings, this.scannerCallback);
                }
            }
        }
    }

    @Override // com.oudmon.ble.base.scan.BleScannerCompat
    public void stopScan() {
        super.stopScan();
        this.scanning = false;
        if (com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(this.context)) {
            if (this.scanner == null) {
                this.scanner = this.bluetoothAdapter.getBluetoothLeScanner();
            }
            if (android.os.Build.VERSION.SDK_INT < 31 || androidx.core.app.ActivityCompat.checkSelfPermission(this.context, com.hjq.permissions.Permission.BLUETOOTH_SCAN) == 0) {
                this.scanner.stopScan(this.scannerCallback);
            }
        }
    }

    private void setScanSettings() {
        boolean isBackground = com.oudmon.ble.base.util.AppUtil.isBackground(this.context);
        boolean isApplicationBroughtToBackground = com.oudmon.ble.base.util.AppUtil.isApplicationBroughtToBackground(this.context);
        if (isBackground || isApplicationBroughtToBackground) {
            this.filters.add(new android.bluetooth.le.ScanFilter.Builder().setServiceUuid(android.os.ParcelUuid.fromString("0000fee7-0000-1000-8000-00805f9b34fb")).build());
            android.bluetooth.le.ScanSettings.Builder builder = new android.bluetooth.le.ScanSettings.Builder();
            builder.setScanMode(0);
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                builder.setMatchMode(1);
                builder.setCallbackType(1);
            }
            this.scanSettings = builder.build();
            return;
        }
        this.filters.clear();
        this.scanSettings = new android.bluetooth.le.ScanSettings.Builder().setScanMode(2).build();
    }
}
