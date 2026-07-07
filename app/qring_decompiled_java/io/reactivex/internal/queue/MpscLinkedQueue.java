package io.reactivex.internal.queue;

/* loaded from: classes3.dex */
public final class MpscLinkedQueue<T> implements io.reactivex.internal.fuseable.SimplePlainQueue<T> {
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T>> producerNode = new java.util.concurrent.atomic.AtomicReference<>();
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T>> consumerNode = new java.util.concurrent.atomic.AtomicReference<>();

    public MpscLinkedQueue() {
        io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> linkedQueueNode = new io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<>();
        spConsumerNode(linkedQueueNode);
        xchgProducerNode(linkedQueueNode);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        java.util.Objects.requireNonNull(t, "Null is not a valid element");
        io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> linkedQueueNode = new io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<>(t);
        xchgProducerNode(linkedQueueNode).soNext(linkedQueueNode);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    public T poll() {
        io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> lvNext;
        io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> lpConsumerNode = lpConsumerNode();
        io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> lvNext2 = lpConsumerNode.lvNext();
        if (lvNext2 != null) {
            T andNullValue = lvNext2.getAndNullValue();
            spConsumerNode(lvNext2);
            return andNullValue;
        }
        if (lpConsumerNode == lvProducerNode()) {
            return null;
        }
        do {
            lvNext = lpConsumerNode.lvNext();
        } while (lvNext == null);
        T andNullValue2 = lvNext.getAndNullValue();
        spConsumerNode(lvNext);
        return andNullValue2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t, T t2) {
        offer(t);
        offer(t2);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> lvProducerNode() {
        return this.producerNode.get();
    }

    io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> xchgProducerNode(io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> linkedQueueNode) {
        return this.producerNode.getAndSet(linkedQueueNode);
    }

    io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> lvConsumerNode() {
        return this.consumerNode.get();
    }

    io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> lpConsumerNode() {
        return this.consumerNode.get();
    }

    void spConsumerNode(io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> linkedQueueNode) {
        this.consumerNode.lazySet(linkedQueueNode);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return lvConsumerNode() == lvProducerNode();
    }

    static final class LinkedQueueNode<E> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        LinkedQueueNode() {
        }

        LinkedQueueNode(E e) {
            spValue(e);
        }

        public E getAndNullValue() {
            E lpValue = lpValue();
            spValue(null);
            return lpValue;
        }

        public E lpValue() {
            return this.value;
        }

        public void spValue(E e) {
            this.value = e;
        }

        public void soNext(io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }

        public io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<E> lvNext() {
            return get();
        }
    }
}
