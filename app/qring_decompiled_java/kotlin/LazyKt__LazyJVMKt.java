package kotlin;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\t"}, d2 = {"lazy", "Lkotlin/Lazy;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/LazyKt")
/* loaded from: classes3.dex */
public class LazyKt__LazyJVMKt {

    /* compiled from: LazyJVM.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.LazyThreadSafetyMode.values().length];
            iArr[kotlin.LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            iArr[kotlin.LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            iArr[kotlin.LazyThreadSafetyMode.NONE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> kotlin.Lazy<T> lazy(kotlin.jvm.functions.Function0<? extends T> initializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializer, "initializer");
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        return new kotlin.SynchronizedLazyImpl(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final <T> kotlin.Lazy<T> lazy(kotlin.LazyThreadSafetyMode mode, kotlin.jvm.functions.Function0<? extends T> initializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i = kotlin.LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        int i2 = 2;
        if (i == 1) {
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            return new kotlin.SynchronizedLazyImpl(initializer, defaultConstructorMarker, i2, defaultConstructorMarker);
        }
        if (i == 2) {
            return new kotlin.SafePublicationLazyImpl(initializer);
        }
        if (i == 3) {
            return new kotlin.UnsafeLazyImpl(initializer);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T> kotlin.Lazy<T> lazy(java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> initializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new kotlin.SynchronizedLazyImpl(initializer, obj);
    }
}
