package io.fotoapparat.selector;

/* compiled from: Selectors.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\t\u001a^\u0010\u0000\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001¢\u0006\u0002\b\u0004\"\b\b\u0000\u0010\u0003*\u00020\u00052\u001f\u0010\u0006\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001¢\u0006\u0002\b\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u0001\u001af\u0010\t\u001a\u0015\u0012\u0004\u0012\u0002H\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0001¢\u0006\u0002\b\u0004\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b28\u0010\f\u001a\u001d\u0012\u0019\b\u0001\u0012\u0015\u0012\u0004\u0012\u0002H\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0001¢\u0006\u0002\b\u00040\r\"\u0015\u0012\u0004\u0012\u0002H\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u000e\u001a/\u0010\u000f\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001¢\u0006\u0002\b\u0004\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0010\u001a/\u0010\u0011\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001¢\u0006\u0002\b\u0004\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0010\u001a%\u0010\u0012\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001¢\u0006\u0002\b\u0004\"\u0004\b\u0000\u0010\u0003\u001a2\u0010\u0013\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001¢\u0006\u0002\b\u0004\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0014\u001a\u0002H\u0003¢\u0006\u0002\u0010\u0015\u001a?\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\b\b\u0000\u0010\u0003*\u00020\u0005\"\u0004\b\u0001\u0010\u0017*\b\u0012\u0004\u0012\u0002H\u00030\r2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00170\u0001H\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"filtered", "Lkotlin/Function1;", "", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/ExtensionFunctionType;", "", "selector", "predicate", "", "firstAvailable", "Input", "Output", "functions", "", "([Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "highest", "", "lowest", "nothing", "single", "preference", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "findNonNull", "R", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class SelectorsKt {
    public static final <T> kotlin.jvm.functions.Function1<java.lang.Iterable<? extends T>, T> nothing() {
        return new kotlin.jvm.functions.Function1() { // from class: io.fotoapparat.selector.SelectorsKt$nothing$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(java.lang.Iterable<? extends T> receiver$0) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
                return null;
            }
        };
    }

    public static final <T> kotlin.jvm.functions.Function1<java.lang.Iterable<? extends T>, T> single(final T t) {
        return new kotlin.jvm.functions.Function1<java.lang.Iterable<? extends T>, T>() { // from class: io.fotoapparat.selector.SelectorsKt$single$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final T invoke(java.lang.Iterable<? extends T> receiver$0) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
                for (T t2 : receiver$0) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(t2, t)) {
                        return t2;
                    }
                }
                return null;
            }
        };
    }

    public static final <T extends java.lang.Comparable<? super T>> kotlin.jvm.functions.Function1<java.lang.Iterable<? extends T>, T> highest() {
        return io.fotoapparat.selector.SelectorsKt$highest$1.INSTANCE;
    }

    public static final <T extends java.lang.Comparable<? super T>> kotlin.jvm.functions.Function1<java.lang.Iterable<? extends T>, T> lowest() {
        return io.fotoapparat.selector.SelectorsKt$lowest$1.INSTANCE;
    }

    @java.lang.SafeVarargs
    public static final <Input, Output> kotlin.jvm.functions.Function1<Input, Output> firstAvailable(final kotlin.jvm.functions.Function1<? super Input, ? extends Output>... functions) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functions, "functions");
        return new kotlin.jvm.functions.Function1<Input, Output>() { // from class: io.fotoapparat.selector.SelectorsKt$firstAvailable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Output invoke(final Input input) {
                java.lang.Object findNonNull;
                findNonNull = io.fotoapparat.selector.SelectorsKt.findNonNull(functions, new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super Input, ? extends Output>, Output>() { // from class: io.fotoapparat.selector.SelectorsKt$firstAvailable$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Output invoke(kotlin.jvm.functions.Function1<? super Input, ? extends Output> it) {
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                        return it.invoke((java.lang.Object) input);
                    }
                });
                return (Output) findNonNull;
            }
        };
    }

    public static final <T> kotlin.jvm.functions.Function1<java.lang.Iterable<? extends T>, T> filtered(final kotlin.jvm.functions.Function1<? super java.lang.Iterable<? extends T>, ? extends T> selector, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(selector, "selector");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return new kotlin.jvm.functions.Function1<java.lang.Iterable<? extends T>, T>() { // from class: io.fotoapparat.selector.SelectorsKt$filtered$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final T invoke(java.lang.Iterable<? extends T> receiver$0) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
                kotlin.jvm.functions.Function1 function1 = kotlin.jvm.functions.Function1.this;
                kotlin.jvm.functions.Function1 function12 = predicate;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (T t : receiver$0) {
                    if (((java.lang.Boolean) function12.invoke(t)).booleanValue()) {
                        arrayList.add(t);
                    }
                }
                return (T) function1.invoke(arrayList);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, R> R findNonNull(T[] tArr, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        for (T t : tArr) {
            R invoke = function1.invoke(t);
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }
}
