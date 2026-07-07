package androidx.core.os;

/* loaded from: classes.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    public static void setAsynchronous(android.os.Message message, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 22) {
            message.setAsynchronous(z);
        } else {
            if (!sTrySetAsynchronous || android.os.Build.VERSION.SDK_INT < 16) {
                return;
            }
            try {
                message.setAsynchronous(z);
            } catch (java.lang.NoSuchMethodError unused) {
                sTrySetAsynchronous = false;
            }
        }
    }

    public static boolean isAsynchronous(android.os.Message message) {
        if (android.os.Build.VERSION.SDK_INT >= 22) {
            return message.isAsynchronous();
        }
        if (sTryIsAsynchronous && android.os.Build.VERSION.SDK_INT >= 16) {
            try {
                return message.isAsynchronous();
            } catch (java.lang.NoSuchMethodError unused) {
                sTryIsAsynchronous = false;
            }
        }
        return false;
    }

    private MessageCompat() {
    }
}
