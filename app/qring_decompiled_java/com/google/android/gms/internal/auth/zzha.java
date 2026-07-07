package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzha {
    static /* synthetic */ void zzc(byte b, byte b2, byte b3, char[] cArr, int i) throws com.google.android.gms.internal.auth.zzew {
        if (!zze(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!zze(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw com.google.android.gms.internal.auth.zzew.zzb();
    }

    static /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    private static boolean zze(byte b) {
        return b > -65;
    }

    static /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws com.google.android.gms.internal.auth.zzew {
        if (zze(b2) || (((b << com.oudmon.ble.base.communication.Constants.CMD_GET_MUSIC_SWITCH) + (b2 + 112)) >> 30) != 0 || zze(b3) || zze(b4)) {
            throw com.google.android.gms.internal.auth.zzew.zzb();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    static /* synthetic */ void zzb(byte b, byte b2, char[] cArr, int i) throws com.google.android.gms.internal.auth.zzew {
        if (b < -62 || zze(b2)) {
            throw com.google.android.gms.internal.auth.zzew.zzb();
        }
        cArr[i] = (char) (((b & com.oudmon.ble.base.communication.Constants.CMD_DISPLAY_TIME) << 6) | (b2 & 63));
    }
}
