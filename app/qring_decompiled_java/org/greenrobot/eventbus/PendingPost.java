package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
final class PendingPost {
    private static final java.util.List<org.greenrobot.eventbus.PendingPost> pendingPostPool = new java.util.ArrayList();
    java.lang.Object event;
    org.greenrobot.eventbus.PendingPost next;
    org.greenrobot.eventbus.Subscription subscription;

    private PendingPost(java.lang.Object obj, org.greenrobot.eventbus.Subscription subscription) {
        this.event = obj;
        this.subscription = subscription;
    }

    static org.greenrobot.eventbus.PendingPost obtainPendingPost(org.greenrobot.eventbus.Subscription subscription, java.lang.Object obj) {
        java.util.List<org.greenrobot.eventbus.PendingPost> list = pendingPostPool;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                org.greenrobot.eventbus.PendingPost remove = list.remove(size - 1);
                remove.event = obj;
                remove.subscription = subscription;
                remove.next = null;
                return remove;
            }
            return new org.greenrobot.eventbus.PendingPost(obj, subscription);
        }
    }

    static void releasePendingPost(org.greenrobot.eventbus.PendingPost pendingPost) {
        pendingPost.event = null;
        pendingPost.subscription = null;
        pendingPost.next = null;
        java.util.List<org.greenrobot.eventbus.PendingPost> list = pendingPostPool;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(pendingPost);
            }
        }
    }
}
