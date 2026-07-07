package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
class PermissionDelegateImplV31 extends com.hjq.permissions.PermissionDelegateImplV30 {
    PermissionDelegateImplV31() {
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.SCHEDULE_EXACT_ALARM)) {
            return isGrantedAlarmPermission(context);
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_SCAN) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_ADVERTISE)) {
            return com.hjq.permissions.PermissionUtils.checkSelfPermission(context, str);
        }
        return super.isGrantedPermission(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity activity, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.SCHEDULE_EXACT_ALARM)) {
            return false;
        }
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_SCAN) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) || com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_ADVERTISE)) {
            return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, str) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
        }
        if (activity.getApplicationInfo().targetSdkVersion < 31 || !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION)) {
            return super.isPermissionPermanentDenied(activity, str);
        }
        return (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) || com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, com.hjq.permissions.Permission.ACCESS_COARSE_LOCATION)) ? (com.hjq.permissions.PermissionUtils.checkSelfPermission(activity, str) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true : (com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) || com.hjq.permissions.PermissionUtils.shouldShowRequestPermissionRationale(activity, com.hjq.permissions.Permission.ACCESS_COARSE_LOCATION)) ? false : true;
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.SCHEDULE_EXACT_ALARM)) {
            return getAlarmPermissionIntent(context);
        }
        return super.getPermissionIntent(context, str);
    }

    private static boolean isGrantedAlarmPermission(android.content.Context context) {
        return ((android.app.AlarmManager) context.getSystemService(android.app.AlarmManager.class)).canScheduleExactAlarms();
    }

    private static android.content.Intent getAlarmPermissionIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
        intent.setData(com.hjq.permissions.PermissionUtils.getPackageNameUri(context));
        return !com.hjq.permissions.PermissionUtils.areActivityIntent(context, intent) ? com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }
}
