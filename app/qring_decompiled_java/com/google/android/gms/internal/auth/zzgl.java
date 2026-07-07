package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
class zzgl<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private final int zza;
    private boolean zzd;
    private volatile com.google.android.gms.internal.auth.zzgk zze;
    private java.util.List<com.google.android.gms.internal.auth.zzgi> zzb = java.util.Collections.emptyList();
    private java.util.Map<K, V> zzc = java.util.Collections.emptyMap();
    private java.util.Map<K, V> zzf = java.util.Collections.emptyMap();

    private final int zzk(K k) {
        int size = this.zzb.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.zzb.get(size).zza());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.zzb.get(i2).zza());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzl(int i) {
        zzn();
        V v = (V) this.zzb.remove(i).getValue();
        if (!this.zzc.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = zzm().entrySet().iterator();
            java.util.List<com.google.android.gms.internal.auth.zzgi> list = this.zzb;
            java.util.Map.Entry<K, V> next = it.next();
            list.add(new com.google.android.gms.internal.auth.zzgi(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    private final java.util.SortedMap<K, V> zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (this.zzd) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zzk(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.auth.zzgk(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.auth.zzgl)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.auth.zzgl zzglVar = (com.google.android.gms.internal.auth.zzgl) obj;
        int size = size();
        if (size != zzglVar.size()) {
            return false;
        }
        int zzb = zzb();
        if (zzb != zzglVar.zzb()) {
            return entrySet().equals(zzglVar.entrySet());
        }
        for (int i = 0; i < zzb; i++) {
            if (!zzg(i).equals(zzglVar.zzg(i))) {
                return false;
            }
        }
        if (zzb != size) {
            return this.zzc.equals(zzglVar.zzc);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zzk = zzk(comparable);
        return zzk >= 0 ? (V) this.zzb.get(zzk).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzb = zzb();
        int i = 0;
        for (int i2 = 0; i2 < zzb; i2++) {
            i += this.zzb.get(i2).hashCode();
        }
        return this.zzc.size() > 0 ? i + this.zzc.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        zzn();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return (V) zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final java.lang.Iterable<java.util.Map.Entry<K, V>> zzc() {
        return this.zzc.isEmpty() ? com.google.android.gms.internal.auth.zzgh.zza() : this.zzc.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        zzn();
        int zzk = zzk(k);
        if (zzk >= 0) {
            return (V) this.zzb.get(zzk).setValue(v);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof java.util.ArrayList)) {
            this.zzb = new java.util.ArrayList(this.zza);
        }
        int i = -(zzk + 1);
        if (i >= this.zza) {
            return zzm().put(k, v);
        }
        int size = this.zzb.size();
        int i2 = this.zza;
        if (size == i2) {
            com.google.android.gms.internal.auth.zzgi remove = this.zzb.remove(i2 - 1);
            zzm().put(remove.zza(), remove.getValue());
        }
        this.zzb.add(i, new com.google.android.gms.internal.auth.zzgi(this, k, v));
        return null;
    }

    public final java.util.Map.Entry<K, V> zzg(int i) {
        return this.zzb.get(i);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
