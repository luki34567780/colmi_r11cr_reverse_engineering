package retrofit2;

/* loaded from: classes3.dex */
final class CompletableFutureCallAdapterFactory extends retrofit2.CallAdapter.Factory {
    static final retrofit2.CallAdapter.Factory INSTANCE = new retrofit2.CompletableFutureCallAdapterFactory();

    CompletableFutureCallAdapterFactory() {
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (getRawType(type) != java.util.concurrent.CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            throw new java.lang.IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        java.lang.reflect.Type parameterUpperBound = getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type);
        if (getRawType(parameterUpperBound) != retrofit2.Response.class) {
            return new retrofit2.CompletableFutureCallAdapterFactory.BodyCallAdapter(parameterUpperBound);
        }
        if (!(parameterUpperBound instanceof java.lang.reflect.ParameterizedType)) {
            throw new java.lang.IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new retrofit2.CompletableFutureCallAdapterFactory.ResponseCallAdapter(getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) parameterUpperBound));
    }

    private static final class BodyCallAdapter<R> implements retrofit2.CallAdapter<R, java.util.concurrent.CompletableFuture<R>> {
        private final java.lang.reflect.Type responseType;

        BodyCallAdapter(java.lang.reflect.Type type) {
            this.responseType = type;
        }

        @Override // retrofit2.CallAdapter
        public java.lang.reflect.Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.CallAdapter
        public java.util.concurrent.CompletableFuture<R> adapt(retrofit2.Call<R> call) {
            retrofit2.CompletableFutureCallAdapterFactory.CallCancelCompletableFuture callCancelCompletableFuture = new retrofit2.CompletableFutureCallAdapterFactory.CallCancelCompletableFuture(call);
            call.enqueue(new retrofit2.CompletableFutureCallAdapterFactory.BodyCallAdapter.BodyCallback(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }

        private class BodyCallback implements retrofit2.Callback<R> {
            private final java.util.concurrent.CompletableFuture<R> future;

            public BodyCallback(java.util.concurrent.CompletableFuture<R> completableFuture) {
                this.future = completableFuture;
            }

            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<R> call, retrofit2.Response<R> response) {
                if (response.isSuccessful()) {
                    this.future.complete(response.body());
                } else {
                    this.future.completeExceptionally(new retrofit2.HttpException(response));
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<R> call, java.lang.Throwable th) {
                this.future.completeExceptionally(th);
            }
        }
    }

    private static final class ResponseCallAdapter<R> implements retrofit2.CallAdapter<R, java.util.concurrent.CompletableFuture<retrofit2.Response<R>>> {
        private final java.lang.reflect.Type responseType;

        ResponseCallAdapter(java.lang.reflect.Type type) {
            this.responseType = type;
        }

        @Override // retrofit2.CallAdapter
        public java.lang.reflect.Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.CallAdapter
        public java.util.concurrent.CompletableFuture<retrofit2.Response<R>> adapt(retrofit2.Call<R> call) {
            retrofit2.CompletableFutureCallAdapterFactory.CallCancelCompletableFuture callCancelCompletableFuture = new retrofit2.CompletableFutureCallAdapterFactory.CallCancelCompletableFuture(call);
            call.enqueue(new retrofit2.CompletableFutureCallAdapterFactory.ResponseCallAdapter.ResponseCallback(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }

        private class ResponseCallback implements retrofit2.Callback<R> {
            private final java.util.concurrent.CompletableFuture<retrofit2.Response<R>> future;

            public ResponseCallback(java.util.concurrent.CompletableFuture<retrofit2.Response<R>> completableFuture) {
                this.future = completableFuture;
            }

            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<R> call, retrofit2.Response<R> response) {
                this.future.complete(response);
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<R> call, java.lang.Throwable th) {
                this.future.completeExceptionally(th);
            }
        }
    }

    private static final class CallCancelCompletableFuture<T> extends java.util.concurrent.CompletableFuture<T> {
        private final retrofit2.Call<?> call;

        CallCancelCompletableFuture(retrofit2.Call<?> call) {
            this.call = call;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.call.cancel();
            }
            return super.cancel(z);
        }
    }
}
