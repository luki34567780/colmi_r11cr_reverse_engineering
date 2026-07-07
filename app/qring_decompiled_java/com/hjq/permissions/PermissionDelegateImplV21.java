package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
class PermissionDelegateImplV21 extends com.hjq.permissions.PermissionDelegateImplV19 {
    PermissionDelegateImplV21() {
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.PACKAGE_USAGE_STATS)) {
            return isGrantedPackagePermission(context);
        }
        return super.isGrantedPermission(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity activity, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.PACKAGE_USAGE_STATS)) {
            return false;
        }
        return super.isPermissionPermanentDenied(activity, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.PACKAGE_USAGE_STATS)) {
            return getPackagePermissionIntent(context);
        }
        return super.getPermissionIntent(context, str);
    }

    private static boolean isGrantedPackagePermission(android.content.Context context) {
        return com.hjq.permissions.PermissionUtils.checkOpNoThrow(context, "android:get_usage_stats");
    }

    private static android.content.Intent getPackagePermissionIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.USAGE_ACCESS_SETTINGS");
        if (com.hjq.permissions.AndroidVersion.isAndroid10()) {
            intent.setData(com.hjq.permissions.PermissionUtils.getPackageNameUri(context));
        }
        return !com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent) ? com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }
}
