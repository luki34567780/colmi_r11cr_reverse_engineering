package io.fotoapparat.view;

/* compiled from: FeedbackCircleView.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0019R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/fotoapparat/view/FeedbackCircleView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animatorSet", "Landroid/animation/AnimatorSet;", "inner", "Landroid/widget/ImageView;", "outer", "newAnimator", "Landroid/animation/Animator;", "kotlin.jvm.PlatformType", com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Landroid/view/View;", "showAt", "", "x", "", "y", "showAt$fotoapparat_release", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class FeedbackCircleView extends android.widget.FrameLayout {
    private final android.animation.AnimatorSet animatorSet;
    private final android.widget.ImageView inner;
    private final android.widget.ImageView outer;

    public FeedbackCircleView(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    public FeedbackCircleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FeedbackCircleView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.view.FeedbackCircleView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackCircleView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        android.widget.ImageView imageView = new android.widget.ImageView(context, attributeSet, i);
        imageView.setImageResource(io.fotoapparat.R.drawable.focus_inner);
        context.getResources();
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        imageView.setAlpha(0.0f);
        this.inner = imageView;
        android.widget.ImageView imageView2 = new android.widget.ImageView(context, attributeSet, i);
        imageView2.setImageResource(io.fotoapparat.R.drawable.focus_outer);
        context.getResources();
        imageView2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        imageView2.setAlpha(0.0f);
        this.outer = imageView2;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(newAnimator(io.fotoapparat.R.animator.focus_outer, imageView2), newAnimator(io.fotoapparat.R.animator.focus_inner, imageView));
        this.animatorSet = animatorSet;
        android.content.res.Resources resources = context.getResources();
        setLayoutParams(new android.view.ViewGroup.LayoutParams(resources.getDimensionPixelSize(io.fotoapparat.R.dimen.focus_diameter), resources.getDimensionPixelSize(io.fotoapparat.R.dimen.focus_diameter)));
        setClipToPadding(false);
        setClipChildren(false);
        addView(imageView2);
        addView(imageView);
    }

    public final void showAt$fotoapparat_release(float x, float y) {
        setTranslationX(x);
        setTranslationY(y);
        this.animatorSet.cancel();
        this.animatorSet.start();
    }

    private final android.animation.Animator newAnimator(int id, android.view.View target) {
        android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(getContext(), id);
        loadAnimator.setTarget(target);
        return loadAnimator;
    }
}
