package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbx extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.zzbx> CREATOR = new com.google.android.gms.location.zzby();
    private final java.util.List zza;
    private final android.app.PendingIntent zzb;
    private final java.lang.String zzc;

    zzbx(java.util.List list, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.zza = list == null ? com.google.android.gms.internal.location.zzbx.zzk() : com.google.android.gms.internal.location.zzbx.zzj(list);
        this.zzb = pendingIntent;
        this.zzc = str;
    }

    public static com.google.android.gms.location.zzbx zza(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "geofence can't be null.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!list.isEmpty(), "Geofences must contains at least one id.");
        return new com.google.android.gms.location.zzbx(list, null, "");
    }

    public static com.google.android.gms.location.zzbx zzb(android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent can not be null.");
        return new com.google.android.gms.location.zzbx(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
