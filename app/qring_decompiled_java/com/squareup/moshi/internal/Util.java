package com.squareup.moshi.internal;

/* loaded from: classes3.dex */
public final class Util {

    @javax.annotation.Nullable
    public static final java.lang.Class<?> DEFAULT_CONSTRUCTOR_MARKER;

    @javax.annotation.Nullable
    private static final java.lang.Class<? extends java.lang.annotation.Annotation> METADATA;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> PRIMITIVE_TO_WRAPPER_TYPE;
    public static final java.util.Set<java.lang.annotation.Annotation> NO_ANNOTATIONS = java.util.Collections.emptySet();
    public static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = new java.lang.reflect.Type[0];

    private static java.lang.String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.Class cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName(getKotlinMetadataClassName());
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        METADATA = cls;
        try {
            cls2 = java.lang.Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
        } catch (java.lang.ClassNotFoundException unused2) {
        }
        DEFAULT_CONSTRUCTOR_MARKER = cls2;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(16);
        linkedHashMap.put(java.lang.Boolean.TYPE, java.lang.Boolean.class);
        linkedHashMap.put(java.lang.Byte.TYPE, java.lang.Byte.class);
        linkedHashMap.put(java.lang.Character.TYPE, java.lang.Character.class);
        linkedHashMap.put(java.lang.Double.TYPE, java.lang.Double.class);
        linkedHashMap.put(java.lang.Float.TYPE, java.lang.Float.class);
        linkedHashMap.put(java.lang.Integer.TYPE, java.lang.Integer.class);
        linkedHashMap.put(java.lang.Long.TYPE, java.lang.Long.class);
        linkedHashMap.put(java.lang.Short.TYPE, java.lang.Short.class);
        linkedHashMap.put(java.lang.Void.TYPE, java.lang.Void.class);
        PRIMITIVE_TO_WRAPPER_TYPE = java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    private Util() {
    }

    public static java.lang.String jsonName(java.lang.String str, java.lang.reflect.AnnotatedElement annotatedElement) {
        return jsonName(str, (com.squareup.moshi.Json) annotatedElement.getAnnotation(com.squareup.moshi.Json.class));
    }

    public static java.lang.String jsonName(java.lang.String str, @javax.annotation.Nullable com.squareup.moshi.Json json) {
        if (json == null) {
            return str;
        }
        java.lang.String name = json.name();
        return com.squareup.moshi.Json.UNSET_NAME.equals(name) ? str : name;
    }

    public static boolean typesMatch(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        return com.squareup.moshi.Types.equals(type, type2);
    }

    public static java.util.Set<? extends java.lang.annotation.Annotation> jsonAnnotations(java.lang.reflect.AnnotatedElement annotatedElement) {
        return jsonAnnotations(annotatedElement.getAnnotations());
    }

    public static java.util.Set<? extends java.lang.annotation.Annotation> jsonAnnotations(java.lang.annotation.Annotation[] annotationArr) {
        java.util.LinkedHashSet linkedHashSet = null;
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(com.squareup.moshi.JsonQualifier.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new java.util.LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? java.util.Collections.unmodifiableSet(linkedHashSet) : NO_ANNOTATIONS;
    }

    public static boolean isAnnotationPresent(java.util.Set<? extends java.lang.annotation.Annotation> set, java.lang.Class<? extends java.lang.annotation.Annotation> cls) {
        if (set.isEmpty()) {
            return false;
        }
        java.util.Iterator<? extends java.lang.annotation.Annotation> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().annotationType() == cls) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasNullable(java.lang.annotation.Annotation[] annotationArr) {
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPlatformType(java.lang.Class<?> cls) {
        java.lang.String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static java.lang.RuntimeException rethrowCause(java.lang.reflect.InvocationTargetException invocationTargetException) {
        java.lang.Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) targetException);
        }
        if (targetException instanceof java.lang.Error) {
            throw ((java.lang.Error) targetException);
        }
        throw new java.lang.RuntimeException(targetException);
    }

    public static java.lang.reflect.Type canonicalize(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            return cls.isArray() ? new com.squareup.moshi.internal.Util.GenericArrayTypeImpl(canonicalize(cls.getComponentType())) : cls;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            if (type instanceof com.squareup.moshi.internal.Util.ParameterizedTypeImpl) {
                return type;
            }
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            return new com.squareup.moshi.internal.Util.ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return type instanceof com.squareup.moshi.internal.Util.GenericArrayTypeImpl ? type : new com.squareup.moshi.internal.Util.GenericArrayTypeImpl(((java.lang.reflect.GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof java.lang.reflect.WildcardType) || (type instanceof com.squareup.moshi.internal.Util.WildcardTypeImpl)) {
            return type;
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
        return new com.squareup.moshi.internal.Util.WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static java.lang.reflect.Type removeSubtypeWildcard(java.lang.reflect.Type type) {
        if (!(type instanceof java.lang.reflect.WildcardType)) {
            return type;
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            throw new java.lang.IllegalArgumentException();
        }
        return upperBounds[0];
    }

    public static java.lang.reflect.Type resolve(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2) {
        return resolve(type, cls, type2, new java.util.LinkedHashSet());
    }

    private static java.lang.reflect.Type resolve(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2, java.util.Collection<java.lang.reflect.TypeVariable<?>> collection) {
        while (type2 instanceof java.lang.reflect.TypeVariable) {
            java.lang.reflect.TypeVariable<?> typeVariable = (java.lang.reflect.TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = resolveTypeVariable(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof java.lang.Class) {
            java.lang.Class cls2 = (java.lang.Class) type2;
            if (cls2.isArray()) {
                java.lang.Class<?> componentType = cls2.getComponentType();
                java.lang.reflect.Type resolve = resolve(type, cls, componentType, collection);
                return componentType == resolve ? cls2 : com.squareup.moshi.Types.arrayOf(resolve);
            }
        }
        if (type2 instanceof java.lang.reflect.GenericArrayType) {
            java.lang.reflect.GenericArrayType genericArrayType = (java.lang.reflect.GenericArrayType) type2;
            java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
            java.lang.reflect.Type resolve2 = resolve(type, cls, genericComponentType, collection);
            return genericComponentType == resolve2 ? genericArrayType : com.squareup.moshi.Types.arrayOf(resolve2);
        }
        if (type2 instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type2;
            java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
            java.lang.reflect.Type resolve3 = resolve(type, cls, ownerType, collection);
            boolean z = resolve3 != ownerType;
            java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                java.lang.reflect.Type resolve4 = resolve(type, cls, actualTypeArguments[i], collection);
                if (resolve4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (java.lang.reflect.Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = resolve4;
                }
            }
            return z ? new com.squareup.moshi.internal.Util.ParameterizedTypeImpl(resolve3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type2 instanceof java.lang.reflect.WildcardType;
        java.lang.reflect.Type type3 = type2;
        if (z2) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type2;
            java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
            java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                java.lang.reflect.Type resolve5 = resolve(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (resolve5 != lowerBounds[0]) {
                    return com.squareup.moshi.Types.supertypeOf(resolve5);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    java.lang.reflect.Type resolve6 = resolve(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (resolve6 != upperBounds[0]) {
                        return com.squareup.moshi.Types.subtypeOf(resolve6);
                    }
                }
            }
        }
        return type3;
    }

    static java.lang.reflect.Type resolveTypeVariable(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.TypeVariable<?> typeVariable) {
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

    public static java.lang.reflect.Type getGenericSupertype(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
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

    static int hashCodeOrZero(@javax.annotation.Nullable java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    static java.lang.String typeToString(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    static int indexOf(java.lang.Object[] objArr, java.lang.Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    @javax.annotation.Nullable
    static java.lang.Class<?> declaringClassOf(java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof java.lang.Class) {
            return (java.lang.Class) genericDeclaration;
        }
        return null;
    }

    static void checkNotPrimitive(java.lang.reflect.Type type) {
        if ((type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive()) {
            throw new java.lang.IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {

        @javax.annotation.Nullable
        private final java.lang.reflect.Type ownerType;
        private final java.lang.reflect.Type rawType;
        public final java.lang.reflect.Type[] typeArguments;

        public ParameterizedTypeImpl(@javax.annotation.Nullable java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
            if (type2 instanceof java.lang.Class) {
                java.lang.Class<?> enclosingClass = ((java.lang.Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || com.squareup.moshi.Types.getRawType(type) != enclosingClass) {
                        throw new java.lang.IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new java.lang.IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.ownerType = type == null ? null : com.squareup.moshi.internal.Util.canonicalize(type);
            this.rawType = com.squareup.moshi.internal.Util.canonicalize(type2);
            this.typeArguments = (java.lang.reflect.Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                java.lang.reflect.Type[] typeArr2 = this.typeArguments;
                if (i >= typeArr2.length) {
                    return;
                }
                java.util.Objects.requireNonNull(typeArr2[i]);
                com.squareup.moshi.internal.Util.checkNotPrimitive(typeArr2[i]);
                java.lang.reflect.Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = com.squareup.moshi.internal.Util.canonicalize(typeArr3[i]);
                i++;
            }
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
            return (obj instanceof java.lang.reflect.ParameterizedType) && com.squareup.moshi.Types.equals(this, (java.lang.reflect.ParameterizedType) obj);
        }

        public int hashCode() {
            return (java.util.Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ com.squareup.moshi.internal.Util.hashCodeOrZero(this.ownerType);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder((this.typeArguments.length + 1) * 30);
            sb.append(com.squareup.moshi.internal.Util.typeToString(this.rawType));
            if (this.typeArguments.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(com.squareup.moshi.internal.Util.typeToString(this.typeArguments[0]));
            for (int i = 1; i < this.typeArguments.length; i++) {
                sb.append(", ");
                sb.append(com.squareup.moshi.internal.Util.typeToString(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type componentType;

        public GenericArrayTypeImpl(java.lang.reflect.Type type) {
            this.componentType = com.squareup.moshi.internal.Util.canonicalize(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
            return this.componentType;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.GenericArrayType) && com.squareup.moshi.Types.equals(this, (java.lang.reflect.GenericArrayType) obj);
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public java.lang.String toString() {
            return com.squareup.moshi.internal.Util.typeToString(this.componentType) + okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    public static final class WildcardTypeImpl implements java.lang.reflect.WildcardType {

        @javax.annotation.Nullable
        private final java.lang.reflect.Type lowerBound;
        private final java.lang.reflect.Type upperBound;

        public WildcardTypeImpl(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new java.lang.IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new java.lang.IllegalArgumentException();
            }
            if (typeArr2.length == 1) {
                java.util.Objects.requireNonNull(typeArr2[0]);
                com.squareup.moshi.internal.Util.checkNotPrimitive(typeArr2[0]);
                if (typeArr[0] != java.lang.Object.class) {
                    throw new java.lang.IllegalArgumentException();
                }
                this.lowerBound = com.squareup.moshi.internal.Util.canonicalize(typeArr2[0]);
                this.upperBound = java.lang.Object.class;
                return;
            }
            java.util.Objects.requireNonNull(typeArr[0]);
            com.squareup.moshi.internal.Util.checkNotPrimitive(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = com.squareup.moshi.internal.Util.canonicalize(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
            return new java.lang.reflect.Type[]{this.upperBound};
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
            java.lang.reflect.Type type = this.lowerBound;
            return type != null ? new java.lang.reflect.Type[]{type} : com.squareup.moshi.internal.Util.EMPTY_TYPE_ARRAY;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.WildcardType) && com.squareup.moshi.Types.equals(this, (java.lang.reflect.WildcardType) obj);
        }

        public int hashCode() {
            java.lang.reflect.Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public java.lang.String toString() {
            if (this.lowerBound != null) {
                return "? super " + com.squareup.moshi.internal.Util.typeToString(this.lowerBound);
            }
            if (this.upperBound == java.lang.Object.class) {
                return "?";
            }
            return "? extends " + com.squareup.moshi.internal.Util.typeToString(this.upperBound);
        }
    }

    public static java.lang.String typeAnnotatedWithAnnotations(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    @javax.annotation.Nullable
    public static com.squareup.moshi.JsonAdapter<?> generatedAdapter(com.squareup.moshi.Moshi moshi, java.lang.reflect.Type type, java.lang.Class<?> cls) {
        java.lang.reflect.Constructor<?> declaredConstructor;
        java.lang.Object[] objArr;
        com.squareup.moshi.JsonClass jsonClass = (com.squareup.moshi.JsonClass) cls.getAnnotation(com.squareup.moshi.JsonClass.class);
        java.lang.Class<?> cls2 = null;
        if (jsonClass == null || !jsonClass.generateAdapter()) {
            return null;
        }
        try {
            try {
                cls2 = java.lang.Class.forName(com.squareup.moshi.Types.generatedJsonAdapterName(cls.getName()), true, cls.getClassLoader());
                if (type instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.Type[] actualTypeArguments = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments();
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(com.squareup.moshi.Moshi.class, java.lang.reflect.Type[].class);
                        objArr = new java.lang.Object[]{moshi, actualTypeArguments};
                    } catch (java.lang.NoSuchMethodException unused) {
                        declaredConstructor = cls2.getDeclaredConstructor(java.lang.reflect.Type[].class);
                        objArr = new java.lang.Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(com.squareup.moshi.Moshi.class);
                        objArr = new java.lang.Object[]{moshi};
                    } catch (java.lang.NoSuchMethodException unused2) {
                        declaredConstructor = cls2.getDeclaredConstructor(new java.lang.Class[0]);
                        objArr = new java.lang.Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                return ((com.squareup.moshi.JsonAdapter) declaredConstructor.newInstance(objArr)).nullSafe();
            } catch (java.lang.NoSuchMethodException e) {
                if (!(type instanceof java.lang.reflect.ParameterizedType) && cls2.getTypeParameters().length != 0) {
                    throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                }
                throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
            }
        } catch (java.lang.ClassNotFoundException e2) {
            throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter class for " + type, e2);
        } catch (java.lang.IllegalAccessException e3) {
            throw new java.lang.RuntimeException("Failed to access the generated JsonAdapter for " + type, e3);
        } catch (java.lang.InstantiationException e4) {
            throw new java.lang.RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e4);
        } catch (java.lang.reflect.InvocationTargetException e5) {
            throw rethrowCause(e5);
        }
    }

    public static boolean isKotlin(java.lang.Class<?> cls) {
        java.lang.Class<? extends java.lang.annotation.Annotation> cls2 = METADATA;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static <T> java.lang.reflect.Constructor<T> lookupDefaultsConstructor(java.lang.Class<T> cls) {
        if (DEFAULT_CONSTRUCTOR_MARKER == null) {
            throw new java.lang.IllegalStateException("DefaultConstructorMarker not on classpath. Make sure the Kotlin stdlib is on the classpath.");
        }
        java.lang.reflect.Constructor<T> findConstructor = findConstructor(cls);
        findConstructor.setAccessible(true);
        return findConstructor;
    }

    private static <T> java.lang.reflect.Constructor<T> findConstructor(java.lang.Class<T> cls) {
        for (java.lang.Object obj : cls.getDeclaredConstructors()) {
            java.lang.reflect.Constructor<T> constructor = (java.lang.reflect.Constructor<T>) obj;
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length != 0 && parameterTypes[parameterTypes.length - 1].equals(DEFAULT_CONSTRUCTOR_MARKER)) {
                return constructor;
            }
        }
        throw new java.lang.IllegalStateException("No defaults constructor found for " + cls);
    }

    public static com.squareup.moshi.JsonDataException missingProperty(java.lang.String str, java.lang.String str2, com.squareup.moshi.JsonReader jsonReader) {
        java.lang.String format;
        java.lang.String path = jsonReader.getPath();
        if (str2.equals(str)) {
            format = java.lang.String.format("Required value '%s' missing at %s", str, path);
        } else {
            format = java.lang.String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path);
        }
        return new com.squareup.moshi.JsonDataException(format);
    }

    public static com.squareup.moshi.JsonDataException unexpectedNull(java.lang.String str, java.lang.String str2, com.squareup.moshi.JsonReader jsonReader) {
        java.lang.String format;
        java.lang.String path = jsonReader.getPath();
        if (str2.equals(str)) {
            format = java.lang.String.format("Non-null value '%s' was null at %s", str, path);
        } else {
            format = java.lang.String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path);
        }
        return new com.squareup.moshi.JsonDataException(format);
    }

    public static <T> java.lang.Class<T> boxIfPrimitive(java.lang.Class<T> cls) {
        java.lang.Class<T> cls2 = (java.lang.Class) PRIMITIVE_TO_WRAPPER_TYPE.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
