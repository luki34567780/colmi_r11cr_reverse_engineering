package com.luck.picture.lib.permissions;

/* loaded from: /tmp/dex/classes2.dex */
public class PermissionUtil {
    public static final java.lang.String ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION = "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION";

    public static boolean hasPermissions(android.content.Context context, java.lang.String... strArr) {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return true;
        }
        for (java.lang.String str : strArr) {
            if (androidx.core.content.ContextCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllGranted(int[] iArr) {
        if (iArr.length <= 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void goIntentSetting(androidx.fragment.app.Fragment fragment, int i) {
        try {
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.fromParts("package", fragment.getActivity().getPackageName(), null));
            fragment.startActivityForResult(intent, i);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
