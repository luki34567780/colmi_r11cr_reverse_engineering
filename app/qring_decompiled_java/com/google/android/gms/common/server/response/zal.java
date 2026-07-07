package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zal> CREATOR = new com.google.android.gms.common.server.response.zap();
    final int zaa;
    final java.lang.String zab;
    final java.util.ArrayList<com.google.android.gms.common.server.response.zam> zac;

    zal(int i, java.lang.String str, java.util.ArrayList<com.google.android.gms.common.server.response.zam> arrayList) {
        this.zaa = i;
        this.zab = str;
        this.zac = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zac, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zal(java.lang.String str, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map) {
        java.util.ArrayList<com.google.android.gms.common.server.response.zam> arrayList;
        this.zaa = 1;
        this.zab = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList<>();
            for (java.lang.String str2 : map.keySet()) {
                arrayList.add(new com.google.android.gms.common.server.response.zam(str2, map.get(str2)));
            }
        }
        this.zac = arrayList;
    }
}
