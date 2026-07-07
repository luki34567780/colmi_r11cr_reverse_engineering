package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class GoogleApiManager implements android.os.Handler.Callback {
    public static final com.google.android.gms.common.api.Status zaa = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.");
    private static final com.google.android.gms.common.api.Status zab = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.");
    private static final java.lang.Object zac = new java.lang.Object();
    private static com.google.android.gms.common.api.internal.GoogleApiManager zad;
    private com.google.android.gms.common.internal.TelemetryData zai;
    private com.google.android.gms.common.internal.TelemetryLoggingClient zaj;
    private final android.content.Context zak;
    private final com.google.android.gms.common.GoogleApiAvailability zal;
    private final com.google.android.gms.common.internal.zal zam;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final android.os.Handler zat;
    private volatile boolean zau;
    private long zae = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL;
    private long zaf = 120000;
    private long zag = 10000;
    private boolean zah = false;
    private final java.util.concurrent.atomic.AtomicInteger zan = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.util.concurrent.atomic.AtomicInteger zao = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> zap = new java.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
    private com.google.android.gms.common.api.internal.zaae zaq = null;
    private final java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> zar = new androidx.collection.ArraySet();
    private final java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> zas = new androidx.collection.ArraySet();

    private GoogleApiManager(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
        this.zau = true;
        this.zak = context;
        com.google.android.gms.internal.base.zaq zaqVar = new com.google.android.gms.internal.base.zaq(looper, this);
        this.zat = zaqVar;
        this.zal = googleApiAvailability;
        this.zam = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (com.google.android.gms.common.util.DeviceProperties.isAuto(context)) {
            this.zau = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    public static void reportSignOut() {
        synchronized (zac) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = zad;
            if (googleApiManager != null) {
                googleApiManager.zao.incrementAndGet();
                android.os.Handler handler = googleApiManager.zat;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.common.api.Status zaH(com.google.android.gms.common.api.internal.ApiKey<?> apiKey, com.google.android.gms.common.ConnectionResult connectionResult) {
        java.lang.String zab2 = apiKey.zab();
        java.lang.String valueOf = java.lang.String.valueOf(connectionResult);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zab2).length() + 63 + java.lang.String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(zab2);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new com.google.android.gms.common.api.Status(connectionResult, sb.toString());
    }

    private final com.google.android.gms.common.api.internal.zabq<?> zaI(com.google.android.gms.common.api.GoogleApi<?> googleApi) {
        com.google.android.gms.common.api.internal.ApiKey<?> apiKey = googleApi.getApiKey();
        com.google.android.gms.common.api.internal.zabq<?> zabqVar = this.zap.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new com.google.android.gms.common.api.internal.zabq<>(this, googleApi);
            this.zap.put(apiKey, zabqVar);
        }
        if (zabqVar.zaz()) {
            this.zas.add(apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    private final com.google.android.gms.common.internal.TelemetryLoggingClient zaJ() {
        if (this.zaj == null) {
            this.zaj = com.google.android.gms.common.internal.TelemetryLogging.getClient(this.zak);
        }
        return this.zaj;
    }

    private final void zaK() {
        com.google.android.gms.common.internal.TelemetryData telemetryData = this.zai;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaF()) {
                zaJ().log(telemetryData);
            }
            this.zai = null;
        }
    }

    private final <T> void zaL(com.google.android.gms.tasks.TaskCompletionSource<T> taskCompletionSource, int i, com.google.android.gms.common.api.GoogleApi googleApi) {
        com.google.android.gms.common.api.internal.zacd zaa2;
        if (i == 0 || (zaa2 = com.google.android.gms.common.api.internal.zacd.zaa(this, i, googleApi.getApiKey())) == null) {
            return;
        }
        com.google.android.gms.tasks.Task<T> task = taskCompletionSource.getTask();
        final android.os.Handler handler = this.zat;
        handler.getClass();
        task.addOnCompleteListener(new java.util.concurrent.Executor() { // from class: com.google.android.gms.common.api.internal.zabk
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        }, zaa2);
    }

    public static com.google.android.gms.common.api.internal.GoogleApiManager zal() {
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager;
        synchronized (zac) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    public static com.google.android.gms.common.api.internal.GoogleApiManager zam(android.content.Context context) {
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager;
        synchronized (zac) {
            if (zad == null) {
                zad = new com.google.android.gms.common.api.internal.GoogleApiManager(context.getApplicationContext(), com.google.android.gms.common.internal.GmsClientSupervisor.getOrStartHandlerThread().getLooper(), com.google.android.gms.common.GoogleApiAvailability.getInstance());
            }
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        com.google.android.gms.common.api.internal.ApiKey apiKey;
        boolean zaN;
        com.google.android.gms.common.api.internal.ApiKey apiKey2;
        com.google.android.gms.common.api.internal.ApiKey apiKey3;
        com.google.android.gms.common.api.internal.ApiKey apiKey4;
        com.google.android.gms.common.api.internal.ApiKey apiKey5;
        com.google.android.gms.common.api.internal.zabq<?> zabqVar = null;
        switch (message.what) {
            case 1:
                this.zag = true == ((java.lang.Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.zat.removeMessages(12);
                for (com.google.android.gms.common.api.internal.ApiKey<?> apiKey6 : this.zap.keySet()) {
                    android.os.Handler handler = this.zat;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey6), this.zag);
                }
                return true;
            case 2:
                com.google.android.gms.common.api.internal.zal zalVar = (com.google.android.gms.common.api.internal.zal) message.obj;
                java.util.Iterator<com.google.android.gms.common.api.internal.ApiKey<?>> it = zalVar.zab().iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.google.android.gms.common.api.internal.ApiKey<?> next = it.next();
                        com.google.android.gms.common.api.internal.zabq<?> zabqVar2 = this.zap.get(next);
                        if (zabqVar2 == null) {
                            zalVar.zac(next, new com.google.android.gms.common.ConnectionResult(13), null);
                        } else if (zabqVar2.zay()) {
                            zalVar.zac(next, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                        } else {
                            com.google.android.gms.common.ConnectionResult zad2 = zabqVar2.zad();
                            if (zad2 != null) {
                                zalVar.zac(next, zad2, null);
                            } else {
                                zabqVar2.zat(zalVar);
                                zabqVar2.zao();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (com.google.android.gms.common.api.internal.zabq<?> zabqVar3 : this.zap.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                com.google.android.gms.common.api.internal.zach zachVar = (com.google.android.gms.common.api.internal.zach) message.obj;
                com.google.android.gms.common.api.internal.zabq<?> zabqVar4 = this.zap.get(zachVar.zac.getApiKey());
                if (zabqVar4 == null) {
                    zabqVar4 = zaI(zachVar.zac);
                }
                if (!zabqVar4.zaz() || this.zao.get() == zachVar.zab) {
                    zabqVar4.zap(zachVar.zaa);
                } else {
                    zachVar.zaa.zad(zaa);
                    zabqVar4.zav();
                }
                return true;
            case 5:
                int i = message.arg1;
                com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) message.obj;
                java.util.Iterator<com.google.android.gms.common.api.internal.zabq<?>> it2 = this.zap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        com.google.android.gms.common.api.internal.zabq<?> next2 = it2.next();
                        if (next2.zab() == i) {
                            zabqVar = next2;
                        }
                    }
                }
                if (zabqVar == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    android.util.Log.wtf("GoogleApiManager", sb.toString(), new java.lang.Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    java.lang.String errorString = this.zal.getErrorString(connectionResult.getErrorCode());
                    java.lang.String errorMessage = connectionResult.getErrorMessage();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(errorString).length() + 69 + java.lang.String.valueOf(errorMessage).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(errorString);
                    sb2.append(": ");
                    sb2.append(errorMessage);
                    zabqVar.zaD(new com.google.android.gms.common.api.Status(17, sb2.toString()));
                } else {
                    apiKey = ((com.google.android.gms.common.api.internal.zabq) zabqVar).zad;
                    zabqVar.zaD(zaH(apiKey, connectionResult));
                }
                return true;
            case 6:
                if (this.zak.getApplicationContext() instanceof android.app.Application) {
                    com.google.android.gms.common.api.internal.BackgroundDetector.initialize((android.app.Application) this.zak.getApplicationContext());
                    com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(new com.google.android.gms.common.api.internal.zabl(this));
                    if (!com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zag = 300000L;
                    }
                }
                return true;
            case 7:
                zaI((com.google.android.gms.common.api.GoogleApi) message.obj);
                return true;
            case 9:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zau();
                }
                return true;
            case 10:
                java.util.Iterator<com.google.android.gms.common.api.internal.ApiKey<?>> it3 = this.zas.iterator();
                while (it3.hasNext()) {
                    com.google.android.gms.common.api.internal.zabq<?> remove = this.zap.remove(it3.next());
                    if (remove != null) {
                        remove.zav();
                    }
                }
                this.zas.clear();
                return true;
            case 11:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zaw();
                }
                return true;
            case 12:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zaA();
                }
                return true;
            case 14:
                com.google.android.gms.common.api.internal.zaaf zaafVar = (com.google.android.gms.common.api.internal.zaaf) message.obj;
                com.google.android.gms.common.api.internal.ApiKey<?> zaa2 = zaafVar.zaa();
                if (this.zap.containsKey(zaa2)) {
                    zaN = this.zap.get(zaa2).zaN(false);
                    zaafVar.zab().setResult(java.lang.Boolean.valueOf(zaN));
                } else {
                    zaafVar.zab().setResult(false);
                }
                return true;
            case 15:
                com.google.android.gms.common.api.internal.zabs zabsVar = (com.google.android.gms.common.api.internal.zabs) message.obj;
                java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> map = this.zap;
                apiKey2 = zabsVar.zaa;
                if (map.containsKey(apiKey2)) {
                    java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> map2 = this.zap;
                    apiKey3 = zabsVar.zaa;
                    com.google.android.gms.common.api.internal.zabq.zal(map2.get(apiKey3), zabsVar);
                }
                return true;
            case 16:
                com.google.android.gms.common.api.internal.zabs zabsVar2 = (com.google.android.gms.common.api.internal.zabs) message.obj;
                java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> map3 = this.zap;
                apiKey4 = zabsVar2.zaa;
                if (map3.containsKey(apiKey4)) {
                    java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> map4 = this.zap;
                    apiKey5 = zabsVar2.zaa;
                    com.google.android.gms.common.api.internal.zabq.zam(map4.get(apiKey5), zabsVar2);
                }
                return true;
            case 17:
                zaK();
                return true;
            case 18:
                com.google.android.gms.common.api.internal.zace zaceVar = (com.google.android.gms.common.api.internal.zace) message.obj;
                if (zaceVar.zac == 0) {
                    zaJ().log(new com.google.android.gms.common.internal.TelemetryData(zaceVar.zab, java.util.Arrays.asList(zaceVar.zaa)));
                } else {
                    com.google.android.gms.common.internal.TelemetryData telemetryData = this.zai;
                    if (telemetryData != null) {
                        java.util.List<com.google.android.gms.common.internal.MethodInvocation> zab2 = telemetryData.zab();
                        if (telemetryData.zaa() != zaceVar.zab || (zab2 != null && zab2.size() >= zaceVar.zad)) {
                            this.zat.removeMessages(17);
                            zaK();
                        } else {
                            this.zai.zac(zaceVar.zaa);
                        }
                    }
                    if (this.zai == null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(zaceVar.zaa);
                        this.zai = new com.google.android.gms.common.internal.TelemetryData(zaceVar.zab, arrayList);
                        android.os.Handler handler2 = this.zat;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaceVar.zac);
                    }
                }
                return true;
            case 19:
                this.zah = false;
                return true;
            default:
                int i2 = message.what;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                android.util.Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final void zaA() {
        android.os.Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaB(com.google.android.gms.common.api.GoogleApi<?> googleApi) {
        android.os.Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void zaC(com.google.android.gms.common.api.internal.zaae zaaeVar) {
        synchronized (zac) {
            if (this.zaq != zaaeVar) {
                this.zaq = zaaeVar;
                this.zar.clear();
            }
            this.zar.addAll(zaaeVar.zaa());
        }
    }

    final void zaD(com.google.android.gms.common.api.internal.zaae zaaeVar) {
        synchronized (zac) {
            if (this.zaq == zaaeVar) {
                this.zaq = null;
                this.zar.clear();
            }
        }
    }

    final boolean zaF() {
        if (this.zah) {
            return false;
        }
        com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zaa2 = this.zam.zaa(this.zak, 203400000);
        return zaa2 == -1 || zaa2 == 0;
    }

    final boolean zaG(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        return this.zal.zah(this.zak, connectionResult, i);
    }

    public final int zaa() {
        return this.zan.getAndIncrement();
    }

    final com.google.android.gms.common.api.internal.zabq zak(com.google.android.gms.common.api.internal.ApiKey<?> apiKey) {
        return this.zap.get(apiKey);
    }

    public final com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zao(java.lang.Iterable<? extends com.google.android.gms.common.api.HasApiKey<?>> iterable) {
        com.google.android.gms.common.api.internal.zal zalVar = new com.google.android.gms.common.api.internal.zal(iterable);
        android.os.Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    public final com.google.android.gms.tasks.Task<java.lang.Boolean> zap(com.google.android.gms.common.api.GoogleApi<?> googleApi) {
        com.google.android.gms.common.api.internal.zaaf zaafVar = new com.google.android.gms.common.api.internal.zaaf(googleApi.getApiKey());
        android.os.Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(14, zaafVar));
        return zaafVar.zab().getTask();
    }

    public final <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.tasks.Task<java.lang.Void> zaq(com.google.android.gms.common.api.GoogleApi<O> googleApi, com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> registerListenerMethod, com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> unregisterListenerMethod, java.lang.Runnable runnable) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        zaL(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        com.google.android.gms.common.api.internal.zaf zafVar = new com.google.android.gms.common.api.internal.zaf(new com.google.android.gms.common.api.internal.zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        android.os.Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(8, new com.google.android.gms.common.api.internal.zach(zafVar, this.zao.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.tasks.Task<java.lang.Boolean> zar(com.google.android.gms.common.api.GoogleApi<O> googleApi, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, int i) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        zaL(taskCompletionSource, i, googleApi);
        com.google.android.gms.common.api.internal.zah zahVar = new com.google.android.gms.common.api.internal.zah(listenerKey, taskCompletionSource);
        android.os.Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(13, new com.google.android.gms.common.api.internal.zach(zahVar, this.zao.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends com.google.android.gms.common.api.Api.ApiOptions> void zaw(com.google.android.gms.common.api.GoogleApi<O> googleApi, int i, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api.AnyClient> apiMethodImpl) {
        com.google.android.gms.common.api.internal.zae zaeVar = new com.google.android.gms.common.api.internal.zae(i, apiMethodImpl);
        android.os.Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new com.google.android.gms.common.api.internal.zach(zaeVar, this.zao.get(), googleApi)));
    }

    public final <O extends com.google.android.gms.common.api.Api.ApiOptions, ResultT> void zax(com.google.android.gms.common.api.GoogleApi<O> googleApi, int i, com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.common.api.Api.AnyClient, ResultT> taskApiCall, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        zaL(taskCompletionSource, taskApiCall.zaa(), googleApi);
        com.google.android.gms.common.api.internal.zag zagVar = new com.google.android.gms.common.api.internal.zag(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        android.os.Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new com.google.android.gms.common.api.internal.zach(zagVar, this.zao.get(), googleApi)));
    }

    final void zay(com.google.android.gms.common.internal.MethodInvocation methodInvocation, int i, long j, int i2) {
        android.os.Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(18, new com.google.android.gms.common.api.internal.zace(methodInvocation, i, j, i2)));
    }

    public final void zaz(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        if (zaG(connectionResult, i)) {
            return;
        }
        android.os.Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }
}
