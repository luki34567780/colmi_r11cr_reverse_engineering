package com.luck.picture.lib.animators;

/* loaded from: /tmp/dex/classes2.dex */
public class SlideInBottomAnimationAdapter extends com.luck.picture.lib.animators.BaseAnimationAdapter {
    public SlideInBottomAnimationAdapter(androidx.recyclerview.widget.RecyclerView.Adapter adapter) {
        super(adapter);
    }

    @Override // com.luck.picture.lib.animators.BaseAnimationAdapter
    protected android.animation.Animator[] getAnimators(android.view.View view) {
        return new android.animation.Animator[]{android.animation.ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0.0f)};
    }
}
