package com.oudmon.ble.base.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public class BleOperateManager extends android.os.HandlerThread implements com.oudmon.ble.base.bluetooth.IBleListener {
    private static final java.lang.String TAG = "BleOperateManager";
    private static com.oudmon.ble.base.bluetooth.BleOperateManager bleOperateManager;
    private android.app.Application application;
    private com.oudmon.ble.base.bluetooth.OnGattEventCallback callback;
    private com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener deviceNotifyListener;
    private com.oudmon.ble.base.communication.responseImpl.DeviceSportNotifyListener deviceSportNotifyListener;
    private com.oudmon.ble.base.communication.responseImpl.InnerCameraNotifyListener innerCameraNotifyListener;
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.oudmon.ble.base.request.LocalWriteRequest> localWriteRequestConcurrentHashMap;
    private final android.content.Context mContext;
    private final java.lang.Object mLock;
    private boolean mRequestCompleted;
    private final android.os.Handler mainThreadHandler;
    private com.oudmon.ble.base.bluetooth.spp.MyBumblebeeCallback mySppCallback;
    private android.util.SparseArray<com.oudmon.ble.base.communication.ICommandResponse> notifySparseArray;
    private java.lang.String reConnectMac;
    private boolean ready;
    java.lang.Runnable runnable;
    java.lang.Runnable runnableEnable;
    private com.realsil.sdk.bbpro.BumblebeeCallback sppCallback;
    private android.os.Handler workThreadHandler;

    public static com.oudmon.ble.base.bluetooth.BleOperateManager getInstance(android.app.Application application) {
        if (bleOperateManager == null) {
            synchronized (com.oudmon.ble.base.bluetooth.BleOperateManager.class) {
                if (bleOperateManager == null) {
                    bleOperateManager = new com.oudmon.ble.base.bluetooth.BleOperateManager(application);
                }
            }
        }
        return bleOperateManager;
    }

    public void setApplication(android.app.Application application) {
        this.application = application;
    }

    public java.lang.String getReConnectMac() {
        return this.reConnectMac;
    }

    public void setReConnectMac(java.lang.String str) {
        this.reConnectMac = str;
    }

    public void setCallback(com.oudmon.ble.base.bluetooth.OnGattEventCallback onGattEventCallback) {
        this.callback = onGattEventCallback;
    }

    public static com.oudmon.ble.base.bluetooth.BleOperateManager getInstance() {
        return bleOperateManager;
    }

    private BleOperateManager(android.content.Context context) {
        super(TAG);
        this.mainThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.mLock = new java.lang.Object();
        this.mRequestCompleted = false;
        this.localWriteRequestConcurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
        this.notifySparseArray = new android.util.SparseArray<>();
        this.deviceNotifyListener = new com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener();
        this.deviceSportNotifyListener = new com.oudmon.ble.base.communication.responseImpl.DeviceSportNotifyListener();
        this.runnable = new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleOperateManager.2
            @Override // java.lang.Runnable
            public void run() {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---lock timeout---");
                com.oudmon.ble.base.bluetooth.BleOperateManager.this.mRequestCompleted = true;
                com.oudmon.ble.base.bluetooth.BleOperateManager.this.notifyLock();
            }
        };
        this.runnableEnable = new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleOperateManager.6
            @Override // java.lang.Runnable
            public void run() {
                com.oudmon.ble.base.bluetooth.BleOperateManager.this.mRequestCompleted = true;
                com.oudmon.ble.base.bluetooth.BleOperateManager.this.notifyLock();
                com.oudmon.ble.base.bluetooth.BleOperateManager.this.enableUUID();
            }
        };
        this.sppCallback = new com.realsil.sdk.bbpro.BumblebeeCallback() { // from class: com.oudmon.ble.base.bluetooth.BleOperateManager.7
            @Override // com.realsil.sdk.bbpro.BumblebeeCallback
            public void onStateChanged(int i) {
                super.onStateChanged(i);
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback != null) {
                    com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback.onStateChanged(com.realsil.sdk.bbpro.BeeProManager.getInstance(com.oudmon.ble.base.bluetooth.BleOperateManager.this.application).getState());
                }
            }

            @Override // com.realsil.sdk.bbpro.BumblebeeCallback
            public void onServiceConnectionStateChanged(boolean z) {
                super.onServiceConnectionStateChanged(z);
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback != null) {
                    com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback.onServiceConnectionStateChanged(z);
                }
            }

            @Override // com.realsil.sdk.bbpro.BumblebeeCallback
            public void onConnectionStateChanged(android.bluetooth.BluetoothDevice bluetoothDevice, int i, int i2) {
                super.onConnectionStateChanged(bluetoothDevice, i, i2);
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback != null) {
                    com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback.onConnectionStateChanged(bluetoothDevice, i, i2);
                }
            }

            @Override // com.realsil.sdk.bbpro.BumblebeeCallback
            public void onDeviceInfoChanged(com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo, int i) {
                super.onDeviceInfoChanged(deviceInfo, i);
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback != null) {
                    com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback.onDeviceInfoChanged((com.oudmon.ble.base.bluetooth.spp.bean.MyDeviceInfo) deviceInfo, i);
                }
            }

            @Override // com.realsil.sdk.bbpro.BumblebeeCallback
            public void onAckReceived(int i, byte b) {
                super.onAckReceived(i, b);
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback != null) {
                    com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback.onAckReceived(i, b);
                }
            }

            @Override // com.realsil.sdk.bbpro.BumblebeeCallback
            public void onEventReported(int i, byte[] bArr) {
                super.onEventReported(i, bArr);
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback != null) {
                    com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySppCallback.onEventReported(i, bArr);
                }
            }
        };
        this.mContext = context;
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance(context).setListener(this);
        this.innerCameraNotifyListener = new com.oudmon.ble.base.communication.responseImpl.InnerCameraNotifyListener(context);
        this.notifySparseArray.put(29, new com.oudmon.ble.base.communication.responseImpl.MusicCommandListener(context));
        this.notifySparseArray.put(2, this.innerCameraNotifyListener);
        this.notifySparseArray.put(47, new com.oudmon.ble.base.communication.responseImpl.PackageLengthListener());
        this.notifySparseArray.put(115, this.deviceNotifyListener);
        this.notifySparseArray.put(120, this.deviceSportNotifyListener);
        start();
        this.workThreadHandler = new android.os.Handler(getLooper());
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.oudmon.ble.base.request.LocalWriteRequest> getLocalWriteRequestConcurrentHashMap() {
        return this.localWriteRequestConcurrentHashMap;
    }

    public void setBluetoothTurnOff(boolean z) {
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().setBluetoothTurnOff(z);
    }

    public void addOutCameraListener(com.oudmon.ble.base.communication.ICommandResponse iCommandResponse) {
        this.innerCameraNotifyListener.setOutRspIOdmOpResponse(iCommandResponse);
    }

    public void removeOutCameraListener() {
        this.innerCameraNotifyListener.setOutRspIOdmOpResponse(null);
    }

    public void addSportDeviceListener(int i, com.oudmon.ble.base.communication.ICommandResponse iCommandResponse) {
        this.deviceSportNotifyListener.setOutRspIOdmOpResponse(i, iCommandResponse);
    }

    public void removeSportDeviceListener(int i) {
        this.deviceSportNotifyListener.removeCallback(i);
    }

    public void addOutDeviceListener(int i, com.oudmon.ble.base.communication.ICommandResponse iCommandResponse) {
        this.deviceNotifyListener.setOutRspIOdmOpResponse(i, iCommandResponse);
    }

    public void removeOutDeviceListener(int i) {
        this.deviceNotifyListener.removeCallback(i);
    }

    public void removeOthersListener() {
        this.deviceNotifyListener.removeOtherCallbacks();
    }

    public boolean addNotifyListener(int i, com.oudmon.ble.base.communication.ICommandResponse iCommandResponse) {
        if (iCommandResponse == null) {
            return false;
        }
        this.notifySparseArray.put(i, iCommandResponse);
        return true;
    }

    public void removeNotifyListener(int i) {
        this.notifySparseArray.delete(i);
    }

    public android.util.SparseArray<com.oudmon.ble.base.communication.ICommandResponse> getNotifySparseArray() {
        return this.notifySparseArray;
    }

    public void unBindDevice() {
        setNeedConnect(false);
        disconnect();
        setMacNull();
    }

    public void setMacNull() {
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().setmDeviceAddress(null);
    }

    public void connectDirectly(java.lang.String str) {
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().connect(str);
    }

    public void connectWithScan(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(this.reConnectMac)) {
            return;
        }
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().setNeedReconnect(true);
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().setmDeviceAddress(str);
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().reconnectOpeningUp();
    }

    public void disconnect() {
        this.ready = false;
        com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "disconnect...");
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().disconnectDevice(com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().getmDeviceAddress());
    }

    public void setNeedConnect(boolean z) {
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().setNeedReconnect(z);
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public boolean execute(final com.oudmon.ble.base.request.BaseRequest baseRequest) {
        if (!com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(this.mContext)) {
            android.util.Log.e(TAG, "connectDirectly: 蓝牙未打开");
            return false;
        }
        if (!com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().ismIsConnected()) {
            return false;
        }
        if (baseRequest.writeRequest && !this.ready) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "----初始化未完成----");
            return false;
        }
        this.workThreadHandler.postDelayed(this.runnable, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
        this.workThreadHandler.post(new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleOperateManager.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (com.oudmon.ble.base.bluetooth.BleOperateManager.this.mLock) {
                    try {
                        if (baseRequest.needInitCharacteristic()) {
                            android.bluetooth.BluetoothGattCharacteristic findTheGattCharacteristic = com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().findTheGattCharacteristic(baseRequest.getServiceUuid(), baseRequest.getCharUuid());
                            if (findTheGattCharacteristic == null) {
                                return;
                            }
                            if (!baseRequest.execute(com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().getGatt(com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().getmDeviceAddress()), findTheGattCharacteristic)) {
                                com.oudmon.ble.base.bluetooth.BleOperateManager.this.notifyLock();
                            }
                        } else {
                            boolean execute = baseRequest.execute(com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().getGatt(com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().getmDeviceAddress()), null);
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(execute));
                            if (!execute) {
                                com.oudmon.ble.base.bluetooth.BleOperateManager.this.notifyLock();
                            }
                        }
                        com.oudmon.ble.base.bluetooth.BleOperateManager.this.mRequestCompleted = false;
                        if (com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().ismIsConnected()) {
                            com.oudmon.ble.base.bluetooth.BleOperateManager.this.waitUntilActionResponse();
                        }
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitUntilActionResponse() {
        while (!this.mRequestCompleted) {
            try {
                this.mLock.wait();
            } catch (java.lang.Exception e) {
                android.util.Log.e(TAG, "Sleeping interrupted", e);
                return;
            }
        }
    }

    protected void notifyLock() {
        this.workThreadHandler.removeCallbacks(this.runnable);
        synchronized (this.mLock) {
            this.mRequestCompleted = true;
            this.mLock.notifyAll();
        }
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void onDescriptorRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        notifyLock();
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        notifyLock();
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public boolean isConnected() {
        boolean ismIsConnected = com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().ismIsConnected();
        if (!ismIsConnected) {
            this.ready = false;
        }
        return ismIsConnected;
    }

    public boolean isReady() {
        return this.ready;
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void onReadRemoteRssi(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
        notifyLock();
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void startConnect() {
        mySendBroadcast(new android.content.Intent(com.oudmon.ble.base.bluetooth.BleAction.BLE_START_CONNECT));
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void bleGattConnected(android.bluetooth.BluetoothDevice bluetoothDevice) {
        android.content.Intent intent = new android.content.Intent(com.oudmon.ble.base.bluetooth.BleAction.BLE_GATT_CONNECTED);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_DEVICE, bluetoothDevice);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_ADDR, bluetoothDevice.getAddress());
        mySendBroadcast(intent);
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void bleGattDisconnect(android.bluetooth.BluetoothDevice bluetoothDevice) {
        android.content.Intent intent = new android.content.Intent(com.oudmon.ble.base.bluetooth.BleAction.BLE_GATT_DISCONNECTED);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_DEVICE, bluetoothDevice);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_ADDR, bluetoothDevice.getAddress());
        mySendBroadcast(intent);
        synchronized (this.mLock) {
            this.localWriteRequestConcurrentHashMap.clear();
            notifyLock();
        }
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void bleServiceDiscovered(int i, final java.lang.String str) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---------bleServiceDiscovered address");
        enableUUID();
        this.mainThreadHandler.postDelayed(new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleOperateManager.3
            @Override // java.lang.Runnable
            public void run() {
                com.oudmon.ble.base.bluetooth.BleOperateManager.this.runCommonCmd();
            }
        }, 200L);
        this.mainThreadHandler.postDelayed(new java.lang.Runnable() { // from class: com.oudmon.ble.base.bluetooth.BleOperateManager.4
            @Override // java.lang.Runnable
            public void run() {
                android.content.Intent intent = new android.content.Intent(com.oudmon.ble.base.bluetooth.BleAction.BLE_SERVICE_DISCOVERED);
                intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_ADDR, str);
                com.oudmon.ble.base.bluetooth.BleOperateManager.this.mySendBroadcast(intent);
                com.oudmon.ble.base.bluetooth.BleOperateManager.this.ready = true;
            }
        }, 2500L);
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void bleStatus(int i, int i2) {
        android.content.Intent intent = new android.content.Intent(com.oudmon.ble.base.bluetooth.BleAction.BLE_STATUS);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_BLE_STATUS, i);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_BLE_NEW_STATE, i2);
        mySendBroadcast(intent);
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void bleCharacteristicRead(java.lang.String str, java.lang.String str2, int i, byte[] bArr) {
        android.content.Intent intent = new android.content.Intent(com.oudmon.ble.base.bluetooth.BleAction.BLE_CHARACTERISTIC_READ);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_ADDR, str);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_CHARACTER_UUID, str2);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_STATUS, i);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_VALUE, bArr);
        mySendBroadcast(intent);
        notifyLock();
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void bleCharacteristicNotification() {
        mySendBroadcast(new android.content.Intent(com.oudmon.ble.base.bluetooth.BleAction.BLE_CHARACTERISTIC_DISCOVERED));
        notifyLock();
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void bleCharacteristicWrite(java.lang.String str, java.lang.String str2, int i, byte[] bArr) {
        android.content.Intent intent = new android.content.Intent(com.oudmon.ble.base.bluetooth.BleAction.BLE_CHARACTERISTIC_WRITE);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_ADDR, str);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_CHARACTER_UUID, str2);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_STATUS, i);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_DATA, bArr);
        mySendBroadcast(intent);
        notifyLock();
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void bleCharacteristicChanged(java.lang.String str, java.lang.String str2, byte[] bArr) {
        android.content.Intent intent = new android.content.Intent(com.oudmon.ble.base.bluetooth.BleAction.BLE_CHARACTERISTIC_CHANGED);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_ADDR, str);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_CHARACTER_UUID, str2);
        intent.putExtra(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_VALUE, bArr);
        mySendBroadcast(intent);
        com.oudmon.ble.base.bluetooth.OnGattEventCallback onGattEventCallback = this.callback;
        if (onGattEventCallback != null) {
            onGattEventCallback.onReceivedData(str2, bArr);
        }
    }

    @Override // com.oudmon.ble.base.bluetooth.IBleListener
    public void bleNoCallback() {
        mySendBroadcast(new android.content.Intent(com.oudmon.ble.base.bluetooth.BleAction.BLE_NO_CALLBACK));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mySendBroadcast(android.content.Intent intent) {
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableUUID() {
        this.mainThreadHandler.removeCallbacks(this.runnableEnable);
        this.mainThreadHandler.postDelayed(this.runnableEnable, 4000L);
        com.oudmon.ble.base.request.EnableNotifyRequest enableNotifyRequest = new com.oudmon.ble.base.request.EnableNotifyRequest(com.oudmon.ble.base.communication.Constants.UUID_SERVICE, com.oudmon.ble.base.communication.Constants.UUID_READ, new com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback() { // from class: com.oudmon.ble.base.bluetooth.BleOperateManager.5
            @Override // com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback
            public void enable(boolean z) {
                com.oudmon.ble.base.bluetooth.BleOperateManager.this.mainThreadHandler.removeCallbacks(com.oudmon.ble.base.bluetooth.BleOperateManager.this.runnableEnable);
            }
        });
        enableNotifyRequest.setEnable(true);
        getInstance().execute(enableNotifyRequest);
    }

    public void init() {
        android.content.IntentFilter intentFilter = com.oudmon.ble.base.bluetooth.BleAction.getIntentFilter();
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.mContext).registerReceiver(new com.oudmon.ble.base.bluetooth.QCBluetoothCallbackReceiver(), intentFilter);
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.mContext).registerReceiver(new com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver(), intentFilter);
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.mContext).registerReceiver(new com.oudmon.ble.base.bluetooth.QCBluetoothCallbackBigDataCloneReceiver(), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runCommonCmd() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().execReadCmd(com.oudmon.ble.base.communication.CommandHandle.getInstance().getReadHwRequest());
        com.oudmon.ble.base.communication.CommandHandle.getInstance().execReadCmd(com.oudmon.ble.base.communication.CommandHandle.getInstance().getReadFmRequest());
    }

    public void classicBluetoothStartScan() {
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().classicBluetoothScan();
    }

    public void classicBluetoothStopScan() {
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().cancelScanBluetooth();
    }

    public void createBondBlueTooth(android.bluetooth.BluetoothDevice bluetoothDevice) {
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().createBondBlueTooth(bluetoothDevice);
    }

    public void createBondBluetoothJieLi(android.bluetooth.BluetoothDevice bluetoothDevice) {
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().createBond(bluetoothDevice, 1);
    }

    public void initRTKSPP(android.app.Application application) {
        com.realsil.sdk.core.RtkCore.initialize(application, new com.realsil.sdk.core.RtkConfigure.Builder().debugEnabled(true).printLog(true).logTag("AudioConnect").globalLogLevel(1).build());
        com.realsil.sdk.core.RtkCore.VDBG = true;
        com.realsil.sdk.bbpro.BeeProManager.getInstance(application).initialize(new com.realsil.sdk.bbpro.BeeProParams.Builder().syncDataWhenConnected(true).connectA2dp(true).listenHfp(true).uuid(com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.sppUUID).transport(1).build());
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.initialize(application);
        com.realsil.sdk.bbpro.BeeProManager.getInstance(application).registerModel(com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.getInstance());
    }

    public void connectRtkSPP(android.bluetooth.BluetoothDevice bluetoothDevice) {
        com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().initModelClient();
        int startConnect = com.realsil.sdk.bbpro.BeeProManager.getInstance(this.application).startConnect(new com.realsil.sdk.bbpro.ConnectionParameters.Builder(bluetoothDevice).uuid(com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.sppUUID).transport(1).build());
        com.realsil.sdk.bbpro.BeeProManager.getInstance(this.application).addManagerCallback(this.sppCallback);
        if (startConnect != 0) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "SPP 连接失败");
        }
    }

    public void disconnectSpp() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "rtk disconnect:" + com.realsil.sdk.bbpro.BeeProManager.getInstance(this.application).disconnect().code);
    }

    public android.bluetooth.BluetoothDevice getCurDevice() {
        return com.realsil.sdk.bbpro.BeeProManager.getInstance(this.application).getCurDevice();
    }

    public int getConnectState() {
        return com.realsil.sdk.bbpro.BeeProManager.getInstance(this.application).getConnectState();
    }

    public void registerSppCallback(com.oudmon.ble.base.bluetooth.spp.MyBumblebeeCallback myBumblebeeCallback) {
        this.mySppCallback = myBumblebeeCallback;
    }

    public void removeSppCallback() {
        this.mySppCallback = null;
    }

    public void disconnectRtkSPP() {
        com.realsil.sdk.bbpro.BeeProManager.getInstance(this.application).disconnect();
        com.realsil.sdk.bbpro.BeeProManager.getInstance(this.application).destroy();
    }

    public void setRtkBindTag(java.lang.Boolean bool) {
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance().setRtkBindTag(bool);
    }

    public android.bluetooth.BluetoothDevice getMacSystemBond(java.lang.String str) {
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = android.bluetooth.BluetoothAdapter.getDefaultAdapter().getBondedDevices();
        if (bondedDevices.size() <= 0) {
            return null;
        }
        for (android.bluetooth.BluetoothDevice bluetoothDevice : bondedDevices) {
            if (bluetoothDevice != null && bluetoothDevice.getName() != null && bluetoothDevice.getAddress() != null && !android.text.TextUtils.isEmpty(str) && str.equalsIgnoreCase(bluetoothDevice.getAddress())) {
                return bluetoothDevice;
            }
        }
        return null;
    }
}
