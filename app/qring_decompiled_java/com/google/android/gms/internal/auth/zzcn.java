package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzcn implements com.google.android.gms.internal.auth.zzck {
    private static com.google.android.gms.internal.auth.zzcn zza;

    @javax.annotation.Nullable
    private final android.content.Context zzb;

    @javax.annotation.Nullable
    private final android.database.ContentObserver zzc;

    private zzcn() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzcn(android.content.Context context) {
        this.zzb = context;
        com.google.android.gms.internal.auth.zzcm zzcmVar = new com.google.android.gms.internal.auth.zzcm(this, null);
        this.zzc = zzcmVar;
        context.getContentResolver().registerContentObserver(com.google.android.gms.internal.auth.zzcb.zza, true, zzcmVar);
    }

    static com.google.android.gms.internal.auth.zzcn zza(android.content.Context context) {
        com.google.android.gms.internal.auth.zzcn zzcnVar;
        synchronized (com.google.android.gms.internal.auth.zzcn.class) {
            if (zza == null) {
                zza = androidx.core.content.PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new com.google.android.gms.internal.auth.zzcn(context) : new com.google.android.gms.internal.auth.zzcn();
            }
            zzcnVar = zza;
        }
        return zzcnVar;
    }

    static synchronized void zze() {
        android.content.Context context;
        synchronized (com.google.android.gms.internal.auth.zzcn.class) {
            com.google.android.gms.internal.auth.zzcn zzcnVar = zza;
            if (zzcnVar != null && (context = zzcnVar.zzb) != null && zzcnVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzck
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zzb(final java.lang.String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (java.lang.String) com.google.android.gms.internal.auth.zzci.zza(new com.google.android.gms.internal.auth.zzcj() { // from class: com.google.android.gms.internal.auth.zzcl
                @Override // com.google.android.gms.internal.auth.zzcj
                public final java.lang.Object zza() {
                    return com.google.android.gms.internal.auth.zzcn.this.zzd(str);
                }
            });
        } catch (java.lang.IllegalStateException | java.lang.SecurityException e) {
            java.lang.String valueOf = java.lang.String.valueOf(str);
            android.util.Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new java.lang.String("Unable to read GServices for: "), e);
            return null;
        }
    }

    public final /* synthetic */ java.lang.String zzd(java.lang.String str) {
        return com.google.android.gms.internal.auth.zzcb.zza(this.zzb.getContentResolver(), str, null);
    }
}
