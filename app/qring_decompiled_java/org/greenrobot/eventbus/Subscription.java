package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
final class Subscription {
    volatile boolean active = true;
    final java.lang.Object subscriber;
    final org.greenrobot.eventbus.SubscriberMethod subscriberMethod;

    Subscription(java.lang.Object obj, org.greenrobot.eventbus.SubscriberMethod subscriberMethod) {
        this.subscriber = obj;
        this.subscriberMethod = subscriberMethod;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.greenrobot.eventbus.Subscription)) {
            return false;
        }
        org.greenrobot.eventbus.Subscription subscription = (org.greenrobot.eventbus.Subscription) obj;
        return this.subscriber == subscription.subscriber && this.subscriberMethod.equals(subscription.subscriberMethod);
    }

    public int hashCode() {
        return this.subscriber.hashCode() + this.subscriberMethod.methodString.hashCode();
    }
}
