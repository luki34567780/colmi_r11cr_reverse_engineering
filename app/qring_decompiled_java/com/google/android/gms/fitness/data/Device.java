package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class Device extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Device> CREATOR = new com.google.android.gms.fitness.data.zzn();
    public static final int TYPE_CHEST_STRAP = 4;
    public static final int TYPE_HEAD_MOUNTED = 6;
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_SCALE = 5;
    public static final int TYPE_TABLET = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 3;
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final int zze;

    public Device(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this(str, str2, str3, i, 0);
    }

    public static com.google.android.gms.fitness.data.Device getLocalDevice(android.content.Context context) {
        int zza = com.google.android.gms.fitness.data.zzo.zza(context);
        return new com.google.android.gms.fitness.data.Device(android.os.Build.MANUFACTURER, android.os.Build.MODEL, com.google.android.gms.fitness.data.zzo.zzb(context), zza, 2);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Device)) {
            return false;
        }
        com.google.android.gms.fitness.data.Device device = (com.google.android.gms.fitness.data.Device) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, device.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, device.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, device.zzc) && this.zzd == device.zzd && this.zze == device.zze;
    }

    public java.lang.String getManufacturer() {
        return this.zza;
    }

    public java.lang.String getModel() {
        return this.zzb;
    }

    public int getType() {
        return this.zzd;
    }

    public java.lang.String getUid() {
        return this.zzc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, java.lang.Integer.valueOf(this.zzd));
    }

    public java.lang.String toString() {
        return java.lang.String.format("Device{%s:%s:%s}", zza(), java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zze));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getManufacturer(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getModel(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getUid(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, getType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    final java.lang.String zza() {
        return java.lang.String.format("%s:%s:%s", this.zza, this.zzb, this.zzc);
    }

    public Device(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2) {
        this.zza = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
        if (str3 == null) {
            throw new java.lang.IllegalStateException("Device UID is null.");
        }
        this.zzc = str3;
        this.zzd = i;
        this.zze = i2;
    }
}
