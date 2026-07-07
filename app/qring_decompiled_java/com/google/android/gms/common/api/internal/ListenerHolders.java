package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class ListenerHolders {
    private final java.util.Set<com.google.android.gms.common.api.internal.ListenerHolder<?>> zaa = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(L l, android.os.Looper looper, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.ListenerHolder<>(looper, l, str);
    }

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> createListenerKey(L l, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<>(l, str);
    }

    public final <L> com.google.android.gms.common.api.internal.ListenerHolder<L> zaa(L l, android.os.Looper looper, java.lang.String str) {
        com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder = createListenerHolder(l, looper, "NO_TYPE");
        this.zaa.add(createListenerHolder);
        return createListenerHolder;
    }

    public final void zab() {
        java.util.Iterator<com.google.android.gms.common.api.internal.ListenerHolder<?>> it = this.zaa.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.zaa.clear();
    }

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(L l, java.util.concurrent.Executor executor, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(executor, "Executor must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.ListenerHolder<>(executor, l, str);
    }
}
