package com.realsil.sdk.core.d;

/* loaded from: classes3.dex */
public abstract class a {
    public static final int STATE_DISCOVERY_FINISHED = 3;
    public static final int STATE_DISCOVERY_STARTED = 2;
    public static final int STATE_DISCOVERY_START_PROCESS = 1;
    public static final int STATE_IDLE = 0;
    public android.content.Context c;
    public com.realsil.sdk.core.bluetooth.scanner.ScannerParams d;
    public com.realsil.sdk.core.bluetooth.scanner.ScannerCallback e;
    public android.os.Handler f;
    public android.bluetooth.BluetoothAdapter g;
    public boolean a = false;
    public boolean b = false;
    public int h = 0;
    public boolean i = false;
    public long j = 0;
    public final com.realsil.sdk.core.d.a.C0066a k = new com.realsil.sdk.core.d.a.C0066a();
    public final com.realsil.sdk.core.d.a.b l = new com.realsil.sdk.core.d.a.b();
    public final com.realsil.sdk.core.d.a.c m = new com.realsil.sdk.core.d.a.c();
    public boolean n = false;
    public final com.realsil.sdk.core.d.a.d o = new com.realsil.sdk.core.d.a.d();

    /* renamed from: com.realsil.sdk.core.d.a$a, reason: collision with other inner class name */
    public class C0066a extends android.content.BroadcastReceiver {

        /* renamed from: com.realsil.sdk.core.d.a$a$a, reason: collision with other inner class name */
        public class RunnableC0067a implements java.lang.Runnable {
            public RunnableC0067a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.realsil.sdk.core.d.a.this.stopScan();
            }
        }

        public C0066a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(android.content.Context context, android.content.Intent intent) {
            java.lang.String action = intent.getAction();
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "[%s] %d -> %d", action, java.lang.Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1)), java.lang.Integer.valueOf(intExtra)));
                if (intExtra == 10 && com.realsil.sdk.core.d.a.this.isScanning()) {
                    new java.lang.Thread(new com.realsil.sdk.core.d.a.C0066a.RunnableC0067a()).start();
                }
            }
        }
    }

    public class b implements java.lang.Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis();
            com.realsil.sdk.core.d.a aVar = com.realsil.sdk.core.d.a.this;
            if (timeInMillis < aVar.j) {
                aVar.j = 0L;
            }
            long j = timeInMillis - aVar.j;
            int i = aVar.h;
            if (i == 1) {
                if (j > androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "no scan response received after start scan for %d ms", java.lang.Long.valueOf(androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS)));
                    com.realsil.sdk.core.d.a.this.e();
                    return;
                }
                return;
            }
            if (i == 2) {
                if (j <= androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    com.realsil.sdk.core.d.a.a(aVar);
                    return;
                } else {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "exceed %d ms , no scan response received since last time", java.lang.Long.valueOf(androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS)));
                    com.realsil.sdk.core.d.a.this.e();
                    return;
                }
            }
            boolean z = aVar.b;
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("ignore state:");
            a.append(com.realsil.sdk.core.d.a.this.h);
            com.realsil.sdk.core.logger.ZLogger.v(z, a.toString());
            com.realsil.sdk.core.d.a.a(com.realsil.sdk.core.d.a.this);
        }
    }

    public class c implements java.lang.Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.realsil.sdk.core.logger.ZLogger.v("scan delay time reached");
            com.realsil.sdk.core.d.a.this.e();
        }
    }

    public class d implements java.lang.Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.realsil.sdk.core.d.a aVar = com.realsil.sdk.core.d.a.this;
            com.realsil.sdk.core.bluetooth.scanner.ScannerCallback scannerCallback = aVar.e;
            if (scannerCallback != null) {
                scannerCallback.onAutoScanTrigger();
            } else {
                com.realsil.sdk.core.logger.ZLogger.v(aVar.b, "no callback registered");
            }
            com.realsil.sdk.core.d.a.this.startScan();
        }
    }

    public void a() {
    }

    public final void a(int i) {
        int i2 = this.h;
        if (i2 != i) {
            if (this.a) {
                com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "ScanState 0x%02X >> 0x%02X", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)));
            }
            this.h = i;
            com.realsil.sdk.core.bluetooth.scanner.ScannerCallback scannerCallback = this.e;
            if (scannerCallback != null) {
                scannerCallback.onScanStateChanged(i);
            } else {
                com.realsil.sdk.core.logger.ZLogger.v(this.b, "no callback registered");
            }
        }
        int i3 = this.h;
        if (i3 == 0 || i3 == 3) {
            android.os.Handler handler = this.f;
            if (handler != null) {
                handler.removeCallbacks(this.m);
                this.f.removeCallbacks(this.l);
                this.f.removeCallbacks(this.o);
            }
            boolean z = this.n;
            if (!z) {
                if (this.b) {
                    com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("continousScanEnabled=%b", java.lang.Boolean.valueOf(z)));
                }
            } else if (this.f != null) {
                com.realsil.sdk.core.logger.ZLogger.v(this.a, "wait to start auto scan");
                this.f.postDelayed(this.o, this.d.getAutoScanDelay());
            }
        }
    }

    public abstract boolean a(android.bluetooth.BluetoothDevice bluetoothDevice);

    public boolean b() {
        if (this.i) {
            com.realsil.sdk.core.logger.ZLogger.w("please call onDestroy() method first");
            return false;
        }
        this.a = com.realsil.sdk.core.RtkCore.DEBUG;
        this.b = com.realsil.sdk.core.RtkCore.VDBG;
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) this.c.getSystemService("bluetooth");
            if (bluetoothManager != null) {
                this.g = bluetoothManager.getAdapter();
            }
        } else {
            this.g = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        }
        if (this.d == null) {
            com.realsil.sdk.core.logger.ZLogger.v(this.b, "create new ScannerParams");
            this.d = new com.realsil.sdk.core.bluetooth.scanner.ScannerParams();
        }
        if (this.f == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ScannerPresenter");
            handlerThread.start();
            this.f = new android.os.Handler(handlerThread.getLooper());
        }
        if (this.e == null) {
            com.realsil.sdk.core.logger.ZLogger.v(this.b, "callback is null");
        }
        this.c.registerReceiver(this.k, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.i = true;
        com.realsil.sdk.core.logger.ZLogger.v("initialized");
        return true;
    }

    public final boolean c() {
        if (this.f == null) {
            com.realsil.sdk.core.logger.ZLogger.v(this.b, "mHandler == null");
            return false;
        }
        com.realsil.sdk.core.logger.ZLogger.v(this.b, java.lang.String.format(java.util.Locale.US, "wait to check scan period(%d)", java.lang.Long.valueOf(androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS)));
        this.f.removeCallbacks(this.l);
        return this.f.postDelayed(this.l, androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }

    public final boolean d() {
        if (!this.i) {
            com.realsil.sdk.core.logger.ZLogger.w("presenter not initialized");
            return false;
        }
        if (!isBluetoothEnabled()) {
            com.realsil.sdk.core.logger.ZLogger.w("Bluetooth not enabled, ignore scan process.");
            return false;
        }
        int i = this.h;
        if (i == 1 || i == 2) {
            long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis();
            if (timeInMillis < this.j) {
                this.j = 0L;
            }
            if (timeInMillis - this.j > androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "exceed %d ms , no scan response received since last time", java.lang.Long.valueOf(androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS)));
                e();
            } else {
                c();
            }
            return false;
        }
        a(1);
        android.os.Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacks(this.m);
            this.f.removeCallbacks(this.l);
            this.f.removeCallbacks(this.o);
        }
        this.j = 0L;
        com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams = this.d;
        if (scannerParams != null) {
            this.n = scannerParams.isAutoDiscovery();
        } else {
            this.n = false;
        }
        return true;
    }

    public abstract boolean e();

    public android.bluetooth.BluetoothAdapter getBluetoothAdapter() {
        return this.g;
    }

    public java.util.List<com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice> getPairedDevices() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.g == null) {
            return arrayList;
        }
        if (!this.d.isReusePairedDeviceEnabled()) {
            com.realsil.sdk.core.logger.ZLogger.v(this.a, "don't reuse paired device");
            return arrayList;
        }
        for (android.bluetooth.BluetoothDevice bluetoothDevice : this.g.getBondedDevices()) {
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.dumpBluetoothDevice(bluetoothDevice));
            if (a(bluetoothDevice)) {
                arrayList.add(new com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice(bluetoothDevice, bluetoothDevice.getName(), -1000, bluetoothDevice.getBondState() == 12, false));
            }
        }
        return arrayList;
    }

    public java.util.List<com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice> getPairedDevicesByProfile(int i) {
        if (i != 1) {
            return getPairedDevices();
        }
        android.os.ParcelUuid[] parcelUuidArr = com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.HEADSET_PROFILE_UUIDS;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.g;
        if (bluetoothAdapter != null) {
            for (android.bluetooth.BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
                if (com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.containsAnyUuid(bluetoothDevice.getUuids(), parcelUuidArr)) {
                    boolean isConnected = com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.isConnected(bluetoothDevice);
                    arrayList.add(new com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice(bluetoothDevice, bluetoothDevice.getName(), -1000, bluetoothDevice.getBondState() == 12, isConnected ? isConnected : com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance().getConnectionState(1, bluetoothDevice) == 2 || com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance().getConnectionState(2, bluetoothDevice) == 2));
                }
            }
        }
        return arrayList;
    }

    public int getState() {
        return this.h;
    }

    public boolean isBluetoothEnabled() {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.g;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    public boolean isBluetoothSupported() {
        return this.g != null;
    }

    public boolean isScanning() {
        int i = this.h;
        return i == 2 || i == 1;
    }

    public void onDestroy() {
        com.realsil.sdk.core.logger.ZLogger.d("onDestroy");
        android.content.Context context = this.c;
        if (context != null) {
            try {
                context.unregisterReceiver(this.k);
            } catch (java.lang.Exception e) {
                com.realsil.sdk.core.logger.ZLogger.w(this.b, e.toString());
            }
        }
        this.e = null;
        stopScan();
        android.os.Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.i = false;
        com.realsil.sdk.core.logger.ZLogger.d("scan presenter destroyed");
    }

    public synchronized boolean scanDevice(boolean z) {
        if (z) {
            return startScan();
        }
        return stopScan();
    }

    public void setScanMode(int i) {
        com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams = this.d;
        if (scannerParams != null) {
            scannerParams.setScanMode(i);
        }
    }

    public void setScannerCallback(com.realsil.sdk.core.bluetooth.scanner.ScannerCallback scannerCallback) {
        this.e = scannerCallback;
        if (scannerCallback == null) {
            com.realsil.sdk.core.logger.ZLogger.v(this.b, "callback is null");
        }
    }

    public void setScannerParams(com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams) {
        this.d = scannerParams;
    }

    public abstract boolean startScan();

    public boolean stopScan() {
        this.n = false;
        if (!this.i) {
            com.realsil.sdk.core.logger.ZLogger.w("presenter not initialized");
            return false;
        }
        android.os.Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        return e();
    }

    public synchronized boolean scanDevice(boolean z, boolean z2) {
        if (z) {
            return startScan();
        }
        return stopScan();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice> getPairedDevices(int r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.bluetooth.BluetoothAdapter r1 = r11.g
            if (r1 != 0) goto La
            return r0
        La:
            java.util.Set r1 = r1.getBondedDevices()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L91
            java.lang.Object r2 = r1.next()
            r4 = r2
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4
            android.bluetooth.BluetoothClass r2 = r4.getBluetoothClass()
            int r2 = r2.getMajorDeviceClass()
            r3 = 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r2 == r12) goto L39
            if (r3 != r12) goto L12
            android.bluetooth.BluetoothClass r2 = r4.getBluetoothClass()
            boolean r2 = com.realsil.sdk.core.bluetooth.impl.BluetoothClassImpl.doesClassMatch(r2, r5)
            if (r2 != 0) goto L39
            goto L12
        L39:
            r2 = 1
            if (r3 != r12) goto L73
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r3 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            int r3 = r3.getConnectionState(r2, r4)
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager r6 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getInstance()
            r7 = 2
            int r6 = r6.getConnectionState(r7, r4)
            java.util.Locale r8 = java.util.Locale.US
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = r4.getAddress()
            r9[r5] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r9[r2] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r9[r7] = r10
            java.lang.String r10 = "%s, hfpState= %d,a2dpState= %d"
            java.lang.String r8 = java.lang.String.format(r8, r10, r9)
            com.realsil.sdk.core.logger.ZLogger.v(r8)
            if (r7 == r3) goto L71
            if (r7 != r6) goto L73
        L71:
            r8 = 1
            goto L74
        L73:
            r8 = 0
        L74:
            com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice r9 = new com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice
            java.lang.String r6 = r4.getName()
            r7 = -1000(0xfffffffffffffc18, float:NaN)
            int r3 = r4.getBondState()
            r10 = 12
            if (r3 != r10) goto L85
            goto L86
        L85:
            r2 = 0
        L86:
            r3 = r9
            r5 = r6
            r6 = r7
            r7 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r9)
            goto L12
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.core.d.a.getPairedDevices(int):java.util.List");
    }

    public final boolean a(android.bluetooth.BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        boolean a;
        this.j = java.util.Calendar.getInstance().getTimeInMillis();
        int i2 = this.h;
        if (i2 == 1) {
            a(2);
        } else if (i2 != 2) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("stop to calibration state: 0x%04X", java.lang.Integer.valueOf(i2)));
            e();
            return false;
        }
        if (bluetoothDevice == null) {
            com.realsil.sdk.core.logger.ZLogger.d("ignore, device is null");
            return false;
        }
        if (this.d.getRssiFilter() > -1000 && this.d.getRssiFilter() > i) {
            com.realsil.sdk.core.logger.ZLogger.w("filter, low rssi:" + i);
            a = false;
        } else {
            a = a(bluetoothDevice);
        }
        if (!a) {
            return false;
        }
        com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice extendedBluetoothDevice = new com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice(bluetoothDevice, bluetoothDevice.getName(), i, bluetoothDevice.getBondState() == 12, false, bArr);
        a();
        com.realsil.sdk.core.bluetooth.scanner.ScannerCallback scannerCallback = this.e;
        if (scannerCallback != null) {
            scannerCallback.onNewDevice(extendedBluetoothDevice);
        } else {
            com.realsil.sdk.core.logger.ZLogger.v(this.b, "no callback registered");
        }
        if (this.d.getScanMechanism() == 1) {
            com.realsil.sdk.core.logger.ZLogger.d("SCAN_MECHANISM_FILTER_ONE > scanDevice(false)");
            e();
        }
        return true;
    }

    public final boolean b(android.bluetooth.BluetoothDevice bluetoothDevice) {
        java.lang.String name = bluetoothDevice.getName();
        if (!android.text.TextUtils.isEmpty(this.d.getNameFilter())) {
            if (android.text.TextUtils.isEmpty(name)) {
                return false;
            }
            if (com.realsil.sdk.core.utility.DataConverter.equals(this.d.getNameFilter(), name)) {
                return true;
            }
            if (this.d.isNameFuzzyMatchEnable() && name.contains(this.d.getNameFilter())) {
                return true;
            }
            if (this.a) {
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("conflict name: %s", name));
            }
            return false;
        }
        if (!android.text.TextUtils.isEmpty(name) || this.d.isNameNullable()) {
            return true;
        }
        if (this.b) {
            com.realsil.sdk.core.logger.ZLogger.v("name is null, ignore");
        }
        return false;
    }

    public static void a(com.realsil.sdk.core.d.a aVar) {
        android.os.Handler handler = aVar.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(aVar.m);
            aVar.f.postDelayed(aVar.m, aVar.d.getScanPeriod());
        } else {
            com.realsil.sdk.core.logger.ZLogger.v(aVar.b, "mHandler == null");
        }
    }
}
