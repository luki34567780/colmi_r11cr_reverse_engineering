package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzal extends com.google.android.gms.internal.location.zza implements com.google.android.gms.internal.location.zzam {
    zzal(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final android.location.Location zzd() throws android.os.RemoteException {
        android.os.Parcel zzA = zzA(7, zza());
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.location.zzc.zza(zzA, android.location.Location.CREATOR);
        zzA.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final com.google.android.gms.common.internal.ICancelToken zze(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest, com.google.android.gms.internal.location.zzao zzaoVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, currentLocationRequest);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzaoVar);
        android.os.Parcel zzA = zzA(87, zza);
        com.google.android.gms.common.internal.ICancelToken asInterface = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(zzA.readStrongBinder());
        zzA.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final com.google.android.gms.location.LocationAvailability zzf(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzA = zzA(34, zza);
        com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.location.zzc.zza(zzA, com.google.android.gms.location.LocationAvailability.CREATOR);
        zzA.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzg(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzak zzakVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, geofencingRequest);
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzakVar);
        zzB(57, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzh(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.internal.location.zzaq zzaqVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, locationSettingsRequest);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzaqVar);
        zza.writeString(null);
        zzB(63, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzi(com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzd(zza, zzaiVar);
        zzB(67, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzj(com.google.android.gms.location.LastLocationRequest lastLocationRequest, com.google.android.gms.internal.location.zzao zzaoVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, lastLocationRequest);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzaoVar);
        zzB(82, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzk(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzB(73, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzl(android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        zzB(6, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzm(com.google.android.gms.location.zzbx zzbxVar, com.google.android.gms.internal.location.zzak zzakVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, zzbxVar);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzakVar);
        zzB(74, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzn(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzak zzakVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzakVar);
        zza.writeString(str);
        zzB(2, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzo(java.lang.String[] strArr, com.google.android.gms.internal.location.zzak zzakVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeStringArray(strArr);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzakVar);
        zza.writeString(str);
        zzB(3, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzp(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzB(69, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzq(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, activityTransitionRequest);
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzB(72, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzr(long j, boolean z, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeLong(j);
        com.google.android.gms.internal.location.zzc.zzb(zza, true);
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        zzB(5, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzs(com.google.android.gms.location.zzl zzlVar, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, zzlVar);
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzB(70, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzt(android.app.PendingIntent pendingIntent, com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzc(zza, sleepSegmentRequest);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzB(79, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzu(android.location.Location location) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, location);
        zzB(13, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzv(android.location.Location location, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, location);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzB(85, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzw(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzb(zza, z);
        zzB(12, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzx(boolean z, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzb(zza, z);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzB(84, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzy(com.google.android.gms.internal.location.zzj zzjVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, zzjVar);
        zzB(75, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzz(com.google.android.gms.internal.location.zzbh zzbhVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, zzbhVar);
        zzB(59, zza);
    }
}
