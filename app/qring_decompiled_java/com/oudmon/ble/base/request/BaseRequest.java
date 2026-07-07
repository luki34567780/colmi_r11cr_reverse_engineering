package com.oudmon.ble.base.request;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseRequest {
    private java.util.UUID charUuid;
    private java.util.UUID serviceUuid;
    public boolean writeRequest;

    public abstract boolean execute(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic);

    public boolean needInitCharacteristic() {
        return true;
    }

    public BaseRequest(java.util.UUID uuid, java.util.UUID uuid2) {
        this.serviceUuid = uuid;
        this.charUuid = uuid2;
    }

    public java.util.UUID getServiceUuid() {
        return this.serviceUuid;
    }

    public java.util.UUID getCharUuid() {
        return this.charUuid;
    }
}
