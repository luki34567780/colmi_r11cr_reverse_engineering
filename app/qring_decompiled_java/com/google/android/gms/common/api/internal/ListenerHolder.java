package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class ListenerHolder<L> {
    private final java.util.concurrent.Executor zaa;
    private volatile L zab;
    private volatile com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class ListenerKey<L> {
        private final L zaa;
        private final java.lang.String zab;

        ListenerKey(L l, java.lang.String str) {
            this.zaa = l;
            this.zab = str;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey)) {
                return false;
            }
            com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) obj;
            return this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab);
        }

        public int hashCode() {
            return (java.lang.System.identityHashCode(this.zaa) * 31) + this.zab.hashCode();
        }

        public java.lang.String toIdString() {
            java.lang.String str = this.zab;
            int identityHashCode = java.lang.System.identityHashCode(this.zaa);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append("@");
            sb.append(identityHashCode);
            return sb.toString();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface Notifier<L> {
        void notifyListener(L l);

        void onNotifyListenerFailed();
    }

    ListenerHolder(android.os.Looper looper, L l, java.lang.String str) {
        this.zaa = new com.google.android.gms.common.util.concurrent.HandlerExecutor(looper);
        this.zab = (L) com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        this.zac = new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<>(l, com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str));
    }

    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zac;
    }

    public boolean hasListener() {
        return this.zab != null;
    }

    public void notifyListener(final com.google.android.gms.common.api.internal.ListenerHolder.Notifier<? super L> notifier) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zaa.execute(new java.lang.Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.common.api.internal.ListenerHolder.this.zaa(notifier);
            }
        });
    }

    final void zaa(com.google.android.gms.common.api.internal.ListenerHolder.Notifier<? super L> notifier) {
        L l = this.zab;
        if (l == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(l);
        } catch (java.lang.RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }

    ListenerHolder(java.util.concurrent.Executor executor, L l, java.lang.String str) {
        this.zaa = (java.util.concurrent.Executor) com.google.android.gms.common.internal.Preconditions.checkNotNull(executor, "Executor must not be null");
        this.zab = (L) com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        this.zac = new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<>(l, com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str));
    }
}
