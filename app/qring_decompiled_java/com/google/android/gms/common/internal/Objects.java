package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class Objects {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static final class ToStringHelper {
        private final java.util.List<java.lang.String> zza;
        private final java.lang.Object zzb;

        /* synthetic */ ToStringHelper(java.lang.Object obj, com.google.android.gms.common.internal.zzah zzahVar) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new java.util.ArrayList();
        }

        public com.google.android.gms.common.internal.Objects.ToStringHelper add(java.lang.String str, java.lang.Object obj) {
            java.util.List<java.lang.String> list = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            java.lang.String valueOf = java.lang.String.valueOf(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1 + java.lang.String.valueOf(valueOf).length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
            sb.append(this.zzb.getClass().getSimpleName());
            sb.append('{');
            int size = this.zza.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.zza.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    public static boolean checkBundlesEquality(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        java.util.Set<java.lang.String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (java.lang.String str : keySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelper(java.lang.Object obj) {
        return new com.google.android.gms.common.internal.Objects.ToStringHelper(obj, null);
    }
}
