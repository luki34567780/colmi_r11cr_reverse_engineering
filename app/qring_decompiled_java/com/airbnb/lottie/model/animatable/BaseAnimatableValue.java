package com.airbnb.lottie.model.animatable;

/* loaded from: classes.dex */
abstract class BaseAnimatableValue<V, O> implements com.airbnb.lottie.model.animatable.AnimatableValue<V, O> {
    final java.util.List<com.airbnb.lottie.value.Keyframe<V>> keyframes;

    BaseAnimatableValue(V v) {
        this(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(v)));
    }

    BaseAnimatableValue(java.util.List<com.airbnb.lottie.value.Keyframe<V>> list) {
        this.keyframes = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public java.util.List<com.airbnb.lottie.value.Keyframe<V>> getKeyframes() {
        return this.keyframes;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        return this.keyframes.isEmpty() || (this.keyframes.size() == 1 && this.keyframes.get(0).isStatic());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!this.keyframes.isEmpty()) {
            sb.append("values=");
            sb.append(java.util.Arrays.toString(this.keyframes.toArray()));
        }
        return sb.toString();
    }
}
