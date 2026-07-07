package coil.target;

/* compiled from: ViewTarget.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/target/ViewTarget;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "Lcoil/target/Target;", "view", "getView", "()Landroid/view/View;", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ViewTarget<T extends android.view.View> extends coil.target.Target {
    T getView();

    /* compiled from: ViewTarget.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends android.view.View> void onError(coil.target.ViewTarget<T> viewTarget, android.graphics.drawable.Drawable drawable) {
            coil.target.Target.DefaultImpls.onError(viewTarget, drawable);
        }

        public static <T extends android.view.View> void onStart(coil.target.ViewTarget<T> viewTarget, android.graphics.drawable.Drawable drawable) {
            coil.target.Target.DefaultImpls.onStart(viewTarget, drawable);
        }

        public static <T extends android.view.View> void onSuccess(coil.target.ViewTarget<T> viewTarget, android.graphics.drawable.Drawable drawable) {
            coil.target.Target.DefaultImpls.onSuccess(viewTarget, drawable);
        }
    }
}
