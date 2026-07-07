package com.qcwireless.qcwatch.ui.base.receiver;

/* compiled from: SystemLocaleChangeReceiver.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/receiver/SystemLocaleChangeReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SystemLocaleChangeReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).setBluetoothTurnOff(true);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(new android.content.Intent(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.service.YService.class));
        } else {
            context.startService(new android.content.Intent(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.service.XService.class));
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "系统切换了语言");
        try {
            if (!kotlin.text.StringsKt.equals(android.os.Build.BRAND, "xiaomi", true) && !kotlin.text.StringsKt.equals(android.os.Build.BRAND, "redmi", true)) {
                com.qcwireless.qcwatch.base.utils.ActivityCollector.INSTANCE.removeAll();
                android.os.Process.killProcess(android.os.Process.myPid());
                java.lang.System.exit(0);
                throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().disconnect();
                com.qcwireless.qcwatch.base.utils.ActivityCollector.INSTANCE.removeAll();
            }
            com.qcwireless.qcwatch.QJavaApplication.trySetupNotifyService(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication());
            com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().initStringArray();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
