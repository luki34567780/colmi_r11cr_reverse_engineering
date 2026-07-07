package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzez extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.fitness.zzez> CREATOR = new com.google.android.gms.internal.fitness.zzfa();
    private final com.google.android.gms.fitness.data.DataSource zza;

    public zzez(com.google.android.gms.fitness.data.DataSource dataSource) {
        this.zza = dataSource;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("ApplicationUnregistrationRequest{%s}", this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.fitness.data.DataSource zza() {
        return this.zza;
    }
}
