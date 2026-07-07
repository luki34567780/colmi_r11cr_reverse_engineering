package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class ConstraintAttribute {
    private static final java.lang.String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    java.lang.String mName;
    private java.lang.String mStringValue;
    private androidx.constraintlayout.widget.ConstraintAttribute.AttributeType mType;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    private static int clamp(int c) {
        int i = (c & (~(c >> 31))) - 255;
        return (i & (i >> 31)) + 255;
    }

    public java.lang.String getName() {
        return this.mName;
    }

    public boolean isMethod() {
        return this.mMethod;
    }

    public int getIntegerValue() {
        return this.mIntegerValue;
    }

    public float getFloatValue() {
        return this.mFloatValue;
    }

    public java.lang.String getStringValue() {
        return this.mStringValue;
    }

    public boolean isBooleanValue() {
        return this.mBooleanValue;
    }

    public int getColorValue() {
        return this.mColorValue;
    }

    public androidx.constraintlayout.widget.ConstraintAttribute.AttributeType getType() {
        return this.mType;
    }

    public boolean isContinuous() {
        int i = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    public void setFloatValue(float value) {
        this.mFloatValue = value;
    }

    public void setColorValue(int value) {
        this.mColorValue = value;
    }

    public void setIntValue(int value) {
        this.mIntegerValue = value;
    }

    public void setStringValue(java.lang.String value) {
        this.mStringValue = value;
    }

    public int numberOfInterpolatedValues() {
        int i = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()];
        return (i == 4 || i == 5) ? 4 : 1;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case BOOLEAN_TYPE:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case STRING_TYPE:
                throw new java.lang.RuntimeException("Cannot interpolate String");
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case INT_TYPE:
                return this.mIntegerValue;
            case FLOAT_TYPE:
                return this.mFloatValue;
            case DIMENSION_TYPE:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] ret) {
        switch (this.mType) {
            case BOOLEAN_TYPE:
                ret[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case STRING_TYPE:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i = (this.mColorValue >> 24) & 255;
                float pow = (float) java.lang.Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) java.lang.Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) java.lang.Math.pow((r0 & 255) / 255.0f, 2.2d);
                ret[0] = pow;
                ret[1] = pow2;
                ret[2] = pow3;
                ret[3] = i / 255.0f;
                return;
            case INT_TYPE:
                ret[0] = this.mIntegerValue;
                return;
            case FLOAT_TYPE:
                ret[0] = this.mFloatValue;
                return;
            case DIMENSION_TYPE:
                ret[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] value) {
        switch (androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = (int) value[0];
                return;
            case 2:
                this.mBooleanValue = ((double) value[0]) > 0.5d;
                return;
            case 3:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int HSVToColor = android.graphics.Color.HSVToColor(value);
                this.mColorValue = HSVToColor;
                this.mColorValue = (clamp((int) (value[3] * 255.0f)) << 24) | (HSVToColor & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
                return;
            case 7:
                this.mFloatValue = value[0];
                return;
            case 8:
                this.mFloatValue = value[0];
                return;
            default:
                return;
        }
    }

    public boolean diff(androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute) {
        if (constraintAttribute == null || this.mType != constraintAttribute.mType) {
            return false;
        }
        switch (androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                if (this.mIntegerValue == constraintAttribute.mIntegerValue) {
                }
                break;
            case 2:
                if (this.mBooleanValue == constraintAttribute.mBooleanValue) {
                }
                break;
            case 3:
                if (this.mIntegerValue == constraintAttribute.mIntegerValue) {
                }
                break;
            case 4:
            case 5:
                if (this.mColorValue == constraintAttribute.mColorValue) {
                }
                break;
            case 7:
                if (this.mFloatValue == constraintAttribute.mFloatValue) {
                }
                break;
            case 8:
                if (this.mFloatValue == constraintAttribute.mFloatValue) {
                }
                break;
        }
        return false;
    }

    public ConstraintAttribute(java.lang.String name, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType) {
        this.mMethod = false;
        this.mName = name;
        this.mType = attributeType;
    }

    public ConstraintAttribute(java.lang.String name, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType, java.lang.Object value, boolean method) {
        this.mMethod = false;
        this.mName = name;
        this.mType = attributeType;
        this.mMethod = method;
        setValue(value);
    }

    public ConstraintAttribute(androidx.constraintlayout.widget.ConstraintAttribute source, java.lang.Object value) {
        this.mMethod = false;
        this.mName = source.mName;
        this.mType = source.mType;
        setValue(value);
    }

    public void setValue(java.lang.Object value) {
        switch (androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = ((java.lang.Integer) value).intValue();
                break;
            case 2:
                this.mBooleanValue = ((java.lang.Boolean) value).booleanValue();
                break;
            case 3:
                this.mStringValue = (java.lang.String) value;
                break;
            case 4:
            case 5:
                this.mColorValue = ((java.lang.Integer) value).intValue();
                break;
            case 7:
                this.mFloatValue = ((java.lang.Float) value).floatValue();
                break;
            case 8:
                this.mFloatValue = ((java.lang.Float) value).floatValue();
                break;
        }
    }

    public static java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> extractAttributes(java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> base, android.view.View view) {
        java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> hashMap = new java.util.HashMap<>();
        java.lang.Class<?> cls = view.getClass();
        for (java.lang.String str : base.keySet()) {
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = base.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap.put(str, new androidx.constraintlayout.widget.ConstraintAttribute(constraintAttribute, java.lang.Integer.valueOf(((android.graphics.drawable.ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap.put(str, new androidx.constraintlayout.widget.ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new java.lang.Class[0]).invoke(view, new java.lang.Object[0])));
                }
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
            } catch (java.lang.NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap;
    }

    public static void setAttributes(android.view.View view, java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> map) {
        java.lang.Class<?> cls = view.getClass();
        for (java.lang.String str : map.keySet()) {
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = map.get(str);
            java.lang.String str2 = constraintAttribute.mMethod ? str : "set" + str;
            try {
                switch (androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[constraintAttribute.mType.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                    case 2:
                        cls.getMethod(str2, java.lang.Boolean.TYPE).invoke(view, java.lang.Boolean.valueOf(constraintAttribute.mBooleanValue));
                        break;
                    case 3:
                        cls.getMethod(str2, java.lang.CharSequence.class).invoke(view, constraintAttribute.mStringValue);
                        break;
                    case 4:
                        cls.getMethod(str2, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(constraintAttribute.mColorValue));
                        break;
                    case 5:
                        java.lang.reflect.Method method = cls.getMethod(str2, android.graphics.drawable.Drawable.class);
                        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.mColorValue);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                    case 7:
                        cls.getMethod(str2, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                    case 8:
                        cls.getMethod(str2, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                }
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.e(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e.printStackTrace();
            } catch (java.lang.NoSuchMethodException e2) {
                android.util.Log.e(TAG, e2.getMessage());
                android.util.Log.e(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                android.util.Log.e(TAG, sb.toString());
            } catch (java.lang.reflect.InvocationTargetException e3) {
                android.util.Log.e(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    public void applyCustom(android.view.View view) {
        java.lang.String str;
        java.lang.Class<?> cls = view.getClass();
        java.lang.String str2 = this.mName;
        if (this.mMethod) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            switch (androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(this.mIntegerValue));
                    break;
                case 2:
                    cls.getMethod(str, java.lang.Boolean.TYPE).invoke(view, java.lang.Boolean.valueOf(this.mBooleanValue));
                    break;
                case 3:
                    cls.getMethod(str, java.lang.CharSequence.class).invoke(view, this.mStringValue);
                    break;
                case 4:
                    cls.getMethod(str, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(this.mColorValue));
                    break;
                case 5:
                    java.lang.reflect.Method method = cls.getMethod(str, android.graphics.drawable.Drawable.class);
                    android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                    colorDrawable.setColor(this.mColorValue);
                    method.invoke(view, colorDrawable);
                    break;
                case 7:
                    cls.getMethod(str, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(this.mFloatValue));
                    break;
                case 8:
                    cls.getMethod(str, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(this.mFloatValue));
                    break;
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.e(TAG, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e.printStackTrace();
        } catch (java.lang.NoSuchMethodException e2) {
            android.util.Log.e(TAG, e2.getMessage());
            android.util.Log.e(TAG, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls.getName());
            sb.append(" must have a method ");
            sb.append(str);
            android.util.Log.e(TAG, sb.toString());
        } catch (java.lang.reflect.InvocationTargetException e3) {
            android.util.Log.e(TAG, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e3.printStackTrace();
        }
    }

    public static void parse(android.content.Context context, org.xmlpull.v1.XmlPullParser parser, java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> custom) {
        androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType;
        java.lang.Object valueOf;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(parser), androidx.constraintlayout.widget.R.styleable.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        java.lang.String str = null;
        java.lang.Object obj = null;
        androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = java.lang.Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customBoolean) {
                obj = java.lang.Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customColorValue) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE;
                    valueOf = java.lang.Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customColorDrawableValue) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = java.lang.Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customPixelDimension) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE;
                    valueOf = java.lang.Float.valueOf(android.util.TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customDimension) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE;
                    valueOf = java.lang.Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customFloatValue) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE;
                    valueOf = java.lang.Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customIntegerValue) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE;
                    valueOf = java.lang.Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customStringValue) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customReference) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = java.lang.Integer.valueOf(resourceId);
                }
                java.lang.Object obj2 = valueOf;
                attributeType2 = attributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            custom.put(str, new androidx.constraintlayout.widget.ConstraintAttribute(str, attributeType2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }
}
