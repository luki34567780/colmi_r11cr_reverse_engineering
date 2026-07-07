package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class MapUtils {
    public static void writeStringMapToJson(java.lang.StringBuilder sb, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (java.lang.String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            java.lang.String str2 = hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
