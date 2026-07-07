package retrofit2;

/* loaded from: classes3.dex */
final class Utils {
    static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = new java.lang.reflect.Type[0];

    private Utils() {
    }

    static java.lang.RuntimeException methodError(java.lang.reflect.Method method, java.lang.String str, java.lang.Object... objArr) {
        return methodError(method, null, str, objArr);
    }

    static java.lang.RuntimeException methodError(java.lang.reflect.Method method, @javax.annotation.Nullable java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        return new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    static java.lang.RuntimeException parameterError(java.lang.reflect.Method method, java.lang.Throwable th, int i, java.lang.String str, java.lang.Object... objArr) {
        return methodError(method, th, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    static java.lang.RuntimeException parameterError(java.lang.reflect.Method method, int i, java.lang.String str, java.lang.Object... objArr) {
        return methodError(method, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    static java.lang.Class<?> getRawType(java.lang.reflect.Type type) {
        java.util.Objects.requireNonNull(type, "type == null");
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
            if (!(rawType instanceof java.lang.Class)) {
                throw new java.lang.IllegalArgumentException();
            }
            return (java.lang.Class) rawType;
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
        throw new java.lang.IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    static boolean equals(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof java.lang.Class) {
            return type.equals(type2);
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            if (!(type2 instanceof java.lang.reflect.ParameterizedType)) {
                return false;
            }
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) type2;
            java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
            java.lang.reflect.Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && java.util.Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
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

    static java.lang.reflect.Type getGenericSupertype(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            java.lang.Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return getGenericSupertype(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != java.lang.Object.class) {
                java.lang.Class<? super java.lang.Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static int indexOf(java.lang.Object[] objArr, java.lang.Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    static java.lang.String typeToString(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    static java.lang.reflect.Type getSupertype(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException();
        }
        return resolve(type, cls, getGenericSupertype(type, cls, cls2));
    }

    static java.lang.reflect.Type resolve(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2) {
        java.lang.reflect.Type type3 = type2;
        while (type3 instanceof java.lang.reflect.TypeVariable) {
            java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) type3;
            java.lang.reflect.Type resolveTypeVariable = resolveTypeVariable(type, cls, typeVariable);
            if (resolveTypeVariable == typeVariable) {
                return resolveTypeVariable;
            }
            type3 = resolveTypeVariable;
        }
        if (type3 instanceof java.lang.Class) {
            java.lang.Class cls2 = (java.lang.Class) type3;
            if (cls2.isArray()) {
                java.lang.Class<?> componentType = cls2.getComponentType();
                java.lang.reflect.Type resolve = resolve(type, cls, componentType);
                return componentType == resolve ? cls2 : new retrofit2.Utils.GenericArrayTypeImpl(resolve);
            }
        }
        if (type3 instanceof java.lang.reflect.GenericArrayType) {
            java.lang.reflect.GenericArrayType genericArrayType = (java.lang.reflect.GenericArrayType) type3;
            java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
            java.lang.reflect.Type resolve2 = resolve(type, cls, genericComponentType);
            return genericComponentType == resolve2 ? genericArrayType : new retrofit2.Utils.GenericArrayTypeImpl(resolve2);
        }
        if (type3 instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type3;
            java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
            java.lang.reflect.Type resolve3 = resolve(type, cls, ownerType);
            boolean z = resolve3 != ownerType;
            java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                java.lang.reflect.Type resolve4 = resolve(type, cls, actualTypeArguments[i]);
                if (resolve4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (java.lang.reflect.Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = resolve4;
                }
            }
            return z ? new retrofit2.Utils.ParameterizedTypeImpl(resolve3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type3 instanceof java.lang.reflect.WildcardType;
        java.lang.reflect.Type type4 = type3;
        if (z2) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type3;
            java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
            java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                java.lang.reflect.Type resolve5 = resolve(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (resolve5 != lowerBounds[0]) {
                    return new retrofit2.Utils.WildcardTypeImpl(new java.lang.reflect.Type[]{java.lang.Object.class}, new java.lang.reflect.Type[]{resolve5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    java.lang.reflect.Type resolve6 = resolve(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (resolve6 != upperBounds[0]) {
                        return new retrofit2.Utils.WildcardTypeImpl(new java.lang.reflect.Type[]{resolve6}, EMPTY_TYPE_ARRAY);
                    }
                }
            }
        }
        return type4;
    }

    private static java.lang.reflect.Type resolveTypeVariable(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Class<?> declaringClassOf = declaringClassOf(typeVariable);
        if (declaringClassOf == null) {
            return typeVariable;
        }
        java.lang.reflect.Type genericSupertype = getGenericSupertype(type, cls, declaringClassOf);
        if (!(genericSupertype instanceof java.lang.reflect.ParameterizedType)) {
            return typeVariable;
        }
        return ((java.lang.reflect.ParameterizedType) genericSupertype).getActualTypeArguments()[indexOf(declaringClassOf.getTypeParameters(), typeVariable)];
    }

    @javax.annotation.Nullable
    private static java.lang.Class<?> declaringClassOf(java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof java.lang.Class) {
            return (java.lang.Class) genericDeclaration;
        }
        return null;
    }

    static void checkNotPrimitive(java.lang.reflect.Type type) {
        if ((type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive()) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    static boolean isAnnotationPresent(java.lang.annotation.Annotation[] annotationArr, java.lang.Class<? extends java.lang.annotation.Annotation> cls) {
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    static okhttp3.ResponseBody buffer(okhttp3.ResponseBody responseBody) throws java.io.IOException {
        okio.Buffer buffer = new okio.Buffer();
        responseBody.source().readAll(buffer);
        return okhttp3.ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer);
    }

    static java.lang.reflect.Type getParameterUpperBound(int i, java.lang.reflect.ParameterizedType parameterizedType) {
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new java.lang.IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        java.lang.reflect.Type type = actualTypeArguments[i];
        return type instanceof java.lang.reflect.WildcardType ? ((java.lang.reflect.WildcardType) type).getUpperBounds()[0] : type;
    }

    static java.lang.reflect.Type getParameterLowerBound(int i, java.lang.reflect.ParameterizedType parameterizedType) {
        java.lang.reflect.Type type = parameterizedType.getActualTypeArguments()[i];
        return type instanceof java.lang.reflect.WildcardType ? ((java.lang.reflect.WildcardType) type).getLowerBounds()[0] : type;
    }

    static boolean hasUnresolvableType(@javax.annotation.Nullable java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            return false;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            for (java.lang.reflect.Type type2 : ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()) {
                if (hasUnresolvableType(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return hasUnresolvableType(((java.lang.reflect.GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof java.lang.reflect.TypeVariable) || (type instanceof java.lang.reflect.WildcardType)) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {

        @javax.annotation.Nullable
        private final java.lang.reflect.Type ownerType;
        private final java.lang.reflect.Type rawType;
        private final java.lang.reflect.Type[] typeArguments;

        ParameterizedTypeImpl(@javax.annotation.Nullable java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
            if (type2 instanceof java.lang.Class) {
                if ((type == null) != (((java.lang.Class) type2).getEnclosingClass() == null)) {
                    throw new java.lang.IllegalArgumentException();
                }
            }
            for (java.lang.reflect.Type type3 : typeArr) {
                java.util.Objects.requireNonNull(type3, "typeArgument == null");
                retrofit2.Utils.checkNotPrimitive(type3);
            }
            this.ownerType = type;
            this.rawType = type2;
            this.typeArguments = (java.lang.reflect.Type[]) typeArr.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type[] getActualTypeArguments() {
            return (java.lang.reflect.Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
            return this.rawType;
        }

        @Override // java.lang.reflect.ParameterizedType
        @javax.annotation.Nullable
        public java.lang.reflect.Type getOwnerType() {
            return this.ownerType;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.ParameterizedType) && retrofit2.Utils.equals(this, (java.lang.reflect.ParameterizedType) obj);
        }

        public int hashCode() {
            int hashCode = java.util.Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
            java.lang.reflect.Type type = this.ownerType;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.lang.reflect.Type[] typeArr = this.typeArguments;
            if (typeArr.length == 0) {
                return retrofit2.Utils.typeToString(this.rawType);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder((typeArr.length + 1) * 30);
            sb.append(retrofit2.Utils.typeToString(this.rawType));
            sb.append("<");
            sb.append(retrofit2.Utils.typeToString(this.typeArguments[0]));
            for (int i = 1; i < this.typeArguments.length; i++) {
                sb.append(", ");
                sb.append(retrofit2.Utils.typeToString(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    private static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type componentType;

        GenericArrayTypeImpl(java.lang.reflect.Type type) {
            this.componentType = type;
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
            return this.componentType;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.GenericArrayType) && retrofit2.Utils.equals(this, (java.lang.reflect.GenericArrayType) obj);
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public java.lang.String toString() {
            return retrofit2.Utils.typeToString(this.componentType) + okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    private static final class WildcardTypeImpl implements java.lang.reflect.WildcardType {

        @javax.annotation.Nullable
        private final java.lang.reflect.Type lowerBound;
        private final java.lang.reflect.Type upperBound;

        WildcardTypeImpl(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new java.lang.IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new java.lang.IllegalArgumentException();
            }
            if (typeArr2.length == 1) {
                java.util.Objects.requireNonNull(typeArr2[0]);
                retrofit2.Utils.checkNotPrimitive(typeArr2[0]);
                if (typeArr[0] != java.lang.Object.class) {
                    throw new java.lang.IllegalArgumentException();
                }
                this.lowerBound = typeArr2[0];
                this.upperBound = java.lang.Object.class;
                return;
            }
            java.util.Objects.requireNonNull(typeArr[0]);
            retrofit2.Utils.checkNotPrimitive(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = typeArr[0];
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
            return new java.lang.reflect.Type[]{this.upperBound};
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
            java.lang.reflect.Type type = this.lowerBound;
            return type != null ? new java.lang.reflect.Type[]{type} : retrofit2.Utils.EMPTY_TYPE_ARRAY;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.WildcardType) && retrofit2.Utils.equals(this, (java.lang.reflect.WildcardType) obj);
        }

        public int hashCode() {
            java.lang.reflect.Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public java.lang.String toString() {
            if (this.lowerBound != null) {
                return "? super " + retrofit2.Utils.typeToString(this.lowerBound);
            }
            if (this.upperBound == java.lang.Object.class) {
                return "?";
            }
            return "? extends " + retrofit2.Utils.typeToString(this.upperBound);
        }
    }

    static void throwIfFatal(java.lang.Throwable th) {
        if (th instanceof java.lang.VirtualMachineError) {
            throw ((java.lang.VirtualMachineError) th);
        }
        if (th instanceof java.lang.ThreadDeath) {
            throw ((java.lang.ThreadDeath) th);
        }
        if (th instanceof java.lang.LinkageError) {
            throw ((java.lang.LinkageError) th);
        }
    }
}
