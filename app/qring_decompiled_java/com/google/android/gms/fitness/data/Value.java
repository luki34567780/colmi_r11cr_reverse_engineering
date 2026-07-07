package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class Value extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Value> CREATOR = new com.google.android.gms.fitness.data.zzak();
    private final int zza;
    private boolean zzb;
    private float zzc;
    private java.lang.String zzd;
    private java.util.Map zze;
    private int[] zzf;
    private float[] zzg;
    private byte[] zzh;

    Value(int i, boolean z, float f, java.lang.String str, android.os.Bundle bundle, int[] iArr, float[] fArr, byte[] bArr) {
        java.util.Map arrayMap;
        this.zza = i;
        this.zzb = z;
        this.zzc = f;
        this.zzd = str;
        if (bundle == null) {
            arrayMap = null;
        } else {
            bundle.setClassLoader((java.lang.ClassLoader) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.fitness.data.MapValue.class.getClassLoader()));
            arrayMap = new androidx.collection.ArrayMap(bundle.size());
            for (java.lang.String str2 : bundle.keySet()) {
                arrayMap.put(str2, (com.google.android.gms.fitness.data.MapValue) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.fitness.data.MapValue) bundle.getParcelable(str2)));
            }
        }
        this.zze = arrayMap;
        this.zzf = iArr;
        this.zzg = fArr;
        this.zzh = bArr;
    }

    public java.lang.String asActivity() {
        return com.google.android.gms.internal.fitness.zzfv.zzb(asInt());
    }

    public float asFloat() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 2, "Value is not in float format");
        return this.zzc;
    }

    public int asInt() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 1, "Value is not in int format");
        return java.lang.Float.floatToRawIntBits(this.zzc);
    }

    public java.lang.String asString() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 3, "Value is not in string format");
        java.lang.String str = this.zzd;
        return str == null ? "" : str;
    }

    @java.lang.Deprecated
    public void clearKey(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        java.util.Map map = this.zze;
        if (map != null) {
            map.remove(str);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Value)) {
            return false;
        }
        com.google.android.gms.fitness.data.Value value = (com.google.android.gms.fitness.data.Value) obj;
        int i = this.zza;
        if (i == value.zza && this.zzb == value.zzb) {
            if (i != 1) {
                return i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? this.zzc == value.zzc : java.util.Arrays.equals(this.zzh, value.zzh) : java.util.Arrays.equals(this.zzg, value.zzg) : java.util.Arrays.equals(this.zzf, value.zzf) : com.google.android.gms.common.internal.Objects.equal(this.zze, value.zze) : com.google.android.gms.common.internal.Objects.equal(this.zzd, value.zzd);
            }
            if (asInt() == value.asInt()) {
                return true;
            }
        }
        return false;
    }

    public int getFormat() {
        return this.zza;
    }

    public java.lang.Float getKeyValue(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 4, "Value is not in float map format");
        java.util.Map map = this.zze;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return java.lang.Float.valueOf(((com.google.android.gms.fitness.data.MapValue) this.zze.get(str)).zza());
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Float.valueOf(this.zzc), this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }

    public boolean isSet() {
        return this.zzb;
    }

    @java.lang.Deprecated
    public void setActivity(java.lang.String str) {
        setInt(com.google.android.gms.internal.fitness.zzfv.zza(str));
    }

    @java.lang.Deprecated
    public void setFloat(float f) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 2, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        this.zzb = true;
        this.zzc = f;
    }

    @java.lang.Deprecated
    public void setInt(int i) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 1, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        this.zzb = true;
        this.zzc = java.lang.Float.intBitsToFloat(i);
    }

    @java.lang.Deprecated
    public void setKeyValue(java.lang.String str, float f) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.zzb = true;
        if (this.zze == null) {
            this.zze = new java.util.HashMap();
        }
        this.zze.put(str, com.google.android.gms.fitness.data.MapValue.zzb(f));
    }

    @java.lang.Deprecated
    public void setString(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 3, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
        this.zzb = true;
        this.zzd = str;
    }

    public java.lang.String toString() {
        if (!this.zzb) {
            return "unset";
        }
        switch (this.zza) {
            case 3:
                java.lang.String str = this.zzd;
                if (str == null) {
                }
                break;
            case 4:
                java.util.Map map = this.zze;
                if (map != null) {
                    break;
                }
                break;
            case 7:
                byte[] bArr = this.zzh;
                if (bArr != null && (r0 = com.google.android.gms.common.util.HexDumpUtils.dump(bArr, 0, bArr.length, false)) != null) {
                }
                break;
        }
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.Bundle bundle;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getFormat());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, isSet());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        java.util.Map map = this.zze;
        if (map == null) {
            bundle = null;
        } else {
            android.os.Bundle bundle2 = new android.os.Bundle(map.size());
            for (java.util.Map.Entry entry : this.zze.entrySet()) {
                bundle2.putParcelable((java.lang.String) entry.getKey(), (android.os.Parcelable) entry.getValue());
            }
            bundle = bundle2;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 5, bundle, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(parcel, 6, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(parcel, 7, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 8, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @java.lang.Deprecated
    public final void zza(java.util.Map map) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 4, "Attempting to set a float map value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.zzb = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            hashMap.put((java.lang.String) entry.getKey(), com.google.android.gms.fitness.data.MapValue.zzb(((java.lang.Float) entry.getValue()).floatValue()));
        }
        this.zze = hashMap;
    }
}
