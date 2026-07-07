package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
final class NotificationPermissionCompat {
    private static final int OP_POST_NOTIFICATION_DEFAULT_VALUE = 11;
    private static final java.lang.String OP_POST_NOTIFICATION_FIELD_NAME = "OP_POST_NOTIFICATION";

    NotificationPermissionCompat() {
    }

    static boolean isGrantedPermission(android.content.Context context) {
        if (com.hjq.permissions.AndroidVersion.isAndroid7()) {
            return ((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).areNotificationsEnabled();
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid4_4()) {
            return com.hjq.permissions.PermissionUtils.checkOpNoThrow(context, OP_POST_NOTIFICATION_FIELD_NAME, 11);
        }
        return true;
    }

    static android.content.Intent getPermissionIntent(android.content.Context context) {
        android.content.Intent intent;
        if (com.hjq.permissions.AndroidVersion.isAndroid8()) {
            intent = new android.content.Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else if (com.hjq.permissions.AndroidVersion.isAndroid5()) {
            intent = new android.content.Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        } else {
            intent = null;
        }
        return !com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent) ? com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }
}
