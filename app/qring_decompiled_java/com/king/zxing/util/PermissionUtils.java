package com.king.zxing.util;

/* loaded from: /tmp/dex/classes2.dex */
public class PermissionUtils {
    private PermissionUtils() {
        throw new java.lang.AssertionError();
    }

    public static boolean checkPermission(android.content.Context context, java.lang.String str) {
        return androidx.core.app.ActivityCompat.checkSelfPermission(context, str) == 0;
    }

    public static void requestPermission(android.app.Activity activity, java.lang.String str, int i) {
        requestPermissions(activity, new java.lang.String[]{str}, i);
    }

    public static void requestPermission(androidx.fragment.app.Fragment fragment, java.lang.String str, int i) {
        requestPermissions(fragment, new java.lang.String[]{str}, i);
    }

    public static void requestPermissions(android.app.Activity activity, java.lang.String[] strArr, int i) {
        androidx.core.app.ActivityCompat.requestPermissions(activity, strArr, i);
    }

    public static void requestPermissions(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, int i) {
        fragment.requestPermissions(strArr, i);
    }

    public static boolean requestPermissionsResult(java.lang.String str, java.lang.String[] strArr, int[] iArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(strArr[i]) && iArr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean requestPermissionsResult(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            for (java.lang.String str : strArr) {
                if (str.equals(strArr2[i]) && iArr[i] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
