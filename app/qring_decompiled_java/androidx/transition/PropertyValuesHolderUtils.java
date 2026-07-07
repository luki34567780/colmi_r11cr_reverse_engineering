package androidx.transition;

/* loaded from: classes.dex */
class PropertyValuesHolderUtils {
    static android.animation.PropertyValuesHolder ofPointF(android.util.Property<?, android.graphics.PointF> property, android.graphics.Path path) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return android.animation.PropertyValuesHolder.ofObject(property, (android.animation.TypeConverter) null, path);
        }
        return android.animation.PropertyValuesHolder.ofFloat(new androidx.transition.PathProperty(property, path), 0.0f, 1.0f);
    }

    private PropertyValuesHolderUtils() {
    }
}
