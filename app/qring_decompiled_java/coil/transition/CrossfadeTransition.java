package coil.transition;

/* compiled from: CrossfadeTransition.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcoil/transition/CrossfadeTransition;", "Lcoil/transition/Transition;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lcoil/transition/TransitionTarget;", "result", "Lcoil/request/ImageResult;", "durationMillis", "", "preferExactIntrinsicSize", "", "(Lcoil/transition/TransitionTarget;Lcoil/request/ImageResult;IZ)V", "getDurationMillis", "()I", "getPreferExactIntrinsicSize", "()Z", "transition", "", "Factory", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CrossfadeTransition implements coil.transition.Transition {
    private final int durationMillis;
    private final boolean preferExactIntrinsicSize;
    private final coil.request.ImageResult result;
    private final coil.transition.TransitionTarget target;

    public CrossfadeTransition(coil.transition.TransitionTarget transitionTarget, coil.request.ImageResult imageResult) {
        this(transitionTarget, imageResult, 0, false, 12, null);
    }

    public CrossfadeTransition(coil.transition.TransitionTarget transitionTarget, coil.request.ImageResult imageResult, int i) {
        this(transitionTarget, imageResult, i, false, 8, null);
    }

    public CrossfadeTransition(coil.transition.TransitionTarget transitionTarget, coil.request.ImageResult imageResult, int i, boolean z) {
        this.target = transitionTarget;
        this.result = imageResult;
        this.durationMillis = i;
        this.preferExactIntrinsicSize = z;
        if (!(i > 0)) {
            throw new java.lang.IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    public /* synthetic */ CrossfadeTransition(coil.transition.TransitionTarget transitionTarget, coil.request.ImageResult imageResult, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(transitionTarget, imageResult, (i2 & 4) != 0 ? 100 : i, (i2 & 8) != 0 ? false : z);
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }

    @Override // coil.transition.Transition
    public void transition() {
        android.graphics.drawable.Drawable drawable = this.target.getDrawable();
        android.graphics.drawable.Drawable drawable2 = this.result.getDrawable();
        coil.size.Scale scale = this.result.getRequest().getScale();
        int i = this.durationMillis;
        coil.request.ImageResult imageResult = this.result;
        coil.drawable.CrossfadeDrawable crossfadeDrawable = new coil.drawable.CrossfadeDrawable(drawable, drawable2, scale, i, ((imageResult instanceof coil.request.SuccessResult) && ((coil.request.SuccessResult) imageResult).getIsPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        coil.request.ImageResult imageResult2 = this.result;
        if (imageResult2 instanceof coil.request.SuccessResult) {
            this.target.onSuccess(crossfadeDrawable);
        } else if (imageResult2 instanceof coil.request.ErrorResult) {
            this.target.onError(crossfadeDrawable);
        }
    }

    /* compiled from: CrossfadeTransition.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcoil/transition/CrossfadeTransition$Factory;", "Lcoil/transition/Transition$Factory;", "durationMillis", "", "preferExactIntrinsicSize", "", "(IZ)V", "getDurationMillis", "()I", "getPreferExactIntrinsicSize", "()Z", "create", "Lcoil/transition/Transition;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lcoil/transition/TransitionTarget;", "result", "Lcoil/request/ImageResult;", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Factory implements coil.transition.Transition.Factory {
        private final int durationMillis;
        private final boolean preferExactIntrinsicSize;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public Factory(int i) {
            this(i, false, 2, null);
        }

        public Factory(int i, boolean z) {
            this.durationMillis = i;
            this.preferExactIntrinsicSize = z;
            if (!(i > 0)) {
                throw new java.lang.IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }

        public /* synthetic */ Factory(int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? false : z);
        }

        public final int getDurationMillis() {
            return this.durationMillis;
        }

        public final boolean getPreferExactIntrinsicSize() {
            return this.preferExactIntrinsicSize;
        }

        @Override // coil.transition.Transition.Factory
        public coil.transition.Transition create(coil.transition.TransitionTarget target, coil.request.ImageResult result) {
            if (!(result instanceof coil.request.SuccessResult)) {
                return coil.transition.Transition.Factory.NONE.create(target, result);
            }
            if (((coil.request.SuccessResult) result).getDataSource() == coil.decode.DataSource.MEMORY_CACHE) {
                return coil.transition.Transition.Factory.NONE.create(target, result);
            }
            return new coil.transition.CrossfadeTransition(target, result, this.durationMillis, this.preferExactIntrinsicSize);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof coil.transition.CrossfadeTransition.Factory) {
                coil.transition.CrossfadeTransition.Factory factory = (coil.transition.CrossfadeTransition.Factory) other;
                if (this.durationMillis == factory.durationMillis && this.preferExactIntrinsicSize == factory.preferExactIntrinsicSize) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.durationMillis * 31) + coil.decode.DecodeResult$$ExternalSyntheticBackport0.m(this.preferExactIntrinsicSize);
        }
    }
}
