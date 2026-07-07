package coil.drawable;

/* compiled from: CrossfadeDrawable.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001XBC\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\b\u0010\"\u001a\u00020#H\u0016J!\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\tH\u0016J\n\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\tH\u0016J\b\u0010/\u001a\u00020\tH\u0016J\b\u00100\u001a\u00020\tH\u0017J\u0010\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u0001H\u0016J\b\u00103\u001a\u00020\u000bH\u0016J\b\u00104\u001a\u00020#H\u0002J\u0010\u00105\u001a\u00020#2\u0006\u00106\u001a\u000207H\u0014J\u0010\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\tH\u0014J\u0010\u0010:\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020;H\u0014J\u0010\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020\u0010H\u0016J \u0010>\u001a\u00020#2\u0006\u00102\u001a\u00020\u00012\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020 H\u0016J\u0010\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020\tH\u0016J\u0012\u0010D\u001a\u00020#2\b\u0010E\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010F\u001a\u00020#2\u0006\u0010G\u001a\u00020\tH\u0016J\u0012\u0010H\u001a\u00020#2\b\u0010I\u001a\u0004\u0018\u00010JH\u0017J\u0012\u0010K\u001a\u00020#2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0012\u0010N\u001a\u00020#2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010\u0004\u001a\u00020#H\u0016J\b\u0010Q\u001a\u00020#H\u0016J\u0010\u0010R\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u0010H\u0016J\u0018\u0010S\u001a\u00020#2\u0006\u00102\u001a\u00020\u00012\u0006\u0010?\u001a\u00020@H\u0016J\u001d\u0010T\u001a\u00020#2\u0006\u0010U\u001a\u00020\u00012\u0006\u0010V\u001a\u000207H\u0001¢\u0006\u0002\bWR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcoil/drawable/CrossfadeDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;", "start", "end", "scale", "Lcoil/size/Scale;", "durationMillis", "", "fadeStart", "", "preferExactIntrinsicSize", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/size/Scale;IZZ)V", "callbacks", "", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "getDurationMillis", "()I", "getEnd", "()Landroid/graphics/drawable/Drawable;", "getFadeStart", "()Z", "intrinsicHeight", "intrinsicWidth", "maxAlpha", "getPreferExactIntrinsicSize", "getScale", "()Lcoil/size/Scale;", "<set-?>", "getStart", "startTimeMillis", "", "state", "clearAnimationCallbacks", "", "computeIntrinsicDimension", "startSize", "endSize", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "draw", "canvas", "Landroid/graphics/Canvas;", "getAlpha", "getColorFilter", "Landroid/graphics/ColorFilter;", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "invalidateDrawable", "who", "isRunning", "markDone", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "onLevelChange", "level", "onStateChange", "", "registerAnimationCallback", "callback", "scheduleDrawable", "what", "Ljava/lang/Runnable;", "when", "setAlpha", "alpha", "setColorFilter", "colorFilter", "setTint", "tintColor", "setTintBlendMode", "blendMode", "Landroid/graphics/BlendMode;", "setTintList", "tint", "Landroid/content/res/ColorStateList;", "setTintMode", "tintMode", "Landroid/graphics/PorterDuff$Mode;", "stop", "unregisterAnimationCallback", "unscheduleDrawable", "updateBounds", "drawable", "targetBounds", "updateBounds$coil_base_release", "Companion", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CrossfadeDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    public static final int DEFAULT_DURATION = 100;
    private static final int STATE_DONE = 2;
    private static final int STATE_RUNNING = 1;
    private static final int STATE_START = 0;
    private final java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> callbacks;
    private final int durationMillis;
    private final android.graphics.drawable.Drawable end;
    private final boolean fadeStart;
    private final int intrinsicHeight;
    private final int intrinsicWidth;
    private int maxAlpha;
    private final boolean preferExactIntrinsicSize;
    private final coil.size.Scale scale;
    private android.graphics.drawable.Drawable start;
    private long startTimeMillis;
    private int state;

    public CrossfadeDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this(drawable, drawable2, null, 0, false, false, 60, null);
    }

    public CrossfadeDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, coil.size.Scale scale) {
        this(drawable, drawable2, scale, 0, false, false, 56, null);
    }

    public CrossfadeDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, coil.size.Scale scale, int i) {
        this(drawable, drawable2, scale, i, false, false, 48, null);
    }

    public CrossfadeDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, coil.size.Scale scale, int i, boolean z) {
        this(drawable, drawable2, scale, i, z, false, 32, null);
    }

    public /* synthetic */ CrossfadeDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, coil.size.Scale scale, int i, boolean z, boolean z2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, drawable2, (i2 & 4) != 0 ? coil.size.Scale.FIT : scale, (i2 & 8) != 0 ? 100 : i, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? false : z2);
    }

    public final coil.size.Scale getScale() {
        return this.scale;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final boolean getFadeStart() {
        return this.fadeStart;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }

    public CrossfadeDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, coil.size.Scale scale, int i, boolean z, boolean z2) {
        this.scale = scale;
        this.durationMillis = i;
        this.fadeStart = z;
        this.preferExactIntrinsicSize = z2;
        this.callbacks = new java.util.ArrayList();
        this.intrinsicWidth = computeIntrinsicDimension(drawable == null ? null : java.lang.Integer.valueOf(drawable.getIntrinsicWidth()), drawable2 == null ? null : java.lang.Integer.valueOf(drawable2.getIntrinsicWidth()));
        this.intrinsicHeight = computeIntrinsicDimension(drawable == null ? null : java.lang.Integer.valueOf(drawable.getIntrinsicHeight()), drawable2 == null ? null : java.lang.Integer.valueOf(drawable2.getIntrinsicHeight()));
        this.maxAlpha = 255;
        this.start = drawable == null ? null : drawable.mutate();
        android.graphics.drawable.Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.end = mutate;
        if (!(i > 0)) {
            throw new java.lang.IllegalArgumentException("durationMillis must be > 0.".toString());
        }
        android.graphics.drawable.Drawable drawable3 = this.start;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (mutate == null) {
            return;
        }
        mutate.setCallback(this);
    }

    public final android.graphics.drawable.Drawable getStart() {
        return this.start;
    }

    public final android.graphics.drawable.Drawable getEnd() {
        return this.end;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int save;
        android.graphics.drawable.Drawable drawable;
        int i = this.state;
        if (i == 0) {
            android.graphics.drawable.Drawable drawable2 = this.start;
            if (drawable2 == null) {
                return;
            }
            drawable2.setAlpha(this.maxAlpha);
            save = canvas.save();
            try {
                drawable2.draw(canvas);
                return;
            } finally {
            }
        }
        if (i == 2) {
            android.graphics.drawable.Drawable drawable3 = this.end;
            if (drawable3 == null) {
                return;
            }
            drawable3.setAlpha(this.maxAlpha);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
                return;
            } finally {
            }
        }
        double uptimeMillis = (android.os.SystemClock.uptimeMillis() - this.startTimeMillis) / this.durationMillis;
        double coerceIn = kotlin.ranges.RangesKt.coerceIn(uptimeMillis, 0.0d, 1.0d);
        int i2 = this.maxAlpha;
        int i3 = (int) (coerceIn * i2);
        if (this.fadeStart) {
            i2 -= i3;
        }
        boolean z = uptimeMillis >= 1.0d;
        if (!z && (drawable = this.start) != null) {
            drawable.setAlpha(i2);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        android.graphics.drawable.Drawable drawable4 = this.end;
        if (drawable4 != null) {
            drawable4.setAlpha(i3);
            save = canvas.save();
            try {
                drawable4.draw(canvas);
            } finally {
            }
        }
        if (z) {
            markDone();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.maxAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        boolean z = false;
        if (alpha >= 0 && alpha < 256) {
            z = true;
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("Invalid alpha: ", java.lang.Integer.valueOf(alpha)).toString());
        }
        this.maxAlpha = alpha;
    }

    @Override // android.graphics.drawable.Drawable
    @kotlin.Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.start;
        android.graphics.drawable.Drawable drawable2 = this.end;
        int i = this.state;
        if (i == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        }
        if (i == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        }
        if (drawable != null && drawable2 != null) {
            return android.graphics.drawable.Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        android.graphics.drawable.Drawable drawable;
        int i = this.state;
        if (i == 0) {
            android.graphics.drawable.Drawable drawable2 = this.start;
            if (drawable2 == null) {
                return null;
            }
            return drawable2.getColorFilter();
        }
        if (i != 1) {
            if (i == 2 && (drawable = this.end) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        android.graphics.drawable.Drawable drawable3 = this.end;
        android.graphics.ColorFilter colorFilter = drawable3 == null ? null : drawable3.getColorFilter();
        if (colorFilter != null) {
            return colorFilter;
        }
        android.graphics.drawable.Drawable drawable4 = this.start;
        if (drawable4 == null) {
            return null;
        }
        return drawable4.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        android.graphics.drawable.Drawable drawable2 = this.end;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect bounds) {
        android.graphics.drawable.Drawable drawable = this.start;
        if (drawable != null) {
            updateBounds$coil_base_release(drawable, bounds);
        }
        android.graphics.drawable.Drawable drawable2 = this.end;
        if (drawable2 == null) {
            return;
        }
        updateBounds$coil_base_release(drawable2, bounds);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int level) {
        android.graphics.drawable.Drawable drawable = this.start;
        boolean level2 = drawable == null ? false : drawable.setLevel(level);
        android.graphics.drawable.Drawable drawable2 = this.end;
        return level2 || (drawable2 == null ? false : drawable2.setLevel(level));
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        android.graphics.drawable.Drawable drawable = this.start;
        boolean state2 = drawable == null ? false : drawable.setState(state);
        android.graphics.drawable.Drawable drawable2 = this.end;
        return state2 || (drawable2 == null ? false : drawable2.setState(state));
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.intrinsicWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.intrinsicHeight;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what) {
        unscheduleSelf(what);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable who) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what, long when) {
        scheduleSelf(what, when);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int tintColor) {
        android.graphics.drawable.Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTint(tintColor);
        }
        android.graphics.drawable.Drawable drawable2 = this.end;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTint(tintColor);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList tint) {
        android.graphics.drawable.Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintList(tint);
        }
        android.graphics.drawable.Drawable drawable2 = this.end;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintList(tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode tintMode) {
        android.graphics.drawable.Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintMode(tintMode);
        }
        android.graphics.drawable.Drawable drawable2 = this.end;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintMode(tintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(android.graphics.BlendMode blendMode) {
        android.graphics.drawable.Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        android.graphics.drawable.Drawable drawable2 = this.end;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.state == 1;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        java.lang.Object obj = this.start;
        android.graphics.drawable.Animatable animatable = obj instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        java.lang.Object obj2 = this.end;
        android.graphics.drawable.Animatable animatable2 = obj2 instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.state != 0) {
            return;
        }
        this.state = 1;
        this.startTimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> list = this.callbacks;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        java.lang.Object obj = this.start;
        android.graphics.drawable.Animatable animatable = obj instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        java.lang.Object obj2 = this.end;
        android.graphics.drawable.Animatable animatable2 = obj2 instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.state != 2) {
            markDone();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback callback) {
        this.callbacks.add(callback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback callback) {
        return this.callbacks.remove(callback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.callbacks.clear();
    }

    public final void updateBounds$coil_base_release(android.graphics.drawable.Drawable drawable, android.graphics.Rect targetBounds) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(targetBounds);
            return;
        }
        int width = targetBounds.width();
        int height = targetBounds.height();
        double computeSizeMultiplier = coil.decode.DecodeUtils.computeSizeMultiplier(intrinsicWidth, intrinsicHeight, width, height, this.scale);
        double d = 2;
        int roundToInt = kotlin.math.MathKt.roundToInt((width - (intrinsicWidth * computeSizeMultiplier)) / d);
        int roundToInt2 = kotlin.math.MathKt.roundToInt((height - (computeSizeMultiplier * intrinsicHeight)) / d);
        drawable.setBounds(targetBounds.left + roundToInt, targetBounds.top + roundToInt2, targetBounds.right - roundToInt, targetBounds.bottom - roundToInt2);
    }

    private final int computeIntrinsicDimension(java.lang.Integer startSize, java.lang.Integer endSize) {
        if (this.preferExactIntrinsicSize || ((startSize == null || startSize.intValue() != -1) && (endSize == null || endSize.intValue() != -1))) {
            return java.lang.Math.max(startSize == null ? -1 : startSize.intValue(), endSize != null ? endSize.intValue() : -1);
        }
        return -1;
    }

    private final void markDone() {
        this.state = 2;
        this.start = null;
        java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> list = this.callbacks;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onAnimationEnd(this);
        }
    }
}
