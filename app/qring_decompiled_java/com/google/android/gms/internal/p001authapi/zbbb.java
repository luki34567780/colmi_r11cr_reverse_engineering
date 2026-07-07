package com.google.android.gms.internal.p001authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes2.dex */
public final class zbbb {
    private static final java.util.Random zba = new java.util.Random();

    public static java.lang.String zba() {
        byte[] bArr = new byte[16];
        zba.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 11);
    }
}
