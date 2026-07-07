package com.realsil.sdk.core.bluetooth.impl;

/* loaded from: classes3.dex */
public class BluetoothHeadsetImpl {
    public static final java.lang.String CLASS_NAME = "android.bluetooth.BluetoothHeadset";
    public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_IPHONEACCEV = "+IPHONEACCEV";
    public static final int VENDOR_SPECIFIC_HEADSET_EVENT_IPHONEACCEV_BATTERY_LEVEL = 1;
    public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_XEVENT = "+XEVENT";
    public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_XEVENT_BATTERY_LEVEL = "BATTERY";

    public static int getAudioState(android.bluetooth.BluetoothHeadset bluetoothHeadset, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothHeadset == null) {
            return 10;
        }
        try {
            return ((java.lang.Integer) bluetoothHeadset.getClass().getMethod("getAudioState", android.bluetooth.BluetoothDevice.class).invoke(bluetoothHeadset, bluetoothDevice)).intValue();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 10;
        }
    }

    public static int getBatteryLevel(java.lang.String str, java.lang.Object[] objArr) {
        str.getClass();
        if (str.equals(VENDOR_SPECIFIC_HEADSET_EVENT_IPHONEACCEV)) {
            return getBatteryLevelFromAppleBatteryVsc(objArr);
        }
        if (str.equals(VENDOR_SPECIFIC_HEADSET_EVENT_XEVENT)) {
            return getBatteryLevelFromXEventVsc(objArr);
        }
        return -1;
    }

    public static int getBatteryLevelFromAppleBatteryVsc(java.lang.Object[] objArr) {
        int i;
        if (objArr.length == 0) {
            com.realsil.sdk.core.logger.ZLogger.w("empty arguments");
            return -1;
        }
        int i2 = 0;
        if (!(objArr[0] instanceof java.lang.Integer)) {
            com.realsil.sdk.core.logger.ZLogger.w("error parsing number of arguments");
            return -1;
        }
        int intValue = ((java.lang.Integer) objArr[0]).intValue();
        if (objArr.length != (intValue * 2) + 1) {
            com.realsil.sdk.core.logger.ZLogger.w("number of arguments does not match");
            return -1;
        }
        while (true) {
            if (i2 >= intValue) {
                i = -1;
                break;
            }
            int i3 = i2 * 2;
            java.lang.Object obj = objArr[i3 + 1];
            if (!(obj instanceof java.lang.Integer)) {
                com.realsil.sdk.core.logger.ZLogger.w("error parsing indicator type");
                return -1;
            }
            if (((java.lang.Integer) obj).intValue() != 1) {
                i2++;
            } else {
                java.lang.Object obj2 = objArr[i3 + 2];
                if (!(obj2 instanceof java.lang.Integer)) {
                    com.realsil.sdk.core.logger.ZLogger.w("error parsing indicator value");
                    return -1;
                }
                i = ((java.lang.Integer) obj2).intValue();
            }
        }
        if (i < 0 || i > 9) {
            return -1;
        }
        return (i + 1) * 10;
    }

    public static int getBatteryLevelFromXEventVsc(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            com.realsil.sdk.core.logger.ZLogger.w("empty arguments");
            return -1;
        }
        java.lang.Object obj = objArr[0];
        if (!(obj instanceof java.lang.String)) {
            com.realsil.sdk.core.logger.ZLogger.w("error parsing event name");
            return -1;
        }
        java.lang.String str = (java.lang.String) obj;
        if (!str.equals(VENDOR_SPECIFIC_HEADSET_EVENT_XEVENT_BATTERY_LEVEL)) {
            com.realsil.sdk.core.logger.ZLogger.w("skip none BATTERY event: " + str);
            return -1;
        }
        if (objArr.length != 5) {
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("wrong battery level event length: ");
            a.append(java.lang.String.valueOf(objArr.length));
            com.realsil.sdk.core.logger.ZLogger.w(a.toString());
            return -1;
        }
        if (!(objArr[1] instanceof java.lang.Integer) || !(objArr[2] instanceof java.lang.Integer)) {
            com.realsil.sdk.core.logger.ZLogger.w("error parsing event values");
            return -1;
        }
        int intValue = ((java.lang.Integer) objArr[1]).intValue();
        int intValue2 = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue >= 0 && intValue2 > 1 && intValue <= intValue2) {
            return (intValue * 100) / (intValue2 - 1);
        }
        java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("wrong event value, batteryLevel=");
        a2.append(java.lang.String.valueOf(intValue));
        a2.append(", numberOfLevels=");
        a2.append(java.lang.String.valueOf(intValue2));
        com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
        return -1;
    }

    public static boolean startScoUsingVirtualVoiceCall(android.bluetooth.BluetoothHeadset bluetoothHeadset) {
        if (bluetoothHeadset == null) {
            return false;
        }
        try {
            return ((java.lang.Boolean) bluetoothHeadset.getClass().getMethod("startScoUsingVirtualVoiceCall", new java.lang.Class[0]).invoke(bluetoothHeadset, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean stopScoUsingVirtualVoiceCall(android.bluetooth.BluetoothHeadset bluetoothHeadset) {
        if (bluetoothHeadset == null) {
            return false;
        }
        try {
            return ((java.lang.Boolean) bluetoothHeadset.getClass().getMethod("stopScoUsingVirtualVoiceCall", new java.lang.Class[0]).invoke(bluetoothHeadset, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean startScoUsingVirtualVoiceCall(android.bluetooth.BluetoothHeadset bluetoothHeadset, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return startScoUsingVirtualVoiceCall(bluetoothHeadset);
        }
        if (bluetoothHeadset == null) {
            return false;
        }
        try {
            return ((java.lang.Boolean) bluetoothHeadset.getClass().getMethod("startScoUsingVirtualVoiceCall", android.bluetooth.BluetoothDevice.class).invoke(bluetoothHeadset, bluetoothDevice)).booleanValue();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean stopScoUsingVirtualVoiceCall(android.bluetooth.BluetoothHeadset bluetoothHeadset, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return stopScoUsingVirtualVoiceCall(bluetoothHeadset);
        }
        if (bluetoothHeadset == null) {
            return false;
        }
        try {
            return ((java.lang.Boolean) bluetoothHeadset.getClass().getMethod("stopScoUsingVirtualVoiceCall", android.bluetooth.BluetoothDevice.class).invoke(bluetoothHeadset, bluetoothDevice)).booleanValue();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
