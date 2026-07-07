package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
class SubscriberMethodFinder {
    private static final int BRIDGE = 64;
    private static final int MODIFIERS_IGNORE = 5192;
    private static final int POOL_SIZE = 4;
    private static final int SYNTHETIC = 4096;
    private final boolean ignoreGeneratedIndex;
    private final boolean strictMethodVerification;
    private java.util.List<org.greenrobot.eventbus.meta.SubscriberInfoIndex> subscriberInfoIndexes;
    private static final java.util.Map<java.lang.Class<?>, java.util.List<org.greenrobot.eventbus.SubscriberMethod>> METHOD_CACHE = new java.util.concurrent.ConcurrentHashMap();
    private static final org.greenrobot.eventbus.SubscriberMethodFinder.FindState[] FIND_STATE_POOL = new org.greenrobot.eventbus.SubscriberMethodFinder.FindState[4];

    SubscriberMethodFinder(java.util.List<org.greenrobot.eventbus.meta.SubscriberInfoIndex> list, boolean z, boolean z2) {
        this.subscriberInfoIndexes = list;
        this.strictMethodVerification = z;
        this.ignoreGeneratedIndex = z2;
    }

    java.util.List<org.greenrobot.eventbus.SubscriberMethod> findSubscriberMethods(java.lang.Class<?> cls) {
        java.util.List<org.greenrobot.eventbus.SubscriberMethod> findUsingInfo;
        java.util.Map<java.lang.Class<?>, java.util.List<org.greenrobot.eventbus.SubscriberMethod>> map = METHOD_CACHE;
        java.util.List<org.greenrobot.eventbus.SubscriberMethod> list = map.get(cls);
        if (list != null) {
            return list;
        }
        if (this.ignoreGeneratedIndex) {
            findUsingInfo = findUsingReflection(cls);
        } else {
            findUsingInfo = findUsingInfo(cls);
        }
        if (findUsingInfo.isEmpty()) {
            throw new org.greenrobot.eventbus.EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
        }
        map.put(cls, findUsingInfo);
        return findUsingInfo;
    }

    private java.util.List<org.greenrobot.eventbus.SubscriberMethod> findUsingInfo(java.lang.Class<?> cls) {
        org.greenrobot.eventbus.SubscriberMethodFinder.FindState prepareFindState = prepareFindState();
        prepareFindState.initForSubscriber(cls);
        while (prepareFindState.clazz != null) {
            prepareFindState.subscriberInfo = getSubscriberInfo(prepareFindState);
            if (prepareFindState.subscriberInfo != null) {
                for (org.greenrobot.eventbus.SubscriberMethod subscriberMethod : prepareFindState.subscriberInfo.getSubscriberMethods()) {
                    if (prepareFindState.checkAdd(subscriberMethod.method, subscriberMethod.eventType)) {
                        prepareFindState.subscriberMethods.add(subscriberMethod);
                    }
                }
            } else {
                findUsingReflectionInSingleClass(prepareFindState);
            }
            prepareFindState.moveToSuperclass();
        }
        return getMethodsAndRelease(prepareFindState);
    }

    private java.util.List<org.greenrobot.eventbus.SubscriberMethod> getMethodsAndRelease(org.greenrobot.eventbus.SubscriberMethodFinder.FindState findState) {
        java.util.ArrayList arrayList = new java.util.ArrayList(findState.subscriberMethods);
        findState.recycle();
        synchronized (FIND_STATE_POOL) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                }
                org.greenrobot.eventbus.SubscriberMethodFinder.FindState[] findStateArr = FIND_STATE_POOL;
                if (findStateArr[i] == null) {
                    findStateArr[i] = findState;
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    private org.greenrobot.eventbus.SubscriberMethodFinder.FindState prepareFindState() {
        synchronized (FIND_STATE_POOL) {
            for (int i = 0; i < 4; i++) {
                org.greenrobot.eventbus.SubscriberMethodFinder.FindState[] findStateArr = FIND_STATE_POOL;
                org.greenrobot.eventbus.SubscriberMethodFinder.FindState findState = findStateArr[i];
                if (findState != null) {
                    findStateArr[i] = null;
                    return findState;
                }
            }
            return new org.greenrobot.eventbus.SubscriberMethodFinder.FindState();
        }
    }

    private org.greenrobot.eventbus.meta.SubscriberInfo getSubscriberInfo(org.greenrobot.eventbus.SubscriberMethodFinder.FindState findState) {
        if (findState.subscriberInfo != null && findState.subscriberInfo.getSuperSubscriberInfo() != null) {
            org.greenrobot.eventbus.meta.SubscriberInfo superSubscriberInfo = findState.subscriberInfo.getSuperSubscriberInfo();
            if (findState.clazz == superSubscriberInfo.getSubscriberClass()) {
                return superSubscriberInfo;
            }
        }
        java.util.List<org.greenrobot.eventbus.meta.SubscriberInfoIndex> list = this.subscriberInfoIndexes;
        if (list == null) {
            return null;
        }
        java.util.Iterator<org.greenrobot.eventbus.meta.SubscriberInfoIndex> it = list.iterator();
        while (it.hasNext()) {
            org.greenrobot.eventbus.meta.SubscriberInfo subscriberInfo = it.next().getSubscriberInfo(findState.clazz);
            if (subscriberInfo != null) {
                return subscriberInfo;
            }
        }
        return null;
    }

    private java.util.List<org.greenrobot.eventbus.SubscriberMethod> findUsingReflection(java.lang.Class<?> cls) {
        org.greenrobot.eventbus.SubscriberMethodFinder.FindState prepareFindState = prepareFindState();
        prepareFindState.initForSubscriber(cls);
        while (prepareFindState.clazz != null) {
            findUsingReflectionInSingleClass(prepareFindState);
            prepareFindState.moveToSuperclass();
        }
        return getMethodsAndRelease(prepareFindState);
    }

    private void findUsingReflectionInSingleClass(org.greenrobot.eventbus.SubscriberMethodFinder.FindState findState) {
        java.lang.reflect.Method[] methods;
        try {
            try {
                methods = findState.clazz.getDeclaredMethods();
            } catch (java.lang.LinkageError e) {
                java.lang.String str = "Could not inspect methods of " + findState.clazz.getName();
                throw new org.greenrobot.eventbus.EventBusException(this.ignoreGeneratedIndex ? str + ". Please consider using EventBus annotation processor to avoid reflection." : str + ". Please make this class visible to EventBus annotation processor to avoid reflection.", e);
            }
        } catch (java.lang.Throwable unused) {
            methods = findState.clazz.getMethods();
            findState.skipSuperClasses = true;
        }
        for (java.lang.reflect.Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & MODIFIERS_IGNORE) == 0) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    org.greenrobot.eventbus.Subscribe subscribe = (org.greenrobot.eventbus.Subscribe) method.getAnnotation(org.greenrobot.eventbus.Subscribe.class);
                    if (subscribe != null) {
                        java.lang.Class<?> cls = parameterTypes[0];
                        if (findState.checkAdd(method, cls)) {
                            findState.subscriberMethods.add(new org.greenrobot.eventbus.SubscriberMethod(method, cls, subscribe.threadMode(), subscribe.priority(), subscribe.sticky()));
                        }
                    }
                } else if (this.strictMethodVerification && method.isAnnotationPresent(org.greenrobot.eventbus.Subscribe.class)) {
                    throw new org.greenrobot.eventbus.EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.strictMethodVerification && method.isAnnotationPresent(org.greenrobot.eventbus.Subscribe.class)) {
                throw new org.greenrobot.eventbus.EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    static void clearCaches() {
        METHOD_CACHE.clear();
    }

    static class FindState {
        java.lang.Class<?> clazz;
        boolean skipSuperClasses;
        java.lang.Class<?> subscriberClass;
        org.greenrobot.eventbus.meta.SubscriberInfo subscriberInfo;
        final java.util.List<org.greenrobot.eventbus.SubscriberMethod> subscriberMethods = new java.util.ArrayList();
        final java.util.Map<java.lang.Class, java.lang.Object> anyMethodByEventType = new java.util.HashMap();
        final java.util.Map<java.lang.String, java.lang.Class> subscriberClassByMethodKey = new java.util.HashMap();
        final java.lang.StringBuilder methodKeyBuilder = new java.lang.StringBuilder(128);

        FindState() {
        }

        void initForSubscriber(java.lang.Class<?> cls) {
            this.clazz = cls;
            this.subscriberClass = cls;
            this.skipSuperClasses = false;
            this.subscriberInfo = null;
        }

        void recycle() {
            this.subscriberMethods.clear();
            this.anyMethodByEventType.clear();
            this.subscriberClassByMethodKey.clear();
            this.methodKeyBuilder.setLength(0);
            this.subscriberClass = null;
            this.clazz = null;
            this.skipSuperClasses = false;
            this.subscriberInfo = null;
        }

        boolean checkAdd(java.lang.reflect.Method method, java.lang.Class<?> cls) {
            java.lang.Object put = this.anyMethodByEventType.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof java.lang.reflect.Method) {
                if (!checkAddWithMethodSignature((java.lang.reflect.Method) put, cls)) {
                    throw new java.lang.IllegalStateException();
                }
                this.anyMethodByEventType.put(cls, this);
            }
            return checkAddWithMethodSignature(method, cls);
        }

        private boolean checkAddWithMethodSignature(java.lang.reflect.Method method, java.lang.Class<?> cls) {
            this.methodKeyBuilder.setLength(0);
            this.methodKeyBuilder.append(method.getName());
            java.lang.StringBuilder sb = this.methodKeyBuilder;
            sb.append(kotlin.text.Typography.greater);
            sb.append(cls.getName());
            java.lang.String sb2 = this.methodKeyBuilder.toString();
            java.lang.Class<?> declaringClass = method.getDeclaringClass();
            java.lang.Class put = this.subscriberClassByMethodKey.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.subscriberClassByMethodKey.put(sb2, put);
            return false;
        }

        void moveToSuperclass() {
            if (this.skipSuperClasses) {
                this.clazz = null;
                return;
            }
            java.lang.Class<? super java.lang.Object> superclass = this.clazz.getSuperclass();
            this.clazz = superclass;
            java.lang.String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.clazz = null;
            }
        }
    }
}
