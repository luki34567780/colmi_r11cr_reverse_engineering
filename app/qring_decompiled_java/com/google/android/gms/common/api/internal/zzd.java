package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzd extends androidx.fragment.app.Fragment implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static final java.util.WeakHashMap<androidx.fragment.app.FragmentActivity, java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zzd>> zza = new java.util.WeakHashMap<>();
    private final java.util.Map<java.lang.String, com.google.android.gms.common.api.internal.LifecycleCallback> zzb = java.util.Collections.synchronizedMap(new androidx.collection.ArrayMap());
    private int zzc = 0;
    private android.os.Bundle zzd;

    public static com.google.android.gms.common.api.internal.zzd zzc(androidx.fragment.app.FragmentActivity fragmentActivity) {
        com.google.android.gms.common.api.internal.zzd zzdVar;
        java.util.WeakHashMap<androidx.fragment.app.FragmentActivity, java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zzd>> weakHashMap = zza;
        java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zzd> weakReference = weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzdVar = weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            com.google.android.gms.common.api.internal.zzd zzdVar2 = (com.google.android.gms.common.api.internal.zzd) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new com.google.android.gms.common.api.internal.zzd();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add(zzdVar2, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(fragmentActivity, new java.lang.ref.WeakReference<>(zzdVar2));
            return zzdVar2;
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        if (this.zzb.containsKey(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.zzb.put(str, lifecycleCallback);
        if (this.zzc > 0) {
            new com.google.android.gms.internal.common.zzi(android.os.Looper.getMainLooper()).post(new com.google.android.gms.common.api.internal.zzc(this, lifecycleCallback, str));
        }
    }

    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            it.next().dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String str, java.lang.Class<T> cls) {
        return cls.cast(this.zzb.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final /* synthetic */ android.app.Activity getLifecycleActivity() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        return this.zzc > 0;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        return this.zzc >= 2;
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zzc = 1;
        this.zzd = bundle;
        for (java.util.Map.Entry<java.lang.String, com.google.android.gms.common.api.internal.LifecycleCallback> entry : this.zzb.entrySet()) {
            entry.getValue().onCreate(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.zzc = 5;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.zzc = 3;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, com.google.android.gms.common.api.internal.LifecycleCallback> entry : this.zzb.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            entry.getValue().onSaveInstanceState(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    public final void onStart() {
        super.onStart();
        this.zzc = 2;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.zzc = 4;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            it.next().onStop();
        }
    }
}
