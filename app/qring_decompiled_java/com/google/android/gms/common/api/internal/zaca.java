package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public interface zaca {
    com.google.android.gms.common.ConnectionResult zab();

    com.google.android.gms.common.ConnectionResult zac(long j, java.util.concurrent.TimeUnit timeUnit);

    com.google.android.gms.common.ConnectionResult zad(com.google.android.gms.common.api.Api<?> api);

    <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T zae(T t);

    <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T zaf(T t);

    void zaq();

    void zar();

    void zas(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    void zat();

    void zau();

    boolean zaw();

    boolean zax();

    boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener);
}
