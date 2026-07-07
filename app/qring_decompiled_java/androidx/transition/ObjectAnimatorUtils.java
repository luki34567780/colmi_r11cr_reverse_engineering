package androidx.transition;

/* loaded from: classes.dex */
class ObjectAnimatorUtils {
    static <T> android.animation.ObjectAnimator ofPointF(T t, android.util.Property<T, android.graphics.PointF> property, android.graphics.Path path) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return android.animation.ObjectAnimator.ofObject(t, property, (android.animation.TypeConverter) null, path);
        }
        return android.animation.ObjectAnimator.ofFloat(t, new androidx.transition.PathProperty(property, path), 0.0f, 1.0f);
    }

    private ObjectAnimatorUtils() {
    }
}
