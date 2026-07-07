package com.qcwireless.qcwatch.ui.base.receiver;

/* compiled from: BluetoothReceiver.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/receiver/BluetoothReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "bleOpen", "", "btDevice", "Landroid/bluetooth/BluetoothDevice;", "btReconnect", "", "classicBluetoothRunnable", "Ljava/lang/Runnable;", "connectRunnable", "mHandler", "Landroid/os/Handler;", "numConnect", "uiRunnable", "beginConnect", "", "delayTime", "connectAgain", "disConnectDevice", "onOffBle", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "reConnect", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BluetoothReceiver extends android.content.BroadcastReceiver {
    private android.bluetooth.BluetoothDevice btDevice;
    private int btReconnect;
    private boolean bleOpen = true;
    private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private int numConnect = 1;
    private java.lang.Runnable classicBluetoothRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver.m522classicBluetoothRunnable$lambda1(com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver.this);
        }
    };
    private java.lang.Runnable uiRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver$$ExternalSyntheticLambda4
        @Override // java.lang.Runnable
        public final void run() {
            com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver.m526uiRunnable$lambda2();
        }
    };
    private final java.lang.Runnable connectRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver.m523connectRunnable$lambda4(com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver.this);
        }
    };

    private final void onOffBle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onReceive$lambda-0, reason: not valid java name */
    public static final void m525onReceive$lambda0(com.oudmon.ble.base.communication.rsp.SetTimeRsp setTimeRsp) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.bluetooth.BluetoothDevice bluetoothDevice;
        android.bluetooth.BluetoothDevice bluetoothDevice2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        java.lang.String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2128145023:
                    if (!action.equals("android.intent.action.SCREEN_OFF")) {
                        return;
                    }
                    break;
                case -1980154005:
                    if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                        return;
                    }
                    break;
                case -1530327060:
                    if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                        if (intExtra == 10) {
                            this.numConnect = 1;
                            this.bleOpen = false;
                            onOffBle();
                            com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setBluetoothTurnOff(false);
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "蓝牙关闭了 --> ");
                            disConnectDevice();
                            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.BluetoothEvent(false));
                            return;
                        }
                        if (intExtra != 12) {
                            return;
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "蓝牙开启了 --> ");
                        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setBluetoothTurnOff(true);
                        this.bleOpen = true;
                        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setReConnectMac(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
                        com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect.INSTANCE.getGetInstance().connectWithScanValidation(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
                        beginConnect(2000);
                        this.mHandler.removeCallbacks(this.uiRunnable);
                        this.mHandler.post(this.uiRunnable);
                        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
                        if (deviceAddress == null || deviceAddress.length() == 0) {
                            com.oudmon.ble.base.scan.BleScannerHelper.getInstance().removeMacSystemBond(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac());
                            return;
                        }
                        return;
                    }
                    return;
                case -1513032534:
                    if (!action.equals("android.intent.action.TIME_TICK")) {
                        return;
                    }
                    break;
                case -1454123155:
                    if (!action.equals("android.intent.action.SCREEN_ON")) {
                        return;
                    }
                    break;
                case -1172645946:
                    if (!action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        return;
                    }
                    break;
                case -873536848:
                    if (!action.equals("android.intent.action.INPUT_METHOD_CHANGED")) {
                        return;
                    }
                    break;
                case -403228793:
                    if (!action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                        return;
                    }
                    break;
                case -301431627:
                    if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                        android.bluetooth.BluetoothDevice bluetoothDevice3 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        if (bluetoothDevice3 != null) {
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "蓝牙连接成功--> " + bluetoothDevice3.getName() + "--" + bluetoothDevice3.getAddress());
                        }
                        java.lang.String deviceAddress2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(bluetoothDevice3);
                        if (android.text.TextUtils.isEmpty(bluetoothDevice3.getAddress()) || !kotlin.text.StringsKt.equals(bluetoothDevice3.getAddress(), deviceAddress2, true)) {
                            return;
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "system-connect-ok");
                        this.numConnect = 1;
                        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                            return;
                        }
                        beginConnect(com.google.android.gms.fitness.FitnessStatusCodes.NEEDS_OAUTH_PERMISSIONS);
                        com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
                        return;
                    }
                    return;
                case -286614297:
                    if (!action.equals("android.intent.action.CAMERA_BUTTON")) {
                        return;
                    }
                    break;
                case 505380757:
                    if (action.equals("android.intent.action.TIME_SET")) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "手机系统改时间");
                        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SetTimeReq(0), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver$$ExternalSyntheticLambda0
                            @Override // com.oudmon.ble.base.communication.ICommandResponse
                            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                                com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver.m525onReceive$lambda0((com.oudmon.ble.base.communication.rsp.SetTimeRsp) baseRspCmd);
                            }
                        });
                        return;
                    }
                    return;
                case 823795052:
                    if (action.equals("android.intent.action.USER_PRESENT")) {
                        beginConnect(2000);
                        return;
                    }
                    return;
                case 1041332296:
                    if (!action.equals("android.intent.action.DATE_CHANGED")) {
                        return;
                    }
                    break;
                case 1167529923:
                    if (action.equals("android.bluetooth.device.action.FOUND") && (bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, bluetoothDevice.getName() + "++++" + bluetoothDevice.getAddress() + "----" + com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac());
                        if (kotlin.text.StringsKt.equals(bluetoothDevice.getAddress(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac(), true)) {
                            java.lang.String deviceAddress3 = com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().getDeviceAddress();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceAddress3, "getInstance().deviceAddress");
                            if (deviceAddress3.length() > 0) {
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, bluetoothDevice.getName() + "++++" + bluetoothDevice.getAddress() + "----" + com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac());
                                this.btDevice = bluetoothDevice;
                                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getRtkMcuSupport()) {
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---------connectRtkSPP");
                                    com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().connectRtkSPP(bluetoothDevice);
                                    return;
                                }
                                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMusicSupport() && !com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getJieLiMusic()) {
                                    com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().connectRtkSPP(bluetoothDevice);
                                    return;
                                }
                                if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getJieLiMusic()) {
                                    this.mHandler.postDelayed(this.classicBluetoothRunnable, 3000L);
                                    com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().createBondBlueTooth(bluetoothDevice);
                                    return;
                                } else {
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-------杰里配对");
                                    this.mHandler.postDelayed(this.classicBluetoothRunnable, 3000L);
                                    com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().createBondBluetoothJieLi(bluetoothDevice);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 1821585647:
                    if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED") && com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(context) && (bluetoothDevice2 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "蓝牙已断开11 -->地址 " + bluetoothDevice2.getAddress() + " == " + bluetoothDevice2.getName());
                        java.lang.String deviceAddress4 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
                        if (android.text.TextUtils.isEmpty(bluetoothDevice2.getAddress()) || !kotlin.text.StringsKt.equals$default(deviceAddress4, bluetoothDevice2.getAddress(), false, 2, (java.lang.Object) null)) {
                            return;
                        }
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.BluetoothSppEvent(false));
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "system-disconnect-ok");
                        this.numConnect = 1;
                        connectAgain(22000);
                        this.mHandler.post(this.uiRunnable);
                        return;
                    }
                    return;
                case 2116862345:
                    if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                        android.bluetooth.BluetoothDevice bluetoothDevice4 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        switch (intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1)) {
                            case 10:
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("蓝牙配对失败--> ");
                                kotlin.jvm.internal.Intrinsics.checkNotNull(bluetoothDevice4);
                                sb.append(bluetoothDevice4.getAddress());
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
                                if (kotlin.text.StringsKt.equals(bluetoothDevice4.getAddress(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac(), true) && this.btReconnect >= 1) {
                                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress().length() > 0) {
                                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                                        java.lang.String format = java.lang.String.format(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_512), java.util.Arrays.copyOf(new java.lang.Object[]{bluetoothDevice4.getName()}, 1));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(format, 0, 1, null);
                                        break;
                                    }
                                }
                                break;
                            case 11:
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "蓝牙正在配对--> ");
                                break;
                            case 12:
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "蓝牙配对成功--> ");
                                if (bluetoothDevice4 != null && kotlin.text.StringsKt.equals(bluetoothDevice4.getAddress(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac(), true)) {
                                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMusicSupport() && !com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getJieLiMusic()) {
                                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "系统配对成功,连接RtkSpp");
                                        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().connectRtkSPP(bluetoothDevice4);
                                    } else if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getJieLiMusic()) {
                                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "系统配对成功,连接杰里Spp");
                                        com.oudmon.ble.base.bluetooth.spp.jieli.SppHandle.getInstance().connect(bluetoothDevice4);
                                    }
                                    this.mHandler.removeCallbacks(this.classicBluetoothRunnable);
                                    break;
                                }
                                break;
                        }
                        this.mHandler.removeCallbacks(this.uiRunnable);
                        this.mHandler.post(this.uiRunnable);
                        return;
                    }
                    return;
                default:
                    return;
            }
            this.mHandler.removeCallbacks(this.uiRunnable);
            this.mHandler.postDelayed(this.uiRunnable, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: classicBluetoothRunnable$lambda-1, reason: not valid java name */
    public static final void m522classicBluetoothRunnable$lambda1(com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver bluetoothReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothReceiver, "this$0");
        android.bluetooth.BluetoothDevice bluetoothDevice = bluetoothReceiver.btDevice;
        if (bluetoothDevice != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(bluetoothDevice);
            if (kotlin.text.StringsKt.equals(bluetoothDevice.getAddress(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac(), true)) {
                bluetoothReceiver.btReconnect++;
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getJieLiMusic()) {
                    com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().createBondBluetoothJieLi(bluetoothReceiver.btDevice);
                } else {
                    com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().createBondBlueTooth(bluetoothReceiver.btDevice);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uiRunnable$lambda-2, reason: not valid java name */
    public static final void m526uiRunnable$lambda2() {
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
            com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
            return;
        }
        if (!com.oudmon.ble.base.util.AppUtil.isBackground(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()) && !com.oudmon.ble.base.util.AppUtil.isApplicationBroughtToBackground(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication())) {
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DeviceSyncTodayStepsEvent());
            return;
        }
        try {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastSyncTodaySteps() > 0 && com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastSyncTodaySteps() < new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "三分钟限制" + com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastSyncTodaySteps());
                return;
            }
            com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.INSTANCE.getGetInstance().syncTodayStep(new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.TodaySportDataRsp>() { // from class: com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver$uiRunnable$1$1
                @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                public void result(int errorCode, com.oudmon.ble.base.communication.rsp.TodaySportDataRsp t) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                    try {
                        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastSyncTodaySteps(new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + 180);
                        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                        com.qcwireless.qcwatch.base.pref.PreUtil.putInt(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Today_Steps, t.getSportTotal().getTotalSteps());
                        new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    private final void beginConnect(int delayTime) {
        this.mHandler.removeCallbacks(this.connectRunnable);
        if (this.bleOpen) {
            this.mHandler.postDelayed(this.connectRunnable, delayTime);
        }
    }

    private final void connectAgain(int delayTime) {
        if (!this.bleOpen || this.numConnect > 20) {
            return;
        }
        this.mHandler.postDelayed(this.connectRunnable, delayTime);
    }

    private final void disConnectDevice() {
        this.mHandler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver.m524disConnectDevice$lambda3();
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: disConnectDevice$lambda-3, reason: not valid java name */
    public static final void m524disConnectDevice$lambda3() {
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().disconnect();
        }
        try {
            new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: connectRunnable$lambda-4, reason: not valid java name */
    public static final void m523connectRunnable$lambda4(com.qcwireless.qcwatch.ui.base.receiver.BluetoothReceiver bluetoothReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothReceiver, "this$0");
        if (!android.text.TextUtils.isEmpty(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress()) && !com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            bluetoothReceiver.reConnect();
            int i = bluetoothReceiver.numConnect;
            int i2 = i + (i / 10) + 1;
            bluetoothReceiver.numConnect = i2;
            bluetoothReceiver.connectAgain(((i2 / 10) + 1) * 60 * 1000);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "连结计次器" + bluetoothReceiver.numConnect + " ,delay时间：" + (((bluetoothReceiver.numConnect / 10) + 1) * 60 * 1000));
            return;
        }
        bluetoothReceiver.numConnect = 1;
    }

    private final void reConnect() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setReConnectMac(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
        com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect.INSTANCE.getGetInstance().connectWithScanValidation(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
    }
}
