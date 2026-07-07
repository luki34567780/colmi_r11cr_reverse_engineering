package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbe extends com.google.android.gms.common.internal.GmsClient {
    public static final /* synthetic */ int zze = 0;
    private final java.util.Map zzf;
    private final java.util.Map zzg;
    private final java.util.Map zzh;
    private final java.lang.String zzi;
    private boolean zzj;

    public zzbe(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener, java.lang.String str) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzf = new java.util.HashMap();
        this.zzg = new java.util.HashMap();
        this.zzh = new java.util.HashMap();
        this.zzi = str;
    }

    private final boolean zzG(com.google.android.gms.common.Feature feature) {
        com.google.android.gms.common.Feature feature2;
        com.google.android.gms.common.Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature2 = null;
                break;
            }
            feature2 = availableFeatures[i];
            if (feature.getName().equals(feature2.getName())) {
                break;
            }
            i++;
        }
        return feature2 != null && feature2.getVersion() >= feature.getVersion();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof com.google.android.gms.internal.location.zzam ? (com.google.android.gms.internal.location.zzam) queryLocalInterface : new com.google.android.gms.internal.location.zzal(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        synchronized (this) {
            if (isConnected()) {
                try {
                    synchronized (this.zzf) {
                        java.util.Iterator it = this.zzf.values().iterator();
                        while (it.hasNext()) {
                            ((com.google.android.gms.internal.location.zzam) getService()).zzz(com.google.android.gms.internal.location.zzbh.zzb((com.google.android.gms.internal.location.zzbc) it.next(), null));
                        }
                        this.zzf.clear();
                    }
                    synchronized (this.zzg) {
                        java.util.Iterator it2 = this.zzg.values().iterator();
                        while (it2.hasNext()) {
                            ((com.google.android.gms.internal.location.zzam) getService()).zzz(com.google.android.gms.internal.location.zzbh.zza((com.google.android.gms.internal.location.zzay) it2.next(), null));
                        }
                        this.zzg.clear();
                    }
                    synchronized (this.zzh) {
                        java.util.Iterator it3 = this.zzh.values().iterator();
                        while (it3.hasNext()) {
                            ((com.google.android.gms.internal.location.zzam) getService()).zzy(new com.google.android.gms.internal.location.zzj(2, null, (com.google.android.gms.internal.location.zzaz) it3.next(), null));
                        }
                        this.zzh.clear();
                    }
                    if (this.zzj) {
                        zzF(false, new com.google.android.gms.internal.location.zzat(this));
                    }
                } catch (java.lang.Exception e) {
                    android.util.Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        return com.google.android.gms.location.zzy.zzj;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("client_name", this.zzi);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzA(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzam) getService()).zzz(new com.google.android.gms.internal.location.zzbh(2, null, null, null, pendingIntent, zzaiVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzB(com.google.android.gms.internal.location.zzbf zzbfVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        com.google.android.gms.internal.location.zzay zzayVar;
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = listenerHolder.getListenerKey();
        if (listenerKey == null) {
            android.util.Log.e("LocationClientImpl", "requested location updates on dead listener", new java.lang.RuntimeException());
            return;
        }
        getContext();
        synchronized (this) {
            synchronized (this.zzg) {
                com.google.android.gms.internal.location.zzay zzayVar2 = (com.google.android.gms.internal.location.zzay) this.zzg.get(listenerKey);
                if (zzayVar2 == null) {
                    zzayVar2 = new com.google.android.gms.internal.location.zzay(listenerHolder);
                    this.zzg.put(listenerKey, zzayVar2);
                }
                zzayVar = zzayVar2;
            }
            ((com.google.android.gms.internal.location.zzam) getService()).zzz(new com.google.android.gms.internal.location.zzbh(1, zzbfVar, null, zzayVar, null, zzaiVar, listenerKey.toIdString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzC(com.google.android.gms.internal.location.zzbf zzbfVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        com.google.android.gms.internal.location.zzbc zzbcVar;
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = listenerHolder.getListenerKey();
        if (listenerKey == null) {
            android.util.Log.e("LocationClientImpl", "requested location updates on dead listener", new java.lang.RuntimeException());
            return;
        }
        getContext();
        synchronized (this) {
            synchronized (this.zzf) {
                com.google.android.gms.internal.location.zzbc zzbcVar2 = (com.google.android.gms.internal.location.zzbc) this.zzf.get(listenerKey);
                if (zzbcVar2 == null) {
                    zzbcVar2 = new com.google.android.gms.internal.location.zzbc(listenerHolder);
                    this.zzf.put(listenerKey, zzbcVar2);
                }
                zzbcVar = zzbcVar2;
            }
            ((com.google.android.gms.internal.location.zzam) getService()).zzz(new com.google.android.gms.internal.location.zzbh(1, zzbfVar, zzbcVar, null, null, zzaiVar, listenerKey.toIdString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzD(com.google.android.gms.internal.location.zzbf zzbfVar, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        getContext();
        com.google.android.gms.internal.location.zzam zzamVar = (com.google.android.gms.internal.location.zzam) getService();
        int hashCode = pendingIntent.hashCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(25);
        sb.append("PendingIntent@");
        sb.append(hashCode);
        zzamVar.zzz(new com.google.android.gms.internal.location.zzbh(1, zzbfVar, null, null, pendingIntent, zzaiVar, sb.toString()));
    }

    public final void zzE(android.location.Location location, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzy.zzh)) {
            ((com.google.android.gms.internal.location.zzam) getService()).zzv(location, iStatusCallback);
        } else {
            ((com.google.android.gms.internal.location.zzam) getService()).zzu(location);
            iStatusCallback.onResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
        }
    }

    public final void zzF(boolean z, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzy.zzg)) {
            ((com.google.android.gms.internal.location.zzam) getService()).zzx(z, iStatusCallback);
        } else {
            ((com.google.android.gms.internal.location.zzam) getService()).zzw(z);
            iStatusCallback.onResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
        }
        this.zzj = z;
    }

    public final com.google.android.gms.location.LocationAvailability zzp() throws android.os.RemoteException {
        return ((com.google.android.gms.internal.location.zzam) getService()).zzf(getContext().getPackageName());
    }

    public final void zzq(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzg(geofencingRequest, pendingIntent, new com.google.android.gms.internal.location.zzba(resultHolder));
    }

    public final void zzr(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzh(locationSettingsRequest, new com.google.android.gms.internal.location.zzbd(resultHolder), null);
    }

    public final void zzs(com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzam) getService()).zzi(zzaiVar);
    }

    public final void zzt(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest, com.google.android.gms.tasks.CancellationToken cancellationToken, com.google.android.gms.internal.location.zzao zzaoVar) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzy.zze)) {
            final com.google.android.gms.common.internal.ICancelToken zze2 = ((com.google.android.gms.internal.location.zzam) getService()).zze(currentLocationRequest, zzaoVar);
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzar
                    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                    public final void onCanceled() {
                        com.google.android.gms.common.internal.ICancelToken iCancelToken = com.google.android.gms.common.internal.ICancelToken.this;
                        int i = com.google.android.gms.internal.location.zzbe.zze;
                        try {
                            iCancelToken.cancel();
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        com.google.android.gms.tasks.OnTokenCanceledListener onTokenCanceledListener = new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzas
            @Override // com.google.android.gms.tasks.OnTokenCanceledListener
            public final void onCanceled() {
                com.google.android.gms.internal.location.zzbe zzbeVar = com.google.android.gms.internal.location.zzbe.this;
                com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = ((com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.api.internal.ListenerHolder) atomicReference.get())).getListenerKey();
                if (listenerKey != null) {
                    try {
                        zzbeVar.zzy(listenerKey, null);
                    } catch (android.os.RemoteException unused) {
                    }
                }
            }
        };
        com.google.android.gms.common.api.internal.ListenerHolder createListenerHolder = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(new com.google.android.gms.internal.location.zzau(this, zzaoVar, onTokenCanceledListener), com.google.android.gms.internal.location.zzbn.zza(android.os.Looper.getMainLooper()), "LocationCallback");
        atomicReference.set(createListenerHolder);
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(onTokenCanceledListener);
        }
        com.google.android.gms.location.LocationRequest create = com.google.android.gms.location.LocationRequest.create();
        create.setPriority(currentLocationRequest.getPriority());
        create.setInterval(0L);
        create.setFastestInterval(0L);
        create.setExpirationDuration(currentLocationRequest.getDurationMillis());
        com.google.android.gms.internal.location.zzbf zzc = com.google.android.gms.internal.location.zzbf.zzc(null, create);
        zzc.zzj = true;
        zzc.zze(currentLocationRequest.getMaxUpdateAgeMillis());
        zzB(zzc, createListenerHolder, new com.google.android.gms.internal.location.zzav(this, zzaoVar));
    }

    public final void zzu(com.google.android.gms.location.LastLocationRequest lastLocationRequest, com.google.android.gms.internal.location.zzao zzaoVar) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzy.zzf)) {
            ((com.google.android.gms.internal.location.zzam) getService()).zzj(lastLocationRequest, zzaoVar);
        } else {
            zzaoVar.zzb(com.google.android.gms.common.api.Status.RESULT_SUCCESS, ((com.google.android.gms.internal.location.zzam) getService()).zzd());
        }
    }

    public final void zzv(android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        ((com.google.android.gms.internal.location.zzam) getService()).zzl(pendingIntent);
    }

    public final void zzw(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzn(pendingIntent, new com.google.android.gms.internal.location.zzba(resultHolder), getContext().getPackageName());
    }

    public final void zzx(java.util.List list, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkArgument(list != null && list.size() > 0, "geofenceRequestIds can't be null nor empty.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzo((java.lang.String[]) list.toArray(new java.lang.String[0]), new com.google.android.gms.internal.location.zzba(resultHolder), getContext().getPackageName());
    }

    public final void zzy(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.zzg) {
            com.google.android.gms.internal.location.zzay zzayVar = (com.google.android.gms.internal.location.zzay) this.zzg.remove(listenerKey);
            if (zzayVar != null) {
                zzayVar.zzc();
                ((com.google.android.gms.internal.location.zzam) getService()).zzz(com.google.android.gms.internal.location.zzbh.zza(zzayVar, zzaiVar));
            }
        }
    }

    public final void zzz(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.zzf) {
            com.google.android.gms.internal.location.zzbc zzbcVar = (com.google.android.gms.internal.location.zzbc) this.zzf.remove(listenerKey);
            if (zzbcVar != null) {
                zzbcVar.zzc();
                ((com.google.android.gms.internal.location.zzam) getService()).zzz(com.google.android.gms.internal.location.zzbh.zzb(zzbcVar, zzaiVar));
            }
        }
    }
}
