package com.realsil.sdk.core.bluetooth;

/* loaded from: classes3.dex */
public final class RtkBluetoothManager {
    public static final java.lang.String EXTRA_REASON = "android.bluetooth.device.extra.REASON";
    public static final int INDICATOR_ACL = 2;
    public static final int INDICATOR_BOND = 4;
    public static final int INDICATOR_BT = 1;
    public static final int INDICATOR_FULL = 255;
    public static com.realsil.sdk.core.bluetooth.RtkBluetoothManager l;
    public boolean a;
    public boolean b;
    public android.content.Context c;
    public java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback> d;
    public android.bluetooth.BluetoothManager e;
    public android.bluetooth.BluetoothAdapter f;
    public com.realsil.sdk.core.bluetooth.RtkBluetoothManager.BluetoothBroadcastReceiver g = null;
    public java.lang.Object h = new java.lang.Object();
    public java.lang.Object i = new java.lang.Object();
    public boolean j = false;
    public final com.realsil.sdk.core.bluetooth.RtkBluetoothManager.a k = new com.realsil.sdk.core.bluetooth.RtkBluetoothManager.a();

    public class BluetoothBroadcastReceiver extends android.content.BroadcastReceiver {
        public BluetoothBroadcastReceiver() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(android.content.Context context, android.content.Intent intent) {
            char c;
            java.lang.String action = intent.getAction();
            action.getClass();
            action.hashCode();
            switch (action.hashCode()) {
                case -1530327060:
                    if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -301431627:
                    if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -223687943:
                    if (action.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1546533238:
                    if (action.equals(com.realsil.sdk.core.bluetooth.impl.BluetoothAdapterImpl.ACTION_BLE_ACL_CONNECTED)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1652078734:
                    if (action.equals(com.realsil.sdk.core.bluetooth.impl.BluetoothAdapterImpl.ACTION_BLE_ACL_DISCONNECTED)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1821585647:
                    if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2116862345:
                    if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager = com.realsil.sdk.core.bluetooth.RtkBluetoothManager.this;
                    rtkBluetoothManager.getClass();
                    java.lang.String action2 = intent.getAction();
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                    com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "action=%s, state: %d->%d", action2, java.lang.Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1)), java.lang.Integer.valueOf(intExtra)));
                    switch (intExtra) {
                        case 10:
                            if (rtkBluetoothManager.a) {
                                com.realsil.sdk.core.logger.ZLogger.v("ACTION_STATE_CHANGED: STATE_OFF");
                            }
                            synchronized (rtkBluetoothManager.i) {
                                rtkBluetoothManager.i.notifyAll();
                            }
                            break;
                        case 11:
                            if (rtkBluetoothManager.a) {
                                com.realsil.sdk.core.logger.ZLogger.v("ACTION_STATE_CHANGED: STATE_TURNING_ON");
                                break;
                            }
                            break;
                        case 12:
                            if (rtkBluetoothManager.a) {
                                com.realsil.sdk.core.logger.ZLogger.v("ACTION_STATE_CHANGED: STATE_ON");
                            }
                            synchronized (rtkBluetoothManager.h) {
                                rtkBluetoothManager.h.notifyAll();
                            }
                            break;
                        case 13:
                            if (rtkBluetoothManager.a) {
                                com.realsil.sdk.core.logger.ZLogger.v("ACTION_STATE_CHANGED: STATE_TURNING_OFF");
                                break;
                            }
                            break;
                        default:
                            if (rtkBluetoothManager.a) {
                                com.realsil.sdk.core.logger.ZLogger.v("ACTION_STATE_CHANGED: " + intExtra);
                                break;
                            }
                            break;
                    }
                    ?? r9 = rtkBluetoothManager.d;
                    if (r9 != 0) {
                        java.util.Iterator it = r9.iterator();
                        while (it.hasNext()) {
                            ((com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback) it.next()).onBluetoothStateChanged(intExtra);
                        }
                        return;
                    }
                    return;
                case 1:
                    com.realsil.sdk.core.bluetooth.RtkBluetoothManager.e(com.realsil.sdk.core.bluetooth.RtkBluetoothManager.this, intent);
                    return;
                case 2:
                    com.realsil.sdk.core.bluetooth.RtkBluetoothManager.c(com.realsil.sdk.core.bluetooth.RtkBluetoothManager.this, intent);
                    return;
                case 3:
                    com.realsil.sdk.core.bluetooth.RtkBluetoothManager.a(com.realsil.sdk.core.bluetooth.RtkBluetoothManager.this, intent);
                    return;
                case 4:
                    com.realsil.sdk.core.bluetooth.RtkBluetoothManager.b(com.realsil.sdk.core.bluetooth.RtkBluetoothManager.this, intent);
                    return;
                case 5:
                    com.realsil.sdk.core.bluetooth.RtkBluetoothManager.f(com.realsil.sdk.core.bluetooth.RtkBluetoothManager.this, intent);
                    return;
                case 6:
                    com.realsil.sdk.core.bluetooth.RtkBluetoothManager.d(com.realsil.sdk.core.bluetooth.RtkBluetoothManager.this, intent);
                    return;
                default:
                    com.realsil.sdk.core.logger.ZLogger.d("action:" + action);
                    return;
            }
        }
    }

    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.realsil.sdk.core.logger.ZLogger.d("scan delay time reached");
            com.realsil.sdk.core.bluetooth.RtkBluetoothManager.this.b();
        }
    }

    public RtkBluetoothManager(android.content.Context context) {
        this.a = false;
        this.b = false;
        this.c = context.getApplicationContext();
        this.a = com.realsil.sdk.core.RtkCore.DEBUG;
        this.b = com.realsil.sdk.core.RtkCore.VDBG;
        a();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public static void a(com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager, android.content.Intent intent) {
        rtkBluetoothManager.getClass();
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null) {
            return;
        }
        if (rtkBluetoothManager.a) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "%s: action=%s", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true), intent.getAction()));
        }
        ?? r6 = rtkBluetoothManager.d;
        if (r6 != 0) {
            java.util.Iterator it = r6.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback) it.next()).onBleAclConnectionStateChanged(bluetoothDevice, true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public static void b(com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager, android.content.Intent intent) {
        rtkBluetoothManager.getClass();
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null) {
            return;
        }
        if (rtkBluetoothManager.a) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "%s: action=%s", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true), intent.getAction()));
        }
        ?? r6 = rtkBluetoothManager.d;
        if (r6 != 0) {
            java.util.Iterator it = r6.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback) it.next()).onBleAclConnectionStateChanged(bluetoothDevice, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public static void c(com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager, android.content.Intent intent) {
        rtkBluetoothManager.getClass();
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null) {
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", 0);
        if (rtkBluetoothManager.a) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "%s: action=%s", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true), intent.getAction()));
            com.realsil.sdk.core.logger.ZLogger.v("android.bluetooth.device.extra.PAIRING_VARIANT>> " + com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.pairingVariantToString(intExtra) + " (" + intExtra + ")");
        }
        ?? r7 = rtkBluetoothManager.d;
        if (r7 != 0) {
            java.util.Iterator it = r7.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback) it.next()).onPairingRequestNotify(bluetoothDevice, intExtra);
            }
        }
        if (bluetoothDevice.getBondState() == 12) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("device already bonded: ");
            a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
            com.realsil.sdk.core.logger.ZLogger.d(a2.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public static void d(com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager, android.content.Intent intent) {
        rtkBluetoothManager.getClass();
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
        int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
        int intExtra3 = intent.getIntExtra(EXTRA_REASON, -1);
        if (bluetoothDevice == null) {
            return;
        }
        com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "%s: action=%s, bondState:%d->%d, reason=%d", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true), intent.getAction(), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2), java.lang.Integer.valueOf(intExtra3)));
        ?? r9 = rtkBluetoothManager.d;
        if (r9 != 0) {
            java.util.Iterator it = r9.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback) it.next()).onBondStateChanged(bluetoothDevice, intExtra2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public static void e(com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager, android.content.Intent intent) {
        rtkBluetoothManager.getClass();
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null) {
            return;
        }
        if (rtkBluetoothManager.a) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "%s: action=%s", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true), intent.getAction()));
        }
        ?? r6 = rtkBluetoothManager.d;
        if (r6 != 0) {
            java.util.Iterator it = r6.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback) it.next()).onAclConnectionStateChanged(bluetoothDevice, true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public static void f(com.realsil.sdk.core.bluetooth.RtkBluetoothManager rtkBluetoothManager, android.content.Intent intent) {
        rtkBluetoothManager.getClass();
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null) {
            return;
        }
        if (rtkBluetoothManager.a) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "%s: action=%s", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true), intent.getAction()));
        }
        ?? r6 = rtkBluetoothManager.d;
        if (r6 != 0) {
            java.util.Iterator it = r6.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback) it.next()).onAclConnectionStateChanged(bluetoothDevice, false);
            }
        }
    }

    public static com.realsil.sdk.core.bluetooth.RtkBluetoothManager getInstance() {
        return l;
    }

    public static void initial(android.content.Context context) {
        if (l == null) {
            synchronized (com.realsil.sdk.core.bluetooth.RtkBluetoothManager.class) {
                if (l == null) {
                    l = new com.realsil.sdk.core.bluetooth.RtkBluetoothManager(context);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public void addManagerCallback(com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback rtkBluetoothManagerCallback) {
        if (this.d == null) {
            this.d = new java.util.concurrent.CopyOnWriteArrayList();
        }
        if (this.d.contains(rtkBluetoothManagerCallback)) {
            return;
        }
        this.d.add(rtkBluetoothManagerCallback);
    }

    public void close() {
        com.realsil.sdk.core.logger.ZLogger.v(this.a, "close()");
        android.content.Context context = this.c;
        if (context != null) {
            try {
                context.unregisterReceiver(this.g);
            } catch (java.lang.Exception e) {
                com.realsil.sdk.core.logger.ZLogger.e(e.toString());
            }
        }
    }

    public boolean createBond(byte[] bArr) {
        return createBond(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.convertMac(bArr));
    }

    public boolean disableBT() {
        return disableBT(true);
    }

    public boolean enableBT() {
        return enableBT(true);
    }

    public boolean isBleEnabled() {
        android.bluetooth.BluetoothManager bluetoothManager = this.e;
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        return adapter != null && adapter.isEnabled();
    }

    public boolean isBleSupported() {
        return this.c.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public boolean pair(byte[] bArr) {
        if (this.f == null) {
            return false;
        }
        byte[] bArr2 = {bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]};
        if (this.a) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("createBondMac=");
            a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bArr, true));
            com.realsil.sdk.core.logger.ZLogger.d(a2.toString());
        }
        android.bluetooth.BluetoothDevice remoteDevice = this.f.getRemoteDevice(bArr2);
        int bondState = remoteDevice.getBondState();
        if (this.b) {
            java.lang.StringBuilder a3 = com.realsil.sdk.core.a.a.a("attempt to createBond, state=");
            a3.append(java.lang.Integer.toString(bondState));
            com.realsil.sdk.core.logger.ZLogger.d(a3.toString());
        }
        return remoteDevice.createBond();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public void removeManagerCallback(com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback rtkBluetoothManagerCallback) {
        ?? r0 = this.d;
        if (r0 != 0) {
            r0.remove(rtkBluetoothManagerCallback);
        }
    }

    public boolean reset() {
        b();
        unBondAllDevices();
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f;
        if (bluetoothAdapter == null) {
            com.realsil.sdk.core.logger.ZLogger.w("BT is not initialized");
            return false;
        }
        if (!bluetoothAdapter.isEnabled()) {
            return enableBT();
        }
        this.j = true;
        if (this.b) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("isNeedAutoEnableBt=");
            a2.append(this.j);
            com.realsil.sdk.core.logger.ZLogger.v(a2.toString());
        }
        disableBT();
        try {
            java.lang.Thread.sleep(500L);
        } catch (java.lang.InterruptedException e) {
            com.realsil.sdk.core.logger.ZLogger.w(e.toString());
        }
        if (this.f.isEnabled()) {
            if (this.a) {
                com.realsil.sdk.core.logger.ZLogger.d("BT already enabled");
            }
            return true;
        }
        boolean enableBT = enableBT();
        if (this.a) {
            com.realsil.sdk.core.logger.ZLogger.d("enableBT: " + enableBT);
        }
        return enableBT;
    }

    public void setInterruptPairRequest(boolean z) {
    }

    public boolean startDiscovery(int i) {
        return startDiscovery(i, null);
    }

    public boolean unBondAllDevices() {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            com.realsil.sdk.core.logger.ZLogger.w("bluetooth is not enabled");
            return false;
        }
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = this.f.getBondedDevices();
        if (bondedDevices == null || bondedDevices.size() <= 0) {
            com.realsil.sdk.core.logger.ZLogger.d("no bond device exist");
            return true;
        }
        for (android.bluetooth.BluetoothDevice bluetoothDevice : bondedDevices) {
            int i = 0;
            while (true) {
                if (i >= 10) {
                    break;
                }
                int bondState = bluetoothDevice.getBondState();
                if (bondState == 10) {
                    boolean z = this.a;
                    java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("already unbond: ");
                    a2.append(bluetoothDevice.getName());
                    com.realsil.sdk.core.logger.ZLogger.d(z, a2.toString());
                    break;
                }
                if (bondState == 11) {
                    boolean cancelBondProcess = com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.cancelBondProcess(bluetoothDevice);
                    if (this.a) {
                        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "cancelBondProcess(%d): %s, ret=%b", java.lang.Integer.valueOf(i), com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true), java.lang.Boolean.valueOf(cancelBondProcess)));
                    }
                    if (cancelBondProcess) {
                        break;
                    }
                    i++;
                } else {
                    if (bondState == 12) {
                        boolean removeBond = com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.removeBond(bluetoothDevice);
                        if (this.a) {
                            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "removeBond(%d): %s, ret=%b", java.lang.Integer.valueOf(i), com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true), java.lang.Boolean.valueOf(removeBond)));
                        }
                        if (removeBond) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public boolean unBondDevice(byte[] bArr) {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            if (!this.a) {
                return false;
            }
            com.realsil.sdk.core.logger.ZLogger.d("bluetooth is not enabled");
            return false;
        }
        java.lang.String convertMac = com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.convertMac(bArr);
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = this.f.getBondedDevices();
        if (bondedDevices != null && bondedDevices.size() > 0) {
            java.util.Iterator<android.bluetooth.BluetoothDevice> it = bondedDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.bluetooth.BluetoothDevice next = it.next();
                if (convertMac.compareToIgnoreCase(next.getAddress()) == 0) {
                    while (true) {
                        int bondState = next.getBondState();
                        if (bondState == 10) {
                            break;
                        }
                        if (bondState == 11) {
                            com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.cancelBondProcess(next);
                        }
                        if (this.a) {
                            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("unBondDevice: ");
                            a2.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(convertMac, true));
                            com.realsil.sdk.core.logger.ZLogger.d(a2.toString());
                        }
                        boolean removeBond = com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.removeBond(next);
                        if (this.a) {
                            com.realsil.sdk.core.logger.ZLogger.d("removeBond finished:" + removeBond);
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean createBond(java.lang.String str) {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            if (this.a) {
                com.realsil.sdk.core.logger.ZLogger.d("bluetooth is not enabled");
            }
            return false;
        }
        if (str == null) {
            if (this.a) {
                com.realsil.sdk.core.logger.ZLogger.d("mac cannot be null");
            }
            return false;
        }
        if (this.a) {
            com.realsil.sdk.core.logger.ZLogger.d("createBondMac=" + str);
        }
        android.bluetooth.BluetoothDevice remoteDevice = this.f.getRemoteDevice(str);
        int bondState = remoteDevice.getBondState();
        if (bondState == 12) {
            com.realsil.sdk.core.logger.ZLogger.d("device already bonded: " + bondState);
            return true;
        }
        if (this.a) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("attempt to createBond, state=");
            a2.append(java.lang.Integer.toString(bondState));
            com.realsil.sdk.core.logger.ZLogger.d(a2.toString());
        }
        return com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.createBond(remoteDevice);
    }

    public boolean disableBT(boolean z) {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f;
        if (bluetoothAdapter == null) {
            com.realsil.sdk.core.logger.ZLogger.w("BT is not initialized..!");
            return false;
        }
        if (bluetoothAdapter.getState() == 10) {
            com.realsil.sdk.core.logger.ZLogger.w("BT already OFF");
            return true;
        }
        if (!this.f.disable()) {
            com.realsil.sdk.core.logger.ZLogger.d("disable BT failed");
            return false;
        }
        if (!z) {
            return true;
        }
        synchronized (this.i) {
            try {
                if (this.a) {
                    com.realsil.sdk.core.logger.ZLogger.d("wait BT disable...");
                }
                this.i.wait(androidx.work.WorkRequest.MIN_BACKOFF_MILLIS);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
                com.realsil.sdk.core.logger.ZLogger.e(e.toString());
            }
        }
        if (this.f.isEnabled()) {
            com.realsil.sdk.core.logger.ZLogger.w("BT disable failed");
            return false;
        }
        if (this.a) {
            com.realsil.sdk.core.logger.ZLogger.d("BT disable success");
        }
        return true;
    }

    public boolean enableBT(boolean z) {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f;
        if (bluetoothAdapter == null) {
            com.realsil.sdk.core.logger.ZLogger.w("mBluetoothAdapter == null");
            return false;
        }
        if (bluetoothAdapter.getState() == 12) {
            if (this.a) {
                com.realsil.sdk.core.logger.ZLogger.d("BT already on");
            }
            return true;
        }
        this.j = false;
        if (this.b) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("isNeedAutoEnableBt=");
            a2.append(this.j);
            com.realsil.sdk.core.logger.ZLogger.v(a2.toString());
        }
        if (!this.f.enable()) {
            com.realsil.sdk.core.logger.ZLogger.w("BT enable fail");
            return false;
        }
        if (!z) {
            return true;
        }
        synchronized (this.h) {
            try {
                if (this.a) {
                    com.realsil.sdk.core.logger.ZLogger.v("wait BT enable...");
                }
                this.h.wait(androidx.work.WorkRequest.MIN_BACKOFF_MILLIS);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
                com.realsil.sdk.core.logger.ZLogger.e(e.toString());
            }
        }
        if (!this.f.isEnabled()) {
            com.realsil.sdk.core.logger.ZLogger.d("BT enable fail");
            return false;
        }
        if (this.a) {
            com.realsil.sdk.core.logger.ZLogger.d("BT enable success");
        }
        return true;
    }

    public boolean startDiscovery(int i, java.lang.String str) {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            com.realsil.sdk.core.logger.ZLogger.w("bluetooth is not supported or disabled");
            return false;
        }
        if (this.f.isDiscovering()) {
            this.f.cancelDiscovery();
        }
        if (this.a) {
            com.realsil.sdk.core.logger.ZLogger.d("address=" + str + " , timeout=" + i);
        }
        this.f.startDiscovery();
        return true;
    }

    public final boolean a() {
        android.content.Context context = this.c;
        if (context == null) {
            com.realsil.sdk.core.logger.ZLogger.w("not intialized");
            return false;
        }
        if (this.f == null) {
            if (android.os.Build.VERSION.SDK_INT >= 18) {
                android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) context.getSystemService("bluetooth");
                this.e = bluetoothManager;
                if (bluetoothManager == null) {
                    com.realsil.sdk.core.logger.ZLogger.w("Unable to initialize BluetoothManager.");
                    return false;
                }
                this.f = bluetoothManager.getAdapter();
            } else {
                this.f = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
            }
            if (this.f == null) {
                com.realsil.sdk.core.logger.ZLogger.w("Unable to obtain a BluetoothAdapter.");
                return false;
            }
        }
        if (this.f == null) {
            com.realsil.sdk.core.logger.ZLogger.w("mBluetoothAdapter == null");
            return true;
        }
        this.g = new com.realsil.sdk.core.bluetooth.RtkBluetoothManager.BluetoothBroadcastReceiver();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction(com.realsil.sdk.core.bluetooth.impl.BluetoothAdapterImpl.ACTION_BLE_ACL_CONNECTED);
        intentFilter.addAction(com.realsil.sdk.core.bluetooth.impl.BluetoothAdapterImpl.ACTION_BLE_ACL_DISCONNECTED);
        intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        this.c.registerReceiver(this.g, intentFilter);
        return true;
    }

    public final boolean b() {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            com.realsil.sdk.core.logger.ZLogger.w("bluetooth is not supported or disabled");
        }
        if (!this.f.isDiscovering()) {
            return true;
        }
        if (this.a) {
            com.realsil.sdk.core.logger.ZLogger.d("stopInquiry()");
        }
        return this.f.cancelDiscovery();
    }
}
