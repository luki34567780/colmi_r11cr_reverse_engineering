package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class GoogleApi<O extends com.google.android.gms.common.api.Api.ApiOptions> implements com.google.android.gms.common.api.HasApiKey<O> {
    protected final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final android.content.Context zab;
    private final java.lang.String zac;
    private final com.google.android.gms.common.api.Api<O> zad;
    private final O zae;
    private final com.google.android.gms.common.api.internal.ApiKey<O> zaf;
    private final android.os.Looper zag;
    private final int zah;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.GoogleApiClient zai;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class Settings {
        public static final com.google.android.gms.common.api.GoogleApi.Settings DEFAULT_SETTINGS = new com.google.android.gms.common.api.GoogleApi.Settings.Builder().build();
        public final com.google.android.gms.common.api.internal.StatusExceptionMapper zaa;
        public final android.os.Looper zab;

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static class Builder {
            private com.google.android.gms.common.api.internal.StatusExceptionMapper zaa;
            private android.os.Looper zab;

            /* JADX WARN: Multi-variable type inference failed */
            public com.google.android.gms.common.api.GoogleApi.Settings build() {
                if (this.zaa == null) {
                    this.zaa = new com.google.android.gms.common.api.internal.ApiExceptionMapper();
                }
                if (this.zab == null) {
                    this.zab = android.os.Looper.getMainLooper();
                }
                return new com.google.android.gms.common.api.GoogleApi.Settings(this.zaa, this.zab);
            }

            public com.google.android.gms.common.api.GoogleApi.Settings.Builder setLooper(android.os.Looper looper) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            public com.google.android.gms.common.api.GoogleApi.Settings.Builder setMapper(com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper;
                return this;
            }
        }

        private Settings(com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper, android.accounts.Account account, android.os.Looper looper) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }
    }

    public GoogleApi(android.app.Activity activity, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        this(activity, activity, api, o, settings);
    }

    private final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T zad(int i, T t) {
        t.zak();
        this.zaa.zaw(this, i, t);
        return t;
    }

    private final <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> zae(int i, com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zaa.zax(this, i, taskApiCall, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    protected com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder() {
        android.accounts.Account account;
        java.util.Set<com.google.android.gms.common.api.Scope> emptySet;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount;
        com.google.android.gms.common.internal.ClientSettings.Builder builder = new com.google.android.gms.common.internal.ClientSettings.Builder();
        O o = this.zae;
        if (!(o instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) o).getGoogleSignInAccount()) == null) {
            O o2 = this.zae;
            account = o2 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions ? ((com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions) o2).getAccount() : null;
        } else {
            account = googleSignInAccount.getAccount();
        }
        builder.zab(account);
        O o3 = this.zae;
        if (o3 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount2 = ((com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) o3).getGoogleSignInAccount();
            emptySet = googleSignInAccount2 == null ? java.util.Collections.emptySet() : googleSignInAccount2.getRequestedScopes();
        } else {
            emptySet = java.util.Collections.emptySet();
        }
        builder.zaa(emptySet);
        builder.zac(this.zab.getClass().getName());
        builder.setRealClientPackageName(this.zab.getPackageName());
        return builder;
    }

    protected com.google.android.gms.tasks.Task<java.lang.Boolean> disconnectService() {
        return this.zaa.zap(this);
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doBestEffortWrite(T t) {
        zad(2, t);
        return t;
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doRead(T t) {
        zad(0, t);
        return t;
    }

    @java.lang.Deprecated
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.RegisterListenerMethod<A, ?>, U extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<A, ?>> com.google.android.gms.tasks.Task<java.lang.Void> doRegisterEventListener(T t, U u) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(u);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.common.internal.Objects.equal(t.getListenerKey(), u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zaq(this, t, u, new java.lang.Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doWrite(T t) {
        zad(1, t);
        return t;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    public final com.google.android.gms.common.api.internal.ApiKey<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return this.zae;
    }

    public android.content.Context getApplicationContext() {
        return this.zab;
    }

    protected java.lang.String getContextAttributionTag() {
        return this.zac;
    }

    @java.lang.Deprecated
    protected java.lang.String getContextFeatureId() {
        return this.zac;
    }

    public android.os.Looper getLooper() {
        return this.zag;
    }

    public <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L l, java.lang.String str) {
        return com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(l, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.common.api.Api.Client zab(android.os.Looper looper, com.google.android.gms.common.api.internal.zabq<O> zabqVar) {
        com.google.android.gms.common.api.Api.Client buildClient = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad.zaa())).buildClient(this.zab, looper, createClientSettingsBuilder().build(), (com.google.android.gms.common.internal.ClientSettings) this.zae, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) zabqVar, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) zabqVar);
        java.lang.String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
            ((com.google.android.gms.common.internal.BaseGmsClient) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient)) {
            ((com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient) buildClient).zac(contextAttributionTag);
        }
        return buildClient;
    }

    public final com.google.android.gms.common.api.internal.zact zac(android.content.Context context, android.os.Handler handler) {
        return new com.google.android.gms.common.api.internal.zact(context, handler, createClientSettingsBuilder().build());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(android.app.Activity r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.setLooper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.app.Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doBestEffortWrite(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doRead(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zaa.zar(this, listenerKey, i);
    }

    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doWrite(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    private GoogleApi(android.content.Context context, android.app.Activity activity, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        java.lang.String str = null;
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) {
            try {
                str = (java.lang.String) android.content.Context.class.getMethod("getAttributionTag", new java.lang.Class[0]).invoke(context, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = api;
        this.zae = o;
        this.zag = settings.zab;
        com.google.android.gms.common.api.internal.ApiKey<O> zaa = com.google.android.gms.common.api.internal.ApiKey.zaa(api, o, str);
        this.zaf = zaa;
        this.zai = new com.google.android.gms.common.api.internal.zabv(this);
        com.google.android.gms.common.api.internal.GoogleApiManager zam = com.google.android.gms.common.api.internal.GoogleApiManager.zam(this.zab);
        this.zaa = zam;
        this.zah = zam.zaa();
        this.zaj = settings.zaa;
        if (activity != null && !(activity instanceof com.google.android.gms.common.api.GoogleApiActivity) && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.zaae.zad(activity, zam, zaa);
        }
        zam.zaB(this);
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<java.lang.Void> doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods<A, ?> registrationMethods) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(registrationMethods);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(registrationMethods.zaa.getListenerKey(), "Listener has already been released.");
        return this.zaa.zaq(this, registrationMethods.register, registrationMethods.zaa, registrationMethods.zab);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, android.os.Looper r5, com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setLooper(r5)
            r0.setMapper(r6)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, android.os.Looper, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    public GoogleApi(android.content.Context context, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        this(context, (android.app.Activity) null, api, o, settings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }
}
