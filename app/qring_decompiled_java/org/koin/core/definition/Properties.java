package org.koin.core.definition;

/* compiled from: Properties.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÂ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u001c\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0002\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J$\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u0002H\fH\u0086\u0002¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/koin/core/definition/Properties;", "", com.autonavi.base.amap.mapcore.AeUtil.ROOT_DATA_PATH_OLD_NAME, "", "", "(Ljava/util/Map;)V", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "get", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "key", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrNull", "hashCode", "", "set", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "toString", "koin-core"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final /* data */ class Properties {
    private final java.util.Map<java.lang.String, java.lang.Object> data;

    /* JADX WARN: Multi-variable type inference failed */
    public Properties() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final java.util.Map<java.lang.String, java.lang.Object> component1() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ org.koin.core.definition.Properties copy$default(org.koin.core.definition.Properties properties, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = properties.data;
        }
        return properties.copy(map);
    }

    public final org.koin.core.definition.Properties copy(java.util.Map<java.lang.String, java.lang.Object> data) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(data, "data");
        return new org.koin.core.definition.Properties(data);
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof org.koin.core.definition.Properties) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((org.koin.core.definition.Properties) other).data);
        }
        return true;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.data;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return "Properties(data=" + this.data + ")";
    }

    public Properties(java.util.Map<java.lang.String, java.lang.Object> data) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(data, "data");
        this.data = data;
    }

    public /* synthetic */ Properties(java.util.concurrent.ConcurrentHashMap concurrentHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.concurrent.ConcurrentHashMap() : concurrentHashMap);
    }

    public final <T> void set(java.lang.String key, T value) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        java.util.Map<java.lang.String, java.lang.Object> map = this.data;
        if (value == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map.put(key, value);
    }

    public final <T> T getOrNull(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        T t = (T) this.data.get(key);
        if (t instanceof java.lang.Object) {
            return t;
        }
        return null;
    }

    public final <T> T get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        T t = (T) this.data.get(key);
        if (!(t instanceof java.lang.Object)) {
            t = null;
        }
        if (t != null) {
            return t;
        }
        throw new org.koin.core.error.MissingPropertyException("missing property for '" + key + '\'');
    }
}
