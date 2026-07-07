package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
class PermissionDelegateImplV29 extends com.hjq.permissions.PermissionDelegateImplV28 {
    PermissionDelegateImplV29() {
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION)) {
            return hasReadStoragePermission(context) && com.hjq.permissions.PermissionUtils.checkSelfPermission(context, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACTIVITY_RECOGNITION)) {
            return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, str);
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid11() || !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE) || isUseDeprecationExternalStorage()) {
            return super.isGrantedPermission(context, str);
        }
        return false;
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity activity, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION)) {
            if (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION)) {
                return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, str) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
            }
            return !com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION)) {
            return (!hasReadStoragePermission(activity) || com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, str) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACTIVITY_RECOGNITION)) {
            return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, str) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid11() || !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE) || isUseDeprecationExternalStorage()) {
            return super.isPermissionPermanentDenied(activity, str);
        }
        return true;
    }

    private static boolean isUseDeprecationExternalStorage() {
        return android.os.Environment.isExternalStorageLegacy();
    }

    private boolean hasReadStoragePermission(android.content.Context context) {
        if (com.hjq.permissions.AndroidVersion.isAndroid13() && com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(context) >= 33) {
            return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, "android.permission.READ_MEDIA_IMAGES") || isGrantedPermission(context, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE);
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid11() || com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(context) < 30) {
            return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE");
        }
        return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") || isGrantedPermission(context, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE);
    }
}
