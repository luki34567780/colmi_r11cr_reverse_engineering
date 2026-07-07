package com.realsil.sdk.core.c;

/* loaded from: classes3.dex */
public class b {
    public static boolean CLOSE_GATT_ENABLED = true;
    public static boolean DUMP_SERVICE = false;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 0;
    public boolean a;
    public boolean b;
    public android.bluetooth.BluetoothManager c;
    public android.bluetooth.BluetoothAdapter d;
    public volatile boolean i;
    public android.content.Context k;
    public com.realsil.sdk.core.bluetooth.RtkBluetoothManager l;
    public static int SDK_INT = android.os.Build.VERSION.SDK_INT;
    public static final java.lang.String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static final java.util.UUID CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID = java.util.UUID.fromString(CLIENT_CHARACTERISTIC_CONFIG);
    public final java.lang.Object j = new java.lang.Object();
    public final com.realsil.sdk.core.c.b.a m = new com.realsil.sdk.core.c.b.a();
    public java.util.HashMap<java.lang.String, android.bluetooth.BluetoothGatt> f = new java.util.HashMap<>();
    public java.util.HashMap<java.lang.String, java.lang.Integer> h = new java.util.HashMap<>();
    public java.util.HashMap<java.lang.String, java.util.List<android.bluetooth.BluetoothGattCallback>> g = new java.util.HashMap<>();
    public java.util.List<java.lang.String> e = new java.util.concurrent.CopyOnWriteArrayList();

    public class a extends com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback {
        public a() {
        }

        @Override // com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback
        public final void onBluetoothStateChanged(int i) {
            super.onBluetoothStateChanged(i);
            com.realsil.sdk.core.c.b.a(com.realsil.sdk.core.c.b.this, i);
        }
    }

    public b(android.content.Context context) {
        this.a = false;
        this.b = false;
        this.k = context;
        this.a = com.realsil.sdk.core.RtkCore.DEBUG;
        this.b = com.realsil.sdk.core.RtkCore.VDBG;
        a();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    public static void a(com.realsil.sdk.core.c.b bVar, int i) {
        ?? r6;
        bVar.getClass();
        if (i != 10 || android.os.Build.VERSION.SDK_INT < 29 || (r6 = bVar.e) == 0 || r6.size() <= 0) {
            return;
        }
        com.realsil.sdk.core.logger.ZLogger.d("Bluetooth is turned off, disconnect all client connections");
        java.util.Iterator it = bVar.e.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.bluetooth.BluetoothGatt bluetoothGatt = bVar.getBluetoothGatt(str);
            if (bVar.isConnected(str)) {
                bVar.h.put(str, 0);
                bVar.a(str, bluetoothGatt, 0, 0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    public void close(java.lang.String str) {
        if (str == null) {
            return;
        }
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f.get(str);
        if (bluetoothGatt != null) {
            if (isConnected(str)) {
                if (this.a) {
                    com.realsil.sdk.core.logger.ZLogger.v("disconnect : " + str);
                }
                bluetoothGatt.disconnect();
                try {
                    java.lang.Thread.sleep(500L);
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (CLOSE_GATT_ENABLED) {
                if (this.b) {
                    java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("closeGatt, addr:=");
                    a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
                    com.realsil.sdk.core.logger.ZLogger.v(a2.toString());
                }
                bluetoothGatt.close();
            }
            this.f.remove(str);
        }
        java.util.HashMap<java.lang.String, java.util.List<android.bluetooth.BluetoothGattCallback>> hashMap = this.g;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        ?? r0 = this.e;
        if (r0 == 0 || !r0.contains(str)) {
            return;
        }
        this.e.remove(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    public void closeAll() {
        ?? r0 = this.e;
        if (r0 != 0 && r0.size() > 0) {
            java.util.Iterator it = this.e.iterator();
            while (it.hasNext()) {
                close((java.lang.String) it.next());
            }
        }
        com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager = this.l;
        if (rtkBluetoothManager != null) {
            rtkBluetoothManager.removeManagerCallback(this.m);
        }
    }

    public synchronized void closeGatt(java.lang.String str) {
        closeGatt(str, CLOSE_GATT_ENABLED);
    }

    public boolean connect(java.lang.String str, android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        return android.os.Build.VERSION.SDK_INT >= 23 ? connect(str, 2, bluetoothGattCallback) : connect(str, 2, bluetoothGattCallback);
    }

    public boolean disconnectGatt(java.lang.String str) {
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f.get(str);
        if (bluetoothGatt == null) {
            return false;
        }
        if (isConnected(str)) {
            if (this.a) {
                java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("disconnect : ");
                a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
                com.realsil.sdk.core.logger.ZLogger.v(a2.toString());
            }
            bluetoothGatt.disconnect();
            try {
                java.lang.Thread.sleep(500L);
            } catch (java.lang.InterruptedException e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            }
        } else {
            a(str, bluetoothGatt, 0, 0);
        }
        return true;
    }

    public android.bluetooth.BluetoothAdapter getBluetoothAdapter() {
        return this.d;
    }

    public java.util.List<java.lang.String> getBluetoothDeviceAddresss() {
        return this.e;
    }

    public android.bluetooth.BluetoothGatt getBluetoothGatt(java.lang.String str) {
        return this.f.get(str);
    }

    public java.util.List<android.bluetooth.BluetoothGattCallback> getCallback(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.util.List<android.bluetooth.BluetoothGattCallback>> hashMap = this.g;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    public android.bluetooth.BluetoothDevice getConnectedDevice() {
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (isConnected(str)) {
                return getBluetoothGatt(str).getDevice();
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    public java.util.ArrayList<android.bluetooth.BluetoothDevice> getConnectedDevices() {
        java.util.ArrayList<android.bluetooth.BluetoothDevice> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (isConnected(str)) {
                arrayList.add(getBluetoothGatt(str).getDevice());
            }
        }
        return arrayList;
    }

    public int getConnectionState(java.lang.String str) {
        return this.h.get(str).intValue();
    }

    public java.lang.String getDeviceName(java.lang.String str) {
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f.get(str);
        if (bluetoothGatt != null) {
            return bluetoothGatt.getDevice().getName();
        }
        if (!this.a) {
            return null;
        }
        java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("no bluetoothGatt exist, addr=");
        a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
        com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
        return null;
    }

    public android.bluetooth.BluetoothGattService getService(java.lang.String str, java.util.UUID uuid) {
        android.bluetooth.BluetoothGattService bluetoothGattService = null;
        for (android.bluetooth.BluetoothGattService bluetoothGattService2 : getSupportedGattServices(str)) {
            if (bluetoothGattService2.getUuid().equals(uuid)) {
                bluetoothGattService = bluetoothGattService2;
            }
        }
        return bluetoothGattService;
    }

    public java.util.List<android.bluetooth.BluetoothGattService> getSupportedGattServices(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.bluetooth.BluetoothGatt bluetoothGatt = getBluetoothGatt(str);
        return bluetoothGatt == null ? arrayList : bluetoothGatt.getServices();
    }

    public boolean isBluetoothSupported() {
        return this.d != null || a();
    }

    public boolean isCallbackRegisted(java.lang.String str, android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        java.util.List<android.bluetooth.BluetoothGattCallback> callback = getCallback(str);
        return callback != null && callback.contains(bluetoothGattCallback);
    }

    public boolean isConnected(java.lang.String str) {
        java.lang.Integer num = this.h.get(str);
        return num != null && num.intValue() == 2;
    }

    public boolean isHostConnected(java.lang.String str) {
        android.bluetooth.BluetoothManager bluetoothManager = this.c;
        if (bluetoothManager == null) {
            if (this.a) {
                com.realsil.sdk.core.logger.ZLogger.w("mBluetoothManager == null");
            }
            return false;
        }
        java.util.List<android.bluetooth.BluetoothDevice> connectedDevices = bluetoothManager.getConnectedDevices(7);
        if (connectedDevices != null) {
            java.util.Iterator<android.bluetooth.BluetoothDevice> it = connectedDevices.iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().equals(str)) {
                    if (this.b) {
                        java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("addr: ");
                        a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
                        a2.append(", Connected.");
                        com.realsil.sdk.core.logger.ZLogger.d(a2.toString());
                    }
                    return true;
                }
            }
        }
        if (this.b) {
            java.lang.StringBuilder a3 = com.realsil.sdk.core.a.a.a("addr: ");
            a3.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
            a3.append(", Disconnected.");
            com.realsil.sdk.core.logger.ZLogger.v(a3.toString());
        }
        return false;
    }

    public boolean readCharacteristic(java.lang.String str, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.d == null) {
            com.realsil.sdk.core.logger.ZLogger.w("BluetoothAdapter not initialized");
            return false;
        }
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f.get(str);
        if (bluetoothGatt == null) {
            com.realsil.sdk.core.logger.ZLogger.w("unspecified address.");
            return false;
        }
        if (this.b) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("addr: ");
            a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
            com.realsil.sdk.core.logger.ZLogger.d(a2.toString());
        }
        return bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
    }

    public boolean readCharacteristicSync(java.lang.String str, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.i = false;
        if (!readCharacteristic(str, bluetoothGattCharacteristic)) {
            return false;
        }
        synchronized (this.j) {
            try {
                if (!this.i) {
                    if (this.b) {
                        com.realsil.sdk.core.logger.ZLogger.v("wait for 3000ms");
                    }
                    this.j.wait(3000L);
                    if (this.b) {
                        com.realsil.sdk.core.logger.ZLogger.v("wait time reached");
                    }
                }
            } catch (java.lang.InterruptedException e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            }
        }
        return true;
    }

    public synchronized void registerCallback(java.lang.String str, android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        java.util.List<android.bluetooth.BluetoothGattCallback> callback = getCallback(str);
        if (callback == null) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
            copyOnWriteArrayList.add(bluetoothGattCallback);
            this.g.put(str, copyOnWriteArrayList);
        } else {
            if (!callback.contains(bluetoothGattCallback)) {
                callback.add(bluetoothGattCallback);
                this.g.put(str, callback);
            }
        }
    }

    public boolean requestConnectionPriority(java.lang.String str, int i) {
        android.bluetooth.BluetoothGatt bluetoothGatt;
        if (str == null || (bluetoothGatt = this.f.get(str)) == null) {
            return false;
        }
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 < 21) {
            com.realsil.sdk.core.logger.ZLogger.w("requestConnectionPriority not support, Build.VERSION.SDK_INT=" + i2);
            return false;
        }
        if (i >= 0 && i <= 2) {
            return bluetoothGatt.requestConnectionPriority(i);
        }
        com.realsil.sdk.core.logger.ZLogger.w("connectionPriority not within valid range");
        return false;
    }

    public boolean setCharacteristicIndication(java.lang.String str, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return setCharacteristicIndication(str, bluetoothGattCharacteristic, CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID, z);
    }

    public boolean setCharacteristicNotification(java.lang.String str, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return setCharacteristicNotification(str, bluetoothGattCharacteristic, CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID, z);
    }

    public boolean setCharacteristicNotificationSync(java.lang.String str, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, java.util.UUID uuid, boolean z) {
        this.i = false;
        if (!setCharacteristicNotification(str, bluetoothGattCharacteristic, uuid, z)) {
            return false;
        }
        synchronized (this.j) {
            try {
                if (!this.i) {
                    if (this.b) {
                        com.realsil.sdk.core.logger.ZLogger.v("wait for 3000ms");
                    }
                    this.j.wait(3000L);
                    if (this.b) {
                        com.realsil.sdk.core.logger.ZLogger.v("wait time reached");
                    }
                }
            } catch (java.lang.InterruptedException e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            }
        }
        return true;
    }

    public void unRegisterAllCallback(java.lang.String str) {
        if (this.g.get(str) == null) {
            if (this.a) {
                com.realsil.sdk.core.logger.ZLogger.d("mCallbacks.get(addr) == null");
            }
        } else {
            if (this.a) {
                java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("addr: ");
                a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
                com.realsil.sdk.core.logger.ZLogger.v(a2.toString());
            }
            this.g.remove(str);
        }
    }

    public synchronized void unRegisterCallback(java.lang.String str, android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        java.util.List<android.bluetooth.BluetoothGattCallback> callback = getCallback(str);
        if (callback != null) {
            if (callback.contains(bluetoothGattCallback)) {
                callback.remove(bluetoothGattCallback);
                this.g.put(str, callback);
            }
        } else {
            if (this.a) {
                java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("callback not registered, addr= ");
                a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
                com.realsil.sdk.core.logger.ZLogger.v(a2.toString());
            }
        }
    }

    public boolean writeCharacteristic(java.lang.String str, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.d == null) {
            com.realsil.sdk.core.logger.ZLogger.w("BluetoothAdapter not initialized");
            return false;
        }
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f.get(str);
        if (bluetoothGatt != null) {
            return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
        }
        com.realsil.sdk.core.logger.ZLogger.w("unspecified address.");
        return false;
    }

    public synchronized boolean writeCharacteristicSync(java.lang.String str, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.i = false;
        if (!writeCharacteristic(str, bluetoothGattCharacteristic)) {
            return false;
        }
        synchronized (this.j) {
            try {
                if (!this.i) {
                    if (this.b) {
                        com.realsil.sdk.core.logger.ZLogger.v("wait for 3000ms");
                    }
                    this.j.wait(3000L);
                    if (this.b) {
                        com.realsil.sdk.core.logger.ZLogger.v("wait time reached");
                    }
                }
            } catch (java.lang.InterruptedException e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    public synchronized void closeGatt(java.lang.String str, boolean z) {
        android.bluetooth.BluetoothGatt bluetoothGatt;
        if (str == null) {
            com.realsil.sdk.core.logger.ZLogger.d(this.a, "Invalid address");
            return;
        }
        java.util.HashMap<java.lang.String, android.bluetooth.BluetoothGatt> hashMap = this.f;
        if (hashMap != null) {
            if (z && (bluetoothGatt = hashMap.get(str)) != null) {
                if (this.b) {
                    java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("closeGatt, addr=");
                    a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
                    com.realsil.sdk.core.logger.ZLogger.v(a2.toString());
                }
                bluetoothGatt.close();
            }
            this.f.remove(str);
        }
        java.util.HashMap<java.lang.String, java.util.List<android.bluetooth.BluetoothGattCallback>> hashMap2 = this.g;
        if (hashMap2 != null) {
            hashMap2.remove(str);
        }
        ?? r4 = this.e;
        if (r4 != 0) {
            r4.remove(str);
        }
    }

    public boolean setCharacteristicIndication(java.lang.String str, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, java.util.UUID uuid, boolean z) {
        if (this.d == null) {
            com.realsil.sdk.core.logger.ZLogger.w("BluetoothAdapter not initialized");
            return false;
        }
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f.get(str);
        if (bluetoothGatt == null) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("BluetoothGatt can not be null, addr=");
            a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
            com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
            return false;
        }
        if (bluetoothGattCharacteristic == null) {
            com.realsil.sdk.core.logger.ZLogger.w("characteristic is null");
            return false;
        }
        if (this.a) {
            java.lang.StringBuilder a3 = com.realsil.sdk.core.a.a.a("addr:=");
            a3.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
            a3.append(", enabled=");
            a3.append(z);
            com.realsil.sdk.core.logger.ZLogger.d(a3.toString());
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        android.bluetooth.BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(uuid);
        if (descriptor == null) {
            java.lang.StringBuilder a4 = com.realsil.sdk.core.a.a.a("descriptor not found, uuid=");
            a4.append(uuid.toString());
            com.realsil.sdk.core.logger.ZLogger.w(a4.toString());
            return false;
        }
        if (z) {
            descriptor.setValue(android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        } else {
            descriptor.setValue(android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        }
        bluetoothGatt.writeDescriptor(descriptor);
        return true;
    }

    public boolean setCharacteristicNotification(java.lang.String str, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, java.util.UUID uuid, boolean z) {
        if (this.d == null) {
            com.realsil.sdk.core.logger.ZLogger.w("BluetoothAdapter not initialized");
            return false;
        }
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f.get(str);
        if (bluetoothGatt == null) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("BluetoothGatt can not be null, addr=");
            a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
            com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
            return false;
        }
        if (this.a) {
            java.lang.StringBuilder a3 = com.realsil.sdk.core.a.a.a("addr:=");
            a3.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
            a3.append(", enabled=");
            a3.append(z);
            com.realsil.sdk.core.logger.ZLogger.d(a3.toString());
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        android.bluetooth.BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(uuid);
        if (descriptor == null) {
            java.lang.StringBuilder a4 = com.realsil.sdk.core.a.a.a("descriptor not found, uuid=");
            a4.append(uuid.toString());
            com.realsil.sdk.core.logger.ZLogger.w(a4.toString());
            return false;
        }
        if (z) {
            descriptor.setValue(android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        } else {
            descriptor.setValue(android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        }
        bluetoothGatt.writeDescriptor(descriptor);
        return true;
    }

    public boolean connect(java.lang.String str, int i, android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return connect(str, false, i, 1, bluetoothGattCallback);
        }
        return connect(str, false, i, 1, bluetoothGattCallback);
    }

    public boolean connect(java.lang.String str, int i, int i2, android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        return connect(str, false, i, i2, bluetoothGattCallback);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    public boolean connect(java.lang.String str, boolean z, int i, int i2, android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        android.bluetooth.BluetoothGatt connectGatt;
        android.bluetooth.BluetoothGatt bluetoothGatt;
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.d;
        if (bluetoothAdapter == null) {
            com.realsil.sdk.core.logger.ZLogger.w("BluetoothAdapter not initialized");
            return false;
        }
        if (str == null) {
            com.realsil.sdk.core.logger.ZLogger.w("unspecified address.");
            return false;
        }
        android.bluetooth.BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
        if (remoteDevice == null) {
            com.realsil.sdk.core.logger.ZLogger.w("Device not found.  Unable to connect.");
            return false;
        }
        if (this.e.contains(str) && (bluetoothGatt = this.f.get(str)) != null) {
            if (isConnected(str)) {
                if (this.a) {
                    com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true) + " already connected");
                }
                registerCallback(str, bluetoothGattCallback);
                if (bluetoothGattCallback != null) {
                    bluetoothGattCallback.onConnectionStateChange(bluetoothGatt, 0, 2);
                }
                return true;
            }
            if (z) {
                registerCallback(str, bluetoothGattCallback);
                if (this.a) {
                    com.realsil.sdk.core.logger.ZLogger.v("re-connect previous device: " + str);
                }
                if (bluetoothGatt.connect()) {
                    this.h.put(str, 1);
                    return true;
                }
                com.realsil.sdk.core.logger.ZLogger.d("reconnect failed.");
                closeGatt(str);
                return false;
            }
            closeGatt(str);
        }
        if (this.a) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("create connection to ");
            a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(str, true));
            com.realsil.sdk.core.logger.ZLogger.v(a2.toString());
        }
        registerCallback(str, bluetoothGattCallback);
        this.h.put(str, 1);
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            connectGatt = remoteDevice.connectGatt(this.k, z, new com.realsil.sdk.core.c.b.C0065b(), i, i2);
        } else if (i3 >= 23) {
            connectGatt = remoteDevice.connectGatt(this.k, z, new com.realsil.sdk.core.c.b.C0065b(), i);
        } else {
            connectGatt = remoteDevice.connectGatt(this.k, z, new com.realsil.sdk.core.c.b.C0065b());
        }
        if (connectGatt == null) {
            com.realsil.sdk.core.logger.ZLogger.d("BluetoothGatt not exist.  Unable to connect.");
            this.h.put(str, 0);
            closeGatt(str);
            return false;
        }
        this.f.put(str, connectGatt);
        if (!this.e.contains(str)) {
            this.e.add(str);
        }
        return true;
    }

    public final boolean a() {
        if (this.c == null) {
            android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) this.k.getSystemService("bluetooth");
            this.c = bluetoothManager;
            if (bluetoothManager == null) {
                com.realsil.sdk.core.logger.ZLogger.w("BLUETOOTH_SERVICE not supported.");
                return false;
            }
        }
        if (this.d == null) {
            android.bluetooth.BluetoothAdapter adapter = this.c.getAdapter();
            this.d = adapter;
            if (adapter == null) {
                com.realsil.sdk.core.logger.ZLogger.w("BluetoothAdapter is not supported");
                return false;
            }
        }
        com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager = com.realsil.sdk.core.bluetooth.RtkBluetoothManager.getInstance();
        this.l = rtkBluetoothManager;
        if (rtkBluetoothManager == null) {
            com.realsil.sdk.core.bluetooth.RtkBluetoothManager.initial(this.k);
            this.l = com.realsil.sdk.core.bluetooth.RtkBluetoothManager.getInstance();
        }
        com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager2 = this.l;
        if (rtkBluetoothManager2 != null) {
            rtkBluetoothManager2.addManagerCallback(this.m);
        } else {
            com.realsil.sdk.core.logger.ZLogger.w("BluetoothProfileManager not initialized");
        }
        com.realsil.sdk.core.logger.ZLogger.d("initialize success");
        return true;
    }

    /* renamed from: com.realsil.sdk.core.c.b$b, reason: collision with other inner class name */
    public class C0065b extends android.bluetooth.BluetoothGattCallback {
        public C0065b() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (com.realsil.sdk.core.c.b.this.a) {
                if (value != null) {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, ">> onCharacteristicChanged(%s)\n(%d)%s", bluetoothGattCharacteristic.getUuid(), java.lang.Integer.valueOf(value.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(value)));
                } else {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, ">> onCharacteristicChanged(%s)", bluetoothGattCharacteristic.getUuid()));
                }
            }
            java.util.List<android.bluetooth.BluetoothGattCallback> list = com.realsil.sdk.core.c.b.this.g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
            java.util.List<android.bluetooth.BluetoothGattCallback> list;
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bArr, i);
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            if (com.realsil.sdk.core.c.b.this.a) {
                com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "<< onCharacteristicRead(%s): %s, %s \n\t(%d)%s", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(address, true), bluetoothGattCharacteristic.getUuid(), com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i), java.lang.Integer.valueOf(bArr.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(bArr)));
            }
            synchronized (com.realsil.sdk.core.c.b.this.j) {
                com.realsil.sdk.core.c.b.this.i = true;
                com.realsil.sdk.core.c.b.this.j.notifyAll();
            }
            if (android.os.Build.VERSION.SDK_INT < 33 || (list = com.realsil.sdk.core.c.b.this.g.get(address)) == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bArr, i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (com.realsil.sdk.core.c.b.this.a) {
                if (value != null) {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "<< onDescriptorWrite(%s) %s\n(%d)%s", com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i), bluetoothGattCharacteristic.getUuid(), java.lang.Integer.valueOf(value.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(value)));
                } else {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "<< onDescriptorWrite(%s) %s", com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i), bluetoothGattCharacteristic.getUuid()));
                }
            }
            synchronized (com.realsil.sdk.core.c.b.this.j) {
                com.realsil.sdk.core.c.b.this.i = true;
                com.realsil.sdk.core.c.b.this.j.notifyAll();
            }
            java.util.List<android.bluetooth.BluetoothGattCallback> list = com.realsil.sdk.core.c.b.this.g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            android.bluetooth.BluetoothDevice device = bluetoothGatt.getDevice();
            if (device == null) {
                return;
            }
            java.lang.String address = device.getAddress();
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, ">> onConnectionStateChange(%s), status: %s , newState: %s", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(address, true), com.realsil.sdk.core.bluetooth.connection.le.GattError.parseConnectionError(i), com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.parseProfileState(i2)));
            if (i != 0) {
                com.realsil.sdk.core.c.b.this.h.put(address, 0);
            } else if (i2 == 2) {
                com.realsil.sdk.core.c.b.this.h.put(address, 2);
                com.realsil.sdk.core.c.b.this.f.put(address, bluetoothGatt);
            } else {
                com.realsil.sdk.core.c.b.this.h.put(address, 0);
            }
            com.realsil.sdk.core.c.b.this.a(address, bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onDescriptorRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i, byte[] bArr) {
            java.util.List<android.bluetooth.BluetoothGattCallback> list;
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i, bArr);
            if (com.realsil.sdk.core.c.b.this.a) {
                com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "<< onDescriptorRead(%s) %s\n(%d)%s", com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i), bluetoothGattDescriptor.getUuid(), java.lang.Integer.valueOf(bArr.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(bArr)));
            }
            if (android.os.Build.VERSION.SDK_INT < 33 || (list = com.realsil.sdk.core.c.b.this.g.get(bluetoothGatt.getDevice().getAddress())) == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i, bArr);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            java.util.UUID uuid = bluetoothGattDescriptor.getCharacteristic().getUuid();
            byte[] value = bluetoothGattDescriptor.getValue();
            if (com.realsil.sdk.core.c.b.this.a) {
                if (value != null) {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "<< onDescriptorWrite(%s) {\nCharacteristic:%s\nDescriptor:%s\nvalue:(%d)%s\n}", com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i), uuid, bluetoothGattDescriptor.getUuid(), java.lang.Integer.valueOf(value.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(value)));
                } else {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "<< onDescriptorWrite(%s) {\nCharacteristic:%s\nDescriptor:%s}", com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i), uuid, bluetoothGattDescriptor.getUuid()));
                }
            }
            synchronized (com.realsil.sdk.core.c.b.this.j) {
                com.realsil.sdk.core.c.b.this.i = true;
                com.realsil.sdk.core.c.b.this.j.notifyAll();
            }
            java.util.List<android.bluetooth.BluetoothGattCallback> list = com.realsil.sdk.core.c.b.this.g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onMtuChanged(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, ">> onMtuChanged(%s) mtu=%d, addr=%s", com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i2), java.lang.Integer.valueOf(i), com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(address, true)));
            java.util.List<android.bluetooth.BluetoothGattCallback> list = com.realsil.sdk.core.c.b.this.g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onMtuChanged(bluetoothGatt, i, i2);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onPhyRead(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
            super.onPhyRead(bluetoothGatt, i, i2, i3);
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "<< onPhyRead(%s) %s: txPhy=%d, rxPhy=%d", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(address, true), com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i3), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            java.util.List<android.bluetooth.BluetoothGattCallback> list = com.realsil.sdk.core.c.b.this.g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPhyRead(bluetoothGatt, i, i2, i3);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onPhyUpdate(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
            super.onPhyUpdate(bluetoothGatt, i, i2, i3);
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, ">> onPhyUpdate(%s) %s: txPhy=%d, rxPhy=%d", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(address, true), com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i3), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            java.util.List<android.bluetooth.BluetoothGattCallback> list = com.realsil.sdk.core.c.b.this.g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPhyUpdate(bluetoothGatt, i, i2, i3);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onReadRemoteRssi(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onReadRemoteRssi(bluetoothGatt, i, i2);
            if (com.realsil.sdk.core.c.b.this.a) {
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "onReadRemoteRssi:rssi=%d, status=%d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onReliableWriteCompleted(android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
            super.onReliableWriteCompleted(bluetoothGatt, i);
            if (com.realsil.sdk.core.c.b.this.a) {
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "onReliableWriteCompleted:status=%d", java.lang.Integer.valueOf(i)));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onServiceChanged(android.bluetooth.BluetoothGatt bluetoothGatt) {
            super.onServiceChanged(bluetoothGatt);
            if (com.realsil.sdk.core.c.b.this.a) {
                com.realsil.sdk.core.logger.ZLogger.v("onServiceChanged");
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                java.util.List<android.bluetooth.BluetoothGattCallback> list = com.realsil.sdk.core.c.b.this.g.get(bluetoothGatt.getDevice().getAddress());
                if (list == null || list.size() <= 0) {
                    return;
                }
                java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onServiceChanged(bluetoothGatt);
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, ">> onServicesDiscovered(%s) addr=%s", com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i), com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(address, true)));
            if (com.realsil.sdk.core.c.b.DUMP_SERVICE) {
                for (android.bluetooth.BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "service: type=%d, %d/%s", java.lang.Integer.valueOf(bluetoothGattService.getType()), java.lang.Integer.valueOf(bluetoothGattService.getInstanceId()), bluetoothGattService.getUuid().toString()));
                    for (android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "\tcharacteristic: %d/%s", java.lang.Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid().toString()));
                    }
                }
            }
            java.util.List<android.bluetooth.BluetoothGattCallback> list = com.realsil.sdk.core.c.b.this.g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onServicesDiscovered(bluetoothGatt, i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onDescriptorRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
            if (com.realsil.sdk.core.c.b.this.a) {
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "onDescriptorRead(%s):status=%d", bluetoothGattDescriptor.getUuid(), java.lang.Integer.valueOf(i)));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            java.util.List<android.bluetooth.BluetoothGattCallback> list;
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            if (com.realsil.sdk.core.c.b.this.a) {
                com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, ">> onCharacteristicChanged(%s)\n(%d)%s", bluetoothGattCharacteristic.getUuid(), java.lang.Integer.valueOf(bArr.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(bArr)));
            }
            if (android.os.Build.VERSION.SDK_INT < 33 || (list = com.realsil.sdk.core.c.b.this.g.get(address)) == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (com.realsil.sdk.core.c.b.this.a) {
                if (value != null) {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "<< onCharacteristicRead(%s): %s, %s \n\t(%d)%s", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(address, true), bluetoothGattCharacteristic.getUuid(), com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i), java.lang.Integer.valueOf(value.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(value)));
                } else {
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "<< onCharacteristicRead(%s): %s,%s", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(address, true), bluetoothGattCharacteristic.getUuid(), com.realsil.sdk.core.bluetooth.connection.le.GattError.parse(i)));
                }
            }
            synchronized (com.realsil.sdk.core.c.b.this.j) {
                com.realsil.sdk.core.c.b.this.i = true;
                com.realsil.sdk.core.c.b.this.j.notifyAll();
            }
            java.util.List<android.bluetooth.BluetoothGattCallback> list = com.realsil.sdk.core.c.b.this.g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            }
        }
    }

    public final void a(java.lang.String str, android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
        java.util.List<android.bluetooth.BluetoothGattCallback> list = this.g.get(str);
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator<android.bluetooth.BluetoothGattCallback> it = list.iterator();
        while (it.hasNext()) {
            it.next().onConnectionStateChange(bluetoothGatt, i, i2);
        }
    }
}
