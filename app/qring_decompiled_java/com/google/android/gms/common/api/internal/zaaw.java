package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zaaw implements com.google.android.gms.common.api.internal.zabf {
    private final com.google.android.gms.common.api.internal.zabi zaa;
    private final java.util.concurrent.locks.Lock zab;
    private final android.content.Context zac;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zad;
    private com.google.android.gms.common.ConnectionResult zae;
    private int zaf;
    private int zah;
    private com.google.android.gms.signin.zae zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.IAccountAccessor zao;
    private boolean zap;
    private boolean zaq;
    private final com.google.android.gms.common.internal.ClientSettings zar;
    private final java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> zas;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> zat;
    private int zag = 0;
    private final android.os.Bundle zai = new android.os.Bundle();
    private final java.util.Set<com.google.android.gms.common.api.Api.AnyClientKey> zaj = new java.util.HashSet();
    private final java.util.ArrayList<java.util.concurrent.Future<?>> zau = new java.util.ArrayList<>();

    public zaaw(com.google.android.gms.common.api.internal.zabi zabiVar, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> map, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> abstractClientBuilder, java.util.concurrent.locks.Lock lock, android.content.Context context) {
        this.zaa = zabiVar;
        this.zar = clientSettings;
        this.zas = map;
        this.zad = googleApiAvailabilityLight;
        this.zat = abstractClientBuilder;
        this.zab = lock;
        this.zac = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaA() {
        this.zam = false;
        this.zaa.zag.zad = java.util.Collections.emptySet();
        for (com.google.android.gms.common.api.Api.AnyClientKey<?> anyClientKey : this.zaj) {
            if (!this.zaa.zab.containsKey(anyClientKey)) {
                this.zaa.zab.put(anyClientKey, new com.google.android.gms.common.ConnectionResult(17, null));
            }
        }
    }

    private final void zaB(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.zak;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z) {
                zaeVar.zaa();
            }
            zaeVar.disconnect();
            this.zao = null;
        }
    }

    private final void zaC() {
        this.zaa.zai();
        com.google.android.gms.common.api.internal.zabj.zaa().execute(new com.google.android.gms.common.api.internal.zaak(this));
        com.google.android.gms.signin.zae zaeVar = this.zak;
        if (zaeVar != null) {
            if (this.zap) {
                zaeVar.zac((com.google.android.gms.common.internal.IAccountAccessor) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zao), this.zaq);
            }
            zaB(false);
        }
        java.util.Iterator<com.google.android.gms.common.api.Api.AnyClientKey<?>> it = this.zaa.zab.keySet().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.Api.Client) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaa.zaa.get(it.next()))).disconnect();
        }
        this.zaa.zah.zab(this.zai.isEmpty() ? null : this.zai);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaD(com.google.android.gms.common.ConnectionResult connectionResult) {
        zaz();
        zaB(!connectionResult.hasResolution());
        this.zaa.zak(connectionResult);
        this.zaa.zah.zaa(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaE(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api<?> api, boolean z) {
        int priority = api.zac().getPriority();
        if ((!z || connectionResult.hasResolution() || this.zad.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) && (this.zae == null || priority < this.zaf)) {
            this.zae = connectionResult;
            this.zaf = priority;
        }
        this.zaa.zab.put(api.zab(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaF() {
        if (this.zah != 0) {
            return;
        }
        if (!this.zam || this.zan) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.zag = 1;
            this.zah = this.zaa.zaa.size();
            for (com.google.android.gms.common.api.Api.AnyClientKey<?> anyClientKey : this.zaa.zaa.keySet()) {
                if (!this.zaa.zab.containsKey(anyClientKey)) {
                    arrayList.add(this.zaa.zaa.get(anyClientKey));
                } else if (zaH()) {
                    zaC();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.zau.add(com.google.android.gms.common.api.internal.zabj.zaa().submit(new com.google.android.gms.common.api.internal.zaap(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaG(int i) {
        if (this.zag == i) {
            return true;
        }
        android.util.Log.w("GACConnecting", this.zaa.zag.zaf());
        android.util.Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.zah;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i2);
        android.util.Log.w("GACConnecting", sb.toString());
        java.lang.String zaJ = zaJ(this.zag);
        java.lang.String zaJ2 = zaJ(i);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(zaJ.length() + 70 + zaJ2.length());
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(zaJ);
        sb2.append(" but received callback for step ");
        sb2.append(zaJ2);
        android.util.Log.e("GACConnecting", sb2.toString(), new java.lang.Exception());
        zaD(new com.google.android.gms.common.ConnectionResult(8, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaH() {
        int i = this.zah - 1;
        this.zah = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            android.util.Log.w("GACConnecting", this.zaa.zag.zaf());
            android.util.Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new java.lang.Exception());
            zaD(new com.google.android.gms.common.ConnectionResult(8, null));
            return false;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = this.zae;
        if (connectionResult == null) {
            return true;
        }
        this.zaa.zaf = this.zaf;
        zaD(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaI(com.google.android.gms.common.ConnectionResult connectionResult) {
        return this.zal && !connectionResult.hasResolution();
    }

    private static final java.lang.String zaJ(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    static /* bridge */ /* synthetic */ java.util.Set zao(com.google.android.gms.common.api.internal.zaaw zaawVar) {
        com.google.android.gms.common.internal.ClientSettings clientSettings = zaawVar.zar;
        if (clientSettings == null) {
            return java.util.Collections.emptySet();
        }
        java.util.HashSet hashSet = new java.util.HashSet(clientSettings.getRequiredScopes());
        java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.zab> zad = zaawVar.zar.zad();
        for (com.google.android.gms.common.api.Api<?> api : zad.keySet()) {
            if (!zaawVar.zaa.zab.containsKey(api.zab())) {
                hashSet.addAll(zad.get(api).zaa);
            }
        }
        return hashSet;
    }

    static /* bridge */ /* synthetic */ void zar(com.google.android.gms.common.api.internal.zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        if (zaawVar.zaG(0)) {
            com.google.android.gms.common.ConnectionResult zaa = zakVar.zaa();
            if (!zaa.isSuccess()) {
                if (!zaawVar.zaI(zaa)) {
                    zaawVar.zaD(zaa);
                    return;
                } else {
                    zaawVar.zaA();
                    zaawVar.zaF();
                    return;
                }
            }
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) com.google.android.gms.common.internal.Preconditions.checkNotNull(zakVar.zab());
            com.google.android.gms.common.ConnectionResult zaa2 = zavVar.zaa();
            if (zaa2.isSuccess()) {
                zaawVar.zan = true;
                zaawVar.zao = (com.google.android.gms.common.internal.IAccountAccessor) com.google.android.gms.common.internal.Preconditions.checkNotNull(zavVar.zab());
                zaawVar.zap = zavVar.zac();
                zaawVar.zaq = zavVar.zad();
                zaawVar.zaF();
                return;
            }
            java.lang.String valueOf = java.lang.String.valueOf(zaa2);
            java.lang.String.valueOf(valueOf).length();
            android.util.Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(java.lang.String.valueOf(valueOf)), new java.lang.Exception());
            zaawVar.zaD(zaa2);
        }
    }

    private final void zaz() {
        java.util.ArrayList<java.util.concurrent.Future<?>> arrayList = this.zau;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        this.zau.clear();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        this.zaa.zag.zaa.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T zab(T t) {
        throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
        this.zaa.zab.clear();
        this.zam = false;
        com.google.android.gms.common.api.internal.zaas zaasVar = null;
        this.zae = null;
        this.zag = 0;
        this.zal = true;
        this.zan = false;
        this.zap = false;
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z = false;
        for (com.google.android.gms.common.api.Api<?> api : this.zas.keySet()) {
            com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaa.zaa.get(api.zab()));
            z |= api.zac().getPriority() == 1;
            boolean booleanValue = this.zas.get(api).booleanValue();
            if (client.requiresSignIn()) {
                this.zam = true;
                if (booleanValue) {
                    this.zaj.add(api.zab());
                } else {
                    this.zal = false;
                }
            }
            hashMap.put(client, new com.google.android.gms.common.api.internal.zaal(this, api, booleanValue));
        }
        if (z) {
            this.zam = false;
        }
        if (this.zam) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zar);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zat);
            this.zar.zae(java.lang.Integer.valueOf(java.lang.System.identityHashCode(this.zaa.zag)));
            com.google.android.gms.common.api.internal.zaat zaatVar = new com.google.android.gms.common.api.internal.zaat(this, zaasVar);
            com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> abstractClientBuilder = this.zat;
            android.content.Context context = this.zac;
            android.os.Looper looper = this.zaa.zag.getLooper();
            com.google.android.gms.common.internal.ClientSettings clientSettings = this.zar;
            this.zak = abstractClientBuilder.buildClient(context, looper, clientSettings, (com.google.android.gms.common.internal.ClientSettings) clientSettings.zaa(), (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) zaatVar, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) zaatVar);
        }
        this.zah = this.zaa.zaa.size();
        this.zau.add(com.google.android.gms.common.api.internal.zabj.zaa().submit(new com.google.android.gms.common.api.internal.zaao(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(android.os.Bundle bundle) {
        if (zaG(1)) {
            if (bundle != null) {
                this.zai.putAll(bundle);
            }
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api<?> api, boolean z) {
        if (zaG(1)) {
            zaE(connectionResult, api, z);
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i) {
        zaD(new com.google.android.gms.common.ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        zaz();
        zaB(true);
        this.zaa.zak(null);
        return true;
    }
}
