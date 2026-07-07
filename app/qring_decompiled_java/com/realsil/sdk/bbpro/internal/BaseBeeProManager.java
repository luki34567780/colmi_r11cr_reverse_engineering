package com.realsil.sdk.bbpro.internal;

/* loaded from: /tmp/dex/classes2.dex */
public class BaseBeeProManager {
    public static boolean D = true;
    public static boolean E = false;
    public static com.realsil.sdk.bbpro.BeeProParams F = null;
    public static final int STATE_DATA_PREPARED = 264;
    public static final int STATE_DATA_SYNC_FAILED = 265;
    public static final int STATE_DATA_SYNC_MASK = 512;
    public static final int STATE_DATA_SYNC_PROCESSING = 513;
    public static final int STATE_DEVICE_CONNECTED = 263;
    public static final int STATE_DEVICE_CONNECTING = 261;
    public static final int STATE_DEVICE_DISCONNECTED = 260;
    public static final int STATE_DEVICE_DISCONNECTING = 262;
    public static final int STATE_IDLE_MASK = 256;
    public static final int STATE_INIT = 257;
    public final java.lang.Object A;
    public final java.lang.Object B;
    public com.realsil.sdk.bbpro.internal.BaseBeeProManager.i C;
    public android.bluetooth.BluetoothAdapter a;
    public com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer e;
    public volatile boolean g;
    public boolean j;
    public java.util.concurrent.ThreadPoolExecutor l;
    public android.content.Context mContext;
    public java.lang.Object n;
    public com.realsil.sdk.bbpro.vendor.VendorModelClient q;
    public final com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback s;
    public final com.realsil.sdk.core.bluetooth.BluetoothProfileCallback t;
    public com.realsil.sdk.bbpro.vendor.VendorModelCallback u;
    public com.realsil.sdk.bbpro.internal.BaseBeeProManager.j v;
    public boolean w;
    public com.realsil.sdk.bbpro.e.b x;
    public final java.lang.Object y;
    public final java.lang.Object z;
    public boolean b = false;
    public android.bluetooth.BluetoothDevice c = null;
    public android.bluetooth.BluetoothDevice d = null;
    public com.realsil.sdk.bbpro.e.a f = null;
    public int h = 0;
    public int i = 0;
    public int k = 257;
    public final com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback m = new com.realsil.sdk.bbpro.internal.BaseBeeProManager.a();
    public boolean o = false;
    public java.util.List<com.realsil.sdk.bbpro.BumblebeeCallback> p = new java.util.concurrent.CopyOnWriteArrayList();
    public boolean r = true;

    public class a extends com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback {
        public a() {
        }

        @Override // com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback
        public void onAckReceive(com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket) {
            super.onAckReceive(ackPacket);
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.processAckPacket(ackPacket);
        }

        @Override // com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback
        public void onConnectionStateChanged(android.bluetooth.BluetoothDevice bluetoothDevice, boolean z, int i) {
            super.onConnectionStateChanged(bluetoothDevice, z, i);
            if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.isDeviceChanged(bluetoothDevice)) {
                com.realsil.sdk.core.logger.ZLogger.d("device changed, just ignore here");
                return;
            }
            if (i == 512) {
                if (android.text.TextUtils.isEmpty(com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.getDeviceInfo().getBrEdrName())) {
                    com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.getDeviceInfo().setBrEdrName(bluetoothDevice.getName());
                }
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a(i);
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.b(bluetoothDevice);
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.getDeviceInfo().toString());
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.stopSppServerThread();
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.j = false;
                com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
                baseBeeProManager.a(baseBeeProManager.c, baseBeeProManager.h);
                return;
            }
            if (i != 0) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a(i);
                com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager2 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
                baseBeeProManager2.a(baseBeeProManager2.c, baseBeeProManager2.h);
                return;
            }
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.clearDeviceInfo();
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a(0);
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.b((android.bluetooth.BluetoothDevice) null);
            if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.e != null) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.e.unregister(com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.m);
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.e.disconnect();
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.e = null;
            }
            if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.j) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.j = false;
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.startConnect(bluetoothDevice);
            } else {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager3 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
                baseBeeProManager3.a(baseBeeProManager3.c, baseBeeProManager3.h);
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.startSppServerThread();
            }
        }

        @Override // com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback
        public void onDataReceive(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket transportLayerPacket) {
            super.onDataReceive(transportLayerPacket);
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.processEventPacket(transportLayerPacket);
        }
    }

    public class b extends com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback {
        public b() {
        }

        public void onBondStateChanged(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
            super.onBondStateChanged(bluetoothDevice, i);
            android.bluetooth.BluetoothDevice bluetoothDevice2 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.c;
            if (bluetoothDevice2 == null || !bluetoothDevice2.equals(bluetoothDevice)) {
                return;
            }
            int connectionState = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance().getConnectionState(2, com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.c);
            int bondState = bluetoothDevice.getBondState();
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "a2dpState=0x%02X, bondState=%d", java.lang.Integer.valueOf(connectionState), java.lang.Integer.valueOf(bondState)));
            if (bondState != 12) {
                if (bondState == 10) {
                    synchronized (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.y) {
                        if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.h == 256) {
                            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.y.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            synchronized (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.y) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.y.notifyAll();
            }
            if (!com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.r || connectionState == 2) {
                return;
            }
            com.realsil.sdk.core.logger.ZLogger.d("auto connect a2dp when paired");
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager.a(baseBeeProManager.c);
        }
    }

    public class c extends com.realsil.sdk.core.bluetooth.BluetoothProfileCallback {
        public c() {
        }

        public void onA2dpStateChanged(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
            super.onA2dpStateChanged(bluetoothDevice, i);
            if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.isDeviceChanged(bluetoothDevice)) {
                return;
            }
            if (i == 2) {
                synchronized (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.z) {
                    com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.z.notifyAll();
                }
            } else if (i == 0) {
                synchronized (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.z) {
                    com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.z.notifyAll();
                }
            }
        }

        public void onHfpConnectionStateChanged(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
            super.onHfpConnectionStateChanged(bluetoothDevice, i);
            if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.isDeviceChanged(bluetoothDevice)) {
                if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.E) {
                    com.realsil.sdk.core.logger.ZLogger.v("ignore inactive device's hfp conn state update");
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i == 0) {
                    synchronized (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.A) {
                        com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.A.notifyAll();
                    }
                    if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.getBeeProParams().c() && com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.isConnected()) {
                        com.realsil.sdk.core.logger.ZLogger.d(com.realsil.sdk.bbpro.internal.BaseBeeProManager.D, "auto disconect spp when hfp disconnected");
                        com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.disconnect();
                        return;
                    }
                    return;
                }
                return;
            }
            synchronized (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.A) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.A.notifyAll();
            }
            if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.getBeeProParams().e()) {
                if (!com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.isDisconnected()) {
                    if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.E) {
                        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("ignore when spp is not in disconnected state: 0x%04X", java.lang.Integer.valueOf(com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.getConnectState())));
                    }
                } else {
                    com.realsil.sdk.core.logger.ZLogger.d(com.realsil.sdk.bbpro.internal.BaseBeeProManager.D, "auto connect spp when hfp connected");
                    if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.E) {
                        java.util.Locale locale = java.util.Locale.US;
                        com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
                        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(locale, "processInfo: %d,%s", java.lang.Integer.valueOf(android.os.Process.myPid()), baseBeeProManager.a(baseBeeProManager.mContext, android.os.Process.myPid())));
                    }
                    com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.connect(bluetoothDevice);
                }
            }
        }
    }

    public class d extends com.realsil.sdk.bbpro.vendor.VendorModelCallback {
        public d() {
        }

        public void onDeviceInfoChanged(int i, com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo) {
            super.onDeviceInfoChanged(i, deviceInfo);
            if (i != 2 && i != 58) {
                switch (i) {
                }
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.notifyDeviceInfoChanged(deviceInfo, i);
            }
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.d();
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.notifyDeviceInfoChanged(deviceInfo, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onOperationComplete(int i, byte b) {
            super/*com.realsil.sdk.bbpro.internal.ModelClientCallback*/.onOperationComplete(i, b);
            if (i == 23) {
                if (b != 0) {
                    com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.d();
                }
                return;
            }
            if (i == 34) {
                if (b != 0) {
                    com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.d();
                    return;
                }
                return;
            }
            switch (i) {
                case 29:
                    if (b != 0) {
                        com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.d();
                        break;
                    }
                    break;
                case 30:
                    if (b != 0) {
                        com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.d();
                        break;
                    }
                    break;
                case 31:
                    if (b != 0) {
                        com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.d();
                        break;
                    }
                    break;
            }
        }
    }

    public class e extends com.realsil.sdk.bbpro.e.b {
        public e() {
        }

        @Override // com.realsil.sdk.bbpro.e.b
        public void a(android.bluetooth.BluetoothDevice bluetoothDevice, boolean z, android.bluetooth.BluetoothSocket bluetoothSocket) {
            if (!z) {
                if (bluetoothSocket != null) {
                    try {
                        bluetoothSocket.close();
                    } catch (java.io.IOException e) {
                        com.realsil.sdk.core.logger.ZLogger.w(e.getMessage());
                    }
                }
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.startSppServerThread();
                return;
            }
            if (bluetoothSocket != null && bluetoothDevice != null) {
                com.realsil.sdk.core.logger.ZLogger.d("auto connect as server");
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.startConnect(bluetoothDevice, bluetoothSocket);
            } else if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.D) {
                com.realsil.sdk.core.logger.ZLogger.v("something error");
            }
        }
    }

    public class f implements java.lang.Runnable {
        public final /* synthetic */ android.bluetooth.BluetoothDevice a;

        public f(android.bluetooth.BluetoothDevice bluetoothDevice) {
            this.a = bluetoothDevice;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.BaseBeeProManager.E, "connect a2dp");
            boolean connectA2dpSource = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance().connectA2dpSource(this.a.getAddress());
            com.realsil.sdk.core.logger.ZLogger.d(com.realsil.sdk.bbpro.internal.BaseBeeProManager.D, "connectA2dpSource:" + connectA2dpSource);
        }
    }

    public class g implements java.lang.Runnable {
        public final /* synthetic */ android.bluetooth.BluetoothDevice a;
        public final /* synthetic */ com.realsil.sdk.bbpro.ConnectionParameters b;

        public g(android.bluetooth.BluetoothDevice bluetoothDevice, com.realsil.sdk.bbpro.ConnectionParameters connectionParameters) {
            this.a = bluetoothDevice;
            this.b = connectionParameters;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.y) {
                    if (this.a.getBondState() != 12) {
                        com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.y.wait(15000L);
                    }
                }
            } catch (java.lang.InterruptedException e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.getMessage());
            }
            if (this.a.getBondState() != 12) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a(0);
                com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
                baseBeeProManager.a(baseBeeProManager.c, baseBeeProManager.h);
                return;
            }
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a();
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.b();
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a(256);
            if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.c().connect(this.a, null, this.b.d())) {
                return;
            }
            com.realsil.sdk.core.logger.ZLogger.w("connect failed");
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a(0);
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager2 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager2.a(baseBeeProManager2.c, baseBeeProManager2.h);
        }
    }

    public class h implements java.lang.Runnable {
        public final /* synthetic */ com.realsil.sdk.bbpro.ConnectionParameters a;

        public h(com.realsil.sdk.bbpro.ConnectionParameters connectionParameters) {
            this.a = connectionParameters;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.B) {
                    com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.B.wait(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
                }
            } catch (java.lang.InterruptedException e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.getMessage());
            }
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a(256);
            if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.c().connect(this.a.c())) {
                return;
            }
            com.realsil.sdk.core.logger.ZLogger.w("connect failed");
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a(0);
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager.a(baseBeeProManager.c, baseBeeProManager.h);
        }
    }

    public class i extends android.content.BroadcastReceiver {
        public i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if ("android.bluetooth.device.action.UUID".equals(intent.getAction())) {
                if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.isDeviceChanged((android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"))) {
                    return;
                }
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.BaseBeeProManager.D, "uuid update.");
                synchronized (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.B) {
                    com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.B.notifyAll();
                }
            }
        }

        public /* synthetic */ i(com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager, com.realsil.sdk.bbpro.internal.BaseBeeProManager.a aVar) {
            this();
        }
    }

    public class j extends java.lang.Thread {
        public j() {
        }

        public final boolean a() {
            if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.isConnected()) {
                return true;
            }
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a(260, false);
            com.realsil.sdk.core.logger.ZLogger.v("sync interrupted, because of connection disconnected");
            return false;
        }

        public final boolean b() {
            if (!a()) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.w = false;
                return false;
            }
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.BaseBeeProManager.E, ">> LOAD_BREDR_NAME");
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager.o = true;
            com.realsil.sdk.bbpro.core.BeeError reqDeviceName = baseBeeProManager.reqDeviceName((byte) 1);
            if (reqDeviceName.code == 0) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.h();
                return true;
            }
            com.realsil.sdk.core.logger.ZLogger.w("loadBredrName failed: " + reqDeviceName.message);
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager2 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager2.w = false;
            baseBeeProManager2.a(265, true);
            return false;
        }

        public final boolean c() {
            if (!a()) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.w = false;
                return false;
            }
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.BaseBeeProManager.E, ">> LOAD_CAPABILITY");
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager.o = true;
            com.realsil.sdk.bbpro.core.BeeError reqCapability = baseBeeProManager.reqCapability();
            if (reqCapability.code == 0) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.h();
                return true;
            }
            com.realsil.sdk.core.logger.ZLogger.d("loadCapability failed: " + reqCapability.message);
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager2 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager2.w = false;
            baseBeeProManager2.a(265, true);
            return false;
        }

        public final boolean d() {
            if (!a()) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.w = false;
                return false;
            }
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.BaseBeeProManager.E, ">> LOAD_CHIP_INFO");
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager.o = true;
            com.realsil.sdk.bbpro.core.BeeError reqPackageId = baseBeeProManager.reqPackageId();
            if (reqPackageId.code == 0) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.h();
                return true;
            }
            com.realsil.sdk.core.logger.ZLogger.w("reqPackageId failed: " + reqPackageId.message);
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager2 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager2.w = false;
            baseBeeProManager2.a(265, true);
            return false;
        }

        public final boolean e() {
            if (!a()) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.w = false;
                return false;
            }
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.BaseBeeProManager.E, ">> LOAD_CMD_SET_VERSION");
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager.o = true;
            com.realsil.sdk.bbpro.core.BeeError reqCmdSetVersion = baseBeeProManager.reqCmdSetVersion();
            if (reqCmdSetVersion.code == 0) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.h();
                return true;
            }
            com.realsil.sdk.core.logger.ZLogger.w("loadCmdSetVersion failed: " + reqCmdSetVersion.message);
            com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager2 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
            baseBeeProManager2.w = false;
            baseBeeProManager2.a(265, true);
            return false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.a(513, true);
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.w = true;
            if (d() && e() && c() && b()) {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.BaseBeeProManager.E, ">> no more data to sync");
                com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = com.realsil.sdk.bbpro.internal.BaseBeeProManager.this;
                baseBeeProManager.w = false;
                baseBeeProManager.a(264, true);
                if (com.realsil.sdk.bbpro.internal.BaseBeeProManager.D) {
                    com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.BaseBeeProManager.this.getDeviceInfo().toString());
                }
            }
        }

        public /* synthetic */ j(com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager, com.realsil.sdk.bbpro.internal.BaseBeeProManager.a aVar) {
            this();
        }
    }

    public BaseBeeProManager(android.content.Context context) {
        this.g = false;
        this.n = new java.lang.Object();
        com.realsil.sdk.bbpro.internal.BaseBeeProManager.b bVar = new com.realsil.sdk.bbpro.internal.BaseBeeProManager.b();
        this.s = bVar;
        com.realsil.sdk.bbpro.internal.BaseBeeProManager.c cVar = new com.realsil.sdk.bbpro.internal.BaseBeeProManager.c();
        this.t = cVar;
        this.u = new com.realsil.sdk.bbpro.internal.BaseBeeProManager.d();
        this.w = false;
        this.x = new com.realsil.sdk.bbpro.internal.BaseBeeProManager.e();
        this.y = new java.lang.Object();
        this.z = new java.lang.Object();
        this.A = new java.lang.Object();
        this.B = new java.lang.Object();
        com.realsil.sdk.core.logger.ZLogger.v(D, "create BaseBeeProManager");
        this.mContext = context;
        this.a = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        this.n = new java.lang.Object();
        D = com.realsil.sdk.core.RtkCore.DEBUG;
        E = com.realsil.sdk.core.RtkCore.VDBG;
        com.realsil.sdk.bbpro.RtkBbpro.initialize(context);
        if (com.realsil.sdk.core.bluetooth.RtkBluetoothManager.getInstance() == null) {
            com.realsil.sdk.core.bluetooth.RtkBluetoothManager.initial(context);
        }
        if (com.realsil.sdk.core.bluetooth.RtkBluetoothManager.getInstance() != null) {
            if (this.b) {
                com.realsil.sdk.core.logger.ZLogger.v(E, "already been initialized");
            } else {
                com.realsil.sdk.core.bluetooth.RtkBluetoothManager.getInstance().addManagerCallback(bVar);
            }
        }
        if (com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance() == null) {
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager.initial(context);
        }
        if (com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance() != null) {
            if (this.b) {
                com.realsil.sdk.core.logger.ZLogger.v(E, "already been initialized");
            } else {
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance().addManagerCallback(cVar);
            }
        }
        this.g = false;
        startSppServerThread();
        this.l = new java.util.concurrent.ThreadPoolExecutor(10, 10, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), new java.util.concurrent.ThreadPoolExecutor.AbortPolicy());
    }

    public static com.realsil.sdk.bbpro.BeeProParams getBeeProParams() {
        if (F == null) {
            F = new com.realsil.sdk.bbpro.BeeProParams();
        }
        return F;
    }

    public void addManagerCallback(com.realsil.sdk.bbpro.BumblebeeCallback bumblebeeCallback) {
        if (this.p == null) {
            this.p = new java.util.concurrent.CopyOnWriteArrayList();
        }
        if (!this.p.contains(bumblebeeCallback)) {
            this.p.add(bumblebeeCallback);
        }
        com.realsil.sdk.core.logger.ZLogger.v(E, "mManagerCallback.size=" + this.p.size());
    }

    public com.realsil.sdk.bbpro.core.BeeError changeDeviceName(byte b2, java.lang.String str) {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.SetCfgSettingsReq.Builder(b2).cfgData(str.getBytes()).assembleDataLength(true).build().encode());
    }

    public com.realsil.sdk.bbpro.core.BeeError changeRwsChannelSetting() {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.MmiReq.Builder((byte) 116).build().encode());
    }

    public void clearDeviceInfo() {
        com.realsil.sdk.bbpro.vendor.VendorModelClient vendorModelClient = this.q;
        if (vendorModelClient != null) {
            vendorModelClient.clearDeviceInfo();
        }
    }

    public void clearManagerCallback() {
        java.util.List<com.realsil.sdk.bbpro.BumblebeeCallback> list = this.p;
        if (list != null) {
            list.clear();
            this.p = null;
        }
    }

    public com.realsil.sdk.bbpro.core.BeeError connect(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return new com.realsil.sdk.bbpro.core.BeeError(1, "BluetoothDevice is invalid");
        }
        if (isConnected()) {
            com.realsil.sdk.core.logger.ZLogger.d("already connected");
            a(bluetoothDevice, 512);
            return new com.realsil.sdk.bbpro.core.BeeError(0);
        }
        com.realsil.sdk.core.logger.ZLogger.v(D, "connectionstate = " + getConnectState());
        return new com.realsil.sdk.bbpro.core.BeeError(startConnect(new com.realsil.sdk.bbpro.ConnectionParameters.Builder(bluetoothDevice).uuid(getBeeProParams().b()).transport(getBeeProParams().a()).build()));
    }

    public void destroy() {
        com.realsil.sdk.core.logger.ZLogger.v(E, "destroy...");
        disconnect();
        com.realsil.sdk.bbpro.vendor.VendorModelClient vendorModelClient = this.q;
        if (vendorModelClient != null) {
            vendorModelClient.destroy();
            this.q = null;
        }
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.l;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        this.o = false;
        g();
        stopSppServerThread();
        f();
        if (com.realsil.sdk.core.bluetooth.RtkBluetoothManager.getInstance() != null) {
            com.realsil.sdk.core.bluetooth.RtkBluetoothManager.getInstance().removeManagerCallback(this.s);
        }
        if (com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance() != null) {
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance().removeManagerCallback(this.t);
        }
        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer sppTransportLayer = this.e;
        if (sppTransportLayer != null) {
            sppTransportLayer.unregister(this.m);
            this.e = null;
        }
        clearManagerCallback();
        a(257, false);
        this.b = false;
    }

    public com.realsil.sdk.bbpro.core.BeeError disconnect() {
        if (this.h == 0) {
            com.realsil.sdk.core.logger.ZLogger.d("connection has already disconnected");
            a(this.c, this.h);
        } else {
            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer sppTransportLayer = this.e;
            if (sppTransportLayer == null) {
                com.realsil.sdk.core.logger.ZLogger.d("SppTransportLayer has already been released");
                a(this.c, 0);
            } else if (sppTransportLayer.getConnectionState() == 512) {
                a(768);
                this.e.disconnect();
            } else if (this.e.getConnectionState() == 256) {
                a(768);
                this.e.disconnect();
            } else if (this.e.getConnectionState() == 768) {
                a(768);
                a(this.c, this.h);
            } else {
                a(this.c, 0);
            }
        }
        return new com.realsil.sdk.bbpro.core.BeeError(0);
    }

    public com.realsil.sdk.bbpro.core.BeeError enterPairingMode() {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.MmiReq.Builder((byte) 81).build().encode());
    }

    public com.realsil.sdk.bbpro.core.BeeError exitPairingMode() {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.MmiReq.Builder((byte) 82).build().encode());
    }

    public int getConnState() {
        return this.h;
    }

    public int getConnectState() {
        return c().getConnectionState();
    }

    public android.bluetooth.BluetoothDevice getCurDevice() {
        return this.c;
    }

    public com.realsil.sdk.bbpro.model.DeviceInfo getDeviceInfo() {
        com.realsil.sdk.bbpro.vendor.VendorModelClient vendorModelClient = this.q;
        return vendorModelClient != null ? vendorModelClient.getDeviceInfo() : new com.realsil.sdk.bbpro.model.DeviceInfo();
    }

    public com.realsil.sdk.bbpro.equalizer.EqModelClient getEqModelClient() {
        com.realsil.sdk.bbpro.equalizer.EqModelClient eqModelClient = com.realsil.sdk.bbpro.equalizer.EqModelClient.getInstance();
        if (eqModelClient == null) {
            com.realsil.sdk.bbpro.equalizer.EqModelClient.initialize(this.mContext);
            eqModelClient = com.realsil.sdk.bbpro.equalizer.EqModelClient.getInstance();
            if (eqModelClient != null) {
                eqModelClient.setup(this);
            }
        }
        return eqModelClient;
    }

    public com.realsil.sdk.bbpro.core.BeeError getLeAddr() {
        return sendVendorCommand(com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket((short) 261));
    }

    public com.realsil.sdk.bbpro.core.BeeError getName(byte b2) {
        return reqDeviceName(b2);
    }

    public com.realsil.sdk.bbpro.core.BeeError getOtaDeviceInfo() {
        return sendVendorCommand(com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket((short) 1536));
    }

    public void getRwsInfo() {
        getVendorClient().getBudInfo();
    }

    public int getState() {
        return this.k;
    }

    public com.realsil.sdk.bbpro.core.BeeError getStatus(byte b2) {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.GetStatusReq.Builder(b2).build().encode());
    }

    public com.realsil.sdk.bbpro.vendor.VendorModelClient getVendorClient() {
        if (this.q == null) {
            com.realsil.sdk.bbpro.vendor.VendorModelClient vendorModelClient = com.realsil.sdk.bbpro.vendor.VendorModelClient.getInstance();
            this.q = vendorModelClient;
            if (vendorModelClient != null) {
                vendorModelClient.setup(this);
                this.q.registerCallback(this.u);
            }
        }
        return this.q;
    }

    public boolean initialize(com.realsil.sdk.bbpro.BeeProParams beeProParams) {
        F = beeProParams;
        com.realsil.sdk.core.logger.ZLogger.d("initialize:" + getBeeProParams().toString());
        com.realsil.sdk.bbpro.vendor.VendorModelClient.initialize(this.mContext);
        com.realsil.sdk.bbpro.vendor.VendorModelClient vendorModelClient = com.realsil.sdk.bbpro.vendor.VendorModelClient.getInstance();
        this.q = vendorModelClient;
        if (vendorModelClient != null) {
            vendorModelClient.setup(this);
            this.q.registerCallback(this.u);
        }
        com.realsil.sdk.bbpro.equalizer.EqModelClient.initialize(this.mContext);
        com.realsil.sdk.bbpro.equalizer.EqModelClient.getInstance().setup(this);
        e();
        a(this.k, true);
        this.b = true;
        com.realsil.sdk.core.logger.ZLogger.v(D, "initialize success");
        return true;
    }

    public boolean isActiveDevice(android.bluetooth.BluetoothDevice bluetoothDevice) {
        android.bluetooth.BluetoothDevice bluetoothDevice2;
        if (bluetoothDevice == null || (bluetoothDevice2 = this.c) == null) {
            return false;
        }
        return bluetoothDevice2.equals(bluetoothDevice);
    }

    public boolean isConnected() {
        return c().getConnectionState() == 512;
    }

    public boolean isConnectionStateChanged() {
        return this.h != this.i;
    }

    public boolean isDeviceChanged(android.bluetooth.BluetoothDevice bluetoothDevice) {
        boolean equals;
        if (bluetoothDevice == null) {
            return false;
        }
        android.bluetooth.BluetoothDevice bluetoothDevice2 = this.c;
        if (bluetoothDevice2 != null) {
            equals = bluetoothDevice2.equals(bluetoothDevice);
        } else {
            android.bluetooth.BluetoothDevice bluetoothDevice3 = this.d;
            if (bluetoothDevice3 == null) {
                return false;
            }
            equals = bluetoothDevice3.equals(bluetoothDevice);
        }
        return !equals;
    }

    public boolean isDisconnected() {
        return c().getConnectionState() == 0;
    }

    public void notifyDeviceInfoChanged(com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo, int i2) {
        java.util.List<com.realsil.sdk.bbpro.BumblebeeCallback> list = this.p;
        if (list == null || list.size() <= 0) {
            com.realsil.sdk.core.logger.ZLogger.v(E, "no callback registered");
            return;
        }
        if (E) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "indicator=%d, %s", java.lang.Integer.valueOf(i2), deviceInfo.toString()));
        }
        java.util.Iterator<com.realsil.sdk.bbpro.BumblebeeCallback> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().onDeviceInfoChanged(deviceInfo, i2);
        }
    }

    public com.realsil.sdk.bbpro.core.BeeError powerOff() {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.MmiReq.Builder((byte) 86).build().encode());
    }

    public boolean processAckPacket(com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket) {
        short toAckId = ackPacket.getToAckId();
        byte status = ackPacket.getStatus();
        java.util.List<com.realsil.sdk.bbpro.BumblebeeCallback> list = this.p;
        if (list == null || list.size() <= 0) {
            com.realsil.sdk.core.logger.ZLogger.v(E, "no callback registered");
            return false;
        }
        java.util.Iterator<com.realsil.sdk.bbpro.BumblebeeCallback> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().onAckReceived(toAckId, status);
        }
        return false;
    }

    public boolean processEventPacket(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket transportLayerPacket) {
        short opcode = transportLayerPacket.getOpcode();
        byte[] parameters = transportLayerPacket.getParameters();
        transportLayerPacket.getPayload();
        if (opcode == 25) {
            if (E) {
                com.realsil.sdk.core.logger.ZLogger.v(">> EVENT_REPORT_STATUS");
            }
            processStatusReport(parameters);
            return true;
        }
        java.util.List<com.realsil.sdk.bbpro.BumblebeeCallback> list = this.p;
        if (list == null || list.size() <= 0) {
            if (!E) {
                return false;
            }
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
            return false;
        }
        java.util.Iterator<com.realsil.sdk.bbpro.BumblebeeCallback> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().onEventReported(opcode, parameters);
        }
        return false;
    }

    public boolean processStatusReport(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            byte b2 = bArr[0];
            com.realsil.sdk.bbpro.vendor.VendorModelClient vendorModelClient = this.q;
            if (vendorModelClient != null && vendorModelClient.processStatusReport(b2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean registerModel(com.realsil.sdk.bbpro.internal.ModelClient modelClient) {
        if (modelClient == null) {
            com.realsil.sdk.core.logger.ZLogger.w("model can not be null");
            return false;
        }
        modelClient.setup(this);
        return true;
    }

    public void registerVendorModelCallback(com.realsil.sdk.bbpro.vendor.VendorModelCallback vendorModelCallback) {
        com.realsil.sdk.bbpro.vendor.VendorModelClient vendorModelClient = this.q;
        if (vendorModelClient != null) {
            vendorModelClient.registerCallback(vendorModelCallback);
        }
    }

    public void removeManagerCallback(com.realsil.sdk.bbpro.BumblebeeCallback bumblebeeCallback) {
        java.util.List<com.realsil.sdk.bbpro.BumblebeeCallback> list = this.p;
        if (list != null) {
            list.remove(bumblebeeCallback);
            com.realsil.sdk.core.logger.ZLogger.v(E, "mManagerCallback.size=" + this.p.size());
        }
    }

    public com.realsil.sdk.bbpro.core.BeeError reqBrEdrName(byte b2) {
        return reqDeviceName((byte) 1);
    }

    public com.realsil.sdk.bbpro.core.BeeError reqCapability() {
        return sendVendorCommand(com.realsil.sdk.bbpro.core.protocol.CommandContract.reqCmdInfo((byte) 1));
    }

    public com.realsil.sdk.bbpro.core.BeeError reqCmdSetVersion() {
        return sendVendorCommand(new com.realsil.sdk.bbpro.i.e.b().a(262).b(com.realsil.sdk.bbpro.c.c.a()).a().encode());
    }

    public com.realsil.sdk.bbpro.core.BeeError reqDeviceName(byte b2) {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.GetCfgSettingsReq.Builder(b2).build().encode());
    }

    public com.realsil.sdk.bbpro.core.BeeError reqLeName() {
        return reqDeviceName((byte) 0);
    }

    public com.realsil.sdk.bbpro.core.BeeError reqPackageId() {
        return sendVendorCommand(com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket(com.realsil.sdk.bbpro.core.protocol.CommandContract.CMD_GET_PACKAGE_ID));
    }

    public com.realsil.sdk.bbpro.core.BeeError sendATone(int i2) {
        return sendVendorCommand(com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket((short) 8, new byte[]{(byte) i2}));
    }

    public com.realsil.sdk.bbpro.core.BeeError sendAppReq(com.realsil.sdk.bbpro.profile.AppReq appReq) {
        return getVendorClient().sendAppReq(appReq);
    }

    public com.realsil.sdk.bbpro.core.BeeError sendUserCommand(byte[] bArr) {
        return sendVendorCommand(bArr);
    }

    public com.realsil.sdk.bbpro.core.BeeError sendVendorCommand(byte[] bArr) {
        return sendVendorCommand(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).payload(bArr).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError setVolumeDown() {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.MmiReq.Builder((byte) 49).build().encode());
    }

    public com.realsil.sdk.bbpro.core.BeeError setVolumeUp() {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.MmiReq.Builder((byte) 48).build().encode());
    }

    public int startConnect(android.bluetooth.BluetoothDevice bluetoothDevice) {
        return startConnect(new com.realsil.sdk.bbpro.ConnectionParameters.Builder(bluetoothDevice).uuid(getBeeProParams().b()).transport(getBeeProParams().a()).build());
    }

    public void startSppServerThread() {
        if (this.g || !getBeeProParams().f()) {
            return;
        }
        try {
            com.realsil.sdk.bbpro.e.a aVar = new com.realsil.sdk.bbpro.e.a(this.mContext, getBeeProParams().b(), this.x);
            this.f = aVar;
            aVar.start();
        } catch (java.lang.Exception e2) {
            com.realsil.sdk.core.logger.ZLogger.w(e2.toString());
        }
    }

    public void stopSppServerThread() {
        this.g = true;
        com.realsil.sdk.bbpro.e.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }

    public synchronized boolean syncData() {
        if (this.k == 513 || this.w) {
            com.realsil.sdk.core.logger.ZLogger.v("already in syncing data");
            return true;
        }
        com.realsil.sdk.bbpro.internal.BaseBeeProManager.a aVar = null;
        try {
            if (this.v == null) {
                com.realsil.sdk.bbpro.internal.BaseBeeProManager.j jVar = new com.realsil.sdk.bbpro.internal.BaseBeeProManager.j(this, aVar);
                this.v = jVar;
                jVar.start();
            } else {
                com.realsil.sdk.core.logger.ZLogger.v(E, "sync thread isAlive:" + this.v.isAlive());
                if (this.v.isAlive()) {
                    com.realsil.sdk.core.logger.ZLogger.v(D, "sync thread is already started");
                } else {
                    com.realsil.sdk.core.logger.ZLogger.v(E, "restart sync thread when it's dead");
                    this.v.start();
                }
            }
        } catch (java.lang.Exception e2) {
            com.realsil.sdk.core.logger.ZLogger.w(e2.toString());
            com.realsil.sdk.bbpro.internal.BaseBeeProManager.j jVar2 = new com.realsil.sdk.bbpro.internal.BaseBeeProManager.j(this, aVar);
            this.v = jVar2;
            jVar2.start();
        }
        return true;
    }

    public com.realsil.sdk.bbpro.core.BeeError toggleDspPassthrough() {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.MmiReq.Builder(com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AUDIO_PASS_THROUGH).build().encode());
    }

    public com.realsil.sdk.bbpro.core.BeeError triggerBleAdvertising() {
        return sendVendorCommand(new com.realsil.sdk.bbpro.profile.MmiReq.Builder((byte) -96).build().encode());
    }

    public void unregisterVendorModelCallback(com.realsil.sdk.bbpro.vendor.VendorModelCallback vendorModelCallback) {
        com.realsil.sdk.bbpro.vendor.VendorModelClient vendorModelClient = this.q;
        if (vendorModelClient != null) {
            vendorModelClient.unregisterCallback(vendorModelCallback);
        }
    }

    public synchronized com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer c() {
        if (this.e == null) {
            com.realsil.sdk.core.logger.ZLogger.d(D, "create SppTransportLayer");
            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer sppTransportLayer = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.getInstance();
            this.e = sppTransportLayer;
            sppTransportLayer.register(this.m);
        }
        return this.e;
    }

    public void d() {
        synchronized (this.n) {
            this.o = false;
            this.n.notifyAll();
        }
    }

    public final void e() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.UUID");
        com.realsil.sdk.bbpro.internal.BaseBeeProManager.i iVar = new com.realsil.sdk.bbpro.internal.BaseBeeProManager.i(this, null);
        this.C = iVar;
        this.mContext.registerReceiver(iVar, intentFilter);
    }

    public final void f() {
        com.realsil.sdk.bbpro.internal.BaseBeeProManager.j jVar = this.v;
        if (jVar != null) {
            jVar.interrupt();
            this.v = null;
        }
        this.w = false;
    }

    public final void g() {
        try {
            this.mContext.unregisterReceiver(this.C);
        } catch (java.lang.Exception e2) {
            com.realsil.sdk.core.logger.ZLogger.w(e2.getMessage());
        }
    }

    public void h() {
        synchronized (this.n) {
            if (this.o) {
                try {
                    this.n.wait(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
                } catch (java.lang.InterruptedException e2) {
                    com.realsil.sdk.core.logger.ZLogger.w(e2.toString());
                }
            }
        }
    }

    public final boolean b(com.realsil.sdk.bbpro.ConnectionParameters connectionParameters) {
        android.bluetooth.BluetoothDevice a2 = connectionParameters.a();
        connectionParameters.b();
        if (E) {
            com.realsil.sdk.core.logger.ZLogger.v("processSdpConnect:" + connectionParameters.toString());
        }
        if (!a2.fetchUuidsWithSdp()) {
            com.realsil.sdk.core.logger.ZLogger.d("fetchUuidsWithSdp failed");
            a(256);
            if (c().connect(connectionParameters.c())) {
                return true;
            }
            com.realsil.sdk.core.logger.ZLogger.w("connect failed");
            a(0);
            a(this.c, this.h);
            return false;
        }
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.l;
        if (threadPoolExecutor == null) {
            com.realsil.sdk.core.logger.ZLogger.d("syncExecutor == null");
            return false;
        }
        threadPoolExecutor.execute(new com.realsil.sdk.bbpro.internal.BaseBeeProManager.h(connectionParameters));
        return true;
    }

    public com.realsil.sdk.bbpro.core.BeeError sendVendorCommand(com.realsil.sdk.bbpro.core.transportlayer.Command command) {
        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer sppTransportLayer = this.e;
        if (sppTransportLayer == null) {
            return new com.realsil.sdk.bbpro.core.BeeError(32);
        }
        if (sppTransportLayer.sendCommand(command)) {
            return new com.realsil.sdk.bbpro.core.BeeError(0);
        }
        return new com.realsil.sdk.bbpro.core.BeeError(1, "send Cmd failed");
    }

    public int startConnect(android.bluetooth.BluetoothDevice bluetoothDevice, java.util.UUID uuid) {
        return startConnect(new com.realsil.sdk.bbpro.ConnectionParameters.Builder(bluetoothDevice).uuid(uuid).build());
    }

    public void a(int i2, boolean z) {
        int i3 = this.k;
        if (i2 != i3) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format("state 0x%04X > 0x%04X", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i2)));
            this.k = i2;
        }
        if (z) {
            java.util.List<com.realsil.sdk.bbpro.BumblebeeCallback> list = this.p;
            if (list != null && list.size() > 0) {
                java.util.Iterator<com.realsil.sdk.bbpro.BumblebeeCallback> it = this.p.iterator();
                while (it.hasNext()) {
                    it.next().onStateChanged(this.k);
                }
                return;
            }
            com.realsil.sdk.core.logger.ZLogger.v(E, "no callback registered");
        }
    }

    public int startConnect(android.bluetooth.BluetoothDevice bluetoothDevice, android.bluetooth.BluetoothSocket bluetoothSocket) {
        return startConnect(new com.realsil.sdk.bbpro.ConnectionParameters.Builder(bluetoothDevice).uuid(getBeeProParams().b()).transport(getBeeProParams().a()).bluetoothSocket(bluetoothSocket).build());
    }

    public int startConnect(android.bluetooth.BluetoothDevice bluetoothDevice, android.bluetooth.BluetoothSocket bluetoothSocket, java.util.UUID uuid) {
        return startConnect(new com.realsil.sdk.bbpro.ConnectionParameters.Builder(bluetoothDevice).uuid(uuid).bluetoothSocket(bluetoothSocket).build());
    }

    public final java.lang.String a(android.content.Context context, int i2) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> arrayList = new java.util.ArrayList<>();
        if (activityManager != null) {
            arrayList = activityManager.getRunningAppProcesses();
        }
        if (arrayList == null) {
            return "";
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            if (runningAppProcessInfo.pid == i2) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public int startConnect(com.realsil.sdk.bbpro.ConnectionParameters connectionParameters) {
        android.bluetooth.BluetoothDevice a2 = connectionParameters.a();
        connectionParameters.b();
        if (isActiveDevice(a2)) {
            if (isConnected()) {
                if (D) {
                    com.realsil.sdk.core.logger.ZLogger.d("device " + com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(a2.getAddress(), true) + " already connected");
                }
                a(512);
                b(a2);
                a(this.c, this.h);
                return 0;
            }
            if (this.h == 256) {
                if (D) {
                    com.realsil.sdk.core.logger.ZLogger.d("device " + com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(a2.getAddress(), true) + " is already in connecting");
                }
                return 0;
            }
        } else if (this.h == 256) {
            if (D) {
                com.realsil.sdk.core.logger.ZLogger.d("old device " + com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(a2.getAddress(), true) + " is already in connecting");
            }
            disconnect();
            return 1;
        }
        b(a2);
        if (a2.getBondState() == 12) {
            if (!com.realsil.sdk.bbpro.core.Utils.checkUuid(a2.getUuids(), connectionParameters.d(), true) && connectionParameters.e()) {
                if (!b(connectionParameters)) {
                    return 1;
                }
            } else {
                a(256);
                if (!c().connect(connectionParameters.c())) {
                    com.realsil.sdk.core.logger.ZLogger.d("connect failed");
                    a(0);
                    a(this.c, this.h);
                    return 1;
                }
            }
        } else if (!a(connectionParameters)) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r0 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            android.bluetooth.BluetoothDevice r1 = r7.c
            r2 = 1
            int r0 = r0.getConnectionState(r2, r1)
            r1 = 2
            r3 = 0
            if (r1 != r0) goto L16
            java.lang.String r4 = "HFP already connected"
            com.realsil.sdk.core.logger.ZLogger.v(r4)
        L14:
            r4 = 0
            goto L5d
        L16:
            if (r2 != r0) goto L5c
            boolean r0 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.D
            java.lang.String r4 = "HFP already connecting..., wait create hfp result"
            com.realsil.sdk.core.logger.ZLogger.d(r0, r4)
            java.lang.Object r4 = r7.A
            monitor-enter(r4)
            java.lang.Object r0 = r7.A     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            r5 = 15000(0x3a98, double:7.411E-320)
            r0.wait(r5)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L2c
            goto L34
        L2a:
            r0 = move-exception
            goto L5a
        L2c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2a
            com.realsil.sdk.core.logger.ZLogger.w(r0)     // Catch: java.lang.Throwable -> L2a
        L34:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r0 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            android.bluetooth.BluetoothDevice r4 = r7.c
            int r0 = r0.getConnectionState(r2, r4)
            boolean r4 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.E
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5[r3] = r6
            java.lang.String r6 = "hfpState = 0x%02X"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            com.realsil.sdk.core.logger.ZLogger.v(r4, r5)
            if (r1 == r0) goto L14
            java.lang.String r4 = "hfp back connect failed"
            com.realsil.sdk.core.logger.ZLogger.d(r4)
            goto L5c
        L5a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L5c:
            r4 = 1
        L5d:
            if (r4 == 0) goto Lb3
            boolean r4 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.E
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r3] = r0
            java.lang.String r0 = "hfpState = 0x%02X"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            com.realsil.sdk.core.logger.ZLogger.v(r4, r0)
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r0 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            android.bluetooth.BluetoothDevice r4 = r7.c
            java.lang.String r4 = r4.getAddress()
            boolean r0 = r0.connectHfpAg(r4)
            if (r0 != 0) goto L88
            java.lang.String r0 = "connect Hfp failed"
            com.realsil.sdk.core.logger.ZLogger.w(r0)
            goto Lb3
        L88:
            boolean r0 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.E
            java.lang.String r4 = "wait create hfp result"
            com.realsil.sdk.core.logger.ZLogger.v(r0, r4)
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r0 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            android.bluetooth.BluetoothDevice r4 = r7.c
            int r0 = r0.getConnectionState(r2, r4)
            boolean r4 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.E
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r2[r3] = r5
            java.lang.String r3 = "hfpState = 0x%02X"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            com.realsil.sdk.core.logger.ZLogger.v(r4, r2)
            if (r1 == r0) goto Lb3
            java.lang.String r0 = "hfp connect failed"
            com.realsil.sdk.core.logger.ZLogger.d(r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.bbpro.internal.BaseBeeProManager.b():void");
    }

    public final void a(android.bluetooth.BluetoothDevice bluetoothDevice) {
        this.r = false;
        if (bluetoothDevice == null) {
            return;
        }
        try {
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.realsil.sdk.bbpro.internal.BaseBeeProManager.f(bluetoothDevice), 1000L);
        } catch (java.lang.Exception e2) {
            com.realsil.sdk.core.logger.ZLogger.w(e2.toString());
        }
    }

    public final void a(int i2) {
        int i3 = this.h;
        if (i2 != i3) {
            com.realsil.sdk.core.logger.ZLogger.v(D, java.lang.String.format(java.util.Locale.US, "connect state 0x%04X -> 0x%04X", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i2)));
        }
        this.i = this.h;
        this.h = i2;
    }

    public final void a(android.bluetooth.BluetoothDevice bluetoothDevice, int i2) {
        if (i2 == 512) {
            if (this.c != null && getBeeProParams().d()) {
                int connectionState = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance().getConnectionState(2, this.c);
                int bondState = bluetoothDevice.getBondState();
                com.realsil.sdk.core.logger.ZLogger.v(D, java.lang.String.format(java.util.Locale.US, "a2dpState=0x%02X, bondState=%d", java.lang.Integer.valueOf(connectionState), java.lang.Integer.valueOf(bondState)));
                if (connectionState == 0) {
                    if (bondState == 12) {
                        com.realsil.sdk.core.logger.ZLogger.v(D, "wait to connect a2dp");
                        a(this.c);
                    } else {
                        com.realsil.sdk.core.logger.ZLogger.d(D, "wait paired and then to connect a2dp");
                        this.r = true;
                    }
                }
            }
            a(263, true);
            if (isConnectionStateChanged()) {
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("connection state change from 0x%04X to 0x%04X", java.lang.Integer.valueOf(this.i), java.lang.Integer.valueOf(this.h)));
                if (getBeeProParams().g()) {
                    syncData();
                } else {
                    if (E) {
                        com.realsil.sdk.core.logger.ZLogger.v(getDeviceInfo().toString());
                    }
                    a(264, true);
                }
            } else {
                com.realsil.sdk.core.logger.ZLogger.v("connection state no changed");
                if (E) {
                    com.realsil.sdk.core.logger.ZLogger.v(getDeviceInfo().toString());
                }
                a(264, false);
            }
        } else if (i2 == 0) {
            a(260, true);
            this.r = false;
            f();
        } else if (i2 == 768) {
            a(262, true);
        } else {
            a(261, true);
        }
        java.util.List<com.realsil.sdk.bbpro.BumblebeeCallback> list = this.p;
        if (list != null && list.size() > 0) {
            java.util.Iterator<com.realsil.sdk.bbpro.BumblebeeCallback> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().onConnectionStateChanged(bluetoothDevice, 0, i2);
            }
            return;
        }
        com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
    }

    public final void b(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.realsil.sdk.core.logger.ZLogger.v(D, "clear device info");
        } else {
            if (E) {
                com.realsil.sdk.core.logger.ZLogger.d("update device:" + com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
            }
            this.d = this.c;
        }
        this.c = bluetoothDevice;
    }

    public final boolean a(com.realsil.sdk.bbpro.ConnectionParameters connectionParameters) {
        boolean createBond;
        android.bluetooth.BluetoothDevice a2 = connectionParameters.a();
        connectionParameters.b();
        if (E) {
            com.realsil.sdk.core.logger.ZLogger.v("processBondConnect:" + connectionParameters.toString());
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            createBond = com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.createBond(a2, 1);
        } else {
            createBond = com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.createBond(a2, 1);
        }
        if (!createBond && D) {
            com.realsil.sdk.core.logger.ZLogger.d("createBond failed, maybe need to confirm pair dialog");
        }
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.l;
        if (threadPoolExecutor == null) {
            com.realsil.sdk.core.logger.ZLogger.d("syncExecutor == null");
            return false;
        }
        threadPoolExecutor.execute(new com.realsil.sdk.bbpro.internal.BaseBeeProManager.g(a2, connectionParameters));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r9 = this;
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r0 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            android.bluetooth.BluetoothDevice r1 = r9.c
            r2 = 2
            int r0 = r0.getConnectionState(r2, r1)
            r3 = 15000(0x3a98, double:7.411E-320)
            r1 = 0
            r5 = 1
            if (r2 != r0) goto L17
            java.lang.String r0 = "A2DP already connected"
            com.realsil.sdk.core.logger.ZLogger.v(r0)
            goto L59
        L17:
            if (r5 != r0) goto L5d
            boolean r0 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.D
            java.lang.String r6 = "A2DP already connecting..., wait create A2DP result"
            com.realsil.sdk.core.logger.ZLogger.d(r0, r6)
            java.lang.Object r6 = r9.z
            monitor-enter(r6)
            java.lang.Object r0 = r9.z     // Catch: java.lang.Throwable -> L29 java.lang.InterruptedException -> L2b
            r0.wait(r3)     // Catch: java.lang.Throwable -> L29 java.lang.InterruptedException -> L2b
            goto L33
        L29:
            r0 = move-exception
            goto L5b
        L2b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L29
            com.realsil.sdk.core.logger.ZLogger.w(r0)     // Catch: java.lang.Throwable -> L29
        L33:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L29
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r0 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            android.bluetooth.BluetoothDevice r6 = r9.c
            int r0 = r0.getConnectionState(r2, r6)
            boolean r6 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.E
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7[r1] = r8
            java.lang.String r8 = "a2dpState = 0x%02X"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            com.realsil.sdk.core.logger.ZLogger.v(r6, r7)
            if (r2 == r0) goto L59
            java.lang.String r0 = "A2DP back connect failed"
            com.realsil.sdk.core.logger.ZLogger.d(r0)
            goto L70
        L59:
            r0 = 0
            goto L71
        L5b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L29
            throw r0
        L5d:
            boolean r6 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.E
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r1] = r0
            java.lang.String r0 = "a2dpState = 0x%02X"
            java.lang.String r0 = java.lang.String.format(r0, r7)
            com.realsil.sdk.core.logger.ZLogger.v(r6, r0)
        L70:
            r0 = 1
        L71:
            if (r0 == 0) goto Lc7
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r0 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            android.bluetooth.BluetoothDevice r6 = r9.c
            boolean r0 = r0.connectA2dpSource(r6)
            if (r0 != 0) goto L85
            java.lang.String r0 = "connect A2DP failed"
            com.realsil.sdk.core.logger.ZLogger.w(r0)
            goto Lc7
        L85:
            boolean r0 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.E
            java.lang.String r6 = "wait create A2DP result"
            com.realsil.sdk.core.logger.ZLogger.v(r0, r6)
            java.lang.Object r0 = r9.z
            monitor-enter(r0)
            java.lang.Object r6 = r9.z     // Catch: java.lang.Throwable -> L95 java.lang.InterruptedException -> L97
            r6.wait(r3)     // Catch: java.lang.Throwable -> L95 java.lang.InterruptedException -> L97
            goto L9f
        L95:
            r1 = move-exception
            goto Lc5
        L97:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L95
            com.realsil.sdk.core.logger.ZLogger.w(r3)     // Catch: java.lang.Throwable -> L95
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r0 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            android.bluetooth.BluetoothDevice r3 = r9.c
            int r0 = r0.getConnectionState(r2, r3)
            boolean r3 = com.realsil.sdk.bbpro.internal.BaseBeeProManager.E
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4[r1] = r5
            java.lang.String r1 = "a2dpState = 0x%02X"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            com.realsil.sdk.core.logger.ZLogger.v(r3, r1)
            if (r2 == r0) goto Lc7
            java.lang.String r0 = "A2DP connect failed"
            com.realsil.sdk.core.logger.ZLogger.d(r0)
            goto Lc7
        Lc5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            throw r1
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.bbpro.internal.BaseBeeProManager.a():void");
    }
}
