package com.nineoldandroids.util;

/* loaded from: /tmp/dex/classes2.dex */
class ReflectiveProperty<T, V> extends com.nineoldandroids.util.Property<T, V> {
    private static final java.lang.String PREFIX_GET = "get";
    private static final java.lang.String PREFIX_IS = "is";
    private static final java.lang.String PREFIX_SET = "set";
    private java.lang.reflect.Field mField;
    private java.lang.reflect.Method mGetter;
    private java.lang.reflect.Method mSetter;

    public ReflectiveProperty(java.lang.Class<T> cls, java.lang.Class<V> cls2, java.lang.String str) {
        super(cls2, str);
        java.lang.String str2 = java.lang.Character.toUpperCase(str.charAt(0)) + str.substring(1);
        java.lang.String str3 = PREFIX_GET + str2;
        try {
            try {
                this.mGetter = cls.getMethod(str3, null);
            } catch (java.lang.NoSuchMethodException unused) {
                java.lang.String str4 = PREFIX_IS + str2;
                try {
                    try {
                        try {
                            this.mGetter = cls.getMethod(str4, null);
                        } catch (java.lang.NoSuchMethodException unused2) {
                            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str4, null);
                            this.mGetter = declaredMethod;
                            declaredMethod.setAccessible(true);
                        }
                    } catch (java.lang.NoSuchFieldException unused3) {
                        throw new com.nineoldandroids.util.NoSuchPropertyException("No accessor method or field found for property with name " + str);
                    }
                } catch (java.lang.NoSuchMethodException unused4) {
                    java.lang.reflect.Field field = cls.getField(str);
                    this.mField = field;
                    java.lang.Class<?> type = field.getType();
                    if (typesMatch(cls2, type)) {
                        return;
                    }
                    throw new com.nineoldandroids.util.NoSuchPropertyException("Underlying type (" + type + ") does not match Property type (" + cls2 + ")");
                }
            }
        } catch (java.lang.NoSuchMethodException unused5) {
            java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod(str3, null);
            this.mGetter = declaredMethod2;
            declaredMethod2.setAccessible(true);
        }
        java.lang.Class<?> returnType = this.mGetter.getReturnType();
        if (!typesMatch(cls2, returnType)) {
            throw new com.nineoldandroids.util.NoSuchPropertyException("Underlying type (" + returnType + ") does not match Property type (" + cls2 + ")");
        }
        try {
            java.lang.reflect.Method declaredMethod3 = cls.getDeclaredMethod(PREFIX_SET + str2, returnType);
            this.mSetter = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused6) {
        }
    }

    private boolean typesMatch(java.lang.Class<V> cls, java.lang.Class cls2) {
        if (cls2 == cls) {
            return true;
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        if (cls2 == java.lang.Float.TYPE && cls == java.lang.Float.class) {
            return true;
        }
        if (cls2 == java.lang.Integer.TYPE && cls == java.lang.Integer.class) {
            return true;
        }
        if (cls2 == java.lang.Boolean.TYPE && cls == java.lang.Boolean.class) {
            return true;
        }
        if (cls2 == java.lang.Long.TYPE && cls == java.lang.Long.class) {
            return true;
        }
        if (cls2 == java.lang.Double.TYPE && cls == java.lang.Double.class) {
            return true;
        }
        if (cls2 == java.lang.Short.TYPE && cls == java.lang.Short.class) {
            return true;
        }
        if (cls2 == java.lang.Byte.TYPE && cls == java.lang.Byte.class) {
            return true;
        }
        return cls2 == java.lang.Character.TYPE && cls == java.lang.Character.class;
    }

    @Override // com.nineoldandroids.util.Property
    public void set(T t, V v) {
        java.lang.reflect.Method method = this.mSetter;
        if (method != null) {
            try {
                method.invoke(t, v);
                return;
            } catch (java.lang.IllegalAccessException unused) {
                throw new java.lang.AssertionError();
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
        java.lang.reflect.Field field = this.mField;
        if (field != null) {
            try {
                field.set(t, v);
            } catch (java.lang.IllegalAccessException unused2) {
                throw new java.lang.AssertionError();
            }
        } else {
            throw new java.lang.UnsupportedOperationException("Property " + getName() + " is read-only");
        }
    }

    @Override // com.nineoldandroids.util.Property
    public V get(T t) {
        java.lang.reflect.Method method = this.mGetter;
        if (method != null) {
            try {
                return (V) method.invoke(t, null);
            } catch (java.lang.IllegalAccessException unused) {
                throw new java.lang.AssertionError();
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
        java.lang.reflect.Field field = this.mField;
        if (field != null) {
            try {
                return (V) field.get(t);
            } catch (java.lang.IllegalAccessException unused2) {
                throw new java.lang.AssertionError();
            }
        }
        throw new java.lang.AssertionError();
    }

    @Override // com.nineoldandroids.util.Property
    public boolean isReadOnly() {
        return this.mSetter == null && this.mField == null;
    }
}
