package retrofit2;

/* loaded from: classes3.dex */
public final class Retrofit {
    final okhttp3.HttpUrl baseUrl;
    final java.util.List<retrofit2.CallAdapter.Factory> callAdapterFactories;
    final okhttp3.Call.Factory callFactory;

    @javax.annotation.Nullable
    final java.util.concurrent.Executor callbackExecutor;
    final java.util.List<retrofit2.Converter.Factory> converterFactories;
    private final java.util.Map<java.lang.reflect.Method, retrofit2.ServiceMethod<?>> serviceMethodCache = new java.util.concurrent.ConcurrentHashMap();
    final boolean validateEagerly;

    Retrofit(okhttp3.Call.Factory factory, okhttp3.HttpUrl httpUrl, java.util.List<retrofit2.Converter.Factory> list, java.util.List<retrofit2.CallAdapter.Factory> list2, @javax.annotation.Nullable java.util.concurrent.Executor executor, boolean z) {
        this.callFactory = factory;
        this.baseUrl = httpUrl;
        this.converterFactories = list;
        this.callAdapterFactories = list2;
        this.callbackExecutor = executor;
        this.validateEagerly = z;
    }

    public <T> T create(final java.lang.Class<T> cls) {
        validateServiceInterface(cls);
        return (T) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new java.lang.reflect.InvocationHandler() { // from class: retrofit2.Retrofit.1
            private final retrofit2.Platform platform = retrofit2.Platform.get();
            private final java.lang.Object[] emptyArgs = new java.lang.Object[0];

            @Override // java.lang.reflect.InvocationHandler
            @javax.annotation.Nullable
            public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, @javax.annotation.Nullable java.lang.Object[] objArr) throws java.lang.Throwable {
                if (method.getDeclaringClass() == java.lang.Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.emptyArgs;
                }
                if (this.platform.isDefaultMethod(method)) {
                    return this.platform.invokeDefaultMethod(method, cls, obj, objArr);
                }
                return retrofit2.Retrofit.this.loadServiceMethod(method).invoke(objArr);
            }
        });
    }

    private void validateServiceInterface(java.lang.Class<?> cls) {
        if (!cls.isInterface()) {
            throw new java.lang.IllegalArgumentException("API declarations must be interfaces.");
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            java.lang.Class<?> cls2 = (java.lang.Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            java.util.Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.validateEagerly) {
            retrofit2.Platform platform = retrofit2.Platform.get();
            for (java.lang.reflect.Method method : cls.getDeclaredMethods()) {
                if (!platform.isDefaultMethod(method) && !java.lang.reflect.Modifier.isStatic(method.getModifiers())) {
                    loadServiceMethod(method);
                }
            }
        }
    }

    retrofit2.ServiceMethod<?> loadServiceMethod(java.lang.reflect.Method method) {
        retrofit2.ServiceMethod<?> serviceMethod;
        retrofit2.ServiceMethod<?> serviceMethod2 = this.serviceMethodCache.get(method);
        if (serviceMethod2 != null) {
            return serviceMethod2;
        }
        synchronized (this.serviceMethodCache) {
            serviceMethod = this.serviceMethodCache.get(method);
            if (serviceMethod == null) {
                serviceMethod = retrofit2.ServiceMethod.parseAnnotations(this, method);
                this.serviceMethodCache.put(method, serviceMethod);
            }
        }
        return serviceMethod;
    }

    public okhttp3.Call.Factory callFactory() {
        return this.callFactory;
    }

    public okhttp3.HttpUrl baseUrl() {
        return this.baseUrl;
    }

    public java.util.List<retrofit2.CallAdapter.Factory> callAdapterFactories() {
        return this.callAdapterFactories;
    }

    public retrofit2.CallAdapter<?, ?> callAdapter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public retrofit2.CallAdapter<?, ?> nextCallAdapter(@javax.annotation.Nullable retrofit2.CallAdapter.Factory factory, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        java.util.Objects.requireNonNull(type, "returnType == null");
        java.util.Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.callAdapterFactories.indexOf(factory) + 1;
        int size = this.callAdapterFactories.size();
        for (int i = indexOf; i < size; i++) {
            retrofit2.CallAdapter<?, ?> callAdapter = this.callAdapterFactories.get(i).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.callAdapterFactories.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.callAdapterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.callAdapterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public java.util.List<retrofit2.Converter.Factory> converterFactories() {
        return this.converterFactories;
    }

    public <T> retrofit2.Converter<T, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> retrofit2.Converter<T, okhttp3.RequestBody> nextRequestBodyConverter(@javax.annotation.Nullable retrofit2.Converter.Factory factory, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2) {
        java.util.Objects.requireNonNull(type, "type == null");
        java.util.Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        java.util.Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            retrofit2.Converter<T, okhttp3.RequestBody> converter = (retrofit2.Converter<T, okhttp3.RequestBody>) this.converterFactories.get(i).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public <T> retrofit2.Converter<okhttp3.ResponseBody, T> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> retrofit2.Converter<okhttp3.ResponseBody, T> nextResponseBodyConverter(@javax.annotation.Nullable retrofit2.Converter.Factory factory, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        java.util.Objects.requireNonNull(type, "type == null");
        java.util.Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            retrofit2.Converter<okhttp3.ResponseBody, T> converter = (retrofit2.Converter<okhttp3.ResponseBody, T>) this.converterFactories.get(i).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public <T> retrofit2.Converter<T, java.lang.String> stringConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        java.util.Objects.requireNonNull(type, "type == null");
        java.util.Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i = 0; i < size; i++) {
            retrofit2.Converter<T, java.lang.String> converter = (retrofit2.Converter<T, java.lang.String>) this.converterFactories.get(i).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return retrofit2.BuiltInConverters.ToStringConverter.INSTANCE;
    }

    @javax.annotation.Nullable
    public java.util.concurrent.Executor callbackExecutor() {
        return this.callbackExecutor;
    }

    public retrofit2.Retrofit.Builder newBuilder() {
        return new retrofit2.Retrofit.Builder(this);
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private okhttp3.HttpUrl baseUrl;
        private final java.util.List<retrofit2.CallAdapter.Factory> callAdapterFactories;

        @javax.annotation.Nullable
        private okhttp3.Call.Factory callFactory;

        @javax.annotation.Nullable
        private java.util.concurrent.Executor callbackExecutor;
        private final java.util.List<retrofit2.Converter.Factory> converterFactories;
        private final retrofit2.Platform platform;
        private boolean validateEagerly;

        Builder(retrofit2.Platform platform) {
            this.converterFactories = new java.util.ArrayList();
            this.callAdapterFactories = new java.util.ArrayList();
            this.platform = platform;
        }

        public Builder() {
            this(retrofit2.Platform.get());
        }

        Builder(retrofit2.Retrofit retrofit) {
            this.converterFactories = new java.util.ArrayList();
            this.callAdapterFactories = new java.util.ArrayList();
            retrofit2.Platform platform = retrofit2.Platform.get();
            this.platform = platform;
            this.callFactory = retrofit.callFactory;
            this.baseUrl = retrofit.baseUrl;
            int size = retrofit.converterFactories.size() - platform.defaultConverterFactoriesSize();
            for (int i = 1; i < size; i++) {
                this.converterFactories.add(retrofit.converterFactories.get(i));
            }
            int size2 = retrofit.callAdapterFactories.size() - this.platform.defaultCallAdapterFactoriesSize();
            for (int i2 = 0; i2 < size2; i2++) {
                this.callAdapterFactories.add(retrofit.callAdapterFactories.get(i2));
            }
            this.callbackExecutor = retrofit.callbackExecutor;
            this.validateEagerly = retrofit.validateEagerly;
        }

        public retrofit2.Retrofit.Builder client(okhttp3.OkHttpClient okHttpClient) {
            java.util.Objects.requireNonNull(okHttpClient, "client == null");
            return callFactory(okHttpClient);
        }

        public retrofit2.Retrofit.Builder callFactory(okhttp3.Call.Factory factory) {
            java.util.Objects.requireNonNull(factory, "factory == null");
            this.callFactory = factory;
            return this;
        }

        public retrofit2.Retrofit.Builder baseUrl(java.net.URL url) {
            java.util.Objects.requireNonNull(url, "baseUrl == null");
            return baseUrl(okhttp3.HttpUrl.get(url.toString()));
        }

        public retrofit2.Retrofit.Builder baseUrl(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "baseUrl == null");
            return baseUrl(okhttp3.HttpUrl.get(str));
        }

        public retrofit2.Retrofit.Builder baseUrl(okhttp3.HttpUrl httpUrl) {
            java.util.Objects.requireNonNull(httpUrl, "baseUrl == null");
            if (!"".equals(httpUrl.pathSegments().get(r0.size() - 1))) {
                throw new java.lang.IllegalArgumentException("baseUrl must end in /: " + httpUrl);
            }
            this.baseUrl = httpUrl;
            return this;
        }

        public retrofit2.Retrofit.Builder addConverterFactory(retrofit2.Converter.Factory factory) {
            java.util.List<retrofit2.Converter.Factory> list = this.converterFactories;
            java.util.Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public retrofit2.Retrofit.Builder addCallAdapterFactory(retrofit2.CallAdapter.Factory factory) {
            java.util.List<retrofit2.CallAdapter.Factory> list = this.callAdapterFactories;
            java.util.Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public retrofit2.Retrofit.Builder callbackExecutor(java.util.concurrent.Executor executor) {
            java.util.Objects.requireNonNull(executor, "executor == null");
            this.callbackExecutor = executor;
            return this;
        }

        public java.util.List<retrofit2.CallAdapter.Factory> callAdapterFactories() {
            return this.callAdapterFactories;
        }

        public java.util.List<retrofit2.Converter.Factory> converterFactories() {
            return this.converterFactories;
        }

        public retrofit2.Retrofit.Builder validateEagerly(boolean z) {
            this.validateEagerly = z;
            return this;
        }

        public retrofit2.Retrofit build() {
            if (this.baseUrl == null) {
                throw new java.lang.IllegalStateException("Base URL required.");
            }
            okhttp3.Call.Factory factory = this.callFactory;
            if (factory == null) {
                factory = new okhttp3.OkHttpClient();
            }
            okhttp3.Call.Factory factory2 = factory;
            java.util.concurrent.Executor executor = this.callbackExecutor;
            if (executor == null) {
                executor = this.platform.defaultCallbackExecutor();
            }
            java.util.concurrent.Executor executor2 = executor;
            java.util.ArrayList arrayList = new java.util.ArrayList(this.callAdapterFactories);
            arrayList.addAll(this.platform.defaultCallAdapterFactories(executor2));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(this.converterFactories.size() + 1 + this.platform.defaultConverterFactoriesSize());
            arrayList2.add(new retrofit2.BuiltInConverters());
            arrayList2.addAll(this.converterFactories);
            arrayList2.addAll(this.platform.defaultConverterFactories());
            return new retrofit2.Retrofit(factory2, this.baseUrl, java.util.Collections.unmodifiableList(arrayList2), java.util.Collections.unmodifiableList(arrayList), executor2, this.validateEagerly);
        }
    }
}
