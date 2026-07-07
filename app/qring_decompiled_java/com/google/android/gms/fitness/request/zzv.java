package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzv extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzv> CREATOR = new com.google.android.gms.fitness.request.zzw();
    private final com.google.android.gms.internal.fitness.zzcp zza;

    zzv(android.os.IBinder iBinder) {
        this.zza = com.google.android.gms.internal.fitness.zzco.zzb(iBinder);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("DisableFitRequest", new java.lang.Object[0]);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, this.zza.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzv(com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this.zza = zzcpVar;
    }
}
