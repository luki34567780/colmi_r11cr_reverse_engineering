package com.luck.picture.lib.permissions;

/* loaded from: /tmp/dex/classes2.dex */
public class PermissionChecker {
    private static final int REQUEST_CODE = 10086;
    private static com.luck.picture.lib.permissions.PermissionChecker mInstance;

    private PermissionChecker() {
    }

    public static com.luck.picture.lib.permissions.PermissionChecker getInstance() {
        if (mInstance == null) {
            synchronized (com.luck.picture.lib.permissions.PermissionChecker.class) {
                if (mInstance == null) {
                    mInstance = new com.luck.picture.lib.permissions.PermissionChecker();
                }
            }
        }
        return mInstance;
    }

    public void requestPermissions(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, com.luck.picture.lib.permissions.PermissionResultCallback permissionResultCallback) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(strArr);
        requestPermissions(fragment, arrayList, REQUEST_CODE, permissionResultCallback);
    }

    public void requestPermissions(androidx.fragment.app.Fragment fragment, java.util.List<java.lang.String[]> list, com.luck.picture.lib.permissions.PermissionResultCallback permissionResultCallback) {
        requestPermissions(fragment, list, REQUEST_CODE, permissionResultCallback);
    }

    private void requestPermissions(androidx.fragment.app.Fragment fragment, java.util.List<java.lang.String[]> list, int i, com.luck.picture.lib.permissions.PermissionResultCallback permissionResultCallback) {
        if (!com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(fragment.getActivity()) && (fragment instanceof com.luck.picture.lib.basic.PictureCommonFragment)) {
            if (android.os.Build.VERSION.SDK_INT < 23) {
                if (permissionResultCallback != null) {
                    permissionResultCallback.onGranted();
                    return;
                }
                return;
            }
            androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String[] strArr : list) {
                for (java.lang.String str : strArr) {
                    if (androidx.core.content.ContextCompat.checkSelfPermission(activity, str) != 0) {
                        arrayList.add(str);
                    }
                }
            }
            if (arrayList.size() <= 0) {
                if (permissionResultCallback != null) {
                    permissionResultCallback.onGranted();
                }
            } else {
                ((com.luck.picture.lib.basic.PictureCommonFragment) fragment).setPermissionsResultAction(permissionResultCallback);
                java.lang.String[] strArr2 = new java.lang.String[arrayList.size()];
                arrayList.toArray(strArr2);
                fragment.requestPermissions(strArr2, i);
                androidx.core.app.ActivityCompat.requestPermissions(activity, strArr2, i);
            }
        }
    }

    public void onRequestPermissionsResult(int[] iArr, com.luck.picture.lib.permissions.PermissionResultCallback permissionResultCallback) {
        if (com.luck.picture.lib.permissions.PermissionUtil.isAllGranted(iArr)) {
            permissionResultCallback.onGranted();
        } else {
            permissionResultCallback.onDenied();
        }
    }

    public static boolean checkSelfPermission(android.content.Context context, java.lang.String[] strArr) {
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                if (androidx.core.content.ContextCompat.checkSelfPermission(context.getApplicationContext(), str) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isCheckReadStorage(int i, android.content.Context context) {
        if (com.luck.picture.lib.utils.SdkVersionUtils.isTIRAMISU()) {
            if (i == com.luck.picture.lib.config.SelectMimeType.ofImage()) {
                return isCheckReadImages(context);
            }
            if (i == com.luck.picture.lib.config.SelectMimeType.ofVideo()) {
                return isCheckReadVideo(context);
            }
            if (i == com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
                return isCheckReadAudio(context);
            }
            return isCheckReadImages(context) && isCheckReadVideo(context);
        }
        return isCheckReadExternalStorage(context);
    }

    public static boolean isCheckReadImages(android.content.Context context) {
        return checkSelfPermission(context, new java.lang.String[]{"android.permission.READ_MEDIA_IMAGES"});
    }

    public static boolean isCheckReadVideo(android.content.Context context) {
        return checkSelfPermission(context, new java.lang.String[]{"android.permission.READ_MEDIA_VIDEO"});
    }

    public static boolean isCheckReadAudio(android.content.Context context) {
        return checkSelfPermission(context, new java.lang.String[]{"android.permission.READ_MEDIA_AUDIO"});
    }

    public static boolean isCheckWriteExternalStorage(android.content.Context context) {
        return checkSelfPermission(context, new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    public static boolean isCheckReadExternalStorage(android.content.Context context) {
        return checkSelfPermission(context, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"});
    }

    public static boolean isCheckCamera(android.content.Context context) {
        return checkSelfPermission(context, new java.lang.String[]{com.hjq.permissions.Permission.CAMERA});
    }

    public static boolean isCheckSelfPermission(android.content.Context context, java.lang.String[] strArr) {
        return checkSelfPermission(context, strArr);
    }
}
