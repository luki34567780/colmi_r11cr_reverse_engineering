package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
public class PropertyValuesHolder implements java.lang.Cloneable {
    private java.lang.Object mAnimatedValue;
    private com.nineoldandroids.animation.TypeEvaluator mEvaluator;
    private java.lang.reflect.Method mGetter;
    com.nineoldandroids.animation.KeyframeSet mKeyframeSet;
    protected com.nineoldandroids.util.Property mProperty;
    final java.util.concurrent.locks.ReentrantReadWriteLock mPropertyMapLock;
    java.lang.String mPropertyName;
    java.lang.reflect.Method mSetter;
    final java.lang.Object[] mTmpValueArray;
    java.lang.Class mValueType;
    private static final com.nineoldandroids.animation.TypeEvaluator sIntEvaluator = new com.nineoldandroids.animation.IntEvaluator();
    private static final com.nineoldandroids.animation.TypeEvaluator sFloatEvaluator = new com.nineoldandroids.animation.FloatEvaluator();
    private static java.lang.Class[] FLOAT_VARIANTS = {java.lang.Float.TYPE, java.lang.Float.class, java.lang.Double.TYPE, java.lang.Integer.TYPE, java.lang.Double.class, java.lang.Integer.class};
    private static java.lang.Class[] INTEGER_VARIANTS = {java.lang.Integer.TYPE, java.lang.Integer.class, java.lang.Float.TYPE, java.lang.Double.TYPE, java.lang.Float.class, java.lang.Double.class};
    private static java.lang.Class[] DOUBLE_VARIANTS = {java.lang.Double.TYPE, java.lang.Double.class, java.lang.Float.TYPE, java.lang.Integer.TYPE, java.lang.Float.class, java.lang.Integer.class};
    private static final java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> sSetterPropertyMap = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> sGetterPropertyMap = new java.util.HashMap<>();

    private PropertyValuesHolder(java.lang.String str) {
        this.mSetter = null;
        this.mGetter = null;
        this.mKeyframeSet = null;
        this.mPropertyMapLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.mTmpValueArray = new java.lang.Object[1];
        this.mPropertyName = str;
    }

    private PropertyValuesHolder(com.nineoldandroids.util.Property property) {
        this.mSetter = null;
        this.mGetter = null;
        this.mKeyframeSet = null;
        this.mPropertyMapLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.mTmpValueArray = new java.lang.Object[1];
        this.mProperty = property;
        if (property != null) {
            this.mPropertyName = property.getName();
        }
    }

    public static com.nineoldandroids.animation.PropertyValuesHolder ofInt(java.lang.String str, int... iArr) {
        return new com.nineoldandroids.animation.PropertyValuesHolder.IntPropertyValuesHolder(str, iArr);
    }

    public static com.nineoldandroids.animation.PropertyValuesHolder ofInt(com.nineoldandroids.util.Property<?, java.lang.Integer> property, int... iArr) {
        return new com.nineoldandroids.animation.PropertyValuesHolder.IntPropertyValuesHolder(property, iArr);
    }

    public static com.nineoldandroids.animation.PropertyValuesHolder ofFloat(java.lang.String str, float... fArr) {
        return new com.nineoldandroids.animation.PropertyValuesHolder.FloatPropertyValuesHolder(str, fArr);
    }

    public static com.nineoldandroids.animation.PropertyValuesHolder ofFloat(com.nineoldandroids.util.Property<?, java.lang.Float> property, float... fArr) {
        return new com.nineoldandroids.animation.PropertyValuesHolder.FloatPropertyValuesHolder(property, fArr);
    }

    public static com.nineoldandroids.animation.PropertyValuesHolder ofObject(java.lang.String str, com.nineoldandroids.animation.TypeEvaluator typeEvaluator, java.lang.Object... objArr) {
        com.nineoldandroids.animation.PropertyValuesHolder propertyValuesHolder = new com.nineoldandroids.animation.PropertyValuesHolder(str);
        propertyValuesHolder.setObjectValues(objArr);
        propertyValuesHolder.setEvaluator(typeEvaluator);
        return propertyValuesHolder;
    }

    public static <V> com.nineoldandroids.animation.PropertyValuesHolder ofObject(com.nineoldandroids.util.Property property, com.nineoldandroids.animation.TypeEvaluator<V> typeEvaluator, V... vArr) {
        com.nineoldandroids.animation.PropertyValuesHolder propertyValuesHolder = new com.nineoldandroids.animation.PropertyValuesHolder(property);
        propertyValuesHolder.setObjectValues(vArr);
        propertyValuesHolder.setEvaluator(typeEvaluator);
        return propertyValuesHolder;
    }

    public static com.nineoldandroids.animation.PropertyValuesHolder ofKeyframe(java.lang.String str, com.nineoldandroids.animation.Keyframe... keyframeArr) {
        com.nineoldandroids.animation.KeyframeSet ofKeyframe = com.nineoldandroids.animation.KeyframeSet.ofKeyframe(keyframeArr);
        if (ofKeyframe instanceof com.nineoldandroids.animation.IntKeyframeSet) {
            return new com.nineoldandroids.animation.PropertyValuesHolder.IntPropertyValuesHolder(str, (com.nineoldandroids.animation.IntKeyframeSet) ofKeyframe);
        }
        if (ofKeyframe instanceof com.nineoldandroids.animation.FloatKeyframeSet) {
            return new com.nineoldandroids.animation.PropertyValuesHolder.FloatPropertyValuesHolder(str, (com.nineoldandroids.animation.FloatKeyframeSet) ofKeyframe);
        }
        com.nineoldandroids.animation.PropertyValuesHolder propertyValuesHolder = new com.nineoldandroids.animation.PropertyValuesHolder(str);
        propertyValuesHolder.mKeyframeSet = ofKeyframe;
        propertyValuesHolder.mValueType = keyframeArr[0].getType();
        return propertyValuesHolder;
    }

    public static com.nineoldandroids.animation.PropertyValuesHolder ofKeyframe(com.nineoldandroids.util.Property property, com.nineoldandroids.animation.Keyframe... keyframeArr) {
        com.nineoldandroids.animation.KeyframeSet ofKeyframe = com.nineoldandroids.animation.KeyframeSet.ofKeyframe(keyframeArr);
        if (ofKeyframe instanceof com.nineoldandroids.animation.IntKeyframeSet) {
            return new com.nineoldandroids.animation.PropertyValuesHolder.IntPropertyValuesHolder(property, (com.nineoldandroids.animation.IntKeyframeSet) ofKeyframe);
        }
        if (ofKeyframe instanceof com.nineoldandroids.animation.FloatKeyframeSet) {
            return new com.nineoldandroids.animation.PropertyValuesHolder.FloatPropertyValuesHolder(property, (com.nineoldandroids.animation.FloatKeyframeSet) ofKeyframe);
        }
        com.nineoldandroids.animation.PropertyValuesHolder propertyValuesHolder = new com.nineoldandroids.animation.PropertyValuesHolder(property);
        propertyValuesHolder.mKeyframeSet = ofKeyframe;
        propertyValuesHolder.mValueType = keyframeArr[0].getType();
        return propertyValuesHolder;
    }

    public void setIntValues(int... iArr) {
        this.mValueType = java.lang.Integer.TYPE;
        this.mKeyframeSet = com.nineoldandroids.animation.KeyframeSet.ofInt(iArr);
    }

    public void setFloatValues(float... fArr) {
        this.mValueType = java.lang.Float.TYPE;
        this.mKeyframeSet = com.nineoldandroids.animation.KeyframeSet.ofFloat(fArr);
    }

    public void setKeyframes(com.nineoldandroids.animation.Keyframe... keyframeArr) {
        int length = keyframeArr.length;
        com.nineoldandroids.animation.Keyframe[] keyframeArr2 = new com.nineoldandroids.animation.Keyframe[java.lang.Math.max(length, 2)];
        this.mValueType = keyframeArr[0].getType();
        for (int i = 0; i < length; i++) {
            keyframeArr2[i] = keyframeArr[i];
        }
        this.mKeyframeSet = new com.nineoldandroids.animation.KeyframeSet(keyframeArr2);
    }

    public void setObjectValues(java.lang.Object... objArr) {
        this.mValueType = objArr[0].getClass();
        this.mKeyframeSet = com.nineoldandroids.animation.KeyframeSet.ofObject(objArr);
    }

    private java.lang.reflect.Method getPropertyFunction(java.lang.Class cls, java.lang.String str, java.lang.Class cls2) {
        java.lang.Class<?>[] clsArr;
        java.lang.String methodName = getMethodName(str, this.mPropertyName);
        java.lang.reflect.Method method = null;
        if (cls2 == null) {
            try {
                return cls.getMethod(methodName, null);
            } catch (java.lang.NoSuchMethodException e) {
                try {
                    method = cls.getDeclaredMethod(methodName, null);
                    method.setAccessible(true);
                } catch (java.lang.NoSuchMethodException unused) {
                    android.util.Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.mPropertyName + ": " + e);
                }
            }
        } else {
            java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
            if (this.mValueType.equals(java.lang.Float.class)) {
                clsArr = FLOAT_VARIANTS;
            } else if (this.mValueType.equals(java.lang.Integer.class)) {
                clsArr = INTEGER_VARIANTS;
            } else {
                clsArr = this.mValueType.equals(java.lang.Double.class) ? DOUBLE_VARIANTS : new java.lang.Class[]{this.mValueType};
            }
            for (java.lang.Class<?> cls3 : clsArr) {
                clsArr2[0] = cls3;
                try {
                    try {
                        java.lang.reflect.Method method2 = cls.getMethod(methodName, clsArr2);
                        this.mValueType = cls3;
                        return method2;
                    } catch (java.lang.NoSuchMethodException unused2) {
                        method = cls.getDeclaredMethod(methodName, clsArr2);
                        method.setAccessible(true);
                        this.mValueType = cls3;
                        return method;
                    }
                } catch (java.lang.NoSuchMethodException unused3) {
                }
            }
            android.util.Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.mPropertyName + " with value type " + this.mValueType);
        }
        return method;
    }

    private java.lang.reflect.Method setupSetterOrGetter(java.lang.Class cls, java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> hashMap, java.lang.String str, java.lang.Class cls2) {
        try {
            this.mPropertyMapLock.writeLock().lock();
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> hashMap2 = hashMap.get(cls);
            java.lang.reflect.Method method = hashMap2 != null ? hashMap2.get(this.mPropertyName) : null;
            if (method == null) {
                method = getPropertyFunction(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new java.util.HashMap<>();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.mPropertyName, method);
            }
            return method;
        } finally {
            this.mPropertyMapLock.writeLock().unlock();
        }
    }

    void setupSetter(java.lang.Class cls) {
        this.mSetter = setupSetterOrGetter(cls, sSetterPropertyMap, "set", this.mValueType);
    }

    private void setupGetter(java.lang.Class cls) {
        this.mGetter = setupSetterOrGetter(cls, sGetterPropertyMap, "get", null);
    }

    void setupSetterAndGetter(java.lang.Object obj) {
        com.nineoldandroids.util.Property property = this.mProperty;
        if (property != null) {
            try {
                property.get(obj);
                java.util.Iterator<com.nineoldandroids.animation.Keyframe> it = this.mKeyframeSet.mKeyframes.iterator();
                while (it.hasNext()) {
                    com.nineoldandroids.animation.Keyframe next = it.next();
                    if (!next.hasValue()) {
                        next.setValue(this.mProperty.get(obj));
                    }
                }
                return;
            } catch (java.lang.ClassCastException unused) {
                android.util.Log.e("PropertyValuesHolder", "No such property (" + this.mProperty.getName() + ") on target object " + obj + ". Trying reflection instead");
                this.mProperty = null;
            }
        }
        java.lang.Class<?> cls = obj.getClass();
        if (this.mSetter == null) {
            setupSetter(cls);
        }
        java.util.Iterator<com.nineoldandroids.animation.Keyframe> it2 = this.mKeyframeSet.mKeyframes.iterator();
        while (it2.hasNext()) {
            com.nineoldandroids.animation.Keyframe next2 = it2.next();
            if (!next2.hasValue()) {
                if (this.mGetter == null) {
                    setupGetter(cls);
                }
                try {
                    next2.setValue(this.mGetter.invoke(obj, new java.lang.Object[0]));
                } catch (java.lang.IllegalAccessException e) {
                    android.util.Log.e("PropertyValuesHolder", e.toString());
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    android.util.Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }
    }

    private void setupValue(java.lang.Object obj, com.nineoldandroids.animation.Keyframe keyframe) {
        com.nineoldandroids.util.Property property = this.mProperty;
        if (property != null) {
            keyframe.setValue(property.get(obj));
        }
        try {
            if (this.mGetter == null) {
                setupGetter(obj.getClass());
            }
            keyframe.setValue(this.mGetter.invoke(obj, new java.lang.Object[0]));
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.e("PropertyValuesHolder", e.toString());
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.e("PropertyValuesHolder", e2.toString());
        }
    }

    void setupStartValue(java.lang.Object obj) {
        setupValue(obj, this.mKeyframeSet.mKeyframes.get(0));
    }

    void setupEndValue(java.lang.Object obj) {
        setupValue(obj, this.mKeyframeSet.mKeyframes.get(this.mKeyframeSet.mKeyframes.size() - 1));
    }

    @Override // 
    /* renamed from: clone */
    public com.nineoldandroids.animation.PropertyValuesHolder mo110clone() {
        try {
            com.nineoldandroids.animation.PropertyValuesHolder propertyValuesHolder = (com.nineoldandroids.animation.PropertyValuesHolder) super.clone();
            propertyValuesHolder.mPropertyName = this.mPropertyName;
            propertyValuesHolder.mProperty = this.mProperty;
            propertyValuesHolder.mKeyframeSet = this.mKeyframeSet.mo108clone();
            propertyValuesHolder.mEvaluator = this.mEvaluator;
            return propertyValuesHolder;
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    void setAnimatedValue(java.lang.Object obj) {
        com.nineoldandroids.util.Property property = this.mProperty;
        if (property != null) {
            property.set(obj, getAnimatedValue());
        }
        if (this.mSetter != null) {
            try {
                this.mTmpValueArray[0] = getAnimatedValue();
                this.mSetter.invoke(obj, this.mTmpValueArray);
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.e("PropertyValuesHolder", e.toString());
            } catch (java.lang.reflect.InvocationTargetException e2) {
                android.util.Log.e("PropertyValuesHolder", e2.toString());
            }
        }
    }

    void init() {
        if (this.mEvaluator == null) {
            java.lang.Class cls = this.mValueType;
            this.mEvaluator = cls == java.lang.Integer.class ? sIntEvaluator : cls == java.lang.Float.class ? sFloatEvaluator : null;
        }
        com.nineoldandroids.animation.TypeEvaluator typeEvaluator = this.mEvaluator;
        if (typeEvaluator != null) {
            this.mKeyframeSet.setEvaluator(typeEvaluator);
        }
    }

    public void setEvaluator(com.nineoldandroids.animation.TypeEvaluator typeEvaluator) {
        this.mEvaluator = typeEvaluator;
        this.mKeyframeSet.setEvaluator(typeEvaluator);
    }

    void calculateValue(float f) {
        this.mAnimatedValue = this.mKeyframeSet.getValue(f);
    }

    public void setPropertyName(java.lang.String str) {
        this.mPropertyName = str;
    }

    public void setProperty(com.nineoldandroids.util.Property property) {
        this.mProperty = property;
    }

    public java.lang.String getPropertyName() {
        return this.mPropertyName;
    }

    java.lang.Object getAnimatedValue() {
        return this.mAnimatedValue;
    }

    public java.lang.String toString() {
        return this.mPropertyName + ": " + this.mKeyframeSet.toString();
    }

    static java.lang.String getMethodName(java.lang.String str, java.lang.String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str + java.lang.Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
    }

    static class IntPropertyValuesHolder extends com.nineoldandroids.animation.PropertyValuesHolder {
        int mIntAnimatedValue;
        com.nineoldandroids.animation.IntKeyframeSet mIntKeyframeSet;
        private com.nineoldandroids.util.IntProperty mIntProperty;

        public IntPropertyValuesHolder(java.lang.String str, com.nineoldandroids.animation.IntKeyframeSet intKeyframeSet) {
            super(str);
            this.mValueType = java.lang.Integer.TYPE;
            this.mKeyframeSet = intKeyframeSet;
            this.mIntKeyframeSet = (com.nineoldandroids.animation.IntKeyframeSet) this.mKeyframeSet;
        }

        public IntPropertyValuesHolder(com.nineoldandroids.util.Property property, com.nineoldandroids.animation.IntKeyframeSet intKeyframeSet) {
            super(property);
            this.mValueType = java.lang.Integer.TYPE;
            this.mKeyframeSet = intKeyframeSet;
            this.mIntKeyframeSet = (com.nineoldandroids.animation.IntKeyframeSet) this.mKeyframeSet;
            if (property instanceof com.nineoldandroids.util.IntProperty) {
                this.mIntProperty = (com.nineoldandroids.util.IntProperty) this.mProperty;
            }
        }

        public IntPropertyValuesHolder(java.lang.String str, int... iArr) {
            super(str);
            setIntValues(iArr);
        }

        public IntPropertyValuesHolder(com.nineoldandroids.util.Property property, int... iArr) {
            super(property);
            setIntValues(iArr);
            if (property instanceof com.nineoldandroids.util.IntProperty) {
                this.mIntProperty = (com.nineoldandroids.util.IntProperty) this.mProperty;
            }
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public void setIntValues(int... iArr) {
            super.setIntValues(iArr);
            this.mIntKeyframeSet = (com.nineoldandroids.animation.IntKeyframeSet) this.mKeyframeSet;
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        void calculateValue(float f) {
            this.mIntAnimatedValue = this.mIntKeyframeSet.getIntValue(f);
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        java.lang.Object getAnimatedValue() {
            return java.lang.Integer.valueOf(this.mIntAnimatedValue);
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        /* renamed from: clone */
        public com.nineoldandroids.animation.PropertyValuesHolder.IntPropertyValuesHolder mo110clone() {
            com.nineoldandroids.animation.PropertyValuesHolder.IntPropertyValuesHolder intPropertyValuesHolder = (com.nineoldandroids.animation.PropertyValuesHolder.IntPropertyValuesHolder) super.mo110clone();
            intPropertyValuesHolder.mIntKeyframeSet = (com.nineoldandroids.animation.IntKeyframeSet) intPropertyValuesHolder.mKeyframeSet;
            return intPropertyValuesHolder;
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        void setAnimatedValue(java.lang.Object obj) {
            com.nineoldandroids.util.IntProperty intProperty = this.mIntProperty;
            if (intProperty != null) {
                intProperty.setValue(obj, this.mIntAnimatedValue);
                return;
            }
            if (this.mProperty != null) {
                this.mProperty.set(obj, java.lang.Integer.valueOf(this.mIntAnimatedValue));
                return;
            }
            if (this.mSetter != null) {
                try {
                    this.mTmpValueArray[0] = java.lang.Integer.valueOf(this.mIntAnimatedValue);
                    this.mSetter.invoke(obj, this.mTmpValueArray);
                } catch (java.lang.IllegalAccessException e) {
                    android.util.Log.e("PropertyValuesHolder", e.toString());
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    android.util.Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        void setupSetter(java.lang.Class cls) {
            if (this.mProperty != null) {
                return;
            }
            super.setupSetter(cls);
        }
    }

    static class FloatPropertyValuesHolder extends com.nineoldandroids.animation.PropertyValuesHolder {
        float mFloatAnimatedValue;
        com.nineoldandroids.animation.FloatKeyframeSet mFloatKeyframeSet;
        private com.nineoldandroids.util.FloatProperty mFloatProperty;

        public FloatPropertyValuesHolder(java.lang.String str, com.nineoldandroids.animation.FloatKeyframeSet floatKeyframeSet) {
            super(str);
            this.mValueType = java.lang.Float.TYPE;
            this.mKeyframeSet = floatKeyframeSet;
            this.mFloatKeyframeSet = (com.nineoldandroids.animation.FloatKeyframeSet) this.mKeyframeSet;
        }

        public FloatPropertyValuesHolder(com.nineoldandroids.util.Property property, com.nineoldandroids.animation.FloatKeyframeSet floatKeyframeSet) {
            super(property);
            this.mValueType = java.lang.Float.TYPE;
            this.mKeyframeSet = floatKeyframeSet;
            this.mFloatKeyframeSet = (com.nineoldandroids.animation.FloatKeyframeSet) this.mKeyframeSet;
            if (property instanceof com.nineoldandroids.util.FloatProperty) {
                this.mFloatProperty = (com.nineoldandroids.util.FloatProperty) this.mProperty;
            }
        }

        public FloatPropertyValuesHolder(java.lang.String str, float... fArr) {
            super(str);
            setFloatValues(fArr);
        }

        public FloatPropertyValuesHolder(com.nineoldandroids.util.Property property, float... fArr) {
            super(property);
            setFloatValues(fArr);
            if (property instanceof com.nineoldandroids.util.FloatProperty) {
                this.mFloatProperty = (com.nineoldandroids.util.FloatProperty) this.mProperty;
            }
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public void setFloatValues(float... fArr) {
            super.setFloatValues(fArr);
            this.mFloatKeyframeSet = (com.nineoldandroids.animation.FloatKeyframeSet) this.mKeyframeSet;
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        void calculateValue(float f) {
            this.mFloatAnimatedValue = this.mFloatKeyframeSet.getFloatValue(f);
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        java.lang.Object getAnimatedValue() {
            return java.lang.Float.valueOf(this.mFloatAnimatedValue);
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.nineoldandroids.animation.PropertyValuesHolder.FloatPropertyValuesHolder mo110clone() {
            com.nineoldandroids.animation.PropertyValuesHolder.FloatPropertyValuesHolder floatPropertyValuesHolder = (com.nineoldandroids.animation.PropertyValuesHolder.FloatPropertyValuesHolder) super.mo110clone();
            floatPropertyValuesHolder.mFloatKeyframeSet = (com.nineoldandroids.animation.FloatKeyframeSet) floatPropertyValuesHolder.mKeyframeSet;
            return floatPropertyValuesHolder;
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        void setAnimatedValue(java.lang.Object obj) {
            com.nineoldandroids.util.FloatProperty floatProperty = this.mFloatProperty;
            if (floatProperty != null) {
                floatProperty.setValue(obj, this.mFloatAnimatedValue);
                return;
            }
            if (this.mProperty != null) {
                this.mProperty.set(obj, java.lang.Float.valueOf(this.mFloatAnimatedValue));
                return;
            }
            if (this.mSetter != null) {
                try {
                    this.mTmpValueArray[0] = java.lang.Float.valueOf(this.mFloatAnimatedValue);
                    this.mSetter.invoke(obj, this.mTmpValueArray);
                } catch (java.lang.IllegalAccessException e) {
                    android.util.Log.e("PropertyValuesHolder", e.toString());
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    android.util.Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        void setupSetter(java.lang.Class cls) {
            if (this.mProperty != null) {
                return;
            }
            super.setupSetter(cls);
        }
    }
}
