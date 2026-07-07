package com.oudmon.ble.base.request;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadRssiRequest extends com.oudmon.ble.base.request.BaseRequest {
    private static com.oudmon.ble.base.request.ReadRssiRequest readRequest = new com.oudmon.ble.base.request.ReadRssiRequest();

    @Override // com.oudmon.ble.base.request.BaseRequest
    public boolean needInitCharacteristic() {
        return false;
    }

    public static com.oudmon.ble.base.request.ReadRssiRequest getInstance() {
        return readRequest;
    }

    private ReadRssiRequest() {
        super(null, null);
    }

    @Override // com.oudmon.ble.base.request.BaseRequest
    public boolean execute(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGatt.readRemoteRssi();
    }
}
