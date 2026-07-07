package com.realsil.sdk.bbpro.e;

/* loaded from: /tmp/dex/classes2.dex */
public class a extends java.lang.Thread {
    public static final java.util.UUID g = java.util.UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    public android.content.Context a;
    public android.bluetooth.BluetoothAdapter b;
    public android.bluetooth.BluetoothServerSocket c = null;
    public android.bluetooth.BluetoothSocket d = null;
    public com.realsil.sdk.bbpro.e.b e;
    public java.util.UUID f;

    public a(android.content.Context context, java.util.UUID uuid, com.realsil.sdk.bbpro.e.b bVar) {
        this.a = context;
        this.f = uuid;
        this.e = bVar;
    }

    public void a() {
        com.realsil.sdk.core.logger.ZLogger.d("_stop");
        android.bluetooth.BluetoothServerSocket bluetoothServerSocket = this.c;
        if (bluetoothServerSocket != null) {
            try {
                bluetoothServerSocket.close();
            } catch (java.io.IOException e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            }
        }
        android.bluetooth.BluetoothSocket bluetoothSocket = this.d;
        if (bluetoothSocket != null) {
            try {
                bluetoothSocket.close();
            } catch (java.io.IOException e2) {
                com.realsil.sdk.core.logger.ZLogger.w(e2.toString());
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (android.os.Build.VERSION.SDK_INT > 17) {
            android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) this.a.getSystemService("bluetooth");
            if (bluetoothManager != null) {
                this.b = bluetoothManager.getAdapter();
            }
        } else {
            this.b = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        }
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.b;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            com.realsil.sdk.bbpro.e.b bVar = this.e;
            if (bVar != null) {
                bVar.a(null, false, null);
                return;
            }
            return;
        }
        com.realsil.sdk.core.logger.ZLogger.d("SppServerThread running...");
        try {
            this.c = this.b.listenUsingRfcommWithServiceRecord("Serial Port Protocol", g);
            for (int i = 0; i < 10 && this.c == null; i++) {
                try {
                    java.lang.Thread.sleep(500L);
                } catch (java.lang.InterruptedException e) {
                    com.realsil.sdk.core.logger.ZLogger.w(e.toString());
                }
            }
            if (this.c == null) {
                com.realsil.sdk.core.logger.ZLogger.d("get BluetoothServerSocket fail");
                com.realsil.sdk.bbpro.e.b bVar2 = this.e;
                if (bVar2 != null) {
                    bVar2.a(null, false, null);
                }
            } else {
                com.realsil.sdk.core.logger.ZLogger.d("2. get BluetoothServerSocket success");
                try {
                    android.bluetooth.BluetoothSocket accept = this.c.accept();
                    this.d = accept;
                    if (accept != null) {
                        com.realsil.sdk.core.logger.ZLogger.d("accept new btsocket");
                        android.bluetooth.BluetoothDevice remoteDevice = this.d.getRemoteDevice();
                        if (remoteDevice != null) {
                            com.realsil.sdk.core.logger.ZLogger.d("client socket connected: name=" + remoteDevice.getName() + ", addr=" + com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(remoteDevice.getAddress(), true));
                            com.realsil.sdk.bbpro.e.b bVar3 = this.e;
                            if (bVar3 != null) {
                                bVar3.a(remoteDevice, true, this.d);
                            }
                        } else {
                            com.realsil.sdk.core.logger.ZLogger.w("btsocket have no remote device");
                        }
                    } else {
                        com.realsil.sdk.core.logger.ZLogger.w("btsocket is null");
                    }
                    this.c.close();
                } catch (java.io.IOException e2) {
                    com.realsil.sdk.core.logger.ZLogger.w(e2.getMessage());
                    com.realsil.sdk.bbpro.e.b bVar4 = this.e;
                    if (bVar4 != null) {
                        bVar4.a(null, false, this.d);
                    }
                }
            }
            com.realsil.sdk.core.logger.ZLogger.d("SppServerThread stopped");
        } catch (java.io.IOException e3) {
            com.realsil.sdk.core.logger.ZLogger.w(e3.getMessage());
            com.realsil.sdk.bbpro.e.b bVar5 = this.e;
            if (bVar5 != null) {
                bVar5.a(null, false, null);
            }
        }
    }
}
