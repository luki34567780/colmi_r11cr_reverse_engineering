package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzz implements com.google.android.gms.location.FusedLocationProviderApi {
    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> flushLocations(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzp(this, googleApiClient));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: Exception -> 0x005c, TRY_ENTER, TryCatch #3 {Exception -> 0x005c, blocks: (B:3:0x0004, B:13:0x0035, B:14:0x003c, B:23:0x0054, B:24:0x005b), top: B:2:0x0004 }] */
    @Override // com.google.android.gms.location.FusedLocationProviderApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.location.Location getLastLocation(com.google.android.gms.common.api.GoogleApiClient r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.location.zzbe r9 = com.google.android.gms.location.LocationServices.zza(r9)
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch: java.lang.Exception -> L5c
            r0.<init>()     // Catch: java.lang.Exception -> L5c
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Exception -> L5c
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.Exception -> L5c
            com.google.android.gms.location.LastLocationRequest$Builder r3 = new com.google.android.gms.location.LastLocationRequest$Builder     // Catch: java.lang.Exception -> L5c
            r3.<init>()     // Catch: java.lang.Exception -> L5c
            com.google.android.gms.location.LastLocationRequest r3 = r3.build()     // Catch: java.lang.Exception -> L5c
            com.google.android.gms.internal.location.zzq r4 = new com.google.android.gms.internal.location.zzq     // Catch: java.lang.Exception -> L5c
            r4.<init>(r8, r0, r1)     // Catch: java.lang.Exception -> L5c
            r9.zzu(r3, r4)     // Catch: java.lang.Exception -> L5c
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L5c
            r3 = 30
            r5 = 0
            long r3 = r9.toNanos(r3)     // Catch: java.lang.Throwable -> L50
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L50
            long r6 = r6 + r3
        L2e:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L46
            r1.await(r3, r9)     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L46
            if (r5 == 0) goto L3c
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L5c
            r9.interrupt()     // Catch: java.lang.Exception -> L5c
        L3c:
            java.lang.Object r9 = r0.get()     // Catch: java.lang.Exception -> L5c
            android.location.Location r9 = (android.location.Location) r9     // Catch: java.lang.Exception -> L5c
            return r9
        L43:
            r9 = move-exception
            r2 = r5
            goto L52
        L46:
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4e
            long r3 = r6 - r3
            r5 = 1
            goto L2e
        L4e:
            r9 = move-exception
            goto L52
        L50:
            r9 = move-exception
            r2 = 0
        L52:
            if (r2 == 0) goto L5b
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L5c
            r0.interrupt()     // Catch: java.lang.Exception -> L5c
        L5b:
            throw r9     // Catch: java.lang.Exception -> L5c
        L5c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzz.getLastLocation(com.google.android.gms.common.api.GoogleApiClient):android.location.Location");
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.location.LocationAvailability getLocationAvailability(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        try {
            return com.google.android.gms.location.LocationServices.zza(googleApiClient).zzp();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzl(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzu(this, googleApiClient, locationRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setMockLocation(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.location.Location location) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzo(this, googleApiClient, location));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setMockMode(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzn(this, googleApiClient, z));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationCallback locationCallback) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzm(this, googleApiClient, locationCallback));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzt(this, googleApiClient, locationRequest, locationCallback, looper));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationListener locationListener) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzv(this, googleApiClient, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(android.os.Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzr(this, googleApiClient, locationRequest, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener, android.os.Looper looper) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzs(this, googleApiClient, locationRequest, locationListener, looper));
    }
}
