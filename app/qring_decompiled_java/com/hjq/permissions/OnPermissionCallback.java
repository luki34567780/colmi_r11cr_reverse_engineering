package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
public interface OnPermissionCallback {

    /* renamed from: com.hjq.permissions.OnPermissionCallback$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onDenied(com.hjq.permissions.OnPermissionCallback _this, java.util.List list, boolean z) {
        }
    }

    void onDenied(java.util.List<java.lang.String> list, boolean z);

    void onGranted(java.util.List<java.lang.String> list, boolean z);
}
