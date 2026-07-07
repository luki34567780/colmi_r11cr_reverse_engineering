package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zza implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.common.api.internal.zzb zzc;

    zza(com.google.android.gms.common.api.internal.zzb zzbVar, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback, java.lang.String str) {
        this.zzc = zzbVar;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        com.google.android.gms.common.api.internal.zzb zzbVar = this.zzc;
        i = zzbVar.zzc;
        if (i > 0) {
            com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback = this.zza;
            bundle = zzbVar.zzd;
            if (bundle != null) {
                bundle3 = zzbVar.zzd;
                bundle2 = bundle3.getBundle(this.zzb);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i2 = this.zzc.zzc;
        if (i2 >= 2) {
            this.zza.onStart();
        }
        i3 = this.zzc.zzc;
        if (i3 >= 3) {
            this.zza.onResume();
        }
        i4 = this.zzc.zzc;
        if (i4 >= 4) {
            this.zza.onStop();
        }
        i5 = this.zzc.zzc;
        if (i5 >= 5) {
            this.zza.onDestroy();
        }
    }
}
