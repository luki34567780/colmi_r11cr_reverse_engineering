package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
public class EventBus {
    public static java.lang.String TAG = "EventBus";
    static volatile org.greenrobot.eventbus.EventBus defaultInstance;
    private final org.greenrobot.eventbus.AsyncPoster asyncPoster;
    private final org.greenrobot.eventbus.BackgroundPoster backgroundPoster;
    private final java.lang.ThreadLocal<org.greenrobot.eventbus.EventBus.PostingThreadState> currentPostingThreadState;
    private final boolean eventInheritance;
    private final java.util.concurrent.ExecutorService executorService;
    private final int indexCount;
    private final boolean logNoSubscriberMessages;
    private final boolean logSubscriberExceptions;
    private final org.greenrobot.eventbus.Logger logger;
    private final org.greenrobot.eventbus.Poster mainThreadPoster;
    private final org.greenrobot.eventbus.MainThreadSupport mainThreadSupport;
    private final boolean sendNoSubscriberEvent;
    private final boolean sendSubscriberExceptionEvent;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> stickyEvents;
    private final org.greenrobot.eventbus.SubscriberMethodFinder subscriberMethodFinder;
    private final java.util.Map<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArrayList<org.greenrobot.eventbus.Subscription>> subscriptionsByEventType;
    private final boolean throwSubscriberException;
    private final java.util.Map<java.lang.Object, java.util.List<java.lang.Class<?>>> typesBySubscriber;
    private static final org.greenrobot.eventbus.EventBusBuilder DEFAULT_BUILDER = new org.greenrobot.eventbus.EventBusBuilder();
    private static final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> eventTypesCache = new java.util.HashMap();

    interface PostCallback {
        void onPostCompleted(java.util.List<org.greenrobot.eventbus.SubscriberExceptionEvent> list);
    }

    public static org.greenrobot.eventbus.EventBus getDefault() {
        org.greenrobot.eventbus.EventBus eventBus = defaultInstance;
        if (eventBus == null) {
            synchronized (org.greenrobot.eventbus.EventBus.class) {
                eventBus = defaultInstance;
                if (eventBus == null) {
                    eventBus = new org.greenrobot.eventbus.EventBus();
                    defaultInstance = eventBus;
                }
            }
        }
        return eventBus;
    }

    public static org.greenrobot.eventbus.EventBusBuilder builder() {
        return new org.greenrobot.eventbus.EventBusBuilder();
    }

    public static void clearCaches() {
        org.greenrobot.eventbus.SubscriberMethodFinder.clearCaches();
        eventTypesCache.clear();
    }

    public EventBus() {
        this(DEFAULT_BUILDER);
    }

    EventBus(org.greenrobot.eventbus.EventBusBuilder eventBusBuilder) {
        this.currentPostingThreadState = new java.lang.ThreadLocal<org.greenrobot.eventbus.EventBus.PostingThreadState>() { // from class: org.greenrobot.eventbus.EventBus.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public org.greenrobot.eventbus.EventBus.PostingThreadState initialValue() {
                return new org.greenrobot.eventbus.EventBus.PostingThreadState();
            }
        };
        this.logger = eventBusBuilder.getLogger();
        this.subscriptionsByEventType = new java.util.HashMap();
        this.typesBySubscriber = new java.util.HashMap();
        this.stickyEvents = new java.util.concurrent.ConcurrentHashMap();
        org.greenrobot.eventbus.MainThreadSupport mainThreadSupport = eventBusBuilder.getMainThreadSupport();
        this.mainThreadSupport = mainThreadSupport;
        this.mainThreadPoster = mainThreadSupport != null ? mainThreadSupport.createPoster(this) : null;
        this.backgroundPoster = new org.greenrobot.eventbus.BackgroundPoster(this);
        this.asyncPoster = new org.greenrobot.eventbus.AsyncPoster(this);
        this.indexCount = eventBusBuilder.subscriberInfoIndexes != null ? eventBusBuilder.subscriberInfoIndexes.size() : 0;
        this.subscriberMethodFinder = new org.greenrobot.eventbus.SubscriberMethodFinder(eventBusBuilder.subscriberInfoIndexes, eventBusBuilder.strictMethodVerification, eventBusBuilder.ignoreGeneratedIndex);
        this.logSubscriberExceptions = eventBusBuilder.logSubscriberExceptions;
        this.logNoSubscriberMessages = eventBusBuilder.logNoSubscriberMessages;
        this.sendSubscriberExceptionEvent = eventBusBuilder.sendSubscriberExceptionEvent;
        this.sendNoSubscriberEvent = eventBusBuilder.sendNoSubscriberEvent;
        this.throwSubscriberException = eventBusBuilder.throwSubscriberException;
        this.eventInheritance = eventBusBuilder.eventInheritance;
        this.executorService = eventBusBuilder.executorService;
    }

    public void register(java.lang.Object obj) {
        if (org.greenrobot.eventbus.android.AndroidDependenciesDetector.isAndroidSDKAvailable() && !org.greenrobot.eventbus.android.AndroidDependenciesDetector.areAndroidComponentsAvailable()) {
            throw new java.lang.RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
        }
        java.util.List<org.greenrobot.eventbus.SubscriberMethod> findSubscriberMethods = this.subscriberMethodFinder.findSubscriberMethods(obj.getClass());
        synchronized (this) {
            java.util.Iterator<org.greenrobot.eventbus.SubscriberMethod> it = findSubscriberMethods.iterator();
            while (it.hasNext()) {
                subscribe(obj, it.next());
            }
        }
    }

    private void subscribe(java.lang.Object obj, org.greenrobot.eventbus.SubscriberMethod subscriberMethod) {
        java.lang.Class<?> cls = subscriberMethod.eventType;
        org.greenrobot.eventbus.Subscription subscription = new org.greenrobot.eventbus.Subscription(obj, subscriberMethod);
        java.util.concurrent.CopyOnWriteArrayList<org.greenrobot.eventbus.Subscription> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList<>();
            this.subscriptionsByEventType.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(subscription)) {
            throw new org.greenrobot.eventbus.EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i == size || subscriberMethod.priority > copyOnWriteArrayList.get(i).subscriberMethod.priority) {
                copyOnWriteArrayList.add(i, subscription);
                break;
            }
        }
        java.util.List<java.lang.Class<?>> list = this.typesBySubscriber.get(obj);
        if (list == null) {
            list = new java.util.ArrayList<>();
            this.typesBySubscriber.put(obj, list);
        }
        list.add(cls);
        if (subscriberMethod.sticky) {
            if (this.eventInheritance) {
                for (java.util.Map.Entry<java.lang.Class<?>, java.lang.Object> entry : this.stickyEvents.entrySet()) {
                    if (cls.isAssignableFrom(entry.getKey())) {
                        checkPostStickyEventToSubscription(subscription, entry.getValue());
                    }
                }
                return;
            }
            checkPostStickyEventToSubscription(subscription, this.stickyEvents.get(cls));
        }
    }

    private void checkPostStickyEventToSubscription(org.greenrobot.eventbus.Subscription subscription, java.lang.Object obj) {
        if (obj != null) {
            postToSubscription(subscription, obj, isMainThread());
        }
    }

    private boolean isMainThread() {
        org.greenrobot.eventbus.MainThreadSupport mainThreadSupport = this.mainThreadSupport;
        return mainThreadSupport == null || mainThreadSupport.isMainThread();
    }

    public synchronized boolean isRegistered(java.lang.Object obj) {
        return this.typesBySubscriber.containsKey(obj);
    }

    private void unsubscribeByEventType(java.lang.Object obj, java.lang.Class<?> cls) {
        java.util.concurrent.CopyOnWriteArrayList<org.greenrobot.eventbus.Subscription> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                org.greenrobot.eventbus.Subscription subscription = copyOnWriteArrayList.get(i);
                if (subscription.subscriber == obj) {
                    subscription.active = false;
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public synchronized void unregister(java.lang.Object obj) {
        java.util.List<java.lang.Class<?>> list = this.typesBySubscriber.get(obj);
        if (list != null) {
            java.util.Iterator<java.lang.Class<?>> it = list.iterator();
            while (it.hasNext()) {
                unsubscribeByEventType(obj, it.next());
            }
            this.typesBySubscriber.remove(obj);
        } else {
            this.logger.log(java.util.logging.Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public void post(java.lang.Object obj) {
        org.greenrobot.eventbus.EventBus.PostingThreadState postingThreadState = this.currentPostingThreadState.get();
        java.util.List<java.lang.Object> list = postingThreadState.eventQueue;
        list.add(obj);
        if (postingThreadState.isPosting) {
            return;
        }
        postingThreadState.isMainThread = isMainThread();
        postingThreadState.isPosting = true;
        if (postingThreadState.canceled) {
            throw new org.greenrobot.eventbus.EventBusException("Internal error. Abort state was not reset");
        }
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                } else {
                    postSingleEvent(list.remove(0), postingThreadState);
                }
            } finally {
                postingThreadState.isPosting = false;
                postingThreadState.isMainThread = false;
            }
        }
    }

    public void cancelEventDelivery(java.lang.Object obj) {
        org.greenrobot.eventbus.EventBus.PostingThreadState postingThreadState = this.currentPostingThreadState.get();
        if (!postingThreadState.isPosting) {
            throw new org.greenrobot.eventbus.EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null) {
            throw new org.greenrobot.eventbus.EventBusException("Event may not be null");
        }
        if (postingThreadState.event != obj) {
            throw new org.greenrobot.eventbus.EventBusException("Only the currently handled event may be aborted");
        }
        if (postingThreadState.subscription.subscriberMethod.threadMode != org.greenrobot.eventbus.ThreadMode.POSTING) {
            throw new org.greenrobot.eventbus.EventBusException(" event handlers may only abort the incoming event");
        }
        postingThreadState.canceled = true;
    }

    public void postSticky(java.lang.Object obj) {
        synchronized (this.stickyEvents) {
            this.stickyEvents.put(obj.getClass(), obj);
        }
        post(obj);
    }

    public <T> T getStickyEvent(java.lang.Class<T> cls) {
        T cast;
        synchronized (this.stickyEvents) {
            cast = cls.cast(this.stickyEvents.get(cls));
        }
        return cast;
    }

    public <T> T removeStickyEvent(java.lang.Class<T> cls) {
        T cast;
        synchronized (this.stickyEvents) {
            cast = cls.cast(this.stickyEvents.remove(cls));
        }
        return cast;
    }

    public boolean removeStickyEvent(java.lang.Object obj) {
        synchronized (this.stickyEvents) {
            java.lang.Class<?> cls = obj.getClass();
            if (!obj.equals(this.stickyEvents.get(cls))) {
                return false;
            }
            this.stickyEvents.remove(cls);
            return true;
        }
    }

    public void removeAllStickyEvents() {
        synchronized (this.stickyEvents) {
            this.stickyEvents.clear();
        }
    }

    public boolean hasSubscriberForEvent(java.lang.Class<?> cls) {
        java.util.concurrent.CopyOnWriteArrayList<org.greenrobot.eventbus.Subscription> copyOnWriteArrayList;
        java.util.List<java.lang.Class<?>> lookupAllEventTypes = lookupAllEventTypes(cls);
        if (lookupAllEventTypes != null) {
            int size = lookupAllEventTypes.size();
            for (int i = 0; i < size; i++) {
                java.lang.Class<?> cls2 = lookupAllEventTypes.get(i);
                synchronized (this) {
                    copyOnWriteArrayList = this.subscriptionsByEventType.get(cls2);
                }
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void postSingleEvent(java.lang.Object obj, org.greenrobot.eventbus.EventBus.PostingThreadState postingThreadState) throws java.lang.Error {
        boolean postSingleEventForEventType;
        java.lang.Class<?> cls = obj.getClass();
        if (this.eventInheritance) {
            java.util.List<java.lang.Class<?>> lookupAllEventTypes = lookupAllEventTypes(cls);
            int size = lookupAllEventTypes.size();
            postSingleEventForEventType = false;
            for (int i = 0; i < size; i++) {
                postSingleEventForEventType |= postSingleEventForEventType(obj, postingThreadState, lookupAllEventTypes.get(i));
            }
        } else {
            postSingleEventForEventType = postSingleEventForEventType(obj, postingThreadState, cls);
        }
        if (postSingleEventForEventType) {
            return;
        }
        if (this.logNoSubscriberMessages) {
            this.logger.log(java.util.logging.Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.sendNoSubscriberEvent || cls == org.greenrobot.eventbus.NoSubscriberEvent.class || cls == org.greenrobot.eventbus.SubscriberExceptionEvent.class) {
            return;
        }
        post(new org.greenrobot.eventbus.NoSubscriberEvent(this, obj));
    }

    private boolean postSingleEventForEventType(java.lang.Object obj, org.greenrobot.eventbus.EventBus.PostingThreadState postingThreadState, java.lang.Class<?> cls) {
        java.util.concurrent.CopyOnWriteArrayList<org.greenrobot.eventbus.Subscription> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator<org.greenrobot.eventbus.Subscription> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            org.greenrobot.eventbus.Subscription next = it.next();
            postingThreadState.event = obj;
            postingThreadState.subscription = next;
            try {
                postToSubscription(next, obj, postingThreadState.isMainThread);
                if (postingThreadState.canceled) {
                    return true;
                }
            } finally {
                postingThreadState.event = null;
                postingThreadState.subscription = null;
                postingThreadState.canceled = false;
            }
        }
        return true;
    }

    /* renamed from: org.greenrobot.eventbus.EventBus$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$greenrobot$eventbus$ThreadMode;

        static {
            int[] iArr = new int[org.greenrobot.eventbus.ThreadMode.values().length];
            $SwitchMap$org$greenrobot$eventbus$ThreadMode = iArr;
            try {
                iArr[org.greenrobot.eventbus.ThreadMode.POSTING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$greenrobot$eventbus$ThreadMode[org.greenrobot.eventbus.ThreadMode.MAIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$greenrobot$eventbus$ThreadMode[org.greenrobot.eventbus.ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$greenrobot$eventbus$ThreadMode[org.greenrobot.eventbus.ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$greenrobot$eventbus$ThreadMode[org.greenrobot.eventbus.ThreadMode.ASYNC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private void postToSubscription(org.greenrobot.eventbus.Subscription subscription, java.lang.Object obj, boolean z) {
        int i = org.greenrobot.eventbus.EventBus.AnonymousClass2.$SwitchMap$org$greenrobot$eventbus$ThreadMode[subscription.subscriberMethod.threadMode.ordinal()];
        if (i == 1) {
            invokeSubscriber(subscription, obj);
            return;
        }
        if (i == 2) {
            if (z) {
                invokeSubscriber(subscription, obj);
                return;
            } else {
                this.mainThreadPoster.enqueue(subscription, obj);
                return;
            }
        }
        if (i == 3) {
            org.greenrobot.eventbus.Poster poster = this.mainThreadPoster;
            if (poster != null) {
                poster.enqueue(subscription, obj);
                return;
            } else {
                invokeSubscriber(subscription, obj);
                return;
            }
        }
        if (i == 4) {
            if (z) {
                this.backgroundPoster.enqueue(subscription, obj);
                return;
            } else {
                invokeSubscriber(subscription, obj);
                return;
            }
        }
        if (i == 5) {
            this.asyncPoster.enqueue(subscription, obj);
            return;
        }
        throw new java.lang.IllegalStateException("Unknown thread mode: " + subscription.subscriberMethod.threadMode);
    }

    private static java.util.List<java.lang.Class<?>> lookupAllEventTypes(java.lang.Class<?> cls) {
        java.util.List<java.lang.Class<?>> list;
        java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> map = eventTypesCache;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new java.util.ArrayList<>();
                for (java.lang.Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    addInterfaces(list, cls2.getInterfaces());
                }
                eventTypesCache.put(cls, list);
            }
        }
        return list;
    }

    static void addInterfaces(java.util.List<java.lang.Class<?>> list, java.lang.Class<?>[] clsArr) {
        for (java.lang.Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                addInterfaces(list, cls.getInterfaces());
            }
        }
    }

    void invokeSubscriber(org.greenrobot.eventbus.PendingPost pendingPost) {
        java.lang.Object obj = pendingPost.event;
        org.greenrobot.eventbus.Subscription subscription = pendingPost.subscription;
        org.greenrobot.eventbus.PendingPost.releasePendingPost(pendingPost);
        if (subscription.active) {
            invokeSubscriber(subscription, obj);
        }
    }

    void invokeSubscriber(org.greenrobot.eventbus.Subscription subscription, java.lang.Object obj) {
        try {
            subscription.subscriberMethod.method.invoke(subscription.subscriber, obj);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalStateException("Unexpected exception", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            handleSubscriberException(subscription, obj, e2.getCause());
        }
    }

    private void handleSubscriberException(org.greenrobot.eventbus.Subscription subscription, java.lang.Object obj, java.lang.Throwable th) {
        if (obj instanceof org.greenrobot.eventbus.SubscriberExceptionEvent) {
            if (this.logSubscriberExceptions) {
                this.logger.log(java.util.logging.Level.SEVERE, "SubscriberExceptionEvent subscriber " + subscription.subscriber.getClass() + " threw an exception", th);
                org.greenrobot.eventbus.SubscriberExceptionEvent subscriberExceptionEvent = (org.greenrobot.eventbus.SubscriberExceptionEvent) obj;
                this.logger.log(java.util.logging.Level.SEVERE, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            return;
        }
        if (this.throwSubscriberException) {
            throw new org.greenrobot.eventbus.EventBusException("Invoking subscriber failed", th);
        }
        if (this.logSubscriberExceptions) {
            this.logger.log(java.util.logging.Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.subscriber.getClass(), th);
        }
        if (this.sendSubscriberExceptionEvent) {
            post(new org.greenrobot.eventbus.SubscriberExceptionEvent(this, th, obj, subscription.subscriber));
        }
    }

    static final class PostingThreadState {
        boolean canceled;
        java.lang.Object event;
        final java.util.List<java.lang.Object> eventQueue = new java.util.ArrayList();
        boolean isMainThread;
        boolean isPosting;
        org.greenrobot.eventbus.Subscription subscription;

        PostingThreadState() {
        }
    }

    java.util.concurrent.ExecutorService getExecutorService() {
        return this.executorService;
    }

    public org.greenrobot.eventbus.Logger getLogger() {
        return this.logger;
    }

    public java.lang.String toString() {
        return "EventBus[indexCount=" + this.indexCount + ", eventInheritance=" + this.eventInheritance + "]";
    }
}
