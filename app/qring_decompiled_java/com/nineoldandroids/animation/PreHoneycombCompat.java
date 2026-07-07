package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
final class PreHoneycombCompat {
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> ALPHA = new com.nineoldandroids.util.FloatProperty<android.view.View>("alpha") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.1
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setAlpha(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getAlpha());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> PIVOT_X = new com.nineoldandroids.util.FloatProperty<android.view.View>("pivotX") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.2
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setPivotX(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getPivotX());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> PIVOT_Y = new com.nineoldandroids.util.FloatProperty<android.view.View>("pivotY") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.3
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setPivotY(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getPivotY());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> TRANSLATION_X = new com.nineoldandroids.util.FloatProperty<android.view.View>("translationX") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.4
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setTranslationX(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getTranslationX());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> TRANSLATION_Y = new com.nineoldandroids.util.FloatProperty<android.view.View>("translationY") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.5
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setTranslationY(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getTranslationY());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> ROTATION = new com.nineoldandroids.util.FloatProperty<android.view.View>("rotation") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.6
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setRotation(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getRotation());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> ROTATION_X = new com.nineoldandroids.util.FloatProperty<android.view.View>("rotationX") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.7
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setRotationX(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getRotationX());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> ROTATION_Y = new com.nineoldandroids.util.FloatProperty<android.view.View>("rotationY") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.8
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setRotationY(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getRotationY());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> SCALE_X = new com.nineoldandroids.util.FloatProperty<android.view.View>("scaleX") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.9
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setScaleX(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getScaleX());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> SCALE_Y = new com.nineoldandroids.util.FloatProperty<android.view.View>("scaleY") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.10
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setScaleY(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getScaleY());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Integer> SCROLL_X = new com.nineoldandroids.util.IntProperty<android.view.View>("scrollX") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.11
        @Override // com.nineoldandroids.util.IntProperty
        public void setValue(android.view.View view, int i) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setScrollX(i);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Integer get(android.view.View view) {
            return java.lang.Integer.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getScrollX());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Integer> SCROLL_Y = new com.nineoldandroids.util.IntProperty<android.view.View>("scrollY") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.12
        @Override // com.nineoldandroids.util.IntProperty
        public void setValue(android.view.View view, int i) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setScrollY(i);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Integer get(android.view.View view) {
            return java.lang.Integer.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getScrollY());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> X = new com.nineoldandroids.util.FloatProperty<android.view.View>("x") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.13
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setX(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getX());
        }
    };
    static com.nineoldandroids.util.Property<android.view.View, java.lang.Float> Y = new com.nineoldandroids.util.FloatProperty<android.view.View>("y") { // from class: com.nineoldandroids.animation.PreHoneycombCompat.14
        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(android.view.View view, float f) {
            com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).setY(f);
        }

        @Override // com.nineoldandroids.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(com.nineoldandroids.view.animation.AnimatorProxy.wrap(view).getY());
        }
    };

    private PreHoneycombCompat() {
    }
}
