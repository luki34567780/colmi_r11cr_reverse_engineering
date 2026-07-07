package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzcg implements com.google.android.gms.internal.auth.zzck {
    private final android.content.ContentResolver zzc;
    private final android.net.Uri zzd;
    private final android.database.ContentObserver zze;
    private final java.lang.Object zzf;
    private volatile java.util.Map<java.lang.String, java.lang.String> zzg;
    private final java.util.List<com.google.android.gms.internal.auth.zzch> zzh;
    private static final java.util.Map<android.net.Uri, com.google.android.gms.internal.auth.zzcg> zzb = new androidx.collection.ArrayMap();
    public static final java.lang.String[] zza = {"key", "value"};

    private zzcg(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        com.google.android.gms.internal.auth.zzcf zzcfVar = new com.google.android.gms.internal.auth.zzcf(this, null);
        this.zze = zzcfVar;
        this.zzf = new java.lang.Object();
        this.zzh = new java.util.ArrayList();
        java.util.Objects.requireNonNull(contentResolver);
        java.util.Objects.requireNonNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        contentResolver.registerContentObserver(uri, false, zzcfVar);
    }

    public static com.google.android.gms.internal.auth.zzcg zza(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        com.google.android.gms.internal.auth.zzcg zzcgVar;
        synchronized (com.google.android.gms.internal.auth.zzcg.class) {
            java.util.Map<android.net.Uri, com.google.android.gms.internal.auth.zzcg> map = zzb;
            zzcgVar = map.get(uri);
            if (zzcgVar == null) {
                try {
                    com.google.android.gms.internal.auth.zzcg zzcgVar2 = new com.google.android.gms.internal.auth.zzcg(contentResolver, uri);
                    try {
                        map.put(uri, zzcgVar2);
                    } catch (java.lang.SecurityException unused) {
                    }
                    zzcgVar = zzcgVar2;
                } catch (java.lang.SecurityException unused2) {
                }
            }
        }
        return zzcgVar;
    }

    static synchronized void zzd() {
        synchronized (com.google.android.gms.internal.auth.zzcg.class) {
            for (com.google.android.gms.internal.auth.zzcg zzcgVar : zzb.values()) {
                zzcgVar.zzc.unregisterContentObserver(zzcgVar.zze);
            }
            zzb.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzck
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> map;
        java.util.Map<java.lang.String, java.lang.String> map2;
        java.util.Map<java.lang.String, java.lang.String> map3 = this.zzg;
        java.util.Map<java.lang.String, java.lang.String> map4 = map3;
        if (map3 == null) {
            synchronized (this.zzf) {
                java.util.Map<java.lang.String, java.lang.String> map5 = this.zzg;
                map = map5;
                if (map5 == null) {
                    android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map2 = (java.util.Map) com.google.android.gms.internal.auth.zzci.zza(new com.google.android.gms.internal.auth.zzcj() { // from class: com.google.android.gms.internal.auth.zzce
                                @Override // com.google.android.gms.internal.auth.zzcj
                                public final java.lang.Object zza() {
                                    return com.google.android.gms.internal.auth.zzcg.this.zzc();
                                }
                            });
                        } finally {
                            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException | java.lang.SecurityException unused) {
                        android.util.Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map2 = null;
                    }
                    this.zzg = map2;
                    allowThreadDiskReads = map2;
                    map = allowThreadDiskReads;
                }
            }
            map4 = map;
        }
        if (map4 == null) {
            map4 = java.util.Collections.emptyMap();
        }
        return map4.get(str);
    }

    public final /* synthetic */ java.util.Map zzc() {
        android.database.Cursor query = this.zzc.query(this.zzd, zza, null, null, null);
        if (query == null) {
            return java.util.Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return java.util.Collections.emptyMap();
            }
            androidx.collection.ArrayMap arrayMap = count <= 256 ? new androidx.collection.ArrayMap(count) : new java.util.HashMap(count, 1.0f);
            while (query.moveToNext()) {
                arrayMap.put(query.getString(0), query.getString(1));
            }
            return arrayMap;
        } finally {
            query.close();
        }
    }

    public final void zze() {
        synchronized (this.zzf) {
            this.zzg = null;
            com.google.android.gms.internal.auth.zzcz.zzd();
        }
        synchronized (this) {
            java.util.Iterator<com.google.android.gms.internal.auth.zzch> it = this.zzh.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
