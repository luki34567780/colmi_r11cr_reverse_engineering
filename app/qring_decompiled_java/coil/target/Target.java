package coil.target;

/* compiled from: Target.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0017J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0017J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0017¨\u0006\n"}, d2 = {"Lcoil/target/Target;", "", "onError", "", "error", "Landroid/graphics/drawable/Drawable;", "onStart", "placeholder", "onSuccess", "result", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Target {

    /* compiled from: Target.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onError(coil.target.Target target, android.graphics.drawable.Drawable drawable) {
        }

        public static void onStart(coil.target.Target target, android.graphics.drawable.Drawable drawable) {
        }

        public static void onSuccess(coil.target.Target target, android.graphics.drawable.Drawable drawable) {
        }
    }

    void onError(android.graphics.drawable.Drawable error);

    void onStart(android.graphics.drawable.Drawable placeholder);

    void onSuccess(android.graphics.drawable.Drawable result);
}
