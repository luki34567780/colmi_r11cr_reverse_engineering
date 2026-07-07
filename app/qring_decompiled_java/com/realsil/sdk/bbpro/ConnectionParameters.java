package com.realsil.sdk.bbpro;

/* loaded from: /tmp/dex/classes2.dex */
public final class ConnectionParameters {
    public static final java.util.UUID f = java.util.UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    public static final java.util.UUID g = java.util.UUID.fromString("6A24EEAB-4B65-4693-986B-3C26C352264F");
    public android.bluetooth.BluetoothDevice a;
    public android.bluetooth.BluetoothSocket b;
    public java.util.UUID c;
    public boolean d;
    public int e;

    public android.bluetooth.BluetoothDevice a() {
        return this.a;
    }

    public android.bluetooth.BluetoothSocket b() {
        return this.b;
    }

    public com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams c() {
        return new com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams.Builder(this.a).bluetoothSocket(this.b).uuid(this.c).freshUuid(this.d).transport(this.e).build();
    }

    public java.util.UUID d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConnectionParameters{\n");
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

    public ConnectionParameters(android.bluetooth.BluetoothDevice bluetoothDevice, android.bluetooth.BluetoothSocket bluetoothSocket, java.util.UUID uuid, boolean z, int i) {
        this.a = bluetoothDevice;
        this.b = bluetoothSocket;
        this.c = uuid;
        this.d = z;
        this.e = i;
    }

    public static final class Builder {
        public android.bluetooth.BluetoothDevice a;
        public android.bluetooth.BluetoothSocket b;
        public java.util.UUID c = com.realsil.sdk.bbpro.ConnectionParameters.g;
        public boolean d = false;
        public int e = 0;

        public Builder(android.bluetooth.BluetoothDevice bluetoothDevice) {
            this.a = bluetoothDevice;
        }

        public com.realsil.sdk.bbpro.ConnectionParameters.Builder bluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice) {
            this.a = bluetoothDevice;
            return this;
        }

        public com.realsil.sdk.bbpro.ConnectionParameters.Builder bluetoothSocket(android.bluetooth.BluetoothSocket bluetoothSocket) {
            this.b = bluetoothSocket;
            return this;
        }

        public com.realsil.sdk.bbpro.ConnectionParameters build() {
            return new com.realsil.sdk.bbpro.ConnectionParameters(this.a, this.b, this.c, this.d, this.e);
        }

        public com.realsil.sdk.bbpro.ConnectionParameters.Builder freshUuid(boolean z) {
            this.d = z;
            return this;
        }

        public com.realsil.sdk.bbpro.ConnectionParameters.Builder transport(int i) {
            this.e = i;
            return this;
        }

        public com.realsil.sdk.bbpro.ConnectionParameters.Builder uuid(java.util.UUID uuid) {
            if (uuid != null) {
                this.c = uuid;
            }
            return this;
        }

        public Builder(android.bluetooth.BluetoothSocket bluetoothSocket) {
            this.b = bluetoothSocket;
        }
    }
}
