package com.chad.library.adapter.base.animation;

/* compiled from: ScaleInAnimation.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/chad/library/adapter/base/animation/ScaleInAnimation;", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "mFrom", "", "(F)V", "animators", "", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "(Landroid/view/View;)[Landroid/animation/Animator;", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ScaleInAnimation implements com.chad.library.adapter.base.animation.BaseAnimation {
    private static final float DEFAULT_SCALE_FROM = 0.5f;
    private final float mFrom;

    public ScaleInAnimation() {
        this(0.0f, 1, null);
    }

    public ScaleInAnimation(float f) {
        this.mFrom = f;
    }

    public /* synthetic */ ScaleInAnimation(float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_SCALE_FROM : f);
    }

    @Override // com.chad.library.adapter.base.animation.BaseAnimation
    public android.animation.Animator[] animators(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", this.mFrom, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", this.mFrom, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(new android.view.animation.DecelerateInterpolator());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofFloat, "scaleX");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofFloat2, "scaleY");
        return new android.animation.Animator[]{ofFloat, ofFloat2};
    }
}
