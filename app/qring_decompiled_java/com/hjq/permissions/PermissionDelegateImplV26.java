package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
class PermissionDelegateImplV26 extends com.hjq.permissions.PermissionDelegateImplV23 {
    PermissionDelegateImplV26() {
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.REQUEST_INSTALL_PACKAGES)) {
            return isGrantedInstallPermission(context);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.PICTURE_IN_PICTURE)) {
            return isGrantedPictureInPicturePermission(context);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.READ_PHONE_NUMBERS) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ANSWER_PHONE_CALLS)) {
            return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, str);
        }
        return super.isGrantedPermission(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity activity, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.REQUEST_INSTALL_PACKAGES) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.PICTURE_IN_PICTURE)) {
            return false;
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.READ_PHONE_NUMBERS) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ANSWER_PHONE_CALLS)) {
            return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, str) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
        }
        return super.isPermissionPermanentDenied(activity, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.REQUEST_INSTALL_PACKAGES)) {
            return getInstallPermissionIntent(context);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.PICTURE_IN_PICTURE)) {
            return getPictureInPicturePermissionIntent(context);
        }
        return super.getPermissionIntent(context, str);
    }

    private static boolean isGrantedInstallPermission(android.content.Context context) {
        return context.getPackageManager().canRequestPackageInstalls();
    }

    private static android.content.Intent getInstallPermissionIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(com.hjq.permissions.PermissionUtils.getPackageNameUri(context));
        return !com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent) ? com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }

    private static boolean isGrantedPictureInPicturePermission(android.content.Context context) {
        return com.hjq.permissions.PermissionUtils.checkOpNoThrow(context, "android:picture_in_picture");
    }

    private static android.content.Intent getPictureInPicturePermissionIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS");
        intent.setData(com.hjq.permissions.PermissionUtils.getPackageNameUri(context));
        return !com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent) ? com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }
}
