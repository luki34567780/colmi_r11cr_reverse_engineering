package com.qcwireless.qc_utils.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public class BluetoothUtils {
    public static boolean isEnabledBluetooth(android.content.Context context) {
        try {
            android.bluetooth.BluetoothAdapter adapter = ((android.bluetooth.BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
            if (context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && adapter != null) {
                return adapter.isEnabled();
            }
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean hasLollipop() {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }
}
