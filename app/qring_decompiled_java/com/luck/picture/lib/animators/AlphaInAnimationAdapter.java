package com.luck.picture.lib.animators;

/* loaded from: /tmp/dex/classes2.dex */
public class AlphaInAnimationAdapter extends com.luck.picture.lib.animators.BaseAnimationAdapter {
    private static final float DEFAULT_ALPHA_FROM = 0.0f;
    private final float mFrom;

    public AlphaInAnimationAdapter(androidx.recyclerview.widget.RecyclerView.Adapter adapter) {
        this(adapter, 0.0f);
    }

    public AlphaInAnimationAdapter(androidx.recyclerview.widget.RecyclerView.Adapter adapter, float f) {
        super(adapter);
        this.mFrom = f;
    }

    @Override // com.luck.picture.lib.animators.BaseAnimationAdapter
    protected android.animation.Animator[] getAnimators(android.view.View view) {
        return new android.animation.Animator[]{android.animation.ObjectAnimator.ofFloat(view, "alpha", this.mFrom, 1.0f)};
    }
}
