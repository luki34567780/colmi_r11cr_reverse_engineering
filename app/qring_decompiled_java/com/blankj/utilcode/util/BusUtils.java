package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class BusUtils {
    private static final java.lang.Object NULL = "nULl";
    private static final java.lang.String TAG = "BusUtils";
    private final java.util.Map<java.lang.String, java.util.Set<java.lang.Object>> mClassName_BusesMap;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> mClassName_Tag_Arg4StickyMap;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> mClassName_TagsMap;
    private final java.util.Map<java.lang.String, java.util.List<com.blankj.utilcode.util.BusUtils.BusInfo>> mTag_BusInfoListMap;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Bus {
        int priority() default 0;

        boolean sticky() default false;

        java.lang.String tag();

        com.blankj.utilcode.util.BusUtils.ThreadMode threadMode() default com.blankj.utilcode.util.BusUtils.ThreadMode.POSTING;
    }

    public enum ThreadMode {
        MAIN,
        IO,
        CPU,
        CACHED,
        SINGLE,
        POSTING
    }

    private void init() {
    }

    private BusUtils() {
        this.mTag_BusInfoListMap = new java.util.concurrent.ConcurrentHashMap();
        this.mClassName_BusesMap = new java.util.concurrent.ConcurrentHashMap();
        this.mClassName_TagsMap = new java.util.concurrent.ConcurrentHashMap();
        this.mClassName_Tag_Arg4StickyMap = new java.util.concurrent.ConcurrentHashMap();
        init();
    }

    private void registerBus(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6) {
        registerBus(str, str2, str3, str4, str5, z, str6, 0);
    }

    private void registerBus(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, int i) {
        java.util.List<com.blankj.utilcode.util.BusUtils.BusInfo> list = this.mTag_BusInfoListMap.get(str);
        if (list == null) {
            list = new java.util.concurrent.CopyOnWriteArrayList<>();
            this.mTag_BusInfoListMap.put(str, list);
        }
        list.add(new com.blankj.utilcode.util.BusUtils.BusInfo(str, str2, str3, str4, str5, z, str6, i));
    }

    public static void register(java.lang.Object obj) {
        getInstance().registerInner(obj);
    }

    public static void unregister(java.lang.Object obj) {
        getInstance().unregisterInner(obj);
    }

    public static void post(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'tag' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        post(str, NULL);
    }

    public static void post(java.lang.String str, java.lang.Object obj) {
        java.util.Objects.requireNonNull(str, "Argument 'tag' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(obj, "Argument 'arg' of type Object (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        getInstance().postInner(str, obj);
    }

    public static void postSticky(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'tag' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        postSticky(str, NULL);
    }

    public static void postSticky(java.lang.String str, java.lang.Object obj) {
        java.util.Objects.requireNonNull(str, "Argument 'tag' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        getInstance().postStickyInner(str, obj);
    }

    public static void removeSticky(java.lang.String str) {
        getInstance().removeStickyInner(str);
    }

    public static java.lang.String toString_() {
        return getInstance().toString();
    }

    public java.lang.String toString() {
        return "BusUtils: " + this.mTag_BusInfoListMap;
    }

    private static com.blankj.utilcode.util.BusUtils getInstance() {
        return com.blankj.utilcode.util.BusUtils.LazyHolder.INSTANCE;
    }

    private void registerInner(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        java.lang.Class<?> cls = obj.getClass();
        java.lang.String name = cls.getName();
        boolean z = false;
        synchronized (this.mClassName_BusesMap) {
            java.util.Set<java.lang.Object> set = this.mClassName_BusesMap.get(name);
            if (set == null) {
                set = new java.util.concurrent.CopyOnWriteArraySet<>();
                this.mClassName_BusesMap.put(name, set);
                z = true;
            }
            if (set.contains(obj)) {
                android.util.Log.w(TAG, "The bus of <" + obj + "> already registered.");
                return;
            }
            set.add(obj);
            if (z) {
                recordTags(cls, name);
            }
            consumeStickyIfExist(obj);
        }
    }

    private void recordTags(java.lang.Class<?> cls, java.lang.String str) {
        if (this.mClassName_TagsMap.get(str) == null) {
            synchronized (this.mClassName_TagsMap) {
                if (this.mClassName_TagsMap.get(str) == null) {
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
                    for (java.util.Map.Entry<java.lang.String, java.util.List<com.blankj.utilcode.util.BusUtils.BusInfo>> entry : this.mTag_BusInfoListMap.entrySet()) {
                        for (com.blankj.utilcode.util.BusUtils.BusInfo busInfo : entry.getValue()) {
                            try {
                                if (java.lang.Class.forName(busInfo.className).isAssignableFrom(cls)) {
                                    copyOnWriteArrayList.add(entry.getKey());
                                    busInfo.subClassNames.add(str);
                                }
                            } catch (java.lang.ClassNotFoundException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    this.mClassName_TagsMap.put(str, copyOnWriteArrayList);
                }
            }
        }
    }

    private void consumeStickyIfExist(java.lang.Object obj) {
        java.util.Map<java.lang.String, java.lang.Object> map = this.mClassName_Tag_Arg4StickyMap.get(obj.getClass().getName());
        if (map == null) {
            return;
        }
        synchronized (this.mClassName_Tag_Arg4StickyMap) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
                consumeSticky(obj, entry.getKey(), entry.getValue());
            }
        }
    }

    private void consumeSticky(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        java.util.List<com.blankj.utilcode.util.BusUtils.BusInfo> list = this.mTag_BusInfoListMap.get(str);
        if (list == null) {
            android.util.Log.e(TAG, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (com.blankj.utilcode.util.BusUtils.BusInfo busInfo : list) {
            if (busInfo.subClassNames.contains(obj.getClass().getName()) && busInfo.sticky) {
                synchronized (this.mClassName_Tag_Arg4StickyMap) {
                    java.util.Map<java.lang.String, java.lang.Object> map = this.mClassName_Tag_Arg4StickyMap.get(busInfo.className);
                    if (map != null && map.containsKey(str)) {
                        invokeBus(obj, obj2, busInfo, true);
                    }
                }
            }
        }
    }

    private void unregisterInner(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        java.lang.String name = obj.getClass().getName();
        synchronized (this.mClassName_BusesMap) {
            java.util.Set<java.lang.Object> set = this.mClassName_BusesMap.get(name);
            if (set != null && set.contains(obj)) {
                set.remove(obj);
                return;
            }
            android.util.Log.e(TAG, "The bus of <" + obj + "> was not registered before.");
        }
    }

    private void postInner(java.lang.String str, java.lang.Object obj) {
        postInner(str, obj, false);
    }

    private void postInner(java.lang.String str, java.lang.Object obj, boolean z) {
        java.util.List<com.blankj.utilcode.util.BusUtils.BusInfo> list = this.mTag_BusInfoListMap.get(str);
        if (list == null) {
            android.util.Log.e(TAG, "The bus of tag <" + str + "> is not exists.");
            if (this.mTag_BusInfoListMap.isEmpty()) {
                android.util.Log.e(TAG, "Please check whether the bus plugin is applied.");
                return;
            }
            return;
        }
        java.util.Iterator<com.blankj.utilcode.util.BusUtils.BusInfo> it = list.iterator();
        while (it.hasNext()) {
            invokeBus(obj, it.next(), z);
        }
    }

    private void invokeBus(java.lang.Object obj, com.blankj.utilcode.util.BusUtils.BusInfo busInfo, boolean z) {
        invokeBus(null, obj, busInfo, z);
    }

    private void invokeBus(java.lang.Object obj, java.lang.Object obj2, com.blankj.utilcode.util.BusUtils.BusInfo busInfo, boolean z) {
        if (busInfo.method == null) {
            java.lang.reflect.Method methodByBusInfo = getMethodByBusInfo(busInfo);
            if (methodByBusInfo == null) {
                return;
            } else {
                busInfo.method = methodByBusInfo;
            }
        }
        invokeMethod(obj, obj2, busInfo, z);
    }

    private java.lang.reflect.Method getMethodByBusInfo(com.blankj.utilcode.util.BusUtils.BusInfo busInfo) {
        try {
            return "".equals(busInfo.paramType) ? java.lang.Class.forName(busInfo.className).getDeclaredMethod(busInfo.funName, new java.lang.Class[0]) : java.lang.Class.forName(busInfo.className).getDeclaredMethod(busInfo.funName, getClassName(busInfo.paramType));
        } catch (java.lang.ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (java.lang.NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private java.lang.Class getClassName(java.lang.String str) throws java.lang.ClassNotFoundException {
        str.hashCode();
        switch (str) {
            case "double":
                return java.lang.Double.TYPE;
            case "int":
                return java.lang.Integer.TYPE;
            case "byte":
                return java.lang.Byte.TYPE;
            case "char":
                return java.lang.Character.TYPE;
            case "long":
                return java.lang.Long.TYPE;
            case "boolean":
                return java.lang.Boolean.TYPE;
            case "float":
                return java.lang.Float.TYPE;
            case "short":
                return java.lang.Short.TYPE;
            default:
                return java.lang.Class.forName(str);
        }
    }

    private void invokeMethod(java.lang.Object obj, com.blankj.utilcode.util.BusUtils.BusInfo busInfo, boolean z) {
        invokeMethod(null, obj, busInfo, z);
    }

    private void invokeMethod(final java.lang.Object obj, final java.lang.Object obj2, final com.blankj.utilcode.util.BusUtils.BusInfo busInfo, final boolean z) {
        java.lang.Runnable runnable;
        runnable = new java.lang.Runnable() { // from class: com.blankj.utilcode.util.BusUtils.1
            @Override // java.lang.Runnable
            public void run() {
                com.blankj.utilcode.util.BusUtils.this.realInvokeMethod(obj, obj2, busInfo, z);
            }
        };
        java.lang.String str = busInfo.threadMode;
        str.hashCode();
        switch (str) {
            case "SINGLE":
                com.blankj.utilcode.util.ThreadUtils.getSinglePool().execute(runnable);
                break;
            case "IO":
                com.blankj.utilcode.util.ThreadUtils.getIoPool().execute(runnable);
                break;
            case "CPU":
                com.blankj.utilcode.util.ThreadUtils.getCpuPool().execute(runnable);
                break;
            case "MAIN":
                com.blankj.utilcode.util.ThreadUtils.runOnUiThread(runnable);
                break;
            case "CACHED":
                com.blankj.utilcode.util.ThreadUtils.getCachedPool().execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realInvokeMethod(java.lang.Object obj, java.lang.Object obj2, com.blankj.utilcode.util.BusUtils.BusInfo busInfo, boolean z) {
        java.util.Set<java.lang.Object> hashSet = new java.util.HashSet<>();
        if (obj == null) {
            java.util.Iterator<java.lang.String> it = busInfo.subClassNames.iterator();
            while (it.hasNext()) {
                java.util.Set<java.lang.Object> set = this.mClassName_BusesMap.get(it.next());
                if (set != null && !set.isEmpty()) {
                    hashSet.addAll(set);
                }
            }
            if (hashSet.size() == 0) {
                if (z) {
                    return;
                }
                android.util.Log.e(TAG, "The " + busInfo + " was not registered before.");
                return;
            }
        } else {
            hashSet.add(obj);
        }
        invokeBuses(obj2, busInfo, hashSet);
    }

    private void invokeBuses(java.lang.Object obj, com.blankj.utilcode.util.BusUtils.BusInfo busInfo, java.util.Set<java.lang.Object> set) {
        try {
            if (obj == NULL) {
                java.util.Iterator<java.lang.Object> it = set.iterator();
                while (it.hasNext()) {
                    busInfo.method.invoke(it.next(), new java.lang.Object[0]);
                }
            } else {
                java.util.Iterator<java.lang.Object> it2 = set.iterator();
                while (it2.hasNext()) {
                    busInfo.method.invoke(it2.next(), obj);
                }
            }
        } catch (java.lang.IllegalAccessException e) {
            e.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }

    private void postStickyInner(java.lang.String str, java.lang.Object obj) {
        java.util.List<com.blankj.utilcode.util.BusUtils.BusInfo> list = this.mTag_BusInfoListMap.get(str);
        if (list == null) {
            android.util.Log.e(TAG, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (com.blankj.utilcode.util.BusUtils.BusInfo busInfo : list) {
            if (!busInfo.sticky) {
                invokeBus(obj, busInfo, false);
            } else {
                synchronized (this.mClassName_Tag_Arg4StickyMap) {
                    java.util.Map<java.lang.String, java.lang.Object> map = this.mClassName_Tag_Arg4StickyMap.get(busInfo.className);
                    if (map == null) {
                        map = new java.util.concurrent.ConcurrentHashMap<>();
                        this.mClassName_Tag_Arg4StickyMap.put(busInfo.className, map);
                    }
                    map.put(str, obj);
                }
                invokeBus(obj, busInfo, true);
            }
        }
    }

    private void removeStickyInner(java.lang.String str) {
        java.util.List<com.blankj.utilcode.util.BusUtils.BusInfo> list = this.mTag_BusInfoListMap.get(str);
        if (list == null) {
            android.util.Log.e(TAG, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (com.blankj.utilcode.util.BusUtils.BusInfo busInfo : list) {
            if (busInfo.sticky) {
                synchronized (this.mClassName_Tag_Arg4StickyMap) {
                    java.util.Map<java.lang.String, java.lang.Object> map = this.mClassName_Tag_Arg4StickyMap.get(busInfo.className);
                    if (map != null && map.containsKey(str)) {
                        map.remove(str);
                    }
                    return;
                }
            }
        }
    }

    static void registerBus4Test(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, int i) {
        getInstance().registerBus(str, str2, str3, str4, str5, z, str6, i);
    }

    private static final class BusInfo {
        java.lang.String className;
        java.lang.String funName;
        java.lang.reflect.Method method;
        java.lang.String paramName;
        java.lang.String paramType;
        int priority;
        boolean sticky;
        java.util.List<java.lang.String> subClassNames = new java.util.concurrent.CopyOnWriteArrayList();
        java.lang.String tag;
        java.lang.String threadMode;

        BusInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, int i) {
            this.tag = str;
            this.className = str2;
            this.funName = str3;
            this.paramType = str4;
            this.paramName = str5;
            this.sticky = z;
            this.threadMode = str6;
            this.priority = i;
        }

        public java.lang.String toString() {
            return "BusInfo { tag : " + this.tag + ", desc: " + getDesc() + ", sticky: " + this.sticky + ", threadMode: " + this.threadMode + ", method: " + this.method + ", priority: " + this.priority + " }";
        }

        private java.lang.String getDesc() {
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.className);
            sb.append("#");
            sb.append(this.funName);
            if ("".equals(this.paramType)) {
                str = "()";
            } else {
                str = "(" + this.paramType + " " + this.paramName + ")";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    private static class LazyHolder {
        private static final com.blankj.utilcode.util.BusUtils INSTANCE = new com.blankj.utilcode.util.BusUtils();

        private LazyHolder() {
        }
    }
}
