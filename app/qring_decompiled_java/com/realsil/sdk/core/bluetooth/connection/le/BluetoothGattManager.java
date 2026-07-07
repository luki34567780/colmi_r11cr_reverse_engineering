package com.realsil.sdk.core.bluetooth.connection.le;

/* loaded from: classes3.dex */
public final class BluetoothGattManager extends com.realsil.sdk.core.c.b {
    public static com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattManager n;

    public BluetoothGattManager(android.content.Context context) {
        super(context);
    }

    public static com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattManager getInstance() {
        return n;
    }

    public static synchronized void initial(android.content.Context context) {
        synchronized (com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattManager.class) {
            if (n == null) {
                synchronized (com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattManager.class) {
                    if (n == null) {
                        n = new com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattManager(context.getApplicationContext());
                    }
                }
            }
        }
    }
}
