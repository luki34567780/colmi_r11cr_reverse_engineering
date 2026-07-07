package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzag<E> extends com.google.android.gms.internal.common.zzac<E> implements java.util.List<E>, java.util.RandomAccess {
    private static final com.google.android.gms.internal.common.zzak<java.lang.Object> zza = new com.google.android.gms.internal.common.zzae(com.google.android.gms.internal.common.zzai.zza, 0);

    zzag() {
    }

    static <E> com.google.android.gms.internal.common.zzag<E> zzi(java.lang.Object[] objArr, int i) {
        return i == 0 ? (com.google.android.gms.internal.common.zzag<E>) com.google.android.gms.internal.common.zzai.zza : new com.google.android.gms.internal.common.zzai(objArr, i);
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzk(java.util.Collection<? extends E> collection) {
        if (!(collection instanceof com.google.android.gms.internal.common.zzac)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            com.google.android.gms.internal.common.zzah.zza(array, length);
            return zzi(array, length);
        }
        com.google.android.gms.internal.common.zzag<E> zzd = ((com.google.android.gms.internal.common.zzac) collection).zzd();
        if (!zzd.zzf()) {
            return zzd;
        }
        java.lang.Object[] array2 = zzd.toArray();
        return zzi(array2, array2.length);
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzl() {
        return (com.google.android.gms.internal.common.zzag<E>) com.google.android.gms.internal.common.zzai.zza;
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzm(E e) {
        java.lang.Object[] objArr = {e};
        com.google.android.gms.internal.common.zzah.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzn(E e, E e2) {
        java.lang.Object[] objArr = {e, e2};
        com.google.android.gms.internal.common.zzah.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
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
                        if (com.google.android.gms.internal.common.zzr.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator<E> it = iterator();
                java.util.Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !com.google.android.gms.internal.common.zzr.zza(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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
    public final E remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzac
    int zza(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @java.lang.Deprecated
    public final com.google.android.gms.internal.common.zzag<E> zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: zze */
    public final com.google.android.gms.internal.common.zzaj<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.common.zzag<E> subList(int i, int i2) {
        com.google.android.gms.internal.common.zzs.zzc(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? (com.google.android.gms.internal.common.zzag<E>) com.google.android.gms.internal.common.zzai.zza : new com.google.android.gms.internal.common.zzaf(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.common.zzak<E> listIterator(int i) {
        com.google.android.gms.internal.common.zzs.zzb(i, size(), "index");
        return isEmpty() ? (com.google.android.gms.internal.common.zzak<E>) zza : new com.google.android.gms.internal.common.zzae(this, i);
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzj(java.lang.Iterable<? extends E> iterable) {
        java.util.Objects.requireNonNull(iterable);
        if (iterable instanceof java.util.Collection) {
            return zzk((java.util.Collection) iterable);
        }
        java.util.Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return (com.google.android.gms.internal.common.zzag<E>) com.google.android.gms.internal.common.zzai.zza;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        com.google.android.gms.internal.common.zzad zzadVar = new com.google.android.gms.internal.common.zzad(4);
        zzadVar.zzb((com.google.android.gms.internal.common.zzad) next);
        zzadVar.zzc(it);
        zzadVar.zzc = true;
        return zzi(zzadVar.zza, zzadVar.zzb);
    }
}
