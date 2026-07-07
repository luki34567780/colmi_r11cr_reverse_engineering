package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseGmsClient<T extends android.os.IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final java.lang.String KEY_PENDING_INTENT = "pendingIntent";
    private volatile java.lang.String zzA;
    private com.google.android.gms.common.ConnectionResult zzB;
    private boolean zzC;
    private volatile com.google.android.gms.common.internal.zzj zzD;
    com.google.android.gms.common.internal.zzu zza;
    final android.os.Handler zzb;
    protected com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zzc;
    protected java.util.concurrent.atomic.AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile java.lang.String zzk;
    private final android.content.Context zzl;
    private final android.os.Looper zzm;
    private final com.google.android.gms.common.internal.GmsClientSupervisor zzn;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zzo;
    private final java.lang.Object zzp;
    private final java.lang.Object zzq;
    private com.google.android.gms.common.internal.IGmsServiceBroker zzr;
    private T zzs;
    private final java.util.ArrayList<com.google.android.gms.common.internal.zzc<?>> zzt;
    private com.google.android.gms.common.internal.zze zzu;
    private int zzv;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzw;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final java.lang.String zzz;
    private static final com.google.android.gms.common.Feature[] zze = new com.google.android.gms.common.Feature[0];
    public static final java.lang.String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface BaseConnectionCallbacks {
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(android.os.Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    protected class LegacyClientCallbackAdapter implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = com.google.android.gms.common.internal.BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else if (com.google.android.gms.common.internal.BaseGmsClient.this.zzx != null) {
                com.google.android.gms.common.internal.BaseGmsClient.this.zzx.onConnectionFailed(connectionResult);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    protected BaseGmsClient(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, com.google.android.gms.common.internal.zzj zzjVar) {
        baseGmsClient.zzD = zzjVar;
        if (baseGmsClient.usesClientTelemetry()) {
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.zzd;
            com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
    }

    static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i) {
        int i2;
        int i3;
        synchronized (baseGmsClient.zzp) {
            i2 = baseGmsClient.zzv;
        }
        if (i2 == 3) {
            baseGmsClient.zzC = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        android.os.Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(i3, baseGmsClient.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i, int i2, android.os.IInterface iInterface) {
        synchronized (baseGmsClient.zzp) {
            if (baseGmsClient.zzv != i) {
                return false;
            }
            baseGmsClient.zzp(i2, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient) {
        if (baseGmsClient.zzC || android.text.TextUtils.isEmpty(baseGmsClient.getServiceDescriptor()) || android.text.TextUtils.isEmpty(baseGmsClient.getLocalStartServiceAction())) {
            return false;
        }
        try {
            java.lang.Class.forName(baseGmsClient.getServiceDescriptor());
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(int i, T t) {
        com.google.android.gms.common.internal.zzu zzuVar;
        com.google.android.gms.common.internal.Preconditions.checkArgument((i == 4) == (t != null));
        synchronized (this.zzp) {
            this.zzv = i;
            this.zzs = t;
            if (i == 1) {
                com.google.android.gms.common.internal.zze zzeVar = this.zzu;
                if (zzeVar != null) {
                    com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor = this.zzn;
                    java.lang.String zzc = this.zza.zzc();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc);
                    gmsClientSupervisor.zzb(zzc, this.zza.zzb(), this.zza.zza(), zzeVar, zze(), this.zza.zzd());
                    this.zzu = null;
                }
            } else if (i == 2 || i == 3) {
                com.google.android.gms.common.internal.zze zzeVar2 = this.zzu;
                if (zzeVar2 != null && (zzuVar = this.zza) != null) {
                    java.lang.String zzc2 = zzuVar.zzc();
                    java.lang.String zzb = zzuVar.zzb();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc2).length() + 70 + java.lang.String.valueOf(zzb).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(zzc2);
                    sb.append(" on ");
                    sb.append(zzb);
                    android.util.Log.e("GmsClient", sb.toString());
                    com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                    java.lang.String zzc3 = this.zza.zzc();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc3);
                    gmsClientSupervisor2.zzb(zzc3, this.zza.zzb(), this.zza.zza(), zzeVar2, zze(), this.zza.zzd());
                    this.zzd.incrementAndGet();
                }
                com.google.android.gms.common.internal.zze zzeVar3 = new com.google.android.gms.common.internal.zze(this, this.zzd.get());
                this.zzu = zzeVar3;
                com.google.android.gms.common.internal.zzu zzuVar2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new com.google.android.gms.common.internal.zzu(getStartServicePackage(), getStartServiceAction(), false, com.google.android.gms.common.internal.GmsClientSupervisor.getDefaultBindFlags(), getUseDynamicLookup()) : new com.google.android.gms.common.internal.zzu(getContext().getPackageName(), getLocalStartServiceAction(), true, com.google.android.gms.common.internal.GmsClientSupervisor.getDefaultBindFlags(), false);
                this.zza = zzuVar2;
                if (zzuVar2.zzd() && getMinApkVersion() < 17895000) {
                    java.lang.String valueOf = java.lang.String.valueOf(this.zza.zzc());
                    throw new java.lang.IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new java.lang.String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                java.lang.String zzc4 = this.zza.zzc();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc4);
                if (!gmsClientSupervisor3.zzc(new com.google.android.gms.common.internal.zzn(zzc4, this.zza.zzb(), this.zza.zza(), this.zza.zzd()), zzeVar3, zze(), getBindServiceExecutor())) {
                    java.lang.String zzc5 = this.zza.zzc();
                    java.lang.String zzb2 = this.zza.zzb();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzc5).length() + 34 + java.lang.String.valueOf(zzb2).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(zzc5);
                    sb2.append(" on ");
                    sb2.append(zzb2);
                    android.util.Log.w("GmsClient", sb2.toString());
                    zzl(16, null, this.zzd.get());
                }
            } else if (i == 4) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(t);
                onConnectedLocked(t);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int isGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (isGooglePlayServicesAvailable == 0) {
            connect(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter());
        } else {
            zzp(1, null);
            triggerNotAvailable(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter(), isGooglePlayServicesAvailable, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    protected abstract T createServiceInterface(android.os.IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i = 0; i < size; i++) {
                this.zzt.get(i).zzf();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int i;
        T t;
        com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i = this.zzv;
            t = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((java.lang.CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print(com.oudmon.ble.base.bluetooth.BleAction.EXTRA_CONNECTED);
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((java.lang.CharSequence) getServiceDescriptor()).append("@").append((java.lang.CharSequence) java.lang.Integer.toHexString(java.lang.System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(java.lang.Integer.toHexString(java.lang.System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US);
        if (this.zzh > 0) {
            java.io.PrintWriter append = printWriter.append((java.lang.CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            java.lang.String format = simpleDateFormat.format(new java.util.Date(j));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzg > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((java.lang.CharSequence) java.lang.String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            java.io.PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            java.lang.String format2 = simpleDateFormat.format(new java.util.Date(j2));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastFailedStatus=").append((java.lang.CharSequence) com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(this.zzi));
            java.io.PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzj;
            java.lang.String format3 = simpleDateFormat.format(new java.util.Date(j3));
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    protected boolean enableLocalFallback() {
        return false;
    }

    public android.accounts.Account getAccount() {
        return null;
    }

    public com.google.android.gms.common.Feature[] getApiFeatures() {
        return zze;
    }

    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
        com.google.android.gms.common.internal.zzj zzjVar = this.zzD;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.zzb;
    }

    protected java.util.concurrent.Executor getBindServiceExecutor() {
        return null;
    }

    public android.os.Bundle getConnectionHint() {
        return null;
    }

    public final android.content.Context getContext() {
        return this.zzl;
    }

    public java.lang.String getEndpointPackageName() {
        com.google.android.gms.common.internal.zzu zzuVar;
        if (!isConnected() || (zzuVar = this.zza) == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
        return zzuVar.zzb();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    protected android.os.Bundle getGetServiceRequestExtraArgs() {
        return new android.os.Bundle();
    }

    public java.lang.String getLastDisconnectMessage() {
        return this.zzk;
    }

    protected java.lang.String getLocalStartServiceAction() {
        return null;
    }

    public final android.os.Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        android.os.Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        com.google.android.gms.common.internal.GetServiceRequest getServiceRequest = new com.google.android.gms.common.internal.GetServiceRequest(this.zzy, this.zzA);
        getServiceRequest.zzd = this.zzl.getPackageName();
        getServiceRequest.zzg = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzf = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[set.size()]);
        }
        if (requiresSignIn()) {
            android.accounts.Account account = getAccount();
            if (account == null) {
                account = new android.accounts.Account("<<default account>>", "com.google");
            }
            getServiceRequest.zzh = account;
            if (iAccountAccessor != null) {
                getServiceRequest.zze = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.zzh = getAccount();
        }
        getServiceRequest.zzi = zze;
        getServiceRequest.zzj = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.zzm = true;
        }
        try {
            synchronized (this.zzq) {
                com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new com.google.android.gms.common.internal.zzd(this, this.zzd.get()), getServiceRequest);
                } else {
                    android.util.Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (android.os.DeadObjectException e) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (android.os.RemoteException e2) {
            e = e2;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (java.lang.SecurityException e3) {
            throw e3;
        } catch (java.lang.RuntimeException e4) {
            e = e4;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
        return java.util.Collections.emptySet();
    }

    public final T getService() throws android.os.DeadObjectException {
        T t;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new android.os.DeadObjectException();
            }
            checkConnected();
            t = this.zzs;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(t, "Client is connected but service is null");
        }
        return t;
    }

    protected abstract java.lang.String getServiceDescriptor();

    public android.content.Intent getSignInIntent() {
        throw new java.lang.UnsupportedOperationException("Not a sign in API");
    }

    protected abstract java.lang.String getStartServiceAction();

    protected java.lang.String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        com.google.android.gms.common.internal.zzj zzjVar = this.zzD;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.zzd;
    }

    protected boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    protected void onConnectedLocked(T t) {
        this.zzh = java.lang.System.currentTimeMillis();
    }

    protected void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zzi = connectionResult.getErrorCode();
        this.zzj = java.lang.System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = java.lang.System.currentTimeMillis();
    }

    protected void onPostInitHandler(int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        android.os.Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new com.google.android.gms.common.internal.zzf(this, i, iBinder, bundle)));
    }

    public void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(java.lang.String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i) {
        android.os.Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i));
    }

    protected void triggerNotAvailable(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        android.os.Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected final java.lang.String zze() {
        java.lang.String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzl(int i, android.os.Bundle bundle, int i2) {
        android.os.Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new com.google.android.gms.common.internal.zzg(this, i, null)));
    }

    public android.os.IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker = this.zzr;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected BaseGmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }

    public void disconnect(java.lang.String str) {
        this.zzk = str;
        disconnect();
    }

    protected BaseGmsClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, java.lang.String str) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzm = looper;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new com.google.android.gms.common.internal.zzb(this, looper);
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }
}
