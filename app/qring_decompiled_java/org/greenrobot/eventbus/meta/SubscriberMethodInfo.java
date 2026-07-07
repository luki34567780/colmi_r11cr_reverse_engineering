package org.greenrobot.eventbus.meta;

/* loaded from: classes3.dex */
public class SubscriberMethodInfo {
    final java.lang.Class<?> eventType;
    final java.lang.String methodName;
    final int priority;
    final boolean sticky;
    final org.greenrobot.eventbus.ThreadMode threadMode;

    public SubscriberMethodInfo(java.lang.String str, java.lang.Class<?> cls, org.greenrobot.eventbus.ThreadMode threadMode, int i, boolean z) {
        this.methodName = str;
        this.threadMode = threadMode;
        this.eventType = cls;
        this.priority = i;
        this.sticky = z;
    }

    public SubscriberMethodInfo(java.lang.String str, java.lang.Class<?> cls) {
        this(str, cls, org.greenrobot.eventbus.ThreadMode.POSTING, 0, false);
    }

    public SubscriberMethodInfo(java.lang.String str, java.lang.Class<?> cls, org.greenrobot.eventbus.ThreadMode threadMode) {
        this(str, cls, threadMode, 0, false);
    }
}
