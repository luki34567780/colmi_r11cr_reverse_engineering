package retrofit2;

/* compiled from: KotlinExtensions.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001a\u0010\b\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\tH\u0086\b¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00060\rj\u0002`\u000eH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"await", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "awaitResponse", "Lretrofit2/Response;", "create", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class KotlinExtensions {
    public static final /* synthetic */ <T> T create(retrofit2.Retrofit create) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(create, "$this$create");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
        return (T) create.create(java.lang.Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Exception r4, kotlin.coroutines.Continuation<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L14
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L61
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r5.mo2574dispatch(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L5e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L5e:
            if (r4 != r1) goto L61
            return r1
        L61:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> java.lang.Object await(final retrofit2.Call<T> call, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                retrofit2.Call.this.cancel();
            }
        });
        call.enqueue(new retrofit2.Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<T> call2, retrofit2.Response<T> response) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call2, "call");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(response, "response");
                if (response.isSuccessful()) {
                    T body = response.body();
                    if (body == null) {
                        java.lang.Object tag = call2.request().tag(retrofit2.Invocation.class);
                        if (tag == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(tag, "call.request().tag(Invocation::class.java)!!");
                        java.lang.reflect.Method method = ((retrofit2.Invocation) tag).method();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Response from ");
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(method, "method");
                        java.lang.Class<?> declaringClass = method.getDeclaringClass();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(method.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        kotlin.KotlinNullPointerException kotlinNullPointerException = new kotlin.KotlinNullPointerException(sb.toString());
                        kotlinx.coroutines.CancellableContinuation cancellableContinuation = kotlinx.coroutines.CancellableContinuation.this;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(kotlinNullPointerException)));
                        return;
                    }
                    kotlinx.coroutines.CancellableContinuation cancellableContinuation2 = kotlinx.coroutines.CancellableContinuation.this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    cancellableContinuation2.resumeWith(kotlin.Result.m1091constructorimpl(body));
                    return;
                }
                kotlinx.coroutines.CancellableContinuation cancellableContinuation3 = kotlinx.coroutines.CancellableContinuation.this;
                retrofit2.HttpException httpException = new retrofit2.HttpException(response);
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                cancellableContinuation3.resumeWith(kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(httpException)));
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<T> call2, java.lang.Throwable t) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call2, "call");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(t, "t");
                kotlinx.coroutines.CancellableContinuation cancellableContinuation = kotlinx.coroutines.CancellableContinuation.this;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(t)));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> java.lang.Object awaitNullable(final retrofit2.Call<T> call, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                retrofit2.Call.this.cancel();
            }
        });
        call.enqueue(new retrofit2.Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<T> call2, retrofit2.Response<T> response) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call2, "call");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(response, "response");
                if (response.isSuccessful()) {
                    kotlinx.coroutines.CancellableContinuation cancellableContinuation = kotlinx.coroutines.CancellableContinuation.this;
                    T body = response.body();
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m1091constructorimpl(body));
                    return;
                }
                kotlinx.coroutines.CancellableContinuation cancellableContinuation2 = kotlinx.coroutines.CancellableContinuation.this;
                retrofit2.HttpException httpException = new retrofit2.HttpException(response);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuation2.resumeWith(kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(httpException)));
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<T> call2, java.lang.Throwable t) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call2, "call");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(t, "t");
                kotlinx.coroutines.CancellableContinuation cancellableContinuation = kotlinx.coroutines.CancellableContinuation.this;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(t)));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> java.lang.Object awaitResponse(final retrofit2.Call<T> call, kotlin.coroutines.Continuation<? super retrofit2.Response<T>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                retrofit2.Call.this.cancel();
            }
        });
        call.enqueue(new retrofit2.Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<T> call2, retrofit2.Response<T> response) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call2, "call");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(response, "response");
                kotlinx.coroutines.CancellableContinuation cancellableContinuation = kotlinx.coroutines.CancellableContinuation.this;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1091constructorimpl(response));
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<T> call2, java.lang.Throwable t) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call2, "call");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(t, "t");
                kotlinx.coroutines.CancellableContinuation cancellableContinuation = kotlinx.coroutines.CancellableContinuation.this;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1091constructorimpl(kotlin.ResultKt.createFailure(t)));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
