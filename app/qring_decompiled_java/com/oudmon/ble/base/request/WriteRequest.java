package com.oudmon.ble.base.request;

/* loaded from: /tmp/dex/classes2.dex */
public class WriteRequest extends com.oudmon.ble.base.request.BaseRequest {
    private boolean noRsp;
    private byte[] value;

    public WriteRequest(java.util.UUID uuid, java.util.UUID uuid2) {
        super(uuid, uuid2);
        this.noRsp = false;
        this.writeRequest = true;
    }

    private WriteRequest(java.util.UUID uuid, java.util.UUID uuid2, boolean z) {
        super(uuid, uuid2);
        this.noRsp = false;
        this.noRsp = z;
        this.writeRequest = true;
    }

    public static com.oudmon.ble.base.request.WriteRequest getNoRspInstance(java.util.UUID uuid, java.util.UUID uuid2) {
        return new com.oudmon.ble.base.request.WriteRequest(uuid, uuid2, true);
    }

    public void setValue(byte[] bArr) {
        this.value = bArr;
    }

    public byte[] getValue() {
        return this.value;
    }

    @Override // com.oudmon.ble.base.request.BaseRequest
    public boolean execute(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.value == null) {
            return false;
        }
        try {
            bluetoothGattCharacteristic.setWriteType(this.noRsp ? 1 : 2);
            if (bluetoothGattCharacteristic.setValue(this.value)) {
                return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
            }
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
