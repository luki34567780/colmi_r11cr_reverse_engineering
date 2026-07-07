package com.squareup.moshi;

/* loaded from: classes3.dex */
abstract class ClassFactory<T> {
    abstract T newInstance() throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException, java.lang.InstantiationException;

    ClassFactory() {
    }

    public static <T> com.squareup.moshi.ClassFactory<T> get(final java.lang.Class<?> cls) {
        try {
            final java.lang.reflect.Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            return new com.squareup.moshi.ClassFactory<T>() { // from class: com.squareup.moshi.ClassFactory.1
                @Override // com.squareup.moshi.ClassFactory
                public T newInstance() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
                    return (T) declaredConstructor.newInstance(null);
                }

                public java.lang.String toString() {
                    return cls.getName();
                }
            };
        } catch (java.lang.NoSuchMethodException unused) {
            try {
                java.lang.Class<?> cls2 = java.lang.Class.forName("sun.misc.Unsafe");
                java.lang.reflect.Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                final java.lang.Object obj = declaredField.get(null);
                final java.lang.reflect.Method method = cls2.getMethod("allocateInstance", java.lang.Class.class);
                return new com.squareup.moshi.ClassFactory<T>() { // from class: com.squareup.moshi.ClassFactory.2
                    @Override // com.squareup.moshi.ClassFactory
                    public T newInstance() throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
                        return (T) method.invoke(obj, cls);
                    }

                    public java.lang.String toString() {
                        return cls.getName();
                    }
                };
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused2) {
                try {
                    try {
                        java.lang.reflect.Method declaredMethod = java.io.ObjectStreamClass.class.getDeclaredMethod("getConstructorId", java.lang.Class.class);
                        declaredMethod.setAccessible(true);
                        final int intValue = ((java.lang.Integer) declaredMethod.invoke(null, java.lang.Object.class)).intValue();
                        final java.lang.reflect.Method declaredMethod2 = java.io.ObjectStreamClass.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        return new com.squareup.moshi.ClassFactory<T>() { // from class: com.squareup.moshi.ClassFactory.3
                            @Override // com.squareup.moshi.ClassFactory
                            public T newInstance() throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
                                return (T) declaredMethod2.invoke(null, cls, java.lang.Integer.valueOf(intValue));
                            }

                            public java.lang.String toString() {
                                return cls.getName();
                            }
                        };
                    } catch (java.lang.Exception unused3) {
                        throw new java.lang.IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                } catch (java.lang.IllegalAccessException unused4) {
                    throw new java.lang.AssertionError();
                } catch (java.lang.NoSuchMethodException unused5) {
                    final java.lang.reflect.Method declaredMethod3 = java.io.ObjectInputStream.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Class.class);
                    declaredMethod3.setAccessible(true);
                    return new com.squareup.moshi.ClassFactory<T>() { // from class: com.squareup.moshi.ClassFactory.4
                        @Override // com.squareup.moshi.ClassFactory
                        public T newInstance() throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
                            return (T) declaredMethod3.invoke(null, cls, java.lang.Object.class);
                        }

                        public java.lang.String toString() {
                            return cls.getName();
                        }
                    };
                } catch (java.lang.reflect.InvocationTargetException e) {
                    throw com.squareup.moshi.internal.Util.rethrowCause(e);
                }
            } catch (java.lang.IllegalAccessException unused6) {
                throw new java.lang.AssertionError();
            }
        }
    }
}
