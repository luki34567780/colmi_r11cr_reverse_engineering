package com.realsil.sdk.core.bluetooth.impl;

/* loaded from: classes3.dex */
public class BluetoothClassImpl {
    public static final int PROFILE_A2DP = 1;
    public static final int PROFILE_A2DP_SINK = 6;
    public static final int PROFILE_HEADSET = 0;
    public static final int PROFILE_HID = 3;
    public static final int PROFILE_NAP = 5;
    public static final int PROFILE_OPP = 2;
    public static final int PROFILE_PANU = 4;

    public static class Device {
        public static final int PERIPHERAL_KEYBOARD = 1344;
        public static final int PERIPHERAL_KEYBOARD_POINTING = 1472;
        public static final int PERIPHERAL_NON_KEYBOARD_NON_POINTING = 1280;
        public static final int PERIPHERAL_POINTING = 1408;
    }

    public static boolean doesClassMatch(android.bluetooth.BluetoothClass bluetoothClass, int i) {
        int deviceClass;
        int deviceClass2;
        int deviceClass3;
        if (i == 1) {
            return bluetoothClass.hasService(262144) || (deviceClass3 = bluetoothClass.getDeviceClass()) == 1044 || deviceClass3 == 1048 || deviceClass3 == 1056 || deviceClass3 == 1064;
        }
        if (i == 6) {
            return bluetoothClass.hasService(524288) || (deviceClass2 = bluetoothClass.getDeviceClass()) == 1060 || deviceClass2 == 1064 || deviceClass2 == 1068;
        }
        if (i == 0) {
            return bluetoothClass.hasService(262144) || (deviceClass = bluetoothClass.getDeviceClass()) == 1028 || deviceClass == 1032 || deviceClass == 1056;
        }
        if (i == 2) {
            if (bluetoothClass.hasService(1048576)) {
                return true;
            }
            switch (bluetoothClass.getDeviceClass()) {
                case 256:
                case 260:
                case 264:
                case 268:
                case 272:
                case 276:
                case 280:
                case 512:
                case 516:
                case 520:
                case 524:
                case 528:
                case 532:
                    return true;
                default:
                    return false;
            }
        }
        if (i == 3) {
            return (bluetoothClass.getDeviceClass() & com.realsil.sdk.core.bluetooth.impl.BluetoothClassImpl.Device.PERIPHERAL_NON_KEYBOARD_NON_POINTING) == 1280;
        }
        if (i == 4 || i == 5) {
            return bluetoothClass.hasService(131072) || (bluetoothClass.getDeviceClass() & com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp.STATE_DISCONNECTING) == 768;
        }
        return false;
    }

    public static boolean isAudioDevice(android.bluetooth.BluetoothClass bluetoothClass) {
        if (bluetoothClass == null) {
            return false;
        }
        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("getDeviceClass: 0x%04X", java.lang.Integer.valueOf(bluetoothClass.getDeviceClass())));
        switch (bluetoothClass.getDeviceClass()) {
            case 1024:
            case 1028:
            case 1032:
            case 1040:
            case 1044:
            case 1048:
            case 1052:
            case 1056:
            case 1060:
            case 1064:
            case 1068:
            case 1072:
            case 1076:
            case 1080:
            case 1084:
            case 1088:
            case 1096:
                return true;
            default:
                return doesClassMatch(bluetoothClass, 0) || doesClassMatch(bluetoothClass, 1);
        }
    }

    public static boolean isHidDevice(android.bluetooth.BluetoothClass bluetoothClass) {
        if (bluetoothClass == null) {
            return false;
        }
        int deviceClass = bluetoothClass.getDeviceClass();
        boolean z = deviceClass == 1344 || deviceClass == 1408 || deviceClass == 1472;
        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("getDeviceClass: 0x%04X, isHid=%b", java.lang.Integer.valueOf(bluetoothClass.getDeviceClass()), java.lang.Boolean.valueOf(z)));
        return z;
    }

    public static java.lang.String parseDeviceClass(android.bluetooth.BluetoothClass bluetoothClass) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "major=0x%04X(", java.lang.Integer.valueOf(bluetoothClass.getMajorDeviceClass())));
        int majorDeviceClass = bluetoothClass.getMajorDeviceClass();
        if (majorDeviceClass == 0) {
            sb.append("MISC");
        } else if (majorDeviceClass == 256) {
            sb.append("COMPUTER");
        } else if (majorDeviceClass == 512) {
            sb.append(com.blankj.utilcode.constant.PermissionConstants.PHONE);
        } else if (majorDeviceClass == 768) {
            sb.append("NETWORKING");
        } else if (majorDeviceClass == 1024) {
            sb.append("AUDIO_VIDEO");
        } else if (majorDeviceClass == 1280) {
            sb.append("PERIPHERAL");
        } else if (majorDeviceClass == 1536) {
            sb.append("IMAGING");
        } else if (majorDeviceClass == 1792) {
            sb.append("WEARABLE");
        } else if (majorDeviceClass == 2048) {
            sb.append("TOY");
        } else if (majorDeviceClass != 2304) {
            sb.append("UNCATEGORIZED");
        } else {
            sb.append("HEALTH");
        }
        sb.append(")");
        sb.append(java.lang.String.format(locale, "device=0x%04X(", java.lang.Integer.valueOf(bluetoothClass.getDeviceClass())));
        int deviceClass = bluetoothClass.getDeviceClass();
        if (deviceClass == 260) {
            sb.append("COMPUTER_DESKTOP");
        } else if (deviceClass == 1344) {
            sb.append("PERIPHERAL_KEYBOARD");
        } else if (deviceClass == 1408) {
            sb.append("PERIPHERAL_POINTING");
        } else if (deviceClass != 1472) {
            sb.append("UNCATEGORIZED");
        } else {
            sb.append("PERIPHERAL_KEYBOARD_POINTING");
        }
        sb.append(")");
        return sb.toString();
    }
}
