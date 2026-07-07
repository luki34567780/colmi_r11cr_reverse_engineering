package com.realsil.sdk.bbpro.core.transportlayer;

/* loaded from: /tmp/dex/classes2.dex */
public final class TransportConnParams {
    public static final int TRANSPORT_AUTO = 0;
    public static final int TRANSPORT_VENDOR = 1;
    public android.bluetooth.BluetoothDevice a;
    public android.bluetooth.BluetoothSocket b;
    public java.util.UUID c;
    public boolean d;
    public int e;
    public static final android.os.ParcelUuid WELL_KNOWN_SPP_UUID = android.os.ParcelUuid.fromString("00001101-0000-1000-8000-00805F9B34FB");
    public static final java.util.UUID VENDOR_SPP_UUID = java.util.UUID.fromString("6A24EEAB-4B65-4693-986B-3C26C352264F");

    public TransportConnParams(android.bluetooth.BluetoothDevice bluetoothDevice, android.bluetooth.BluetoothSocket bluetoothSocket, java.util.UUID uuid, boolean z, int i) {
        this.a = bluetoothDevice;
        this.b = bluetoothSocket;
        this.c = uuid;
        this.d = z;
        this.e = i;
    }

    public android.bluetooth.BluetoothDevice getBluetoothDevice() {
        return this.a;
    }

    public android.bluetooth.BluetoothSocket getBluetoothSocket() {
        return this.b;
    }

    public int getTransport() {
        return this.e;
    }

    public java.util.UUID getUuid() {
        return this.c;
    }

    public boolean isFreshUuid() {
        return this.d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConnectionParameters{\n");
        if (this.a != null) {
            sb.append("\n\tdevice:");
            sb.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(this.a.getAddress(), true));
        }
        java.util.UUID uuid = this.c;
        if (uuid != null) {
            sb.append(java.lang.String.format(java.util.Locale.US, "\n\tuuid:%s, fresh=%b, transport=%d", uuid.toString(), java.lang.Boolean.valueOf(this.d), java.lang.Integer.valueOf(this.e)));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public static final class Builder {
        public android.bluetooth.BluetoothDevice a;
        public android.bluetooth.BluetoothSocket b;
        public java.util.UUID c = com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams.VENDOR_SPP_UUID;
        public boolean d = false;
        public int e = 0;

        public Builder(android.bluetooth.BluetoothDevice bluetoothDevice) {
            this.a = bluetoothDevice;
        }

        public com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams.Builder bluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice) {
            this.a = bluetoothDevice;
            return this;
        }

        public com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams.Builder bluetoothSocket(android.bluetooth.BluetoothSocket bluetoothSocket) {
            this.b = bluetoothSocket;
            return this;
        }

        public com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams build() {
            return new com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams(this.a, this.b, this.c, this.d, this.e);
        }

        public com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams.Builder freshUuid(boolean z) {
            this.d = z;
            return this;
        }

        public com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams.Builder transport(int i) {
            this.e = i;
            return this;
        }

        public com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams.Builder uuid(java.util.UUID uuid) {
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
