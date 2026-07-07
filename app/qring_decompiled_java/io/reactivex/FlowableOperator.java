package io.reactivex;

/* loaded from: classes3.dex */
public interface FlowableOperator<Downstream, Upstream> {
    org.reactivestreams.Subscriber<? super Upstream> apply(org.reactivestreams.Subscriber<? super Downstream> subscriber) throws java.lang.Exception;
}
