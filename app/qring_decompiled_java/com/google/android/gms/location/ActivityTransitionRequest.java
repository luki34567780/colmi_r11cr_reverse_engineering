package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class ActivityTransitionRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.ActivityTransitionRequest> CREATOR = new com.google.android.gms.location.zzr();
    public static final java.util.Comparator<com.google.android.gms.location.ActivityTransition> IS_SAME_TRANSITION = new com.google.android.gms.location.zzq();
    private final java.util.List zza;
    private final java.lang.String zzb;
    private final java.util.List zzc;
    private java.lang.String zzd;

    public ActivityTransitionRequest(java.util.List<com.google.android.gms.location.ActivityTransition> list) {
        this(list, null, null, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest = (com.google.android.gms.location.ActivityTransitionRequest) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, activityTransitionRequest.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, activityTransitionRequest.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzd, activityTransitionRequest.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zzc, activityTransitionRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        java.lang.String str = this.zzb;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.util.List list = this.zzc;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        java.lang.String str2 = this.zzd;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public void serializeToIntentExtra(android.content.Intent intent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(intent);
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    public java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String str = this.zzb;
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzc);
        java.lang.String str2 = this.zzd;
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = java.lang.String.valueOf(str).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 79 + length2 + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(str2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(valueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.location.ActivityTransitionRequest zza(java.lang.String str) {
        this.zzd = str;
        return this;
    }

    public ActivityTransitionRequest(java.util.List list, java.lang.String str, java.util.List list2, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "transitions can't be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(list.size() > 0, "transitions can't be empty.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        java.util.TreeSet treeSet = new java.util.TreeSet(IS_SAME_TRANSITION);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.location.ActivityTransition activityTransition = (com.google.android.gms.location.ActivityTransition) it.next();
            com.google.android.gms.common.internal.Preconditions.checkArgument(treeSet.add(activityTransition), java.lang.String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.zza = java.util.Collections.unmodifiableList(list);
        this.zzb = str;
        this.zzc = list2 == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(list2);
        this.zzd = str2;
    }
}
