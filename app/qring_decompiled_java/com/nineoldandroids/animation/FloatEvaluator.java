package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
public class FloatEvaluator implements com.nineoldandroids.animation.TypeEvaluator<java.lang.Number> {
    @Override // com.nineoldandroids.animation.TypeEvaluator
    public java.lang.Float evaluate(float f, java.lang.Number number, java.lang.Number number2) {
        float floatValue = number.floatValue();
        return java.lang.Float.valueOf(floatValue + (f * (number2.floatValue() - floatValue)));
    }
}
