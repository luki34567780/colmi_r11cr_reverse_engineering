package coil.request;

/* compiled from: Tags.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\b\u0002\u0012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00010\u0003J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u000eJ'\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00012\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\r0\u0004¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcoil/request/Tags;", "", "tags", "", "Ljava/lang/Class;", "(Ljava/util/Map;)V", "asMap", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "tag", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "()Ljava/lang/Object;", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "", "Companion", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Tags {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil.request.Tags.Companion INSTANCE = new coil.request.Tags.Companion(null);
    public static final coil.request.Tags EMPTY = new coil.request.Tags(kotlin.collections.MapsKt.emptyMap());
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> tags;

    public /* synthetic */ Tags(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @kotlin.jvm.JvmStatic
    public static final coil.request.Tags from(java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> map) {
        return INSTANCE.from(map);
    }

    private Tags(java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> map) {
        this.tags = map;
    }

    public final /* synthetic */ <T> T tag() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        return (T) tag(java.lang.Object.class);
    }

    public final <T> T tag(java.lang.Class<? extends T> type) {
        return type.cast(this.tags.get(type));
    }

    public final java.util.Map<java.lang.Class<?>, java.lang.Object> asMap() {
        return this.tags;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof coil.request.Tags) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, ((coil.request.Tags) other).tags);
    }

    public int hashCode() {
        return this.tags.hashCode();
    }

    public java.lang.String toString() {
        return "Tags(tags=" + this.tags + ')';
    }

    /* compiled from: Tags.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcoil/request/Tags$Companion;", "", "()V", "EMPTY", "Lcoil/request/Tags;", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_FROM, "tags", "", "Ljava/lang/Class;", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final coil.request.Tags from(java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> tags) {
            return new coil.request.Tags(coil.util.Collections.toImmutableMap(tags), null);
        }
    }
}
