package com.qcwireless.qcwatch.base.lifecycle;

/* compiled from: QcLifeCycle.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/base/lifecycle/QcLifeCycle;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "mCount", "", "getMCount", "()I", "setMCount", "(I)V", "isBand", "", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "StaticParam", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QcLifeCycle implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: StaticParam, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle.Companion INSTANCE = new com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle.Companion(null);
    private static boolean isForeground;
    private int mCount;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final int getMCount() {
        return this.mCount;
    }

    public final void setMCount(int i) {
        this.mCount = i;
    }

    /* compiled from: QcLifeCycle.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/base/lifecycle/QcLifeCycle$StaticParam;", "", "()V", "isForeground", "", "()Z", "setForeground", "(Z)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle$StaticParam, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isForeground() {
            return com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle.isForeground;
        }

        public final void setForeground(boolean z) {
            com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle.isForeground = z;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        int i = this.mCount + 1;
        this.mCount = i;
        if (i == 1) {
            isForeground = true;
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 3), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle$$ExternalSyntheticLambda0
                    @Override // com.oudmon.ble.base.communication.ICommandResponse
                    public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                        com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle.m234onActivityCreated$lambda0((com.oudmon.ble.base.communication.rsp.BatteryRsp) baseRspCmd);
                    }
                });
            }
            android.util.Log.i("QcLifeCycle", "后台到前台----当前是前台");
            com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "ft", "2")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                return;
            }
            com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setReConnectMac(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
            com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect.INSTANCE.getGetInstance().connectWithScanValidation(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
            com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().reSetLastConnectTime(3);
            com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUpNotWait();
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-0, reason: not valid java name */
    public static final void m234onActivityCreated$lambda0(com.oudmon.ble.base.communication.rsp.BatteryRsp batteryRsp) {
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBattery(java.lang.String.valueOf(batteryRsp.getBatteryValue()));
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.BatteryLowEvent());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        int i = this.mCount - 1;
        this.mCount = i;
        if (i == 0) {
            isForeground = false;
            android.util.Log.i("QcLifeCycle", "前台到后台----当前是后台");
            com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().setSleepMin();
            com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "bg", "2")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
        }
    }

    private final boolean isBand() {
        return !android.text.TextUtils.isEmpty(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
    }
}
