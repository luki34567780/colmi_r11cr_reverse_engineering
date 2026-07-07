package com.realsil.sdk.core.bluetooth.impl;

/* loaded from: classes3.dex */
public class BluetoothAdapterImpl {
    public static final java.lang.String ACTION_BLE_ACL_CONNECTED = "android.bluetooth.adapter.action.BLE_ACL_CONNECTED";
    public static final java.lang.String ACTION_BLE_ACL_DISCONNECTED = "android.bluetooth.adapter.action.BLE_ACL_DISCONNECTED";

    public static int getConnectionState(android.bluetooth.BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter == null) {
            com.realsil.sdk.core.logger.ZLogger.w("BT is not enabled");
            return 0;
        }
        try {
            java.lang.reflect.Method method = bluetoothAdapter.getClass().getMethod("getConnectionState", null);
            method.setAccessible(true);
            return ((java.lang.Integer) method.invoke(bluetoothAdapter, null)).intValue();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
