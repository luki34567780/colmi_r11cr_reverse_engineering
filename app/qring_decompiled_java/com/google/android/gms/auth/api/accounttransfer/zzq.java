package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzq implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.auth.api.accounttransfer.zzq zza;
    private final android.os.Bundle zzb;

    static {
        android.os.Bundle bundle = new android.os.Bundle();
        if (!bundle.containsKey("accountTypes")) {
            bundle.putStringArrayList("accountTypes", new java.util.ArrayList<>(0));
        }
        zza = new com.google.android.gms.auth.api.accounttransfer.zzq(bundle, null);
    }

    /* synthetic */ zzq(android.os.Bundle bundle, com.google.android.gms.auth.api.accounttransfer.zzp zzpVar) {
        this.zzb = bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.accounttransfer.zzq)) {
            return false;
        }
        android.os.Bundle zza2 = zza();
        android.os.Bundle zza3 = ((com.google.android.gms.auth.api.accounttransfer.zzq) obj).zza();
        if (zza2.size() != zza3.size()) {
            return false;
        }
        for (java.lang.String str : zza2.keySet()) {
            if (!zza3.containsKey(str) || !com.google.android.gms.common.internal.Objects.equal(zza2.get(str), zza3.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        android.os.Bundle zza2 = zza();
        int size = zza2.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size + size);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(zza2.keySet());
        java.util.Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            java.lang.String str = (java.lang.String) arrayList2.get(i);
            arrayList.add(str);
            arrayList.add(zza2.get(str));
        }
        return com.google.android.gms.common.internal.Objects.hashCode(arrayList);
    }

    public final android.os.Bundle zza() {
        return new android.os.Bundle(this.zzb);
    }
}
