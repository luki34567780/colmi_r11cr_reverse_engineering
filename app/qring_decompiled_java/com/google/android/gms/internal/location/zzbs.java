package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbs {
    public static java.lang.String zza(@javax.annotation.CheckForNull java.lang.String str, @javax.annotation.CheckForNull java.lang.Object... objArr) {
        int length;
        int length2;
        int indexOf;
        java.lang.String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            java.lang.Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (java.lang.Exception e) {
                    java.lang.String name = obj.getClass().getName();
                    java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 1 + java.lang.String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    java.lang.String sb3 = sb2.toString();
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", sb3.length() != 0 ? "Exception during lenientFormat for ".concat(sb3) : new java.lang.String("Exception during lenientFormat for "), (java.lang.Throwable) e);
                    java.lang.String name2 = e.getClass().getName();
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(sb3.length() + 9 + java.lang.String.valueOf(name2).length());
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb5.append((java.lang.CharSequence) str, i3, indexOf);
            sb5.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb5.append((java.lang.CharSequence) str, i3, str.length());
        if (i < length2) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb5.append(", ");
                sb5.append(objArr[i4]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
