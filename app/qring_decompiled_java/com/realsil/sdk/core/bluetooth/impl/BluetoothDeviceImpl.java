package com.realsil.sdk.core.bluetooth.impl;

/* loaded from: classes3.dex */
public class BluetoothDeviceImpl {
    public static final int BATTERY_LEVEL_UNKNOWN = -1;
    public static final int PAIRING_VARIANT_CONSENT = 3;
    public static final int PAIRING_VARIANT_DISPLAY_PASSKEY = 4;
    public static final int PAIRING_VARIANT_DISPLAY_PIN = 5;
    public static final int PAIRING_VARIANT_OOB_CONSENT = 6;
    public static final int PAIRING_VARIANT_PASSKEY = 1;
    public static final int UNBOND_REASON_AUTH_CANCELED = 3;
    public static final int UNBOND_REASON_AUTH_FAILED = 1;
    public static final int UNBOND_REASON_AUTH_REJECTED = 2;
    public static final int UNBOND_REASON_AUTH_TIMEOUT = 6;
    public static final int UNBOND_REASON_DISCOVERY_IN_PROGRESS = 5;
    public static final int UNBOND_REASON_REMOTE_AUTH_CANCELED = 8;
    public static final int UNBOND_REASON_REMOTE_DEVICE_DOWN = 4;
    public static final int UNBOND_REASON_REMOVED = 9;
    public static final int UNBOND_REASON_REPEATED_ATTEMPTS = 7;

    public static boolean cancelBondProcess(android.bluetooth.BluetoothDevice bluetoothDevice) {
        try {
            java.lang.reflect.Method method = bluetoothDevice.getClass().getMethod("cancelBondProcess", null);
            if (method == null) {
                return false;
            }
            method.setAccessible(true);
            return ((java.lang.Boolean) method.invoke(bluetoothDevice, null)).booleanValue();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("An exception occurred while cancelBondProcess : ");
            a.append(e.getMessage());
            com.realsil.sdk.core.logger.ZLogger.w(a.toString());
            return false;
        }
    }

    public static boolean cancelPairingUserInput(android.bluetooth.BluetoothDevice bluetoothDevice) throws java.lang.Exception {
        return ((java.lang.Boolean) bluetoothDevice.getClass().getMethod("cancelPairingUserInput", new java.lang.Class[0]).invoke(bluetoothDevice, new java.lang.Object[0])).booleanValue();
    }

    public static boolean createBond(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return bluetoothDevice.createBond();
        }
        try {
            java.lang.reflect.Method method = bluetoothDevice.getClass().getMethod("createBond", null);
            if (method != null) {
                return ((java.lang.Boolean) method.invoke(bluetoothDevice, new java.lang.Object[0])).booleanValue();
            }
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("An exception occurred while creating bond: ");
            a.append(e.toString());
            com.realsil.sdk.core.logger.ZLogger.d(a.toString());
        }
        return false;
    }

    public static void dumpSupportedUuids(android.bluetooth.BluetoothDevice bluetoothDevice) {
        android.os.ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids == null || uuids.length <= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("supported features (UUIDs)");
        for (android.os.ParcelUuid parcelUuid : uuids) {
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a(org.koin.core.instance.DefinitionInstance.ERROR_SEPARATOR);
            a.append(parcelUuid.toString());
            sb.append(a.toString());
        }
        com.realsil.sdk.core.logger.ZLogger.v(sb.toString());
    }

    public static boolean isConnected(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.bluetooth.BluetoothDevice.class.getDeclaredMethod("isConnected", null);
            declaredMethod.setAccessible(true);
            return ((java.lang.Boolean) declaredMethod.invoke(bluetoothDevice, null)).booleanValue();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static java.lang.String pairingVariantToString(int i) {
        switch (i) {
            case 0:
                return "PAIRING_VARIANT_PIN";
            case 1:
                return "PAIRING_VARIANT_PASSKEY";
            case 2:
                return "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
            case 3:
                return "PAIRING_VARIANT_CONSENT";
            case 4:
                return "PAIRING_VARIANT_DISPLAY_PASSKEY";
            case 5:
                return "PAIRING_VARIANT_DISPLAY_PIN";
            case 6:
                return "PAIRING_VARIANT_OOB_CONSENT";
            default:
                return "UNKNOWN";
        }
    }

    public static java.lang.String parseDeviceType(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Unknown" : "DUAL(BR/EDR/LE)" : "LE" : "BR/EDR";
    }

    public static boolean removeBond(android.bluetooth.BluetoothDevice bluetoothDevice) {
        try {
            java.lang.reflect.Method method = bluetoothDevice.getClass().getMethod("removeBond", null);
            if (method == null) {
                return false;
            }
            method.setAccessible(true);
            return ((java.lang.Boolean) method.invoke(bluetoothDevice, null)).booleanValue();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("An exception occurred while removing bond information: ");
            a.append(e.getMessage());
            com.realsil.sdk.core.logger.ZLogger.w(a.toString());
            return false;
        }
    }

    public static boolean setPassKey(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
        try {
            return ((java.lang.Boolean) bluetoothDevice.getClass().getDeclaredMethod("setPasskey", java.lang.Integer.TYPE).invoke(bluetoothDevice, java.lang.Integer.valueOf(i))).booleanValue();
        } catch (java.lang.IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        } catch (java.lang.SecurityException e2) {
            e2.printStackTrace();
            return false;
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static boolean createBond(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
        if (bluetoothDevice == null) {
            return false;
        }
        try {
            java.lang.reflect.Method method = bluetoothDevice.getClass().getMethod("createBond", java.lang.Integer.TYPE);
            if (method != null) {
                return ((java.lang.Boolean) method.invoke(bluetoothDevice, java.lang.Integer.valueOf(i))).booleanValue();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
