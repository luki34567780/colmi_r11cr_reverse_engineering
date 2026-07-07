package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
class PermissionDelegateImplV23 extends com.hjq.permissions.PermissionDelegateImplV21 {
    PermissionDelegateImplV23() {
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context context, java.lang.String str) {
        if (!com.hjq.permissions.AndroidVersion.isAndroid13()) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.POST_NOTIFICATIONS)) {
                return super.isGrantedPermission(context, str);
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.NEARBY_WIFI_DEVICES)) {
                return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION);
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND)) {
                return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, com.hjq.permissions.Permission.BODY_SENSORS);
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_VIDEO") || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_AUDIO")) {
                return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid12()) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_SCAN)) {
                return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION);
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_ADVERTISE)) {
                return true;
            }
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid11() && com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE)) {
            return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") && com.hjq.permissions.PermissionUtils.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid10()) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION)) {
                return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION);
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACTIVITY_RECOGNITION)) {
                return true;
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION)) {
                return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid9() && com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCEPT_HANDOVER)) {
            return true;
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid8()) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ANSWER_PHONE_CALLS)) {
                return true;
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.READ_PHONE_NUMBERS)) {
                return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, com.hjq.permissions.Permission.READ_PHONE_STATE);
            }
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.GET_INSTALLED_APPS) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.POST_NOTIFICATIONS)) {
            return super.isGrantedPermission(context, str);
        }
        if (com.hjq.permissions.PermissionUtils.isSpecialPermission(str)) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.WRITE_SETTINGS)) {
                return isGrantedSettingPermission(context);
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_NOTIFICATION_POLICY)) {
                return isGrantedNotDisturbPermission(context);
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS)) {
                return isGrantedIgnoreBatteryPermission(context);
            }
            return super.isGrantedPermission(context, str);
        }
        return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity activity, java.lang.String str) {
        if (!com.hjq.permissions.AndroidVersion.isAndroid13()) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.POST_NOTIFICATIONS)) {
                return super.isPermissionPermanentDenied(activity, str);
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.NEARBY_WIFI_DEVICES)) {
                return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION)) ? false : true;
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND)) {
                return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, com.hjq.permissions.Permission.BODY_SENSORS) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, com.hjq.permissions.Permission.BODY_SENSORS)) ? false : true;
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_VIDEO") || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_AUDIO")) {
                return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, "android.permission.READ_EXTERNAL_STORAGE")) ? false : true;
            }
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid12()) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_SCAN)) {
                return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION)) ? false : true;
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_ADVERTISE)) {
                return false;
            }
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid10()) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION)) {
                return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION)) ? false : true;
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACTIVITY_RECOGNITION)) {
                return false;
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION)) {
                return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, "android.permission.READ_EXTERNAL_STORAGE")) ? false : true;
            }
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid9() && com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCEPT_HANDOVER)) {
            return false;
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid8()) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ANSWER_PHONE_CALLS)) {
                return false;
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.READ_PHONE_NUMBERS)) {
                return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, com.hjq.permissions.Permission.READ_PHONE_STATE) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, com.hjq.permissions.Permission.READ_PHONE_STATE)) ? false : true;
            }
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.GET_INSTALLED_APPS) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.POST_NOTIFICATIONS)) {
            return super.isPermissionPermanentDenied(activity, str);
        }
        return (com.hjq.permissions.PermissionUtils.isSpecialPermission(str) || com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, str) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.WRITE_SETTINGS)) {
            return getSettingPermissionIntent(context);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_NOTIFICATION_POLICY)) {
            return getNotDisturbPermissionIntent(context);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS)) {
            return getIgnoreBatteryPermissionIntent(context);
        }
        return super.getPermissionIntent(context, str);
    }

    private static boolean isGrantedSettingPermission(android.content.Context context) {
        if (com.hjq.permissions.AndroidVersion.isAndroid6()) {
            return android.provider.Settings.System.canWrite(context);
        }
        return true;
    }

    private static android.content.Intent getSettingPermissionIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(com.hjq.permissions.PermissionUtils.getPackageNameUri(context));
        return !com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent) ? com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }

    private static boolean isGrantedNotDisturbPermission(android.content.Context context) {
        return ((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).isNotificationPolicyAccessGranted();
    }

    private static android.content.Intent getNotDisturbPermissionIntent(android.content.Context context) {
        android.content.Intent intent;
        if (!com.hjq.permissions.AndroidVersion.isAndroid10() || com.hjq.permissions.PhoneRomUtils.isHarmonyOs()) {
            intent = null;
        } else {
            intent = new android.content.Intent("android.settings.NOTIFICATION_POLICY_ACCESS_DETAIL_SETTINGS");
            intent.setData(com.hjq.permissions.PermissionUtils.getPackageNameUri(context));
        }
        if (!com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent)) {
            intent = new android.content.Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
        }
        return !com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent) ? com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }

    private static boolean isGrantedIgnoreBatteryPermission(android.content.Context context) {
        return ((android.os.PowerManager) context.getSystemService(android.os.PowerManager.class)).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    private static android.content.Intent getIgnoreBatteryPermissionIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(com.hjq.permissions.PermissionUtils.getPackageNameUri(context));
        if (!com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent)) {
            intent = new android.content.Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        }
        return !com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent) ? com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }
}
