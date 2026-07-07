package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzu implements java.util.concurrent.Executor {
    private final android.os.Handler zza = new com.google.android.gms.internal.tasks.zza(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.post(runnable);
    }
}
