package coil.target;

/* compiled from: ImageViewTarget.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcoil/target/ImageViewTarget;", "Lcoil/target/GenericViewTarget;", "Landroid/widget/ImageView;", "view", "(Landroid/widget/ImageView;)V", "value", "Landroid/graphics/drawable/Drawable;", "drawable", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "getView", "()Landroid/widget/ImageView;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public class ImageViewTarget extends coil.target.GenericViewTarget<android.widget.ImageView> {
    private final android.widget.ImageView view;

    public ImageViewTarget(android.widget.ImageView imageView) {
        this.view = imageView;
    }

    @Override // coil.target.ViewTarget, coil.transition.TransitionTarget
    public android.widget.ImageView getView() {
        return this.view;
    }

    @Override // coil.target.GenericViewTarget, coil.transition.TransitionTarget
    public android.graphics.drawable.Drawable getDrawable() {
        return getView().getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public void setDrawable(android.graphics.drawable.Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof coil.target.ImageViewTarget) && kotlin.jvm.internal.Intrinsics.areEqual(getView(), ((coil.target.ImageViewTarget) other).getView());
    }

    public int hashCode() {
        return getView().hashCode();
    }
}
