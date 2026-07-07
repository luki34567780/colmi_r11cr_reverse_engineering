package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class GetServiceRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.GetServiceRequest> CREATOR = new com.google.android.gms.common.internal.zzm();
    final int zza;
    final int zzb;
    int zzc;
    java.lang.String zzd;
    android.os.IBinder zze;
    com.google.android.gms.common.api.Scope[] zzf;
    android.os.Bundle zzg;
    android.accounts.Account zzh;
    com.google.android.gms.common.Feature[] zzi;
    com.google.android.gms.common.Feature[] zzj;
    boolean zzk;
    int zzl;
    boolean zzm;
    private java.lang.String zzn;

    GetServiceRequest(int i, int i2, int i3, java.lang.String str, android.os.IBinder iBinder, com.google.android.gms.common.api.Scope[] scopeArr, android.os.Bundle bundle, android.accounts.Account account, com.google.android.gms.common.Feature[] featureArr, com.google.android.gms.common.Feature[] featureArr2, boolean z, int i4, boolean z2, java.lang.String str2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzd = "com.google.android.gms";
        } else {
            this.zzd = str;
        }
        if (i < 2) {
            this.zzh = iBinder != null ? com.google.android.gms.common.internal.AccountAccessor.getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.zze = iBinder;
            this.zzh = account;
        }
        this.zzf = scopeArr;
        this.zzg = bundle;
        this.zzi = featureArr;
        this.zzj = featureArr2;
        this.zzk = z;
        this.zzl = i4;
        this.zzm = z2;
        this.zzn = str2;
    }

    public android.os.Bundle getExtraArgs() {
        return this.zzg;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.zzm.zza(this, parcel, i);
    }

    public final java.lang.String zza() {
        return this.zzn;
    }

    public GetServiceRequest(int i, java.lang.String str) {
        this.zza = 6;
        this.zzc = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzb = i;
        this.zzk = true;
        this.zzn = str;
    }
}
