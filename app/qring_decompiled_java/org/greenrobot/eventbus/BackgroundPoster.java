package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
final class BackgroundPoster implements java.lang.Runnable, org.greenrobot.eventbus.Poster {
    private final org.greenrobot.eventbus.EventBus eventBus;
    private volatile boolean executorRunning;
    private final org.greenrobot.eventbus.PendingPostQueue queue = new org.greenrobot.eventbus.PendingPostQueue();

    BackgroundPoster(org.greenrobot.eventbus.EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override // org.greenrobot.eventbus.Poster
    public void enqueue(org.greenrobot.eventbus.Subscription subscription, java.lang.Object obj) {
        org.greenrobot.eventbus.PendingPost obtainPendingPost = org.greenrobot.eventbus.PendingPost.obtainPendingPost(subscription, obj);
        synchronized (this) {
            this.queue.enqueue(obtainPendingPost);
            if (!this.executorRunning) {
                this.executorRunning = true;
                this.eventBus.getExecutorService().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                org.greenrobot.eventbus.PendingPost poll = this.queue.poll(1000);
                if (poll == null) {
                    synchronized (this) {
                        poll = this.queue.poll();
                        if (poll == null) {
                            return;
                        }
                    }
                }
                this.eventBus.invokeSubscriber(poll);
            } catch (java.lang.InterruptedException e) {
                this.eventBus.getLogger().log(java.util.logging.Level.WARNING, java.lang.Thread.currentThread().getName() + " was interruppted", e);
                return;
            } finally {
                this.executorRunning = false;
            }
        }
    }
}
