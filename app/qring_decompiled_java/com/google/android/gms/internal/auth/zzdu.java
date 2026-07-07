package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdu implements java.util.Comparator<com.google.android.gms.internal.auth.zzeb> {
    zzdu() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(com.google.android.gms.internal.auth.zzeb zzebVar, com.google.android.gms.internal.auth.zzeb zzebVar2) {
        com.google.android.gms.internal.auth.zzeb zzebVar3 = zzebVar;
        com.google.android.gms.internal.auth.zzeb zzebVar4 = zzebVar2;
        com.google.android.gms.internal.auth.zzds zzdsVar = new com.google.android.gms.internal.auth.zzds(zzebVar3);
        com.google.android.gms.internal.auth.zzds zzdsVar2 = new com.google.android.gms.internal.auth.zzds(zzebVar4);
        while (zzdsVar.hasNext() && zzdsVar2.hasNext()) {
            int zza = com.google.android.gms.internal.auth.zzdt.zza(zzdsVar.zza() & 255, zzdsVar2.zza() & 255);
            if (zza != 0) {
                return zza;
            }
        }
        return com.google.android.gms.internal.auth.zzdt.zza(zzebVar3.zzd(), zzebVar4.zzd());
    }
}
