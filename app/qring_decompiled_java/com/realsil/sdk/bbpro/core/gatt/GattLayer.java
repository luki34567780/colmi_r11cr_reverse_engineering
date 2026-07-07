package com.realsil.sdk.bbpro.core.gatt;

/* loaded from: /tmp/dex/classes2.dex */
public class GattLayer extends com.realsil.sdk.bbpro.core.gatt.BaseChannel {
    public static final java.util.UUID j = java.util.UUID.fromString("000002fd-3C17-D293-8E48-14FE2E4DA212");
    public static final java.util.UUID k = new java.util.UUID(253, 3);
    public static final java.util.UUID l = new java.util.UUID(253, 4);
    public static final java.util.UUID m = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public android.bluetooth.BluetoothGatt d;
    public java.lang.String e;
    public com.realsil.sdk.core.bluetooth.GlobalGatt f;
    public android.bluetooth.BluetoothGattCharacteristic g;
    public android.bluetooth.BluetoothGattCharacteristic h;
    public android.bluetooth.BluetoothGattCallback i;

    public GattLayer(com.realsil.sdk.bbpro.core.gatt.ChannelCallback channelCallback) {
        super(null, channelCallback);
        this.e = null;
        this.i = new android.bluetooth.BluetoothGattCallback() { // from class: com.realsil.sdk.bbpro.core.gatt.GattLayer.1
            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                byte[] value = bluetoothGattCharacteristic.getValue();
                if (bluetoothGattCharacteristic.getUuid().equals(com.realsil.sdk.bbpro.core.gatt.GattLayer.l)) {
                    com.realsil.sdk.core.logger.ZLogger.d("[RX]<<(" + value.length + ") : " + com.realsil.sdk.core.utility.DataConverter.bytes2HexWithSeparate(value));
                    com.realsil.sdk.bbpro.core.gatt.ChannelCallback channelCallback2 = com.realsil.sdk.bbpro.core.gatt.GattLayer.this.c;
                    if (channelCallback2 != null) {
                        channelCallback2.onDataReceive(value);
                    }
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
                android.bluetooth.BluetoothDevice device = bluetoothGatt.getDevice();
                if (i != 0) {
                    com.realsil.sdk.core.logger.ZLogger.e("status " + i + " newState: " + i2);
                    com.realsil.sdk.bbpro.core.gatt.GattLayer.this.close();
                    com.realsil.sdk.bbpro.core.gatt.ChannelCallback channelCallback2 = com.realsil.sdk.bbpro.core.gatt.GattLayer.this.c;
                    if (channelCallback2 != null) {
                        channelCallback2.onConnectionStateChange(device, false, i2);
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    com.realsil.sdk.bbpro.core.gatt.GattLayer.this.d = bluetoothGatt;
                    com.realsil.sdk.core.logger.ZLogger.d("Connected to GATT server.");
                    com.realsil.sdk.core.logger.ZLogger.d("Attempting to start service discovery: " + com.realsil.sdk.bbpro.core.gatt.GattLayer.this.d.discoverServices());
                    return;
                }
                if (i2 == 0) {
                    com.realsil.sdk.core.logger.ZLogger.d("Disconnected from GATT server.");
                    com.realsil.sdk.bbpro.core.gatt.GattLayer.this.close();
                    com.realsil.sdk.bbpro.core.gatt.ChannelCallback channelCallback3 = com.realsil.sdk.bbpro.core.gatt.GattLayer.this.c;
                    if (channelCallback3 != null) {
                        channelCallback3.onConnectionStateChange(device, true, i2);
                    }
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                bluetoothGatt.getDevice();
                if (i != 0) {
                    com.realsil.sdk.core.logger.ZLogger.w("Descriptor write error: " + i);
                    com.realsil.sdk.bbpro.core.gatt.GattLayer.this.disconnectGatt();
                    return;
                }
                if (com.realsil.sdk.bbpro.core.gatt.GattLayer.m.equals(bluetoothGattDescriptor.getUuid()) && bluetoothGattDescriptor.getCharacteristic().getUuid().equals(com.realsil.sdk.bbpro.core.gatt.GattLayer.this.h.getUuid())) {
                    if (bluetoothGattDescriptor.getValue()[0] == 1) {
                        com.realsil.sdk.core.logger.ZLogger.d(" Notification enabled");
                    } else {
                        com.realsil.sdk.core.logger.ZLogger.w("Notification  not enabled!!!");
                        com.realsil.sdk.bbpro.core.gatt.GattLayer.this.disconnectGatt();
                    }
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
                if (i != 0) {
                    com.realsil.sdk.bbpro.core.gatt.GattLayer.this.disconnectGatt();
                    com.realsil.sdk.core.logger.ZLogger.w("onServicesDiscovered failed: " + i);
                    return;
                }
                com.realsil.sdk.core.logger.ZLogger.d("onServicesDiscovered success.");
                android.bluetooth.BluetoothGattService service = bluetoothGatt.getService(com.realsil.sdk.bbpro.core.gatt.GattLayer.j);
                if (service == null) {
                    com.realsil.sdk.bbpro.core.gatt.GattLayer.this.disconnectGatt();
                    return;
                }
                com.realsil.sdk.bbpro.core.gatt.GattLayer.this.g = service.getCharacteristic(com.realsil.sdk.bbpro.core.gatt.GattLayer.k);
                com.realsil.sdk.bbpro.core.gatt.GattLayer gattLayer = com.realsil.sdk.bbpro.core.gatt.GattLayer.this;
                if (gattLayer.g == null) {
                    gattLayer.disconnectGatt();
                    return;
                }
                gattLayer.h = service.getCharacteristic(com.realsil.sdk.bbpro.core.gatt.GattLayer.l);
                com.realsil.sdk.bbpro.core.gatt.GattLayer gattLayer2 = com.realsil.sdk.bbpro.core.gatt.GattLayer.this;
                android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic = gattLayer2.h;
                if (bluetoothGattCharacteristic == null) {
                    gattLayer2.disconnectGatt();
                } else {
                    gattLayer2.f.setCharacteristicNotification(gattLayer2.e, bluetoothGattCharacteristic, true);
                }
            }
        };
        com.realsil.sdk.core.logger.ZLogger.v("GattLayer initial");
        this.f = com.realsil.sdk.core.bluetooth.GlobalGatt.getInstance();
    }

    public void close() {
        com.realsil.sdk.core.logger.ZLogger.d("close()");
        this.f.close(this.e);
    }

    public boolean connect(android.bluetooth.BluetoothDevice bluetoothDevice) {
        java.lang.String address = bluetoothDevice.getAddress();
        com.realsil.sdk.core.logger.ZLogger.d("connect, address: " + com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(address, true));
        this.e = address;
        return this.f.connect(address, this.i);
    }

    public void disconnectGatt() {
        com.realsil.sdk.core.logger.ZLogger.d("disconnect()");
        this.f.disconnectGatt(this.e);
    }

    public boolean sendData(byte[] bArr) {
        if (this.g == null) {
            com.realsil.sdk.core.logger.ZLogger.w("mTXCharacteristic == null.");
            return false;
        }
        if (!this.f.isConnected(this.e)) {
            com.realsil.sdk.core.logger.ZLogger.w("disconnect.");
            return false;
        }
        this.g.setValue(bArr);
        this.f.writeCharacteristic(this.e, this.g);
        return true;
    }
}
