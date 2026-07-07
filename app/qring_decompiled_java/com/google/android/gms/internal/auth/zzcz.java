package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzcz<T> {
    public static final /* synthetic */ int zzd = 0;

    @javax.annotation.Nullable
    private static volatile com.google.android.gms.internal.auth.zzcy zze;
    private static volatile boolean zzf;
    final com.google.android.gms.internal.auth.zzcx zzb;
    final java.lang.String zzc;
    private final T zzj;
    private volatile int zzk = -1;
    private volatile T zzl;
    private final boolean zzm;
    private static final java.lang.Object zza = new java.lang.Object();
    private static final java.util.concurrent.atomic.AtomicReference<java.util.Collection<com.google.android.gms.internal.auth.zzcz<?>>> zzg = new java.util.concurrent.atomic.AtomicReference<>();
    private static final com.google.android.gms.internal.auth.zzdb zzh = new com.google.android.gms.internal.auth.zzdb(new java.lang.Object() { // from class: com.google.android.gms.internal.auth.zzcr
    }, null);
    private static final java.util.concurrent.atomic.AtomicInteger zzi = new java.util.concurrent.atomic.AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ zzcz(com.google.android.gms.internal.auth.zzcx zzcxVar, java.lang.String str, java.lang.Object obj, boolean z, com.google.android.gms.internal.auth.zzct zzctVar) {
        if (zzcxVar.zzb == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzb = zzcxVar;
        this.zzc = str;
        this.zzj = obj;
        this.zzm = true;
    }

    static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final android.content.Context context) {
        if (zze == null) {
            java.lang.Object obj = zza;
            synchronized (obj) {
                if (zze == null) {
                    synchronized (obj) {
                        com.google.android.gms.internal.auth.zzcy zzcyVar = zze;
                        android.content.Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzcyVar == null || zzcyVar.zza() != context) {
                            com.google.android.gms.internal.auth.zzcg.zzd();
                            com.google.android.gms.internal.auth.zzda.zzc();
                            com.google.android.gms.internal.auth.zzcn.zze();
                            zze = new com.google.android.gms.internal.auth.zzcd(context, com.google.android.gms.internal.auth.zzdk.zza(new com.google.android.gms.internal.auth.zzdg() { // from class: com.google.android.gms.internal.auth.zzcs
                                @Override // com.google.android.gms.internal.auth.zzdg
                                public final java.lang.Object zza() {
                                    com.google.android.gms.internal.auth.zzde zzc;
                                    com.google.android.gms.internal.auth.zzde zzc2;
                                    android.content.Context context2 = context;
                                    int i = com.google.android.gms.internal.auth.zzcz.zzd;
                                    java.lang.String str = android.os.Build.TYPE;
                                    java.lang.String str2 = android.os.Build.TAGS;
                                    if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                                        return com.google.android.gms.internal.auth.zzde.zzc();
                                    }
                                    if (com.google.android.gms.internal.auth.zzcc.zza() && !context2.isDeviceProtectedStorage()) {
                                        context2 = context2.createDeviceProtectedStorageContext();
                                    }
                                    android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                                    try {
                                        android.os.StrictMode.allowThreadDiskWrites();
                                        try {
                                            java.io.File file = new java.io.File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                            zzc = file.exists() ? com.google.android.gms.internal.auth.zzde.zzd(file) : com.google.android.gms.internal.auth.zzde.zzc();
                                        } catch (java.lang.RuntimeException e) {
                                            android.util.Log.e("HermeticFileOverrides", "no data dir", e);
                                            zzc = com.google.android.gms.internal.auth.zzde.zzc();
                                        }
                                        if (zzc.zzb()) {
                                            java.io.File file2 = (java.io.File) zzc.zza();
                                            try {
                                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file2)));
                                                try {
                                                    java.util.HashMap hashMap = new java.util.HashMap();
                                                    java.util.HashMap hashMap2 = new java.util.HashMap();
                                                    while (true) {
                                                        java.lang.String readLine = bufferedReader.readLine();
                                                        if (readLine == null) {
                                                            break;
                                                        }
                                                        java.lang.String[] split = readLine.split(" ", 3);
                                                        if (split.length != 3) {
                                                            android.util.Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new java.lang.String("Invalid: "));
                                                        } else {
                                                            java.lang.String str3 = new java.lang.String(split[0]);
                                                            java.lang.String decode = android.net.Uri.decode(new java.lang.String(split[1]));
                                                            java.lang.String str4 = (java.lang.String) hashMap2.get(split[2]);
                                                            if (str4 == null) {
                                                                java.lang.String str5 = new java.lang.String(split[2]);
                                                                str4 = android.net.Uri.decode(str5);
                                                                if (str4.length() < 1024 || str4 == str5) {
                                                                    hashMap2.put(str5, str4);
                                                                }
                                                            }
                                                            if (!hashMap.containsKey(str3)) {
                                                                hashMap.put(str3, new java.util.HashMap());
                                                            }
                                                            ((java.util.Map) hashMap.get(str3)).put(decode, str4);
                                                        }
                                                    }
                                                    java.lang.String valueOf = java.lang.String.valueOf(file2);
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 7);
                                                    sb.append("Parsed ");
                                                    sb.append(valueOf);
                                                    android.util.Log.i("HermeticFileOverrides", sb.toString());
                                                    com.google.android.gms.internal.auth.zzco zzcoVar = new com.google.android.gms.internal.auth.zzco(hashMap);
                                                    bufferedReader.close();
                                                    zzc2 = com.google.android.gms.internal.auth.zzde.zzd(zzcoVar);
                                                } catch (java.lang.Throwable th) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (java.lang.Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            } catch (java.io.IOException e2) {
                                                throw new java.lang.RuntimeException(e2);
                                            }
                                        } else {
                                            zzc2 = com.google.android.gms.internal.auth.zzde.zzc();
                                        }
                                        return zzc2;
                                    } finally {
                                        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    }
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    abstract T zza(java.lang.Object obj);

    public final java.lang.String zzc() {
        java.lang.String str = this.zzb.zzd;
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4 A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0037, B:16:0x0043, B:18:0x004c, B:20:0x005e, B:21:0x0069, B:22:0x0063, B:26:0x00e4, B:28:0x00f4, B:30:0x010a, B:31:0x010d, B:32:0x0111, B:33:0x00b8, B:35:0x00be, B:38:0x00d4, B:40:0x00da, B:42:0x00e2, B:43:0x00d0, B:45:0x006e, B:47:0x0074, B:49:0x0082, B:51:0x00a7, B:53:0x00b1, B:55:0x0099, B:56:0x0116, B:57:0x011b, B:59:0x011c), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8 A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0037, B:16:0x0043, B:18:0x004c, B:20:0x005e, B:21:0x0069, B:22:0x0063, B:26:0x00e4, B:28:0x00f4, B:30:0x010a, B:31:0x010d, B:32:0x0111, B:33:0x00b8, B:35:0x00be, B:38:0x00d4, B:40:0x00da, B:42:0x00e2, B:43:0x00d0, B:45:0x006e, B:47:0x0074, B:49:0x0082, B:51:0x00a7, B:53:0x00b1, B:55:0x0099, B:56:0x0116, B:57:0x011b, B:59:0x011c), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2 A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0037, B:16:0x0043, B:18:0x004c, B:20:0x005e, B:21:0x0069, B:22:0x0063, B:26:0x00e4, B:28:0x00f4, B:30:0x010a, B:31:0x010d, B:32:0x0111, B:33:0x00b8, B:35:0x00be, B:38:0x00d4, B:40:0x00da, B:42:0x00e2, B:43:0x00d0, B:45:0x006e, B:47:0x0074, B:49:0x0082, B:51:0x00a7, B:53:0x00b1, B:55:0x0099, B:56:0x0116, B:57:0x011b, B:59:0x011c), top: B:7:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T zzb() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcz.zzb():java.lang.Object");
    }
}
