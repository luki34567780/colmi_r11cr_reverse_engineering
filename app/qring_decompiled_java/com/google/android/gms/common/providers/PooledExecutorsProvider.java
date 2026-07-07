package com.google.android.gms.common.providers;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class PooledExecutorsProvider {
    private static com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory zza;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface PooledExecutorFactory {
        @java.lang.Deprecated
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    @java.lang.Deprecated
    public static synchronized com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory getInstance() {
        com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory pooledExecutorFactory;
        synchronized (com.google.android.gms.common.providers.PooledExecutorsProvider.class) {
            if (zza == null) {
                zza = new com.google.android.gms.common.providers.zza();
            }
            pooledExecutorFactory = zza;
        }
        return pooledExecutorFactory;
    }
}
