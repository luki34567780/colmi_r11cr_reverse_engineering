package io.reactivex;

/* loaded from: classes3.dex */
public interface MaybeOperator<Downstream, Upstream> {
    io.reactivex.MaybeObserver<? super Upstream> apply(io.reactivex.MaybeObserver<? super Downstream> maybeObserver) throws java.lang.Exception;
}
