package com.qcwireless.qcwatch.base.permission;

/* compiled from: PermissionUtil.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011\u001a\u0016\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011\u001a\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011\u001a\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011\u001a\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011\u001a\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011\u001a\u0016\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011\u001a\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011¨\u0006\u001b"}, d2 = {"hasBgLocationPermission", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "hasBluetooth", "hasCallPermission", "hasCallPhonePermission", "hasCameraPermission", "context", "Landroid/content/Context;", "hasContactPermission", "hasLocationPermission", "hasSMSPermission", "requestAlertWindowPermission", "", "requestAllPermission", "callback", "Lcom/hjq/permissions/OnPermissionCallback;", "requestBgLocation", "requestCallback", "requestBluetoothPermission", "requestCallPermission", "requestCallPhonePermission", "requestCameraPermission", "requestContactPermission", "requestLocationPermission", "requestSMSPermission", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class PermissionUtilKt {
    public static final void requestCallPhonePermission(androidx.fragment.app.FragmentActivity fragmentActivity, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPermissionCallback, "requestCallback");
        com.hjq.permissions.XXPermissions.with((android.content.Context) fragmentActivity).permission(com.hjq.permissions.Permission.READ_PHONE_STATE).permission(com.hjq.permissions.Permission.READ_CALL_LOG).permission(com.hjq.permissions.Permission.CALL_PHONE).permission(com.hjq.permissions.Permission.READ_CONTACTS).permission(com.hjq.permissions.Permission.ANSWER_PHONE_CALLS).request(onPermissionCallback);
    }

    public static final boolean hasCallPhonePermission(androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.hjq.permissions.Permission.READ_PHONE_STATE);
        arrayList.add(com.hjq.permissions.Permission.READ_CALL_LOG);
        arrayList.add(com.hjq.permissions.Permission.CALL_PHONE);
        arrayList.add(com.hjq.permissions.Permission.READ_CONTACTS);
        arrayList.add(com.hjq.permissions.Permission.ANSWER_PHONE_CALLS);
        return com.hjq.permissions.XXPermissions.isGranted((android.content.Context) fragmentActivity, arrayList);
    }

    public static final boolean hasCameraPermission(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.hjq.permissions.Permission.CAMERA);
        return com.hjq.permissions.XXPermissions.isGranted(context, arrayList);
    }

    public static final boolean hasSMSPermission(androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.hjq.permissions.Permission.READ_SMS);
        arrayList.add(com.hjq.permissions.Permission.RECEIVE_SMS);
        return com.hjq.permissions.XXPermissions.isGranted((android.content.Context) fragmentActivity, arrayList);
    }

    public static final boolean hasContactPermission(androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        return com.hjq.permissions.XXPermissions.isGranted((android.content.Context) fragmentActivity, com.hjq.permissions.Permission.READ_CONTACTS);
    }

    public static final boolean hasLocationPermission(androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        return com.hjq.permissions.XXPermissions.isGranted((android.content.Context) fragmentActivity, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION);
    }

    public static final boolean hasBgLocationPermission(androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        return com.hjq.permissions.XXPermissions.isGranted((android.content.Context) fragmentActivity, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION);
    }

    public static final boolean hasCallPermission(androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.hjq.permissions.Permission.READ_PHONE_STATE);
        arrayList.add(com.hjq.permissions.Permission.READ_CALL_LOG);
        arrayList.add(com.hjq.permissions.Permission.CALL_PHONE);
        arrayList.add(com.hjq.permissions.Permission.ANSWER_PHONE_CALLS);
        return com.hjq.permissions.XXPermissions.isGranted((android.content.Context) fragmentActivity, arrayList);
    }

    public static final boolean hasBluetooth(androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.hjq.permissions.Permission.BLUETOOTH_SCAN);
        arrayList.add(com.hjq.permissions.Permission.BLUETOOTH_CONNECT);
        arrayList.add(com.hjq.permissions.Permission.BLUETOOTH_ADVERTISE);
        return com.hjq.permissions.XXPermissions.isGranted((android.content.Context) fragmentActivity, arrayList);
    }

    public static final void requestSMSPermission(androidx.fragment.app.FragmentActivity fragmentActivity, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPermissionCallback, "requestCallback");
        com.hjq.permissions.XXPermissions.with((android.content.Context) fragmentActivity).permission(com.hjq.permissions.Permission.READ_SMS).permission(com.hjq.permissions.Permission.RECEIVE_SMS).request(onPermissionCallback);
    }

    public static final void requestLocationPermission(androidx.fragment.app.FragmentActivity fragmentActivity, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPermissionCallback, "requestCallback");
        com.hjq.permissions.XXPermissions.with((android.content.Context) fragmentActivity).permission(com.hjq.permissions.Permission.ACCESS_COARSE_LOCATION).permission(com.hjq.permissions.Permission.ACCESS_FINE_LOCATION).request(onPermissionCallback);
    }

    public static final void requestBluetoothPermission(androidx.fragment.app.FragmentActivity fragmentActivity, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPermissionCallback, "requestCallback");
        com.hjq.permissions.XXPermissions.with((android.content.Context) fragmentActivity).permission(com.hjq.permissions.Permission.BLUETOOTH_SCAN).permission(com.hjq.permissions.Permission.BLUETOOTH_CONNECT).permission(com.hjq.permissions.Permission.BLUETOOTH_ADVERTISE).permission(com.hjq.permissions.Permission.ACCESS_FINE_LOCATION).request(onPermissionCallback);
    }

    public static final void requestCallPermission(androidx.fragment.app.FragmentActivity fragmentActivity, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPermissionCallback, "requestCallback");
        com.hjq.permissions.XXPermissions.with((android.content.Context) fragmentActivity).permission(com.hjq.permissions.Permission.READ_PHONE_STATE).permission(com.hjq.permissions.Permission.READ_CALL_LOG).permission(com.hjq.permissions.Permission.CALL_PHONE).permission(com.hjq.permissions.Permission.ANSWER_PHONE_CALLS).request(onPermissionCallback);
    }

    public static final void requestContactPermission(androidx.fragment.app.FragmentActivity fragmentActivity, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPermissionCallback, "requestCallback");
        com.hjq.permissions.XXPermissions.with((android.content.Context) fragmentActivity).permission(com.hjq.permissions.Permission.READ_CONTACTS).request(onPermissionCallback);
    }

    public static final void requestBgLocation(androidx.fragment.app.FragmentActivity fragmentActivity, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPermissionCallback, "requestCallback");
        com.hjq.permissions.XXPermissions.with((android.content.Context) fragmentActivity).permission(com.hjq.permissions.Permission.ACCESS_COARSE_LOCATION).permission(com.hjq.permissions.Permission.ACCESS_FINE_LOCATION).request(onPermissionCallback);
    }

    public static final void requestAlertWindowPermission(androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        com.hjq.permissions.XXPermissions.with((android.content.Context) fragmentActivity).permission(com.hjq.permissions.Permission.SYSTEM_ALERT_WINDOW);
    }

    public static final void requestAllPermission(androidx.fragment.app.FragmentActivity fragmentActivity, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPermissionCallback, "callback");
        com.hjq.permissions.XXPermissions.with((android.content.Context) fragmentActivity).permission("android.permission.READ_MEDIA_IMAGES").request(onPermissionCallback);
    }

    public static final void requestCameraPermission(androidx.fragment.app.FragmentActivity fragmentActivity, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPermissionCallback, "requestCallback");
        com.hjq.permissions.XXPermissions.with((android.content.Context) fragmentActivity).permission(com.hjq.permissions.Permission.CAMERA).request(onPermissionCallback);
    }
}
