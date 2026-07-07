package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class DataTypeCreateRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataTypeCreateRequest> CREATOR = new com.google.android.gms.fitness.request.zzo();
    private final java.lang.String zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.fitness.zzbt zzc;

    public DataTypeCreateRequest(com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest, com.google.android.gms.internal.fitness.zzbt zzbtVar) {
        this(dataTypeCreateRequest.zza, dataTypeCreateRequest.zzb, zzbtVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.request.DataTypeCreateRequest)) {
            return false;
        }
        com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest = (com.google.android.gms.fitness.request.DataTypeCreateRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, dataTypeCreateRequest.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, dataTypeCreateRequest.zzb);
    }

    public java.util.List<com.google.android.gms.fitness.data.Field> getFields() {
        return this.zzb;
    }

    public java.lang.String getName() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.zza).add("fields", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getFields(), false);
        com.google.android.gms.internal.fitness.zzbt zzbtVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzbtVar == null ? null : zzbtVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private java.lang.String zza;
        private final java.util.List zzb = new java.util.ArrayList();

        public com.google.android.gms.fitness.request.DataTypeCreateRequest.Builder addField(com.google.android.gms.fitness.data.Field field) {
            if (!this.zzb.contains(field)) {
                this.zzb.add(field);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataTypeCreateRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zza != null, "Must set the name");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb.isEmpty(), "Must specify the data fields");
            return new com.google.android.gms.fitness.request.DataTypeCreateRequest(this.zza, this.zzb, (com.google.android.gms.internal.fitness.zzbt) null);
        }

        public com.google.android.gms.fitness.request.DataTypeCreateRequest.Builder setName(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.google.android.gms.fitness.request.DataTypeCreateRequest.Builder addField(java.lang.String str, int i) {
            boolean z = false;
            if (str != null && !str.isEmpty()) {
                z = true;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Invalid name specified");
            return addField(new com.google.android.gms.fitness.data.Field(str, i, null));
        }
    }

    DataTypeCreateRequest(java.lang.String str, java.util.List list, android.os.IBinder iBinder) {
        this.zza = str;
        this.zzb = java.util.Collections.unmodifiableList(list);
        this.zzc = iBinder == null ? null : com.google.android.gms.internal.fitness.zzbs.zzb(iBinder);
    }

    public DataTypeCreateRequest(java.lang.String str, java.util.List list, com.google.android.gms.internal.fitness.zzbt zzbtVar) {
        this.zza = str;
        this.zzb = java.util.Collections.unmodifiableList(list);
        this.zzc = zzbtVar;
    }
}
