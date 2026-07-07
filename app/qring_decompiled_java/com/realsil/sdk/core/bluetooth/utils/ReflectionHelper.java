package com.realsil.sdk.core.bluetooth.utils;

/* loaded from: classes3.dex */
public final class ReflectionHelper {
    public static int getCurrentAdapterState(android.content.Intent intent) {
        return intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
    }

    public static int getCurrentProfileState(android.content.Intent intent) {
        return intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
    }

    public static android.bluetooth.BluetoothDevice getDevice(android.content.Intent intent) {
        return (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
    }

    public static int getPreviousAdapterState(android.content.Intent intent) {
        return intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
    }

    public static int getPreviousProfileState(android.content.Intent intent) {
        return intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
    }

    public static void printAllInform(java.lang.Class cls) {
        try {
            java.lang.reflect.Method[] methods = cls.getMethods();
            if (methods == null || methods.length <= 0) {
                com.realsil.sdk.core.logger.ZLogger.w("no method");
            } else {
                for (java.lang.reflect.Method method : methods) {
                    com.realsil.sdk.core.logger.ZLogger.d(method.toString());
                }
            }
            java.lang.reflect.Field[] fields = cls.getFields();
            if (fields == null || fields.length <= 0) {
                com.realsil.sdk.core.logger.ZLogger.w("no fields");
                return;
            }
            for (java.lang.reflect.Field field : fields) {
                com.realsil.sdk.core.logger.ZLogger.d(field.toString());
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
