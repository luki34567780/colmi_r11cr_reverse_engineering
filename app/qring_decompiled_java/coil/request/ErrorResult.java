package coil.request;

/* compiled from: ImageResult.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcoil/request/ErrorResult;", "Lcoil/request/ImageResult;", "drawable", "Landroid/graphics/drawable/Drawable;", "request", "Lcoil/request/ImageRequest;", "throwable", "", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Ljava/lang/Throwable;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getRequest", "()Lcoil/request/ImageRequest;", "getThrowable", "()Ljava/lang/Throwable;", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorResult extends coil.request.ImageResult {
    private final android.graphics.drawable.Drawable drawable;
    private final coil.request.ImageRequest request;
    private final java.lang.Throwable throwable;

    @Override // coil.request.ImageResult
    public android.graphics.drawable.Drawable getDrawable() {
        return this.drawable;
    }

    @Override // coil.request.ImageResult
    public coil.request.ImageRequest getRequest() {
        return this.request;
    }

    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public ErrorResult(android.graphics.drawable.Drawable drawable, coil.request.ImageRequest imageRequest, java.lang.Throwable th) {
        super(null);
        this.drawable = drawable;
        this.request = imageRequest;
        this.throwable = th;
    }

    public static /* synthetic */ coil.request.ErrorResult copy$default(coil.request.ErrorResult errorResult, android.graphics.drawable.Drawable drawable, coil.request.ImageRequest imageRequest, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            drawable = errorResult.getDrawable();
        }
        if ((i & 2) != 0) {
            imageRequest = errorResult.getRequest();
        }
        if ((i & 4) != 0) {
            th = errorResult.throwable;
        }
        return errorResult.copy(drawable, imageRequest, th);
    }

    public final coil.request.ErrorResult copy(android.graphics.drawable.Drawable drawable, coil.request.ImageRequest request, java.lang.Throwable throwable) {
        return new coil.request.ErrorResult(drawable, request, throwable);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof coil.request.ErrorResult) {
            coil.request.ErrorResult errorResult = (coil.request.ErrorResult) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(getDrawable(), errorResult.getDrawable()) && kotlin.jvm.internal.Intrinsics.areEqual(getRequest(), errorResult.getRequest()) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, errorResult.throwable)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        return ((((drawable == null ? 0 : drawable.hashCode()) * 31) + getRequest().hashCode()) * 31) + this.throwable.hashCode();
    }
}
