package io.reactivex.observables;

/* loaded from: classes3.dex */
public abstract class GroupedObservable<K, T> extends io.reactivex.Observable<T> {
    final K key;

    protected GroupedObservable(K k) {
        this.key = k;
    }

    public K getKey() {
        return this.key;
    }
}
