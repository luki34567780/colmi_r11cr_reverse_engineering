package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zabq<O extends com.google.android.gms.common.api.Api.ApiOptions> implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.common.api.internal.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.Api.Client zac;
    private final com.google.android.gms.common.api.internal.ApiKey<O> zad;
    private final com.google.android.gms.common.api.internal.zaad zae;
    private final int zah;
    private final com.google.android.gms.common.api.internal.zact zai;
    private boolean zaj;
    private final java.util.Queue<com.google.android.gms.common.api.internal.zai> zab = new java.util.LinkedList();
    private final java.util.Set<com.google.android.gms.common.api.internal.zal> zaf = new java.util.HashSet();
    private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>, com.google.android.gms.common.api.internal.zaci> zag = new java.util.HashMap();
    private final java.util.List<com.google.android.gms.common.api.internal.zabs> zak = new java.util.ArrayList();
    private com.google.android.gms.common.ConnectionResult zal = null;
    private int zam = 0;

    public zabq(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.api.GoogleApi<O> googleApi) {
        this.zaa = googleApiManager;
        com.google.android.gms.common.api.Api.Client zab = googleApi.zab(googleApiManager.zat.getLooper(), this);
        this.zac = zab;
        this.zad = googleApi.getApiKey();
        this.zae = new com.google.android.gms.common.api.internal.zaad();
        this.zah = googleApi.zaa();
        if (zab.requiresSignIn()) {
            this.zai = googleApi.zac(googleApiManager.zak, googleApiManager.zat);
        } else {
            this.zai = null;
        }
    }

    private final com.google.android.gms.common.Feature zaB(com.google.android.gms.common.Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            com.google.android.gms.common.Feature[] availableFeatures = this.zac.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new com.google.android.gms.common.Feature[0];
            }
            androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(availableFeatures.length);
            for (com.google.android.gms.common.Feature feature : availableFeatures) {
                arrayMap.put(feature.getName(), java.lang.Long.valueOf(feature.getVersion()));
            }
            for (com.google.android.gms.common.Feature feature2 : featureArr) {
                java.lang.Long l = (java.lang.Long) arrayMap.get(feature2.getName());
                if (l == null || l.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void zaC(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.util.Iterator<com.google.android.gms.common.api.internal.zal> it = this.zaf.iterator();
        while (it.hasNext()) {
            it.next().zac(this.zad, connectionResult, com.google.android.gms.common.internal.Objects.equal(connectionResult, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS) ? this.zac.getEndpointPackageName() : null);
        }
        this.zaf.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaD(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        zaE(status, null, false);
    }

    private final void zaE(com.google.android.gms.common.api.Status status, java.lang.Exception exc, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        if ((status == null) == (exc == null)) {
            throw new java.lang.IllegalArgumentException("Status XOR exception should be null");
        }
        java.util.Iterator<com.google.android.gms.common.api.internal.zai> it = this.zab.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.internal.zai next = it.next();
            if (!z || next.zac == 2) {
                if (status != null) {
                    next.zad(status);
                } else {
                    next.zae(exc);
                }
                it.remove();
            }
        }
    }

    private final void zaF() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zab);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.common.api.internal.zai zaiVar = (com.google.android.gms.common.api.internal.zai) arrayList.get(i);
            if (!this.zac.isConnected()) {
                return;
            }
            if (zaL(zaiVar)) {
                this.zab.remove(zaiVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaG() {
        zan();
        zaC(com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
        zaK();
        java.util.Iterator<com.google.android.gms.common.api.internal.zaci> it = this.zag.values().iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.internal.zaci next = it.next();
            if (zaB(next.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    next.zaa.registerListener(this.zac, new com.google.android.gms.tasks.TaskCompletionSource<>());
                } catch (android.os.DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (android.os.RemoteException unused2) {
                    it.remove();
                }
            }
        }
        zaF();
        zaI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaH(int i) {
        zan();
        this.zaj = true;
        this.zae.zae(i, this.zac.getLastDisconnectMessage());
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zat.sendMessageDelayed(android.os.Message.obtain(googleApiManager.zat, 9, this.zad), this.zaa.zae);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zat.sendMessageDelayed(android.os.Message.obtain(googleApiManager2.zat, 11, this.zad), this.zaa.zaf);
        this.zaa.zam.zac();
        java.util.Iterator<com.google.android.gms.common.api.internal.zaci> it = this.zag.values().iterator();
        while (it.hasNext()) {
            it.next().zac.run();
        }
    }

    private final void zaI() {
        this.zaa.zat.removeMessages(12, this.zad);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zat.sendMessageDelayed(googleApiManager.zat.obtainMessage(12, this.zad), this.zaa.zag);
    }

    private final void zaJ(com.google.android.gms.common.api.internal.zai zaiVar) {
        zaiVar.zag(this.zae, zaz());
        try {
            zaiVar.zaf(this);
        } catch (android.os.DeadObjectException unused) {
            onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void zaK() {
        if (this.zaj) {
            this.zaa.zat.removeMessages(11, this.zad);
            this.zaa.zat.removeMessages(9, this.zad);
            this.zaj = false;
        }
    }

    private final boolean zaL(com.google.android.gms.common.api.internal.zai zaiVar) {
        if (!(zaiVar instanceof com.google.android.gms.common.api.internal.zac)) {
            zaJ(zaiVar);
            return true;
        }
        com.google.android.gms.common.api.internal.zac zacVar = (com.google.android.gms.common.api.internal.zac) zaiVar;
        com.google.android.gms.common.Feature zaB = zaB(zacVar.zab(this));
        if (zaB == null) {
            zaJ(zaiVar);
            return true;
        }
        java.lang.String name = this.zac.getClass().getName();
        java.lang.String name2 = zaB.getName();
        long version = zaB.getVersion();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 77 + java.lang.String.valueOf(name2).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(name2);
        sb.append(", ");
        sb.append(version);
        sb.append(").");
        android.util.Log.w("GoogleApiManager", sb.toString());
        if (!this.zaa.zau || !zacVar.zaa(this)) {
            zacVar.zae(new com.google.android.gms.common.api.UnsupportedApiCallException(zaB));
            return true;
        }
        com.google.android.gms.common.api.internal.zabs zabsVar = new com.google.android.gms.common.api.internal.zabs(this.zad, zaB, null);
        int indexOf = this.zak.indexOf(zabsVar);
        if (indexOf >= 0) {
            com.google.android.gms.common.api.internal.zabs zabsVar2 = this.zak.get(indexOf);
            this.zaa.zat.removeMessages(15, zabsVar2);
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zat.sendMessageDelayed(android.os.Message.obtain(googleApiManager.zat, 15, zabsVar2), this.zaa.zae);
            return false;
        }
        this.zak.add(zabsVar);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zat.sendMessageDelayed(android.os.Message.obtain(googleApiManager2.zat, 15, zabsVar), this.zaa.zae);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager3 = this.zaa;
        googleApiManager3.zat.sendMessageDelayed(android.os.Message.obtain(googleApiManager3.zat, 16, zabsVar), this.zaa.zaf);
        com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(2, null);
        if (zaM(connectionResult)) {
            return false;
        }
        this.zaa.zaG(connectionResult, this.zah);
        return false;
    }

    private final boolean zaM(com.google.android.gms.common.ConnectionResult connectionResult) {
        synchronized (com.google.android.gms.common.api.internal.GoogleApiManager.zac) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            if (googleApiManager.zaq == null || !googleApiManager.zar.contains(this.zad)) {
                return false;
            }
            this.zaa.zaq.zah(connectionResult, this.zah);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaN(boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        if (!this.zac.isConnected() || this.zag.size() != 0) {
            return false;
        }
        if (!this.zae.zag()) {
            this.zac.disconnect("Timing out service connection.");
            return true;
        }
        if (z) {
            zaI();
        }
        return false;
    }

    static /* bridge */ /* synthetic */ void zal(com.google.android.gms.common.api.internal.zabq zabqVar, com.google.android.gms.common.api.internal.zabs zabsVar) {
        if (zabqVar.zak.contains(zabsVar) && !zabqVar.zaj) {
            if (zabqVar.zac.isConnected()) {
                zabqVar.zaF();
            } else {
                zabqVar.zao();
            }
        }
    }

    static /* bridge */ /* synthetic */ void zam(com.google.android.gms.common.api.internal.zabq zabqVar, com.google.android.gms.common.api.internal.zabs zabsVar) {
        com.google.android.gms.common.Feature feature;
        com.google.android.gms.common.Feature[] zab;
        if (zabqVar.zak.remove(zabsVar)) {
            zabqVar.zaa.zat.removeMessages(15, zabsVar);
            zabqVar.zaa.zat.removeMessages(16, zabsVar);
            feature = zabsVar.zab;
            java.util.ArrayList arrayList = new java.util.ArrayList(zabqVar.zab.size());
            for (com.google.android.gms.common.api.internal.zai zaiVar : zabqVar.zab) {
                if ((zaiVar instanceof com.google.android.gms.common.api.internal.zac) && (zab = ((com.google.android.gms.common.api.internal.zac) zaiVar).zab(zabqVar)) != null && com.google.android.gms.common.util.ArrayUtils.contains(zab, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                com.google.android.gms.common.api.internal.zai zaiVar2 = (com.google.android.gms.common.api.internal.zai) arrayList.get(i);
                zabqVar.zab.remove(zaiVar2);
                zaiVar2.zae(new com.google.android.gms.common.api.UnsupportedApiCallException(feature));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        if (android.os.Looper.myLooper() == this.zaa.zat.getLooper()) {
            zaG();
        } else {
            this.zaa.zat.post(new com.google.android.gms.common.api.internal.zabm(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        if (android.os.Looper.myLooper() == this.zaa.zat.getLooper()) {
            zaH(i);
        } else {
            this.zaa.zat.post(new com.google.android.gms.common.api.internal.zabn(this, i));
        }
    }

    public final boolean zaA() {
        return zaN(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api<?> api, boolean z) {
        throw null;
    }

    public final int zab() {
        return this.zah;
    }

    final int zac() {
        return this.zam;
    }

    public final com.google.android.gms.common.ConnectionResult zad() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        return this.zal;
    }

    public final com.google.android.gms.common.api.Api.Client zaf() {
        return this.zac;
    }

    public final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>, com.google.android.gms.common.api.internal.zaci> zah() {
        return this.zag;
    }

    public final void zan() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        this.zal = null;
    }

    public final void zao() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        if (this.zac.isConnected() || this.zac.isConnecting()) {
            return;
        }
        try {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            int zab = googleApiManager.zam.zab(googleApiManager.zak, this.zac);
            if (zab == 0) {
                com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
                com.google.android.gms.common.api.Api.Client client = this.zac;
                com.google.android.gms.common.api.internal.zabu zabuVar = new com.google.android.gms.common.api.internal.zabu(googleApiManager2, client, this.zad);
                if (client.requiresSignIn()) {
                    ((com.google.android.gms.common.api.internal.zact) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zai)).zae(zabuVar);
                }
                try {
                    this.zac.connect(zabuVar);
                    return;
                } catch (java.lang.SecurityException e) {
                    zar(new com.google.android.gms.common.ConnectionResult(10), e);
                    return;
                }
            }
            com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(zab, null);
            java.lang.String name = this.zac.getClass().getName();
            java.lang.String obj = connectionResult.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 35 + obj.length());
            sb.append("The service for ");
            sb.append(name);
            sb.append(" is not available: ");
            sb.append(obj);
            android.util.Log.w("GoogleApiManager", sb.toString());
            zar(connectionResult, null);
        } catch (java.lang.IllegalStateException e2) {
            zar(new com.google.android.gms.common.ConnectionResult(10), e2);
        }
    }

    public final void zap(com.google.android.gms.common.api.internal.zai zaiVar) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        if (this.zac.isConnected()) {
            if (zaL(zaiVar)) {
                zaI();
                return;
            } else {
                this.zab.add(zaiVar);
                return;
            }
        }
        this.zab.add(zaiVar);
        com.google.android.gms.common.ConnectionResult connectionResult = this.zal;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zao();
        } else {
            zar(this.zal, null);
        }
    }

    final void zaq() {
        this.zam++;
    }

    public final void zar(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.Exception exc) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        com.google.android.gms.common.api.internal.zact zactVar = this.zai;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        this.zaa.zam.zac();
        zaC(connectionResult);
        if ((this.zac instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            this.zaa.zah = true;
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zat.sendMessageDelayed(googleApiManager.zat.obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            zaD(com.google.android.gms.common.api.internal.GoogleApiManager.zab);
            return;
        }
        if (this.zab.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        if (exc != null) {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
            zaE(null, exc, false);
            return;
        }
        if (!this.zaa.zau) {
            zaD(com.google.android.gms.common.api.internal.GoogleApiManager.zaH(this.zad, connectionResult));
            return;
        }
        zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaH(this.zad, connectionResult), null, true);
        if (this.zab.isEmpty() || zaM(connectionResult) || this.zaa.zaG(connectionResult, this.zah)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.zaj = true;
        }
        if (!this.zaj) {
            zaD(com.google.android.gms.common.api.internal.GoogleApiManager.zaH(this.zad, connectionResult));
        } else {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
            googleApiManager2.zat.sendMessageDelayed(android.os.Message.obtain(googleApiManager2.zat, 9, this.zad), this.zaa.zae);
        }
    }

    public final void zas(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        com.google.android.gms.common.api.Api.Client client = this.zac;
        java.lang.String name = client.getClass().getName();
        java.lang.String valueOf = java.lang.String.valueOf(connectionResult);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 25 + java.lang.String.valueOf(valueOf).length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        client.disconnect(sb.toString());
        zar(connectionResult, null);
    }

    public final void zat(com.google.android.gms.common.api.internal.zal zalVar) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        this.zaf.add(zalVar);
    }

    public final void zau() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        if (this.zaj) {
            zao();
        }
    }

    public final void zav() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        zaD(com.google.android.gms.common.api.internal.GoogleApiManager.zaa);
        this.zae.zaf();
        for (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey : (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[0])) {
            zap(new com.google.android.gms.common.api.internal.zah(listenerKey, new com.google.android.gms.tasks.TaskCompletionSource()));
        }
        zaC(new com.google.android.gms.common.ConnectionResult(4));
        if (this.zac.isConnected()) {
            this.zac.onUserSignOut(new com.google.android.gms.common.api.internal.zabp(this));
        }
    }

    public final void zaw() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zat);
        if (this.zaj) {
            zaK();
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            zaD(googleApiManager.zal.isGooglePlayServicesAvailable(googleApiManager.zak) == 18 ? new com.google.android.gms.common.api.Status(21, "Connection timed out waiting for Google Play services update to complete.") : new com.google.android.gms.common.api.Status(22, "API failed to connect while resuming due to an unknown error."));
            this.zac.disconnect("Timing out connection while resuming.");
        }
    }

    final boolean zay() {
        return this.zac.isConnected();
    }

    public final boolean zaz() {
        return this.zac.requiresSignIn();
    }
}
