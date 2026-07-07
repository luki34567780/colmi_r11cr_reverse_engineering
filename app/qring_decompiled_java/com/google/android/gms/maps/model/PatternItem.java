package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class PatternItem extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PatternItem> CREATOR = new com.google.android.gms.maps.model.zzj();
    private static final java.lang.String zza = "PatternItem";
    private final int zzb;
    private final java.lang.Float zzc;

    public PatternItem(int i, java.lang.Float f) {
        boolean z = false;
        if (i == 1 || (f != null && f.floatValue() >= 0.0f)) {
            z = true;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.zzb = i;
        this.zzc = f;
    }

    static java.util.List zza(java.util.List list) {
        com.google.android.gms.maps.model.PatternItem dash;
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.maps.model.PatternItem patternItem = (com.google.android.gms.maps.model.PatternItem) it.next();
            if (patternItem == null) {
                patternItem = null;
            } else {
                int i = patternItem.zzb;
                if (i == 0) {
                    com.google.android.gms.common.internal.Preconditions.checkState(patternItem.zzc != null, "length must not be null.");
                    dash = new com.google.android.gms.maps.model.Dash(patternItem.zzc.floatValue());
                } else if (i == 1) {
                    patternItem = new com.google.android.gms.maps.model.Dot();
                } else if (i != 2) {
                    android.util.Log.w(zza, "Unknown PatternItem type: " + i);
                } else {
                    com.google.android.gms.common.internal.Preconditions.checkState(patternItem.zzc != null, "length must not be null.");
                    dash = new com.google.android.gms.maps.model.Gap(patternItem.zzc.floatValue());
                }
                patternItem = dash;
            }
            arrayList.add(patternItem);
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.PatternItem)) {
            return false;
        }
        com.google.android.gms.maps.model.PatternItem patternItem = (com.google.android.gms.maps.model.PatternItem) obj;
        return this.zzb == patternItem.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzb), this.zzc);
    }

    public java.lang.String toString() {
        return "[PatternItem: type=" + this.zzb + " length=" + this.zzc + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
