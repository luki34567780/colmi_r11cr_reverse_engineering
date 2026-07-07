package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
class PermissionDelegateImplV19 extends com.hjq.permissions.PermissionDelegateImplV18 {
    PermissionDelegateImplV19() {
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.SYSTEM_ALERT_WINDOW)) {
            return com.hjq.permissions.WindowPermissionCompat.isGrantedPermission(context);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.GET_INSTALLED_APPS)) {
            return com.hjq.permissions.GetInstalledAppsPermissionCompat.isGrantedPermission(context);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.NOTIFICATION_SERVICE)) {
            return com.hjq.permissions.NotificationPermissionCompat.isGrantedPermission(context);
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid13() && com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.POST_NOTIFICATIONS)) {
            return com.hjq.permissions.NotificationPermissionCompat.isGrantedPermission(context);
        }
        return super.isGrantedPermission(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity activity, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.SYSTEM_ALERT_WINDOW)) {
            return false;
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.GET_INSTALLED_APPS)) {
            return com.hjq.permissions.GetInstalledAppsPermissionCompat.isPermissionPermanentDenied(activity);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.NOTIFICATION_SERVICE)) {
            return false;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid13() || !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.POST_NOTIFICATIONS)) {
            return super.isPermissionPermanentDenied(activity, str);
        }
        return false;
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.SYSTEM_ALERT_WINDOW)) {
            return com.hjq.permissions.WindowPermissionCompat.getPermissionIntent(context);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.GET_INSTALLED_APPS)) {
            return com.hjq.permissions.GetInstalledAppsPermissionCompat.getPermissionIntent(context);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.NOTIFICATION_SERVICE)) {
            return com.hjq.permissions.NotificationPermissionCompat.getPermissionIntent(context);
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid13() && com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.POST_NOTIFICATIONS)) {
            return com.hjq.permissions.NotificationPermissionCompat.getPermissionIntent(context);
        }
        return super.getPermissionIntent(context, str);
    }
}
