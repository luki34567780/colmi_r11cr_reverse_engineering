package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzae extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzae> CREATOR = new com.google.android.gms.fitness.request.zzaf();
    private final com.google.android.gms.fitness.data.DataType zza;
    private final com.google.android.gms.internal.fitness.zzcg zzb;

    zzae(com.google.android.gms.fitness.data.DataType dataType, android.os.IBinder iBinder) {
        this.zza = dataType;
        this.zzb = iBinder == null ? null : com.google.android.gms.internal.fitness.zzcf.zzb(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.internal.fitness.zzcg zzcgVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcgVar == null ? null : zzcgVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzae(com.google.android.gms.fitness.data.DataType dataType, com.google.android.gms.internal.fitness.zzcg zzcgVar) {
        this.zza = dataType;
        this.zzb = zzcgVar;
    }
}
