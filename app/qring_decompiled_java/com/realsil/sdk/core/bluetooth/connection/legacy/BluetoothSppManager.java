package com.realsil.sdk.core.bluetooth.connection.legacy;

/* loaded from: classes3.dex */
public final class BluetoothSppManager {
    public static java.util.UUID UUID_SECURE = java.util.UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    public static volatile com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager f;
    public com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp b;
    public volatile boolean c;
    public final java.lang.Object d = new java.lang.Object();
    public com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager.a e = new com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager.a();
    public java.util.List<com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback> a = new java.util.concurrent.CopyOnWriteArrayList();

    public class a extends com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        @Override // com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback
        public final void onConnectionStateChanged(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp, boolean z, int i) {
            super.onConnectionStateChanged(bluetoothSpp, z, i);
            synchronized (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager.this.a) {
                ?? r1 = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager.this.a;
                if (r1 != 0 && r1.size() > 0) {
                    java.util.Iterator it = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager.this.a.iterator();
                    while (it.hasNext()) {
                        ((com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback) it.next()).onConnectionStateChanged(bluetoothSpp, z, i);
                    }
                }
            }
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        @Override // com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback
        public final void onDataReceive(byte[] bArr) {
            super.onDataReceive(bArr);
            synchronized (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager.this.a) {
                ?? r1 = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager.this.a;
                if (r1 != 0 && r1.size() > 0) {
                    java.util.Iterator it = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager.this.a.iterator();
                    while (it.hasNext()) {
                        ((com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback) it.next()).onDataReceive(bArr);
                    }
                }
            }
        }
    }

    public static com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager getInstance() {
        return f;
    }

    public static synchronized void initialize() {
        synchronized (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager.class) {
            if (f == null) {
                synchronized (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager.class) {
                    if (f == null) {
                        f = new com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager();
                    }
                }
            }
        }
    }

    public final com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp a() {
        if (this.b == null) {
            this.b = new com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp(UUID_SECURE, this.e);
        }
        return this.b;
    }

    public synchronized boolean connect(android.bluetooth.BluetoothDevice bluetoothDevice, android.bluetooth.BluetoothSocket bluetoothSocket, com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback bluetoothSppCallback) {
        register(bluetoothSppCallback);
        if (getConnectionState() == 512) {
            android.bluetooth.BluetoothDevice device = a().getDevice();
            if (device != null && device.equals(bluetoothDevice)) {
                bluetoothSppCallback.onConnectionStateChanged(a(), true, 512);
                return true;
            }
            com.realsil.sdk.core.logger.ZLogger.d("current connected device is conflict with the connecting device");
        }
        boolean connect = a().connect(new com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters.Builder(bluetoothDevice).bluetoothSocket(bluetoothSocket).build());
        if (!connect) {
            unregister(bluetoothSppCallback);
        }
        return connect;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public void destroy() {
        synchronized (this.a) {
            ?? r1 = this.a;
            if (r1 != 0) {
                r1.clear();
            }
        }
        disconnect();
    }

    public void disconnect() {
        a().stop();
    }

    public int getConnectionState() {
        return a().getConnectionState();
    }

    public void notifyAck() {
        synchronized (this.d) {
            this.c = true;
            this.d.notifyAll();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public void register(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback bluetoothSppCallback) {
        synchronized (this.a) {
            if (this.a == null) {
                this.a = new java.util.concurrent.CopyOnWriteArrayList();
            }
            if (!this.a.contains(bluetoothSppCallback)) {
                this.a.add(bluetoothSppCallback);
            }
            com.realsil.sdk.core.logger.ZLogger.v("callback's size=" + this.a.size());
        }
    }

    public synchronized boolean sendPacket(byte[] bArr, boolean z) {
        if (bArr == null) {
            return false;
        }
        if (!z) {
            this.c = false;
        }
        if (!a().write(bArr)) {
            com.realsil.sdk.core.logger.ZLogger.w("send spp data failed");
            return false;
        }
        if (z) {
            return true;
        }
        synchronized (this.d) {
            if (this.c) {
                return true;
            }
            try {
                this.d.wait(5000L);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
            return this.c;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public void unregister(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback bluetoothSppCallback) {
        synchronized (this.a) {
            ?? r1 = this.a;
            if (r1 != 0) {
                r1.remove(bluetoothSppCallback);
            }
        }
    }

    public boolean write(byte[] bArr) {
        return a().write(bArr);
    }

    public synchronized boolean connect(android.bluetooth.BluetoothDevice bluetoothDevice, com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback bluetoothSppCallback) {
        register(bluetoothSppCallback);
        if (getConnectionState() == 512) {
            android.bluetooth.BluetoothDevice device = a().getDevice();
            if (device != null && device.equals(bluetoothDevice)) {
                com.realsil.sdk.core.logger.ZLogger.d("connection already connected");
                bluetoothSppCallback.onConnectionStateChanged(a(), true, 512);
                return true;
            }
            com.realsil.sdk.core.logger.ZLogger.d("current connected device is conflict with the connecting device");
        }
        boolean connect = a().connect(new com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters.Builder(bluetoothDevice).build());
        if (!connect) {
            unregister(bluetoothSppCallback);
        }
        return connect;
    }
}
