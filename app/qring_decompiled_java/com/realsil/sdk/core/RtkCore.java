package com.realsil.sdk.core;

/* loaded from: classes3.dex */
public final class RtkCore {
    public static boolean DEBUG;
    public static boolean VDBG;
    public static android.content.Context a;

    public static java.lang.String getVersion() {
        return "1.2.20";
    }

    public static synchronized void initialize(android.content.Context context, com.realsil.sdk.core.RtkConfigure rtkConfigure) {
        synchronized (com.realsil.sdk.core.RtkCore.class) {
            if (a == null) {
                a = context.getApplicationContext();
            }
            com.realsil.sdk.core.logger.ZLogger.v(true, java.lang.String.format("%s:%s:%s", com.realsil.sdk.bbpro.core.BuildConfig.GROUP_ID, "rtk-core", "1.2.20"));
            DEBUG = rtkConfigure.isDebugEnabled();
            com.realsil.sdk.core.logger.ZLogger.initialize(rtkConfigure.getLogTag(), rtkConfigure.isPrintLog(), rtkConfigure.getGlobalLogLevel());
            com.realsil.sdk.core.logger.ZLogger.d(rtkConfigure.toString());
            if (com.realsil.sdk.core.bluetooth.GlobalGatt.getInstance() == null) {
                com.realsil.sdk.core.bluetooth.GlobalGatt.initial(a);
            }
            if (com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattManager.getInstance() == null) {
                com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattManager.initial(a);
            }
            com.realsil.sdk.core.bluetooth.BluetoothProfileManager.initial(a);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("DeviceInfo{");
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("SDK_INT: ");
            int i = android.os.Build.VERSION.SDK_INT;
            a2.append(i);
            sb.append(a2.toString());
            sb.append("\nDevice name: " + android.os.Build.DEVICE);
            sb.append("\nAndroid Version: " + android.os.Build.VERSION.RELEASE);
            sb.append("\nManufacture: " + android.os.Build.MANUFACTURER);
            sb.append("\nModel: " + android.os.Build.MODEL);
            if (i >= 21) {
                java.lang.StringBuilder a3 = com.realsil.sdk.core.a.a.a("\nsupportedABIS: ");
                a3.append(java.util.Arrays.toString(android.os.Build.SUPPORTED_ABIS));
                sb.append(a3.toString());
            } else {
                java.lang.StringBuilder a4 = com.realsil.sdk.core.a.a.a("\ncpuABI: ");
                a4.append(android.os.Build.CPU_ABI);
                sb.append(a4.toString());
            }
            sb.append("}");
            com.realsil.sdk.core.logger.ZLogger.d(sb.toString());
        }
    }

    public static boolean isBluetoothSupported() {
        return com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattManager.getInstance().isBluetoothSupported();
    }
}
