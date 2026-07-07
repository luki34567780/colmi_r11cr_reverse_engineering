package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class IndoorBuilding {
    private final com.google.android.gms.internal.maps.zzr zza;
    private final com.google.android.gms.maps.model.zze zzb;

    public IndoorBuilding(com.google.android.gms.internal.maps.zzr zzrVar) {
        com.google.android.gms.maps.model.zze zzeVar = com.google.android.gms.maps.model.zze.zza;
        this.zza = (com.google.android.gms.internal.maps.zzr) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar, "delegate");
        this.zzb = (com.google.android.gms.maps.model.zze) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeVar, "shim");
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.maps.model.IndoorBuilding)) {
            return false;
        }
        try {
            return this.zza.zzh(((com.google.android.gms.maps.model.IndoorBuilding) obj).zza);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public int getActiveLevelIndex() {
        try {
            return this.zza.zzd();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public int getDefaultLevelIndex() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public java.util.List<com.google.android.gms.maps.model.IndoorLevel> getLevels() {
        try {
            java.util.List zzg = this.zza.zzg();
            java.util.ArrayList arrayList = new java.util.ArrayList(zzg.size());
            java.util.Iterator it = zzg.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.google.android.gms.maps.model.IndoorLevel(com.google.android.gms.internal.maps.zzt.zzb((android.os.IBinder) it.next())));
            }
            return arrayList;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzf();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isUnderground() {
        try {
            return this.zza.zzi();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
