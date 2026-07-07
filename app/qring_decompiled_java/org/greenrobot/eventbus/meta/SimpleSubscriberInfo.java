package org.greenrobot.eventbus.meta;

/* loaded from: classes3.dex */
public class SimpleSubscriberInfo extends org.greenrobot.eventbus.meta.AbstractSubscriberInfo {
    private final org.greenrobot.eventbus.meta.SubscriberMethodInfo[] methodInfos;

    public SimpleSubscriberInfo(java.lang.Class cls, boolean z, org.greenrobot.eventbus.meta.SubscriberMethodInfo[] subscriberMethodInfoArr) {
        super(cls, null, z);
        this.methodInfos = subscriberMethodInfoArr;
    }

    @Override // org.greenrobot.eventbus.meta.SubscriberInfo
    public synchronized org.greenrobot.eventbus.SubscriberMethod[] getSubscriberMethods() {
        org.greenrobot.eventbus.SubscriberMethod[] subscriberMethodArr;
        int length = this.methodInfos.length;
        subscriberMethodArr = new org.greenrobot.eventbus.SubscriberMethod[length];
        for (int i = 0; i < length; i++) {
            org.greenrobot.eventbus.meta.SubscriberMethodInfo subscriberMethodInfo = this.methodInfos[i];
            subscriberMethodArr[i] = createSubscriberMethod(subscriberMethodInfo.methodName, subscriberMethodInfo.eventType, subscriberMethodInfo.threadMode, subscriberMethodInfo.priority, subscriberMethodInfo.sticky);
        }
        return subscriberMethodArr;
    }
}
