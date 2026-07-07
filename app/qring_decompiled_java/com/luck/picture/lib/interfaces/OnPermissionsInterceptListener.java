package com.luck.picture.lib.interfaces;

/* loaded from: /tmp/dex/classes2.dex */
public interface OnPermissionsInterceptListener {
    boolean hasPermissions(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr);

    void requestPermission(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, com.luck.picture.lib.interfaces.OnRequestPermissionListener onRequestPermissionListener);
}
