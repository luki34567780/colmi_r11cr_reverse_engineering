package com.qcwireless.qcwatch.ui.base.util;

/* compiled from: SameDeviceUtil.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"isSameDevice", "", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SameDeviceUtilKt {
    public static final boolean isSameDevice() {
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        java.lang.String lastDeviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastDeviceAddress();
        if (android.text.TextUtils.isEmpty(deviceAddress)) {
            return false;
        }
        return kotlin.text.StringsKt.equals$default(deviceAddress, lastDeviceAddress, false, 2, (java.lang.Object) null);
    }
}
