package com.qcwireless.qcwatch.ui.base.receiver;

/* loaded from: /tmp/dex/classes2.dex */
public class MyAlarmReceiver extends androidx.legacy.content.WakefulBroadcastReceiver {
    private android.app.PendingIntent alarmIntent;
    private android.app.AlarmManager alarmMgr;

    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.service.YService.class);
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent2);
                startWakefulService(context, intent2);
            } else {
                startWakefulService(context, intent2);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void setAlarm(android.content.Context context) {
        this.alarmMgr = (android.app.AlarmManager) context.getSystemService("alarm");
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, 0, new android.content.Intent(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.receiver.MyAlarmReceiver.class), 201326592);
        this.alarmIntent = broadcast;
        this.alarmMgr.cancel(broadcast);
        this.alarmMgr.setInexactRepeating(2, 900000L, 900000L, this.alarmIntent);
        context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.base.receiver.RebootReceiver.class), 1, 1);
    }
}
