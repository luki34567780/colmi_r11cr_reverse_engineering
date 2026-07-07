package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
public class HandlerPoster extends android.os.Handler implements org.greenrobot.eventbus.Poster {
    private final org.greenrobot.eventbus.EventBus eventBus;
    private boolean handlerActive;
    private final int maxMillisInsideHandleMessage;
    private final org.greenrobot.eventbus.PendingPostQueue queue;

    public HandlerPoster(org.greenrobot.eventbus.EventBus eventBus, android.os.Looper looper, int i) {
        super(looper);
        this.eventBus = eventBus;
        this.maxMillisInsideHandleMessage = i;
        this.queue = new org.greenrobot.eventbus.PendingPostQueue();
    }

    @Override // org.greenrobot.eventbus.Poster
    public void enqueue(org.greenrobot.eventbus.Subscription subscription, java.lang.Object obj) {
        org.greenrobot.eventbus.PendingPost obtainPendingPost = org.greenrobot.eventbus.PendingPost.obtainPendingPost(subscription, obj);
        synchronized (this) {
            this.queue.enqueue(obtainPendingPost);
            if (!this.handlerActive) {
                this.handlerActive = true;
                if (!sendMessage(obtainMessage())) {
                    throw new org.greenrobot.eventbus.EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        try {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            do {
                org.greenrobot.eventbus.PendingPost poll = this.queue.poll();
                if (poll == null) {
                    synchronized (this) {
                        poll = this.queue.poll();
                        if (poll == null) {
                            this.handlerActive = false;
                            return;
                        }
                    }
                }
                this.eventBus.invokeSubscriber(poll);
            } while (android.os.SystemClock.uptimeMillis() - uptimeMillis < this.maxMillisInsideHandleMessage);
            if (!sendMessage(obtainMessage())) {
                throw new org.greenrobot.eventbus.EventBusException("Could not send handler message");
            }
            this.handlerActive = true;
        } finally {
            this.handlerActive = false;
        }
    }
}
