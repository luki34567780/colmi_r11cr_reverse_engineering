package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class GoalsResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.GoalsResult> CREATOR = new com.google.android.gms.fitness.result.zzf();
    private final com.google.android.gms.common.api.Status zza;
    private final java.util.List zzb;

    public GoalsResult(com.google.android.gms.common.api.Status status, java.util.List list) {
        this.zza = status;
        this.zzb = list;
    }

    public java.util.List<com.google.android.gms.fitness.data.Goal> getGoals() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getGoals(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
