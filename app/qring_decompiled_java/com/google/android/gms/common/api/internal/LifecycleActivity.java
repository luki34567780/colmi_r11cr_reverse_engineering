package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class LifecycleActivity {
    private final java.lang.Object zza;

    public LifecycleActivity(android.app.Activity activity) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
    }

    public final android.app.Activity zza() {
        return (android.app.Activity) this.zza;
    }

    public final androidx.fragment.app.FragmentActivity zzb() {
        return (androidx.fragment.app.FragmentActivity) this.zza;
    }

    public final boolean zzc() {
        return this.zza instanceof android.app.Activity;
    }

    public final boolean zzd() {
        return this.zza instanceof androidx.fragment.app.FragmentActivity;
    }

    public LifecycleActivity(android.content.ContextWrapper contextWrapper) {
        throw new java.lang.UnsupportedOperationException();
    }
}
