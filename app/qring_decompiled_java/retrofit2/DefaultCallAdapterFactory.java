package retrofit2;

/* loaded from: classes3.dex */
final class DefaultCallAdapterFactory extends retrofit2.CallAdapter.Factory {

    @javax.annotation.Nullable
    private final java.util.concurrent.Executor callbackExecutor;

    DefaultCallAdapterFactory(@javax.annotation.Nullable java.util.concurrent.Executor executor) {
        this.callbackExecutor = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (getRawType(type) != retrofit2.Call.class) {
            return null;
        }
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            throw new java.lang.IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        final java.lang.reflect.Type parameterUpperBound = retrofit2.Utils.getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type);
        final java.util.concurrent.Executor executor = retrofit2.Utils.isAnnotationPresent(annotationArr, retrofit2.SkipCallbackExecutor.class) ? null : this.callbackExecutor;
        return new retrofit2.CallAdapter<java.lang.Object, retrofit2.Call<?>>() { // from class: retrofit2.DefaultCallAdapterFactory.1
            @Override // retrofit2.CallAdapter
            public java.lang.reflect.Type responseType() {
                return parameterUpperBound;
            }

            @Override // retrofit2.CallAdapter
            public retrofit2.Call<?> adapt(retrofit2.Call<java.lang.Object> call) {
                java.util.concurrent.Executor executor2 = executor;
                return executor2 == null ? call : new retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall(executor2, call);
            }
        };
    }

    static final class ExecutorCallbackCall<T> implements retrofit2.Call<T> {
        final java.util.concurrent.Executor callbackExecutor;
        final retrofit2.Call<T> delegate;

        ExecutorCallbackCall(java.util.concurrent.Executor executor, retrofit2.Call<T> call) {
            this.callbackExecutor = executor;
            this.delegate = call;
        }

        @Override // retrofit2.Call
        public void enqueue(retrofit2.Callback<T> callback) {
            java.util.Objects.requireNonNull(callback, "callback == null");
            this.delegate.enqueue(new retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1(callback));
        }

        /* renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1, reason: invalid class name */
        class AnonymousClass1 implements retrofit2.Callback<T> {
            final /* synthetic */ retrofit2.Callback val$callback;

            AnonymousClass1(retrofit2.Callback callback) {
                this.val$callback = callback;
            }

            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<T> call, final retrofit2.Response<T> response) {
                java.util.concurrent.Executor executor = retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this.callbackExecutor;
                final retrofit2.Callback callback = this.val$callback;
                executor.execute(new java.lang.Runnable() { // from class: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.this.m2749xddacc936(callback, response);
                    }
                });
            }

            /* renamed from: lambda$onResponse$0$retrofit2-DefaultCallAdapterFactory$ExecutorCallbackCall$1, reason: not valid java name */
            public /* synthetic */ void m2749xddacc936(retrofit2.Callback callback, retrofit2.Response response) {
                if (retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this.delegate.isCanceled()) {
                    callback.onFailure(retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this, new java.io.IOException("Canceled"));
                } else {
                    callback.onResponse(retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this, response);
                }
            }

            /* renamed from: lambda$onFailure$1$retrofit2-DefaultCallAdapterFactory$ExecutorCallbackCall$1, reason: not valid java name */
            public /* synthetic */ void m2748x714e864(retrofit2.Callback callback, java.lang.Throwable th) {
                callback.onFailure(retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this, th);
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<T> call, final java.lang.Throwable th) {
                java.util.concurrent.Executor executor = retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this.callbackExecutor;
                final retrofit2.Callback callback = this.val$callback;
                executor.execute(new java.lang.Runnable() { // from class: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.this.m2748x714e864(callback, th);
                    }
                });
            }
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        @Override // retrofit2.Call
        public retrofit2.Response<T> execute() throws java.io.IOException {
            return this.delegate.execute();
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        @Override // retrofit2.Call
        public retrofit2.Call<T> clone() {
            return new retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall(this.callbackExecutor, this.delegate.clone());
        }

        @Override // retrofit2.Call
        public okhttp3.Request request() {
            return this.delegate.request();
        }

        @Override // retrofit2.Call
        public okio.Timeout timeout() {
            return this.delegate.timeout();
        }
    }
}
