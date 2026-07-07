package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public class MapUtils {

    public interface Closure<K, V> {
        void execute(K k, V v);
    }

    public interface Transformer<K1, V1, K2, V2> {
        android.util.Pair<K2, V2> transform(K1 k1, V1 v1);
    }

    private MapUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    @java.lang.SafeVarargs
    public static <K, V> java.util.Map<K, V> newUnmodifiableMap(android.util.Pair<K, V>... pairArr) {
        return java.util.Collections.unmodifiableMap(newHashMap(pairArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.SafeVarargs
    public static <K, V> java.util.HashMap<K, V> newHashMap(android.util.Pair<K, V>... pairArr) {
        com.google.android.gms.internal.auth.zzfk zzfkVar = (java.util.HashMap<K, V>) new java.util.HashMap();
        if (pairArr != null && pairArr.length != 0) {
            for (android.util.Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    zzfkVar.put(pair.first, pair.second);
                }
            }
        }
        return zzfkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.SafeVarargs
    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMap(android.util.Pair<K, V>... pairArr) {
        com.google.android.gms.internal.auth.zzfk zzfkVar = (java.util.LinkedHashMap<K, V>) new java.util.LinkedHashMap();
        if (pairArr != null && pairArr.length != 0) {
            for (android.util.Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    zzfkVar.put(pair.first, pair.second);
                }
            }
        }
        return zzfkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.SafeVarargs
    public static <K, V> java.util.TreeMap<K, V> newTreeMap(java.util.Comparator<K> comparator, android.util.Pair<K, V>... pairArr) {
        if (comparator == null) {
            throw new java.lang.IllegalArgumentException("comparator must not be null");
        }
        com.bumptech.glide.load.engine.bitmap_recycle.PrettyPrintTreeMap prettyPrintTreeMap = (java.util.TreeMap<K, V>) new java.util.TreeMap(comparator);
        if (pairArr != null && pairArr.length != 0) {
            for (android.util.Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    prettyPrintTreeMap.put(pair.first, pair.second);
                }
            }
        }
        return prettyPrintTreeMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.SafeVarargs
    public static <K, V> java.util.Hashtable<K, V> newHashTable(android.util.Pair<K, V>... pairArr) {
        org.apache.commons.logging.impl.WeakHashtable weakHashtable = (java.util.Hashtable<K, V>) new java.util.Hashtable();
        if (pairArr != null && pairArr.length != 0) {
            for (android.util.Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    weakHashtable.put(pair.first, pair.second);
                }
            }
        }
        return weakHashtable;
    }

    public static boolean isEmpty(java.util.Map map) {
        return map == null || map.size() == 0;
    }

    public static boolean isNotEmpty(java.util.Map map) {
        return !isEmpty(map);
    }

    public static int size(java.util.Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static <K, V> void forAllDo(java.util.Map<K, V> map, com.blankj.utilcode.util.MapUtils.Closure<K, V> closure) {
        if (map == null || closure == null) {
            return;
        }
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            closure.execute(entry.getKey(), entry.getValue());
        }
    }

    public static <K1, V1, K2, V2> java.util.Map<K2, V2> transform(java.util.Map<K1, V1> map, final com.blankj.utilcode.util.MapUtils.Transformer<K1, V1, K2, V2> transformer) {
        if (map != null && transformer != null) {
            try {
                final java.util.Map<K2, V2> map2 = (java.util.Map) map.getClass().newInstance();
                forAllDo(map, new com.blankj.utilcode.util.MapUtils.Closure<K1, V1>() { // from class: com.blankj.utilcode.util.MapUtils.1
                    @Override // com.blankj.utilcode.util.MapUtils.Closure
                    public void execute(K1 k1, V1 v1) {
                        android.util.Pair transform = com.blankj.utilcode.util.MapUtils.Transformer.this.transform(k1, v1);
                        map2.put(transform.first, transform.second);
                    }
                });
                return map2;
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
            } catch (java.lang.InstantiationException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static java.lang.String toString(java.util.Map map) {
        return map == null ? "null" : map.toString();
    }
}
