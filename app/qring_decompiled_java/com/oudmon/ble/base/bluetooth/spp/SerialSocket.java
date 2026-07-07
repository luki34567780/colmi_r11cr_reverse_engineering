package com.oudmon.ble.base.bluetooth.spp;

/* loaded from: /tmp/dex/classes2.dex */
public class SerialSocket implements java.lang.Runnable {
    private static final java.util.UUID BLUETOOTH_SPP_JieLi = java.util.UUID.fromString("FE010000-1234-5678-ABCD-00805F9B34FB");
    private static com.oudmon.ble.base.bluetooth.spp.SerialSocket serialSocket;
    private android.bluetooth.BluetoothDevice device;
    private com.oudmon.ble.base.bluetooth.spp.SerialListener listener;
    private android.bluetooth.BluetoothSocket socket;

    private SerialSocket() {
    }

    public static com.oudmon.ble.base.bluetooth.spp.SerialSocket getInstance() {
        if (serialSocket == null) {
            synchronized (com.oudmon.ble.base.bluetooth.spp.SerialSocket.class) {
                if (serialSocket == null) {
                    serialSocket = new com.oudmon.ble.base.bluetooth.spp.SerialSocket();
                }
            }
        }
        return serialSocket;
    }

    public void setListener(com.oudmon.ble.base.bluetooth.spp.SerialListener serialListener) {
        this.listener = serialListener;
    }

    public void setDevice(android.bluetooth.BluetoothDevice bluetoothDevice) {
        this.device = bluetoothDevice;
    }

    public void connect(com.oudmon.ble.base.bluetooth.spp.SerialListener serialListener) {
        this.listener = serialListener;
        java.util.concurrent.Executors.newSingleThreadExecutor().submit(this);
    }

    public void connect() {
        java.util.concurrent.Executors.newSingleThreadExecutor().submit(this);
    }

    public boolean isConnected() {
        android.bluetooth.BluetoothSocket bluetoothSocket = this.socket;
        if (bluetoothSocket == null) {
            return false;
        }
        return bluetoothSocket.isConnected();
    }

    public void disconnect() {
        try {
            this.listener = null;
            android.bluetooth.BluetoothSocket bluetoothSocket = this.socket;
            if (bluetoothSocket != null) {
                try {
                    bluetoothSocket.close();
                } catch (java.lang.Exception unused) {
                }
                this.socket = null;
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void write(byte[] bArr) {
        try {
            android.bluetooth.BluetoothSocket bluetoothSocket = this.socket;
            if (bluetoothSocket == null) {
                com.oudmon.ble.base.bluetooth.spp.SerialListener serialListener = this.listener;
                if (serialListener != null) {
                    serialListener.onSerialConnect();
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "spp 断开了");
                return;
            }
            bluetoothSocket.getOutputStream().write(bArr);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.socket.getOutputStream().write(bArr, i, i2);
        } catch (java.io.IOException e) {
            com.oudmon.ble.base.bluetooth.spp.SerialListener serialListener = this.listener;
            if (serialListener != null) {
                serialListener.onSerialIoError(e);
            }
            e.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            android.bluetooth.BluetoothSocket createRfcommSocketToServiceRecord = this.device.createRfcommSocketToServiceRecord(BLUETOOTH_SPP_JieLi);
            this.socket = createRfcommSocketToServiceRecord;
            createRfcommSocketToServiceRecord.connect();
            com.oudmon.ble.base.bluetooth.spp.SerialListener serialListener = this.listener;
            if (serialListener != null) {
                serialListener.onSerialConnect();
            }
            try {
                byte[] bArr = new byte[com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2];
                while (true) {
                    byte[] copyOf = java.util.Arrays.copyOf(bArr, this.socket.getInputStream().read(bArr));
                    com.oudmon.ble.base.bluetooth.spp.SerialListener serialListener2 = this.listener;
                    if (serialListener2 != null && copyOf.length > 0) {
                        serialListener2.onSerialRead(copyOf);
                    }
                }
            } catch (java.lang.Exception e) {
                com.oudmon.ble.base.bluetooth.spp.SerialListener serialListener3 = this.listener;
                if (serialListener3 != null) {
                    serialListener3.onSerialIoError(e);
                }
                try {
                    this.socket.close();
                } catch (java.lang.Exception unused) {
                }
                this.socket = null;
            }
        } catch (java.lang.Exception e2) {
            com.oudmon.ble.base.bluetooth.spp.SerialListener serialListener4 = this.listener;
            if (serialListener4 != null) {
                serialListener4.onSerialConnectError(e2);
            }
            try {
                this.socket.close();
            } catch (java.lang.Exception unused2) {
            }
            this.socket = null;
        }
    }
}
