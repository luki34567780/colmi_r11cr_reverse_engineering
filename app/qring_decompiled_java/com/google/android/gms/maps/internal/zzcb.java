package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzcb {
    private static final java.lang.String zza = "zzcb";
    private static android.content.Context zzb;
    private static com.google.android.gms.maps.internal.zzf zzc;

    public static com.google.android.gms.maps.internal.zzf zza(android.content.Context context, com.google.android.gms.maps.MapsInitializer.Renderer renderer) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        com.google.android.gms.maps.internal.zzf zzeVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        java.lang.String str = zza;
        android.util.Log.d(str, "preferredRenderer: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(renderer))));
        com.google.android.gms.maps.internal.zzf zzfVar = zzc;
        if (zzfVar != null) {
            return zzfVar;
        }
        int isGooglePlayServicesAvailable = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (isGooglePlayServicesAvailable != 0) {
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        android.util.Log.i(str, "Making Creator dynamically");
        try {
            android.os.IBinder iBinder = (android.os.IBinder) zzd(((java.lang.ClassLoader) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                zzeVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                zzeVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.zzf ? (com.google.android.gms.maps.internal.zzf) queryLocalInterface : new com.google.android.gms.maps.internal.zze(iBinder);
            }
            zzc = zzeVar;
            try {
                android.content.Context zzc2 = zzc(context, renderer);
                zzc2.getClass();
                zzeVar.zzk(com.google.android.gms.dynamic.ObjectWrapper.wrap(zzc2.getResources()), com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                return zzc;
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        } catch (java.lang.ClassNotFoundException unused) {
            throw new java.lang.IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
        }
    }

    private static android.content.Context zzb(java.lang.Exception exc, android.content.Context context) {
        android.util.Log.e(zza, "Failed to load maps module, use pre-Chimera", exc);
        return com.google.android.gms.common.GooglePlayServicesUtil.getRemoteContext(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(6:5|(2:7|(1:9))(1:25)|10|11|12|13)|26|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r3.equals("com.google.android.gms.maps_dynamite") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r2 = zzb(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        android.util.Log.d(com.google.android.gms.maps.internal.zzcb.zza, "Attempting to load maps_dynamite again.");
        r2 = com.google.android.gms.dynamite.DynamiteModule.load(r2, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        r2 = zzb(r3, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.Context zzc(android.content.Context r2, com.google.android.gms.maps.MapsInitializer.Renderer r3) {
        /*
            android.content.Context r0 = com.google.android.gms.maps.internal.zzcb.zzb
            if (r0 != 0) goto L4d
            r2.getApplicationContext()
            java.lang.String r0 = "com.google.android.gms.maps_dynamite"
            if (r3 == 0) goto L1b
            int r3 = r3.ordinal()
            if (r3 == 0) goto L18
            r1 = 1
            if (r3 == r1) goto L15
            goto L1b
        L15:
            java.lang.String r3 = "com.google.android.gms.maps_core_dynamite"
            goto L1c
        L18:
            java.lang.String r3 = "com.google.android.gms.maps_legacy_dynamite"
            goto L1c
        L1b:
            r3 = r0
        L1c:
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r1 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: java.lang.Exception -> L27
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r1, r3)     // Catch: java.lang.Exception -> L27
            android.content.Context r2 = r1.getModuleContext()     // Catch: java.lang.Exception -> L27
            goto L4a
        L27:
            r1 = move-exception
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L46
            java.lang.String r3 = com.google.android.gms.maps.internal.zzcb.zza     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = "Attempting to load maps_dynamite again."
            android.util.Log.d(r3, r1)     // Catch: java.lang.Exception -> L40
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: java.lang.Exception -> L40
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r3, r0)     // Catch: java.lang.Exception -> L40
            android.content.Context r2 = r3.getModuleContext()     // Catch: java.lang.Exception -> L40
            goto L4a
        L40:
            r3 = move-exception
            android.content.Context r2 = zzb(r3, r2)
            goto L4a
        L46:
            android.content.Context r2 = zzb(r1, r2)
        L4a:
            com.google.android.gms.maps.internal.zzcb.zzb = r2
            return r2
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzcb.zzc(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer):android.content.Context");
    }

    private static java.lang.Object zzd(java.lang.Class cls) {
        try {
            return cls.newInstance();
        } catch (java.lang.IllegalAccessException unused) {
            throw new java.lang.IllegalStateException("Unable to call the default constructor of ".concat(java.lang.String.valueOf(cls.getName())));
        } catch (java.lang.InstantiationException unused2) {
            throw new java.lang.IllegalStateException("Unable to instantiate the dynamic class ".concat(java.lang.String.valueOf(cls.getName())));
        }
    }
}
