package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzfk<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.android.gms.internal.auth.zzfk zza;
    private boolean zzb;

    static {
        com.google.android.gms.internal.auth.zzfk zzfkVar = new com.google.android.gms.internal.auth.zzfk();
        zza = zzfkVar;
        zzfkVar.zzb = false;
    }

    private zzfk() {
        this.zzb = true;
    }

    public static <K, V> com.google.android.gms.internal.auth.zzfk<K, V> zza() {
        return zza;
    }

    private static int zzf(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return com.google.android.gms.internal.auth.zzev.zzb((byte[]) obj);
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzes) {
            throw new java.lang.UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            java.lang.Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            i += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zzg();
        com.google.android.gms.internal.auth.zzev.zze(k);
        com.google.android.gms.internal.auth.zzev.zze(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        zzg();
        for (K k : map.keySet()) {
            com.google.android.gms.internal.auth.zzev.zze(k);
            com.google.android.gms.internal.auth.zzev.zze(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        zzg();
        return (V) super.remove(obj);
    }

    public final com.google.android.gms.internal.auth.zzfk<K, V> zzb() {
        return isEmpty() ? new com.google.android.gms.internal.auth.zzfk<>() : new com.google.android.gms.internal.auth.zzfk<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(com.google.android.gms.internal.auth.zzfk<K, V> zzfkVar) {
        zzg();
        if (zzfkVar.isEmpty()) {
            return;
        }
        putAll(zzfkVar);
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzfk(java.util.Map<K, V> map) {
        super(map);
        this.zzb = true;
    }
}
