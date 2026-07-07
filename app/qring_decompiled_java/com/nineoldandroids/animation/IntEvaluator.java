package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
public class IntEvaluator implements com.nineoldandroids.animation.TypeEvaluator<java.lang.Integer> {
    @Override // com.nineoldandroids.animation.TypeEvaluator
    public java.lang.Integer evaluate(float f, java.lang.Integer num, java.lang.Integer num2) {
        return java.lang.Integer.valueOf((int) (num.intValue() + (f * (num2.intValue() - r3))));
    }
}
