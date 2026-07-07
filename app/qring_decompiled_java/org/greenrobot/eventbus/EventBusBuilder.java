package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
public class EventBusBuilder {
    private static final java.util.concurrent.ExecutorService DEFAULT_EXECUTOR_SERVICE = java.util.concurrent.Executors.newCachedThreadPool();
    boolean ignoreGeneratedIndex;
    org.greenrobot.eventbus.Logger logger;
    org.greenrobot.eventbus.MainThreadSupport mainThreadSupport;
    java.util.List<java.lang.Class<?>> skipMethodVerificationForClasses;
    boolean strictMethodVerification;
    java.util.List<org.greenrobot.eventbus.meta.SubscriberInfoIndex> subscriberInfoIndexes;
    boolean throwSubscriberException;
    boolean logSubscriberExceptions = true;
    boolean logNoSubscriberMessages = true;
    boolean sendSubscriberExceptionEvent = true;
    boolean sendNoSubscriberEvent = true;
    boolean eventInheritance = true;
    java.util.concurrent.ExecutorService executorService = DEFAULT_EXECUTOR_SERVICE;

    EventBusBuilder() {
    }

    public org.greenrobot.eventbus.EventBusBuilder logSubscriberExceptions(boolean z) {
        this.logSubscriberExceptions = z;
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder logNoSubscriberMessages(boolean z) {
        this.logNoSubscriberMessages = z;
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder sendSubscriberExceptionEvent(boolean z) {
        this.sendSubscriberExceptionEvent = z;
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder sendNoSubscriberEvent(boolean z) {
        this.sendNoSubscriberEvent = z;
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder throwSubscriberException(boolean z) {
        this.throwSubscriberException = z;
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder eventInheritance(boolean z) {
        this.eventInheritance = z;
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder executorService(java.util.concurrent.ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder skipMethodVerificationFor(java.lang.Class<?> cls) {
        if (this.skipMethodVerificationForClasses == null) {
            this.skipMethodVerificationForClasses = new java.util.ArrayList();
        }
        this.skipMethodVerificationForClasses.add(cls);
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder ignoreGeneratedIndex(boolean z) {
        this.ignoreGeneratedIndex = z;
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder strictMethodVerification(boolean z) {
        this.strictMethodVerification = z;
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder addIndex(org.greenrobot.eventbus.meta.SubscriberInfoIndex subscriberInfoIndex) {
        if (this.subscriberInfoIndexes == null) {
            this.subscriberInfoIndexes = new java.util.ArrayList();
        }
        this.subscriberInfoIndexes.add(subscriberInfoIndex);
        return this;
    }

    public org.greenrobot.eventbus.EventBusBuilder logger(org.greenrobot.eventbus.Logger logger) {
        this.logger = logger;
        return this;
    }

    org.greenrobot.eventbus.Logger getLogger() {
        org.greenrobot.eventbus.Logger logger = this.logger;
        return logger != null ? logger : org.greenrobot.eventbus.Logger.Default.get();
    }

    org.greenrobot.eventbus.MainThreadSupport getMainThreadSupport() {
        org.greenrobot.eventbus.MainThreadSupport mainThreadSupport = this.mainThreadSupport;
        if (mainThreadSupport != null) {
            return mainThreadSupport;
        }
        if (org.greenrobot.eventbus.android.AndroidComponents.areAvailable()) {
            return org.greenrobot.eventbus.android.AndroidComponents.get().defaultMainThreadSupport;
        }
        return null;
    }

    public org.greenrobot.eventbus.EventBus installDefaultEventBus() {
        org.greenrobot.eventbus.EventBus eventBus;
        synchronized (org.greenrobot.eventbus.EventBus.class) {
            if (org.greenrobot.eventbus.EventBus.defaultInstance != null) {
                throw new org.greenrobot.eventbus.EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
            org.greenrobot.eventbus.EventBus.defaultInstance = build();
            eventBus = org.greenrobot.eventbus.EventBus.defaultInstance;
        }
        return eventBus;
    }

    public org.greenrobot.eventbus.EventBus build() {
        return new org.greenrobot.eventbus.EventBus(this);
    }
}
