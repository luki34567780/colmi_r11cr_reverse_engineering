package retrofit2;

/* loaded from: classes3.dex */
class Platform {
    private static final retrofit2.Platform PLATFORM = findPlatform();
    private final boolean hasJava8Types;

    @javax.annotation.Nullable
    private final java.lang.reflect.Constructor<java.lang.invoke.MethodHandles.Lookup> lookupConstructor;

    @javax.annotation.Nullable
    java.util.concurrent.Executor defaultCallbackExecutor() {
        return null;
    }

    static retrofit2.Platform get() {
        return PLATFORM;
    }

    private static retrofit2.Platform findPlatform() {
        if ("Dalvik".equals(java.lang.System.getProperty("java.vm.name"))) {
            return new retrofit2.Platform.Android();
        }
        return new retrofit2.Platform(true);
    }

    Platform(boolean z) {
        this.hasJava8Types = z;
        java.lang.reflect.Constructor<java.lang.invoke.MethodHandles.Lookup> constructor = null;
        if (z) {
            try {
                constructor = java.lang.invoke.MethodHandles.Lookup.class.getDeclaredConstructor(java.lang.Class.class, java.lang.Integer.TYPE);
                constructor.setAccessible(true);
            } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodException unused) {
            }
        }
        this.lookupConstructor = constructor;
    }

    java.util.List<? extends retrofit2.CallAdapter.Factory> defaultCallAdapterFactories(@javax.annotation.Nullable java.util.concurrent.Executor executor) {
        retrofit2.DefaultCallAdapterFactory defaultCallAdapterFactory = new retrofit2.DefaultCallAdapterFactory(executor);
        return this.hasJava8Types ? java.util.Arrays.asList(retrofit2.CompletableFutureCallAdapterFactory.INSTANCE, defaultCallAdapterFactory) : java.util.Collections.singletonList(defaultCallAdapterFactory);
    }

    int defaultCallAdapterFactoriesSize() {
        return this.hasJava8Types ? 2 : 1;
    }

    java.util.List<? extends retrofit2.Converter.Factory> defaultConverterFactories() {
        return this.hasJava8Types ? java.util.Collections.singletonList(retrofit2.OptionalConverterFactory.INSTANCE) : java.util.Collections.emptyList();
    }

    int defaultConverterFactoriesSize() {
        return this.hasJava8Types ? 1 : 0;
    }

    boolean isDefaultMethod(java.lang.reflect.Method method) {
        return this.hasJava8Types && method.isDefault();
    }

    @javax.annotation.Nullable
    java.lang.Object invokeDefaultMethod(java.lang.reflect.Method method, java.lang.Class<?> cls, java.lang.Object obj, java.lang.Object... objArr) throws java.lang.Throwable {
        java.lang.reflect.Constructor<java.lang.invoke.MethodHandles.Lookup> constructor = this.lookupConstructor;
        return (constructor != null ? constructor.newInstance(cls, -1) : java.lang.invoke.MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    static final class Android extends retrofit2.Platform {
        Android() {
            super(android.os.Build.VERSION.SDK_INT >= 24);
        }

        @Override // retrofit2.Platform
        public java.util.concurrent.Executor defaultCallbackExecutor() {
            return new retrofit2.Platform.Android.MainThreadExecutor();
        }

        @Override // retrofit2.Platform
        @javax.annotation.Nullable
        java.lang.Object invokeDefaultMethod(java.lang.reflect.Method method, java.lang.Class<?> cls, java.lang.Object obj, java.lang.Object... objArr) throws java.lang.Throwable {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                throw new java.lang.UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            }
            return super.invokeDefaultMethod(method, cls, obj, objArr);
        }

        static final class MainThreadExecutor implements java.util.concurrent.Executor {
            private final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());

            MainThreadExecutor() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable runnable) {
                this.handler.post(runnable);
            }
        }
    }
}
