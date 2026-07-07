package com.oudmon.ble.base.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public class QCBluetoothCallbackReceiver extends android.content.BroadcastReceiver {
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
                connectStatue(null, false);
                break;
            case "com.qc.pro.characteristic_write_qc":
                onCommandSend(intent.getByteArrayExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_DATA));
                break;
            case "com.qc.pro.characteristic_changed_qc":
                onCharacteristicChange(intent.getStringExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_ADDR), intent.getStringExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_CHARACTER_UUID), intent.getByteArrayExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_VALUE));
                break;
        }
    }

    public void connectStatue(android.bluetooth.BluetoothDevice bluetoothDevice, boolean z) {
        if (bluetoothDevice != null) {
            com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().setDeviceName(bluetoothDevice.getName());
            com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().setDeviceAddress(bluetoothDevice.getAddress());
        }
    }

    public void onCharacteristicChange(java.lang.String str, java.lang.String str2, byte[] bArr) {
        if (bArr == null || bArr.length != com.oudmon.ble.base.communication.Constants.CMD_DATA_LENGTH || !com.oudmon.ble.base.bluetooth.QCDataParser.checkCrc(bArr) || com.oudmon.ble.base.bluetooth.QCDataParser.parserAndDispatchReqData(bArr)) {
            return;
        }
        com.oudmon.ble.base.bluetooth.QCDataParser.parserAndDispatchNotifyData(com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().getNotifySparseArray(), bArr);
    }
}
