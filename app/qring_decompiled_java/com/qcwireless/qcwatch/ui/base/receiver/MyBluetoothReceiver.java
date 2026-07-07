package com.qcwireless.qcwatch.ui.base.receiver;

/* compiled from: MyBluetoothReceiver.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0002J&\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016¨\u0006\u0016"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/receiver/MyBluetoothReceiver;", "Lcom/oudmon/ble/base/bluetooth/QCBluetoothCallbackCloneReceiver;", "()V", "bleStatus", "", "status", "", "newState", "connectStatue", "device", "Landroid/bluetooth/BluetoothDevice;", "connected", "", "initCmd", "onCharacteristicChange", "address", "", "uuid", "data", "", "onCharacteristicRead", "onServiceDiscovered", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MyBluetoothReceiver extends com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver {
    @Override // com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver
    public void connectStatue(android.bluetooth.BluetoothDevice device, boolean connected) {
        if (device != null && connected) {
            if (device.getName() != null) {
                com.qcwireless.qcwatch.base.pref.UserConfig companion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance();
                java.lang.String name = device.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "device.name");
                companion.setDeviceName(name);
                com.qcwireless.qcwatch.base.pref.UserConfig companion2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance();
                java.lang.String name2 = device.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "device.name");
                companion2.setDeviceNameNoClear(name2);
            }
            com.qcwireless.qcwatch.base.pref.PreUtil.putString(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Device_Address, device.getAddress());
            com.qcwireless.qcwatch.base.pref.UserConfig companion3 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance();
            java.lang.String address = device.getAddress();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address, "device.address");
            companion3.setDeviceAddress(address);
            if (!kotlin.text.StringsKt.equals(device.getAddress(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), true)) {
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGoogleFitLastInfo("");
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            }
            com.qcwireless.qcwatch.base.pref.UserConfig companion4 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance();
            java.lang.String address2 = device.getAddress();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address2, "device.address");
            companion4.setDeviceAddressNoClear(address2);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWeatherToDeviceLastTime(0);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastTenMinSyncTime(600 + new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            return;
        }
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.BluetoothEvent(false));
    }

    @Override // com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver
    public void onServiceDiscovered() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver$onServiceDiscovered$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver myBluetoothReceiver) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myBluetoothReceiver, "$this$ktxRunOnBgSingle");
                com.oudmon.ble.base.communication.LargeDataHandler.getInstance().initEnable();
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.BluetoothEvent(true));
                myBluetoothReceiver.initCmd();
            }
        });
    }

    @Override // com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver
    public void onCharacteristicChange(java.lang.String address, java.lang.String uuid, final byte[] data) {
        if (data != null) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver$onCharacteristicChange$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver myBluetoothReceiver) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myBluetoothReceiver, "$this$ktxRunOnBgSingle");
                    com.qcwireless.qcwatch.ui.base.receiver.BleCommonDataParseKt.parseBleData(data);
                }
            });
        }
    }

    @Override // com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver
    public void onCharacteristicRead(final java.lang.String uuid, final byte[] data) {
        if (uuid == null || data == null) {
            return;
        }
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver$onCharacteristicRead$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver myBluetoothReceiver) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myBluetoothReceiver, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.ui.base.receiver.BleCommonDataParseKt.parseDeviceInfoData(uuid, data);
            }
        });
    }

    @Override // com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver
    public void bleStatus(int status, int newState) {
        super.bleStatus(status, newState);
        com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "ble->" + status + '-' + newState, "3")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initCmd() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "initCmd");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().execReadCmd(com.oudmon.ble.base.communication.CommandHandle.getInstance().getReadHwRequest());
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 3), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.receiver.MyBluetoothReceiver.m527initCmd$lambda0((com.oudmon.ble.base.communication.rsp.BatteryRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().execReadCmd(com.oudmon.ble.base.communication.CommandHandle.getInstance().getReadFmRequest());
        com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.INSTANCE.getGetInstance().initDeviceSetting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initCmd$lambda-0, reason: not valid java name */
    public static final void m527initCmd$lambda0(com.oudmon.ble.base.communication.rsp.BatteryRsp batteryRsp) {
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBattery(java.lang.String.valueOf(batteryRsp.getBatteryValue()));
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
    }
}
