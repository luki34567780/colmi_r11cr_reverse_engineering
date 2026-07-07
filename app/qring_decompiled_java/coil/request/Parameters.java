package coil.request;

/* compiled from: Parameters.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003\u001f !B\u0007\b\u0016¢\u0006\u0002\u0010\u0005B\u001b\b\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0006\u0010\u0013\u001a\u00020\u000fJ\u001b\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0015H\u0096\u0002J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0003J\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u001f\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\b\b\u0000\u0010\u001c*\u00020\u00112\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0007R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\""}, d2 = {"Lcoil/request/Parameters;", "", "Lkotlin/Pair;", "", "Lcoil/request/Parameters$Entry;", "()V", "entries", "", "(Ljava/util/Map;)V", "size", "", "()I", "entry", "key", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "isEmpty", "iterator", "", "memoryCacheKey", "memoryCacheKeys", "newBuilder", "Lcoil/request/Parameters$Builder;", "toString", "value", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/String;)Ljava/lang/Object;", "values", "Builder", "Companion", "Entry", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Parameters implements java.lang.Iterable<kotlin.Pair<? extends java.lang.String, ? extends coil.request.Parameters.Entry>>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final coil.request.Parameters EMPTY = new coil.request.Parameters();
    private final java.util.Map<java.lang.String, coil.request.Parameters.Entry> entries;

    public /* synthetic */ Parameters(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    private Parameters(java.util.Map<java.lang.String, coil.request.Parameters.Entry> map) {
        this.entries = map;
    }

    public Parameters() {
        this(kotlin.collections.MapsKt.emptyMap());
    }

    public final int size() {
        return this.entries.size();
    }

    public final <T> T value(java.lang.String key) {
        coil.request.Parameters.Entry entry = this.entries.get(key);
        if (entry == null) {
            return null;
        }
        return (T) entry.getValue();
    }

    public final java.lang.String memoryCacheKey(java.lang.String key) {
        coil.request.Parameters.Entry entry = this.entries.get(key);
        if (entry == null) {
            return null;
        }
        return entry.getMemoryCacheKey();
    }

    public final coil.request.Parameters.Entry entry(java.lang.String key) {
        return this.entries.get(key);
    }

    public final boolean isEmpty() {
        return this.entries.isEmpty();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> values() {
        if (isEmpty()) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map<java.lang.String, coil.request.Parameters.Entry> map = this.entries;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((coil.request.Parameters.Entry) entry.getValue()).getValue());
        }
        return linkedHashMap;
    }

    public final java.util.Map<java.lang.String, java.lang.String> memoryCacheKeys() {
        if (isEmpty()) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map<java.lang.String, coil.request.Parameters.Entry> map = this.entries;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, coil.request.Parameters.Entry> entry : map.entrySet()) {
            java.lang.String memoryCacheKey = entry.getValue().getMemoryCacheKey();
            if (memoryCacheKey != null) {
                linkedHashMap.put(entry.getKey(), memoryCacheKey);
            }
        }
        return linkedHashMap;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<kotlin.Pair<? extends java.lang.String, ? extends coil.request.Parameters.Entry>> iterator() {
        java.util.Map<java.lang.String, coil.request.Parameters.Entry> map = this.entries;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry<java.lang.String, coil.request.Parameters.Entry> entry : map.entrySet()) {
            arrayList.add(kotlin.TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof coil.request.Parameters) && kotlin.jvm.internal.Intrinsics.areEqual(this.entries, ((coil.request.Parameters) other).entries);
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    public java.lang.String toString() {
        return "Parameters(entries=" + this.entries + ')';
    }

    public final coil.request.Parameters.Builder newBuilder() {
        return new coil.request.Parameters.Builder(this);
    }

    /* compiled from: Parameters.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcoil/request/Parameters$Entry;", "", "value", "memoryCacheKey", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getMemoryCacheKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Entry {
        private final java.lang.String memoryCacheKey;
        private final java.lang.Object value;

        public Entry(java.lang.Object obj, java.lang.String str) {
            this.value = obj;
            this.memoryCacheKey = str;
        }

        public final java.lang.Object getValue() {
            return this.value;
        }

        public final java.lang.String getMemoryCacheKey() {
            return this.memoryCacheKey;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof coil.request.Parameters.Entry) {
                coil.request.Parameters.Entry entry = (coil.request.Parameters.Entry) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.value, entry.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.memoryCacheKey, entry.memoryCacheKey)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            java.lang.Object obj = this.value;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            java.lang.String str = this.memoryCacheKey;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "Entry(value=" + this.value + ", memoryCacheKey=" + ((java.lang.Object) this.memoryCacheKey) + ')';
        }
    }

    /* compiled from: Parameters.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ&\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0007R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcoil/request/Parameters$Builder;", "", "()V", "parameters", "Lcoil/request/Parameters;", "(Lcoil/request/Parameters;)V", "entries", "", "", "Lcoil/request/Parameters$Entry;", "build", "remove", "key", "set", "value", "memoryCacheKey", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private final java.util.Map<java.lang.String, coil.request.Parameters.Entry> entries;

        public final coil.request.Parameters.Builder set(java.lang.String str, java.lang.Object obj) {
            return set$default(this, str, obj, null, 4, null);
        }

        public Builder() {
            this.entries = new java.util.LinkedHashMap();
        }

        public Builder(coil.request.Parameters parameters) {
            this.entries = kotlin.collections.MapsKt.toMutableMap(parameters.entries);
        }

        public static /* synthetic */ coil.request.Parameters.Builder set$default(coil.request.Parameters.Builder builder, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 4) != 0) {
                str2 = obj == null ? null : obj.toString();
            }
            return builder.set(str, obj, str2);
        }

        public final coil.request.Parameters.Builder set(java.lang.String key, java.lang.Object value, java.lang.String memoryCacheKey) {
            this.entries.put(key, new coil.request.Parameters.Entry(value, memoryCacheKey));
            return this;
        }

        public final coil.request.Parameters.Builder remove(java.lang.String key) {
            this.entries.remove(key);
            return this;
        }

        public final coil.request.Parameters build() {
            return new coil.request.Parameters(coil.util.Collections.toImmutableMap(this.entries), null);
        }
    }
}
