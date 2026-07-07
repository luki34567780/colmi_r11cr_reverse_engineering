package org.reactivestreams;

/* loaded from: classes3.dex */
public final class FlowAdapters {
    private FlowAdapters() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> org.reactivestreams.Publisher<T> toPublisher(java.util.concurrent.Flow.Publisher<? extends T> publisher) {
        java.util.Objects.requireNonNull(publisher, "flowPublisher");
        if (publisher instanceof org.reactivestreams.FlowAdapters.FlowPublisherFromReactive) {
            return ((org.reactivestreams.FlowAdapters.FlowPublisherFromReactive) publisher).reactiveStreams;
        }
        if (publisher instanceof org.reactivestreams.Publisher) {
            return (org.reactivestreams.Publisher) publisher;
        }
        return new org.reactivestreams.FlowAdapters.ReactivePublisherFromFlow(publisher);
    }

    public static <T> java.util.concurrent.Flow.Publisher<T> toFlowPublisher(org.reactivestreams.Publisher<? extends T> publisher) {
        java.util.Objects.requireNonNull(publisher, "reactiveStreamsPublisher");
        if (publisher instanceof org.reactivestreams.FlowAdapters.ReactivePublisherFromFlow) {
            return ((org.reactivestreams.FlowAdapters.ReactivePublisherFromFlow) publisher).flow;
        }
        if (publisher instanceof java.util.concurrent.Flow.Publisher) {
            return (java.util.concurrent.Flow.Publisher) publisher;
        }
        return new org.reactivestreams.FlowAdapters.FlowPublisherFromReactive(publisher);
    }

    public static <T, U> org.reactivestreams.Processor<T, U> toProcessor(java.util.concurrent.Flow.Processor<? super T, ? extends U> processor) {
        java.util.Objects.requireNonNull(processor, "flowProcessor");
        if (processor instanceof org.reactivestreams.FlowAdapters.FlowToReactiveProcessor) {
            return ((org.reactivestreams.FlowAdapters.FlowToReactiveProcessor) processor).reactiveStreams;
        }
        if (processor instanceof org.reactivestreams.Processor) {
            return (org.reactivestreams.Processor) processor;
        }
        return new org.reactivestreams.FlowAdapters.ReactiveToFlowProcessor(processor);
    }

    public static <T, U> java.util.concurrent.Flow.Processor<T, U> toFlowProcessor(org.reactivestreams.Processor<? super T, ? extends U> processor) {
        java.util.Objects.requireNonNull(processor, "reactiveStreamsProcessor");
        if (processor instanceof org.reactivestreams.FlowAdapters.ReactiveToFlowProcessor) {
            return ((org.reactivestreams.FlowAdapters.ReactiveToFlowProcessor) processor).flow;
        }
        if (processor instanceof java.util.concurrent.Flow.Processor) {
            return (java.util.concurrent.Flow.Processor) processor;
        }
        return new org.reactivestreams.FlowAdapters.FlowToReactiveProcessor(processor);
    }

    public static <T> java.util.concurrent.Flow.Subscriber<T> toFlowSubscriber(org.reactivestreams.Subscriber<T> subscriber) {
        java.util.Objects.requireNonNull(subscriber, "reactiveStreamsSubscriber");
        if (subscriber instanceof org.reactivestreams.FlowAdapters.ReactiveToFlowSubscriber) {
            return ((org.reactivestreams.FlowAdapters.ReactiveToFlowSubscriber) subscriber).flow;
        }
        if (subscriber instanceof java.util.concurrent.Flow.Subscriber) {
            return (java.util.concurrent.Flow.Subscriber) subscriber;
        }
        return new org.reactivestreams.FlowAdapters.FlowToReactiveSubscriber(subscriber);
    }

    public static <T> org.reactivestreams.Subscriber<T> toSubscriber(java.util.concurrent.Flow.Subscriber<T> subscriber) {
        java.util.Objects.requireNonNull(subscriber, "flowSubscriber");
        if (subscriber instanceof org.reactivestreams.FlowAdapters.FlowToReactiveSubscriber) {
            return ((org.reactivestreams.FlowAdapters.FlowToReactiveSubscriber) subscriber).reactiveStreams;
        }
        if (subscriber instanceof org.reactivestreams.Subscriber) {
            return (org.reactivestreams.Subscriber) subscriber;
        }
        return new org.reactivestreams.FlowAdapters.ReactiveToFlowSubscriber(subscriber);
    }

    static final class FlowToReactiveSubscription implements java.util.concurrent.Flow.Subscription {
        final org.reactivestreams.Subscription reactiveStreams;

        public FlowToReactiveSubscription(org.reactivestreams.Subscription subscription) {
            this.reactiveStreams = subscription;
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void request(long j) {
            this.reactiveStreams.request(j);
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void cancel() {
            this.reactiveStreams.cancel();
        }
    }

    static final class ReactiveToFlowSubscription implements org.reactivestreams.Subscription {
        final java.util.concurrent.Flow.Subscription flow;

        public ReactiveToFlowSubscription(java.util.concurrent.Flow.Subscription subscription) {
            this.flow = subscription;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.flow.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.flow.cancel();
        }
    }

    static final class FlowToReactiveSubscriber<T> implements java.util.concurrent.Flow.Subscriber<T> {
        final org.reactivestreams.Subscriber<? super T> reactiveStreams;

        public FlowToReactiveSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.reactiveStreams = subscriber;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(java.util.concurrent.Flow.Subscription subscription) {
            this.reactiveStreams.onSubscribe(subscription == null ? null : new org.reactivestreams.FlowAdapters.ReactiveToFlowSubscription(subscription));
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t) {
            this.reactiveStreams.onNext(t);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(java.lang.Throwable th) {
            this.reactiveStreams.onError(th);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.reactiveStreams.onComplete();
        }
    }

    static final class ReactiveToFlowSubscriber<T> implements org.reactivestreams.Subscriber<T> {
        final java.util.concurrent.Flow.Subscriber<? super T> flow;

        public ReactiveToFlowSubscriber(java.util.concurrent.Flow.Subscriber<? super T> subscriber) {
            this.flow = subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.flow.onSubscribe(subscription == null ? null : new org.reactivestreams.FlowAdapters.FlowToReactiveSubscription(subscription));
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.flow.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.flow.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.flow.onComplete();
        }
    }

    static final class ReactiveToFlowProcessor<T, U> implements org.reactivestreams.Processor<T, U> {
        final java.util.concurrent.Flow.Processor<? super T, ? extends U> flow;

        public ReactiveToFlowProcessor(java.util.concurrent.Flow.Processor<? super T, ? extends U> processor) {
            this.flow = processor;
        }

        @Override // org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.flow.onSubscribe(subscription == null ? null : new org.reactivestreams.FlowAdapters.FlowToReactiveSubscription(subscription));
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.flow.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.flow.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.flow.onComplete();
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(org.reactivestreams.Subscriber<? super U> subscriber) {
            this.flow.subscribe(subscriber == null ? null : new org.reactivestreams.FlowAdapters.FlowToReactiveSubscriber(subscriber));
        }
    }

    static final class FlowToReactiveProcessor<T, U> implements java.util.concurrent.Flow.Processor<T, U> {
        final org.reactivestreams.Processor<? super T, ? extends U> reactiveStreams;

        public FlowToReactiveProcessor(org.reactivestreams.Processor<? super T, ? extends U> processor) {
            this.reactiveStreams = processor;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(java.util.concurrent.Flow.Subscription subscription) {
            this.reactiveStreams.onSubscribe(subscription == null ? null : new org.reactivestreams.FlowAdapters.ReactiveToFlowSubscription(subscription));
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t) {
            this.reactiveStreams.onNext(t);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(java.lang.Throwable th) {
            this.reactiveStreams.onError(th);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.reactiveStreams.onComplete();
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(java.util.concurrent.Flow.Subscriber<? super U> subscriber) {
            this.reactiveStreams.subscribe(subscriber == null ? null : new org.reactivestreams.FlowAdapters.ReactiveToFlowSubscriber(subscriber));
        }
    }

    static final class ReactivePublisherFromFlow<T> implements org.reactivestreams.Publisher<T> {
        final java.util.concurrent.Flow.Publisher<? extends T> flow;

        public ReactivePublisherFromFlow(java.util.concurrent.Flow.Publisher<? extends T> publisher) {
            this.flow = publisher;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.flow.subscribe(subscriber == null ? null : new org.reactivestreams.FlowAdapters.FlowToReactiveSubscriber(subscriber));
        }
    }

    static final class FlowPublisherFromReactive<T> implements java.util.concurrent.Flow.Publisher<T> {
        final org.reactivestreams.Publisher<? extends T> reactiveStreams;

        public FlowPublisherFromReactive(org.reactivestreams.Publisher<? extends T> publisher) {
            this.reactiveStreams = publisher;
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(java.util.concurrent.Flow.Subscriber<? super T> subscriber) {
            this.reactiveStreams.subscribe(subscriber == null ? null : new org.reactivestreams.FlowAdapters.ReactiveToFlowSubscriber(subscriber));
        }
    }
}
