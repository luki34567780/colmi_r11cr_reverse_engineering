package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzv extends com.google.android.gms.common.api.internal.LifecycleCallback {
    private final java.util.List<java.lang.ref.WeakReference<com.google.android.gms.tasks.zzq<?>>> zza;

    private zzv(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zza = new java.util.ArrayList();
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    public static com.google.android.gms.tasks.zzv zza(android.app.Activity activity) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
        com.google.android.gms.tasks.zzv zzvVar = (com.google.android.gms.tasks.zzv) fragment.getCallbackOrNull("TaskOnStopCallback", com.google.android.gms.tasks.zzv.class);
        return zzvVar == null ? new com.google.android.gms.tasks.zzv(fragment) : zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.zza) {
            java.util.Iterator<java.lang.ref.WeakReference<com.google.android.gms.tasks.zzq<?>>> it = this.zza.iterator();
            while (it.hasNext()) {
                com.google.android.gms.tasks.zzq<?> zzqVar = it.next().get();
                if (zzqVar != null) {
                    zzqVar.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final <T> void zzb(com.google.android.gms.tasks.zzq<T> zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new java.lang.ref.WeakReference<>(zzqVar));
        }
    }
}
