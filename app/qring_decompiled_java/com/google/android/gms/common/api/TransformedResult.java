package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class TransformedResult<R extends com.google.android.gms.common.api.Result> {
    public abstract void andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R> resultCallbacks);

    public abstract <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> resultTransform);
}
