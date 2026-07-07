package com.realsil.sdk.core.bluetooth;

/* loaded from: classes3.dex */
public final class BluetoothProfileManager {
    public static final int INDICATOR_A2DP = 1;
    public static final int INDICATOR_A2DP_SINK = 2;
    public static final int INDICATOR_FULL = 255;
    public static final int INDICATOR_HEADSET = 4;
    public static final int INDICATOR_HID = 8;
    public static com.realsil.sdk.core.bluetooth.BluetoothProfileManager m;
    public boolean a;
    public boolean b;
    public android.content.Context c;
    public java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback> d;
    public android.bluetooth.BluetoothAdapter e;
    public android.bluetooth.BluetoothHealth h;
    public android.bluetooth.BluetoothHeadset f = null;
    public android.bluetooth.BluetoothA2dp g = null;
    public android.bluetooth.BluetoothProfile i = null;
    public android.bluetooth.BluetoothProfile j = null;
    public com.realsil.sdk.core.bluetooth.BluetoothProfileManager.ProfileBroadcastReceiver k = null;
    public com.realsil.sdk.core.bluetooth.BluetoothProfileManager.a l = new com.realsil.sdk.core.bluetooth.BluetoothProfileManager.a();

    public class ProfileBroadcastReceiver extends android.content.BroadcastReceiver {
        public ProfileBroadcastReceiver() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Type inference failed for: r13v11, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r13v17, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r13v22, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r13v28, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r13v33, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r13v42, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r13v47, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r13v53, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r13v58, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r13v63, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(android.content.Context context, android.content.Intent intent) {
            char c;
            java.lang.String action = intent.getAction();
            action.getClass();
            action.hashCode();
            switch (action.hashCode()) {
                case -1435586571:
                    if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1021360715:
                    if (action.equals("android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -855499628:
                    if (action.equals("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 545516589:
                    if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1244161670:
                    if (action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1772843706:
                    if (action.equals("android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT")) {
                        c = 5;
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
                    android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice != null) {
                        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                        com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "%s: action=%s, state: %d->%d", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true), action, java.lang.Integer.valueOf(intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1)), java.lang.Integer.valueOf(intExtra)));
                        ?? r13 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.d;
                        if (r13 != 0 && r13.size() > 0) {
                            java.util.Iterator it = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.d.iterator();
                            while (it.hasNext()) {
                                ((com.realsil.sdk.core.bluetooth.BluetoothProfileCallback) it.next()).onHfpAudioStateChanged(bluetoothDevice, intExtra);
                            }
                            break;
                        } else {
                            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.b, "no callback registered");
                            break;
                        }
                    }
                    break;
                case 1:
                    android.bluetooth.BluetoothDevice bluetoothDevice2 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    if (bluetoothDevice2 != null) {
                        com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "%s: action=%s, state: %d->%d", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice2.getAddress(), true), action, java.lang.Integer.valueOf(intExtra3), java.lang.Integer.valueOf(intExtra2)));
                        ?? r132 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.d;
                        if (r132 != 0 && r132.size() > 0) {
                            java.util.Iterator it2 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.d.iterator();
                            while (it2.hasNext()) {
                                ((com.realsil.sdk.core.bluetooth.BluetoothProfileCallback) it2.next()).onHidStateChanged(bluetoothDevice2, intExtra2);
                            }
                            break;
                        } else {
                            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.b, "no callback registered");
                            break;
                        }
                    }
                    break;
                case 2:
                    android.bluetooth.BluetoothDevice bluetoothDevice3 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra5 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    if (bluetoothDevice3 != null) {
                        com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "%s: action=%s, state: %d->%d", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice3.getAddress(), true), action, java.lang.Integer.valueOf(intExtra5), java.lang.Integer.valueOf(intExtra4)));
                        ?? r133 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.d;
                        if (r133 != 0 && r133.size() > 0) {
                            java.util.Iterator it3 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.d.iterator();
                            while (it3.hasNext()) {
                                ((com.realsil.sdk.core.bluetooth.BluetoothProfileCallback) it3.next()).onA2dpPlayingStateChanged(bluetoothDevice3, intExtra4);
                            }
                            break;
                        } else {
                            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.b, "no callback registered");
                            break;
                        }
                    }
                    break;
                case 3:
                    android.bluetooth.BluetoothDevice bluetoothDevice4 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    int intExtra6 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra7 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    if (bluetoothDevice4 != null) {
                        com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "action=%s, device:%s, state: %d->%d", action, com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice4.getAddress(), true), java.lang.Integer.valueOf(intExtra7), java.lang.Integer.valueOf(intExtra6)));
                        ?? r134 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.d;
                        if (r134 != 0 && r134.size() > 0) {
                            java.util.Iterator it4 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.d.iterator();
                            while (it4.hasNext()) {
                                ((com.realsil.sdk.core.bluetooth.BluetoothProfileCallback) it4.next()).onHfpConnectionStateChanged(bluetoothDevice4, intExtra6);
                            }
                            break;
                        } else {
                            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.b, "no callback registered");
                            break;
                        }
                    }
                    break;
                case 4:
                    android.bluetooth.BluetoothDevice bluetoothDevice5 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    int intExtra8 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra9 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    if (bluetoothDevice5 != null) {
                        com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "%s: action=%s, state: %d->%d", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice5.getAddress(), true), action, java.lang.Integer.valueOf(intExtra9), java.lang.Integer.valueOf(intExtra8)));
                        ?? r135 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.d;
                        if (r135 != 0 && r135.size() > 0) {
                            java.util.Iterator it5 = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.d.iterator();
                            while (it5.hasNext()) {
                                ((com.realsil.sdk.core.bluetooth.BluetoothProfileCallback) it5.next()).onA2dpStateChanged(bluetoothDevice5, intExtra8);
                            }
                            break;
                        } else {
                            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.b, "no callback registered");
                            break;
                        }
                    }
                    break;
                case 5:
                    com.realsil.sdk.core.bluetooth.BluetoothProfileManager bluetoothProfileManager = com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this;
                    bluetoothProfileManager.getClass();
                    android.bluetooth.BluetoothDevice bluetoothDevice6 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice6 != null) {
                        java.lang.String stringExtra = intent.getStringExtra("android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD");
                        if (stringExtra != null) {
                            int intExtra10 = intent.getIntExtra("android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD_TYPE", -1);
                            if (intExtra10 != 0 || intExtra10 != 1 || intExtra10 != 2 || intExtra10 != 3 || intExtra10 != 4) {
                                com.realsil.sdk.core.logger.ZLogger.v("onVendorSpecificHeadsetEvent() unknown command");
                                break;
                            } else {
                                java.lang.Object[] objArr = (java.lang.Object[]) intent.getExtras().get("android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_ARGS");
                                ?? r2 = bluetoothProfileManager.d;
                                if (r2 != 0 && r2.size() > 0) {
                                    java.util.Iterator it6 = bluetoothProfileManager.d.iterator();
                                    while (it6.hasNext()) {
                                        ((com.realsil.sdk.core.bluetooth.BluetoothProfileCallback) it6.next()).onVendorSpecificHeadsetEvent(bluetoothDevice6, stringExtra, intExtra10, objArr);
                                    }
                                    break;
                                } else {
                                    com.realsil.sdk.core.logger.ZLogger.v(bluetoothProfileManager.b, "no callback registered");
                                    break;
                                }
                            }
                        } else {
                            com.realsil.sdk.core.logger.ZLogger.v("onVendorSpecificHeadsetEvent() command is null");
                            break;
                        }
                    } else {
                        com.realsil.sdk.core.logger.ZLogger.v("onVendorSpecificHeadsetEvent() remote device is null");
                        break;
                    }
                    break;
            }
        }
    }

    public class a implements android.bluetooth.BluetoothProfile.ServiceListener {
        public a() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public final void onServiceConnected(int i, android.bluetooth.BluetoothProfile bluetoothProfile) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format("%s(%s) profile connected", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.parseProfile(i), bluetoothProfile.getClass().getName()));
            if (i == 11) {
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.j = bluetoothProfile;
                return;
            }
            if (i == 1) {
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.f = (android.bluetooth.BluetoothHeadset) bluetoothProfile;
                return;
            }
            if (i == 2) {
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.g = (android.bluetooth.BluetoothA2dp) bluetoothProfile;
            } else if (i == 3) {
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.h = (android.bluetooth.BluetoothHealth) bluetoothProfile;
            } else {
                if (i != 4) {
                    return;
                }
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.i = bluetoothProfile;
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public final void onServiceDisconnected(int i) {
            com.realsil.sdk.core.logger.ZLogger.d(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.parseProfile(i) + " profile disconnected");
            if (i == 1) {
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.f = null;
                return;
            }
            if (i == 2) {
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.g = null;
                return;
            }
            if (i == 3) {
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.h = null;
            } else if (i == 4) {
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.i = null;
            } else if (i == 11) {
                com.realsil.sdk.core.bluetooth.BluetoothProfileManager.this.j = null;
            }
        }
    }

    public BluetoothProfileManager(android.content.Context context) {
        this.a = false;
        this.b = false;
        this.c = context.getApplicationContext();
        this.a = com.realsil.sdk.core.RtkCore.DEBUG;
        this.b = com.realsil.sdk.core.RtkCore.VDBG;
        a();
    }

    public static com.realsil.sdk.core.bluetooth.BluetoothProfileManager getInstance() {
        return m;
    }

    public static void initial(android.content.Context context) {
        if (m == null) {
            synchronized (com.realsil.sdk.core.bluetooth.BluetoothProfileManager.class) {
                if (m == null) {
                    m = new com.realsil.sdk.core.bluetooth.BluetoothProfileManager(context);
                }
            }
        }
    }

    public final boolean a() {
        android.content.Context context = this.c;
        if (context == null) {
            com.realsil.sdk.core.logger.ZLogger.w("not intialized");
            return false;
        }
        if (this.e == null) {
            if (android.os.Build.VERSION.SDK_INT >= 18) {
                android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) context.getSystemService("bluetooth");
                if (bluetoothManager == null) {
                    com.realsil.sdk.core.logger.ZLogger.w("Unable to initialize BluetoothManager.");
                    return false;
                }
                this.e = bluetoothManager.getAdapter();
            } else {
                this.e = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
            }
            if (this.e == null) {
                com.realsil.sdk.core.logger.ZLogger.w("Unable to obtain a BluetoothAdapter.");
                return false;
            }
        }
        registerProfiles();
        this.k = new com.realsil.sdk.core.bluetooth.BluetoothProfileManager.ProfileBroadcastReceiver();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT");
        intentFilter.addAction("android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction(com.realsil.sdk.core.bluetooth.impl.BluetoothA2dpSinkImpl.ACTION_CONNECTION_STATE_CHANGED);
        intentFilter.addAction(com.realsil.sdk.core.bluetooth.impl.BluetoothA2dpSinkImpl.ACTION_PLAYING_STATE_CHANGED);
        this.c.registerReceiver(this.k, intentFilter);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public void addManagerCallback(com.realsil.sdk.core.bluetooth.BluetoothProfileCallback bluetoothProfileCallback) {
        if (bluetoothProfileCallback == null) {
            return;
        }
        if (this.d == null) {
            this.d = new java.util.concurrent.CopyOnWriteArrayList();
        }
        if (!this.d.contains(bluetoothProfileCallback)) {
            this.d.add(bluetoothProfileCallback);
        }
        boolean z = this.b;
        java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("mManagerCallbacks.size=");
        a2.append(this.d.size());
        com.realsil.sdk.core.logger.ZLogger.v(z, a2.toString());
    }

    public void close() {
        if (this.a) {
            com.realsil.sdk.core.logger.ZLogger.v("close()");
        }
        android.content.Context context = this.c;
        if (context != null) {
            try {
                context.unregisterReceiver(this.k);
            } catch (java.lang.Exception e) {
                com.realsil.sdk.core.logger.ZLogger.e(e.toString());
            }
        }
    }

    public void closeProfileProxy(int i) {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.e;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            com.realsil.sdk.core.logger.ZLogger.w("BT not enabled");
            return;
        }
        try {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "profile=%d", java.lang.Integer.valueOf(i)));
            if (i == 11) {
                this.e.closeProfileProxy(i, this.j);
            } else if (i == 1) {
                this.e.closeProfileProxy(i, this.f);
            } else if (i == 2) {
                this.e.closeProfileProxy(i, this.g);
            } else if (i == 3) {
                this.e.closeProfileProxy(i, this.h);
            } else if (i == 4) {
                this.e.closeProfileProxy(i, this.i);
            }
        } catch (java.lang.Exception e) {
            com.realsil.sdk.core.logger.ZLogger.e(e.toString());
        }
    }

    public boolean connectA2dpSink(byte[] bArr) {
        return connectA2dpSource(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.convertMac(bArr));
    }

    public boolean connectA2dpSource(byte[] bArr) {
        return connectA2dpSource(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.convertMac(bArr));
    }

    public boolean connectHfpAg(byte[] bArr) {
        return connectHfpAg(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.convertMac(bArr));
    }

    public boolean connectHid(android.bluetooth.BluetoothDevice bluetoothDevice) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.connectProfile(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothHidHostImpl.CLASS_NAME, bluetoothDevice) : com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.connectProfile(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothInputDeviceImpl.CLASS_NAME, bluetoothDevice);
    }

    public boolean connectProfile(int i, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (i != 4) {
            return false;
        }
        return android.os.Build.VERSION.SDK_INT >= 28 ? com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.connectProfile(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothHidHostImpl.CLASS_NAME, bluetoothDevice) : com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.connectProfile(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothInputDeviceImpl.CLASS_NAME, bluetoothDevice);
    }

    public boolean disConnectHid(android.bluetooth.BluetoothDevice bluetoothDevice) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.disconnect(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothHidHostImpl.CLASS_NAME, bluetoothDevice) : com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.disconnect(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothInputDeviceImpl.CLASS_NAME, bluetoothDevice);
    }

    public boolean disconnectA2dpSink(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.realsil.sdk.core.logger.ZLogger.w("device is null");
            return false;
        }
        android.bluetooth.BluetoothProfile bluetoothProfile = this.j;
        if (bluetoothProfile == null) {
            com.realsil.sdk.core.logger.ZLogger.w("A2DP Sink not initialized");
            getProfileProxy(11);
            return false;
        }
        if (bluetoothProfile.getConnectionState(bluetoothDevice) == 2) {
            return com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.disconnect(this.j, com.realsil.sdk.core.bluetooth.impl.BluetoothA2dpSinkImpl.CLASS_NAME, bluetoothDevice);
        }
        com.realsil.sdk.core.logger.ZLogger.w("A2DP Sink already disconnected");
        return false;
    }

    public boolean disconnectA2dpSource(byte[] bArr) {
        return disconnectA2dpSource(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.convertMac(bArr));
    }

    public boolean disconnectHfp(byte[] bArr) {
        return disconnectHfp(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.convertMac(bArr));
    }

    public boolean disconnectProfile(int i, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (i != 4) {
            return false;
        }
        return android.os.Build.VERSION.SDK_INT >= 28 ? com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.disconnect(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothHidHostImpl.CLASS_NAME, bluetoothDevice) : com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.disconnect(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothInputDeviceImpl.CLASS_NAME, bluetoothDevice);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r5 != 11) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(int r5) {
        /*
            r4 = this;
            android.bluetooth.BluetoothAdapter r0 = r4.e
            if (r0 == 0) goto L74
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Lb
            goto L74
        Lb:
            r0 = 11
            r1 = 4
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L19
            if (r5 == r2) goto L2a
            if (r5 == r1) goto L3b
            if (r5 == r0) goto L5b
            goto L6e
        L19:
            android.bluetooth.BluetoothHeadset r5 = r4.f
            if (r5 == 0) goto L22
            java.util.List r5 = r5.getConnectedDevices()
            return r5
        L22:
            java.lang.String r5 = "HEADSET profile not connected"
            com.realsil.sdk.core.logger.ZLogger.d(r5)
            r4.getProfileProxy(r3)
        L2a:
            android.bluetooth.BluetoothA2dp r5 = r4.g
            if (r5 == 0) goto L33
            java.util.List r5 = r5.getConnectedDevices()
            return r5
        L33:
            java.lang.String r5 = "A2DP profile not connected"
            com.realsil.sdk.core.logger.ZLogger.d(r5)
            r4.getProfileProxy(r2)
        L3b:
            android.bluetooth.BluetoothProfile r5 = r4.i
            if (r5 == 0) goto L53
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L4c
            java.lang.String r0 = "android.bluetooth.BluetoothHidHost"
            java.util.List r5 = com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.getConnectedDevices(r5, r0)
            return r5
        L4c:
            java.lang.String r0 = "android.bluetooth.BluetoothInputDevice"
            java.util.List r5 = com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.getConnectedDevices(r5, r0)
            return r5
        L53:
            java.lang.String r5 = "HID_HOST profile not connected"
            com.realsil.sdk.core.logger.ZLogger.d(r5)
            r4.getProfileProxy(r1)
        L5b:
            android.bluetooth.BluetoothProfile r5 = r4.j
            if (r5 == 0) goto L66
            java.lang.String r0 = "android.bluetooth.BluetoothA2dpSink"
            java.util.List r5 = com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.getConnectedDevices(r5, r0)
            return r5
        L66:
            java.lang.String r5 = "A2DP_SINK profile not connected"
            com.realsil.sdk.core.logger.ZLogger.d(r5)
            r4.getProfileProxy(r0)
        L6e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
        L74:
            java.lang.String r5 = "BT not enabled"
            com.realsil.sdk.core.logger.ZLogger.w(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getConnectedDevices(int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getConnectionState(int r5, android.bluetooth.BluetoothDevice r6) {
        /*
            r4 = this;
            android.bluetooth.BluetoothAdapter r0 = r4.e
            if (r0 == 0) goto L70
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Lb
            goto L70
        Lb:
            r0 = 11
            r1 = 4
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L19
            if (r5 == r2) goto L2a
            if (r5 == r1) goto L3b
            if (r5 == r0) goto L5b
            goto L6e
        L19:
            android.bluetooth.BluetoothHeadset r5 = r4.f
            if (r5 == 0) goto L22
            int r5 = r5.getConnectionState(r6)
            return r5
        L22:
            java.lang.String r5 = "HEADSET profile not connected"
            com.realsil.sdk.core.logger.ZLogger.d(r5)
            r4.getProfileProxy(r3)
        L2a:
            android.bluetooth.BluetoothA2dp r5 = r4.g
            if (r5 == 0) goto L33
            int r5 = r5.getConnectionState(r6)
            return r5
        L33:
            java.lang.String r5 = "A2DP profile not connected"
            com.realsil.sdk.core.logger.ZLogger.d(r5)
            r4.getProfileProxy(r2)
        L3b:
            android.bluetooth.BluetoothProfile r5 = r4.i
            if (r5 == 0) goto L53
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L4c
            java.lang.String r0 = "android.bluetooth.BluetoothHidHost"
            int r5 = com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.getConnectionState(r5, r0, r6)
            return r5
        L4c:
            java.lang.String r0 = "android.bluetooth.BluetoothInputDevice"
            int r5 = com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.getConnectionState(r5, r0, r6)
            return r5
        L53:
            java.lang.String r5 = "HID_HOST profile not connected"
            com.realsil.sdk.core.logger.ZLogger.d(r5)
            r4.getProfileProxy(r1)
        L5b:
            android.bluetooth.BluetoothProfile r5 = r4.j
            if (r5 == 0) goto L66
            java.lang.String r0 = "android.bluetooth.BluetoothA2dpSink"
            int r5 = com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.getConnectionState(r5, r0, r6)
            return r5
        L66:
            java.lang.String r5 = "A2DP_SINK profile not connected"
            com.realsil.sdk.core.logger.ZLogger.d(r5)
            r4.getProfileProxy(r0)
        L6e:
            r5 = 0
            return r5
        L70:
            java.lang.String r5 = "BT not enabled"
            com.realsil.sdk.core.logger.ZLogger.d(r5)
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.core.bluetooth.BluetoothProfileManager.getConnectionState(int, android.bluetooth.BluetoothDevice):int");
    }

    public android.bluetooth.BluetoothProfile getProfile(int i) {
        if (i == 1) {
            return this.f;
        }
        if (i == 2) {
            return this.g;
        }
        if (i == 4) {
            return this.i;
        }
        if (i != 11) {
            return null;
        }
        return this.j;
    }

    public boolean getProfileProxy(int i) {
        try {
            if (!this.e.getProfileProxy(this.c, this.l, i)) {
                com.realsil.sdk.core.logger.ZLogger.w(java.lang.String.format(java.util.Locale.US, "getProfileProxy %d failed", java.lang.Integer.valueOf(i)));
                return false;
            }
            if (this.b) {
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "getProfileProxy %d success", java.lang.Integer.valueOf(i)));
            }
            return true;
        } catch (java.lang.Exception e) {
            com.realsil.sdk.core.logger.ZLogger.w(java.lang.String.format(java.util.Locale.US, "getProfileProxy %d exception: %s", java.lang.Integer.valueOf(i), e.toString()));
            return false;
        }
    }

    public int getProfileState(android.bluetooth.BluetoothProfile bluetoothProfile, android.bluetooth.BluetoothDevice bluetoothDevice) {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.e;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            com.realsil.sdk.core.logger.ZLogger.w("BT not enabled");
            return -1;
        }
        if (bluetoothProfile != null) {
            return bluetoothProfile.getConnectionState(bluetoothDevice);
        }
        com.realsil.sdk.core.logger.ZLogger.d("profile is not supported");
        return -1;
    }

    public boolean isConnectionFeatureSupported(int i) {
        if (i == 1) {
            return com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.isConnectMethodSupported(this.f, com.realsil.sdk.core.bluetooth.impl.BluetoothHeadsetImpl.CLASS_NAME) && com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.isDisConnectMethodSupported(this.f, com.realsil.sdk.core.bluetooth.impl.BluetoothHeadsetImpl.CLASS_NAME);
        }
        if (i == 2) {
            return com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.isConnectMethodSupported(this.g, com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.CLASS_NAME_BLUETOOTH_A2DP) && com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.isDisConnectMethodSupported(this.g, com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.CLASS_NAME_BLUETOOTH_A2DP);
        }
        if (i != 4) {
            return false;
        }
        return android.os.Build.VERSION.SDK_INT >= 28 ? com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.isConnectMethodSupported(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothHidHostImpl.CLASS_NAME) && com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.isDisConnectMethodSupported(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothHidHostImpl.CLASS_NAME) : com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.isConnectMethodSupported(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothInputDeviceImpl.CLASS_NAME) && com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.isDisConnectMethodSupported(this.i, com.realsil.sdk.core.bluetooth.impl.BluetoothInputDeviceImpl.CLASS_NAME);
    }

    public boolean isDeviceConnected(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.realsil.sdk.core.logger.ZLogger.d("no activeBluetoothDevice exist");
            return false;
        }
        int connectionState = getInstance().getConnectionState(1, bluetoothDevice);
        int connectionState2 = getInstance().getConnectionState(2, bluetoothDevice);
        boolean isConnected = com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.isConnected(bluetoothDevice);
        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "%s, connected=%b, hfpState= %d,a2dpState= %d", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true), java.lang.Boolean.valueOf(isConnected), java.lang.Integer.valueOf(connectionState), java.lang.Integer.valueOf(connectionState2)));
        return isConnected || 2 == connectionState || 2 == connectionState2;
    }

    public boolean isProfileSupported(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i == 11 && this.j != null : this.i != null : this.g != null : this.f != null;
    }

    public void registerProfiles() {
        if (this.e == null) {
            com.realsil.sdk.core.logger.ZLogger.w("mBluetoothAdapter == null");
            return;
        }
        this.k = new com.realsil.sdk.core.bluetooth.BluetoothProfileManager.ProfileBroadcastReceiver();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        getProfileProxy(2);
        getProfileProxy(1);
        getProfileProxy(4);
        getProfileProxy(11);
        this.c.registerReceiver(this.k, intentFilter);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.realsil.sdk.core.bluetooth.BluetoothProfileCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public void removeManagerCallback(com.realsil.sdk.core.bluetooth.BluetoothProfileCallback bluetoothProfileCallback) {
        ?? r0 = this.d;
        if (r0 != 0) {
            r0.remove(bluetoothProfileCallback);
        }
    }

    public boolean startScoUsingVirtualVoiceCall(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.realsil.sdk.core.logger.ZLogger.w("can't find remote device.");
            return false;
        }
        android.bluetooth.BluetoothHeadset bluetoothHeadset = this.f;
        if (bluetoothHeadset != null) {
            return android.os.Build.VERSION.SDK_INT >= 28 ? com.realsil.sdk.core.bluetooth.impl.BluetoothHeadsetImpl.startScoUsingVirtualVoiceCall(bluetoothHeadset) : com.realsil.sdk.core.bluetooth.impl.BluetoothHeadsetImpl.startScoUsingVirtualVoiceCall(bluetoothHeadset, bluetoothDevice);
        }
        com.realsil.sdk.core.logger.ZLogger.w("BluetoothHeadset service is not connected");
        getProfileProxy(1);
        return false;
    }

    public boolean stopScoUsingVirtualVoiceCall(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.realsil.sdk.core.logger.ZLogger.w("can't find remote device.");
            return false;
        }
        android.bluetooth.BluetoothHeadset bluetoothHeadset = this.f;
        if (bluetoothHeadset != null) {
            return android.os.Build.VERSION.SDK_INT >= 28 ? com.realsil.sdk.core.bluetooth.impl.BluetoothHeadsetImpl.stopScoUsingVirtualVoiceCall(bluetoothHeadset) : com.realsil.sdk.core.bluetooth.impl.BluetoothHeadsetImpl.stopScoUsingVirtualVoiceCall(bluetoothHeadset, bluetoothDevice);
        }
        com.realsil.sdk.core.logger.ZLogger.w("BluetoothHeadset service is not connected");
        getProfileProxy(1);
        return false;
    }

    public boolean connectA2dpSink(java.lang.String str) {
        return connectA2dpSink(a(str));
    }

    public boolean connectA2dpSource(java.lang.String str) {
        return connectA2dpSource(a(str));
    }

    public boolean connectHfpAg(java.lang.String str) {
        android.bluetooth.BluetoothDevice remoteDevice = this.e.getRemoteDevice(str);
        if (remoteDevice == null) {
            return false;
        }
        android.bluetooth.BluetoothHeadset bluetoothHeadset = this.f;
        if (bluetoothHeadset == null) {
            com.realsil.sdk.core.logger.ZLogger.w("BluetoothHeadset service is not connected");
            getProfileProxy(1);
            return false;
        }
        if (bluetoothHeadset.getConnectionState(remoteDevice) != 2) {
            return com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.connectProfile(this.f, remoteDevice);
        }
        com.realsil.sdk.core.logger.ZLogger.w("BluetoothHeadset profile is already connected");
        return true;
    }

    public boolean disconnectA2dpSource(java.lang.String str) {
        return disconnectA2dpSource(a(str));
    }

    public boolean disconnectHfp(java.lang.String str) {
        android.bluetooth.BluetoothDevice remoteDevice = this.e.getRemoteDevice(str);
        if (remoteDevice == null) {
            return false;
        }
        android.bluetooth.BluetoothHeadset bluetoothHeadset = this.f;
        if (bluetoothHeadset == null) {
            com.realsil.sdk.core.logger.ZLogger.w("BluetoothHeadset service is not connected");
            getProfileProxy(1);
            return false;
        }
        if (bluetoothHeadset.getConnectionState(remoteDevice) == 2) {
            return com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.disconnect(this.f, remoteDevice);
        }
        com.realsil.sdk.core.logger.ZLogger.w("BluetoothHeadset profile is not connected");
        return false;
    }

    public boolean connectA2dpSink(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.realsil.sdk.core.logger.ZLogger.w("can't find remote device.");
            return false;
        }
        android.bluetooth.BluetoothProfile bluetoothProfile = this.j;
        if (bluetoothProfile == null) {
            com.realsil.sdk.core.logger.ZLogger.w("A2DP Sink not initialized");
            getProfileProxy(11);
            return false;
        }
        if (bluetoothProfile.getConnectionState(bluetoothDevice) == 2) {
            com.realsil.sdk.core.logger.ZLogger.w("A2DP Sink already connected");
            return true;
        }
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.e;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            return com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.connectProfile(this.j, com.realsil.sdk.core.bluetooth.impl.BluetoothA2dpSinkImpl.CLASS_NAME, bluetoothDevice);
        }
        com.realsil.sdk.core.logger.ZLogger.d("BT not enabled");
        return false;
    }

    public boolean connectA2dpSource(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.realsil.sdk.core.logger.ZLogger.w("can't find remote device.");
            return false;
        }
        android.bluetooth.BluetoothA2dp bluetoothA2dp = this.g;
        if (bluetoothA2dp == null) {
            com.realsil.sdk.core.logger.ZLogger.w("A2DP not initialized");
            getProfileProxy(2);
            return false;
        }
        if (bluetoothA2dp.getConnectionState(bluetoothDevice) == 2) {
            com.realsil.sdk.core.logger.ZLogger.w("a2dp already connected");
            return true;
        }
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.e;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            if (!com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.setPriority(this.g, bluetoothDevice, 100)) {
                com.realsil.sdk.core.logger.ZLogger.v(this.a, "setPriority failed");
            }
            return com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.connectProfile(this.g, bluetoothDevice);
        }
        com.realsil.sdk.core.logger.ZLogger.w("BT not enabled");
        return false;
    }

    public boolean disconnectA2dpSource(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.realsil.sdk.core.logger.ZLogger.w("device is null");
            return false;
        }
        android.bluetooth.BluetoothA2dp bluetoothA2dp = this.g;
        if (bluetoothA2dp == null) {
            com.realsil.sdk.core.logger.ZLogger.w("A2DP not initialized");
            getProfileProxy(2);
            return false;
        }
        if (bluetoothA2dp.getConnectionState(bluetoothDevice) != 2) {
            com.realsil.sdk.core.logger.ZLogger.w("A2DP already disconnected");
            return false;
        }
        if (!com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.setPriority(this.g, bluetoothDevice, 100)) {
            com.realsil.sdk.core.logger.ZLogger.v(this.a, "setPriority failed");
        }
        return com.realsil.sdk.core.bluetooth.impl.BluetoothProfileImpl.disconnect(this.g, bluetoothDevice);
    }

    public final android.bluetooth.BluetoothDevice a(java.lang.String str) {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.e;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            return this.e.getRemoteDevice(str);
        }
        com.realsil.sdk.core.logger.ZLogger.w("BT not enabled");
        return null;
    }
}
