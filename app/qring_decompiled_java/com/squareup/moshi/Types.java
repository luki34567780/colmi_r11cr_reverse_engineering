package com.squareup.moshi;

@javax.annotation.CheckReturnValue
/* loaded from: classes3.dex */
public final class Types {
    private Types() {
    }

    public static java.lang.String generatedJsonAdapterName(java.lang.Class<?> cls) {
        if (cls.getAnnotation(com.squareup.moshi.JsonClass.class) == null) {
            throw new java.lang.IllegalArgumentException("Class does not have a JsonClass annotation: " + cls);
        }
        return generatedJsonAdapterName(cls.getName());
    }

    public static java.lang.String generatedJsonAdapterName(java.lang.String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    @javax.annotation.Nullable
    public static java.util.Set<? extends java.lang.annotation.Annotation> nextAnnotations(java.util.Set<? extends java.lang.annotation.Annotation> set, java.lang.Class<? extends java.lang.annotation.Annotation> cls) {
        if (!cls.isAnnotationPresent(com.squareup.moshi.JsonQualifier.class)) {
            throw new java.lang.IllegalArgumentException(cls + " is not a JsonQualifier.");
        }
        if (set.isEmpty()) {
            return null;
        }
        for (java.lang.annotation.Annotation annotation : set) {
            if (cls.equals(annotation.annotationType())) {
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(set);
                linkedHashSet.remove(annotation);
                return java.util.Collections.unmodifiableSet(linkedHashSet);
            }
        }
        return null;
    }

    public static java.lang.reflect.ParameterizedType newParameterizedType(java.lang.reflect.Type type, java.lang.reflect.Type... typeArr) {
        if (typeArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Missing type arguments for " + type);
        }
        return new com.squareup.moshi.internal.Util.ParameterizedTypeImpl(null, type, typeArr);
    }

    public static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
        if (typeArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Missing type arguments for " + type2);
        }
        return new com.squareup.moshi.internal.Util.ParameterizedTypeImpl(type, type2, typeArr);
    }

    public static java.lang.reflect.GenericArrayType arrayOf(java.lang.reflect.Type type) {
        return new com.squareup.moshi.internal.Util.GenericArrayTypeImpl(type);
    }

    public static java.lang.reflect.WildcardType subtypeOf(java.lang.reflect.Type type) {
        return new com.squareup.moshi.internal.Util.WildcardTypeImpl(type instanceof java.lang.reflect.WildcardType ? ((java.lang.reflect.WildcardType) type).getUpperBounds() : new java.lang.reflect.Type[]{type}, com.squareup.moshi.internal.Util.EMPTY_TYPE_ARRAY);
    }

    public static java.lang.reflect.WildcardType supertypeOf(java.lang.reflect.Type type) {
        return new com.squareup.moshi.internal.Util.WildcardTypeImpl(new java.lang.reflect.Type[]{java.lang.Object.class}, type instanceof java.lang.reflect.WildcardType ? ((java.lang.reflect.WildcardType) type).getLowerBounds() : new java.lang.reflect.Type[]{type});
    }

    public static java.lang.Class<?> getRawType(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return (java.lang.Class) ((java.lang.reflect.ParameterizedType) type).getRawType();
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return java.lang.reflect.Array.newInstance(getRawType(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof java.lang.reflect.TypeVariable) {
            return java.lang.Object.class;
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            return getRawType(((java.lang.reflect.WildcardType) type).getUpperBounds()[0]);
        }
        throw new java.lang.IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static java.lang.reflect.Type collectionElementType(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        java.lang.reflect.Type supertype = getSupertype(type, cls, java.util.Collection.class);
        if (supertype instanceof java.lang.reflect.WildcardType) {
            supertype = ((java.lang.reflect.WildcardType) supertype).getUpperBounds()[0];
        }
        if (supertype instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) supertype).getActualTypeArguments()[0];
        }
        return java.lang.Object.class;
    }

    public static boolean equals(@javax.annotation.Nullable java.lang.reflect.Type type, @javax.annotation.Nullable java.lang.reflect.Type type2) {
        java.lang.reflect.Type[] actualTypeArguments;
        java.lang.reflect.Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof java.lang.Class) {
            if (type2 instanceof java.lang.reflect.GenericArrayType) {
                return equals(((java.lang.Class) type).getComponentType(), ((java.lang.reflect.GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            if (!(type2 instanceof java.lang.reflect.ParameterizedType)) {
                return false;
            }
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) type2;
            if (parameterizedType instanceof com.squareup.moshi.internal.Util.ParameterizedTypeImpl) {
                actualTypeArguments = ((com.squareup.moshi.internal.Util.ParameterizedTypeImpl) parameterizedType).typeArguments;
            } else {
                actualTypeArguments = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof com.squareup.moshi.internal.Util.ParameterizedTypeImpl) {
                actualTypeArguments2 = ((com.squareup.moshi.internal.Util.ParameterizedTypeImpl) parameterizedType2).typeArguments;
            } else {
                actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            }
            return equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && java.util.Arrays.equals(actualTypeArguments, actualTypeArguments2);
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            if (type2 instanceof java.lang.Class) {
                return equals(((java.lang.Class) type2).getComponentType(), ((java.lang.reflect.GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof java.lang.reflect.GenericArrayType) {
                return equals(((java.lang.reflect.GenericArrayType) type).getGenericComponentType(), ((java.lang.reflect.GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            if (!(type2 instanceof java.lang.reflect.WildcardType)) {
                return false;
            }
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
            java.lang.reflect.WildcardType wildcardType2 = (java.lang.reflect.WildcardType) type2;
            return java.util.Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && java.util.Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof java.lang.reflect.TypeVariable) || !(type2 instanceof java.lang.reflect.TypeVariable)) {
            return false;
        }
        java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) type;
        java.lang.reflect.TypeVariable typeVariable2 = (java.lang.reflect.TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    @java.lang.Deprecated
    public static java.util.Set<? extends java.lang.annotation.Annotation> getFieldJsonQualifierAnnotations(java.lang.Class<?> cls, java.lang.String str) {
        try {
            java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            java.lang.annotation.Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(declaredAnnotations.length);
            for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().isAnnotationPresent(com.squareup.moshi.JsonQualifier.class)) {
                    linkedHashSet.add(annotation);
                }
            }
            return java.util.Collections.unmodifiableSet(linkedHashSet);
        } catch (java.lang.NoSuchFieldException e) {
            throw new java.lang.IllegalArgumentException("Could not access field " + str + " on class " + cls.getCanonicalName(), e);
        }
    }

    static <T extends java.lang.annotation.Annotation> T createJsonQualifierImplementation(final java.lang.Class<T> cls) {
        if (!cls.isAnnotation()) {
            throw new java.lang.IllegalArgumentException(cls + " must be an annotation.");
        }
        if (!cls.isAnnotationPresent(com.squareup.moshi.JsonQualifier.class)) {
            throw new java.lang.IllegalArgumentException(cls + " must have @JsonQualifier.");
        }
        if (cls.getDeclaredMethods().length != 0) {
            throw new java.lang.IllegalArgumentException(cls + " must not declare methods.");
        }
        return (T) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new java.lang.reflect.InvocationHandler() { // from class: com.squareup.moshi.Types.1
            @Override // java.lang.reflect.InvocationHandler
            public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
                java.lang.String name = method.getName();
                name.hashCode();
                switch (name) {
                    case "toString":
                        return "@" + cls.getName() + "()";
                    case "equals":
                        return java.lang.Boolean.valueOf(cls.isInstance(objArr[0]));
                    case "hashCode":
                        return 0;
                    case "annotationType":
                        return cls;
                    default:
                        return method.invoke(obj, objArr);
                }
            }
        });
    }

    static java.lang.reflect.Type[] mapKeyAndValueTypes(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        if (type == java.util.Properties.class) {
            return new java.lang.reflect.Type[]{java.lang.String.class, java.lang.String.class};
        }
        java.lang.reflect.Type supertype = getSupertype(type, cls, java.util.Map.class);
        return supertype instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) supertype).getActualTypeArguments() : new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class};
    }

    static java.lang.reflect.Type getSupertype(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException();
        }
        return com.squareup.moshi.internal.Util.resolve(type, cls, com.squareup.moshi.internal.Util.getGenericSupertype(type, cls, cls2));
    }

    static java.lang.reflect.Type getGenericSuperclass(java.lang.reflect.Type type) {
        java.lang.Class<?> rawType = getRawType(type);
        return com.squareup.moshi.internal.Util.resolve(type, rawType, rawType.getGenericSuperclass());
    }

    static java.lang.reflect.Type arrayComponentType(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof java.lang.Class) {
            return ((java.lang.Class) type).getComponentType();
        }
        return null;
    }
}
