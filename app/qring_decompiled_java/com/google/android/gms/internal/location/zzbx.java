package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzbx extends com.google.android.gms.internal.location.zzbu implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.location.zzca zza = new com.google.android.gms.internal.location.zzbv(com.google.android.gms.internal.location.zzby.zza, 0);

    zzbx() {
    }

    static com.google.android.gms.internal.location.zzbx zzi(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.location.zzby.zza : new com.google.android.gms.internal.location.zzby(objArr, i);
    }

    public static com.google.android.gms.internal.location.zzbx zzj(java.util.Collection collection) {
        if (collection instanceof com.google.android.gms.internal.location.zzbu) {
            com.google.android.gms.internal.location.zzbx zzd = ((com.google.android.gms.internal.location.zzbu) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            java.lang.Object[] array = zzd.toArray();
            return zzi(array, array.length);
        }
        java.lang.Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new java.lang.NullPointerException(sb.toString());
            }
        }
        return zzi(array2, length);
    }

    public static com.google.android.gms.internal.location.zzbx zzk() {
        return com.google.android.gms.internal.location.zzby.zza;
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (com.google.android.gms.internal.location.zzbq.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !com.google.android.gms.internal.location.zzbq.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.location.zzbu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.location.zzbu
    int zza(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    @java.lang.Deprecated
    public final com.google.android.gms.internal.location.zzbx zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    /* renamed from: zze */
    public final com.google.android.gms.internal.location.zzbz iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.location.zzbx subList(int i, int i2) {
        com.google.android.gms.internal.location.zzbr.zzc(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? com.google.android.gms.internal.location.zzby.zza : new com.google.android.gms.internal.location.zzbw(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.location.zzca listIterator(int i) {
        com.google.android.gms.internal.location.zzbr.zzb(i, size(), "index");
        return isEmpty() ? zza : new com.google.android.gms.internal.location.zzbv(this, i);
    }
}
