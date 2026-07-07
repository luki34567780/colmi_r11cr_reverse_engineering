package com.realsil.sdk.core.bluetooth.scanner;

/* loaded from: classes3.dex */
public class ExtendedBluetoothDevice {
    public static final boolean DEVICE_IS_BONDED = true;
    public static final boolean DEVICE_NOT_BONDED = false;
    public static final int NO_RSSI = -1000;
    public int a;
    public boolean b;
    public android.bluetooth.BluetoothDevice device;
    public boolean isBonded;
    public boolean isConnected;
    public java.lang.String name;
    public int rssi;
    public byte[] scanRecord;
    public com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord specScanRecord;
    public long timestamp;

    public static class AddressComparator {
        public java.lang.String address;

        public boolean equals(java.lang.Object obj) {
            return obj instanceof com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice ? this.address.equals(((com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice) obj).device.getAddress()) : super.equals(obj);
        }
    }

    public ExtendedBluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice, java.lang.String str) {
        this(bluetoothDevice, str, -1000, false, false, null);
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice ? this.device.getAddress().equals(((com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice) obj).device.getAddress()) : super.equals(obj);
    }

    public int getConnectState() {
        return this.a;
    }

    public android.bluetooth.BluetoothDevice getDevice() {
        return this.device;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public int getRssi() {
        return this.rssi;
    }

    public byte[] getScanRecord() {
        return this.scanRecord;
    }

    public com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord getSpecScanRecord() {
        return this.specScanRecord;
    }

    public boolean isBonded() {
        return this.isBonded;
    }

    public boolean isConnect() {
        return this.isConnected;
    }

    public boolean isHogp() {
        return this.b;
    }

    public void setBonded(boolean z) {
        this.isBonded = z;
    }

    public void setConnect(boolean z) {
        this.isConnected = z;
    }

    public void setConnectState(int i) {
        this.a = i;
        this.isConnected = i == 2;
    }

    public void setDevice(android.bluetooth.BluetoothDevice bluetoothDevice) {
        this.device = bluetoothDevice;
    }

    public void setHogp(boolean z) {
        this.b = z;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setScanRecord(byte[] bArr) {
        this.scanRecord = bArr;
        com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord parseFromBytes = com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord.parseFromBytes(bArr);
        this.specScanRecord = parseFromBytes;
        if (parseFromBytes == null || parseFromBytes.getServiceUuids() == null) {
            return;
        }
        this.b = this.specScanRecord.getServiceUuids().contains(com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.HOGP);
    }

    public ExtendedBluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice, java.lang.String str, int i) {
        this(bluetoothDevice, str, i, false, false, null);
    }

    public ExtendedBluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice, java.lang.String str, int i, boolean z, boolean z2) {
        this(bluetoothDevice, str, i, z, z2, null);
    }

    public ExtendedBluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice, java.lang.String str, int i, boolean z, boolean z2, byte[] bArr) {
        this.device = bluetoothDevice;
        this.name = str;
        this.rssi = i;
        this.isBonded = z;
        this.isConnected = z2;
        setScanRecord(bArr);
    }
}
