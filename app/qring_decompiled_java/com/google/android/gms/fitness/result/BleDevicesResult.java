package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class BleDevicesResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.BleDevicesResult> CREATOR = new com.google.android.gms.fitness.result.zza();
    private final java.util.List zza;
    private final com.google.android.gms.common.api.Status zzb;

    public BleDevicesResult(java.util.List list, com.google.android.gms.common.api.Status status) {
        this.zza = java.util.Collections.unmodifiableList(list);
        this.zzb = status;
    }

    public static com.google.android.gms.fitness.result.BleDevicesResult zza(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.BleDevicesResult(java.util.Collections.emptyList(), status);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.result.BleDevicesResult)) {
            return false;
        }
        com.google.android.gms.fitness.result.BleDevicesResult bleDevicesResult = (com.google.android.gms.fitness.result.BleDevicesResult) obj;
        return this.zzb.equals(bleDevicesResult.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zza, bleDevicesResult.zza);
    }

    public java.util.List<com.google.android.gms.fitness.data.BleDevice> getClaimedBleDevices() {
        return this.zza;
    }

    public java.util.List<com.google.android.gms.fitness.data.BleDevice> getClaimedBleDevices(com.google.android.gms.fitness.data.DataType dataType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.fitness.data.BleDevice bleDevice : this.zza) {
            if (bleDevice.getDataTypes().contains(dataType)) {
                arrayList.add(bleDevice);
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zza);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzb).add("bleDevices", this.zza).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getClaimedBleDevices(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
