package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
final class WindowPermissionCompat {
    private static final int OP_SYSTEM_ALERT_WINDOW_DEFAULT_VALUE = 24;
    private static final java.lang.String OP_SYSTEM_ALERT_WINDOW_FIELD_NAME = "OP_SYSTEM_ALERT_WINDOW";

    WindowPermissionCompat() {
    }

    static boolean isGrantedPermission(android.content.Context context) {
        if (com.hjq.permissions.AndroidVersion.isAndroid6()) {
            return android.provider.Settings.canDrawOverlays(context);
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid4_4()) {
            return com.hjq.permissions.PermissionUtils.checkOpNoThrow(context, OP_SYSTEM_ALERT_WINDOW_FIELD_NAME, 24);
        }
        return true;
    }

    static android.content.Intent getPermissionIntent(android.content.Context context) {
        if (com.hjq.permissions.AndroidVersion.isAndroid6()) {
            if (com.hjq.permissions.AndroidVersion.isAndroid11() && com.hjq.permissions.PhoneRomUtils.isMiui() && com.hjq.permissions.PhoneRomUtils.isMiuiOptimization()) {
                return com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(com.hjq.permissions.PermissionIntentManager.getMiuiPermissionPageIntent(context), com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context));
            }
            android.content.Intent intent = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(com.hjq.permissions.PermissionUtils.getPackageNameUri(context));
            return com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent) ? intent : com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context);
        }
        if (com.hjq.permissions.PhoneRomUtils.isEmui()) {
            return com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(com.hjq.permissions.PermissionIntentManager.getEmuiWindowPermissionPageIntent(context), com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context));
        }
        if (com.hjq.permissions.PhoneRomUtils.isMiui()) {
            return com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(com.hjq.permissions.PhoneRomUtils.isMiuiOptimization() ? com.hjq.permissions.PermissionIntentManager.getMiuiWindowPermissionPageIntent(context) : null, com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context));
        }
        if (com.hjq.permissions.PhoneRomUtils.isColorOs()) {
            return com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(com.hjq.permissions.PermissionIntentManager.getColorOsWindowPermissionPageIntent(context), com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context));
        }
        if (com.hjq.permissions.PhoneRomUtils.isOriginOs()) {
            return com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(com.hjq.permissions.PermissionIntentManager.getOriginOsWindowPermissionPageIntent(context), com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context));
        }
        if (com.hjq.permissions.PhoneRomUtils.isOneUi()) {
            return com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(com.hjq.permissions.PermissionIntentManager.getOneUiWindowPermissionPageIntent(context), com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context));
        }
        return com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context);
    }
}
