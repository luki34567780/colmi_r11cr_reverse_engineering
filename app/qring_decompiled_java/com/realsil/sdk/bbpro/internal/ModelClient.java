package com.realsil.sdk.bbpro.internal;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class ModelClient<MCB extends com.realsil.sdk.bbpro.internal.ModelClientCallback> {
    public static boolean DBG = true;
    public static final int STATUS_SUCCESS = 0;
    public static boolean VDBG;
    public com.realsil.sdk.bbpro.internal.BaseBeeProManager a;
    public com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer b;
    public java.util.concurrent.ThreadPoolExecutor c;
    public java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.concurrent.CopyOnWriteArrayList<com.realsil.sdk.bbpro.internal.UserTask>> d;
    public android.content.Context mContext;
    public static final java.util.UUID UUID_QUERY_LISTENING_MODE_INFO = com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.fromShortValue(256);
    public static final java.util.UUID UUID_TTS_REGISTER_MODEL = com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.fromShortValue(512);
    public static final java.util.UUID UUID_EQ_QUERY_BASIC_INFO = com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.fromShortValue(768);
    public static final java.util.UUID UUID_QUERY_BUD_INFO = com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.fromShortValue(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
    public java.util.List<MCB> mCallbacks = new java.util.concurrent.CopyOnWriteArrayList();
    public final com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback e = new com.realsil.sdk.bbpro.internal.ModelClient.a();
    public final com.realsil.sdk.bbpro.BumblebeeCallback f = new com.realsil.sdk.bbpro.internal.ModelClient.b();

    public class a extends com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback {
        public a() {
        }

        @Override // com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback
        public void onAckReceive(com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket) {
            super.onAckReceive(ackPacket);
            com.realsil.sdk.bbpro.internal.ModelClient.this.processAckPacket(ackPacket);
        }

        @Override // com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback
        public void onConnectionStateChanged(android.bluetooth.BluetoothDevice bluetoothDevice, boolean z, int i) {
            super.onConnectionStateChanged(bluetoothDevice, z, i);
            com.realsil.sdk.bbpro.internal.ModelClient.this.processConnectionStateChanged(bluetoothDevice, i);
        }

        @Override // com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback
        public void onDataReceive(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket transportLayerPacket) {
            super.onDataReceive(transportLayerPacket);
            com.realsil.sdk.bbpro.internal.ModelClient.this.processEventPacket(transportLayerPacket);
        }
    }

    public class b extends com.realsil.sdk.bbpro.BumblebeeCallback {
        public b() {
        }

        @Override // com.realsil.sdk.bbpro.BumblebeeCallback
        public void onConnectionStateChanged(android.bluetooth.BluetoothDevice bluetoothDevice, int i, int i2) {
            super.onConnectionStateChanged(bluetoothDevice, i, i2);
        }

        @Override // com.realsil.sdk.bbpro.BumblebeeCallback
        public void onDeviceInfoChanged(com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo, int i) {
            super.onDeviceInfoChanged(deviceInfo, i);
            com.realsil.sdk.bbpro.internal.ModelClient.this.processDeviceInfoChanged(deviceInfo, i);
        }

        @Override // com.realsil.sdk.bbpro.BumblebeeCallback
        public void onStateChanged(int i) {
            super.onStateChanged(i);
            if (i == 264) {
                com.realsil.sdk.bbpro.internal.ModelClient.this.registerModel();
            }
            com.realsil.sdk.bbpro.internal.ModelClient.this.notifyStateChanged(i);
        }
    }

    public ModelClient(android.content.Context context) {
        this.d = new java.util.concurrent.ConcurrentHashMap();
        this.mContext = context;
        DBG = com.realsil.sdk.core.RtkCore.DEBUG;
        VDBG = com.realsil.sdk.core.RtkCore.VDBG;
        this.d = new java.util.concurrent.ConcurrentHashMap();
        this.c = new java.util.concurrent.ThreadPoolExecutor(10, 10, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), new java.util.concurrent.ThreadPoolExecutor.AbortPolicy());
        a();
    }

    public com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer a() {
        if (this.b == null) {
            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer sppTransportLayer = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.getInstance();
            this.b = sppTransportLayer;
            sppTransportLayer.register(this.e);
        }
        return this.b;
    }

    public void close() {
        com.realsil.sdk.core.logger.ZLogger.v("clese model");
        java.util.List<MCB> list = this.mCallbacks;
        if (list != null) {
            list.clear();
            this.mCallbacks = null;
        }
        com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = this.a;
        if (baseBeeProManager != null) {
            baseBeeProManager.removeManagerCallback(this.f);
        }
    }

    public void destroy() {
        close();
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.c;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer sppTransportLayer = this.b;
        if (sppTransportLayer != null) {
            sppTransportLayer.unregister(this.e);
            this.b = null;
        }
    }

    public com.realsil.sdk.bbpro.core.BeeError execute(com.realsil.sdk.bbpro.internal.UserTask userTask) {
        if (this.c == null) {
            return new com.realsil.sdk.bbpro.core.BeeError(48, "Executor has not neen initialized");
        }
        if (userTask == null) {
            return new com.realsil.sdk.bbpro.core.BeeError(48, "task can not be null");
        }
        a(userTask);
        this.c.execute(userTask);
        return new com.realsil.sdk.bbpro.core.BeeError(0);
    }

    public int getCmdSetVersion() {
        com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo;
        com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = this.a;
        if (baseBeeProManager == null || (deviceInfo = baseBeeProManager.getDeviceInfo()) == null) {
            return 0;
        }
        return deviceInfo.getCmdSetVersion();
    }

    public com.realsil.sdk.bbpro.internal.UserTask getUserTask(int i, java.util.UUID uuid) {
        java.util.concurrent.CopyOnWriteArrayList<com.realsil.sdk.bbpro.internal.UserTask> copyOnWriteArrayList = this.d.get(java.lang.Integer.valueOf(i));
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            for (com.realsil.sdk.bbpro.internal.UserTask userTask : copyOnWriteArrayList) {
                if (uuid.equals(userTask.getUuid())) {
                    return userTask;
                }
            }
        }
        return null;
    }

    public java.util.List<com.realsil.sdk.bbpro.internal.UserTask> getUserTasks(int i) {
        return this.d.get(java.lang.Integer.valueOf(i));
    }

    public com.realsil.sdk.bbpro.internal.BaseBeeProManager getVendorClient() {
        return this.a;
    }

    public abstract int getVendorCmd();

    public com.realsil.sdk.bbpro.model.DeviceInfo getVendorDeviceInfo() {
        com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = this.a;
        if (baseBeeProManager == null) {
            return null;
        }
        return baseBeeProManager.getDeviceInfo();
    }

    public abstract int getVendorEvent();

    public void notifyOperationComplete(int i, byte b2) {
        java.util.List<MCB> list = this.mCallbacks;
        if (list == null || list.size() <= 0) {
            if (VDBG) {
                com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
            }
        } else {
            java.util.Iterator<MCB> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onOperationComplete(i, b2);
            }
        }
    }

    public void notifyStateChanged(int i) {
        java.util.List<MCB> list = this.mCallbacks;
        if (list == null || list.size() <= 0) {
            if (VDBG) {
                com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
            }
        } else {
            java.util.Iterator<MCB> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onStateChanged(i);
            }
        }
    }

    public boolean processAckPacket(com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket) {
        return false;
    }

    public void processConnectionStateChanged(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
    }

    public void processDeviceInfoChanged(com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo, int i) {
    }

    public boolean processEvent(byte[] bArr) {
        return false;
    }

    public boolean processEventPacket(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket transportLayerPacket) {
        return false;
    }

    public boolean processStatusReport(byte b2, byte[] bArr) {
        return false;
    }

    public void registerCallback(MCB mcb) {
        if (mcb == null) {
            return;
        }
        if (this.mCallbacks == null) {
            this.mCallbacks = new java.util.concurrent.CopyOnWriteArrayList();
        }
        if (!this.mCallbacks.contains(mcb)) {
            this.mCallbacks.add(mcb);
        }
        com.realsil.sdk.core.logger.ZLogger.v(VDBG, "mCallbacks.size=" + this.mCallbacks.size());
    }

    public com.realsil.sdk.bbpro.core.BeeError registerModel() {
        return new com.realsil.sdk.bbpro.core.BeeError(0);
    }

    public void removeTask(com.realsil.sdk.bbpro.internal.UserTask userTask) {
        if (this.d == null) {
            this.d = new java.util.concurrent.ConcurrentHashMap();
        }
        userTask.stopSubTask();
        java.util.concurrent.CopyOnWriteArrayList<com.realsil.sdk.bbpro.internal.UserTask> copyOnWriteArrayList = this.d.get(java.lang.Integer.valueOf(userTask.getOpcode()));
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(userTask);
        }
        this.d.put(java.lang.Integer.valueOf(userTask.getOpcode()), copyOnWriteArrayList);
    }

    public com.realsil.sdk.bbpro.core.BeeError sendAppReq(com.realsil.sdk.bbpro.profile.AppReq appReq) {
        if (VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v(appReq.toString());
        }
        return this.b.sendCommand(appReq.encode(getCmdSetVersion())) ? new com.realsil.sdk.bbpro.core.BeeError(0) : new com.realsil.sdk.bbpro.core.BeeError(1, "sendCommand failed");
    }

    public com.realsil.sdk.bbpro.core.BeeError sendVendorData(byte[] bArr) {
        if (bArr == null) {
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = this.a;
        return baseBeeProManager == null ? new com.realsil.sdk.bbpro.core.BeeError(16) : baseBeeProManager.sendVendorCommand(bArr);
    }

    public void setup(com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager) {
        this.a = baseBeeProManager;
        if (baseBeeProManager != null) {
            baseBeeProManager.addManagerCallback(this.f);
        }
    }

    public void unregisterCallback(MCB mcb) {
        java.util.List<MCB> list = this.mCallbacks;
        if (list != null) {
            list.remove(mcb);
        }
    }

    public void updateUserTasks(java.util.UUID uuid, byte b2) {
        com.realsil.sdk.bbpro.internal.UserTask userTask;
        if (this.d == null || (userTask = getUserTask(uuid)) == null) {
            return;
        }
        userTask.notiyTaskUpdate(b2);
        if (userTask.isLastAction()) {
            removeTask(userTask);
        }
    }

    public final void a(com.realsil.sdk.bbpro.internal.UserTask userTask) {
        if (this.d == null) {
            this.d = new java.util.concurrent.ConcurrentHashMap();
        }
        java.util.concurrent.CopyOnWriteArrayList<com.realsil.sdk.bbpro.internal.UserTask> copyOnWriteArrayList = this.d.get(java.lang.Integer.valueOf(userTask.getOpcode()));
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList<>();
        }
        if (!copyOnWriteArrayList.contains(userTask)) {
            copyOnWriteArrayList.add(userTask);
        }
        com.realsil.sdk.core.logger.ZLogger.v(VDBG, java.lang.String.format(java.util.Locale.US, "contains %d sub tasks", java.lang.Integer.valueOf(copyOnWriteArrayList.size())));
        this.d.put(java.lang.Integer.valueOf(userTask.getOpcode()), copyOnWriteArrayList);
    }

    public com.realsil.sdk.bbpro.internal.UserTask getUserTask(java.util.UUID uuid) {
        java.util.Iterator<java.lang.Integer> it = this.d.keySet().iterator();
        while (it.hasNext()) {
            com.realsil.sdk.bbpro.internal.UserTask userTask = getUserTask(it.next().intValue(), uuid);
            if (userTask != null) {
                return userTask;
            }
        }
        return null;
    }

    public com.realsil.sdk.bbpro.core.BeeError sendVendorData(com.realsil.sdk.bbpro.core.transportlayer.Command command) {
        com.realsil.sdk.bbpro.internal.BaseBeeProManager baseBeeProManager = this.a;
        if (baseBeeProManager == null) {
            return new com.realsil.sdk.bbpro.core.BeeError(16);
        }
        return baseBeeProManager.sendVendorCommand(command);
    }
}
