package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
public interface PermissionDelegate {
    android.content.Intent getPermissionIntent(android.content.Context context, java.lang.String str);

    boolean isGrantedPermission(android.content.Context context, java.lang.String str);

    boolean isPermissionPermanentDenied(android.app.Activity activity, java.lang.String str);
}
