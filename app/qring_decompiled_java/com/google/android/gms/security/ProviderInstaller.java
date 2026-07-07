package com.google.android.gms.security;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class ProviderInstaller {
    public static final java.lang.String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
    private static final java.lang.Object zzb = new java.lang.Object();
    private static java.lang.reflect.Method zzc = null;
    private static java.lang.reflect.Method zzd = null;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, android.content.Intent intent);

        void onProviderInstalled();
    }

    public static void installIfNeeded(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        android.content.Context context2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        zza.verifyGooglePlayServicesIsAvailable(context, 11925000);
        synchronized (zzb) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            try {
                context2 = com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
                java.lang.String valueOf = java.lang.String.valueOf(e.getMessage());
                android.util.Log.w("ProviderInstaller", valueOf.length() != 0 ? "Failed to load providerinstaller module: ".concat(valueOf) : new java.lang.String("Failed to load providerinstaller module: "));
                context2 = null;
            }
            if (context2 != null) {
                zzc(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            android.content.Context remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    if (zzd == null) {
                        zzd = zzb(remoteContext, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new java.lang.Class[]{android.content.Context.class, java.lang.Long.TYPE, java.lang.Long.TYPE});
                    }
                    zzd.invoke(null, context, java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime2));
                } catch (java.lang.Exception e2) {
                    java.lang.String valueOf2 = java.lang.String.valueOf(e2.getMessage());
                    android.util.Log.w("ProviderInstaller", valueOf2.length() != 0 ? "Failed to report request stats: ".concat(valueOf2) : new java.lang.String("Failed to report request stats: "));
                }
            }
            if (remoteContext != null) {
                zzc(remoteContext, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                android.util.Log.e("ProviderInstaller", "Failed to get remote context");
                throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void installIfNeededAsync(android.content.Context context, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener providerInstallListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the UI thread");
        new com.google.android.gms.security.zza(context, providerInstallListener).execute(new java.lang.Void[0]);
    }

    private static java.lang.reflect.Method zzb(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Class[] clsArr) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void zzc(android.content.Context context, android.content.Context context2, java.lang.String str) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        try {
            if (zzc == null) {
                zzc = zzb(context, str, "insertProvider", new java.lang.Class[]{android.content.Context.class});
            }
            zzc.invoke(null, context);
        } catch (java.lang.Exception e) {
            java.lang.Throwable cause = e.getCause();
            if (android.util.Log.isLoggable("ProviderInstaller", 6)) {
                java.lang.String valueOf = java.lang.String.valueOf(cause == null ? e.getMessage() : cause.getMessage());
                android.util.Log.e("ProviderInstaller", valueOf.length() != 0 ? "Failed to install provider: ".concat(valueOf) : new java.lang.String("Failed to install provider: "));
            }
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
        }
    }
}
