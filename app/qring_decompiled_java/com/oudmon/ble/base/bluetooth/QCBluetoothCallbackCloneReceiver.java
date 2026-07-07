package com.oudmon.ble.base.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public class QCBluetoothCallbackCloneReceiver extends android.content.BroadcastReceiver {
    public void bleStatus(int i, int i2) {
    }

    public void connectStatue(android.bluetooth.BluetoothDevice bluetoothDevice, boolean z) {
    }

    public void onCharacteristicChange(java.lang.String str, java.lang.String str2, byte[] bArr) {
    }

    public void onCharacteristicChangeFilter(java.lang.String str, java.lang.String str2, byte[] bArr) {
    }

    public void onCharacteristicRead(java.lang.String str, byte[] bArr) {
    }

    public void onCommandSend(byte[] bArr) {
    }

    public void onServiceDiscovered() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        action.hashCode();
        switch (action) {
            case "com.qc.pro.sdk.ble.service_discovered":
                onServiceDiscovered();
                break;
            case "com.qc.pro.sdk.ble.gatt_connected":
                connectStatue((android.bluetooth.BluetoothDevice) intent.getParcelableExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_DEVICE), true);
                break;
            case "com.qc.pro.sdk.ble.BLE_NO_CALLBACK":
            case "com.qc.pro.sdk.ble.gatt_disconnected":
                connectStatue((android.bluetooth.BluetoothDevice) intent.getParcelableExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_DEVICE), false);
                break;
            case "com.qc.pro.sdk.ble.characteristic_read":
                onCharacteristicRead(intent.getStringExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_CHARACTER_UUID), intent.getByteArrayExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_VALUE));
                break;
            case "com.qc.pro.characteristic_write_qc":
                onCommandSend(intent.getByteArrayExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_DATA));
                break;
            case "com.qc.pro.characteristic_changed_qc":
                onCharacteristicChange(intent.getStringExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_ADDR), intent.getStringExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_CHARACTER_UUID), intent.getByteArrayExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_VALUE));
                break;
            case "com.qc.pro.sdk.ble.BLE_STATUS":
                bleStatus(intent.getIntExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_BLE_STATUS, 99), intent.getIntExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_BLE_NEW_STATE, 99));
                break;
        }
    }
}
