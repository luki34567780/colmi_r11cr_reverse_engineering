package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class FusedLocationProviderClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public static final java.lang.String KEY_MOCK_LOCATION = "mockLocation";
    public static final java.lang.String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    public FusedLocationProviderClient(android.app.Activity activity) {
        super(activity, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    private final com.google.android.gms.tasks.Task zza(final com.google.android.gms.internal.location.zzbf zzbfVar, final com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        final com.google.android.gms.location.zzaq zzaqVar = new com.google.android.gms.location.zzaq(this, listenerHolder);
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzan
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = com.google.android.gms.location.FusedLocationProviderClient.this;
                com.google.android.gms.location.zzaw zzawVar = zzaqVar;
                com.google.android.gms.common.api.internal.ListenerHolder listenerHolder2 = listenerHolder;
                ((com.google.android.gms.internal.location.zzbe) obj).zzB(zzbfVar, listenerHolder2, new com.google.android.gms.location.zzau((com.google.android.gms.tasks.TaskCompletionSource) obj2, new com.google.android.gms.location.zzaf(fusedLocationProviderClient, zzawVar, listenerHolder2), null));
            }
        }).unregister(zzaqVar).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> flushLocations() {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzad
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.location.zzbe) obj).zzs(new com.google.android.gms.location.zzav((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2422).build());
    }

    public com.google.android.gms.tasks.Task<android.location.Location> getCurrentLocation(int i, final com.google.android.gms.tasks.CancellationToken cancellationToken) {
        com.google.android.gms.location.LocationRequest create = com.google.android.gms.location.LocationRequest.create();
        create.setPriority(i);
        create.setInterval(0L);
        create.setFastestInterval(0L);
        create.setExpirationDuration(30000L);
        final com.google.android.gms.internal.location.zzbf zzc = com.google.android.gms.internal.location.zzbf.zzc(null, create);
        zzc.zzd(true);
        zzc.zze(30000L);
        if (cancellationToken != null) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(true ^ cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        com.google.android.gms.tasks.Task doRead = doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzaa
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = com.google.android.gms.location.FusedLocationProviderClient.this;
                com.google.android.gms.internal.location.zzbf zzbfVar = zzc;
                com.google.android.gms.tasks.CancellationToken cancellationToken2 = cancellationToken;
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
                com.google.android.gms.location.CurrentLocationRequest.Builder builder = new com.google.android.gms.location.CurrentLocationRequest.Builder();
                builder.setPriority(zzbfVar.zzb().getPriority());
                builder.setDurationMillis(zzbfVar.zzb().getExpirationTime() != Long.MAX_VALUE ? zzbfVar.zzb().getExpirationTime() - android.os.SystemClock.elapsedRealtime() : Long.MAX_VALUE);
                builder.setMaxUpdateAgeMillis(zzbfVar.zza());
                builder.zza(zzbfVar.zzg());
                java.util.List<com.google.android.gms.common.internal.ClientIdentity> zzf = zzbfVar.zzf();
                android.os.WorkSource workSource = new android.os.WorkSource();
                for (com.google.android.gms.common.internal.ClientIdentity clientIdentity : zzf) {
                    com.google.android.gms.common.util.WorkSourceUtil.add(workSource, clientIdentity.uid, clientIdentity.packageName);
                }
                builder.zzb(workSource);
                zzbeVar.zzt(builder.build(), cancellationToken2, new com.google.android.gms.location.zzap(fusedLocationProviderClient, taskCompletionSource));
            }
        }).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return doRead;
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationToken);
        doRead.continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.location.zzag
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = com.google.android.gms.tasks.TaskCompletionSource.this;
                java.lang.String str = com.google.android.gms.location.FusedLocationProviderClient.KEY_MOCK_LOCATION;
                if (task.isSuccessful()) {
                    taskCompletionSource2.trySetResult((android.location.Location) task.getResult());
                    return null;
                }
                taskCompletionSource2.trySetException((java.lang.Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(task.getException()));
                return null;
            }
        });
        return taskCompletionSource.getTask();
    }

    public com.google.android.gms.tasks.Task<android.location.Location> getLastLocation() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzak
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.location.zzbe) obj).zzu(new com.google.android.gms.location.LastLocationRequest.Builder().build(), new com.google.android.gms.location.zzat(com.google.android.gms.location.FusedLocationProviderClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2414).build());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.location.LocationAvailability> getLocationAvailability() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzae
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.String str = com.google.android.gms.location.FusedLocationProviderClient.KEY_MOCK_LOCATION;
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.internal.location.zzbe) obj).zzp());
            }
        }).setMethodKey(2416).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.location.zzbe) obj).zzA(pendingIntent, new com.google.android.gms.location.zzav((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2418).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, final android.app.PendingIntent pendingIntent) {
        final com.google.android.gms.internal.location.zzbf zzc = com.google.android.gms.internal.location.zzbf.zzc(null, locationRequest);
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzac
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.location.zzbe) obj).zzD(com.google.android.gms.internal.location.zzbf.this, pendingIntent, new com.google.android.gms.location.zzav((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2417).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setMockLocation(final android.location.Location location) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(location != null);
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzal
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzE(location, new com.google.android.gms.location.zzas(com.google.android.gms.location.FusedLocationProviderClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2421).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setMockMode(final boolean z) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzab
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzF(z, new com.google.android.gms.location.zzas(com.google.android.gms.location.FusedLocationProviderClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2420).build());
    }

    public FusedLocationProviderClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<android.location.Location> getLastLocation(final com.google.android.gms.location.LastLocationRequest lastLocationRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzao
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzu(lastLocationRequest, new com.google.android.gms.location.zzat(com.google.android.gms.location.FusedLocationProviderClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2414).setFeatures(com.google.android.gms.location.zzy.zzf).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(com.google.android.gms.location.LocationCallback locationCallback) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(locationCallback, "LocationCallback"), 2418).continueWith(new java.util.concurrent.Executor() { // from class: com.google.android.gms.location.zzaj
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                runnable.run();
            }
        }, new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.location.zzai
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                java.lang.String str = com.google.android.gms.location.FusedLocationProviderClient.KEY_MOCK_LOCATION;
                return null;
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper) {
        com.google.android.gms.internal.location.zzbf zzc = com.google.android.gms.internal.location.zzbf.zzc(null, locationRequest);
        if (looper != null || (looper = android.os.Looper.myLooper()) != null) {
            return zza(zzc, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"));
        }
        throw new java.lang.IllegalStateException();
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, java.util.concurrent.Executor executor, com.google.android.gms.location.LocationCallback locationCallback) {
        return zza(com.google.android.gms.internal.location.zzbf.zzc(null, locationRequest), com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationCallback, executor, "LocationCallback"));
    }

    public com.google.android.gms.tasks.Task<android.location.Location> getCurrentLocation(final com.google.android.gms.location.CurrentLocationRequest currentLocationRequest, final com.google.android.gms.tasks.CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        com.google.android.gms.tasks.Task doRead = doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzam
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzt(currentLocationRequest, cancellationToken, new com.google.android.gms.location.zzat(com.google.android.gms.location.FusedLocationProviderClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.location.zzy.zze).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return doRead;
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationToken);
        doRead.continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.location.zzah
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = com.google.android.gms.tasks.TaskCompletionSource.this;
                java.lang.String str = com.google.android.gms.location.FusedLocationProviderClient.KEY_MOCK_LOCATION;
                if (task.isSuccessful()) {
                    taskCompletionSource2.trySetResult((android.location.Location) task.getResult());
                    return null;
                }
                taskCompletionSource2.trySetException((java.lang.Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(task.getException()));
                return null;
            }
        });
        return taskCompletionSource.getTask();
    }
}
