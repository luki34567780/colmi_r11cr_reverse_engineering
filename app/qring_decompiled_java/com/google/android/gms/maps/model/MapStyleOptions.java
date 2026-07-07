package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class MapStyleOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.MapStyleOptions> CREATOR = new com.google.android.gms.maps.model.zzh();
    private static final java.lang.String zza = "MapStyleOptions";
    private java.lang.String zzb;

    public MapStyleOptions(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "json must not be null");
        this.zzb = str;
    }

    public static com.google.android.gms.maps.model.MapStyleOptions loadRawResourceStyle(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        try {
            return new com.google.android.gms.maps.model.MapStyleOptions(new java.lang.String(com.google.android.gms.common.util.IOUtils.readInputStreamFully(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (java.io.IOException e) {
            throw new android.content.res.Resources.NotFoundException("Failed to read resource " + i + ": " + e.toString());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
