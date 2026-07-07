package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbc {
    public static int zza(int i) {
        boolean z;
        if (i != 0 && i != 1) {
            if (i != 2) {
                z = false;
                com.google.android.gms.common.internal.Preconditions.checkArgument(z, "granularity %d must be a Granularity.GRANULARITY_* constants", java.lang.Integer.valueOf(i));
                return i;
            }
            i = 2;
        }
        z = true;
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "granularity %d must be a Granularity.GRANULARITY_* constants", java.lang.Integer.valueOf(i));
        return i;
    }

    public static java.lang.String zzb(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        throw new java.lang.IllegalArgumentException();
    }
}
