package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
class AsyncPoster implements java.lang.Runnable, org.greenrobot.eventbus.Poster {
    private final org.greenrobot.eventbus.EventBus eventBus;
    private final org.greenrobot.eventbus.PendingPostQueue queue = new org.greenrobot.eventbus.PendingPostQueue();

    AsyncPoster(org.greenrobot.eventbus.EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override // org.greenrobot.eventbus.Poster
    public void enqueue(org.greenrobot.eventbus.Subscription subscription, java.lang.Object obj) {
        this.queue.enqueue(org.greenrobot.eventbus.PendingPost.obtainPendingPost(subscription, obj));
        this.eventBus.getExecutorService().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        org.greenrobot.eventbus.PendingPost poll = this.queue.poll();
        if (poll == null) {
            throw new java.lang.IllegalStateException("No pending post available");
        }
        this.eventBus.invokeSubscriber(poll);
    }
}
