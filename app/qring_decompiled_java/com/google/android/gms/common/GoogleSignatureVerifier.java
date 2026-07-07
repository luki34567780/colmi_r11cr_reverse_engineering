package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class GoogleSignatureVerifier {

    @javax.annotation.Nullable
    private static com.google.android.gms.common.GoogleSignatureVerifier zza;
    private final android.content.Context zzb;
    private volatile java.lang.String zzc;

    public GoogleSignatureVerifier(android.content.Context context) {
        this.zzb = context.getApplicationContext();
    }

    public static com.google.android.gms.common.GoogleSignatureVerifier getInstance(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        synchronized (com.google.android.gms.common.GoogleSignatureVerifier.class) {
            if (zza == null) {
                com.google.android.gms.common.zzm.zzd(context);
                zza = new com.google.android.gms.common.GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    @javax.annotation.Nullable
    static final com.google.android.gms.common.zzi zza(android.content.pm.PackageInfo packageInfo, com.google.android.gms.common.zzi... zziVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        com.google.android.gms.common.zzj zzjVar = new com.google.android.gms.common.zzj(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zziVarArr.length; i++) {
            if (zziVarArr[i].equals(zzjVar)) {
                return zziVarArr[i];
            }
        }
        return null;
    }

    public static final boolean zzb(android.content.pm.PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? zza(packageInfo, com.google.android.gms.common.zzl.zza) : zza(packageInfo, com.google.android.gms.common.zzl.zza[0])) != null) {
                return true;
            }
        }
        return false;
    }

    private final com.google.android.gms.common.zzw zzc(java.lang.String str, boolean z, boolean z2) {
        com.google.android.gms.common.zzw zzc;
        if (str == null) {
            return com.google.android.gms.common.zzw.zzc("null pkg");
        }
        if (str.equals(this.zzc)) {
            return com.google.android.gms.common.zzw.zzb();
        }
        if (com.google.android.gms.common.zzm.zze()) {
            zzc = com.google.android.gms.common.zzm.zzb(str, com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb), false, false);
        } else {
            try {
                android.content.pm.PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str, 64);
                boolean honorsDebugCertificates = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                if (packageInfo == null) {
                    zzc = com.google.android.gms.common.zzw.zzc("null pkg");
                } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                    zzc = com.google.android.gms.common.zzw.zzc("single cert required");
                } else {
                    com.google.android.gms.common.zzj zzjVar = new com.google.android.gms.common.zzj(packageInfo.signatures[0].toByteArray());
                    java.lang.String str2 = packageInfo.packageName;
                    com.google.android.gms.common.zzw zza2 = com.google.android.gms.common.zzm.zza(str2, zzjVar, honorsDebugCertificates, false);
                    zzc = (!zza2.zza || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !com.google.android.gms.common.zzm.zza(str2, zzjVar, false, true).zza) ? zza2 : com.google.android.gms.common.zzw.zzc("debuggable release cert app rejected");
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                return com.google.android.gms.common.zzw.zzd(str.length() != 0 ? "no pkg ".concat(str) : new java.lang.String("no pkg "), e);
            }
        }
        if (zzc.zza) {
            this.zzc = str;
        }
        return zzc;
    }

    public boolean isGooglePublicSignedPackage(android.content.pm.PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            android.util.Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean isPackageGoogleSigned(java.lang.String str) {
        com.google.android.gms.common.zzw zzc = zzc(str, false, false);
        zzc.zze();
        return zzc.zza;
    }

    public boolean isUidGoogleSigned(int i) {
        com.google.android.gms.common.zzw zzc;
        int length;
        java.lang.String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc);
                    break;
                }
                zzc = zzc(packagesForUid[i2], false, false);
                if (zzc.zza) {
                    break;
                }
                i2++;
            }
        } else {
            zzc = com.google.android.gms.common.zzw.zzc("no pkgs");
        }
        zzc.zze();
        return zzc.zza;
    }
}
