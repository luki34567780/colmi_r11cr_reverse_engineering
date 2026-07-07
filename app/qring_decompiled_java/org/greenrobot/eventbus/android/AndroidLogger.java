package org.greenrobot.eventbus.android;

/* loaded from: classes3.dex */
public class AndroidLogger implements org.greenrobot.eventbus.Logger {
    private final java.lang.String tag;

    public AndroidLogger(java.lang.String str) {
        this.tag = str;
    }

    @Override // org.greenrobot.eventbus.Logger
    public void log(java.util.logging.Level level, java.lang.String str) {
        if (level != java.util.logging.Level.OFF) {
            android.util.Log.println(mapLevel(level), this.tag, str);
        }
    }

    @Override // org.greenrobot.eventbus.Logger
    public void log(java.util.logging.Level level, java.lang.String str, java.lang.Throwable th) {
        if (level != java.util.logging.Level.OFF) {
            android.util.Log.println(mapLevel(level), this.tag, str + "\n" + android.util.Log.getStackTraceString(th));
        }
    }

    private int mapLevel(java.util.logging.Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        }
        if (intValue < 900) {
            return 4;
        }
        return intValue < 1000 ? 5 : 6;
    }
}
