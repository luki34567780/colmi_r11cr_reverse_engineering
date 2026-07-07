package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzbf> CREATOR = new com.google.android.gms.fitness.request.zzbg();
    private final java.lang.String zza;
    private final com.google.android.gms.internal.fitness.zzcp zzb;

    zzbf(java.lang.String str, android.os.IBinder iBinder) {
        this.zza = str;
        this.zzb = iBinder == null ? null : com.google.android.gms.internal.fitness.zzco.zzb(iBinder);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("UnclaimBleDeviceRequest{%s}", this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzbf(java.lang.String str, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this.zza = str;
        this.zzb = zzcpVar;
    }
}
