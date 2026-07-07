package com.realsil.sdk.core.d;

/* loaded from: classes3.dex */
public class b extends com.realsil.sdk.core.d.a {
    public final com.realsil.sdk.core.d.b.a p;

    public class a extends android.content.BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(android.content.Context context, android.content.Intent intent) {
            java.lang.String action = intent.getAction();
            if ("android.bluetooth.device.action.FOUND".equals(action) || "android.bluetooth.device.action.CLASS_CHANGED".equals(action)) {
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                short shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", (short) 0);
                if (bluetoothDevice != null) {
                    if (com.realsil.sdk.core.d.b.this.b) {
                        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("%s %s", action, com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.dumpBluetoothDevice(bluetoothDevice)));
                    }
                    com.realsil.sdk.core.d.b.this.a(bluetoothDevice, shortExtra, null);
                    return;
                } else {
                    if (com.realsil.sdk.core.d.b.this.b) {
                        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("%s", action));
                        return;
                    }
                    return;
                }
            }
            if (!"android.bluetooth.device.action.NAME_CHANGED".equals(action) && !"android.bluetooth.device.action.UUID".equals(action)) {
                if ("android.bluetooth.adapter.action.DISCOVERY_STARTED".equals(action)) {
                    com.realsil.sdk.core.d.b.this.a(2);
                    return;
                } else {
                    if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
                        com.realsil.sdk.core.d.b.this.a(3);
                        return;
                    }
                    return;
                }
            }
            android.bluetooth.BluetoothDevice bluetoothDevice2 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            short shortExtra2 = intent.getShortExtra("android.bluetooth.device.extra.RSSI", (short) 0);
            if (bluetoothDevice2 == null) {
                if (com.realsil.sdk.core.d.b.this.b) {
                    com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("%s", action));
                }
            } else {
                if (com.realsil.sdk.core.d.b.this.b) {
                    com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("%s %s/%s", action, bluetoothDevice2.getName(), bluetoothDevice2.toString()));
                }
                com.realsil.sdk.core.d.b bVar = com.realsil.sdk.core.d.b.this;
                if (bVar.h == 2) {
                    bVar.a(bluetoothDevice2, shortExtra2, null);
                }
            }
        }
    }

    public b(android.content.Context context) {
        this(context, null, null, null);
    }

    @Override // com.realsil.sdk.core.d.a
    public final boolean a(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            if (this.d.getScanMode() == 33) {
                if (bluetoothDevice.getType() != 1) {
                    if (this.b) {
                        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "filter, invalid type: %d, expect type is %d", java.lang.Integer.valueOf(bluetoothDevice.getType()), 1));
                    }
                    return false;
                }
            } else if (this.d.getScanMode() == 32 && bluetoothDevice.getType() != 1 && bluetoothDevice.getType() != 3 && bluetoothDevice.getType() != 0) {
                if (this.b) {
                    com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "filter, invalid type: %d, expect type is %d/%d/%d", java.lang.Integer.valueOf(bluetoothDevice.getType()), 0, 1, 3));
                }
                return false;
            }
        }
        if (!b(bluetoothDevice)) {
            return false;
        }
        if (!android.text.TextUtils.isEmpty(this.d.getAddressFilter()) && !com.realsil.sdk.core.utility.DataConverter.equals(this.d.getAddressFilter(), bluetoothDevice.getAddress())) {
            if (this.b) {
                java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("address not match:");
                a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
                com.realsil.sdk.core.logger.ZLogger.v(a2.toString());
            }
            return false;
        }
        android.os.ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (1 == this.d.getFilterProfile()) {
            android.bluetooth.BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
            if (bluetoothClass.getMajorDeviceClass() != 1024 && (com.realsil.sdk.core.bluetooth.impl.BluetoothClassImpl.doesClassMatch(bluetoothClass, 0) || com.realsil.sdk.core.bluetooth.impl.BluetoothClassImpl.doesClassMatch(bluetoothClass, 1))) {
                if (this.b) {
                    com.realsil.sdk.core.logger.ZLogger.v("major device class filter failed");
                }
                return false;
            }
            if (bluetoothDevice.getBondState() == 12 && !com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.containsAnyUuid(uuids, com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.HEADSET_PROFILE_UUIDS)) {
                if (this.b) {
                    com.realsil.sdk.core.logger.ZLogger.v("profile filter failed");
                }
                return false;
            }
        }
        if (bluetoothDevice.getBondState() != 12 || com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.containsAllUuids(uuids, this.d.getFilterUuids())) {
            return true;
        }
        if (this.b) {
            com.realsil.sdk.core.logger.ZLogger.v("uuid filter failed");
        }
        return false;
    }

    @Override // com.realsil.sdk.core.d.a
    public final boolean b() {
        if (!super.b()) {
            return false;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.device.action.UUID");
        this.c.registerReceiver(this.p, intentFilter);
        com.realsil.sdk.core.logger.ZLogger.v(this.b, "scanner initialized");
        return true;
    }

    @Override // com.realsil.sdk.core.d.a
    public final boolean e() {
        if (this.g.isDiscovering()) {
            com.realsil.sdk.core.logger.ZLogger.v(this.b, "cancelDiscovery");
            if (!this.g.cancelDiscovery()) {
                com.realsil.sdk.core.logger.ZLogger.d("cancelDiscovery failed");
                return false;
            }
        }
        a(0);
        return true;
    }

    @Override // com.realsil.sdk.core.d.a
    public void onDestroy() {
        android.content.Context context = this.c;
        if (context != null) {
            try {
                context.unregisterReceiver(this.p);
            } catch (java.lang.Exception e) {
                com.realsil.sdk.core.logger.ZLogger.w(this.b, e.toString());
            }
        }
        super.onDestroy();
    }

    @Override // com.realsil.sdk.core.d.a
    public boolean startScan() {
        if (!d()) {
            return true;
        }
        if (this.g.isDiscovering()) {
            this.g.cancelDiscovery();
        }
        if (this.b) {
            boolean z = this.a;
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("startDiscovery for ");
            a2.append(this.d.toString());
            com.realsil.sdk.core.logger.ZLogger.v(z, a2.toString());
        } else {
            boolean z2 = this.a;
            java.lang.StringBuilder a3 = com.realsil.sdk.core.a.a.a("startDiscovery for ");
            a3.append(this.d.getScanPeriod());
            a3.append("ms");
            com.realsil.sdk.core.logger.ZLogger.v(z2, a3.toString());
        }
        if (this.g.startDiscovery()) {
            c();
            return true;
        }
        com.realsil.sdk.core.logger.ZLogger.d("startDiscovery failed");
        stopScan();
        return false;
    }

    public b(android.content.Context context, com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams, com.realsil.sdk.core.bluetooth.scanner.ScannerCallback scannerCallback) {
        this(context, null, scannerParams, scannerCallback);
    }

    public b(android.content.Context context, android.os.Handler handler, com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams, com.realsil.sdk.core.bluetooth.scanner.ScannerCallback scannerCallback) {
        this.p = new com.realsil.sdk.core.d.b.a();
        this.c = context.getApplicationContext();
        this.f = handler;
        this.d = scannerParams;
        this.e = scannerCallback;
        b();
    }
}
