package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
public class SubscriberMethod {
    final java.lang.Class<?> eventType;
    final java.lang.reflect.Method method;
    java.lang.String methodString;
    final int priority;
    final boolean sticky;
    final org.greenrobot.eventbus.ThreadMode threadMode;

    public SubscriberMethod(java.lang.reflect.Method method, java.lang.Class<?> cls, org.greenrobot.eventbus.ThreadMode threadMode, int i, boolean z) {
        this.method = method;
        this.threadMode = threadMode;
        this.eventType = cls;
        this.priority = i;
        this.sticky = z;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.greenrobot.eventbus.SubscriberMethod)) {
            return false;
        }
        checkMethodString();
        org.greenrobot.eventbus.SubscriberMethod subscriberMethod = (org.greenrobot.eventbus.SubscriberMethod) obj;
        subscriberMethod.checkMethodString();
        return this.methodString.equals(subscriberMethod.methodString);
    }

    private synchronized void checkMethodString() {
        if (this.methodString == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
            sb.append(this.method.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.method.getName());
            sb.append('(');
            sb.append(this.eventType.getName());
            this.methodString = sb.toString();
        }
    }

    public int hashCode() {
        return this.method.hashCode();
    }
}
