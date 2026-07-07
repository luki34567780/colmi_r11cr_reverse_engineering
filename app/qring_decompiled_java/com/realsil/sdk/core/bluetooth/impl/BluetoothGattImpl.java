package com.realsil.sdk.core.bluetooth.impl;

/* loaded from: classes3.dex */
public class BluetoothGattImpl {
    public static java.util.HashMap<java.lang.Integer, java.lang.String> a;
    public static java.util.HashMap<java.lang.Integer, java.lang.String> b;
    public static java.util.HashMap<java.lang.Integer, java.lang.String> c;

    static {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = new java.util.HashMap<>();
        a = hashMap;
        hashMap.put(0, "UNKNOW");
        a.put(1, "READ");
        a.put(2, "READ_ENCRYPTED");
        a.put(4, "READ_ENCRYPTED_MITM");
        a.put(16, "WRITE");
        a.put(32, "WRITE_ENCRYPTED");
        a.put(64, "WRITE_ENCRYPTED_MITM");
        a.put(128, "WRITE_SIGNED");
        a.put(256, "WRITE_SIGNED_MITM");
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap2 = new java.util.HashMap<>();
        b = hashMap2;
        hashMap2.put(1, "BROADCAST");
        b.put(128, "EXTENDED_PROPS");
        b.put(32, "INDICATE");
        b.put(16, "NOTIFY");
        b.put(2, "READ");
        b.put(64, "SIGNED_WRITE");
        b.put(8, "WRITE");
        b.put(4, "WRITE_NO_RESPONSE");
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap3 = new java.util.HashMap<>();
        c = hashMap3;
        hashMap3.put(0, "UNKNOW");
        c.put(1, "READ");
        c.put(2, "READ_ENCRYPTED");
        c.put(4, "READ_ENCRYPTED_MITM");
        c.put(16, "WRITE");
        c.put(32, "WRITE_ENCRYPTED");
        c.put(64, "WRITE_ENCRYPTED_MITM");
        c.put(128, "WRITE_SIGNED");
        c.put(256, "WRITE_SIGNED_MITM");
    }

    public static java.lang.String a(java.util.HashMap<java.lang.Integer, java.lang.String> hashMap, int i) {
        java.lang.String str = hashMap.get(java.lang.Integer.valueOf(i));
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < 32; i2++) {
            int i3 = 1 << i2;
            if ((i & i3) > 0) {
                arrayList.add(java.lang.Integer.valueOf(i3));
            }
        }
        java.lang.String str2 = "";
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a(str2);
            a2.append(hashMap.get(arrayList.get(i4)));
            a2.append(com.king.zxing.util.LogUtils.VERTICAL);
            str2 = a2.toString();
        }
        return str2;
    }

    public static java.lang.String getCharPermission(int i) {
        return a(a, i);
    }

    public static java.lang.String getCharPropertie(int i) {
        return a(b, i);
    }

    public static java.lang.String getDescPermission(int i) {
        return a(c, i);
    }

    public static java.util.List<java.lang.String> parseProperty(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i & 1) == 1) {
            arrayList.add("BROADCAST");
        }
        if ((i & 2) == 2) {
            arrayList.add("READ");
        }
        if ((i & 4) == 4) {
            arrayList.add("WRITE_NO_RESPONSE");
        }
        if ((i & 8) == 8) {
            arrayList.add("WRITE");
        }
        if ((i & 16) == 16) {
            arrayList.add("NOTIFY");
        }
        if ((i & 32) == 32) {
            arrayList.add("INDICATE");
        }
        return arrayList;
    }

    public static java.lang.String parseProperty2(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.List<java.lang.String> parseProperty = parseProperty(i);
        if (parseProperty.size() > 0) {
            for (java.lang.String str : parseProperty) {
                if (sb.length() > 0) {
                    sb.append(com.king.zxing.util.LogUtils.VERTICAL);
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static boolean refresh(android.bluetooth.BluetoothGatt bluetoothGatt) {
        try {
            return ((java.lang.Boolean) bluetoothGatt.getClass().getMethod("refresh", new java.lang.Class[0]).invoke(bluetoothGatt, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("refreshing device failed: ");
            a2.append(e.toString());
            com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
            return false;
        }
    }

    public static boolean refreshDeviceCache(android.bluetooth.BluetoothGatt bluetoothGatt, boolean z) {
        if (z || bluetoothGatt.getDevice().getBondState() == 10) {
            return refresh(bluetoothGatt);
        }
        return false;
    }

    public boolean requestLeConnectionUpdate(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            java.lang.Class<?> cls = bluetoothGatt.getClass();
            java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
            java.lang.reflect.Method method = cls.getMethod("requestLeConnectionUpdate", cls2, cls2, cls2, cls2, cls2, cls2);
            com.realsil.sdk.core.logger.ZLogger.d("requestLeConnectionUpdate() - min=(" + i + ")" + (i * 1.25d) + "msec, max=(" + i2 + ")" + (i2 * 1.25d) + "msec, latency=" + i3 + ", timeout=" + i4 + "msec, min_ce=" + i5 + ", max_ce=" + i6);
            return ((java.lang.Boolean) method.invoke(bluetoothGatt, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i4))).booleanValue();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("refreshing device failed: ");
            a2.append(e.toString());
            com.realsil.sdk.core.logger.ZLogger.w(a2.toString());
            return false;
        }
    }
}
