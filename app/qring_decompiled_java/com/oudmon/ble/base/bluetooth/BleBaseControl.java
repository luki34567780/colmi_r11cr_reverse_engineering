package com.oudmon.ble.base.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public class BleBaseControl {
    private static final int GATT_CLOSE_DELAY_MILLIS = 500;
    private static final java.lang.String TAG = "BleBaseControl";
    private static com.oudmon.ble.base.bluetooth.BleBaseControl bleBaseControl;
    private volatile boolean connecting;
    private com.oudmon.ble.base.bluetooth.IBleListener listener;
    private android.bluetooth.BluetoothAdapter mBluetoothAdapter;
    private android.content.Context mContext;
    private java.lang.String mDeviceAddress;
    private volatile boolean mIsConnected;
    private final java.lang.Object mLock = new java.lang.Object();
    protected java.util.Map<java.lang.String, android.bluetooth.BluetoothGatt> mBluetoothGatt = new java.util.HashMap();
    private boolean isNeedReconnect = true;
    private int maxReconnect = 10;
    private int maxFail = 6;
    private java.util.concurrent.atomic.AtomicInteger count = new java.util.concurrent.atomic.AtomicInteger(0);
    private java.util.concurrent.atomic.AtomicInteger failCount = new java.util.concurrent.atomic.AtomicInteger(0);
    private android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private boolean bluetoothTurnOff = false;
    private java.util.HashMap<java.util.UUID, android.bluetooth.BluetoothGattCharacteristic> cacheGattCharacteristicHashMap = new java.util.HashMap<>();
    private com.oudmon.ble.base.bluetooth.BleBaseControl.SystemProxyTimeoutRunnable systemProxyTimeoutRunnable = new com.oudmon.ble.base.bluetooth.BleBaseControl.SystemProxyTimeoutRunnable();
    private java.lang.Boolean rtkBindTag = false;
    private android.bluetooth.BluetoothGattCallback mGattCallback = new android.bluetooth.BluetoothGattCallback() { // from class: com.oudmon.ble.base.bluetooth.BleBaseControl.1
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "onConnectionStateChange-->status = [" + i + "], newState = [" + i2 + "]");
            com.oudmon.ble.base.util.LogToFile.getInstance().wtfStatus(":status:" + i + "newState:" + i2);
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.bleStatus(i, i2);
            }
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.removeCallbacks(com.oudmon.ble.base.bluetooth.BleBaseControl.this.mDiscoverServiceTimeoutRunnable);
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.removeCallbacks(com.oudmon.ble.base.bluetooth.BleBaseControl.this.mTimeoutRunnable);
            com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().clean();
            if (i != 0) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.notifyMyAll();
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.mIsConnected = false;
                try {
                    if (!com.oudmon.ble.base.bluetooth.BleBaseControl.this.rtkBindTag.booleanValue()) {
                        com.oudmon.ble.base.bluetooth.BleBaseControl.this.unBondedDevice(address);
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
                if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.bleGattDisconnect(bluetoothGatt.getDevice());
                }
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.disconnectDevice(address);
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.failCount.incrementAndGet();
                reconnectFromStateChangeNoAutoConnect();
                return;
            }
            if (i2 != 2) {
                if (i2 == 0) {
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.mIsConnected = false;
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.notifyMyAll();
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.disconnectDevice(address);
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.reconnectDevice();
                    if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                        com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.bleGattDisconnect(bluetoothGatt.getDevice());
                        return;
                    }
                    return;
                }
                return;
            }
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.cacheGattCharacteristicHashMap.clear();
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.removeCallbacks(com.oudmon.ble.base.bluetooth.BleBaseControl.this.mReconnectRunnable);
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.waitFor(500L);
            if (bluetoothGatt.discoverServices()) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.removeCallbacks(com.oudmon.ble.base.bluetooth.BleBaseControl.this.mDiscoverServiceTimeoutRunnable);
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.postDelayed(com.oudmon.ble.base.bluetooth.BleBaseControl.this.mDiscoverServiceTimeoutRunnable, 40000L);
            } else {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.waitFor(1000L);
                boolean discoverServices = bluetoothGatt.discoverServices();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-------1---" + discoverServices);
                if (!discoverServices) {
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.disconnectDevice(address);
                    return;
                }
            }
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.getAndSet(0);
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.failCount.getAndSet(0);
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.mIsConnected = true;
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.bluetoothTurnOff = false;
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.removeCallbacks(com.oudmon.ble.base.bluetooth.BleBaseControl.this.mReconnectRunnable);
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.bleGattConnected(bluetoothGatt.getDevice());
            }
        }

        public void disconnectDeviceNotClose(java.lang.String str) {
            final android.bluetooth.BluetoothGatt bluetoothGatt;
            try {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.connecting = false;
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.mIsConnected = false;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, str + "  gatt map size:" + com.oudmon.ble.base.bluetooth.BleBaseControl.this.mBluetoothGatt.size());
                if (!com.oudmon.ble.base.bluetooth.BleBaseControl.this.mBluetoothGatt.containsKey(str) || (bluetoothGatt = com.oudmon.ble.base.bluetooth.BleBaseControl.this.mBluetoothGatt.get(str)) == null) {
                    return;
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "gatt disconnect it");
                bluetoothGatt.disconnect();
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.postDelayed(new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleBaseControl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.oudmon.ble.base.bluetooth.BleBaseControl.this.refreshDeviceCache(bluetoothGatt);
                    }
                }, 500L);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }

        private void reconnectFromStateChangeNoAutoConnect() {
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.postDelayed(new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleBaseControl.1.2
                @Override // java.lang.Runnable
                public void run() {
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.reconnectDevice();
                }
            }, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.removeCallbacks(com.oudmon.ble.base.bluetooth.BleBaseControl.this.mDiscoverServiceTimeoutRunnable);
            if (i != 0) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.disconnectDevice(address);
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattService> it = bluetoothGatt.getServices().iterator();
            while (it.hasNext()) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "servicesUUID:" + it.next().getUuid().toString());
            }
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.connecting = false;
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.bleServiceDiscovered(i, address);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            com.oudmon.ble.base.util.LogToFile.getInstance().wtfWrite(com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bluetoothGattCharacteristic.getValue()));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "app->device：" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bluetoothGattCharacteristic.getValue()));
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.bleCharacteristicWrite(bluetoothGatt.getDevice().getAddress(), bluetoothGattCharacteristic.getUuid().toString(), i, bluetoothGattCharacteristic.getValue());
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.bleCharacteristicRead(bluetoothGatt.getDevice().getAddress(), bluetoothGattCharacteristic.getUuid().toString(), i, bluetoothGattCharacteristic.getValue());
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            com.oudmon.ble.base.util.LogToFile.getInstance().wtfNotify(com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bluetoothGattCharacteristic.getValue()));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "device->app：" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bluetoothGattCharacteristic.getValue()));
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.bleCharacteristicChanged(bluetoothGatt.getDevice().getAddress(), bluetoothGattCharacteristic.getUuid().toString(), bluetoothGattCharacteristic.getValue());
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            }
            if (i == 0) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.checkIsNotifyConfigAndRegisterCallback(bluetoothGattDescriptor, bluetoothGatt);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.onReadRemoteRssi(bluetoothGatt, i, i2);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onMtuChanged(bluetoothGatt, i, i2);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, i + "");
        }
    };
    private java.lang.Runnable mDiscoverServiceTimeoutRunnable = new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleBaseControl.4
        @Override // java.lang.Runnable
        public void run() {
            com.oudmon.ble.base.bluetooth.BleBaseControl bleBaseControl2 = com.oudmon.ble.base.bluetooth.BleBaseControl.this;
            bleBaseControl2.disconnectDevice(bleBaseControl2.mDeviceAddress);
        }
    };
    private java.lang.Runnable mTimeoutRunnable = new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleBaseControl.6
        @Override // java.lang.Runnable
        public void run() {
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.mIsConnected = false;
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.connecting = false;
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "没有收到系统回调，直接断开");
            com.oudmon.ble.base.bluetooth.BleBaseControl bleBaseControl2 = com.oudmon.ble.base.bluetooth.BleBaseControl.this;
            bleBaseControl2.disconnectDevice(bleBaseControl2.mDeviceAddress);
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener != null) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.listener.bleNoCallback();
            }
        }
    };
    private java.lang.Runnable mReconnectRunnable = new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleBaseControl.7
        @Override // java.lang.Runnable
        public void run() {
            if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.get() < com.oudmon.ble.base.bluetooth.BleBaseControl.this.maxReconnect) {
                com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.incrementAndGet();
                com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "正在重连,重连次数：" + com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.get());
                com.oudmon.ble.base.bluetooth.BleBaseControl bleBaseControl2 = com.oudmon.ble.base.bluetooth.BleBaseControl.this;
                bleBaseControl2.connect(bleBaseControl2.mDeviceAddress);
                return;
            }
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.connecting = false;
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "超出了重连次数:" + com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.get());
        }
    };

    public void setBluetoothTurnOff(boolean z) {
        this.bluetoothTurnOff = z;
        if (z) {
            return;
        }
        this.mIsConnected = false;
        this.connecting = false;
    }

    public boolean ismIsConnected() {
        return this.mIsConnected;
    }

    public static com.oudmon.ble.base.bluetooth.BleBaseControl getInstance() {
        return bleBaseControl;
    }

    public static com.oudmon.ble.base.bluetooth.BleBaseControl getInstance(android.content.Context context) {
        if (bleBaseControl == null) {
            synchronized (com.oudmon.ble.base.bluetooth.BleBaseControl.class) {
                if (bleBaseControl == null) {
                    bleBaseControl = new com.oudmon.ble.base.bluetooth.BleBaseControl(context);
                }
            }
        }
        return bleBaseControl;
    }

    public android.content.Context getmContext() {
        return this.mContext;
    }

    public void setmContext(android.content.Context context) {
        this.mContext = context;
    }

    private BleBaseControl(android.content.Context context) {
        this.mContext = context;
        initialize();
    }

    private void initialize() {
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) this.mContext.getSystemService("bluetooth");
        if (bluetoothManager != null) {
            this.mBluetoothAdapter = bluetoothManager.getAdapter();
        } else {
            android.util.Log.e(TAG, "Unable to initialize BluetoothManager...");
        }
    }

    private class SystemProxyTimeoutRunnable implements java.lang.Runnable {
        private SystemProxyTimeoutRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.oudmon.ble.base.bluetooth.BleBaseControl.this.doConnectClone();
        }
    }

    private void reconnectFromStateChange(java.lang.String str) {
        this.mHandler.removeCallbacks(this.systemProxyTimeoutRunnable);
        this.mHandler.postDelayed(this.systemProxyTimeoutRunnable, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doConnectClone() {
        boolean isBackground = com.oudmon.ble.base.util.AppUtil.isBackground(this.mContext);
        boolean isApplicationBroughtToBackground = com.oudmon.ble.base.util.AppUtil.isApplicationBroughtToBackground(this.mContext);
        if (isBackground || isApplicationBroughtToBackground) {
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "后台重连调用");
            doConnect();
        } else {
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "前台重连调用");
            com.oudmon.ble.base.scan.BleScannerHelper.getInstance().scanTheDevice(this.mContext, this.mDeviceAddress, new com.oudmon.ble.base.scan.OnTheScanResult() { // from class: com.oudmon.ble.base.bluetooth.BleBaseControl.2
                @Override // com.oudmon.ble.base.scan.OnTheScanResult
                public void onResult(android.bluetooth.BluetoothDevice bluetoothDevice) {
                    if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.get() >= com.oudmon.ble.base.bluetooth.BleBaseControl.this.maxReconnect) {
                        com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.getAndSet(0);
                    }
                    if (bluetoothDevice != null) {
                        com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.postDelayed(com.oudmon.ble.base.bluetooth.BleBaseControl.this.mReconnectRunnable, 200L);
                        return;
                    }
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.connecting = false;
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.incrementAndGet();
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.doConnect();
                }

                @Override // com.oudmon.ble.base.scan.OnTheScanResult
                public void onScanFailed(int i) {
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.connecting = false;
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.incrementAndGet();
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.doConnect();
                }
            });
        }
    }

    public void reconnectOpeningUp() {
        if (this.count.get() >= this.maxReconnect) {
            this.count.getAndSet(0);
        }
        if (this.failCount.get() >= this.maxFail) {
            this.failCount.getAndSet(0);
        }
        this.isNeedReconnect = true;
        reconnectDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reconnectDevice() {
        synchronized (com.oudmon.ble.base.bluetooth.BleBaseControl.class) {
            if (!this.isNeedReconnect) {
                this.connecting = false;
                return;
            }
            if (com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(this.mContext) && !android.text.TextUtils.isEmpty(this.mDeviceAddress)) {
                if (this.failCount.get() >= this.maxFail) {
                    this.mIsConnected = false;
                    this.connecting = false;
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "内部失败循环大于" + this.maxFail + "次直接返回");
                    return;
                }
                if (!isConnecting() && !ismIsConnected()) {
                    this.mHandler.removeCallbacks(this.mReconnectRunnable);
                    if (com.oudmon.ble.base.scan.BleScannerCompat.getScanner(this.mContext).isScanning()) {
                        return;
                    }
                    doConnectClone();
                    return;
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "正在连接:" + isConnecting() + " 已经连上:" + ismIsConnected());
                return;
            }
            this.mIsConnected = false;
            this.connecting = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doConnect() {
        if (!this.isNeedReconnect) {
            this.connecting = false;
            return;
        }
        if (this.count.get() % 3 == 0 && !this.bluetoothTurnOff) {
            this.mHandler.postDelayed(this.mReconnectRunnable, 1000L);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "--直连");
        } else {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "--扫连");
            this.bluetoothTurnOff = false;
            com.oudmon.ble.base.scan.BleScannerHelper.getInstance().scanTheDevice(this.mContext, this.mDeviceAddress, new com.oudmon.ble.base.scan.OnTheScanResult() { // from class: com.oudmon.ble.base.bluetooth.BleBaseControl.3
                @Override // com.oudmon.ble.base.scan.OnTheScanResult
                public void onResult(android.bluetooth.BluetoothDevice bluetoothDevice) {
                    if (com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.get() >= com.oudmon.ble.base.bluetooth.BleBaseControl.this.maxReconnect) {
                        com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.getAndSet(0);
                    }
                    if (bluetoothDevice != null) {
                        com.oudmon.ble.base.bluetooth.BleBaseControl.this.mHandler.postDelayed(com.oudmon.ble.base.bluetooth.BleBaseControl.this.mReconnectRunnable, 200L);
                        return;
                    }
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.connecting = false;
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.incrementAndGet();
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.doConnect();
                }

                @Override // com.oudmon.ble.base.scan.OnTheScanResult
                public void onScanFailed(int i) {
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.connecting = false;
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.count.incrementAndGet();
                    com.oudmon.ble.base.bluetooth.BleBaseControl.this.doConnect();
                }
            });
        }
    }

    public boolean connect(java.lang.String str) {
        android.bluetooth.BluetoothGatt connectGatt;
        if (!com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(this.mContext)) {
            this.connecting = false;
            this.isNeedReconnect = false;
            return false;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "address 空返回");
            this.mIsConnected = false;
            this.connecting = false;
            return false;
        }
        if (isConnecting() || ismIsConnected()) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "再次检查的时候返回了");
            return false;
        }
        this.mHandler.removeCallbacks(this.mTimeoutRunnable);
        this.mHandler.postDelayed(this.mTimeoutRunnable, 40000L);
        this.connecting = true;
        this.isNeedReconnect = true;
        com.oudmon.ble.base.scan.BleScannerHelper.getInstance().stopScan(this.mContext);
        this.mDeviceAddress = str;
        android.bluetooth.BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(str);
        com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "---------------【开始GATT连接】--------------");
        com.oudmon.ble.base.util.LogToFile.getInstance().wtfStatus("正在连接手表，等系统回调");
        com.oudmon.ble.base.bluetooth.IBleListener iBleListener = this.listener;
        if (iBleListener != null) {
            iBleListener.startConnect();
        }
        if (android.os.Build.VERSION.SDK_INT > 23) {
            if (android.os.Build.VERSION.SDK_INT >= 31 && androidx.core.app.ActivityCompat.checkSelfPermission(this.mContext, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) != 0) {
                return false;
            }
            connectGatt = remoteDevice.connectGatt(this.mContext, false, this.mGattCallback, 2);
        } else {
            connectGatt = remoteDevice.connectGatt(this.mContext, false, this.mGattCallback);
        }
        if (connectGatt == null) {
            this.mBluetoothGatt.remove(str);
            return false;
        }
        this.mBluetoothGatt.put(str, connectGatt);
        return true;
    }

    public void disconnectDevice(java.lang.String str) {
        try {
            this.connecting = false;
            this.mIsConnected = false;
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, str + "  gatt map size:" + this.mBluetoothGatt.size());
            for (final android.bluetooth.BluetoothGatt bluetoothGatt : this.mBluetoothGatt.values()) {
                if (bluetoothGatt != null) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "gatt disconnect it");
                    if (android.os.Build.VERSION.SDK_INT >= 31 && androidx.core.app.ActivityCompat.checkSelfPermission(this.mContext, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) != 0) {
                        return;
                    }
                    bluetoothGatt.disconnect();
                    this.mHandler.postDelayed(new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleBaseControl.5
                        @Override // java.lang.Runnable
                        public void run() {
                            com.oudmon.ble.base.bluetooth.BleBaseControl.this.refreshDeviceCache(bluetoothGatt);
                            if (android.os.Build.VERSION.SDK_INT < 31 || androidx.core.app.ActivityCompat.checkSelfPermission(com.oudmon.ble.base.bluetooth.BleBaseControl.this.mContext, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) == 0) {
                                bluetoothGatt.close();
                            }
                        }
                    }, 500L);
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public android.bluetooth.BluetoothGatt getGatt(java.lang.String str) {
        android.bluetooth.BluetoothGatt bluetoothGatt;
        if (!this.mBluetoothGatt.containsKey(str) || (bluetoothGatt = this.mBluetoothGatt.get(str)) == null) {
            return null;
        }
        return bluetoothGatt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyMyAll() {
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitFor(long j) {
        synchronized (this.mLock) {
            try {
                this.mLock.wait(j);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected boolean refreshDeviceCache(android.bluetooth.BluetoothGatt bluetoothGatt) {
        if (!com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(this.mContext)) {
            return false;
        }
        try {
            java.lang.reflect.Method method = android.bluetooth.BluetoothGatt.class.getMethod("refresh", new java.lang.Class[0]);
            if (method != null) {
                boolean booleanValue = ((java.lang.Boolean) method.invoke(bluetoothGatt, new java.lang.Object[0])).booleanValue();
                com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "Refreshing result: " + booleanValue);
                return booleanValue;
            }
        } catch (java.lang.Exception e) {
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "An exception occured while refreshing device " + e.toString());
        }
        return false;
    }

    public void setNeedReconnect(boolean z) {
        this.isNeedReconnect = z;
    }

    public void setmDeviceAddress(java.lang.String str) {
        this.mDeviceAddress = str;
    }

    public java.lang.String getmDeviceAddress() {
        return this.mDeviceAddress;
    }

    public com.oudmon.ble.base.bluetooth.IBleListener getListener() {
        return this.listener;
    }

    public void setListener(com.oudmon.ble.base.bluetooth.IBleListener iBleListener) {
        this.listener = iBleListener;
    }

    public boolean isConnecting() {
        return this.connecting;
    }

    public void setRtkBindTag(java.lang.Boolean bool) {
        this.rtkBindTag = bool;
    }

    public android.bluetooth.BluetoothGattCharacteristic findTheGattCharacteristic(java.util.UUID uuid, java.util.UUID uuid2) {
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic = this.cacheGattCharacteristicHashMap.get(uuid2);
        if (bluetoothGattCharacteristic != null) {
            return bluetoothGattCharacteristic;
        }
        android.bluetooth.BluetoothGattCharacteristic initTheCharacteristic = initTheCharacteristic(uuid, uuid2);
        if (initTheCharacteristic != null) {
            this.cacheGattCharacteristicHashMap.put(uuid2, initTheCharacteristic);
        }
        return initTheCharacteristic;
    }

    private android.bluetooth.BluetoothGattCharacteristic initTheCharacteristic(java.util.UUID uuid, java.util.UUID uuid2) {
        android.bluetooth.BluetoothGatt gatt;
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return null;
        }
        java.lang.String str = getInstance().getmDeviceAddress();
        if (android.text.TextUtils.isEmpty(str) || (gatt = getInstance().getGatt(str)) == null) {
            return null;
        }
        android.bluetooth.BluetoothGattService service = gatt.getService(uuid);
        if (service == null) {
            android.util.Log.e(TAG, "initTheCharacteristic: can't find service uuid=" + uuid);
            return null;
        }
        return service.getCharacteristic(uuid2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsNotifyConfigAndRegisterCallback(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, android.bluetooth.BluetoothGatt bluetoothGatt) {
        byte[] value;
        com.oudmon.ble.base.bluetooth.IBleListener iBleListener;
        if (bluetoothGattDescriptor.getUuid().compareTo(com.oudmon.ble.base.communication.Constants.GATT_NOTIFY_CONFIG) == 0 && (value = bluetoothGattDescriptor.getValue()) != null && value.length == 2 && value[1] == 0 && value[0] == 1 && (iBleListener = this.listener) != null) {
            iBleListener.bleCharacteristicNotification();
        }
    }

    public void unBondedDevice(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            android.bluetooth.BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(str);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, remoteDevice);
            java.lang.reflect.Method method = null;
            try {
                try {
                    method = android.bluetooth.BluetoothDevice.class.getMethod("removeBond", new java.lang.Class[0]);
                    method.invoke(remoteDevice, new java.lang.Object[0]);
                } catch (java.lang.IllegalAccessException e) {
                    e.printStackTrace();
                }
            } catch (java.lang.NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
            method.setAccessible(true);
        } catch (java.lang.Exception e4) {
            e4.printStackTrace();
        }
    }

    public boolean classicBluetoothScan() {
        try {
            if (this.mBluetoothAdapter.isDiscovering()) {
                this.mBluetoothAdapter.cancelDiscovery();
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "------扫描");
            return this.mBluetoothAdapter.startDiscovery();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean cancelScanBluetooth() {
        try {
            return this.mBluetoothAdapter.cancelDiscovery();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void createBondBlueTooth(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return;
        }
        try {
            if (this.mBluetoothAdapter.isDiscovering()) {
                this.mBluetoothAdapter.cancelDiscovery();
            }
            if (bluetoothDevice.getBondState() == 10) {
                try {
                    com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "是否配对成功：" + bluetoothDevice.createBond());
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "配对失败：");
                }
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean createBond(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
        if (bluetoothDevice == null) {
            return false;
        }
        try {
            java.lang.reflect.Method declaredMethod = bluetoothDevice.getClass().getDeclaredMethod("createBond", java.lang.Integer.TYPE);
            declaredMethod.setAccessible(true);
            java.lang.Object invoke = declaredMethod.invoke(bluetoothDevice, java.lang.Integer.valueOf(i));
            if (invoke instanceof java.lang.Boolean) {
                return ((java.lang.Boolean) invoke).booleanValue();
            }
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean createBond(android.content.Context context, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return bluetoothDevice.createBond();
        }
        try {
            java.lang.Object invoke = bluetoothDevice.getClass().getMethod("createBond", new java.lang.Class[0]).invoke(bluetoothDevice, new java.lang.Object[0]);
            if (invoke instanceof java.lang.Boolean) {
                return ((java.lang.Boolean) invoke).booleanValue();
            }
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "Invoke createBond : " + e.getMessage());
            return false;
        }
    }
}
