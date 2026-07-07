package androidx.core.os;

/* loaded from: classes.dex */
public class UserManagerCompat {
    private UserManagerCompat() {
    }

    public static boolean isUserUnlocked(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return ((android.os.UserManager) context.getSystemService(android.os.UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
