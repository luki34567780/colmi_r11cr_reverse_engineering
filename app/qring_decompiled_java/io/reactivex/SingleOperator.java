package io.reactivex;

/* loaded from: classes3.dex */
public interface SingleOperator<Downstream, Upstream> {
    io.reactivex.SingleObserver<? super Upstream> apply(io.reactivex.SingleObserver<? super Downstream> singleObserver) throws java.lang.Exception;
}
