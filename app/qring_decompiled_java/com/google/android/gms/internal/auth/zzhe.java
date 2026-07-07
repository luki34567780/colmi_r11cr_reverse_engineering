package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public enum zzhe {
    DOUBLE(com.google.android.gms.internal.auth.zzhf.DOUBLE, 1),
    FLOAT(com.google.android.gms.internal.auth.zzhf.FLOAT, 5),
    INT64(com.google.android.gms.internal.auth.zzhf.LONG, 0),
    UINT64(com.google.android.gms.internal.auth.zzhf.LONG, 0),
    INT32(com.google.android.gms.internal.auth.zzhf.INT, 0),
    FIXED64(com.google.android.gms.internal.auth.zzhf.LONG, 1),
    FIXED32(com.google.android.gms.internal.auth.zzhf.INT, 5),
    BOOL(com.google.android.gms.internal.auth.zzhf.BOOLEAN, 0),
    STRING(com.google.android.gms.internal.auth.zzhf.STRING, 2),
    GROUP(com.google.android.gms.internal.auth.zzhf.MESSAGE, 3),
    MESSAGE(com.google.android.gms.internal.auth.zzhf.MESSAGE, 2),
    BYTES(com.google.android.gms.internal.auth.zzhf.BYTE_STRING, 2),
    UINT32(com.google.android.gms.internal.auth.zzhf.INT, 0),
    ENUM(com.google.android.gms.internal.auth.zzhf.ENUM, 0),
    SFIXED32(com.google.android.gms.internal.auth.zzhf.INT, 5),
    SFIXED64(com.google.android.gms.internal.auth.zzhf.LONG, 1),
    SINT32(com.google.android.gms.internal.auth.zzhf.INT, 0),
    SINT64(com.google.android.gms.internal.auth.zzhf.LONG, 0);

    private final com.google.android.gms.internal.auth.zzhf zzt;

    zzhe(com.google.android.gms.internal.auth.zzhf zzhfVar, int i) {
        this.zzt = zzhfVar;
    }

    public final com.google.android.gms.internal.auth.zzhf zza() {
        return this.zzt;
    }
}
