package com.oudmon.ble.base.request;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadRequest extends com.oudmon.ble.base.request.BaseRequest {
    public ReadRequest(java.util.UUID uuid, java.util.UUID uuid2) {
        super(uuid, uuid2);
    }

    @Override // com.oudmon.ble.base.request.BaseRequest
    public boolean execute(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
    }
}
