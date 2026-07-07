package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
class PermissionDelegateImplV14 implements com.hjq.permissions.PermissionDelegate {
    @Override // com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(android.app.Activity activity, java.lang.String str) {
        return false;
    }

    PermissionDelegateImplV14() {
    }

    @Override // com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BIND_VPN_SERVICE)) {
            return isGrantedVpnPermission(context);
        }
        return true;
    }

    @Override // com.hjq.permissions.PermissionDelegate
    public android.content.Intent getPermissionIntent(android.content.Context context, java.lang.String str) {
        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BIND_VPN_SERVICE)) {
            return getVpnPermissionIntent(context);
        }
        return com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context);
    }

    private static boolean isGrantedVpnPermission(android.content.Context context) {
        return android.net.VpnService.prepare(context) == null;
    }

    private static android.content.Intent getVpnPermissionIntent(android.content.Context context) {
        android.content.Intent prepare = android.net.VpnService.prepare(context);
        return !com.hjq.permissions.PermissionUtils.areActivityIntent(context, prepare) ? com.hjq.permissions.PermissionIntentManager.getApplicationDetailsIntent(context) : prepare;
    }
}
