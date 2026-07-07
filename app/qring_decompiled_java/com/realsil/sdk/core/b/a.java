package com.realsil.sdk.core.b;

/* loaded from: classes3.dex */
public final class a {
    public static boolean a(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        return android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str) && (java.lang.Integer.parseInt(str.split(":")[0], 16) & 192) == 192;
    }
}
