package androidx.core.app;

/* loaded from: classes.dex */
public final class AlarmManagerCompat {
    public static void setAlarmClock(android.app.AlarmManager alarmManager, long j, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            alarmManager.setAlarmClock(new android.app.AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent2);
        } else {
            setExact(alarmManager, 0, j, pendingIntent2);
        }
    }

    public static void setAndAllowWhileIdle(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    public static void setExact(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    public static void setExactAndAllowWhileIdle(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        } else {
            setExact(alarmManager, i, j, pendingIntent);
        }
    }

    private AlarmManagerCompat() {
    }
}
