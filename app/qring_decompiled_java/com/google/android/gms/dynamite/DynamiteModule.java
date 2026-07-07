package com.google.android.gms.dynamite;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class DynamiteModule {
    private static java.lang.Boolean zzb = null;
    private static java.lang.String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static com.google.android.gms.dynamite.zzq zzj;
    private static com.google.android.gms.dynamite.zzr zzk;
    private final android.content.Context zzi;
    private static final java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> zzf = new java.lang.ThreadLocal<>();
    private static final java.lang.ThreadLocal<java.lang.Long> zzg = new com.google.android.gms.dynamite.zzd();
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions zzh = new com.google.android.gms.dynamite.zze();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE = new com.google.android.gms.dynamite.zzf();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_LOCAL = new com.google.android.gms.dynamite.zzg();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zzh();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new com.google.android.gms.dynamite.zzi();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zzj();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new com.google.android.gms.dynamite.zzk();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zza = new com.google.android.gms.dynamite.zzl();

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class LoadingException extends java.lang.Exception {
        /* synthetic */ LoadingException(java.lang.String str, com.google.android.gms.dynamite.zzp zzpVar) {
            super(str);
        }

        /* synthetic */ LoadingException(java.lang.String str, java.lang.Throwable th, com.google.android.gms.dynamite.zzp zzpVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        public interface IVersions {
            int zza(android.content.Context context, java.lang.String str);

            int zzb(android.content.Context context, java.lang.String str, boolean z) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
    }

    private DynamiteModule(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        this.zzi = context;
    }

    public static int getLocalVersion(android.content.Context context, java.lang.String str) {
        try {
            java.lang.ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            java.lang.Class<?> loadClass = classLoader.loadClass(sb.toString());
            java.lang.reflect.Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (com.google.android.gms.common.internal.Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            java.lang.String valueOf = java.lang.String.valueOf(declaredField.get(null));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 51 + java.lang.String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            android.util.Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (java.lang.ClassNotFoundException unused) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            android.util.Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (java.lang.Exception e) {
            java.lang.String valueOf2 = java.lang.String.valueOf(e.getMessage());
            android.util.Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new java.lang.String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int getRemoteVersion(android.content.Context context, java.lang.String str) {
        return zza(context, str, false);
    }

    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context context, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy versionPolicy, java.lang.String str) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        java.lang.Boolean bool;
        com.google.android.gms.dynamic.IObjectWrapper zzh2;
        com.google.android.gms.dynamite.DynamiteModule dynamiteModule;
        com.google.android.gms.dynamite.zzr zzrVar;
        java.lang.Boolean valueOf;
        com.google.android.gms.dynamic.IObjectWrapper zze2;
        java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> threadLocal = zzf;
        com.google.android.gms.dynamite.zzn zznVar = threadLocal.get();
        com.google.android.gms.dynamite.zzn zznVar2 = new com.google.android.gms.dynamite.zzn(null);
        threadLocal.set(zznVar2);
        java.lang.ThreadLocal<java.lang.Long> threadLocal2 = zzg;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzh);
            int i = selectModule.localVersion;
            int i2 = selectModule.remoteVersion;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 68 + java.lang.String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            android.util.Log.i("DynamiteModule", sb.toString());
            int i3 = selectModule.selection;
            if (i3 != 0) {
                if (i3 == -1) {
                    if (selectModule.localVersion != 0) {
                        i3 = -1;
                    }
                }
                if (i3 != 1 || selectModule.remoteVersion != 0) {
                    if (i3 == -1) {
                        com.google.android.gms.dynamite.DynamiteModule zzc2 = zzc(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(java.lang.Long.valueOf(longValue));
                        }
                        android.database.Cursor cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar);
                        return zzc2;
                    }
                    if (i3 != 1) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(47);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(i3);
                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(sb2.toString(), null);
                    }
                    try {
                        int i4 = selectModule.remoteVersion;
                        try {
                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                bool = zzb;
                            }
                            if (bool == null) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51);
                                sb3.append("Selected remote version of ");
                                sb3.append(str);
                                sb3.append(", version >= ");
                                sb3.append(i4);
                                android.util.Log.i("DynamiteModule", sb3.toString());
                                synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                    zzrVar = zzk;
                                }
                                if (zzrVar == null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("DynamiteLoaderV2 was not cached.", null);
                                }
                                com.google.android.gms.dynamite.zzn zznVar3 = threadLocal.get();
                                if (zznVar3 == null || zznVar3.zza == null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No result cursor", null);
                                }
                                android.content.Context applicationContext = context.getApplicationContext();
                                android.database.Cursor cursor2 = zznVar3.zza;
                                com.google.android.gms.dynamic.ObjectWrapper.wrap(null);
                                synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                    valueOf = java.lang.Boolean.valueOf(zze >= 2);
                                }
                                if (valueOf.booleanValue()) {
                                    android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                    zze2 = zzrVar.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext), str, i4, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor2));
                                } else {
                                    android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                    zze2 = zzrVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext), str, i4, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor2));
                                }
                                android.content.Context context2 = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zze2);
                                if (context2 == null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to get module context", null);
                                }
                                dynamiteModule = new com.google.android.gms.dynamite.DynamiteModule(context2);
                            } else {
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51);
                                sb4.append("Selected remote version of ");
                                sb4.append(str);
                                sb4.append(", version >= ");
                                sb4.append(i4);
                                android.util.Log.i("DynamiteModule", sb4.toString());
                                com.google.android.gms.dynamite.zzq zzf2 = zzf(context);
                                if (zzf2 == null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to create IDynamiteLoader.", null);
                                }
                                int zze3 = zzf2.zze();
                                if (zze3 >= 3) {
                                    com.google.android.gms.dynamite.zzn zznVar4 = threadLocal.get();
                                    if (zznVar4 == null) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No cached result cursor holder", null);
                                    }
                                    zzh2 = zzf2.zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i4, com.google.android.gms.dynamic.ObjectWrapper.wrap(zznVar4.zza));
                                } else if (zze3 == 2) {
                                    android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    zzh2 = zzf2.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i4);
                                } else {
                                    android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    zzh2 = zzf2.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i4);
                                }
                                if (com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzh2) == null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", null);
                                }
                                dynamiteModule = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzh2));
                            }
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(java.lang.Long.valueOf(longValue));
                            }
                            android.database.Cursor cursor3 = zznVar2.zza;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            threadLocal.set(zznVar);
                            return dynamiteModule;
                        } catch (android.os.RemoteException e) {
                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", e, null);
                        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                            throw e2;
                        } catch (java.lang.Throwable th) {
                            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th);
                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", th, null);
                        }
                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e3) {
                        java.lang.String valueOf2 = java.lang.String.valueOf(e3.getMessage());
                        android.util.Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new java.lang.String("Failed to load remote module: "));
                        int i5 = selectModule.localVersion;
                        if (i5 == 0 || versionPolicy.selectModule(context, str, new com.google.android.gms.dynamite.zzo(i5, 0)).selection != -1) {
                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote load failed. No local fallback found.", e3, null);
                        }
                        com.google.android.gms.dynamite.DynamiteModule zzc3 = zzc(context, str);
                        if (longValue == 0) {
                            zzg.remove();
                        } else {
                            zzg.set(java.lang.Long.valueOf(longValue));
                        }
                        android.database.Cursor cursor4 = zznVar2.zza;
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        zzf.set(zznVar);
                        return zzc3;
                    }
                }
            }
            int i6 = selectModule.localVersion;
            int i7 = selectModule.remoteVersion;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 92);
            sb5.append("No acceptable module ");
            sb5.append(str);
            sb5.append(" found. Local version is ");
            sb5.append(i6);
            sb5.append(" and remote version is ");
            sb5.append(i7);
            sb5.append(".");
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(sb5.toString(), null);
        } catch (java.lang.Throwable th2) {
            if (longValue == 0) {
                zzg.remove();
            } else {
                zzg.set(java.lang.Long.valueOf(longValue));
            }
            android.database.Cursor cursor5 = zznVar2.zza;
            if (cursor5 != null) {
                cursor5.close();
            }
            zzf.set(zznVar);
            throw th2;
        }
    }

    public static int zza(android.content.Context context, java.lang.String str, boolean z) {
        java.lang.reflect.Field declaredField;
        java.lang.Throwable th;
        android.os.RemoteException e;
        android.database.Cursor cursor;
        try {
            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                java.lang.Boolean bool = zzb;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException e2) {
                        java.lang.String obj = e2.toString();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(obj);
                        android.util.Log.w("DynamiteModule", sb.toString());
                        bool = java.lang.Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        java.lang.ClassLoader classLoader = (java.lang.ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == java.lang.ClassLoader.getSystemClassLoader()) {
                                bool = java.lang.Boolean.FALSE;
                            } else {
                                try {
                                    zzd(classLoader);
                                } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused) {
                                }
                                bool = java.lang.Boolean.TRUE;
                            }
                        } else if (zzd || java.lang.Boolean.TRUE.equals(null)) {
                            declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                            bool = java.lang.Boolean.FALSE;
                        } else {
                            try {
                                int zzb2 = zzb(context, str, z);
                                java.lang.String str2 = zzc;
                                if (str2 != null && !str2.isEmpty()) {
                                    java.lang.ClassLoader zza2 = com.google.android.gms.dynamite.zzb.zza();
                                    if (zza2 == null) {
                                        if (android.os.Build.VERSION.SDK_INT >= 29) {
                                            java.lang.String str3 = zzc;
                                            com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
                                            zza2 = new dalvik.system.DelegateLastClassLoader(str3, java.lang.ClassLoader.getSystemClassLoader());
                                        } else {
                                            java.lang.String str4 = zzc;
                                            com.google.android.gms.common.internal.Preconditions.checkNotNull(str4);
                                            zza2 = new com.google.android.gms.dynamite.zzc(str4, java.lang.ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                    zzd(zza2);
                                    declaredField.set(null, zza2);
                                    zzb = java.lang.Boolean.TRUE;
                                    return zzb2;
                                }
                                return zzb2;
                            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused2) {
                                declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                bool = java.lang.Boolean.FALSE;
                            }
                        }
                        zzb = bool;
                    }
                }
                boolean booleanValue = bool.booleanValue();
                int i = 0;
                if (booleanValue) {
                    try {
                        return zzb(context, str, z);
                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e3) {
                        java.lang.String valueOf = java.lang.String.valueOf(e3.getMessage());
                        android.util.Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new java.lang.String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                com.google.android.gms.dynamite.zzq zzf2 = zzf(context);
                try {
                    if (zzf2 != null) {
                        try {
                            int zze2 = zzf2.zze();
                            if (zze2 >= 3) {
                                com.google.android.gms.dynamite.zzn zznVar = zzf.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    android.database.Cursor cursor2 = (android.database.Cursor) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzf2.zzk(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z, zzg.get().longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i2 = cursor2.getInt(0);
                                                r2 = (i2 <= 0 || !zze(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i = i2;
                                            }
                                        } catch (android.os.RemoteException e4) {
                                            e = e4;
                                            r2 = cursor2;
                                            java.lang.String valueOf2 = java.lang.String.valueOf(e.getMessage());
                                            android.util.Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new java.lang.String("Failed to retrieve remote module version: "));
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i = cursor.getInt(0);
                                }
                            } else if (zze2 == 2) {
                                android.util.Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i = zzf2.zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z);
                            } else {
                                android.util.Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i = zzf2.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (android.os.RemoteException e5) {
                            e = e5;
                        }
                    }
                    return i;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            }
        } catch (java.lang.Throwable th4) {
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.zzg     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            r12.<init>()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            if (r10 == 0) goto La0
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r11 == 0) goto La0
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r12 <= 0) goto L8e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.zzc = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.zze = r2     // Catch: java.lang.Throwable -> L8b
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.zzd = r9     // Catch: java.lang.Throwable -> L8b
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = zze(r10)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r1 == 0) goto L8e
            r10 = r0
            goto L8e
        L8b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        L8e:
            if (r11 != 0) goto L96
            if (r10 == 0) goto L95
            r10.close()
        L95:
            return r12
        L96:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        L9e:
            r11 = move-exception
            goto Lb5
        La0:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        Laf:
            r10 = move-exception
            r11 = r10
            goto Lc4
        Lb2:
            r10 = move-exception
            r11 = r10
            r10 = r0
        Lb5:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> Lc2
            if (r12 == 0) goto Lba
            throw r11     // Catch: java.lang.Throwable -> Lc2
        Lba:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r11, r0)     // Catch: java.lang.Throwable -> Lc2
            throw r12     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r11 = move-exception
            r0 = r10
        Lc4:
            if (r0 == 0) goto Lc9
            r0.close()
        Lc9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean):int");
    }

    private static com.google.android.gms.dynamite.DynamiteModule zzc(android.content.Context context, java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf(str);
        android.util.Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new java.lang.String("Selected local version of "));
        return new com.google.android.gms.dynamite.DynamiteModule(context.getApplicationContext());
    }

    private static void zzd(java.lang.ClassLoader classLoader) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.zzr zzrVar;
        com.google.android.gms.dynamite.zzp zzpVar = null;
        try {
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = queryLocalInterface instanceof com.google.android.gms.dynamite.zzr ? (com.google.android.gms.dynamite.zzr) queryLocalInterface : new com.google.android.gms.dynamite.zzr(iBinder);
            }
            zzk = zzrVar;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(android.database.Cursor cursor) {
        com.google.android.gms.dynamite.zzn zznVar = zzf.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static com.google.android.gms.dynamite.zzq zzf(android.content.Context context) {
        com.google.android.gms.dynamite.zzq zzqVar;
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            com.google.android.gms.dynamite.zzq zzqVar2 = zzj;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                android.os.IBinder iBinder = (android.os.IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = queryLocalInterface instanceof com.google.android.gms.dynamite.zzq ? (com.google.android.gms.dynamite.zzq) queryLocalInterface : new com.google.android.gms.dynamite.zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzj = zzqVar;
                    return zzqVar;
                }
            } catch (java.lang.Exception e) {
                java.lang.String valueOf = java.lang.String.valueOf(e.getMessage());
                android.util.Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new java.lang.String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public android.content.Context getModuleContext() {
        return this.zzi;
    }

    public android.os.IBinder instantiate(java.lang.String str) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        try {
            return (android.os.IBinder) this.zzi.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e) {
            java.lang.String valueOf = java.lang.String.valueOf(str);
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new java.lang.String("Failed to instantiate module class: "), e, null);
        }
    }
}
