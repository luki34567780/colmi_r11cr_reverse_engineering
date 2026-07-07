package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
final class PendingPostQueue {
    private org.greenrobot.eventbus.PendingPost head;
    private org.greenrobot.eventbus.PendingPost tail;

    PendingPostQueue() {
    }

    synchronized void enqueue(org.greenrobot.eventbus.PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new java.lang.NullPointerException("null cannot be enqueued");
            }
            org.greenrobot.eventbus.PendingPost pendingPost2 = this.tail;
            if (pendingPost2 != null) {
                pendingPost2.next = pendingPost;
                this.tail = pendingPost;
            } else if (this.head == null) {
                this.tail = pendingPost;
                this.head = pendingPost;
            } else {
                throw new java.lang.IllegalStateException("Head present, but no tail");
            }
            notifyAll();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    synchronized org.greenrobot.eventbus.PendingPost poll() {
        org.greenrobot.eventbus.PendingPost pendingPost;
        pendingPost = this.head;
        if (pendingPost != null) {
            org.greenrobot.eventbus.PendingPost pendingPost2 = pendingPost.next;
            this.head = pendingPost2;
            if (pendingPost2 == null) {
                this.tail = null;
            }
        }
        return pendingPost;
    }

    synchronized org.greenrobot.eventbus.PendingPost poll(int i) throws java.lang.InterruptedException {
        if (this.head == null) {
            wait(i);
        }
        return poll();
    }
}
