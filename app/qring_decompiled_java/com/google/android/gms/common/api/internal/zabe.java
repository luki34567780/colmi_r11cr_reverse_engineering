package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zabe extends com.google.android.gms.common.api.GoogleApiClient implements com.google.android.gms.common.api.internal.zabz {
    com.google.android.gms.common.api.internal.zabx zab;
    final java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> zac;
    java.util.Set<com.google.android.gms.common.api.Scope> zad;
    final com.google.android.gms.common.internal.ClientSettings zae;
    final java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> zaf;
    final com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> zag;
    java.util.Set<com.google.android.gms.common.api.internal.zada> zah;
    final com.google.android.gms.common.api.internal.zadc zai;
    private final java.util.concurrent.locks.Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;
    private final int zam;
    private final android.content.Context zan;
    private final android.os.Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final com.google.android.gms.common.api.internal.zabc zas;
    private final com.google.android.gms.common.GoogleApiAvailability zat;
    private final com.google.android.gms.common.api.internal.ListenerHolders zau;
    private final java.util.ArrayList<com.google.android.gms.common.api.internal.zat> zav;
    private java.lang.Integer zaw;
    private final com.google.android.gms.common.internal.zaj zax;
    private com.google.android.gms.common.api.internal.zaca zal = null;
    final java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<?, ?>> zaa = new java.util.LinkedList();

    public zabe(android.content.Context context, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> abstractClientBuilder, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> map, java.util.List<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> list, java.util.List<com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener> list2, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> map2, int i, int i2, java.util.ArrayList<com.google.android.gms.common.api.internal.zat> arrayList) {
        this.zaq = true != com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() ? 120000L : 10000L;
        this.zar = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL;
        this.zad = new java.util.HashSet();
        this.zau = new com.google.android.gms.common.api.internal.ListenerHolders();
        this.zaw = null;
        this.zah = null;
        com.google.android.gms.common.api.internal.zaay zaayVar = new com.google.android.gms.common.api.internal.zaay(this);
        this.zax = zaayVar;
        this.zan = context;
        this.zaj = lock;
        this.zak = new com.google.android.gms.common.internal.zak(looper, zaayVar);
        this.zao = looper;
        this.zas = new com.google.android.gms.common.api.internal.zabc(this, looper);
        this.zat = googleApiAvailability;
        this.zam = i;
        if (i >= 0) {
            this.zaw = java.lang.Integer.valueOf(i2);
        }
        this.zaf = map;
        this.zac = map2;
        this.zav = arrayList;
        this.zai = new com.google.android.gms.common.api.internal.zadc();
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> it = list.iterator();
        while (it.hasNext()) {
            this.zak.zaf(it.next());
        }
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zak.zag(it2.next());
        }
        this.zae = clientSettings;
        this.zag = abstractClientBuilder;
    }

    public static int zad(java.lang.Iterable<com.google.android.gms.common.api.Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (com.google.android.gms.common.api.Api.Client client : iterable) {
            z2 |= client.requiresSignIn();
            z3 |= client.providesSignIn();
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    static java.lang.String zag(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    static /* bridge */ /* synthetic */ void zai(com.google.android.gms.common.api.internal.zabe zabeVar) {
        zabeVar.zaj.lock();
        try {
            if (zabeVar.zap) {
                zabeVar.zan();
            }
        } finally {
            zabeVar.zaj.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void zaj(com.google.android.gms.common.api.internal.zabe zabeVar) {
        zabeVar.zaj.lock();
        try {
            if (zabeVar.zak()) {
                zabeVar.zan();
            }
        } finally {
            zabeVar.zaj.unlock();
        }
    }

    private final void zal(int i) {
        java.lang.Integer num = this.zaw;
        if (num == null) {
            this.zaw = java.lang.Integer.valueOf(i);
        } else if (num.intValue() != i) {
            java.lang.String zag = zag(i);
            java.lang.String zag2 = zag(this.zaw.intValue());
            java.lang.StringBuilder sb = new java.lang.StringBuilder(zag.length() + 51 + zag2.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(zag);
            sb.append(". Mode was already set to ");
            sb.append(zag2);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.zal != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (com.google.android.gms.common.api.Api.Client client : this.zac.values()) {
            z |= client.requiresSignIn();
            z2 |= client.providesSignIn();
        }
        int intValue = this.zaw.intValue();
        if (intValue == 1) {
            if (!z) {
                throw new java.lang.IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z2) {
                throw new java.lang.IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (intValue == 2 && z) {
            this.zal = com.google.android.gms.common.api.internal.zaaa.zag(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
            return;
        }
        this.zal = new com.google.android.gms.common.api.internal.zabi(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zam(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult, boolean z) {
        com.google.android.gms.common.internal.service.Common.zaa.zaa(googleApiClient).setResultCallback(new com.google.android.gms.common.api.internal.zabb(this, statusPendingResult, z, googleApiClient));
    }

    private final void zan() {
        this.zak.zab();
        ((com.google.android.gms.common.api.internal.zaca) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zaq();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
        boolean z = true;
        com.google.android.gms.common.internal.Preconditions.checkState(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaj.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw == null) {
                    z = false;
                }
                com.google.android.gms.common.internal.Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                java.lang.Integer num = this.zaw;
                if (num == null) {
                    this.zaw = java.lang.Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new java.lang.IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            zal(((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            return ((com.google.android.gms.common.api.internal.zaca) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zab();
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect() {
        com.google.android.gms.common.internal.Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        java.lang.Integer num = this.zaw;
        boolean z = true;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(this);
        if (this.zac.containsKey(com.google.android.gms.common.internal.service.Common.CLIENT_KEY)) {
            zam(this, statusPendingResult, false);
        } else {
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            com.google.android.gms.common.api.internal.zaaz zaazVar = new com.google.android.gms.common.api.internal.zaaz(this, atomicReference, statusPendingResult);
            com.google.android.gms.common.api.internal.zaba zabaVar = new com.google.android.gms.common.api.internal.zaba(this, statusPendingResult);
            com.google.android.gms.common.api.GoogleApiClient.Builder builder = new com.google.android.gms.common.api.GoogleApiClient.Builder(this.zan);
            builder.addApi(com.google.android.gms.common.internal.service.Common.API);
            builder.addConnectionCallbacks(zaazVar);
            builder.addOnConnectionFailedListener(zabaVar);
            builder.setHandler(this.zas);
            com.google.android.gms.common.api.GoogleApiClient build = builder.build();
            atomicReference.set(build);
            build.connect();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.zaj.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.zam >= 0) {
                com.google.android.gms.common.internal.Preconditions.checkState(this.zaw != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                java.lang.Integer num = this.zaw;
                if (num == null) {
                    this.zaw = java.lang.Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new java.lang.IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaw)).intValue();
            this.zaj.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(33);
                sb.append("Illegal sign-in mode: ");
                sb.append(i);
                com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
                zal(i);
                zan();
                this.zaj.unlock();
            }
            z = true;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(33);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i);
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb2.toString());
            zal(i);
            zan();
            this.zaj.unlock();
        } catch (java.lang.Throwable th) {
            throw th;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        java.util.concurrent.locks.Lock lock;
        this.zaj.lock();
        try {
            this.zai.zab();
            com.google.android.gms.common.api.internal.zaca zacaVar = this.zal;
            if (zacaVar != null) {
                zacaVar.zar();
            }
            this.zau.zab();
            for (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<?, ?> apiMethodImpl : this.zaa) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            this.zaa.clear();
            if (this.zal == null) {
                lock = this.zaj;
            } else {
                zak();
                this.zak.zaa();
                lock = this.zaj;
            }
            lock.unlock();
        } catch (java.lang.Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append((java.lang.CharSequence) str).append("mContext=").println(this.zan);
        printWriter.append((java.lang.CharSequence) str).append("mResuming=").print(this.zap);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        com.google.android.gms.common.api.internal.zaca zacaVar = this.zal;
        if (zacaVar != null) {
            zacaVar.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        java.util.concurrent.locks.Lock lock;
        com.google.android.gms.common.api.Api<?> api = t.getApi();
        boolean containsKey = this.zac.containsKey(t.getClientKey());
        java.lang.String zad = api != null ? api.zad() : "the API";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(zad);
        sb.append(" required for this call.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(containsKey, sb.toString());
        this.zaj.lock();
        try {
            com.google.android.gms.common.api.internal.zaca zacaVar = this.zal;
            if (zacaVar == null) {
                this.zaa.add(t);
                lock = this.zaj;
            } else {
                t = (T) zacaVar.zae(t);
                lock = this.zaj;
            }
            lock.unlock();
            return t;
        } catch (java.lang.Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        java.util.concurrent.locks.Lock lock;
        com.google.android.gms.common.api.Api<?> api = t.getApi();
        boolean containsKey = this.zac.containsKey(t.getClientKey());
        java.lang.String zad = api != null ? api.zad() : "the API";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(zad);
        sb.append(" required for this call.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(containsKey, sb.toString());
        this.zaj.lock();
        try {
            com.google.android.gms.common.api.internal.zaca zacaVar = this.zal;
            if (zacaVar == null) {
                throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.zap) {
                this.zaa.add(t);
                while (!this.zaa.isEmpty()) {
                    com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<?, ?> remove = this.zaa.remove();
                    this.zai.zaa(remove);
                    remove.setFailedResult(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
                }
                lock = this.zaj;
            } else {
                t = (T) zacaVar.zaf(t);
                lock = this.zaj;
            }
            lock.unlock();
            return t;
        } catch (java.lang.Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <C extends com.google.android.gms.common.api.Api.Client> C getClient(com.google.android.gms.common.api.Api.AnyClientKey<C> anyClientKey) {
        C c = (C) this.zac.get(anyClientKey);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> api) {
        com.google.android.gms.common.ConnectionResult connectionResult;
        java.util.concurrent.locks.Lock lock;
        this.zaj.lock();
        try {
            if (!isConnected() && !this.zap) {
                throw new java.lang.IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.zac.containsKey(api.zab())) {
                throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(api.zad()).concat(" was never registered with GoogleApiClient"));
            }
            com.google.android.gms.common.ConnectionResult zad = ((com.google.android.gms.common.api.internal.zaca) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zad(api);
            if (zad != null) {
                return zad;
            }
            if (this.zap) {
                connectionResult = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
                lock = this.zaj;
            } else {
                android.util.Log.w("GoogleApiClientImpl", zaf());
                android.util.Log.wtf("GoogleApiClientImpl", java.lang.String.valueOf(api.zad()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new java.lang.Exception());
                connectionResult = new com.google.android.gms.common.ConnectionResult(8, null);
                lock = this.zaj;
            }
            lock.unlock();
            return connectionResult;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.content.Context getContext() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.os.Looper getLooper() {
        return this.zao;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(com.google.android.gms.common.api.Api<?> api) {
        return this.zac.containsKey(api.zab());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(com.google.android.gms.common.api.Api<?> api) {
        com.google.android.gms.common.api.Api.Client client;
        return isConnected() && (client = this.zac.get(api.zab())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        com.google.android.gms.common.api.internal.zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zaw();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        com.google.android.gms.common.api.internal.zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zax();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zaj(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        com.google.android.gms.common.api.internal.zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zay(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        com.google.android.gms.common.api.internal.zaca zacaVar = this.zal;
        if (zacaVar != null) {
            zacaVar.zau();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zag(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L l) {
        this.zaj.lock();
        try {
            return this.zau.zaa(l, this.zao, "NO_TYPE");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(androidx.fragment.app.FragmentActivity fragmentActivity) {
        com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity = new com.google.android.gms.common.api.internal.LifecycleActivity((android.app.Activity) fragmentActivity);
        if (this.zam < 0) {
            throw new java.lang.IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        com.google.android.gms.common.api.internal.zak.zaa(lifecycleActivity).zae(this.zam);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult) {
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, connectionResult.getErrorCode())) {
            zak();
        }
        if (this.zap) {
            return;
        }
        this.zak.zac(connectionResult);
        this.zak.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(android.os.Bundle bundle) {
        while (!this.zaa.isEmpty()) {
            execute(this.zaa.remove());
        }
        this.zak.zad(bundle);
    }

    final java.lang.String zaf() {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        dump("", null, new java.io.PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    final boolean zak() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        this.zas.removeMessages(2);
        this.zas.removeMessages(1);
        com.google.android.gms.common.api.internal.zabx zabxVar = this.zab;
        if (zabxVar != null) {
            zabxVar.zab();
            this.zab = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(com.google.android.gms.common.api.internal.zada zadaVar) {
        this.zaj.lock();
        try {
            if (this.zah == null) {
                this.zah = new java.util.HashSet();
            }
            this.zah.add(zadaVar);
        } finally {
            this.zaj.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r3 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        throw r3;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zap(com.google.android.gms.common.api.internal.zada r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.lock()
            java.util.Set<com.google.android.gms.common.api.internal.zada> r0 = r2.zah     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L16
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L16:
            boolean r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L27
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L27:
            java.util.concurrent.locks.Lock r3 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r3.lock()     // Catch: java.lang.Throwable -> L57
            java.util.Set<com.google.android.gms.common.api.internal.zada> r3 = r2.zah     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto L36
            java.util.concurrent.locks.Lock r3 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r3.unlock()     // Catch: java.lang.Throwable -> L57
            goto L43
        L36:
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L50
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L4a
        L43:
            com.google.android.gms.common.api.internal.zaca r3 = r2.zal     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L4a
            r3.zat()     // Catch: java.lang.Throwable -> L57
        L4a:
            java.util.concurrent.locks.Lock r3 = r2.zaj
            r3.unlock()
            return
        L50:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            throw r3     // Catch: java.lang.Throwable -> L57
        L57:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabe.zap(com.google.android.gms.common.api.internal.zada):void");
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.zap) {
                this.zap = true;
                if (this.zab == null && !com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.zab = this.zat.zac(this.zan.getApplicationContext(), new com.google.android.gms.common.api.internal.zabd(this));
                    } catch (java.lang.SecurityException unused) {
                    }
                }
                com.google.android.gms.common.api.internal.zabc zabcVar = this.zas;
                zabcVar.sendMessageDelayed(zabcVar.obtainMessage(1), this.zaq);
                com.google.android.gms.common.api.internal.zabc zabcVar2 = this.zas;
                zabcVar2.sendMessageDelayed(zabcVar2.obtainMessage(2), this.zar);
            }
            i = 1;
        }
        for (com.google.android.gms.common.api.internal.BasePendingResult basePendingResult : (com.google.android.gms.common.api.internal.BasePendingResult[]) this.zai.zab.toArray(new com.google.android.gms.common.api.internal.BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(com.google.android.gms.common.api.internal.zadc.zaa);
        }
        this.zak.zae(i);
        this.zak.zaa();
        if (i == 2) {
            zan();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect(long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.common.internal.Preconditions.checkState(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.zaj.lock();
        try {
            java.lang.Integer num = this.zaw;
            if (num != null) {
                if (num.intValue() == 2) {
                    throw new java.lang.IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                this.zaw = java.lang.Integer.valueOf(zad(this.zac.values(), false));
            }
            zal(((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            return ((com.google.android.gms.common.api.internal.zaca) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zac(j, timeUnit);
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i) {
        this.zaj.lock();
        boolean z = true;
        if (i != 3 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
            zal(i);
            zan();
        } finally {
            this.zaj.unlock();
        }
    }
}
