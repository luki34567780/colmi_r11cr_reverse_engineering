package com.google.android.gms.common.server.converter;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class StringToIntConverter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<java.lang.String, java.lang.Integer> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.StringToIntConverter> CREATOR = new com.google.android.gms.common.server.converter.zad();
    final int zaa;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> zab;
    private final android.util.SparseArray<java.lang.String> zac;

    public StringToIntConverter() {
        this.zaa = 1;
        this.zab = new java.util.HashMap<>();
        this.zac = new android.util.SparseArray<>();
    }

    public com.google.android.gms.common.server.converter.StringToIntConverter add(java.lang.String str, int i) {
        this.zab.put(str, java.lang.Integer.valueOf(i));
        this.zac.put(i, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.zab.keySet()) {
            arrayList.add(new com.google.android.gms.common.server.converter.zac(str, this.zab.get(str).intValue()));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zab() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* bridge */ /* synthetic */ java.lang.Integer zac(java.lang.String str) {
        java.lang.Integer num = this.zab.get(str);
        return num == null ? this.zab.get("gms_unknown") : num;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* bridge */ /* synthetic */ java.lang.String zad(java.lang.Integer num) {
        java.lang.String str = this.zac.get(num.intValue());
        return (str == null && this.zab.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    StringToIntConverter(int i, java.util.ArrayList<com.google.android.gms.common.server.converter.zac> arrayList) {
        this.zaa = i;
        this.zab = new java.util.HashMap<>();
        this.zac = new android.util.SparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.common.server.converter.zac zacVar = arrayList.get(i2);
            add(zacVar.zab, zacVar.zac);
        }
    }
}
