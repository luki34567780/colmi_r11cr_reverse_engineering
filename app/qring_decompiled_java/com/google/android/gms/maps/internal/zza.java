package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zza {
    public static byte zza(java.lang.Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static java.lang.Boolean zzb(byte b) {
        if (b == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return java.lang.Boolean.TRUE;
    }
}
