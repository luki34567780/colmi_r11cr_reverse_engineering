package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzbh> CREATOR = new com.google.android.gms.internal.location.zzbi();
    private final int zza;
    private final com.google.android.gms.internal.location.zzbf zzb;
    private final com.google.android.gms.location.zzbl zzc;
    private final com.google.android.gms.location.zzbi zzd;
    private final android.app.PendingIntent zze;
    private final com.google.android.gms.internal.location.zzai zzf;
    private final java.lang.String zzg;

    zzbh(int i, com.google.android.gms.internal.location.zzbf zzbfVar, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder3, java.lang.String str) {
        this.zza = i;
        this.zzb = zzbfVar;
        com.google.android.gms.internal.location.zzai zzaiVar = null;
        this.zzc = iBinder != null ? com.google.android.gms.location.zzbk.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? com.google.android.gms.location.zzbh.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            android.os.IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaiVar = queryLocalInterface instanceof com.google.android.gms.internal.location.zzai ? (com.google.android.gms.internal.location.zzai) queryLocalInterface : new com.google.android.gms.internal.location.zzag(iBinder3);
        }
        this.zzf = zzaiVar;
        this.zzg = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.os.IBinder, com.google.android.gms.location.zzbi] */
    public static com.google.android.gms.internal.location.zzbh zza(com.google.android.gms.location.zzbi zzbiVar, com.google.android.gms.internal.location.zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new com.google.android.gms.internal.location.zzbh(2, null, null, zzbiVar, null, zzaiVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.os.IBinder, com.google.android.gms.location.zzbl] */
    public static com.google.android.gms.internal.location.zzbh zzb(com.google.android.gms.location.zzbl zzblVar, com.google.android.gms.internal.location.zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new com.google.android.gms.internal.location.zzbh(2, null, zzblVar, null, null, zzaiVar, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.location.zzbl zzblVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzblVar == null ? null : zzblVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zze, i, false);
        com.google.android.gms.location.zzbi zzbiVar = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, zzbiVar == null ? null : zzbiVar.asBinder(), false);
        com.google.android.gms.internal.location.zzai zzaiVar = this.zzf;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
