package com.realsil.sdk.core.bluetooth.connection.legacy;

/* loaded from: classes3.dex */
public final class SppConnParameters {
    public android.bluetooth.BluetoothDevice a;
    public android.bluetooth.BluetoothSocket b;
    public java.util.UUID c;
    public boolean d;
    public static final java.util.UUID WELL_KNOWN_SPP_UUID = java.util.UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    public static final java.util.UUID VENDOR_SPP_UUID = java.util.UUID.fromString("6A24EEAB-4B65-4693-986B-3C26C352264F");

    public static final class Builder {
        public android.bluetooth.BluetoothDevice a;
        public android.bluetooth.BluetoothSocket b;
        public java.util.UUID c = com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters.VENDOR_SPP_UUID;
        public boolean d = false;

        public Builder(android.bluetooth.BluetoothDevice bluetoothDevice) {
            this.a = bluetoothDevice;
        }

        public com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters.Builder bluetoothSocket(android.bluetooth.BluetoothSocket bluetoothSocket) {
            this.b = bluetoothSocket;
            return this;
        }

        public com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters build() {
            return new com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters(this.a, this.b, this.c, this.d);
        }

        public com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters.Builder freshUuid(boolean z) {
            this.d = z;
            return this;
        }

        public com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters.Builder uuid(java.util.UUID uuid) {
            if (uuid != null) {
                this.c = uuid;
            }
            return this;
        }
    }

    public SppConnParameters(android.bluetooth.BluetoothDevice bluetoothDevice, android.bluetooth.BluetoothSocket bluetoothSocket, java.util.UUID uuid, boolean z) {
        this.a = bluetoothDevice;
        this.b = bluetoothSocket;
        this.c = uuid;
        this.d = z;
    }

    public android.bluetooth.BluetoothDevice getBluetoothDevice() {
        return this.a;
    }

    public android.bluetooth.BluetoothSocket getBluetoothSocket() {
        return this.b;
    }

    public java.util.UUID getUuid() {
        return this.c;
    }

    public boolean isFreshUuid() {
        return this.d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SppConnParameters{\n");
        if (this.a != null) {
            sb.append("\n\tdevice:");
            sb.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(this.a.getAddress(), true));
        }
        if (this.c != null) {
            sb.append("\n\tuuid:");
            sb.append(this.c.toString());
        }
        sb.append("\n\tfreshUuid:");
        sb.append(this.d);
        sb.append("\n}");
        return sb.toString();
    }
}
