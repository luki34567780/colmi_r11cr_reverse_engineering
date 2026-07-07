package com.google.android.gms.fitness.service;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class FitnessSensorService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";
    private com.google.android.gms.fitness.service.zzb zza;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (!SERVICE_INTERFACE.equals(intent.getAction())) {
            return null;
        }
        if (android.util.Log.isLoggable("FitnessSensorService", 3)) {
            android.util.Log.d("FitnessSensorService", "Intent " + java.lang.String.valueOf(intent) + " received by " + getClass().getName());
        }
        return this.zza;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zza = new com.google.android.gms.fitness.service.zzb(this, null);
    }

    public abstract java.util.List<com.google.android.gms.fitness.data.DataSource> onFindDataSources(java.util.List<com.google.android.gms.fitness.data.DataType> list);

    public abstract boolean onRegister(com.google.android.gms.fitness.service.FitnessSensorServiceRequest fitnessSensorServiceRequest);

    public abstract boolean onUnregister(com.google.android.gms.fitness.data.DataSource dataSource);

    protected final void zza() {
        int callingUid = android.os.Binder.getCallingUid();
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()) {
            ((android.app.AppOpsManager) getSystemService("appops")).checkPackage(callingUid, "com.google.android.gms");
            return;
        }
        java.lang.String[] packagesForUid = getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            for (java.lang.String str : packagesForUid) {
                if (str.equals("com.google.android.gms")) {
                    return;
                }
            }
        }
        throw new java.lang.SecurityException("Unauthorized caller");
    }
}
