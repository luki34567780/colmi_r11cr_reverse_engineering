package com.oudmon.ble.base.bluetooth.spp;

/* loaded from: /tmp/dex/classes2.dex */
public interface MyBumblebeeCallback {
    void onAckReceived(int i, byte b);

    void onConnectionStateChanged(android.bluetooth.BluetoothDevice bluetoothDevice, int i, int i2);

    void onDeviceInfoChanged(com.oudmon.ble.base.bluetooth.spp.bean.MyDeviceInfo myDeviceInfo, int i);

    void onEventReported(int i, byte[] bArr);

    void onServiceConnectionStateChanged(boolean z);

    void onStateChanged(int i);
}
