package com.yalantis.ucrop.util;

/* loaded from: classes3.dex */
public class SelectedStateListDrawable extends android.graphics.drawable.StateListDrawable {
    private int mSelectionColor;

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public SelectedStateListDrawable(android.graphics.drawable.Drawable drawable, int i) {
        this.mSelectionColor = i;
        addState(new int[]{android.R.attr.state_selected}, drawable);
        addState(new int[0], drawable);
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842913) {
                z = true;
            }
        }
        if (z) {
            super.setColorFilter(this.mSelectionColor, android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            super.clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
