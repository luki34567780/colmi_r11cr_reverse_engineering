package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzs> CREATOR = new com.google.android.gms.common.zzt();
    private final java.lang.String zza;

    @javax.annotation.Nullable
    private final com.google.android.gms.common.zzi zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzs(java.lang.String str, @javax.annotation.Nullable android.os.IBinder iBinder, boolean z, boolean z2) {
        this.zza = str;
        com.google.android.gms.common.zzj zzjVar = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.IObjectWrapper zzd = com.google.android.gms.common.internal.zzy.zzg(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzd);
                if (bArr != null) {
                    zzjVar = new com.google.android.gms.common.zzj(bArr);
                } else {
                    android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (android.os.RemoteException e) {
                android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.zzb = zzjVar;
        this.zzc = z;
        this.zzd = z2;
    }

    zzs(java.lang.String str, @javax.annotation.Nullable com.google.android.gms.common.zzi zziVar, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zziVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.zzi zziVar = this.zzb;
        if (zziVar == null) {
            android.util.Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zziVar = null;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zziVar, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
