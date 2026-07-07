package com.google.android.gms.common.wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class InstantApps {
    private static android.content.Context zza;
    private static java.lang.Boolean zzb;

    public static synchronized boolean isInstantApp(android.content.Context context) {
        java.lang.Boolean bool;
        synchronized (com.google.android.gms.common.wrappers.InstantApps.class) {
            android.content.Context applicationContext = context.getApplicationContext();
            android.content.Context context2 = zza;
            if (context2 != null && (bool = zzb) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            zzb = null;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                zzb = java.lang.Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    zzb = true;
                } catch (java.lang.ClassNotFoundException unused) {
                    zzb = false;
                }
            }
            zza = applicationContext;
            return zzb.booleanValue();
        }
    }
}
