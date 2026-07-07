package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class MapValue extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.MapValue> CREATOR = new com.google.android.gms.fitness.data.zzw();
    private final int zza;
    private final float zzb;

    public MapValue(int i, float f) {
        this.zza = i;
        this.zzb = f;
    }

    public static com.google.android.gms.fitness.data.MapValue zzb(float f) {
        return new com.google.android.gms.fitness.data.MapValue(2, f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.MapValue)) {
            return false;
        }
        com.google.android.gms.fitness.data.MapValue mapValue = (com.google.android.gms.fitness.data.MapValue) obj;
        int i = this.zza;
        if (i == mapValue.zza) {
            if (i != 2) {
                return this.zzb == mapValue.zzb;
            }
            if (zza() == mapValue.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zzb;
    }

    public final java.lang.String toString() {
        return this.zza != 2 ? com.google.android.gms.fitness.FitnessActivities.UNKNOWN : java.lang.Float.toString(zza());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 2, "Value is not in float format");
        return this.zzb;
    }
}
