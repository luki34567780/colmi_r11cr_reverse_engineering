package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
public interface IPermissionInterceptor {
    void deniedPermissionRequest(android.app.Activity activity, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback);

    void finishPermissionRequest(android.app.Activity activity, java.util.List<java.lang.String> list, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback);

    void grantedPermissionRequest(android.app.Activity activity, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback);

    void launchPermissionRequest(android.app.Activity activity, java.util.List<java.lang.String> list, com.hjq.permissions.OnPermissionCallback onPermissionCallback);

    /* renamed from: com.hjq.permissions.IPermissionInterceptor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$finishPermissionRequest(com.hjq.permissions.IPermissionInterceptor _this, android.app.Activity activity, java.util.List list, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        }

        public static void $default$grantedPermissionRequest(com.hjq.permissions.IPermissionInterceptor _this, android.app.Activity activity, java.util.List list, java.util.List list2, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
            if (onPermissionCallback == null) {
                return;
            }
            onPermissionCallback.onGranted(list2, z);
        }

        public static void $default$deniedPermissionRequest(com.hjq.permissions.IPermissionInterceptor _this, android.app.Activity activity, java.util.List list, java.util.List list2, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
            if (onPermissionCallback == null) {
                return;
            }
            onPermissionCallback.onDenied(list2, z);
        }
    }
}
