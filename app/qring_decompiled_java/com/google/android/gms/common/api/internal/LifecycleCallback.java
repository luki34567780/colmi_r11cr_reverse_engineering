package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class LifecycleCallback {
    protected final com.google.android.gms.common.api.internal.LifecycleFragment mLifecycleFragment;

    protected LifecycleCallback(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    private static com.google.android.gms.common.api.internal.LifecycleFragment getChimeraLifecycleFragmentImpl(com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity) {
        throw new java.lang.IllegalStateException("Method not available in SDK.");
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.app.Activity activity) {
        return getFragment(new com.google.android.gms.common.api.internal.LifecycleActivity(activity));
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    public android.app.Activity getActivity() {
        android.app.Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    public void onActivityResult(int i, int i2, android.content.Intent intent) {
    }

    public void onCreate(android.os.Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.content.ContextWrapper contextWrapper) {
        throw new java.lang.UnsupportedOperationException();
    }

    protected static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zzd()) {
            return com.google.android.gms.common.api.internal.zzd.zzc(lifecycleActivity.zzb());
        }
        if (lifecycleActivity.zzc()) {
            return com.google.android.gms.common.api.internal.zzb.zzc(lifecycleActivity.zza());
        }
        throw new java.lang.IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
