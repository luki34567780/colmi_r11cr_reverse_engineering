package com.bumptech.glide.util;

/* loaded from: /tmp/dex/classes2.dex */
public final class CachedHashCodeArrayMap<K, V> extends androidx.collection.ArrayMap<K, V> {
    private int hashCode;

    public void clear() {
        this.hashCode = 0;
        super.clear();
    }

    public V setValueAt(int i, V v) {
        this.hashCode = 0;
        return (V) super.setValueAt(i, v);
    }

    public V put(K k, V v) {
        this.hashCode = 0;
        return (V) super.put(k, v);
    }

    public void putAll(androidx.collection.SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.hashCode = 0;
        super.putAll(simpleArrayMap);
    }

    public V removeAt(int i) {
        this.hashCode = 0;
        return (V) super.removeAt(i);
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = super.hashCode();
        }
        return this.hashCode;
    }
}
