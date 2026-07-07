package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zac implements java.util.Comparator<com.google.android.gms.common.api.Scope> {
    zac() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope scope2) {
        return scope.getScopeUri().compareTo(scope2.getScopeUri());
    }
}
