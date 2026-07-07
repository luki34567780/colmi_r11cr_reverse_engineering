package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class ListSubscriptionsResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.ListSubscriptionsResult> CREATOR = new com.google.android.gms.fitness.result.zzg();
    private final java.util.List zza;
    private final com.google.android.gms.common.api.Status zzb;

    public ListSubscriptionsResult(java.util.List list, com.google.android.gms.common.api.Status status) {
        this.zza = list;
        this.zzb = status;
    }

    public static com.google.android.gms.fitness.result.ListSubscriptionsResult zza(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.ListSubscriptionsResult(java.util.Collections.emptyList(), status);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.result.ListSubscriptionsResult)) {
            return false;
        }
        com.google.android.gms.fitness.result.ListSubscriptionsResult listSubscriptionsResult = (com.google.android.gms.fitness.result.ListSubscriptionsResult) obj;
        return this.zzb.equals(listSubscriptionsResult.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zza, listSubscriptionsResult.zza);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzb;
    }

    public java.util.List<com.google.android.gms.fitness.data.Subscription> getSubscriptions() {
        return this.zza;
    }

    public java.util.List<com.google.android.gms.fitness.data.Subscription> getSubscriptions(com.google.android.gms.fitness.data.DataType dataType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.fitness.data.Subscription subscription : this.zza) {
            if (dataType.equals(subscription.zza())) {
                arrayList.add(subscription);
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zza);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzb).add("subscriptions", this.zza).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getSubscriptions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
