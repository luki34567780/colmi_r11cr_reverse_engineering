package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzez extends com.google.android.gms.internal.auth.zzdn<java.lang.String> implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzfa {
    public static final com.google.android.gms.internal.auth.zzfa zza;
    private static final com.google.android.gms.internal.auth.zzez zzb;
    private final java.util.List<java.lang.Object> zzc;

    static {
        com.google.android.gms.internal.auth.zzez zzezVar = new com.google.android.gms.internal.auth.zzez(10);
        zzb = zzezVar;
        zzezVar.zzb();
        zza = zzezVar;
    }

    public zzez() {
        this(10);
    }

    private static java.lang.String zzh(java.lang.Object obj) {
        return obj instanceof java.lang.String ? (java.lang.String) obj : obj instanceof com.google.android.gms.internal.auth.zzeb ? ((com.google.android.gms.internal.auth.zzeb) obj).zzm(com.google.android.gms.internal.auth.zzev.zza) : com.google.android.gms.internal.auth.zzev.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        zza();
        this.zzc.add(i, (java.lang.String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        zza();
        if (collection instanceof com.google.android.gms.internal.auth.zzfa) {
            collection = ((com.google.android.gms.internal.auth.zzfa) collection).zzg();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zza();
        java.lang.Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzh(remove);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        zza();
        return zzh(this.zzc.set(i, (java.lang.String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.auth.zzeu
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzeu zzd(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.zzc);
        return new com.google.android.gms.internal.auth.zzez((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.auth.zzfa
    public final com.google.android.gms.internal.auth.zzfa zze() {
        return zzc() ? new com.google.android.gms.internal.auth.zzgu(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final java.lang.String get(int i) {
        java.lang.Object obj = this.zzc.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzeb) {
            com.google.android.gms.internal.auth.zzeb zzebVar = (com.google.android.gms.internal.auth.zzeb) obj;
            java.lang.String zzm = zzebVar.zzm(com.google.android.gms.internal.auth.zzev.zza);
            if (zzebVar.zzh()) {
                this.zzc.set(i, zzm);
            }
            return zzm;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String zzh = com.google.android.gms.internal.auth.zzev.zzh(bArr);
        if (com.google.android.gms.internal.auth.zzev.zzi(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.auth.zzfa
    public final java.util.List<?> zzg() {
        return java.util.Collections.unmodifiableList(this.zzc);
    }

    public zzez(int i) {
        this.zzc = new java.util.ArrayList(i);
    }

    private zzez(java.util.ArrayList<java.lang.Object> arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }
}
