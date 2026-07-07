package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzn {
    private static final android.net.Uri zza = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final android.content.ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    public zzn(android.content.ComponentName componentName, int i) {
        this.zzb = null;
        this.zzc = null;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(componentName);
        this.zzd = componentName;
        this.zze = i;
        this.zzf = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.internal.zzn)) {
            return false;
        }
        com.google.android.gms.common.internal.zzn zznVar = (com.google.android.gms.common.internal.zzn) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzb, zznVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zznVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zznVar.zzd) && this.zze == zznVar.zze && this.zzf == zznVar.zzf;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zzc, this.zzd, java.lang.Integer.valueOf(this.zze), java.lang.Boolean.valueOf(this.zzf));
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzb;
        if (str != null) {
            return str;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd);
        return this.zzd.flattenToString();
    }

    public final int zza() {
        return this.zze;
    }

    public final android.content.ComponentName zzb() {
        return this.zzd;
    }

    public final android.content.Intent zzc(android.content.Context context) {
        android.os.Bundle bundle;
        if (this.zzb == null) {
            return new android.content.Intent().setComponent(this.zzd);
        }
        if (this.zzf) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("serviceActionBundleKey", this.zzb);
            try {
                bundle = context.getContentResolver().call(zza, "serviceIntentCall", (java.lang.String) null, bundle2);
            } catch (java.lang.IllegalArgumentException e) {
                android.util.Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (android.content.Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
                android.util.Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new java.lang.String("Dynamic lookup for intent failed for action: "));
            }
        }
        return r2 != null ? r2 : new android.content.Intent(this.zzb).setPackage(this.zzc);
    }

    public final java.lang.String zzd() {
        return this.zzc;
    }

    public zzn(java.lang.String str, int i, boolean z) {
        this(str, "com.google.android.gms", i, false);
    }

    public zzn(java.lang.String str, java.lang.String str2, int i, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        this.zzc = str2;
        this.zzd = null;
        this.zze = i;
        this.zzf = z;
    }
}
