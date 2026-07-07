package coil.memory;

/* compiled from: MemoryCache.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aJ\b\u0010\r\u001a\u00020\u000eH&J\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0004H¦\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0019\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0010H¦\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u001b"}, d2 = {"Lcoil/memory/MemoryCache;", "", "keys", "", "Lcoil/memory/MemoryCache$Key;", "getKeys", "()Ljava/util/Set;", "maxSize", "", "getMaxSize", "()I", "size", "getSize", "clear", "", "get", "Lcoil/memory/MemoryCache$Value;", "key", "remove", "", "set", "value", "trimMemory", "level", "Builder", "Key", "Value", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MemoryCache {
    void clear();

    coil.memory.MemoryCache.Value get(coil.memory.MemoryCache.Key key);

    java.util.Set<coil.memory.MemoryCache.Key> getKeys();

    int getMaxSize();

    int getSize();

    boolean remove(coil.memory.MemoryCache.Key key);

    void set(coil.memory.MemoryCache.Key key, coil.memory.MemoryCache.Value value);

    void trimMemory(int level);

    /* compiled from: MemoryCache.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "key", "", "extras", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getExtras", "()Ljava/util/Map;", "getKey", "()Ljava/lang/String;", "copy", "describeContents", "", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Key implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<coil.memory.MemoryCache.Key> CREATOR = new coil.memory.MemoryCache.Key.Creator();
        private final java.util.Map<java.lang.String, java.lang.String> extras;
        private final java.lang.String key;

        /* compiled from: MemoryCache.kt */
        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<coil.memory.MemoryCache.Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final coil.memory.MemoryCache.Key createFromParcel(android.os.Parcel parcel) {
                java.lang.String readString = parcel.readString();
                int readInt = parcel.readInt();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new coil.memory.MemoryCache.Key(readString, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final coil.memory.MemoryCache.Key[] newArray(int i) {
                return new coil.memory.MemoryCache.Key[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int flags) {
            parcel.writeString(this.key);
            java.util.Map<java.lang.String, java.lang.String> map = this.extras;
            parcel.writeInt(map.size());
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public Key(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            this.key = str;
            this.extras = map;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        public /* synthetic */ Key(java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<java.lang.String, java.lang.String> getExtras() {
            return this.extras;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ coil.memory.MemoryCache.Key copy$default(coil.memory.MemoryCache.Key key, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = key.key;
            }
            if ((i & 2) != 0) {
                map = key.extras;
            }
            return key.copy(str, map);
        }

        public final coil.memory.MemoryCache.Key copy(java.lang.String key, java.util.Map<java.lang.String, java.lang.String> extras) {
            return new coil.memory.MemoryCache.Key(key, extras);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof coil.memory.MemoryCache.Key) {
                coil.memory.MemoryCache.Key key = (coil.memory.MemoryCache.Key) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.key, key.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, key.extras)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.extras.hashCode();
        }

        public java.lang.String toString() {
            return "Key(key=" + this.key + ", extras=" + this.extras + ')';
        }
    }

    /* compiled from: MemoryCache.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcoil/memory/MemoryCache$Value;", "", "bitmap", "Landroid/graphics/Bitmap;", "extras", "", "", "(Landroid/graphics/Bitmap;Ljava/util/Map;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getExtras", "()Ljava/util/Map;", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Value {
        private final android.graphics.Bitmap bitmap;
        private final java.util.Map<java.lang.String, java.lang.Object> extras;

        public Value(android.graphics.Bitmap bitmap, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            this.bitmap = bitmap;
            this.extras = map;
        }

        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public /* synthetic */ Value(android.graphics.Bitmap bitmap, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getExtras() {
            return this.extras;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ coil.memory.MemoryCache.Value copy$default(coil.memory.MemoryCache.Value value, android.graphics.Bitmap bitmap, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bitmap = value.bitmap;
            }
            if ((i & 2) != 0) {
                map = value.extras;
            }
            return value.copy(bitmap, map);
        }

        public final coil.memory.MemoryCache.Value copy(android.graphics.Bitmap bitmap, java.util.Map<java.lang.String, ? extends java.lang.Object> extras) {
            return new coil.memory.MemoryCache.Value(bitmap, extras);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof coil.memory.MemoryCache.Value) {
                coil.memory.MemoryCache.Value value = (coil.memory.MemoryCache.Value) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.bitmap, value.bitmap) && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, value.extras)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.bitmap.hashCode() * 31) + this.extras.hashCode();
        }

        public java.lang.String toString() {
            return "Value(bitmap=" + this.bitmap + ", extras=" + this.extras + ')';
        }
    }

    /* compiled from: MemoryCache.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcoil/memory/MemoryCache$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "maxSizeBytes", "", "maxSizePercent", "", "strongReferencesEnabled", "", "weakReferencesEnabled", "build", "Lcoil/memory/MemoryCache;", "size", "percent", "enable", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private final android.content.Context context;
        private int maxSizeBytes;
        private double maxSizePercent;
        private boolean strongReferencesEnabled = true;
        private boolean weakReferencesEnabled = true;

        public Builder(android.content.Context context) {
            this.context = context;
            this.maxSizePercent = coil.util.Utils.defaultMemoryCacheSizePercent(context);
        }

        public final coil.memory.MemoryCache.Builder maxSizePercent(double percent) {
            if (!(0.0d <= percent && percent <= 1.0d)) {
                throw new java.lang.IllegalArgumentException("size must be in the range [0.0, 1.0].".toString());
            }
            this.maxSizeBytes = 0;
            this.maxSizePercent = percent;
            return this;
        }

        public final coil.memory.MemoryCache.Builder maxSizeBytes(int size) {
            if (!(size >= 0)) {
                throw new java.lang.IllegalArgumentException("size must be >= 0.".toString());
            }
            this.maxSizePercent = 0.0d;
            this.maxSizeBytes = size;
            return this;
        }

        public final coil.memory.MemoryCache.Builder strongReferencesEnabled(boolean enable) {
            this.strongReferencesEnabled = enable;
            return this;
        }

        public final coil.memory.MemoryCache.Builder weakReferencesEnabled(boolean enable) {
            this.weakReferencesEnabled = enable;
            return this;
        }

        public final coil.memory.MemoryCache build() {
            coil.memory.EmptyWeakMemoryCache emptyWeakMemoryCache;
            coil.memory.EmptyStrongMemoryCache emptyStrongMemoryCache;
            int i;
            if (this.weakReferencesEnabled) {
                emptyWeakMemoryCache = new coil.memory.RealWeakMemoryCache();
            } else {
                emptyWeakMemoryCache = new coil.memory.EmptyWeakMemoryCache();
            }
            if (this.strongReferencesEnabled) {
                double d = this.maxSizePercent;
                if (d > 0.0d) {
                    i = coil.util.Utils.calculateMemoryCacheSize(this.context, d);
                } else {
                    i = this.maxSizeBytes;
                }
                if (i > 0) {
                    emptyStrongMemoryCache = new coil.memory.RealStrongMemoryCache(i, emptyWeakMemoryCache);
                } else {
                    emptyStrongMemoryCache = new coil.memory.EmptyStrongMemoryCache(emptyWeakMemoryCache);
                }
            } else {
                emptyStrongMemoryCache = new coil.memory.EmptyStrongMemoryCache(emptyWeakMemoryCache);
            }
            return new coil.memory.RealMemoryCache(emptyStrongMemoryCache, emptyWeakMemoryCache);
        }
    }
}
