package com.realsil.sdk.core.bluetooth.impl;

/* loaded from: classes3.dex */
public class BluetoothProfileImpl {
    public static final int A2DP_SINK = 11;
    public static final int AVRCP = 13;
    public static final int AVRCP_CONTROLLER = 12;
    public static final java.lang.String CLASS_NAME_BLUETOOTH_A2DP = "android.bluetooth.BluetoothA2dp";
    public static final int HEADSET_CLIENT = 16;
    public static final int HEARING_AID = 21;
    public static final int HID_DEVICE = 19;
    public static final int HID_HOST = 4;
    public static final int MAP = 9;
    public static final int MAP_CLIENT = 18;
    public static final int OPP = 20;
    public static final int PAN = 5;
    public static final int PBAP = 6;
    public static final int PBAP_CLIENT = 17;
    public static int PRIORITY_AUTO_CONNECT = 1000;

    public static boolean connectProfile(android.bluetooth.BluetoothProfile bluetoothProfile, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothProfile != null && bluetoothDevice != null) {
            try {
                com.realsil.sdk.core.logger.ZLogger.v("connectProfile :" + com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
                java.lang.reflect.Method method = bluetoothProfile.getClass().getMethod("connect", android.bluetooth.BluetoothDevice.class);
                method.setAccessible(true);
                return ((java.lang.Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
            } catch (java.lang.IllegalAccessException e) {
                java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("Could not execute method 'connect' in profile ");
                a.append(bluetoothProfile.getClass().getName());
                a.append(", ignoring request.");
                a.append(e.toString());
                com.realsil.sdk.core.logger.ZLogger.w(a.toString());
                return false;
            } catch (java.lang.NoSuchMethodException unused) {
                java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("No connect method in the ");
                a2.append(bluetoothProfile.getClass().getName());
                a2.append(" class, ignoring request.");
                com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
            } catch (java.lang.reflect.InvocationTargetException e2) {
                java.lang.StringBuilder a3 = com.realsil.sdk.core.a.a.a("Could not execute method 'connect' in profile ");
                a3.append(bluetoothProfile.getClass().getName());
                a3.append(", ignoring request.");
                a3.append(e2.toString());
                com.realsil.sdk.core.logger.ZLogger.w(a3.toString());
                return false;
            }
        }
        return false;
    }

    public static java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(android.bluetooth.BluetoothProfile bluetoothProfile, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (bluetoothProfile == null) {
            return arrayList;
        }
        try {
            java.lang.reflect.Method method = bluetoothProfile.getClass().asSubclass(java.lang.Class.forName(str)).getMethod("getConnectedDevices", null);
            method.setAccessible(true);
            return (java.util.List) method.invoke(bluetoothProfile, null);
        } catch (java.lang.ClassNotFoundException e) {
            com.realsil.sdk.core.logger.ZLogger.w("Could not find clas: " + str + ", ignoring request." + e.toString());
            return arrayList;
        } catch (java.lang.IllegalAccessException e2) {
            e = e2;
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("Could not execute method 'connect' in profile CLASS_NAME, ignoring request.");
            a.append(e.toString());
            com.realsil.sdk.core.logger.ZLogger.w(a.toString());
            return arrayList;
        } catch (java.lang.NoSuchMethodException unused) {
            com.realsil.sdk.core.logger.ZLogger.w("No connect method in the CLASS_NAME class, ignoring request.");
            return arrayList;
        } catch (java.lang.reflect.InvocationTargetException e3) {
            e = e3;
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("Could not execute method 'connect' in profile CLASS_NAME, ignoring request.");
            a2.append(e.toString());
            com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
            return arrayList;
        }
    }

    public static int getConnectionState(android.bluetooth.BluetoothProfile bluetoothProfile, java.lang.String str, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothProfile != null && bluetoothDevice != null) {
            try {
                java.lang.reflect.Method method = bluetoothProfile.getClass().asSubclass(java.lang.Class.forName(str)).getMethod("getConnectionState", android.bluetooth.BluetoothDevice.class);
                method.setAccessible(true);
                return ((java.lang.Integer) method.invoke(bluetoothProfile, bluetoothDevice)).intValue();
            } catch (java.lang.ClassNotFoundException e) {
                com.realsil.sdk.core.logger.ZLogger.w("Could not find clas: " + str + ", ignoring request." + e.toString());
                return 0;
            } catch (java.lang.IllegalAccessException e2) {
                e = e2;
                java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("Could not execute method 'connect' in profile CLASS_NAME, ignoring request.");
                a.append(e.toString());
                com.realsil.sdk.core.logger.ZLogger.w(a.toString());
                return 0;
            } catch (java.lang.NoSuchMethodException unused) {
                com.realsil.sdk.core.logger.ZLogger.w("No connect method in the CLASS_NAME class, ignoring request.");
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e = e3;
                java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("Could not execute method 'connect' in profile CLASS_NAME, ignoring request.");
                a2.append(e.toString());
                com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
                return 0;
            }
        }
        return 0;
    }

    public static java.lang.String getProfileName(int i) {
        switch (i) {
            case 1:
                return "HEADSET";
            case 2:
                return "A2DP";
            case 3:
            case 14:
            case 15:
            default:
                return "UNKNOWN_PROFILE";
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
            case 13:
                return "AVRCP";
            case 16:
                return "HEADSET_CLIENT";
            case 17:
                return "PBAP_CLIENT";
            case 18:
                return "MAP_CLIENT";
            case 19:
                return "HID_DEVICE";
            case 20:
                return "OPP";
            case 21:
                return "HEARING_AID";
        }
    }

    public static boolean isConnectMethodSupported(android.bluetooth.BluetoothProfile bluetoothProfile, java.lang.String str) {
        if (bluetoothProfile == null) {
            return false;
        }
        try {
            int i = android.os.Build.VERSION.SDK_INT;
            java.lang.Class<? extends U> asSubclass = bluetoothProfile.getClass().asSubclass(java.lang.Class.forName(str));
            if (asSubclass != 0) {
                return asSubclass.getMethod("connect", android.bluetooth.BluetoothDevice.class) != null;
            }
            com.realsil.sdk.core.logger.ZLogger.w("no class found: " + str);
            return false;
        } catch (java.lang.ClassNotFoundException e) {
            com.realsil.sdk.core.logger.ZLogger.w("Could not find clas: " + str + ", ignoring request." + e.toString());
            return false;
        } catch (java.lang.NoSuchMethodException unused) {
            com.realsil.sdk.core.logger.ZLogger.w("No connect method in the " + str + " class, ignoring request.");
            return false;
        }
    }

    public static boolean isDisConnectMethodSupported(android.bluetooth.BluetoothProfile bluetoothProfile, java.lang.String str) {
        if (bluetoothProfile == null) {
            return false;
        }
        try {
            int i = android.os.Build.VERSION.SDK_INT;
            java.lang.Class<? extends U> asSubclass = bluetoothProfile.getClass().asSubclass(java.lang.Class.forName(str));
            if (asSubclass != 0) {
                return asSubclass.getMethod("disconnect", android.bluetooth.BluetoothDevice.class) != null;
            }
            com.realsil.sdk.core.logger.ZLogger.w("no class found: " + str);
            return false;
        } catch (java.lang.ClassNotFoundException e) {
            com.realsil.sdk.core.logger.ZLogger.w("Could not find clas: " + str + ", ignoring request." + e.toString());
            return false;
        } catch (java.lang.NoSuchMethodException unused) {
            com.realsil.sdk.core.logger.ZLogger.w("No disconnect method in the " + str + " class, ignoring request.");
            return false;
        }
    }

    public static boolean setPriority(android.bluetooth.BluetoothProfile bluetoothProfile, android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
        if (bluetoothProfile == null) {
            return false;
        }
        try {
            bluetoothProfile.getClass().getMethod("setPriority", android.bluetooth.BluetoothDevice.class, java.lang.Integer.TYPE).invoke(bluetoothProfile, bluetoothDevice, java.lang.Integer.valueOf(i));
            return true;
        } catch (java.lang.Exception e) {
            com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            return false;
        }
    }

    public static boolean disconnect(android.bluetooth.BluetoothProfile bluetoothProfile, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothProfile != null && bluetoothDevice != null) {
            java.lang.String str = "";
            try {
                str = bluetoothProfile.getClass().getName();
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("disconnect : %s : %s", str, com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true)));
                java.lang.reflect.Method method = bluetoothProfile.getClass().getMethod("disconnect", android.bluetooth.BluetoothDevice.class);
                method.setAccessible(true);
                return ((java.lang.Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
            } catch (java.lang.IllegalAccessException e) {
                e = e;
                com.realsil.sdk.core.logger.ZLogger.w("Could not execute method 'disconnect' in profile " + str + ", ignoring request." + e.toString());
                return false;
            } catch (java.lang.NoSuchMethodException unused) {
                com.realsil.sdk.core.logger.ZLogger.w("No disconnect method in the " + str + " class, ignoring request.");
            } catch (java.lang.reflect.InvocationTargetException e2) {
                e = e2;
                com.realsil.sdk.core.logger.ZLogger.w("Could not execute method 'disconnect' in profile " + str + ", ignoring request." + e.toString());
                return false;
            }
        }
        return false;
    }

    public static boolean disconnect(android.bluetooth.BluetoothProfile bluetoothProfile, java.lang.String str, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothProfile != null && bluetoothDevice != null) {
            try {
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("disconnect : %s : %s", str, com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true)));
                java.lang.reflect.Method method = bluetoothProfile.getClass().asSubclass(java.lang.Class.forName(str)).getMethod("disconnect", android.bluetooth.BluetoothDevice.class);
                method.setAccessible(true);
                return ((java.lang.Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
            } catch (java.lang.ClassNotFoundException e) {
                com.realsil.sdk.core.logger.ZLogger.w("Could not find clas: " + str + ", ignoring request." + e.toString());
            } catch (java.lang.IllegalAccessException e2) {
                com.realsil.sdk.core.logger.ZLogger.w("Could not execute method 'disconnect' in profile " + str + ", ignoring request." + e2.toString());
            } catch (java.lang.NoSuchMethodException unused) {
                com.realsil.sdk.core.logger.ZLogger.w("No disconnect method in the " + str + " class, ignoring request.");
            } catch (java.lang.reflect.InvocationTargetException e3) {
                com.realsil.sdk.core.logger.ZLogger.w("Could not execute method 'disconnect' in profile " + str + ", ignoring request." + e3.toString());
            }
        }
        return false;
    }

    public static boolean connectProfile(android.bluetooth.BluetoothProfile bluetoothProfile, java.lang.String str, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothProfile != null && bluetoothDevice != null) {
            try {
                int i = android.os.Build.VERSION.SDK_INT;
                com.realsil.sdk.core.logger.ZLogger.v("connectProfile :" + com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
                java.lang.Class<? extends U> asSubclass = bluetoothProfile.getClass().asSubclass(java.lang.Class.forName(str));
                if (asSubclass == 0) {
                    com.realsil.sdk.core.logger.ZLogger.w("no class found: " + str);
                    return false;
                }
                java.lang.reflect.Method method = asSubclass.getMethod("connect", android.bluetooth.BluetoothDevice.class);
                method.setAccessible(true);
                return ((java.lang.Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
            } catch (java.lang.ClassNotFoundException e) {
                com.realsil.sdk.core.logger.ZLogger.w("Could not find clas: " + str + ", ignoring request." + e.toString());
            } catch (java.lang.IllegalAccessException e2) {
                com.realsil.sdk.core.logger.ZLogger.w("Could not execute method 'connect' in profile " + str + ", ignoring request." + e2.toString());
            } catch (java.lang.NoSuchMethodException unused) {
                com.realsil.sdk.core.logger.ZLogger.w("No connect method in the " + str + " class, ignoring request.");
            } catch (java.lang.reflect.InvocationTargetException e3) {
                com.realsil.sdk.core.logger.ZLogger.w("Could not execute method 'connect' in profile " + str + ", ignoring request." + e3.toString());
            }
        }
        return false;
    }
}
