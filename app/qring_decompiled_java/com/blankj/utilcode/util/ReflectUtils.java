package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class ReflectUtils {
    private final java.lang.Object object;
    private final java.lang.Class<?> type;

    private ReflectUtils(java.lang.Class<?> cls) {
        this(cls, cls);
    }

    private ReflectUtils(java.lang.Class<?> cls, java.lang.Object obj) {
        this.type = cls;
        this.object = obj;
    }

    public static com.blankj.utilcode.util.ReflectUtils reflect(java.lang.String str) throws com.blankj.utilcode.util.ReflectUtils.ReflectException {
        return reflect(forName(str));
    }

    public static com.blankj.utilcode.util.ReflectUtils reflect(java.lang.String str, java.lang.ClassLoader classLoader) throws com.blankj.utilcode.util.ReflectUtils.ReflectException {
        return reflect(forName(str, classLoader));
    }

    public static com.blankj.utilcode.util.ReflectUtils reflect(java.lang.Class<?> cls) throws com.blankj.utilcode.util.ReflectUtils.ReflectException {
        return new com.blankj.utilcode.util.ReflectUtils(cls);
    }

    public static com.blankj.utilcode.util.ReflectUtils reflect(java.lang.Object obj) throws com.blankj.utilcode.util.ReflectUtils.ReflectException {
        return new com.blankj.utilcode.util.ReflectUtils(obj == null ? java.lang.Object.class : obj.getClass(), obj);
    }

    private static java.lang.Class<?> forName(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            throw new com.blankj.utilcode.util.ReflectUtils.ReflectException(e);
        }
    }

    private static java.lang.Class<?> forName(java.lang.String str, java.lang.ClassLoader classLoader) {
        try {
            return java.lang.Class.forName(str, true, classLoader);
        } catch (java.lang.ClassNotFoundException e) {
            throw new com.blankj.utilcode.util.ReflectUtils.ReflectException(e);
        }
    }

    public com.blankj.utilcode.util.ReflectUtils newInstance() {
        return newInstance(new java.lang.Object[0]);
    }

    public com.blankj.utilcode.util.ReflectUtils newInstance(java.lang.Object... objArr) {
        java.lang.Class<?>[] argsType = getArgsType(objArr);
        try {
            return newInstance(type().getDeclaredConstructor(argsType), objArr);
        } catch (java.lang.NoSuchMethodException e) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.reflect.Constructor<?> constructor : type().getDeclaredConstructors()) {
                if (match(constructor.getParameterTypes(), argsType)) {
                    arrayList.add(constructor);
                }
            }
            if (arrayList.isEmpty()) {
                throw new com.blankj.utilcode.util.ReflectUtils.ReflectException(e);
            }
            sortConstructors(arrayList);
            return newInstance(arrayList.get(0), objArr);
        }
    }

    private java.lang.Class<?>[] getArgsType(java.lang.Object... objArr) {
        if (objArr == null) {
            return new java.lang.Class[0];
        }
        java.lang.Class<?>[] clsArr = new java.lang.Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            java.lang.Object obj = objArr[i];
            clsArr[i] = obj == null ? com.blankj.utilcode.util.ReflectUtils.NULL.class : obj.getClass();
        }
        return clsArr;
    }

    private void sortConstructors(java.util.List<java.lang.reflect.Constructor<?>> list) {
        java.util.Collections.sort(list, new java.util.Comparator<java.lang.reflect.Constructor<?>>() { // from class: com.blankj.utilcode.util.ReflectUtils.1
            @Override // java.util.Comparator
            public int compare(java.lang.reflect.Constructor<?> constructor, java.lang.reflect.Constructor<?> constructor2) {
                java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
                java.lang.Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
                int length = parameterTypes.length;
                for (int i = 0; i < length; i++) {
                    if (!parameterTypes[i].equals(parameterTypes2[i])) {
                        return com.blankj.utilcode.util.ReflectUtils.this.wrapper(parameterTypes[i]).isAssignableFrom(com.blankj.utilcode.util.ReflectUtils.this.wrapper(parameterTypes2[i])) ? 1 : -1;
                    }
                }
                return 0;
            }
        });
    }

    private com.blankj.utilcode.util.ReflectUtils newInstance(java.lang.reflect.Constructor<?> constructor, java.lang.Object... objArr) {
        try {
            return new com.blankj.utilcode.util.ReflectUtils(constructor.getDeclaringClass(), ((java.lang.reflect.Constructor) accessible(constructor)).newInstance(objArr));
        } catch (java.lang.Exception e) {
            throw new com.blankj.utilcode.util.ReflectUtils.ReflectException(e);
        }
    }

    public com.blankj.utilcode.util.ReflectUtils field(java.lang.String str) {
        try {
            java.lang.reflect.Field field = getField(str);
            return new com.blankj.utilcode.util.ReflectUtils(field.getType(), field.get(this.object));
        } catch (java.lang.IllegalAccessException e) {
            throw new com.blankj.utilcode.util.ReflectUtils.ReflectException(e);
        }
    }

    public com.blankj.utilcode.util.ReflectUtils field(java.lang.String str, java.lang.Object obj) {
        try {
            getField(str).set(this.object, unwrap(obj));
            return this;
        } catch (java.lang.Exception e) {
            throw new com.blankj.utilcode.util.ReflectUtils.ReflectException(e);
        }
    }

    private java.lang.reflect.Field getField(java.lang.String str) throws java.lang.IllegalAccessException {
        java.lang.reflect.Field accessibleField = getAccessibleField(str);
        if ((accessibleField.getModifiers() & 16) == 16) {
            try {
                java.lang.reflect.Field declaredField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                declaredField.setInt(accessibleField, accessibleField.getModifiers() & (-17));
            } catch (java.lang.NoSuchFieldException unused) {
                accessibleField.setAccessible(true);
            }
        }
        return accessibleField;
    }

    private java.lang.reflect.Field getAccessibleField(java.lang.String str) {
        java.lang.Class<?> type = type();
        try {
            return (java.lang.reflect.Field) accessible(type.getField(str));
        } catch (java.lang.NoSuchFieldException e) {
            do {
                try {
                    return (java.lang.reflect.Field) accessible(type.getDeclaredField(str));
                } catch (java.lang.NoSuchFieldException unused) {
                    type = type.getSuperclass();
                    if (type == null) {
                        throw new com.blankj.utilcode.util.ReflectUtils.ReflectException(e);
                    }
                }
            } while (type == null);
            throw new com.blankj.utilcode.util.ReflectUtils.ReflectException(e);
        }
    }

    private java.lang.Object unwrap(java.lang.Object obj) {
        return obj instanceof com.blankj.utilcode.util.ReflectUtils ? ((com.blankj.utilcode.util.ReflectUtils) obj).get() : obj;
    }

    public com.blankj.utilcode.util.ReflectUtils method(java.lang.String str) throws com.blankj.utilcode.util.ReflectUtils.ReflectException {
        return method(str, new java.lang.Object[0]);
    }

    public com.blankj.utilcode.util.ReflectUtils method(java.lang.String str, java.lang.Object... objArr) throws com.blankj.utilcode.util.ReflectUtils.ReflectException {
        java.lang.Class<?>[] argsType = getArgsType(objArr);
        try {
            try {
                return method(exactMethod(str, argsType), this.object, objArr);
            } catch (java.lang.NoSuchMethodException e) {
                throw new com.blankj.utilcode.util.ReflectUtils.ReflectException(e);
            }
        } catch (java.lang.NoSuchMethodException unused) {
            return method(similarMethod(str, argsType), this.object, objArr);
        }
    }

    private com.blankj.utilcode.util.ReflectUtils method(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            accessible(method);
            if (method.getReturnType() == java.lang.Void.TYPE) {
                method.invoke(obj, objArr);
                return reflect(obj);
            }
            return reflect(method.invoke(obj, objArr));
        } catch (java.lang.Exception e) {
            throw new com.blankj.utilcode.util.ReflectUtils.ReflectException(e);
        }
    }

    private java.lang.reflect.Method exactMethod(java.lang.String str, java.lang.Class<?>[] clsArr) throws java.lang.NoSuchMethodException {
        java.lang.Class<?> type = type();
        try {
            return type.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException unused) {
            do {
                try {
                    return type.getDeclaredMethod(str, clsArr);
                } catch (java.lang.NoSuchMethodException unused2) {
                    type = type.getSuperclass();
                }
            } while (type != null);
            throw new java.lang.NoSuchMethodException();
        }
    }

    private java.lang.reflect.Method similarMethod(java.lang.String str, java.lang.Class<?>[] clsArr) throws java.lang.NoSuchMethodException {
        java.lang.Class<?> type = type();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Method method : type.getMethods()) {
            if (isSimilarSignature(method, str, clsArr)) {
                arrayList.add(method);
            }
        }
        if (!arrayList.isEmpty()) {
            sortMethods(arrayList);
            return arrayList.get(0);
        }
        do {
            for (java.lang.reflect.Method method2 : type.getDeclaredMethods()) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    arrayList.add(method2);
                }
            }
            if (!arrayList.isEmpty()) {
                sortMethods(arrayList);
                return arrayList.get(0);
            }
            type = type.getSuperclass();
        } while (type != null);
        throw new java.lang.NoSuchMethodException("No similar method " + str + " with params " + java.util.Arrays.toString(clsArr) + " could be found on type " + type() + ".");
    }

    private void sortMethods(java.util.List<java.lang.reflect.Method> list) {
        java.util.Collections.sort(list, new java.util.Comparator<java.lang.reflect.Method>() { // from class: com.blankj.utilcode.util.ReflectUtils.2
            @Override // java.util.Comparator
            public int compare(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                java.lang.Class<?>[] parameterTypes2 = method2.getParameterTypes();
                int length = parameterTypes.length;
                for (int i = 0; i < length; i++) {
                    if (!parameterTypes[i].equals(parameterTypes2[i])) {
                        return com.blankj.utilcode.util.ReflectUtils.this.wrapper(parameterTypes[i]).isAssignableFrom(com.blankj.utilcode.util.ReflectUtils.this.wrapper(parameterTypes2[i])) ? 1 : -1;
                    }
                }
                return 0;
            }
        });
    }

    private boolean isSimilarSignature(java.lang.reflect.Method method, java.lang.String str, java.lang.Class<?>[] clsArr) {
        return method.getName().equals(str) && match(method.getParameterTypes(), clsArr);
    }

    private boolean match(java.lang.Class<?>[] clsArr, java.lang.Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != com.blankj.utilcode.util.ReflectUtils.NULL.class && !wrapper(clsArr[i]).isAssignableFrom(wrapper(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    private <T extends java.lang.reflect.AccessibleObject> T accessible(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof java.lang.reflect.Member) {
            java.lang.reflect.Member member = (java.lang.reflect.Member) t;
            if (java.lang.reflect.Modifier.isPublic(member.getModifiers()) && java.lang.reflect.Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public <P> P proxy(java.lang.Class<P> cls) {
        final boolean z = this.object instanceof java.util.Map;
        return (P) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new java.lang.reflect.InvocationHandler() { // from class: com.blankj.utilcode.util.ReflectUtils.3
            @Override // java.lang.reflect.InvocationHandler
            public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                java.lang.String name = method.getName();
                try {
                    return com.blankj.utilcode.util.ReflectUtils.reflect(com.blankj.utilcode.util.ReflectUtils.this.object).method(name, objArr).get();
                } catch (com.blankj.utilcode.util.ReflectUtils.ReflectException e) {
                    if (z) {
                        java.util.Map map = (java.util.Map) com.blankj.utilcode.util.ReflectUtils.this.object;
                        int length = objArr == null ? 0 : objArr.length;
                        if (length == 0 && name.startsWith("get")) {
                            return map.get(com.blankj.utilcode.util.ReflectUtils.property(name.substring(3)));
                        }
                        if (length == 0 && name.startsWith("is")) {
                            return map.get(com.blankj.utilcode.util.ReflectUtils.property(name.substring(2)));
                        }
                        if (length == 1 && name.startsWith("set")) {
                            map.put(com.blankj.utilcode.util.ReflectUtils.property(name.substring(3)), objArr[0]);
                            return null;
                        }
                    }
                    throw e;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String property(java.lang.String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    private java.lang.Class<?> type() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Class<?> wrapper(java.lang.Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (!cls.isPrimitive()) {
            return cls;
        }
        if (java.lang.Boolean.TYPE == cls) {
            return java.lang.Boolean.class;
        }
        if (java.lang.Integer.TYPE == cls) {
            return java.lang.Integer.class;
        }
        if (java.lang.Long.TYPE == cls) {
            return java.lang.Long.class;
        }
        if (java.lang.Short.TYPE == cls) {
            return java.lang.Short.class;
        }
        if (java.lang.Byte.TYPE == cls) {
            return java.lang.Byte.class;
        }
        if (java.lang.Double.TYPE == cls) {
            return java.lang.Double.class;
        }
        if (java.lang.Float.TYPE == cls) {
            return java.lang.Float.class;
        }
        if (java.lang.Character.TYPE == cls) {
            return java.lang.Character.class;
        }
        return java.lang.Void.TYPE == cls ? java.lang.Void.class : cls;
    }

    public <T> T get() {
        return (T) this.object;
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.blankj.utilcode.util.ReflectUtils) && this.object.equals(((com.blankj.utilcode.util.ReflectUtils) obj).get());
    }

    public java.lang.String toString() {
        return this.object.toString();
    }

    private static class NULL {
        private NULL() {
        }
    }

    public static class ReflectException extends java.lang.RuntimeException {
        private static final long serialVersionUID = 858774075258496016L;

        public ReflectException(java.lang.String str) {
            super(str);
        }

        public ReflectException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }

        public ReflectException(java.lang.Throwable th) {
            super(th);
        }
    }
}
