package com.realsil.sdk.core.bluetooth.connection.legacy;

/* loaded from: classes3.dex */
public final class BluetoothSpp {
    public static final int ROLE_CLIENT = 1;
    public static final int ROLE_SERVER = 2;
    public static final int STATE_CONNECTED = 512;
    public static final int STATE_CONNECTING = 256;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_DISCONNECTING = 768;
    public static final int STATE_LISTEN = 257;
    public static final int STATE_NONE = 0;
    public static final java.util.UUID p = java.util.UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    public boolean a;
    public boolean b;
    public android.bluetooth.BluetoothAdapter c;
    public volatile int d;
    public android.bluetooth.BluetoothDevice e;
    public boolean f;
    public com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters g;
    public int h;
    public java.util.UUID i;
    public boolean initialized;
    public com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.b j;
    public com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.c k;
    public com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.a l;
    public int m;
    public com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback mCallback;
    public final java.lang.Object n;
    public java.lang.Boolean o;

    public BluetoothSpp(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback bluetoothSppCallback) {
        this(1, p, bluetoothSppCallback);
    }

    public static boolean c(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp) {
        return bluetoothSpp.d == 256;
    }

    public final void b() {
        com.realsil.sdk.core.logger.ZLogger.v(this.a, "initialize...");
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        this.c = defaultAdapter;
        if (defaultAdapter == null) {
            com.realsil.sdk.core.logger.ZLogger.d("bluetoothAdapter not initialized ");
            this.initialized = false;
        } else if (defaultAdapter.isEnabled()) {
            this.initialized = true;
        } else {
            com.realsil.sdk.core.logger.ZLogger.d("bluetooth is disabled");
            this.initialized = false;
        }
    }

    public synchronized boolean connect(com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters sppConnParameters) {
        if (sppConnParameters == null) {
            com.realsil.sdk.core.logger.ZLogger.v("connParameters can not be null or empty");
            return false;
        }
        if (sppConnParameters.getBluetoothDevice() == null) {
            com.realsil.sdk.core.logger.ZLogger.v("device can not be null or empty");
            return false;
        }
        android.bluetooth.BluetoothDevice bluetoothDevice = this.e;
        if (bluetoothDevice != null) {
            if (bluetoothDevice.equals(sppConnParameters.getBluetoothDevice())) {
                if (this.d == 512) {
                    com.realsil.sdk.core.logger.ZLogger.v(this.a, "device already connected");
                    a(512);
                    return true;
                }
                if (this.d == 256) {
                    com.realsil.sdk.core.logger.ZLogger.v(this.a, "device is already at connecting state");
                    a(256);
                    return true;
                }
            } else {
                if (this.d == 512) {
                    com.realsil.sdk.core.logger.ZLogger.v(this.a, "other device already connected");
                    a();
                    return false;
                }
                if (this.d == 256) {
                    com.realsil.sdk.core.logger.ZLogger.v(this.a, "other device is at connecting state");
                    a();
                    return false;
                }
            }
        }
        this.f = true;
        return a(sppConnParameters);
    }

    public synchronized void connected(android.bluetooth.BluetoothSocket bluetoothSocket, android.bluetooth.BluetoothDevice bluetoothDevice) {
        com.realsil.sdk.core.logger.ZLogger.v(this.a, "spp connected");
        this.e = bluetoothDevice;
        a();
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
            this.l = null;
        }
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.c cVar = new com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.c(bluetoothSocket);
        this.k = cVar;
        cVar.start();
    }

    public synchronized void destroy() {
        com.realsil.sdk.core.logger.ZLogger.v(this.b, "destroy");
        this.mCallback = null;
        stop();
    }

    public int getConnectionState() {
        return this.d;
    }

    public android.bluetooth.BluetoothDevice getDevice() {
        return this.e;
    }

    public boolean isConnected(android.bluetooth.BluetoothDevice bluetoothDevice) {
        android.bluetooth.BluetoothDevice bluetoothDevice2 = this.e;
        return bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice) && this.d == 512;
    }

    public synchronized void start(boolean z) {
        com.realsil.sdk.core.logger.ZLogger.v(this.a, "start secure: " + z);
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.b bVar = this.j;
        if (bVar != null) {
            bVar.a();
            this.j.interrupt();
            this.j = null;
        }
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.c cVar = this.k;
        if (cVar != null) {
            cVar.a();
            this.k.interrupt();
            this.k = null;
        }
        if ((this.h & 2) == 2 && this.l == null) {
            com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.a aVar = new com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.a(z);
            this.l = aVar;
            aVar.start();
        }
    }

    public synchronized void stop() {
        com.realsil.sdk.core.logger.ZLogger.v(this.b, "stop");
        if (this.d == 512) {
            a(STATE_DISCONNECTING);
        }
        this.e = null;
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.b bVar = this.j;
        if (bVar != null) {
            bVar.a();
            this.j.interrupt();
            this.j = null;
        }
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.c cVar = this.k;
        if (cVar != null) {
            cVar.a();
            this.k.interrupt();
            this.k = null;
        }
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
            this.l.interrupt();
            this.l = null;
        }
        synchronized (this.n) {
            this.o = java.lang.Boolean.FALSE;
        }
    }

    public boolean write(byte[] bArr) {
        return write(bArr, true);
    }

    public BluetoothSpp(java.util.UUID uuid, com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback bluetoothSppCallback) {
        this(1, uuid, bluetoothSppCallback);
    }

    public final void a() {
        com.realsil.sdk.core.logger.ZLogger.v(this.a, "cancelPreviousConnection");
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.b bVar = this.j;
        if (bVar != null) {
            bVar.a();
            this.j.interrupt();
            this.j = null;
        }
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.c cVar = this.k;
        if (cVar != null) {
            cVar.a();
            this.k.interrupt();
            this.k = null;
        }
    }

    public boolean write(byte[] bArr, boolean z) {
        synchronized (this) {
            if (this.d != 512) {
                com.realsil.sdk.core.logger.ZLogger.d(this.a, "not connected");
                return false;
            }
            com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.c cVar = this.k;
            if (cVar == null) {
                com.realsil.sdk.core.logger.ZLogger.d("ConnectedThread not created");
                return false;
            }
            if (cVar.c == null) {
                return false;
            }
            try {
                if (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.a) {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "<< (%d) %s", java.lang.Integer.valueOf(bArr.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(bArr)));
                }
                cVar.c.write(bArr);
                if (z) {
                    cVar.c.flush();
                }
                return true;
            } catch (java.io.IOException e) {
                com.realsil.sdk.core.logger.ZLogger.w("Exception during write： " + e);
                return false;
            }
        }
    }

    public BluetoothSpp(int i, java.util.UUID uuid, com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback bluetoothSppCallback) {
        this.a = false;
        this.b = false;
        this.d = 0;
        this.e = null;
        this.f = false;
        this.m = -1;
        this.n = new java.lang.Object();
        this.o = java.lang.Boolean.FALSE;
        this.h = i;
        this.i = uuid;
        this.mCallback = bluetoothSppCallback;
        this.d = 0;
        this.a = com.realsil.sdk.core.RtkCore.DEBUG;
        this.b = com.realsil.sdk.core.RtkCore.VDBG;
        b();
    }

    public class c extends java.lang.Thread {
        public final android.bluetooth.BluetoothSocket a;
        public java.io.BufferedInputStream b;
        public java.io.BufferedOutputStream c;

        public c(android.bluetooth.BluetoothSocket bluetoothSocket) {
            java.io.BufferedInputStream bufferedInputStream;
            java.io.BufferedOutputStream bufferedOutputStream = null;
            this.b = null;
            this.c = null;
            com.realsil.sdk.core.logger.ZLogger.d("create ConnectedThread");
            this.a = bluetoothSocket;
            try {
                bufferedInputStream = new java.io.BufferedInputStream(bluetoothSocket.getInputStream());
            } catch (java.io.IOException e) {
                e = e;
                bufferedInputStream = null;
            }
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(bluetoothSocket.getOutputStream());
            } catch (java.io.IOException e2) {
                e = e2;
                com.realsil.sdk.core.logger.ZLogger.w("temp sockets not created: " + e);
                this.b = bufferedInputStream;
                this.c = bufferedOutputStream;
            }
            this.b = bufferedInputStream;
            this.c = bufferedOutputStream;
        }

        public final void a() {
            android.bluetooth.BluetoothSocket bluetoothSocket = this.a;
            if (bluetoothSocket == null) {
                return;
            }
            try {
                bluetoothSocket.close();
            } catch (java.io.IOException e) {
                com.realsil.sdk.core.logger.ZLogger.w("close socket failed: " + e);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            byte[] bArr = new byte[1024];
            com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this;
            android.bluetooth.BluetoothDevice bluetoothDevice = bluetoothSpp.e;
            bluetoothSpp.a(512);
            synchronized (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.n) {
                com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.o = java.lang.Boolean.FALSE;
            }
            while (!java.lang.Thread.currentThread().isInterrupted() && com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.d == 512) {
                try {
                    int read = this.b.read(bArr);
                    if (read > 0) {
                        byte[] bArr2 = new byte[read];
                        java.lang.System.arraycopy(bArr, 0, bArr2, 0, read);
                        if (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.a) {
                            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, ">> (%d) %s", java.lang.Integer.valueOf(read), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(bArr2)));
                        }
                        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback bluetoothSppCallback = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.mCallback;
                        if (bluetoothSppCallback != null) {
                            bluetoothSppCallback.onDataReceive(bArr2);
                        }
                    }
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("connectionLost: ");
                    a.append(e.toString());
                    com.realsil.sdk.core.logger.ZLogger.w(a.toString());
                    com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.a(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this);
                }
            }
            if (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.d == 768) {
                a();
                com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.a(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this);
            }
        }
    }

    public boolean isConnected() {
        return this.e != null && this.d == 512;
    }

    public final boolean a(com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters sppConnParameters) {
        synchronized (this.n) {
            if (this.o.booleanValue()) {
                com.realsil.sdk.core.logger.ZLogger.w("device is busy");
                return false;
            }
            this.o = java.lang.Boolean.TRUE;
            if (!this.initialized) {
                b();
            }
            boolean z = this.a;
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("createNewConnection:");
            a2.append(sppConnParameters.toString());
            com.realsil.sdk.core.logger.ZLogger.v(z, a2.toString());
            this.g = sppConnParameters;
            this.e = sppConnParameters.getBluetoothDevice();
            this.i = sppConnParameters.getUuid();
            if (sppConnParameters.getBluetoothSocket() != null) {
                connected(sppConnParameters.getBluetoothSocket(), sppConnParameters.getBluetoothDevice());
                return true;
            }
            a();
            com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.b bVar = new com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.b(this.e);
            this.j = bVar;
            bVar.start();
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r0 == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp r7) {
        /*
            boolean r0 = r7.f
            r1 = 0
            r2 = 0
            if (r0 == 0) goto La9
            r7.f = r2
            android.bluetooth.BluetoothDevice r0 = r7.e
            r3 = 1
            if (r0 != 0) goto L16
            boolean r0 = r7.b
            java.lang.String r3 = "mDevice == null"
            com.realsil.sdk.core.logger.ZLogger.v(r0, r3)
        L14:
            r3 = 0
            goto L70
        L16:
            int r0 = r7.d
            r4 = 256(0x100, float:3.59E-43)
            if (r0 == r4) goto L32
            boolean r0 = r7.b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r7.d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            java.lang.String r4 = "mConnState=0x%04X"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            com.realsil.sdk.core.logger.ZLogger.v(r0, r3)
            goto L14
        L32:
            android.bluetooth.BluetoothDevice r0 = r7.e
            int r0 = r0.getBondState()
            boolean r4 = r7.b
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5[r2] = r6
            java.lang.String r6 = "bondState=0x%02X"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            com.realsil.sdk.core.logger.ZLogger.v(r4, r5)
            r4 = 12
            if (r0 == r4) goto L50
            goto L14
        L50:
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r0 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            android.bluetooth.BluetoothDevice r4 = r7.e
            int r0 = r0.getConnectionState(r3, r4)
            boolean r4 = r7.b
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5[r2] = r6
            java.lang.String r6 = "hfpState=0x%02X"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            com.realsil.sdk.core.logger.ZLogger.v(r4, r5)
            r4 = 2
            if (r0 != r4) goto L14
        L70:
            if (r3 == 0) goto La9
            r7.f = r2
            java.lang.Object r0 = r7.n
            monitor-enter(r0)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> La6
            r7.o = r3     // Catch: java.lang.Throwable -> La6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            r7.d = r2
            boolean r0 = r7.b
            java.lang.String r4 = "processAbnormalDisconnection .."
            com.realsil.sdk.core.logger.ZLogger.v(r0, r4)
            com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters r0 = r7.g
            boolean r0 = r7.a(r0)
            if (r0 != 0) goto Lc0
            boolean r0 = r7.a
            java.lang.String r4 = "processAbnormalDisconnection failed"
            com.realsil.sdk.core.logger.ZLogger.v(r0, r4)
            r7.a(r2)
            r7.e = r1
            java.lang.Object r0 = r7.n
            monitor-enter(r0)
            r7.o = r3     // Catch: java.lang.Throwable -> La3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            r7.start()
            goto Lc0
        La3:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            throw r7
        La6:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r7
        La9:
            boolean r0 = r7.a
            java.lang.String r3 = "connectionFailed"
            com.realsil.sdk.core.logger.ZLogger.v(r0, r3)
            r7.a(r2)
            r7.e = r1
            java.lang.Object r0 = r7.n
            monitor-enter(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lc1
            r7.o = r1     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc1
            r7.start()
        Lc0:
            return
        Lc1:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.b(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp):void");
    }

    public synchronized void start() {
        start(true);
    }

    public static void a(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp) {
        com.realsil.sdk.core.logger.ZLogger.v(bluetoothSpp.a, "connectionLost");
        bluetoothSpp.a(0);
        bluetoothSpp.e = null;
        synchronized (bluetoothSpp.n) {
            bluetoothSpp.o = java.lang.Boolean.FALSE;
        }
        bluetoothSpp.start();
    }

    public final synchronized void a(int i) {
        if (i != this.d) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, ">> ConnectionState=0x%04X > 0x%04X", java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(i)));
        }
        this.d = i;
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback bluetoothSppCallback = this.mCallback;
        if (bluetoothSppCallback != null) {
            bluetoothSppCallback.onConnectionStateChanged(this, true, this.d);
        } else {
            com.realsil.sdk.core.logger.ZLogger.v(this.b, "no callback registered");
        }
    }

    public class a extends java.lang.Thread {
        public final android.bluetooth.BluetoothServerSocket a;

        public a(boolean z) {
            this.a = a(z);
            android.bluetooth.BluetoothDevice bluetoothDevice = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.e;
            com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.a(257);
        }

        public final android.bluetooth.BluetoothServerSocket a(boolean z) {
            android.bluetooth.BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord;
            try {
                if (z) {
                    com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this;
                    listenUsingInsecureRfcommWithServiceRecord = bluetoothSpp.c.listenUsingRfcommWithServiceRecord("RtkSppSecure", bluetoothSpp.i);
                } else {
                    com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp2 = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this;
                    listenUsingInsecureRfcommWithServiceRecord = bluetoothSpp2.c.listenUsingInsecureRfcommWithServiceRecord("RtkSppInsecure", bluetoothSpp2.i);
                }
                return listenUsingInsecureRfcommWithServiceRecord;
            } catch (java.io.IOException e) {
                java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("createServerSocket failed: ");
                a.append(e.toString());
                com.realsil.sdk.core.logger.ZLogger.d(a.toString());
                return null;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.a, "BEGIN mAcceptThread");
            setName("AcceptThread:BluetoothSpp");
            while (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.d != 512) {
                try {
                    android.bluetooth.BluetoothSocket accept = this.a.accept();
                    if (accept != null) {
                        synchronized (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this) {
                            int i = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.d;
                            if (i == 0 || i == 512) {
                                try {
                                    accept.close();
                                } catch (java.io.IOException e) {
                                    com.realsil.sdk.core.logger.ZLogger.w("Could not close unwanted socket： " + e);
                                }
                            } else if (i == 256 || i == 257) {
                                if (android.os.Build.VERSION.SDK_INT >= 23) {
                                    com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.m = accept.getConnectionType();
                                }
                                com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.connected(accept, accept.getRemoteDevice());
                            }
                        }
                    }
                } catch (java.io.IOException e2) {
                    com.realsil.sdk.core.logger.ZLogger.w("accept() failed" + e2);
                    com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this;
                    android.bluetooth.BluetoothDevice bluetoothDevice = bluetoothSpp.e;
                    bluetoothSpp.a(0);
                }
            }
            com.realsil.sdk.core.logger.ZLogger.d(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.a, "END AcceptThread");
        }

        public final void a() {
            try {
                if (this.a != null) {
                    com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.a, "cancel AcceptThread");
                    this.a.close();
                }
            } catch (java.io.IOException e) {
                com.realsil.sdk.core.logger.ZLogger.w("close() of server failed： " + e);
            }
        }
    }

    public class b extends java.lang.Thread {
        public android.bluetooth.BluetoothSocket a;
        public final android.bluetooth.BluetoothDevice b;

        public b(android.bluetooth.BluetoothDevice bluetoothDevice) {
            this.b = bluetoothDevice;
            this.a = a(bluetoothDevice, true);
        }

        public final android.bluetooth.BluetoothSocket a(android.bluetooth.BluetoothDevice bluetoothDevice, boolean z) {
            android.bluetooth.BluetoothSocket bluetoothSocket;
            boolean z2 = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.b;
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("mSecureUuid=");
            a.append(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.i);
            com.realsil.sdk.core.logger.ZLogger.v(z2, a.toString());
            try {
                bluetoothSocket = z ? bluetoothDevice.createRfcommSocketToServiceRecord(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.i) : bluetoothDevice.createInsecureRfcommSocketToServiceRecord(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.i);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("createBluetoothSocket failed: ");
                a2.append(e.toString());
                com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
                bluetoothSocket = null;
            }
            if (bluetoothSocket != null && android.os.Build.VERSION.SDK_INT >= 23) {
                com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.m = bluetoothSocket.getConnectionType();
            }
            return bluetoothSocket;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp;
            setName("ConnectThread:BluetoothSpp");
            if (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.b) {
                java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("SocketConnectionType: ");
                a.append(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.m);
                com.realsil.sdk.core.logger.ZLogger.v(a.toString());
            }
            android.bluetooth.BluetoothAdapter bluetoothAdapter = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.c;
            if (bluetoothAdapter != null) {
                bluetoothAdapter.cancelDiscovery();
            }
            android.bluetooth.BluetoothSocket bluetoothSocket = this.a;
            if (bluetoothSocket == null) {
                com.realsil.sdk.core.logger.ZLogger.w("create BluetoothSocket fail");
                com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp2 = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this;
                android.bluetooth.BluetoothDevice bluetoothDevice = bluetoothSpp2.e;
                bluetoothSpp2.a(0);
                synchronized (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.n) {
                    com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.o = java.lang.Boolean.FALSE;
                }
                return;
            }
            if (bluetoothSocket.isConnected()) {
                com.realsil.sdk.core.logger.ZLogger.d(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.a, "socket already connected");
            } else {
                if (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.c(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this)) {
                    com.realsil.sdk.core.logger.ZLogger.i("is already in connecting, ignore connect req, and wait connect result");
                    return;
                }
                com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp3 = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this;
                android.bluetooth.BluetoothDevice bluetoothDevice2 = bluetoothSpp3.e;
                bluetoothSpp3.a(256);
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.b, "connect socket ...");
                try {
                    this.a.connect();
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("connect socket failed, ");
                    a2.append(e.toString());
                    com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
                    try {
                        this.a.close();
                    } catch (java.io.IOException e2) {
                        com.realsil.sdk.core.logger.ZLogger.w("unable to close socket during connection failure: " + e2);
                    }
                    try {
                        java.lang.Thread.sleep(1000L);
                    } catch (java.lang.InterruptedException e3) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.b, e3.toString());
                    }
                    if (!"Connect refused".equals(e.getMessage())) {
                        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.b(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this);
                        return;
                    }
                    if (this.b.getBondState() == 12) {
                        this.a = a(this.b, false);
                    }
                    android.bluetooth.BluetoothSocket bluetoothSocket2 = this.a;
                    if (bluetoothSocket2 == null) {
                        com.realsil.sdk.core.logger.ZLogger.d("create Insecure BluetoothSocket fail");
                        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp4 = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this;
                        android.bluetooth.BluetoothDevice bluetoothDevice3 = bluetoothSpp4.e;
                        bluetoothSpp4.a(0);
                        synchronized (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.n) {
                            com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.o = java.lang.Boolean.FALSE;
                            return;
                        }
                    }
                    if (bluetoothSocket2.isConnected()) {
                        com.realsil.sdk.core.logger.ZLogger.d("socket already connected");
                        return;
                    }
                    com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp5 = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this;
                    android.bluetooth.BluetoothDevice bluetoothDevice4 = bluetoothSpp5.e;
                    bluetoothSpp5.a(256);
                    com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.b, "refused, connect socket ...");
                    try {
                        this.a.connect();
                        return;
                    } catch (java.lang.Exception e4) {
                        java.lang.StringBuilder a3 = com.realsil.sdk.core.a.a.a("connect socket failed, ");
                        a3.append(e4.toString());
                        com.realsil.sdk.core.logger.ZLogger.d(a3.toString());
                        try {
                            this.a.close();
                        } catch (java.io.IOException e5) {
                            com.realsil.sdk.core.logger.ZLogger.w("unable to close socket during connection failure: " + e5);
                        }
                        try {
                            java.lang.Thread.sleep(1000L);
                        } catch (java.lang.InterruptedException e6) {
                            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this.b, e6.toString());
                        }
                        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.b(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this);
                        return;
                    }
                }
            }
            synchronized (com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this) {
                bluetoothSpp = com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.this;
                bluetoothSpp.j = null;
            }
            bluetoothSpp.connected(this.a, this.b);
        }

        public final void a() {
            try {
                android.bluetooth.BluetoothSocket bluetoothSocket = this.a;
                if (bluetoothSocket != null) {
                    bluetoothSocket.close();
                }
            } catch (java.io.IOException e) {
                com.realsil.sdk.core.logger.ZLogger.w("close socket failed: " + e);
            }
        }
    }
}
