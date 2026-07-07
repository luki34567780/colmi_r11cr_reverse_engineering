package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface zzam extends android.os.IInterface {
    @java.lang.Deprecated
    android.location.Location zzd() throws android.os.RemoteException;

    com.google.android.gms.common.internal.ICancelToken zze(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest, com.google.android.gms.internal.location.zzao zzaoVar) throws android.os.RemoteException;

    com.google.android.gms.location.LocationAvailability zzf(java.lang.String str) throws android.os.RemoteException;

    void zzg(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzak zzakVar) throws android.os.RemoteException;

    void zzh(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.internal.location.zzaq zzaqVar, java.lang.String str) throws android.os.RemoteException;

    void zzi(com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException;

    void zzj(com.google.android.gms.location.LastLocationRequest lastLocationRequest, com.google.android.gms.internal.location.zzao zzaoVar) throws android.os.RemoteException;

    void zzk(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    void zzl(android.app.PendingIntent pendingIntent) throws android.os.RemoteException;

    void zzm(com.google.android.gms.location.zzbx zzbxVar, com.google.android.gms.internal.location.zzak zzakVar) throws android.os.RemoteException;

    void zzn(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzak zzakVar, java.lang.String str) throws android.os.RemoteException;

    void zzo(java.lang.String[] strArr, com.google.android.gms.internal.location.zzak zzakVar, java.lang.String str) throws android.os.RemoteException;

    void zzp(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    void zzq(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    void zzr(long j, boolean z, android.app.PendingIntent pendingIntent) throws android.os.RemoteException;

    void zzs(com.google.android.gms.location.zzl zzlVar, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    void zzt(android.app.PendingIntent pendingIntent, com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    @java.lang.Deprecated
    void zzu(android.location.Location location) throws android.os.RemoteException;

    void zzv(android.location.Location location, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    @java.lang.Deprecated
    void zzw(boolean z) throws android.os.RemoteException;

    void zzx(boolean z, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    void zzy(com.google.android.gms.internal.location.zzj zzjVar) throws android.os.RemoteException;

    void zzz(com.google.android.gms.internal.location.zzbh zzbhVar) throws android.os.RemoteException;
}
