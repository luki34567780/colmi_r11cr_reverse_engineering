package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
final class PermissionIntentManager {
    private static final java.lang.String COLOR_OS_SAFE_CENTER_APP_PACKAGE_NAME_1 = "com.oppo.safe";
    private static final java.lang.String COLOR_OS_SAFE_CENTER_APP_PACKAGE_NAME_2 = "com.color.safecenter";
    private static final java.lang.String COLOR_OS_SAFE_CENTER_APP_PACKAGE_NAME_3 = "com.oplus.safecenter";
    private static final java.lang.String EMUI_MOBILE_MANAGER_APP_PACKAGE_NAME = "com.huawei.systemmanager";
    private static final java.lang.String MIUI_MOBILE_MANAGER_APP_PACKAGE_NAME = "com.miui.securitycenter";
    private static final java.lang.String ORIGIN_OS_MOBILE_MANAGER_APP_PACKAGE_NAME = "com.iqoo.secure";

    PermissionIntentManager() {
    }

    static android.content.Intent getEmuiWindowPermissionPageIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(EMUI_MOBILE_MANAGER_APP_PACKAGE_NAME, "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClassName(EMUI_MOBILE_MANAGER_APP_PACKAGE_NAME, "com.huawei.notificationmanager.ui.NotificationManagmentActivity");
        android.content.Intent huaWeiMobileManagerAppIntent = getHuaWeiMobileManagerAppIntent(context);
        java.lang.String romVersionName = com.hjq.permissions.PhoneRomUtils.getRomVersionName();
        if (romVersionName == null) {
            romVersionName = "";
        }
        if (romVersionName.startsWith("3.0")) {
            if (!com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent2)) {
                intent2 = null;
            }
            if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent)) {
                intent2 = com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(intent2, intent);
            }
        } else {
            if (!com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent)) {
                intent = null;
            }
            intent2 = com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent2) ? com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(intent, intent2) : intent;
        }
        return com.hjq.permissions.PermissionUtils.areActivityIntent(context, huaWeiMobileManagerAppIntent) ? com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(intent2, huaWeiMobileManagerAppIntent) : intent2;
    }

    static android.content.Intent getMiuiWindowPermissionPageIntent(android.content.Context context) {
        return getMiuiPermissionPageIntent(context);
    }

    static android.content.Intent getColorOsWindowPermissionPageIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("com.oppo.safe.permission.PermissionTopActivity");
        android.content.Intent oppoSafeCenterAppIntent = getOppoSafeCenterAppIntent(context);
        if (!com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent)) {
            intent = null;
        }
        return com.hjq.permissions.PermissionUtils.areActivityIntent(context, oppoSafeCenterAppIntent) ? com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(intent, oppoSafeCenterAppIntent) : intent;
    }

    static android.content.Intent getOriginOsWindowPermissionPageIntent(android.content.Context context) {
        android.content.Intent vivoMobileManagerAppIntent = getVivoMobileManagerAppIntent(context);
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, vivoMobileManagerAppIntent)) {
            return vivoMobileManagerAppIntent;
        }
        return null;
    }

    static android.content.Intent getOneUiWindowPermissionPageIntent(android.content.Context context) {
        return getOneUiPermissionPageIntent(context);
    }

    static android.content.Intent getMiuiPermissionPageIntent(android.content.Context context) {
        android.content.Intent putExtra = new android.content.Intent().setAction("miui.intent.action.APP_PERM_EDITOR").putExtra("extra_pkgname", context.getPackageName());
        android.content.Intent xiaoMiMobileManagerAppIntent = getXiaoMiMobileManagerAppIntent(context);
        if (!com.hjq.permissions.PermissionUtils.areActivityIntent(context, putExtra)) {
            putExtra = null;
        }
        return com.hjq.permissions.PermissionUtils.areActivityIntent(context, xiaoMiMobileManagerAppIntent) ? com.hjq.permissions.StartActivityManager.addSubIntentToMainIntent(putExtra, xiaoMiMobileManagerAppIntent) : putExtra;
    }

    static android.content.Intent getOriginOsPermissionPageIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("permission.intent.action.softPermissionDetail");
        intent.putExtra("packagename", context.getPackageName());
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent)) {
            return intent;
        }
        return null;
    }

    static android.content.Intent getOneUiPermissionPageIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName("com.android.settings", "com.android.settings.Settings$AppOpsDetailsActivity");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package", context.getPackageName());
        intent.putExtra(":settings:show_fragment_args", bundle);
        intent.setData(com.hjq.permissions.PermissionUtils.getPackageNameUri(context));
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent)) {
            return intent;
        }
        return null;
    }

    static android.content.Intent getHuaWeiMobileManagerAppIntent(android.content.Context context) {
        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(EMUI_MOBILE_MANAGER_APP_PACKAGE_NAME);
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        return null;
    }

    static android.content.Intent getXiaoMiMobileManagerAppIntent(android.content.Context context) {
        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(MIUI_MOBILE_MANAGER_APP_PACKAGE_NAME);
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        return null;
    }

    static android.content.Intent getOppoSafeCenterAppIntent(android.content.Context context) {
        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(COLOR_OS_SAFE_CENTER_APP_PACKAGE_NAME_1);
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        android.content.Intent launchIntentForPackage2 = context.getPackageManager().getLaunchIntentForPackage(COLOR_OS_SAFE_CENTER_APP_PACKAGE_NAME_2);
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, launchIntentForPackage2)) {
            return launchIntentForPackage2;
        }
        android.content.Intent launchIntentForPackage3 = context.getPackageManager().getLaunchIntentForPackage(COLOR_OS_SAFE_CENTER_APP_PACKAGE_NAME_3);
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, launchIntentForPackage3)) {
            return launchIntentForPackage3;
        }
        return null;
    }

    static android.content.Intent getVivoMobileManagerAppIntent(android.content.Context context) {
        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(ORIGIN_OS_MOBILE_MANAGER_APP_PACKAGE_NAME);
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        return null;
    }

    static android.content.Intent getApplicationDetailsIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(com.hjq.permissions.PermissionUtils.getPackageNameUri(context));
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent)) {
            return intent;
        }
        android.content.Intent intent2 = new android.content.Intent("android.settings.APPLICATION_SETTINGS");
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent2)) {
            return intent2;
        }
        android.content.Intent intent3 = new android.content.Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
        return com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent3) ? intent3 : getAndroidSettingAppIntent(context);
    }

    static android.content.Intent getAndroidSettingAppIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.SETTINGS");
        if (com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent)) {
            return intent;
        }
        return null;
    }
}
