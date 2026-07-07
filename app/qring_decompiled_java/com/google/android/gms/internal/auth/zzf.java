package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public interface zzf extends android.os.IInterface {
    android.os.Bundle zzd(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    @javax.annotation.Nullable
    android.os.Bundle zze(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    @javax.annotation.Nullable
    android.os.Bundle zzf(android.accounts.Account account) throws android.os.RemoteException;

    android.os.Bundle zzg(java.lang.String str) throws android.os.RemoteException;

    com.google.android.gms.auth.AccountChangeEventsResponse zzh(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest) throws android.os.RemoteException;
}
