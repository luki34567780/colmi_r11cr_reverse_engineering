package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zak implements android.os.Handler.Callback {

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.internal.zaj zab;
    private final android.os.Handler zah;
    private final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> zac = new java.util.ArrayList<>();
    final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> zaa = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener> zad = new java.util.ArrayList<>();
    private volatile boolean zae = false;
    private final java.util.concurrent.atomic.AtomicInteger zaf = new java.util.concurrent.atomic.AtomicInteger(0);
    private boolean zag = false;
    private final java.lang.Object zai = new java.lang.Object();

    public zak(android.os.Looper looper, com.google.android.gms.common.internal.zaj zajVar) {
        this.zab = zajVar;
        this.zah = new com.google.android.gms.internal.base.zaq(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            int i = message.what;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i);
            android.util.Log.wtf("GmsClientEvents", sb.toString(), new java.lang.Exception());
            return false;
        }
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) message.obj;
        synchronized (this.zai) {
            if (this.zae && this.zab.isConnected() && this.zac.contains(connectionCallbacks)) {
                connectionCallbacks.onConnected(null);
            }
        }
        return true;
    }

    public final void zaa() {
        this.zae = false;
        this.zaf.incrementAndGet();
    }

    public final void zab() {
        this.zae = true;
    }

    public final void zac(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zah, "onConnectionFailure must only be called on the Handler thread");
        this.zah.removeMessages(1);
        synchronized (this.zai) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.zad);
            int i = this.zaf.get();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) it.next();
                if (this.zae && this.zaf.get() == i) {
                    if (this.zad.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.onConnectionFailed(connectionResult);
                    }
                }
                return;
            }
        }
    }

    public final void zad(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zah, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.zai) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zag);
            this.zah.removeMessages(1);
            this.zag = true;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zaa.isEmpty());
            java.util.ArrayList arrayList = new java.util.ArrayList(this.zac);
            int i = this.zaf.get();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) it.next();
                if (!this.zae || !this.zab.isConnected() || this.zaf.get() != i) {
                    break;
                } else if (!this.zaa.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.zaa.clear();
            this.zag = false;
        }
    }

    public final void zae(int i) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zah, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.zah.removeMessages(1);
        synchronized (this.zai) {
            this.zag = true;
            java.util.ArrayList arrayList = new java.util.ArrayList(this.zac);
            int i2 = this.zaf.get();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) it.next();
                if (!this.zae || this.zaf.get() != i2) {
                    break;
                } else if (this.zac.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                }
            }
            this.zaa.clear();
            this.zag = false;
        }
    }

    public final void zaf(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            if (this.zac.contains(connectionCallbacks)) {
                java.lang.String valueOf = java.lang.String.valueOf(connectionCallbacks);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                android.util.Log.w("GmsClientEvents", sb.toString());
            } else {
                this.zac.add(connectionCallbacks);
            }
        }
        if (this.zab.isConnected()) {
            android.os.Handler handler = this.zah;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void zag(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            if (this.zad.contains(onConnectionFailedListener)) {
                java.lang.String valueOf = java.lang.String.valueOf(onConnectionFailedListener);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                android.util.Log.w("GmsClientEvents", sb.toString());
            } else {
                this.zad.add(onConnectionFailedListener);
            }
        }
    }

    public final void zah(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            if (!this.zac.remove(connectionCallbacks)) {
                java.lang.String valueOf = java.lang.String.valueOf(connectionCallbacks);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                android.util.Log.w("GmsClientEvents", sb.toString());
            } else if (this.zag) {
                this.zaa.add(connectionCallbacks);
            }
        }
    }

    public final void zai(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            if (!this.zad.remove(onConnectionFailedListener)) {
                java.lang.String valueOf = java.lang.String.valueOf(onConnectionFailedListener);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                android.util.Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean zaj(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            contains = this.zac.contains(connectionCallbacks);
        }
        return contains;
    }

    public final boolean zak(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            contains = this.zad.contains(onConnectionFailedListener);
        }
        return contains;
    }
}
