package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfi implements com.google.android.gms.internal.auth.zzgc {
    private static final com.google.android.gms.internal.auth.zzfo zza = new com.google.android.gms.internal.auth.zzfg();
    private final com.google.android.gms.internal.auth.zzfo zzb;

    public zzfi() {
        com.google.android.gms.internal.auth.zzfo zzfoVar;
        com.google.android.gms.internal.auth.zzfo[] zzfoVarArr = new com.google.android.gms.internal.auth.zzfo[2];
        zzfoVarArr[0] = com.google.android.gms.internal.auth.zzen.zza();
        try {
            zzfoVar = (com.google.android.gms.internal.auth.zzfo) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzfoVar = zza;
        }
        zzfoVarArr[1] = zzfoVar;
        com.google.android.gms.internal.auth.zzfh zzfhVar = new com.google.android.gms.internal.auth.zzfh(zzfoVarArr);
        com.google.android.gms.internal.auth.zzev.zzf(zzfhVar, "messageInfoFactory");
        this.zzb = zzfhVar;
    }

    private static boolean zzb(com.google.android.gms.internal.auth.zzfn zzfnVar) {
        return zzfnVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.auth.zzgc
    public final <T> com.google.android.gms.internal.auth.zzgb<T> zza(java.lang.Class<T> cls) {
        com.google.android.gms.internal.auth.zzgd.zzg(cls);
        com.google.android.gms.internal.auth.zzfn zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? com.google.android.gms.internal.auth.zzeq.class.isAssignableFrom(cls) ? com.google.android.gms.internal.auth.zzfu.zzb(com.google.android.gms.internal.auth.zzgd.zzc(), com.google.android.gms.internal.auth.zzej.zzb(), zzb.zza()) : com.google.android.gms.internal.auth.zzfu.zzb(com.google.android.gms.internal.auth.zzgd.zza(), com.google.android.gms.internal.auth.zzej.zza(), zzb.zza()) : com.google.android.gms.internal.auth.zzeq.class.isAssignableFrom(cls) ? zzb(zzb) ? com.google.android.gms.internal.auth.zzft.zzj(cls, zzb, com.google.android.gms.internal.auth.zzfw.zzb(), com.google.android.gms.internal.auth.zzfe.zzd(), com.google.android.gms.internal.auth.zzgd.zzc(), com.google.android.gms.internal.auth.zzej.zzb(), com.google.android.gms.internal.auth.zzfm.zzb()) : com.google.android.gms.internal.auth.zzft.zzj(cls, zzb, com.google.android.gms.internal.auth.zzfw.zzb(), com.google.android.gms.internal.auth.zzfe.zzd(), com.google.android.gms.internal.auth.zzgd.zzc(), null, com.google.android.gms.internal.auth.zzfm.zzb()) : zzb(zzb) ? com.google.android.gms.internal.auth.zzft.zzj(cls, zzb, com.google.android.gms.internal.auth.zzfw.zza(), com.google.android.gms.internal.auth.zzfe.zzc(), com.google.android.gms.internal.auth.zzgd.zza(), com.google.android.gms.internal.auth.zzej.zza(), com.google.android.gms.internal.auth.zzfm.zza()) : com.google.android.gms.internal.auth.zzft.zzj(cls, zzb, com.google.android.gms.internal.auth.zzfw.zza(), com.google.android.gms.internal.auth.zzfe.zzc(), com.google.android.gms.internal.auth.zzgd.zzb(), null, com.google.android.gms.internal.auth.zzfm.zza());
    }
}
