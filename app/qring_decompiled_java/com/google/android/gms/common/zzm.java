package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzm {
    private static volatile com.google.android.gms.common.internal.zzaf zze;
    private static android.content.Context zzg;
    static final com.google.android.gms.common.zzk zza = new com.google.android.gms.common.zze(com.google.android.gms.common.zzi.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final com.google.android.gms.common.zzk zzb = new com.google.android.gms.common.zzf(com.google.android.gms.common.zzi.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final com.google.android.gms.common.zzk zzc = new com.google.android.gms.common.zzg(com.google.android.gms.common.zzi.zze("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final com.google.android.gms.common.zzk zzd = new com.google.android.gms.common.zzh(com.google.android.gms.common.zzi.zze("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final java.lang.Object zzf = new java.lang.Object();

    static com.google.android.gms.common.zzw zza(java.lang.String str, com.google.android.gms.common.zzi zziVar, boolean z, boolean z2) {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return zzf(str, zziVar, z, z2);
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    static com.google.android.gms.common.zzw zzb(java.lang.String str, boolean z, boolean z2, boolean z3) {
        com.google.android.gms.common.zzw zzd2;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzg);
            try {
                zzg();
                try {
                    com.google.android.gms.common.zzq zze2 = zze.zze(new com.google.android.gms.common.zzn(str, z, false, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzg), false));
                    if (zze2.zzb()) {
                        zzd2 = com.google.android.gms.common.zzw.zzb();
                    } else {
                        java.lang.String zza2 = zze2.zza();
                        if (zza2 == null) {
                            zza2 = "error checking package certificate";
                        }
                        zzd2 = zze2.zzc() == 4 ? com.google.android.gms.common.zzw.zzd(zza2, new android.content.pm.PackageManager.NameNotFoundException()) : com.google.android.gms.common.zzw.zzc(zza2);
                    }
                } catch (android.os.RemoteException e) {
                    android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    zzd2 = com.google.android.gms.common.zzw.zzd("module call", e);
                }
            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                java.lang.String valueOf = java.lang.String.valueOf(e2.getMessage());
                zzd2 = com.google.android.gms.common.zzw.zzd(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new java.lang.String("module init: "), e2);
            }
            return zzd2;
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static /* synthetic */ java.lang.String zzc(boolean z, java.lang.String str, com.google.android.gms.common.zzi zziVar) throws java.lang.Exception {
        java.lang.String str2 = true != (!z && zzf(str, zziVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        java.security.MessageDigest zza2 = com.google.android.gms.common.util.AndroidUtilsLight.zza("SHA-1");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zza2);
        return java.lang.String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.Hex.bytesToStringLowercase(zza2.digest(zziVar.zzf())), java.lang.Boolean.valueOf(z), "12451000.false");
    }

    static synchronized void zzd(android.content.Context context) {
        synchronized (com.google.android.gms.common.zzm.class) {
            if (zzg != null) {
                android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                zzg = context.getApplicationContext();
            }
        }
    }

    static boolean zze() {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                zzg();
                return zze.zzg();
            } finally {
                android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        }
    }

    private static com.google.android.gms.common.zzw zzf(final java.lang.String str, final com.google.android.gms.common.zzi zziVar, final boolean z, boolean z2) {
        try {
            zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzg);
            try {
                return zze.zzf(new com.google.android.gms.common.zzs(str, zziVar, z, z2), com.google.android.gms.dynamic.ObjectWrapper.wrap(zzg.getPackageManager())) ? com.google.android.gms.common.zzw.zzb() : new com.google.android.gms.common.zzv(new java.util.concurrent.Callable() { // from class: com.google.android.gms.common.zzd
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return com.google.android.gms.common.zzm.zzc(z, str, zziVar);
                    }
                }, null);
            } catch (android.os.RemoteException e) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return com.google.android.gms.common.zzw.zzd("module call", e);
            }
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            java.lang.String valueOf = java.lang.String.valueOf(e2.getMessage());
            return com.google.android.gms.common.zzw.zzd(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new java.lang.String("module init: "), e2);
        }
    }

    private static void zzg() throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        if (zze != null) {
            return;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzg);
        synchronized (zzf) {
            if (zze == null) {
                zze = com.google.android.gms.common.internal.zzae.zzb(com.google.android.gms.dynamite.DynamiteModule.load(zzg, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
