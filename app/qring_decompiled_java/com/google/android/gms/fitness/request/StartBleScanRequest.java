package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class StartBleScanRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.StartBleScanRequest> CREATOR = new com.google.android.gms.fitness.request.zzba();
    private final java.util.List zza;
    private final com.google.android.gms.fitness.request.zzab zzb;
    private final int zzc;
    private final com.google.android.gms.internal.fitness.zzcp zzd;
    private final com.google.android.gms.fitness.request.BleScanCallback zze;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private com.google.android.gms.fitness.request.BleScanCallback zzb;
        private com.google.android.gms.fitness.data.DataType[] zza = new com.google.android.gms.fitness.data.DataType[0];
        private int zzc = 10;

        public com.google.android.gms.fitness.request.StartBleScanRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzb != null, "Must set BleScanCallback");
            return new com.google.android.gms.fitness.request.StartBleScanRequest(com.google.android.gms.common.util.ArrayUtils.toArrayList(this.zza), this.zzb, this.zzc, (com.google.android.gms.fitness.request.zzaz) null);
        }

        public com.google.android.gms.fitness.request.StartBleScanRequest.Builder setBleScanCallback(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
            this.zzb = bleScanCallback;
            return this;
        }

        public com.google.android.gms.fitness.request.StartBleScanRequest.Builder setDataTypes(com.google.android.gms.fitness.data.DataType... dataTypeArr) {
            this.zza = dataTypeArr;
            return this;
        }

        public com.google.android.gms.fitness.request.StartBleScanRequest.Builder setTimeoutSecs(int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Stop time must be greater than zero");
            com.google.android.gms.common.internal.Preconditions.checkArgument(i <= 60, "Stop time must be less than 1 minute");
            this.zzc = i;
            return this;
        }
    }

    StartBleScanRequest(java.util.List list, android.os.IBinder iBinder, int i, android.os.IBinder iBinder2) {
        com.google.android.gms.fitness.request.zzab zzzVar;
        this.zza = list;
        if (iBinder == null) {
            zzzVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            zzzVar = queryLocalInterface instanceof com.google.android.gms.fitness.request.zzab ? (com.google.android.gms.fitness.request.zzab) queryLocalInterface : new com.google.android.gms.fitness.request.zzz(iBinder);
        }
        this.zzb = zzzVar;
        this.zzc = i;
        this.zzd = iBinder2 == null ? null : com.google.android.gms.internal.fitness.zzco.zzb(iBinder2);
        this.zze = null;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return java.util.Collections.unmodifiableList(this.zza);
    }

    public int getTimeoutSecs() {
        return this.zzc;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataTypes", this.zza).add("timeoutSecs", java.lang.Integer.valueOf(this.zzc)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getDataTypes(), false);
        com.google.android.gms.fitness.request.zzab zzabVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzabVar == null ? null : zzabVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getTimeoutSecs());
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzcpVar != null ? zzcpVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.fitness.request.BleScanCallback zza() {
        return this.zze;
    }

    /* synthetic */ StartBleScanRequest(java.util.List list, com.google.android.gms.fitness.request.BleScanCallback bleScanCallback, int i, com.google.android.gms.fitness.request.zzaz zzazVar) {
        this.zza = list;
        this.zzb = null;
        this.zzc = i;
        this.zzd = null;
        this.zze = bleScanCallback;
    }

    public StartBleScanRequest(java.util.List list, com.google.android.gms.fitness.request.zzab zzabVar, int i, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this.zza = list;
        this.zzb = zzabVar;
        this.zzc = i;
        this.zzd = zzcpVar;
        this.zze = null;
    }
}
