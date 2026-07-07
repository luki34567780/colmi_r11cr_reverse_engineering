package org.greenrobot.eventbus.util;

/* loaded from: classes3.dex */
public class AsyncExecutor {
    private final org.greenrobot.eventbus.EventBus eventBus;
    private final java.lang.reflect.Constructor<?> failureEventConstructor;
    private final java.lang.Object scope;
    private final java.util.concurrent.Executor threadPool;

    public interface RunnableEx {
        void run() throws java.lang.Exception;
    }

    public static class Builder {
        private org.greenrobot.eventbus.EventBus eventBus;
        private java.lang.Class<?> failureEventType;
        private java.util.concurrent.Executor threadPool;

        private Builder() {
        }

        public org.greenrobot.eventbus.util.AsyncExecutor.Builder threadPool(java.util.concurrent.Executor executor) {
            this.threadPool = executor;
            return this;
        }

        public org.greenrobot.eventbus.util.AsyncExecutor.Builder failureEventType(java.lang.Class<?> cls) {
            this.failureEventType = cls;
            return this;
        }

        public org.greenrobot.eventbus.util.AsyncExecutor.Builder eventBus(org.greenrobot.eventbus.EventBus eventBus) {
            this.eventBus = eventBus;
            return this;
        }

        public org.greenrobot.eventbus.util.AsyncExecutor build() {
            return buildForScope(null);
        }

        public org.greenrobot.eventbus.util.AsyncExecutor buildForScope(java.lang.Object obj) {
            if (this.eventBus == null) {
                this.eventBus = org.greenrobot.eventbus.EventBus.getDefault();
            }
            if (this.threadPool == null) {
                this.threadPool = java.util.concurrent.Executors.newCachedThreadPool();
            }
            if (this.failureEventType == null) {
                this.failureEventType = org.greenrobot.eventbus.util.ThrowableFailureEvent.class;
            }
            return new org.greenrobot.eventbus.util.AsyncExecutor(this.threadPool, this.eventBus, this.failureEventType, obj);
        }
    }

    public static org.greenrobot.eventbus.util.AsyncExecutor.Builder builder() {
        return new org.greenrobot.eventbus.util.AsyncExecutor.Builder();
    }

    public static org.greenrobot.eventbus.util.AsyncExecutor create() {
        return new org.greenrobot.eventbus.util.AsyncExecutor.Builder().build();
    }

    private AsyncExecutor(java.util.concurrent.Executor executor, org.greenrobot.eventbus.EventBus eventBus, java.lang.Class<?> cls, java.lang.Object obj) {
        this.threadPool = executor;
        this.eventBus = eventBus;
        this.scope = obj;
        try {
            this.failureEventConstructor = cls.getConstructor(java.lang.Throwable.class);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", e);
        }
    }

    public void execute(final org.greenrobot.eventbus.util.AsyncExecutor.RunnableEx runnableEx) {
        this.threadPool.execute(new java.lang.Runnable() { // from class: org.greenrobot.eventbus.util.AsyncExecutor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                org.greenrobot.eventbus.util.AsyncExecutor.this.m2746lambda$execute$0$orggreenroboteventbusutilAsyncExecutor(runnableEx);
            }
        });
    }

    /* renamed from: lambda$execute$0$org-greenrobot-eventbus-util-AsyncExecutor, reason: not valid java name */
    public /* synthetic */ void m2746lambda$execute$0$orggreenroboteventbusutilAsyncExecutor(org.greenrobot.eventbus.util.AsyncExecutor.RunnableEx runnableEx) {
        try {
            runnableEx.run();
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object newInstance = this.failureEventConstructor.newInstance(e);
                if (newInstance instanceof org.greenrobot.eventbus.util.HasExecutionScope) {
                    ((org.greenrobot.eventbus.util.HasExecutionScope) newInstance).setExecutionScope(this.scope);
                }
                this.eventBus.post(newInstance);
            } catch (java.lang.Exception e2) {
                this.eventBus.getLogger().log(java.util.logging.Level.SEVERE, "Original exception:", e);
                throw new java.lang.RuntimeException("Could not create failure event", e2);
            }
        }
    }
}
