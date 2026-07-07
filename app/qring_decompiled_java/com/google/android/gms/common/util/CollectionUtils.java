package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isEmpty(java.util.Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf() {
        return java.util.Collections.emptyList();
    }

    public static <K, V> java.util.Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3) {
        java.util.Map zza = zza(3, false);
        zza.put(k, v);
        zza.put(k2, v2);
        zza.put(k3, v3);
        return java.util.Collections.unmodifiableMap(zza);
    }

    public static <K, V> java.util.Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (length == 0) {
            return java.util.Collections.emptyMap();
        }
        if (length == 1) {
            return java.util.Collections.singletonMap(kArr[0], vArr[0]);
        }
        java.util.Map zza = zza(length, false);
        for (int i = 0; i < kArr.length; i++) {
            zza.put(kArr[i], vArr[i]);
        }
        return java.util.Collections.unmodifiableMap(zza);
    }

    public static <T> java.util.Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new androidx.collection.ArraySet() : zzb(i, true);
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T t, T t2, T t3) {
        java.util.Set zzb = zzb(3, false);
        zzb.add(t);
        zzb.add(t2);
        zzb.add(t3);
        return java.util.Collections.unmodifiableSet(zzb);
    }

    private static <K, V> java.util.Map<K, V> zza(int i, boolean z) {
        return i <= 256 ? new androidx.collection.ArrayMap(i) : new java.util.HashMap(i, 1.0f);
    }

    private static <T> java.util.Set<T> zzb(int i, boolean z) {
        return i <= (true != z ? 256 : com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4) ? new androidx.collection.ArraySet(i) : new java.util.HashSet(i, true != z ? 1.0f : 0.75f);
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T t) {
        return java.util.Collections.singletonList(t);
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return listOf();
        }
        if (length == 1) {
            return listOf(tArr[0]);
        }
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(tArr));
    }

    public static <K, V> java.util.Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        java.util.Map zza = zza(6, false);
        zza.put(k, v);
        zza.put(k2, v2);
        zza.put(k3, v3);
        zza.put(k4, v4);
        zza.put(k5, v5);
        zza.put(k6, v6);
        return java.util.Collections.unmodifiableMap(zza);
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return java.util.Collections.emptySet();
        }
        if (length == 1) {
            return java.util.Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            java.util.Set zzb = zzb(2, false);
            zzb.add(t);
            zzb.add(t2);
            return java.util.Collections.unmodifiableSet(zzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length == 4) {
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            java.util.Set zzb2 = zzb(4, false);
            zzb2.add(t3);
            zzb2.add(t4);
            zzb2.add(t5);
            zzb2.add(t6);
            return java.util.Collections.unmodifiableSet(zzb2);
        }
        java.util.Set zzb3 = zzb(length, false);
        java.util.Collections.addAll(zzb3, tArr);
        return java.util.Collections.unmodifiableSet(zzb3);
    }
}
