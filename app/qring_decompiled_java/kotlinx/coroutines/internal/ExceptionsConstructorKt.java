package kotlinx.coroutines.internal;

/* compiled from: ExceptionsConstructor.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\b\u001a!\u0010\u0010\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u0011\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0015\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0018"}, d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", "", "createConstructor", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "clz", "Ljava/lang/Class;", "createSafeConstructor", "constructor", "Ljava/lang/reflect/Constructor;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExceptionsConstructorKt {
    private static final kotlinx.coroutines.internal.CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(java.lang.Throwable.class, -1);

    static {
        kotlinx.coroutines.internal.WeakMapCtorCache weakMapCtorCache;
        try {
            weakMapCtorCache = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED() ? kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE : kotlinx.coroutines.internal.ClassValueCtorCache.INSTANCE;
        } catch (java.lang.Throwable unused) {
            weakMapCtorCache = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE;
        }
        ctorCache = weakMapCtorCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends java.lang.Throwable> E tryCopyException(E e) {
        java.lang.Object m1091constructorimpl;
        if (e instanceof kotlinx.coroutines.CopyableThrowable) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m1091constructorimpl = kotlin.Result.m1091constructorimpl(((kotlinx.coroutines.CopyableThrowable) e).createCopy());
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m1091constructorimpl = kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m1097isFailureimpl(m1091constructorimpl)) {
                m1091constructorimpl = null;
            }
            return (E) m1091constructorimpl;
        }
        return (E) ctorCache.get(e.getClass()).invoke(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends java.lang.Throwable> kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createConstructor(java.lang.Class<E> cls) {
        kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(java.lang.Throwable th) {
                return null;
            }
        };
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        java.util.Iterator it = kotlin.collections.ArraysKt.sortedWith(cls.getConstructors(), new java.util.Comparator() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((java.lang.reflect.Constructor) t2).getParameterTypes().length), java.lang.Integer.valueOf(((java.lang.reflect.Constructor) t).getParameterTypes().length));
            }
        }).iterator();
        while (it.hasNext()) {
            kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createSafeConstructor = createSafeConstructor((java.lang.reflect.Constructor) it.next());
            if (createSafeConstructor != null) {
                return createSafeConstructor;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createSafeConstructor(final java.lang.reflect.Constructor<?> constructor) {
        java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Throwable invoke(java.lang.Throwable th) {
                    java.lang.Object m1091constructorimpl;
                    java.lang.Object newInstance;
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        newInstance = constructor.newInstance(new java.lang.Object[0]);
                    } catch (java.lang.Throwable th2) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m1091constructorimpl = kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(th2));
                    }
                    if (newInstance != null) {
                        java.lang.Throwable th3 = (java.lang.Throwable) newInstance;
                        th3.initCause(th);
                        m1091constructorimpl = kotlin.Result.m1091constructorimpl(th3);
                        if (kotlin.Result.m1097isFailureimpl(m1091constructorimpl)) {
                            m1091constructorimpl = null;
                        }
                        return (java.lang.Throwable) m1091constructorimpl;
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
            };
        }
        if (length != 1) {
            if (length == 2 && kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[0], java.lang.String.class) && kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[1], java.lang.Throwable.class)) {
                return new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Throwable invoke(java.lang.Throwable th) {
                        java.lang.Object m1091constructorimpl;
                        java.lang.Object newInstance;
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            newInstance = constructor.newInstance(th.getMessage(), th);
                        } catch (java.lang.Throwable th2) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m1091constructorimpl = kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(th2));
                        }
                        if (newInstance != null) {
                            m1091constructorimpl = kotlin.Result.m1091constructorimpl((java.lang.Throwable) newInstance);
                            if (kotlin.Result.m1097isFailureimpl(m1091constructorimpl)) {
                                m1091constructorimpl = null;
                            }
                            return (java.lang.Throwable) m1091constructorimpl;
                        }
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                };
            }
            return null;
        }
        java.lang.Class<?> cls = parameterTypes[0];
        if (!kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Throwable.class)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.String.class)) {
                return new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Throwable invoke(java.lang.Throwable th) {
                        java.lang.Object m1091constructorimpl;
                        java.lang.Object newInstance;
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            newInstance = constructor.newInstance(th.getMessage());
                        } catch (java.lang.Throwable th2) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m1091constructorimpl = kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(th2));
                        }
                        if (newInstance != null) {
                            java.lang.Throwable th3 = (java.lang.Throwable) newInstance;
                            th3.initCause(th);
                            m1091constructorimpl = kotlin.Result.m1091constructorimpl(th3);
                            if (kotlin.Result.m1097isFailureimpl(m1091constructorimpl)) {
                                m1091constructorimpl = null;
                            }
                            return (java.lang.Throwable) m1091constructorimpl;
                        }
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                };
            }
            return null;
        }
        return new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Throwable invoke(java.lang.Throwable th) {
                java.lang.Object m1091constructorimpl;
                java.lang.Object newInstance;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    newInstance = constructor.newInstance(th);
                } catch (java.lang.Throwable th2) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m1091constructorimpl = kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(th2));
                }
                if (newInstance != null) {
                    m1091constructorimpl = kotlin.Result.m1091constructorimpl((java.lang.Throwable) newInstance);
                    if (kotlin.Result.m1097isFailureimpl(m1091constructorimpl)) {
                        m1091constructorimpl = null;
                    }
                    return (java.lang.Throwable) m1091constructorimpl;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
        };
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> safeCtor(final kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> function1) {
        return new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Throwable invoke(java.lang.Throwable th) {
                java.lang.Object m1091constructorimpl;
                kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> function12 = function1;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    m1091constructorimpl = kotlin.Result.m1091constructorimpl(function12.invoke(th));
                } catch (java.lang.Throwable th2) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m1091constructorimpl = kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(th2));
                }
                if (kotlin.Result.m1097isFailureimpl(m1091constructorimpl)) {
                    m1091constructorimpl = null;
                }
                return (java.lang.Throwable) m1091constructorimpl;
            }
        };
    }

    private static final int fieldsCountOrDefault(java.lang.Class<?> cls, int i) {
        java.lang.Object m1091constructorimpl;
        kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m1091constructorimpl = kotlin.Result.m1091constructorimpl(java.lang.Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m1091constructorimpl = kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        if (kotlin.Result.m1097isFailureimpl(m1091constructorimpl)) {
            m1091constructorimpl = valueOf;
        }
        return ((java.lang.Number) m1091constructorimpl).intValue();
    }

    static /* synthetic */ int fieldsCount$default(java.lang.Class cls, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCount(java.lang.Class<?> cls, int i) {
        do {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                java.lang.reflect.Field field = declaredFields[i2];
                i2++;
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    i3++;
                }
            }
            i += i3;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }
}
