package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zan extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zan> CREATOR = new com.google.android.gms.common.server.response.zao();
    final int zaa;
    private final java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>>> zab;
    private final java.lang.String zac;

    zan(int i, java.util.ArrayList<com.google.android.gms.common.server.response.zal> arrayList, java.lang.String str) {
        this.zaa = i;
        java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>>> hashMap = new java.util.HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.common.server.response.zal zalVar = arrayList.get(i2);
            java.lang.String str2 = zalVar.zab;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            int size2 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(zalVar.zac)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                com.google.android.gms.common.server.response.zam zamVar = zalVar.zac.get(i3);
                hashMap2.put(zamVar.zab, zamVar.zac);
            }
            hashMap.put(str2, hashMap2);
        }
        this.zab = hashMap;
        this.zac = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zad();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : this.zab.keySet()) {
            sb.append(str);
            sb.append(":\n");
            java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map = this.zab.get(str);
            for (java.lang.String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.zab.keySet()) {
            arrayList.add(new com.google.android.gms.common.server.response.zal(str, this.zab.get(str)));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zac, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zaa() {
        return this.zac;
    }

    public final java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zab(java.lang.String str) {
        return this.zab.get(str);
    }

    public final void zac() {
        for (java.lang.String str : this.zab.keySet()) {
            java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map = this.zab.get(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str2 : map.keySet()) {
                hashMap.put(str2, map.get(str2).zab());
            }
            this.zab.put(str, hashMap);
        }
    }

    public final void zad() {
        java.util.Iterator<java.lang.String> it = this.zab.keySet().iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map = this.zab.get(it.next());
            java.util.Iterator<java.lang.String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).zai(this);
            }
        }
    }

    public final void zae(java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map) {
        this.zab.put((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    public final boolean zaf(java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls) {
        return this.zab.containsKey(com.google.android.gms.common.internal.Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public zan(java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls) {
        this.zaa = 1;
        this.zab = new java.util.HashMap<>();
        this.zac = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cls.getCanonicalName());
    }
}
