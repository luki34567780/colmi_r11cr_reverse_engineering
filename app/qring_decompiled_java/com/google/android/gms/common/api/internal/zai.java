package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zai {
    public final int zac;

    public zai(int i) {
        this.zac = i;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zah(android.os.RemoteException remoteException) {
        return new com.google.android.gms.common.api.Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void zad(com.google.android.gms.common.api.Status status);

    public abstract void zae(java.lang.Exception exc);

    public abstract void zaf(com.google.android.gms.common.api.internal.zabq<?> zabqVar) throws android.os.DeadObjectException;

    public abstract void zag(com.google.android.gms.common.api.internal.zaad zaadVar, boolean z);
}
