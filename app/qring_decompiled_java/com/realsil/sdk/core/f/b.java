package com.realsil.sdk.core.f;

/* loaded from: classes3.dex */
public final class b {
    public static java.lang.String a(android.bluetooth.le.ScanRecord scanRecord) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("scanRecord{");
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21) {
            java.util.Locale locale = java.util.Locale.US;
            sb.append(java.lang.String.format(locale, "\n\tmAdvertiseFlags=0x%04X", java.lang.Integer.valueOf(scanRecord.getAdvertiseFlags())));
            sb.append(java.lang.String.format(locale, "\n\tmManufacturerSpecificData=%s", a(scanRecord.getManufacturerSpecificData())));
            sb.append(java.lang.String.format(locale, "\n\tserviceData=%s", a(scanRecord.getServiceData())));
            sb.append(java.lang.String.format(locale, "\n\tserviceUuids=%s", a(scanRecord.getServiceUuids())));
            sb.append(java.lang.String.format(locale, "\n\tmDeviceName=%s", scanRecord.getDeviceName()));
        }
        if (i >= 29) {
            sb.append(java.lang.String.format(java.util.Locale.US, "\n\tserviceSolicitationUuids=%s", a(scanRecord.getServiceSolicitationUuids())));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public static java.lang.String a(java.util.List<android.os.ParcelUuid> list) {
        if (list == null || list.size() <= 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("supported features (UUIDs)");
        for (android.os.ParcelUuid parcelUuid : list) {
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a(org.koin.core.instance.DefinitionInstance.ERROR_SEPARATOR);
            a.append(parcelUuid.toString());
            sb.append(a.toString());
        }
        return sb.toString();
    }

    public static java.lang.String a(android.util.SparseArray<byte[]> sparseArray) {
        if (sparseArray == null) {
            return "null";
        }
        if (sparseArray.size() == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('{');
        for (int i = 0; i < sparseArray.size(); i++) {
            byte[] valueAt = sparseArray.valueAt(i);
            int length = valueAt != null ? valueAt.length : 0;
            sb.append(sparseArray.keyAt(i));
            sb.append("=(");
            sb.append(length);
            sb.append(")");
            sb.append(com.realsil.sdk.core.utility.DataConverter.bytes2HexWithSeparate(valueAt));
        }
        sb.append('}');
        return sb.toString();
    }

    public static <T> java.lang.String a(java.util.Map<T, byte[]> map) {
        if (map == null) {
            return "null";
        }
        if (map.isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('{');
        java.util.Iterator<java.util.Map.Entry<T, byte[]>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            T key = it.next().getKey();
            byte[] bArr = map.get(key);
            int length = bArr != null ? bArr.length : 0;
            sb.append(key);
            sb.append("=(");
            sb.append(length);
            sb.append(")");
            sb.append(com.realsil.sdk.core.utility.DataConverter.bytes2HexWithSeparate(bArr));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
