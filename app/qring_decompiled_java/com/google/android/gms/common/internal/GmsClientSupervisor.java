package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class GmsClientSupervisor {
    static android.os.HandlerThread zza = null;
    private static int zzb = 4225;
    private static final java.lang.Object zzc = new java.lang.Object();
    private static com.google.android.gms.common.internal.zzr zzd;
    private static boolean zze;

    public static int getDefaultBindFlags() {
        return zzb;
    }

    public static com.google.android.gms.common.internal.GmsClientSupervisor getInstance(android.content.Context context) {
        synchronized (zzc) {
            if (zzd == null) {
                zzd = new com.google.android.gms.common.internal.zzr(context.getApplicationContext(), zze ? getOrStartHandlerThread().getLooper() : context.getMainLooper());
            }
        }
        return zzd;
    }

    public static android.os.HandlerThread getOrStartHandlerThread() {
        synchronized (zzc) {
            android.os.HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("GoogleApiHandler", 9);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzc) {
            com.google.android.gms.common.internal.zzr zzrVar = zzd;
            if (zzrVar != null && !zze) {
                zzrVar.zzi(getOrStartHandlerThread().getLooper());
            }
            zze = true;
        }
    }

    public boolean bindService(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        return zzc(new com.google.android.gms.common.internal.zzn(componentName, getDefaultBindFlags()), serviceConnection, str, null);
    }

    public void unbindService(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        zza(new com.google.android.gms.common.internal.zzn(componentName, getDefaultBindFlags()), serviceConnection, str);
    }

    protected abstract void zza(com.google.android.gms.common.internal.zzn zznVar, android.content.ServiceConnection serviceConnection, java.lang.String str);

    public final void zzb(java.lang.String str, java.lang.String str2, int i, android.content.ServiceConnection serviceConnection, java.lang.String str3, boolean z) {
        zza(new com.google.android.gms.common.internal.zzn(str, str2, i, z), serviceConnection, str3);
    }

    protected abstract boolean zzc(com.google.android.gms.common.internal.zzn zznVar, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor);

    public boolean bindService(java.lang.String str, android.content.ServiceConnection serviceConnection, java.lang.String str2) {
        return zzc(new com.google.android.gms.common.internal.zzn(str, getDefaultBindFlags(), false), serviceConnection, str2, null);
    }

    public void unbindService(java.lang.String str, android.content.ServiceConnection serviceConnection, java.lang.String str2) {
        zza(new com.google.android.gms.common.internal.zzn(str, getDefaultBindFlags(), false), serviceConnection, str2);
    }
}
