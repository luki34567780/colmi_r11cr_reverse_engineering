package androidx.core.util;

/* compiled from: LruCache.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001aû\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000628\b\u0006\u0010\u0007\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\b2%\b\u0006\u0010\r\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u000e2d\b\u0006\u0010\u000f\u001a^\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"lruCache", "Landroid/util/LruCache;", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "maxSize", "", "sizeOf", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "value", "create", "Lkotlin/Function1;", "onEntryRemoved", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "", "core-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LruCacheKt {
    public static /* synthetic */ android.util.LruCache lruCache$default(int i, kotlin.jvm.functions.Function2 sizeOf, kotlin.jvm.functions.Function1 create, kotlin.jvm.functions.Function4 onEntryRemoved, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            sizeOf = new kotlin.jvm.functions.Function2<K, V, java.lang.Integer>() { // from class: androidx.core.util.LruCacheKt$lruCache$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Integer invoke(K noName_0, V noName_1) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
                    return 1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke((androidx.core.util.LruCacheKt$lruCache$1<K, V>) obj2, obj3);
                }
            };
        }
        if ((i2 & 4) != 0) {
            create = new kotlin.jvm.functions.Function1<K, V>() { // from class: androidx.core.util.LruCacheKt$lruCache$2
                @Override // kotlin.jvm.functions.Function1
                public final V invoke(K it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return null;
                }
            };
        }
        if ((i2 & 8) != 0) {
            onEntryRemoved = new kotlin.jvm.functions.Function4<java.lang.Boolean, K, V, V, kotlin.Unit>() { // from class: androidx.core.util.LruCacheKt$lruCache$3
                public final void invoke(boolean z, K noName_1, V noName_2, V v) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_2, "$noName_2");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke(bool.booleanValue(), (boolean) obj2, obj3, obj4);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(create, "create");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new androidx.core.util.LruCacheKt$lruCache$4(sizeOf, create, onEntryRemoved, i);
    }

    public static final <K, V> android.util.LruCache<K, V> lruCache(int i, kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> sizeOf, kotlin.jvm.functions.Function1<? super K, ? extends V> create, kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super K, ? super V, ? super V, kotlin.Unit> onEntryRemoved) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(create, "create");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new androidx.core.util.LruCacheKt$lruCache$4(sizeOf, create, onEntryRemoved, i);
    }
}
