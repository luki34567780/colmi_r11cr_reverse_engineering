package coil.request;

/* compiled from: ImageRequest.kt */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"coil/request/ImageRequest$Builder$target$4", "Lcoil/target/Target;", "onError", "", "error", "Landroid/graphics/drawable/Drawable;", "onStart", "placeholder", "onSuccess", "result", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ImageRequest$Builder$target$4 implements coil.target.Target {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.graphics.drawable.Drawable, kotlin.Unit> $onError;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.graphics.drawable.Drawable, kotlin.Unit> $onStart;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.graphics.drawable.Drawable, kotlin.Unit> $onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageRequest$Builder$target$4(kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> function13) {
        this.$onStart = function1;
        this.$onError = function12;
        this.$onSuccess = function13;
    }

    @Override // coil.target.Target
    public void onStart(android.graphics.drawable.Drawable placeholder) {
        this.$onStart.invoke(placeholder);
    }

    @Override // coil.target.Target
    public void onError(android.graphics.drawable.Drawable error) {
        this.$onError.invoke(error);
    }

    @Override // coil.target.Target
    public void onSuccess(android.graphics.drawable.Drawable result) {
        this.$onSuccess.invoke(result);
    }
}
