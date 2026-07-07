package com.google.android.gms.dynamite;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzb {
    private static volatile java.lang.ClassLoader zza;
    private static volatile java.lang.Thread zzb;

    public static synchronized java.lang.ClassLoader zza() {
        java.lang.ClassLoader classLoader;
        synchronized (com.google.android.gms.dynamite.zzb.class) {
            if (zza == null) {
                zza = zzb();
            }
            classLoader = zza;
        }
        return classLoader;
    }

    private static synchronized java.lang.ClassLoader zzb() {
        synchronized (com.google.android.gms.dynamite.zzb.class) {
            java.lang.ClassLoader classLoader = null;
            if (zzb == null) {
                zzb = zzc();
                if (zzb == null) {
                    return null;
                }
            }
            synchronized (zzb) {
                try {
                    classLoader = zzb.getContextClassLoader();
                } catch (java.lang.SecurityException e) {
                    java.lang.String valueOf = java.lang.String.valueOf(e.getMessage());
                    android.util.Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new java.lang.String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    private static synchronized java.lang.Thread zzc() {
        java.lang.SecurityException e;
        java.lang.Thread thread;
        java.lang.Thread thread2;
        java.lang.ThreadGroup threadGroup;
        synchronized (com.google.android.gms.dynamite.zzb.class) {
            java.lang.ThreadGroup threadGroup2 = android.os.Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (java.lang.Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    java.lang.ThreadGroup[] threadGroupArr = new java.lang.ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new java.lang.ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    java.lang.Thread[] threadArr = new java.lang.Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            thread2 = null;
                            break;
                        }
                        thread2 = threadArr[i];
                        if ("GmsDynamite".equals(thread2.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (java.lang.SecurityException e2) {
                    e = e2;
                    thread = null;
                }
                if (thread2 == null) {
                    try {
                        thread = new com.google.android.gms.dynamite.zza(threadGroup, "GmsDynamite");
                        try {
                            thread.setContextClassLoader(null);
                            thread.start();
                        } catch (java.lang.SecurityException e3) {
                            e = e3;
                            java.lang.String valueOf = java.lang.String.valueOf(e.getMessage());
                            android.util.Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new java.lang.String("Failed to enumerate thread/threadgroup "));
                            thread2 = thread;
                            return thread2;
                        }
                    } catch (java.lang.SecurityException e4) {
                        e = e4;
                        thread = thread2;
                    }
                    thread2 = thread;
                }
            }
            return thread2;
        }
    }
}
