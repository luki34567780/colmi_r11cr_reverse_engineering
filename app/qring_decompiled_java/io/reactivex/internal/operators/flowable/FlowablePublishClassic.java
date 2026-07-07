package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public interface FlowablePublishClassic<T> {
    int publishBufferSize();

    org.reactivestreams.Publisher<T> publishSource();
}
