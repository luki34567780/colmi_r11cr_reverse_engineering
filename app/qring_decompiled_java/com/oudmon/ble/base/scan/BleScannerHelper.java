package com.oudmon.ble.base.scan;

/* loaded from: /tmp/dex/classes2.dex */
public class BleScannerHelper {
    private static final java.lang.String HANDLER_TOKEN = "stop_token";
    private static final java.lang.String TAG = "BleScannerHelper";
    private static com.oudmon.ble.base.scan.BleScannerHelper bleScannerHelper;
    public static final java.lang.String[] sFILTER_PREFIX = {"T80", "T90", "T91", "T93", "T95", "TW68", "S9", "C60", "C66", "C67", "C68", "C80", "C86", "C88", "C96", "wxb_w4"};
    private android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
    private int timeOut = 12000;
    private java.util.List<java.lang.String> filters = new java.util.ArrayList();

    private BleScannerHelper() {
    }

    public static com.oudmon.ble.base.scan.BleScannerHelper getInstance() {
        if (bleScannerHelper == null) {
            synchronized (com.oudmon.ble.base.scan.BleScannerHelper.class) {
                if (bleScannerHelper == null) {
                    bleScannerHelper = new com.oudmon.ble.base.scan.BleScannerHelper();
                }
            }
        }
        return bleScannerHelper;
    }

    public void reSetCallback() {
        bleScannerHelper = null;
    }

    public void setScanFilter(java.util.List<java.lang.String> list) {
        this.filters = list;
    }

    public void scanDevice(final android.content.Context context, java.util.UUID uuid, final com.oudmon.ble.base.scan.ScanWrapperCallback scanWrapperCallback) {
        this.handler.removeCallbacksAndMessages(HANDLER_TOKEN);
        if (!com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(context)) {
            com.oudmon.ble.base.scan.BleScannerCompat.getScanner(context).scanning = false;
            return;
        }
        if (com.oudmon.ble.base.scan.BleScannerCompat.getScanner(context).isScanning()) {
            stopScan(context);
        }
        androidx.core.os.HandlerCompat.postDelayed(this.handler, new java.lang.Runnable() { // from class: com.oudmon.ble.base.scan.BleScannerHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com.oudmon.ble.base.scan.BleScannerHelper.this.stopScan(context);
                com.oudmon.ble.base.scan.ScanWrapperCallback scanWrapperCallback2 = scanWrapperCallback;
                if (scanWrapperCallback2 != null) {
                    scanWrapperCallback2.onScanFailed(0);
                }
            }
        }, HANDLER_TOKEN, 12000L);
        com.oudmon.ble.base.scan.BleScannerCompat.getScanner(context).startScan(scanWrapperCallback);
    }

    public void stopScan(android.content.Context context) {
        this.handler.removeCallbacksAndMessages(HANDLER_TOKEN);
        if (!com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(context)) {
            com.oudmon.ble.base.scan.BleScannerCompat.getScanner(context).scanning = false;
        } else {
            com.oudmon.ble.base.scan.BleScannerCompat.getScanner(context).stopScan();
        }
    }

    public boolean scanTheDevice(final android.content.Context context, final java.lang.String str, final com.oudmon.ble.base.scan.OnTheScanResult onTheScanResult) {
        this.handler.removeCallbacksAndMessages(HANDLER_TOKEN);
        if (!com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(context)) {
            return false;
        }
        androidx.core.os.HandlerCompat.postDelayed(this.handler, new java.lang.Runnable() { // from class: com.oudmon.ble.base.scan.BleScannerHelper.2
            @Override // java.lang.Runnable
            public void run() {
                com.oudmon.ble.base.scan.BleScannerHelper.this.stopScan(context);
                com.oudmon.ble.base.scan.OnTheScanResult onTheScanResult2 = onTheScanResult;
                if (onTheScanResult2 != null) {
                    onTheScanResult2.onScanFailed(0);
                }
            }
        }, HANDLER_TOKEN, this.timeOut);
        com.oudmon.ble.base.scan.BleScannerCompat.getScanner(context).startScan(new com.oudmon.ble.base.scan.ScanWrapperCallback() { // from class: com.oudmon.ble.base.scan.BleScannerHelper.3
            @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
            public void onParsedData(android.bluetooth.BluetoothDevice bluetoothDevice, com.oudmon.ble.base.scan.ScanRecord scanRecord) {
            }

            @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
            public void onStart() {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "start");
            }

            @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
            public void onStop() {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "stop");
                try {
                    java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = android.bluetooth.BluetoothAdapter.getDefaultAdapter().getBondedDevices();
                    if (bondedDevices.size() > 0) {
                        for (android.bluetooth.BluetoothDevice bluetoothDevice : bondedDevices) {
                            if (bluetoothDevice != null && bluetoothDevice.getName() != null && bluetoothDevice.getAddress() != null && bluetoothDevice.getAddress().equalsIgnoreCase(str)) {
                                onTheScanResult.onResult(bluetoothDevice);
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "系统绑定了手环");
                            }
                        }
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
            public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                if (bluetoothDevice.getAddress().equalsIgnoreCase(str)) {
                    onTheScanResult.onResult(bluetoothDevice);
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, bluetoothDevice.getAddress());
                }
            }

            @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
            public void onScanFailed(int i) {
                onTheScanResult.onScanFailed(i);
                com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "------------" + i);
            }

            @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
            public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> list) {
                java.util.Iterator<android.bluetooth.le.ScanResult> it = list.iterator();
                while (it.hasNext()) {
                    android.bluetooth.BluetoothDevice device = it.next().getDevice();
                    if (device.getAddress().equalsIgnoreCase(str)) {
                        onTheScanResult.onResult(device);
                    }
                }
            }
        });
        return true;
    }

    public void removeSystemBle() {
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
        if (bondedDevices.size() > 0) {
            for (android.bluetooth.BluetoothDevice bluetoothDevice : bondedDevices) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, bluetoothDevice.getName());
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, bluetoothDevice.getAddress());
                if (bluetoothDevice != null && bluetoothDevice.getName() != null && bluetoothDevice.getAddress() != null) {
                    java.lang.String deviceAddress = com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().getDeviceAddress();
                    if (!android.text.TextUtils.isEmpty(deviceAddress) && deviceAddress.equalsIgnoreCase(bluetoothDevice.getAddress())) {
                        removeBondDevice(defaultAdapter, bluetoothDevice.getAddress());
                    }
                    if (filterResult(bluetoothDevice.getName()) > 0) {
                        removeBondDevice(defaultAdapter, bluetoothDevice.getAddress());
                    }
                }
            }
        }
    }

    public void removeMacSystemBond(java.lang.String str) {
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
        if (bondedDevices.size() > 0) {
            for (android.bluetooth.BluetoothDevice bluetoothDevice : bondedDevices) {
                if (bluetoothDevice != null && bluetoothDevice.getName() != null && bluetoothDevice.getAddress() != null && !android.text.TextUtils.isEmpty(str) && str.equalsIgnoreCase(bluetoothDevice.getAddress())) {
                    removeBondDevice(defaultAdapter, bluetoothDevice.getAddress());
                }
            }
        }
    }

    private int filterResult(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith("O_") || str.startsWith("o_")) {
            return 2;
        }
        java.util.Iterator<java.lang.String> it = this.filters.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return 2;
            }
        }
        if (str.startsWith("Q_") || str.startsWith("q_") || str.startsWith("R3L") || str.startsWith("QC") || str.startsWith("qc") || str.startsWith("Wa")) {
            return 3;
        }
        for (java.lang.String str2 : sFILTER_PREFIX) {
            if (str.startsWith(str2)) {
                return 1;
            }
        }
        return -1;
    }

    private void removeBondDevice(android.bluetooth.BluetoothAdapter bluetoothAdapter, java.lang.String str) {
        android.bluetooth.BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
        try {
            java.lang.reflect.Method method = android.bluetooth.BluetoothDevice.class.getMethod("removeBond", new java.lang.Class[0]);
            method.setAccessible(true);
            method.invoke(remoteDevice, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            e.printStackTrace();
        } catch (java.lang.NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public int getTimeOut() {
        return this.timeOut;
    }

    public void setTimeOut(int i) {
        this.timeOut = i;
    }
}
