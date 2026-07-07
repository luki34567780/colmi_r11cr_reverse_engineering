package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
public final class ObjectAnimator extends com.nineoldandroids.animation.ValueAnimator {
    private static final boolean DBG = false;
    private static final java.util.Map<java.lang.String, com.nineoldandroids.util.Property> PROXY_PROPERTIES;
    private com.nineoldandroids.util.Property mProperty;
    private java.lang.String mPropertyName;
    private java.lang.Object mTarget;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        PROXY_PROPERTIES = hashMap;
        hashMap.put("alpha", com.nineoldandroids.animation.PreHoneycombCompat.ALPHA);
        hashMap.put("pivotX", com.nineoldandroids.animation.PreHoneycombCompat.PIVOT_X);
        hashMap.put("pivotY", com.nineoldandroids.animation.PreHoneycombCompat.PIVOT_Y);
        hashMap.put("translationX", com.nineoldandroids.animation.PreHoneycombCompat.TRANSLATION_X);
        hashMap.put("translationY", com.nineoldandroids.animation.PreHoneycombCompat.TRANSLATION_Y);
        hashMap.put("rotation", com.nineoldandroids.animation.PreHoneycombCompat.ROTATION);
        hashMap.put("rotationX", com.nineoldandroids.animation.PreHoneycombCompat.ROTATION_X);
        hashMap.put("rotationY", com.nineoldandroids.animation.PreHoneycombCompat.ROTATION_Y);
        hashMap.put("scaleX", com.nineoldandroids.animation.PreHoneycombCompat.SCALE_X);
        hashMap.put("scaleY", com.nineoldandroids.animation.PreHoneycombCompat.SCALE_Y);
        hashMap.put("scrollX", com.nineoldandroids.animation.PreHoneycombCompat.SCROLL_X);
        hashMap.put("scrollY", com.nineoldandroids.animation.PreHoneycombCompat.SCROLL_Y);
        hashMap.put("x", com.nineoldandroids.animation.PreHoneycombCompat.X);
        hashMap.put("y", com.nineoldandroids.animation.PreHoneycombCompat.Y);
    }

    public void setPropertyName(java.lang.String str) {
        if (this.mValues != null) {
            com.nineoldandroids.animation.PropertyValuesHolder propertyValuesHolder = this.mValues[0];
            java.lang.String propertyName = propertyValuesHolder.getPropertyName();
            propertyValuesHolder.setPropertyName(str);
            this.mValuesMap.remove(propertyName);
            this.mValuesMap.put(str, propertyValuesHolder);
        }
        this.mPropertyName = str;
        this.mInitialized = false;
    }

    public void setProperty(com.nineoldandroids.util.Property property) {
        if (this.mValues != null) {
            com.nineoldandroids.animation.PropertyValuesHolder propertyValuesHolder = this.mValues[0];
            java.lang.String propertyName = propertyValuesHolder.getPropertyName();
            propertyValuesHolder.setProperty(property);
            this.mValuesMap.remove(propertyName);
            this.mValuesMap.put(this.mPropertyName, propertyValuesHolder);
        }
        if (this.mProperty != null) {
            this.mPropertyName = property.getName();
        }
        this.mProperty = property;
        this.mInitialized = false;
    }

    public java.lang.String getPropertyName() {
        return this.mPropertyName;
    }

    public ObjectAnimator() {
    }

    private ObjectAnimator(java.lang.Object obj, java.lang.String str) {
        this.mTarget = obj;
        setPropertyName(str);
    }

    private <T> ObjectAnimator(T t, com.nineoldandroids.util.Property<T, ?> property) {
        this.mTarget = t;
        setProperty(property);
    }

    public static com.nineoldandroids.animation.ObjectAnimator ofInt(java.lang.Object obj, java.lang.String str, int... iArr) {
        com.nineoldandroids.animation.ObjectAnimator objectAnimator = new com.nineoldandroids.animation.ObjectAnimator(obj, str);
        objectAnimator.setIntValues(iArr);
        return objectAnimator;
    }

    public static <T> com.nineoldandroids.animation.ObjectAnimator ofInt(T t, com.nineoldandroids.util.Property<T, java.lang.Integer> property, int... iArr) {
        com.nineoldandroids.animation.ObjectAnimator objectAnimator = new com.nineoldandroids.animation.ObjectAnimator(t, property);
        objectAnimator.setIntValues(iArr);
        return objectAnimator;
    }

    public static com.nineoldandroids.animation.ObjectAnimator ofFloat(java.lang.Object obj, java.lang.String str, float... fArr) {
        com.nineoldandroids.animation.ObjectAnimator objectAnimator = new com.nineoldandroids.animation.ObjectAnimator(obj, str);
        objectAnimator.setFloatValues(fArr);
        return objectAnimator;
    }

    public static <T> com.nineoldandroids.animation.ObjectAnimator ofFloat(T t, com.nineoldandroids.util.Property<T, java.lang.Float> property, float... fArr) {
        com.nineoldandroids.animation.ObjectAnimator objectAnimator = new com.nineoldandroids.animation.ObjectAnimator(t, property);
        objectAnimator.setFloatValues(fArr);
        return objectAnimator;
    }

    public static com.nineoldandroids.animation.ObjectAnimator ofObject(java.lang.Object obj, java.lang.String str, com.nineoldandroids.animation.TypeEvaluator typeEvaluator, java.lang.Object... objArr) {
        com.nineoldandroids.animation.ObjectAnimator objectAnimator = new com.nineoldandroids.animation.ObjectAnimator(obj, str);
        objectAnimator.setObjectValues(objArr);
        objectAnimator.setEvaluator(typeEvaluator);
        return objectAnimator;
    }

    public static <T, V> com.nineoldandroids.animation.ObjectAnimator ofObject(T t, com.nineoldandroids.util.Property<T, V> property, com.nineoldandroids.animation.TypeEvaluator<V> typeEvaluator, V... vArr) {
        com.nineoldandroids.animation.ObjectAnimator objectAnimator = new com.nineoldandroids.animation.ObjectAnimator(t, property);
        objectAnimator.setObjectValues(vArr);
        objectAnimator.setEvaluator(typeEvaluator);
        return objectAnimator;
    }

    public static com.nineoldandroids.animation.ObjectAnimator ofPropertyValuesHolder(java.lang.Object obj, com.nineoldandroids.animation.PropertyValuesHolder... propertyValuesHolderArr) {
        com.nineoldandroids.animation.ObjectAnimator objectAnimator = new com.nineoldandroids.animation.ObjectAnimator();
        objectAnimator.mTarget = obj;
        objectAnimator.setValues(propertyValuesHolderArr);
        return objectAnimator;
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void setIntValues(int... iArr) {
        if (this.mValues == null || this.mValues.length == 0) {
            com.nineoldandroids.util.Property property = this.mProperty;
            if (property != null) {
                setValues(com.nineoldandroids.animation.PropertyValuesHolder.ofInt((com.nineoldandroids.util.Property<?, java.lang.Integer>) property, iArr));
                return;
            } else {
                setValues(com.nineoldandroids.animation.PropertyValuesHolder.ofInt(this.mPropertyName, iArr));
                return;
            }
        }
        super.setIntValues(iArr);
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void setFloatValues(float... fArr) {
        if (this.mValues == null || this.mValues.length == 0) {
            com.nineoldandroids.util.Property property = this.mProperty;
            if (property != null) {
                setValues(com.nineoldandroids.animation.PropertyValuesHolder.ofFloat((com.nineoldandroids.util.Property<?, java.lang.Float>) property, fArr));
                return;
            } else {
                setValues(com.nineoldandroids.animation.PropertyValuesHolder.ofFloat(this.mPropertyName, fArr));
                return;
            }
        }
        super.setFloatValues(fArr);
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void setObjectValues(java.lang.Object... objArr) {
        if (this.mValues == null || this.mValues.length == 0) {
            com.nineoldandroids.util.Property property = this.mProperty;
            if (property != null) {
                setValues(com.nineoldandroids.animation.PropertyValuesHolder.ofObject(property, (com.nineoldandroids.animation.TypeEvaluator) null, objArr));
                return;
            } else {
                setValues(com.nineoldandroids.animation.PropertyValuesHolder.ofObject(this.mPropertyName, (com.nineoldandroids.animation.TypeEvaluator) null, objArr));
                return;
            }
        }
        super.setObjectValues(objArr);
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public void start() {
        super.start();
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    void initAnimation() {
        if (this.mInitialized) {
            return;
        }
        if (this.mProperty == null && com.nineoldandroids.view.animation.AnimatorProxy.NEEDS_PROXY && (this.mTarget instanceof android.view.View)) {
            java.util.Map<java.lang.String, com.nineoldandroids.util.Property> map = PROXY_PROPERTIES;
            if (map.containsKey(this.mPropertyName)) {
                setProperty(map.get(this.mPropertyName));
            }
        }
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].setupSetterAndGetter(this.mTarget);
        }
        super.initAnimation();
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public com.nineoldandroids.animation.ObjectAnimator setDuration(long j) {
        super.setDuration(j);
        return this;
    }

    public java.lang.Object getTarget() {
        return this.mTarget;
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setTarget(java.lang.Object obj) {
        java.lang.Object obj2 = this.mTarget;
        if (obj2 != obj) {
            this.mTarget = obj;
            if (obj2 == null || obj == null || obj2.getClass() != obj.getClass()) {
                this.mInitialized = false;
            }
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setupStartValues() {
        initAnimation();
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].setupStartValue(this.mTarget);
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setupEndValues() {
        initAnimation();
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].setupEndValue(this.mTarget);
        }
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    void animateValue(float f) {
        super.animateValue(f);
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].setAnimatedValue(this.mTarget);
        }
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    /* renamed from: clone */
    public com.nineoldandroids.animation.ObjectAnimator mo106clone() {
        return (com.nineoldandroids.animation.ObjectAnimator) super.mo106clone();
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public java.lang.String toString() {
        java.lang.String str = "ObjectAnimator@" + java.lang.Integer.toHexString(hashCode()) + ", target " + this.mTarget;
        if (this.mValues != null) {
            for (int i = 0; i < this.mValues.length; i++) {
                str = str + "\n    " + this.mValues[i].toString();
            }
        }
        return str;
    }
}
