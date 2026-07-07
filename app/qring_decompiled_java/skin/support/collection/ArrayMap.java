package skin.support.collection;

/* loaded from: classes3.dex */
public class ArrayMap<K, V> extends skin.support.collection.SimpleArrayMap<K, V> implements java.util.Map<K, V> {
    skin.support.collection.MapCollections<K, V> mCollections;

    public ArrayMap() {
    }

    public ArrayMap(int i) {
        super(i);
    }

    public ArrayMap(skin.support.collection.SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    private skin.support.collection.MapCollections<K, V> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new skin.support.collection.MapCollections<K, V>() { // from class: skin.support.collection.ArrayMap.1
                @Override // skin.support.collection.MapCollections
                protected int colGetSize() {
                    return skin.support.collection.ArrayMap.this.mSize;
                }

                @Override // skin.support.collection.MapCollections
                protected java.lang.Object colGetEntry(int i, int i2) {
                    return skin.support.collection.ArrayMap.this.mArray[(i << 1) + i2];
                }

                @Override // skin.support.collection.MapCollections
                protected int colIndexOfKey(java.lang.Object obj) {
                    return skin.support.collection.ArrayMap.this.indexOfKey(obj);
                }

                @Override // skin.support.collection.MapCollections
                protected int colIndexOfValue(java.lang.Object obj) {
                    return skin.support.collection.ArrayMap.this.indexOfValue(obj);
                }

                @Override // skin.support.collection.MapCollections
                protected java.util.Map<K, V> colGetMap() {
                    return skin.support.collection.ArrayMap.this;
                }

                @Override // skin.support.collection.MapCollections
                protected void colPut(K k, V v) {
                    skin.support.collection.ArrayMap.this.put(k, v);
                }

                @Override // skin.support.collection.MapCollections
                protected V colSetValue(int i, V v) {
                    return skin.support.collection.ArrayMap.this.setValueAt(i, v);
                }

                @Override // skin.support.collection.MapCollections
                protected void colRemoveAt(int i) {
                    skin.support.collection.ArrayMap.this.removeAt(i);
                }

                @Override // skin.support.collection.MapCollections
                protected void colClear() {
                    skin.support.collection.ArrayMap.this.clear();
                }
            };
        }
        return this.mCollections;
    }

    public boolean containsAll(java.util.Collection<?> collection) {
        return skin.support.collection.MapCollections.containsAllHelper(this, collection);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(java.util.Collection<?> collection) {
        return skin.support.collection.MapCollections.removeAllHelper(this, collection);
    }

    public boolean retainAll(java.util.Collection<?> collection) {
        return skin.support.collection.MapCollections.retainAllHelper(this, collection);
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return getCollection().getEntrySet();
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
        return getCollection().getKeySet();
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
        return getCollection().getValues();
    }
}
