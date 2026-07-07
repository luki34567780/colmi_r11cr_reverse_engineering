package com.realsil.sdk.core.bluetooth.utils;

/* loaded from: classes3.dex */
public final class BluetoothHelper {
    public static final int BD_ADDR_LEN = 6;
    public static final int BD_UUID_LEN = 16;

    public static java.lang.String convertMac(byte[] bArr) {
        java.lang.String str;
        java.lang.String sb;
        java.lang.String sb2;
        java.lang.String sb3;
        java.lang.String sb4;
        if (bArr == null || bArr.length < 6) {
            return null;
        }
        if ((bArr[5] & 255) <= 15) {
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("0");
            a.append(java.lang.Integer.toHexString(bArr[5] & 255).toUpperCase());
            a.append(":");
            str = a.toString();
        } else {
            str = java.lang.Integer.toHexString(bArr[5] & 255).toUpperCase() + ":";
        }
        if ((bArr[4] & 255) <= 15) {
            sb = str + "0" + java.lang.Integer.toHexString(bArr[4] & 255).toUpperCase() + ":";
        } else {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a(str);
            a2.append(java.lang.Integer.toHexString(bArr[4] & 255).toUpperCase());
            a2.append(":");
            sb = a2.toString();
        }
        if ((bArr[3] & 255) <= 15) {
            sb2 = sb + "0" + java.lang.Integer.toHexString(bArr[3] & 255).toUpperCase() + ":";
        } else {
            java.lang.StringBuilder a3 = com.realsil.sdk.core.a.a.a(sb);
            a3.append(java.lang.Integer.toHexString(bArr[3] & 255).toUpperCase());
            a3.append(":");
            sb2 = a3.toString();
        }
        if ((bArr[2] & 255) <= 15) {
            sb3 = sb2 + "0" + java.lang.Integer.toHexString(bArr[2] & 255).toUpperCase() + ":";
        } else {
            java.lang.StringBuilder a4 = com.realsil.sdk.core.a.a.a(sb2);
            a4.append(java.lang.Integer.toHexString(bArr[2] & 255).toUpperCase());
            a4.append(":");
            sb3 = a4.toString();
        }
        if ((bArr[1] & 255) <= 15) {
            sb4 = sb3 + "0" + java.lang.Integer.toHexString(bArr[1] & 255).toUpperCase() + ":";
        } else {
            java.lang.StringBuilder a5 = com.realsil.sdk.core.a.a.a(sb3);
            a5.append(java.lang.Integer.toHexString(bArr[1] & 255).toUpperCase());
            a5.append(":");
            sb4 = a5.toString();
        }
        if ((bArr[0] & 255) > 15) {
            java.lang.StringBuilder a6 = com.realsil.sdk.core.a.a.a(sb4);
            a6.append(java.lang.Integer.toHexString(bArr[0] & 255).toUpperCase());
            return a6.toString();
        }
        return sb4 + "0" + java.lang.Integer.toHexString(bArr[0] & 255).toUpperCase();
    }

    public static java.lang.String dumpBluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.String.format("BluetoothDevice{ %s/%s", formatAddress(bluetoothDevice.getAddress(), true), bluetoothDevice.getName()));
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "\n\tbondState=%d, type=0x%02X", java.lang.Integer.valueOf(bluetoothDevice.getBondState()), java.lang.Integer.valueOf(bluetoothDevice.getType())));
        android.bluetooth.BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass != null) {
            sb.append(java.lang.String.format(locale, ", majorDeviceClass=0x%04X", java.lang.Integer.valueOf(bluetoothClass.getMajorDeviceClass())));
            sb.append(java.lang.String.format(locale, ", deviceClass=0x%04X", java.lang.Integer.valueOf(bluetoothClass.getDeviceClass())));
        }
        android.os.ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids != null && uuids.length > 0) {
            sb.append("\n\tsupportedFeaturesUuids");
            for (android.os.ParcelUuid parcelUuid : uuids) {
                sb.append(java.lang.String.format("\n\t\t%s", parcelUuid.toString()));
            }
        }
        sb.append("\n}");
        return sb.toString();
    }

    public static java.lang.String dumpBluetoothGattService(android.bluetooth.BluetoothGatt bluetoothGatt) {
        return dumpBluetoothGattService(bluetoothGatt.getServices());
    }

    public static void enableBle() {
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            defaultAdapter.enable();
        }
    }

    public static java.lang.String formatAddress(java.lang.String str, boolean z) {
        if (!z) {
            return str;
        }
        if (str == null || str.length() != 17) {
            return "";
        }
        byte[] convertAddress = convertAddress(str);
        return convertAddress.length < 6 ? "" : java.lang.String.format("%02X:%02X:**:**:**:%02X", java.lang.Byte.valueOf(convertAddress[5]), java.lang.Byte.valueOf(convertAddress[4]), java.lang.Byte.valueOf(convertAddress[0]));
    }

    public static java.lang.String formatAddressNegatitive(byte[] bArr) {
        return formatAddress(bArr, true, true);
    }

    public static java.lang.String formatAddressPositive(byte[] bArr) {
        return formatAddress(bArr, false, false);
    }

    public static java.lang.String getBluetoothAddress(android.content.Context context, android.bluetooth.BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter != null) {
            java.lang.Class<?> cls = bluetoothAdapter.getClass();
            try {
                java.lang.Class<?> cls2 = java.lang.Class.forName("android.bluetooth.IBluetooth");
                java.lang.reflect.Field declaredField = cls.getDeclaredField("mService");
                declaredField.setAccessible(true);
                java.lang.reflect.Method method = cls2.getMethod("getAddress", new java.lang.Class[0]);
                method.setAccessible(true);
                return (java.lang.String) method.invoke(declaredField.get(bluetoothAdapter), new java.lang.Object[0]);
            } catch (java.lang.Exception e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            }
        } else if (context != null) {
            return android.provider.Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
        }
        return null;
    }

    public static java.util.List<android.bluetooth.BluetoothDevice> getBondedBluetoothDevices() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            for (android.bluetooth.BluetoothDevice bluetoothDevice : android.bluetooth.BluetoothAdapter.getDefaultAdapter().getBondedDevices()) {
                if (com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.isConnected(bluetoothDevice)) {
                    com.realsil.sdk.core.logger.ZLogger.v("connected: " + formatAddress(bluetoothDevice.getAddress(), true));
                    arrayList.add(bluetoothDevice);
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static java.lang.String getCharPermission(int i) {
        return com.realsil.sdk.core.bluetooth.impl.BluetoothGattImpl.getCharPermission(i);
    }

    public static java.lang.String getCharPropertie(int i) {
        return com.realsil.sdk.core.bluetooth.impl.BluetoothGattImpl.getCharPropertie(i);
    }

    public static java.util.List<android.bluetooth.BluetoothDevice> getConnectedBluetoothDevices() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        try {
            java.lang.reflect.Method declaredMethod = android.bluetooth.BluetoothAdapter.class.getDeclaredMethod("getConnectionState", null);
            declaredMethod.setAccessible(true);
            if (((java.lang.Integer) declaredMethod.invoke(defaultAdapter, null)).intValue() == 2) {
                for (android.bluetooth.BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                    if (com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.isConnected(bluetoothDevice)) {
                        com.realsil.sdk.core.logger.ZLogger.v("connected: " + formatAddress(bluetoothDevice.getAddress(), true));
                        arrayList.add(bluetoothDevice);
                    }
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static java.lang.String getDescPermission(int i) {
        return com.realsil.sdk.core.bluetooth.impl.BluetoothGattImpl.getDescPermission(i);
    }

    public static boolean isBleEnabled() {
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean isBleSupported(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static java.lang.String parseDeviceType(int i) {
        return com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.parseDeviceType(i);
    }

    public static java.lang.String parseProfile(int i) {
        if (i == 16) {
            return "HEADSET_CLIENT";
        }
        if (i == 17) {
            return "PBAP_CLIENT";
        }
        switch (i) {
            case 1:
                return "HEADSET";
            case 2:
                return "A2DP";
            case 3:
                return "HEALTH";
            case 4:
                return "HID_HOST";
            case 5:
                return "PAN";
            case 6:
                return "PBAP";
            case 7:
                return "GATT";
            case 8:
                return "GATT_SERVER";
            case 9:
                return "MAP";
            case 10:
                return "SAP";
            case 11:
                return "A2DP_SINK";
            case 12:
                return "AVRCP_CONTROLLER";
            default:
                return "Unknown";
        }
    }

    public static java.lang.String parseProfileState(int i) {
        if (i == 0) {
            return "0-BluetoothProfile.STATE_DISCONNECTED";
        }
        if (i == 1) {
            return "1-BluetoothProfile.STATE_CONNECTING";
        }
        if (i == 2) {
            return "2-BluetoothProfile.STATE_CONNECTED";
        }
        if (i == 3) {
            return "3-BluetoothProfile.STATE_DISCONNECTING";
        }
        return "UNKNOWN (" + i + ")";
    }

    public static java.util.List<java.lang.String> parseProperty(int i) {
        return com.realsil.sdk.core.bluetooth.impl.BluetoothGattImpl.parseProperty(i);
    }

    public static java.lang.String parseProperty2(int i) {
        return com.realsil.sdk.core.bluetooth.impl.BluetoothGattImpl.parseProperty2(i);
    }

    public static java.lang.String dumpBluetoothGattService(java.util.List<android.bluetooth.BluetoothGattService> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (android.bluetooth.BluetoothGattService bluetoothGattService : list) {
            sb.append(java.lang.String.format(java.util.Locale.US, "service: type=%d, %d/%s\n", java.lang.Integer.valueOf(bluetoothGattService.getType()), java.lang.Integer.valueOf(bluetoothGattService.getInstanceId()), bluetoothGattService.getUuid().toString()));
            for (android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                sb.append(java.lang.String.format(java.util.Locale.US, "\tcharacteristic: %d/%s\n", java.lang.Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid().toString()));
            }
        }
        return sb.toString();
    }

    public static byte[] convertAddress(java.lang.String str) {
        byte[] bArr = new byte[6];
        if (str != null) {
            bArr[0] = (byte) (java.lang.Character.digit(str.charAt(16), 16) + (java.lang.Character.digit(str.charAt(15), 16) * 16));
            bArr[1] = (byte) (java.lang.Character.digit(str.charAt(13), 16) + (java.lang.Character.digit(str.charAt(12), 16) * 16));
            bArr[2] = (byte) (java.lang.Character.digit(str.charAt(10), 16) + (java.lang.Character.digit(str.charAt(9), 16) * 16));
            bArr[3] = (byte) (java.lang.Character.digit(str.charAt(7), 16) + (java.lang.Character.digit(str.charAt(6), 16) * 16));
            bArr[4] = (byte) (java.lang.Character.digit(str.charAt(4), 16) + (java.lang.Character.digit(str.charAt(3), 16) * 16));
            bArr[5] = (byte) (java.lang.Character.digit(str.charAt(1), 16) + (java.lang.Character.digit(str.charAt(0), 16) * 16));
        } else {
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            bArr[3] = 0;
            bArr[4] = 0;
            bArr[5] = 0;
        }
        return bArr;
    }

    public static java.lang.String formatAddress(byte[] bArr, boolean z) {
        return formatAddress(bArr, false, z);
    }

    public static java.lang.String formatAddress(byte[] bArr, boolean z, boolean z2) {
        return (bArr == null || bArr.length < 6) ? "" : z ? z2 ? java.lang.String.format("%02X:%02X:**:**:**:%02X", java.lang.Byte.valueOf(bArr[5]), java.lang.Byte.valueOf(bArr[4]), java.lang.Byte.valueOf(bArr[0])) : java.lang.String.format("%02X:%02X:%02X:%02X:%02X:%02X", java.lang.Byte.valueOf(bArr[5]), java.lang.Byte.valueOf(bArr[4]), java.lang.Byte.valueOf(bArr[3]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[0])) : z2 ? java.lang.String.format("%02X:%02X:**:**:**:%02X", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[5])) : java.lang.String.format("%02X:%02X:%02X:%02X:%02X:%02X", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3]), java.lang.Byte.valueOf(bArr[4]), java.lang.Byte.valueOf(bArr[5]));
    }

    public static java.util.List<android.bluetooth.BluetoothDevice> getConnectedBluetoothDevices(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        try {
            if (defaultAdapter.getProfileConnectionState(i) == 2) {
                for (android.bluetooth.BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                    if (com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.isConnected(bluetoothDevice)) {
                        com.realsil.sdk.core.logger.ZLogger.v("connected: " + formatAddress(bluetoothDevice.getAddress(), true));
                        arrayList.add(bluetoothDevice);
                    }
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
