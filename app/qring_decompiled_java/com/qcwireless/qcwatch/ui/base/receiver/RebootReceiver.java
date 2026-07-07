package com.qcwireless.qcwatch.ui.base.receiver;

/* loaded from: /tmp/dex/classes2.dex */
public class RebootReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.oudmon.ble.base.bluetooth.BleBaseControl.getInstance(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).setBluetoothTurnOff(true);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(new android.content.Intent(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.service.YService.class));
        } else {
            context.startService(new android.content.Intent(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.service.XService.class));
        }
    }
}
