package com.oudmon.ble.base.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public interface IBleListener {
    void bleCharacteristicChanged(java.lang.String str, java.lang.String str2, byte[] bArr);

    void bleCharacteristicNotification();

    void bleCharacteristicRead(java.lang.String str, java.lang.String str2, int i, byte[] bArr);

    void bleCharacteristicWrite(java.lang.String str, java.lang.String str2, int i, byte[] bArr);

    void bleGattConnected(android.bluetooth.BluetoothDevice bluetoothDevice);

    void bleGattDisconnect(android.bluetooth.BluetoothDevice bluetoothDevice);

    void bleNoCallback();

    void bleServiceDiscovered(int i, java.lang.String str);

    void bleStatus(int i, int i2);

    boolean execute(com.oudmon.ble.base.request.BaseRequest baseRequest);

    boolean isConnected();

    void onDescriptorRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i);

    void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i);

    void onReadRemoteRssi(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2);

    void startConnect();
}
