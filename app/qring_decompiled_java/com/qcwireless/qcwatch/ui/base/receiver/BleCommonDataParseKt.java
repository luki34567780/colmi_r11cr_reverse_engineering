package com.qcwireless.qcwatch.ui.base.receiver;

/* compiled from: BleCommonDataParse.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"parseBleData", "", "data", "", "parseDeviceInfoData", "uuid", "", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BleCommonDataParseKt {
    public static final void parseBleData(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "data");
        if ((bArr.length == 0) || ((byte) (bArr[0] & ((byte) (~com.oudmon.ble.base.communication.Constants.FLAG_MASK_ERROR)))) != 2 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 1 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 2 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 3 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 4 || bArr[1] != 1) {
            return;
        }
        if (!com.oudmon.ble.base.util.AppUtil.isBackground(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()) && !com.oudmon.ble.base.util.AppUtil.isApplicationBroughtToBackground(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT())) {
            if (!com.qcwireless.qcwatch.base.permission.PermissionUtilKt.hasCameraPermission(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT())) {
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.CameraToastEvent());
                return;
            }
            android.content.Intent intent = new android.content.Intent(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT(), (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.camera.CameraActivity.class);
            intent.addFlags(268435456);
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().startActivity(intent);
            return;
        }
        new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initCameraNotification();
    }

    public static final void parseDeviceInfoData(java.lang.String str, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "uuid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "data");
        java.lang.String str2 = new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.oudmon.ble.base.communication.Constants.CHAR_FIRMWARE_REVISION.toString())) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, str2);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setFmVersion(str2);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), str2, "1")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.FirmCheckEvent());
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.oudmon.ble.base.communication.Constants.CHAR_HW_REVISION.toString())) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setHwVersion(str2);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.WatchFaceDownloadEvent(str2));
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DeviceConfigEvent(str2));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, str2);
            com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), str2, "1")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.FirmCheckEvent());
        }
    }
}
