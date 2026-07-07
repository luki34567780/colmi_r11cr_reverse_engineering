package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class BleDevice extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.BleDevice> CREATOR = new com.google.android.gms.fitness.data.zzd();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.util.List zzc;
    private final java.util.List zzd;

    BleDevice(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = java.util.Collections.unmodifiableList(list);
        this.zzd = java.util.Collections.unmodifiableList(list2);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.BleDevice)) {
            return false;
        }
        com.google.android.gms.fitness.data.BleDevice bleDevice = (com.google.android.gms.fitness.data.BleDevice) obj;
        return this.zzb.equals(bleDevice.zzb) && this.zza.equals(bleDevice.zza) && new java.util.HashSet(this.zzc).equals(new java.util.HashSet(bleDevice.zzc)) && new java.util.HashSet(this.zzd).equals(new java.util.HashSet(bleDevice.zzd));
    }

    public java.lang.String getAddress() {
        return this.zza;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zzd;
    }

    public java.lang.String getName() {
        return this.zzb;
    }

    public java.util.List<java.lang.String> getSupportedProfiles() {
        return this.zzc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zza, this.zzc, this.zzd);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.zzb).add("address", this.zza).add("dataTypes", this.zzd).add("supportedProfiles", this.zzc).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getAddress(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 3, getSupportedProfiles(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
