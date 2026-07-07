package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
class PermissionDelegateImplV33 extends com.hjq.permissions.PermissionDelegateImplV31 {
    PermissionDelegateImplV33() {
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV31, com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND)) {
            return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, com.hjq.permissions.Permission.BODY_SENSORS) && com.hjq.permissions.PermissionUtils.checkSelfPermission(context, com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.POST_NOTIFICATIONS) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.NEARBY_WIFI_DEVICES) || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_VIDEO") || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_AUDIO")) {
            return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, str);
        }
        if (com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(context) >= 33) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return true;
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_EXTERNAL_STORAGE")) {
                return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, "android.permission.READ_MEDIA_IMAGES") && com.hjq.permissions.PermissionUtils.checkSelfPermission(context, "android.permission.READ_MEDIA_VIDEO") && com.hjq.permissions.PermissionUtils.checkSelfPermission(context, "android.permission.READ_MEDIA_AUDIO");
            }
        }
        return super.isGrantedPermission(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV31, com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity activity, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND)) {
            if (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, com.hjq.permissions.Permission.BODY_SENSORS)) {
                return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, str) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
            }
            return !com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, com.hjq.permissions.Permission.BODY_SENSORS);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.POST_NOTIFICATIONS) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.NEARBY_WIFI_DEVICES) || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_VIDEO") || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_AUDIO")) {
            return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, str) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
        }
        if (com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(activity) >= 33) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return false;
            }
            if (com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_EXTERNAL_STORAGE")) {
                return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, "android.permission.READ_MEDIA_VIDEO") || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, "android.permission.READ_MEDIA_VIDEO") || com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, "android.permission.READ_MEDIA_AUDIO") || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, "android.permission.READ_MEDIA_AUDIO")) ? false : true;
            }
        }
        return super.isPermissionPermanentDenied(activity, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV31, com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.POST_NOTIFICATIONS)) {
            return com.hjq.permissions.NotificationPermissionCompat.getPermissionIntent(context);
        }
        return super.getPermissionIntent(context, str);
    }
}
