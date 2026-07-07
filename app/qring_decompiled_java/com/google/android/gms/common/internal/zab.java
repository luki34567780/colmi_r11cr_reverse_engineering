package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zab {
    public final java.util.Set<com.google.android.gms.common.api.Scope> zaa;

    public zab(java.util.Set<com.google.android.gms.common.api.Scope> set) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(set);
        this.zaa = java.util.Collections.unmodifiableSet(set);
    }
}
