package com.qcwireless.qcwatch.ui.device.connect;

/* compiled from: DeviceBindViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0002R\u0015\u0010\u0005\u001a\u00060\u0006R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindViewModel;", "Landroidx/lifecycle/ViewModel;", "deviceBindRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceBindRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceBindRepository;)V", "bleScanCallback", "Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindViewModel$BleCallback;", "getBleScanCallback", "()Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindViewModel$BleCallback;", "deviceList", "", "Lcom/qcwireless/qcwatch/ui/device/connect/bean/SmartWatch;", "getDeviceList", "()Ljava/util/List;", "deviceLiveData", "Landroidx/lifecycle/MutableLiveData;", "getDeviceLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setDeviceLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "sFILTER_PREFIX", "", "", "getSFILTER_PREFIX", "()[Ljava/lang/String;", "[Ljava/lang/String;", "addSystemBondedDevice", "filterResult", "", "name", "BleCallback", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceBindViewModel extends androidx.lifecycle.ViewModel {
    private final com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel.BleCallback bleScanCallback;
    private final java.util.List<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch> deviceList;
    private androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch> deviceLiveData;
    private final java.lang.String[] sFILTER_PREFIX;

    public DeviceBindViewModel(com.qcwireless.qcwatch.ui.base.repository.device.DeviceBindRepository deviceBindRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindRepository, "deviceBindRepository");
        this.deviceList = new java.util.ArrayList();
        this.bleScanCallback = new com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel.BleCallback();
        this.deviceLiveData = new androidx.lifecycle.MutableLiveData<>();
        this.sFILTER_PREFIX = new java.lang.String[]{"T80", "T90", "T91", "T93", "T95", "TW68", "S9", "C60", "C66", "C67", "C68", "C80", "C86", "C88", "C96", "wxb_w4"};
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch> getDeviceList() {
        return this.deviceList;
    }

    public final com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel.BleCallback getBleScanCallback() {
        return this.bleScanCallback;
    }

    public final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch> getDeviceLiveData() {
        return this.deviceLiveData;
    }

    public final void setDeviceLiveData(androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch> mutableLiveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.deviceLiveData = mutableLiveData;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch> addSystemBondedDevice() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = android.bluetooth.BluetoothAdapter.getDefaultAdapter().getBondedDevices();
        if (bondedDevices.size() > 0) {
            for (android.bluetooth.BluetoothDevice bluetoothDevice : bondedDevices) {
                if (bluetoothDevice.getName() != null && bluetoothDevice.getAddress() != null) {
                    java.lang.String name = bluetoothDevice.getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "bluetoothDevice.name");
                    if (filterResult(name) > 0) {
                        java.lang.String name2 = bluetoothDevice.getName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "bluetoothDevice.name");
                        arrayList.add(new com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch(name2, bluetoothDevice.getAddress(), 90));
                    }
                }
            }
        }
        return arrayList;
    }

    private final int filterResult(java.lang.String name) {
        if (android.text.TextUtils.isEmpty(name)) {
            return -1;
        }
        if (kotlin.text.StringsKt.startsWith$default(name, "O_", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(name, "o_", false, 2, (java.lang.Object) null)) {
            return 2;
        }
        for (java.lang.String str : com.qcwireless.qcwatch.QJavaApplication.getInstance().getKeys()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "pre");
            if (kotlin.text.StringsKt.startsWith$default(name, str, false, 2, (java.lang.Object) null)) {
                return 2;
            }
        }
        if (kotlin.text.StringsKt.startsWith$default(name, "Q_", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(name, "q_", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(name, "R3L", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(name, "QC", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(name, "qc", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(name, "Wa", false, 2, (java.lang.Object) null)) {
            return 3;
        }
        for (java.lang.String str2 : this.sFILTER_PREFIX) {
            if (kotlin.text.StringsKt.startsWith$default(name, str2, false, 2, (java.lang.Object) null)) {
                return 1;
            }
        }
        return -1;
    }

    public final java.lang.String[] getSFILTER_PREFIX() {
        return this.sFILTER_PREFIX;
    }

    /* compiled from: DeviceBindViewModel.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J$\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindViewModel$BleCallback;", "Lcom/oudmon/ble/base/scan/ScanWrapperCallback;", "(Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindViewModel;)V", "onBatchScanResults", "", "results", "", "Landroid/bluetooth/le/ScanResult;", "onLeScan", "device", "Landroid/bluetooth/BluetoothDevice;", "rssi", "", "scanRecord", "", "onParsedData", "Lcom/oudmon/ble/base/scan/ScanRecord;", "onScanFailed", "errorCode", "onStart", "onStop", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class BleCallback implements com.oudmon.ble.base.scan.ScanWrapperCallback {
        @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
        public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> results) {
        }

        @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
        public void onParsedData(android.bluetooth.BluetoothDevice device, com.oudmon.ble.base.scan.ScanRecord scanRecord) {
        }

        @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
        public void onScanFailed(int errorCode) {
        }

        @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
        public void onStart() {
        }

        @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
        public void onStop() {
        }

        public BleCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[Catch: Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:4:0x0004, B:6:0x000d, B:11:0x0019, B:12:0x0025, B:14:0x002b, B:17:0x0045), top: B:3:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        @Override // com.oudmon.ble.base.scan.ScanWrapperCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onLeScan(android.bluetooth.BluetoothDevice r7, int r8, byte[] r9) {
            /*
                r6 = this;
                java.lang.String r9 = "device.name"
                if (r7 == 0) goto L7f
                java.lang.String r0 = r7.getName()     // Catch: java.lang.Exception -> L7f
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Exception -> L7f
                r1 = 0
                if (r0 == 0) goto L16
                int r0 = r0.length()     // Catch: java.lang.Exception -> L7f
                if (r0 != 0) goto L14
                goto L16
            L14:
                r0 = 0
                goto L17
            L16:
                r0 = 1
            L17:
                if (r0 != 0) goto L7f
                com.qcwireless.qcwatch.QJavaApplication r0 = com.qcwireless.qcwatch.QJavaApplication.getInstance()     // Catch: java.lang.Exception -> L7f
                java.util.List r0 = r0.getKeys()     // Catch: java.lang.Exception -> L7f
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L7f
            L25:
                boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L7f
                if (r2 == 0) goto L7f
                java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L7f
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L7f
                java.lang.String r3 = r7.getName()     // Catch: java.lang.Exception -> L7f
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r9)     // Catch: java.lang.Exception -> L7f
                java.lang.String r4 = "pre"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch: java.lang.Exception -> L7f
                r4 = 2
                r5 = 0
                boolean r2 = kotlin.text.StringsKt.startsWith$default(r3, r2, r1, r4, r5)     // Catch: java.lang.Exception -> L7f
                if (r2 == 0) goto L25
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel r0 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel.this     // Catch: java.lang.Exception -> L7f
                androidx.lifecycle.MutableLiveData r0 = r0.getDeviceLiveData()     // Catch: java.lang.Exception -> L7f
                com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch r1 = new com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch     // Catch: java.lang.Exception -> L7f
                java.lang.String r2 = r7.getName()     // Catch: java.lang.Exception -> L7f
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)     // Catch: java.lang.Exception -> L7f
                java.lang.String r9 = r7.getAddress()     // Catch: java.lang.Exception -> L7f
                r1.<init>(r2, r9, r8)     // Catch: java.lang.Exception -> L7f
                r0.setValue(r1)     // Catch: java.lang.Exception -> L7f
                java.lang.String r8 = "HeZhiYuan"
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
                r9.<init>()     // Catch: java.lang.Exception -> L7f
                java.lang.String r0 = r7.getName()     // Catch: java.lang.Exception -> L7f
                r9.append(r0)     // Catch: java.lang.Exception -> L7f
                java.lang.String r0 = "---"
                r9.append(r0)     // Catch: java.lang.Exception -> L7f
                java.lang.String r7 = r7.getAddress()     // Catch: java.lang.Exception -> L7f
                r9.append(r7)     // Catch: java.lang.Exception -> L7f
                java.lang.String r7 = r9.toString()     // Catch: java.lang.Exception -> L7f
                com.iwown.awlog.AwLog.i(r8, r7)     // Catch: java.lang.Exception -> L7f
            L7f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel.BleCallback.onLeScan(android.bluetooth.BluetoothDevice, int, byte[]):void");
        }
    }
}
