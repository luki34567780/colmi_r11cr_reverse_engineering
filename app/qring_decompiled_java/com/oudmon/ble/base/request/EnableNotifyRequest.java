package com.oudmon.ble.base.request;

/* loaded from: /tmp/dex/classes2.dex */
public class EnableNotifyRequest extends com.oudmon.ble.base.request.BaseRequest {
    private java.util.UUID GATT_NOTIFY_CONFIG;
    private com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback callback;
    private boolean isEnable;

    public interface ListenerCallback {
        void enable(boolean z);
    }

    public EnableNotifyRequest(java.util.UUID uuid, java.util.UUID uuid2, com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback listenerCallback) {
        super(uuid, uuid2);
        this.GATT_NOTIFY_CONFIG = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        this.isEnable = true;
        this.callback = listenerCallback;
    }

    public EnableNotifyRequest(java.util.UUID uuid, java.util.UUID uuid2, boolean z) {
        super(uuid, uuid2);
        this.GATT_NOTIFY_CONFIG = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        this.isEnable = true;
        this.isEnable = z;
    }

    @Override // com.oudmon.ble.base.request.BaseRequest
    public boolean execute(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGatt == null) {
            com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback listenerCallback = this.callback;
            if (listenerCallback != null) {
                listenerCallback.enable(false);
            }
            return false;
        }
        if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, this.isEnable)) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "open local notify failed");
            com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback listenerCallback2 = this.callback;
            if (listenerCallback2 != null) {
                listenerCallback2.enable(false);
            }
            return false;
        }
        android.bluetooth.BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(this.GATT_NOTIFY_CONFIG);
        if (descriptor == null) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "descriptor is null, execute failed");
            com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback listenerCallback3 = this.callback;
            if (listenerCallback3 != null) {
                listenerCallback3.enable(false);
            }
            return false;
        }
        descriptor.setValue(this.isEnable ? android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        boolean writeDescriptor = bluetoothGatt.writeDescriptor(descriptor);
        com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback listenerCallback4 = this.callback;
        if (listenerCallback4 != null) {
            listenerCallback4.enable(writeDescriptor);
        }
        return writeDescriptor;
    }

    public boolean isEnable() {
        return this.isEnable;
    }

    public void setEnable(boolean z) {
        this.isEnable = z;
    }
}
