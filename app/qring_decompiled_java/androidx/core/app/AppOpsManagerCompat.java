package androidx.core.app;

/* loaded from: classes.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    private AppOpsManagerCompat() {
    }

    public static java.lang.String permissionToOp(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return android.app.AppOpsManager.permissionToOp(str);
        }
        return null;
    }

    public static int noteOp(android.content.Context context, java.lang.String str, int i, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return ((android.app.AppOpsManager) context.getSystemService("appops")).noteOp(str, i, str2);
        }
        return 1;
    }

    public static int noteOpNoThrow(android.content.Context context, java.lang.String str, int i, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return ((android.app.AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i, str2);
        }
        return 1;
    }

    public static int noteProxyOp(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return ((android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class)).noteProxyOp(str, str2);
        }
        return 1;
    }

    public static int noteProxyOpNoThrow(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return ((android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    public static int checkOrNoteProxyOp(android.content.Context context, int i, java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.app.AppOpsManager systemService = androidx.core.app.AppOpsManagerCompat.Api29Impl.getSystemService(context);
            int checkOpNoThrow = androidx.core.app.AppOpsManagerCompat.Api29Impl.checkOpNoThrow(systemService, str, android.os.Binder.getCallingUid(), str2);
            return checkOpNoThrow != 0 ? checkOpNoThrow : androidx.core.app.AppOpsManagerCompat.Api29Impl.checkOpNoThrow(systemService, str, i, androidx.core.app.AppOpsManagerCompat.Api29Impl.getOpPackageName(context));
        }
        return noteProxyOpNoThrow(context, str, str2);
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.app.AppOpsManager getSystemService(android.content.Context context) {
            return (android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class);
        }

        static int checkOpNoThrow(android.app.AppOpsManager appOpsManager, java.lang.String str, int i, java.lang.String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        static java.lang.String getOpPackageName(android.content.Context context) {
            return context.getOpPackageName();
        }
    }
}
