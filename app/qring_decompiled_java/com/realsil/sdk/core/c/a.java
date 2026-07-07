package com.realsil.sdk.core.c;

/* loaded from: classes3.dex */
public abstract class a {
    public static final java.util.UUID CLIENT_CHARACTERISTIC_CONFIG = java.util.UUID.fromString(com.realsil.sdk.core.c.b.CLIENT_CHARACTERISTIC_CONFIG);
    public android.bluetooth.BluetoothAdapter c;
    public com.realsil.sdk.core.bluetooth.BluetoothProfileManager d;
    public com.realsil.sdk.core.bluetooth.RtkBluetoothManager e;
    public com.realsil.sdk.core.bluetooth.GlobalGatt f;
    public android.content.Context mContext;
    public boolean a = true;
    public boolean b = true;
    public java.lang.Object g = new java.lang.Object();
    public final com.realsil.sdk.core.c.a.C0064a h = new com.realsil.sdk.core.c.a.C0064a();

    /* renamed from: com.realsil.sdk.core.c.a$a, reason: collision with other inner class name */
    public class C0064a extends com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback {
        public C0064a() {
        }

        @Override // com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback
        public final void onBondStateChanged(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
            super.onBondStateChanged(bluetoothDevice, i);
            com.realsil.sdk.core.c.a.this.a(i);
        }
    }

    public final void a() {
        this.c = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        com.realsil.sdk.core.bluetooth.BluetoothProfileManager bluetoothProfileManager = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance();
        this.d = bluetoothProfileManager;
        if (bluetoothProfileManager == null) {
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager.initial(this.mContext);
            this.d = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance();
        }
        com.realsil.sdk.core.bluetooth.BluetoothProfileManager bluetoothProfileManager2 = this.d;
        if (bluetoothProfileManager2 != null) {
            bluetoothProfileManager2.addManagerCallback(null);
        } else {
            com.realsil.sdk.core.logger.ZLogger.w(this.a, "BluetoothProfileManager not initialized");
        }
        com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager = com.realsil.sdk.core.bluetooth.RtkBluetoothManager.getInstance();
        this.e = rtkBluetoothManager;
        if (rtkBluetoothManager == null) {
            com.realsil.sdk.core.bluetooth.RtkBluetoothManager.initial(this.mContext);
            this.e = com.realsil.sdk.core.bluetooth.RtkBluetoothManager.getInstance();
        }
        com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager2 = this.e;
        if (rtkBluetoothManager2 != null) {
            rtkBluetoothManager2.addManagerCallback(this.h);
        } else {
            com.realsil.sdk.core.logger.ZLogger.w(this.a, "BluetoothProfileManager not initialized");
        }
        com.realsil.sdk.core.bluetooth.GlobalGatt globalGatt = com.realsil.sdk.core.bluetooth.GlobalGatt.getInstance();
        this.f = globalGatt;
        if (globalGatt == null) {
            com.realsil.sdk.core.bluetooth.GlobalGatt.initial(this.mContext);
            this.f = com.realsil.sdk.core.bluetooth.GlobalGatt.getInstance();
        }
    }

    public void a(int i) {
    }

    public void destroy() {
        com.realsil.sdk.core.logger.ZLogger.v(this.a, "destroy");
        com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager = this.e;
        if (rtkBluetoothManager != null) {
            rtkBluetoothManager.removeManagerCallback(this.h);
        }
        com.realsil.sdk.core.bluetooth.BluetoothProfileManager bluetoothProfileManager = this.d;
        if (bluetoothProfileManager != null) {
            bluetoothProfileManager.removeManagerCallback(null);
        }
    }

    public boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int getBondState(java.lang.String str) {
        android.bluetooth.BluetoothDevice remoteDevice;
        if (this.c == null || (remoteDevice = getRemoteDevice(str)) == null) {
            return 10;
        }
        return remoteDevice.getBondState();
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    public android.bluetooth.BluetoothDevice getRemoteDevice(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.c;
        if (bluetoothAdapter == null) {
            com.realsil.sdk.core.logger.ZLogger.w("mBluetoothAdapter == null");
            return null;
        }
        try {
            return bluetoothAdapter.getRemoteDevice(str);
        } catch (java.lang.Exception e) {
            com.realsil.sdk.core.logger.ZLogger.e(e.toString());
            return null;
        }
    }

    public boolean isBluetoothSupported() {
        return this.c != null;
    }

    public boolean isHogpConnect(java.lang.String str) {
        return isHogpConnect(getRemoteDevice(str));
    }

    public void notifyLock() {
        try {
            synchronized (this.g) {
                if (this.b) {
                    com.realsil.sdk.core.logger.ZLogger.v("notifyLock");
                }
                this.g.notifyAll();
            }
        } catch (java.lang.Exception e) {
            com.realsil.sdk.core.logger.ZLogger.w(e.toString());
        }
    }

    public boolean isHogpConnect(android.bluetooth.BluetoothDevice bluetoothDevice) {
        return bluetoothDevice != null && com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance().getConnectionState(4, bluetoothDevice) == 2;
    }
}
