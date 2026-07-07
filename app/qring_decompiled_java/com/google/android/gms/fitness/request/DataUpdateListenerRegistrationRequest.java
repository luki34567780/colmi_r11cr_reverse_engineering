package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataUpdateListenerRegistrationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest> CREATOR = new com.google.android.gms.fitness.request.zzr();
    private final com.google.android.gms.fitness.data.DataSource zza;
    private final com.google.android.gms.fitness.data.DataType zzb;
    private final android.app.PendingIntent zzc;
    private final com.google.android.gms.internal.fitness.zzcp zzd;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private com.google.android.gms.fitness.data.DataSource zza;
        private com.google.android.gms.fitness.data.DataType zzb;
        private android.app.PendingIntent zzc;

        public com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest build() {
            boolean z = true;
            if (this.zza == null && this.zzb == null) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "Set either dataSource or dataTYpe");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc, "pendingIntent must be set");
            return new com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest(this.zza, this.zzb, this.zzc, null);
        }

        public com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest.Builder setDataSource(com.google.android.gms.fitness.data.DataSource dataSource) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource);
            this.zza = dataSource;
            return this;
        }

        public com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest.Builder setDataType(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType);
            this.zzb = dataType;
            return this;
        }

        public com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest.Builder setPendingIntent(android.app.PendingIntent pendingIntent) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
            this.zzc = pendingIntent;
            return this;
        }
    }

    public DataUpdateListenerRegistrationRequest(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder) {
        this.zza = dataSource;
        this.zzb = dataType;
        this.zzc = pendingIntent;
        this.zzd = iBinder == null ? null : com.google.android.gms.internal.fitness.zzco.zzb(iBinder);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest)) {
            return false;
        }
        com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest = (com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, dataUpdateListenerRegistrationRequest.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, dataUpdateListenerRegistrationRequest.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, dataUpdateListenerRegistrationRequest.zzc);
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zza;
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzb;
    }

    public android.app.PendingIntent getIntent() {
        return this.zzc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataSource", this.zza).add("dataType", this.zzb).add(com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, this.zzc).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getDataType(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getIntent(), i, false);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public DataUpdateListenerRegistrationRequest(com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest, android.os.IBinder iBinder) {
        this(dataUpdateListenerRegistrationRequest.zza, dataUpdateListenerRegistrationRequest.zzb, dataUpdateListenerRegistrationRequest.zzc, iBinder);
    }
}
