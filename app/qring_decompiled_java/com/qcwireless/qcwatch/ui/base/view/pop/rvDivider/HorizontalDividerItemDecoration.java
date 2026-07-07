package com.qcwireless.qcwatch.ui.base.view.pop.rvDivider;

/* loaded from: /tmp/dex/classes2.dex */
public class HorizontalDividerItemDecoration extends com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration {
    private com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.MarginProvider mMarginProvider;

    public interface MarginProvider {
        int dividerLeftMargin(int position, androidx.recyclerview.widget.RecyclerView parent);

        int dividerRightMargin(int position, androidx.recyclerview.widget.RecyclerView parent);
    }

    protected HorizontalDividerItemDecoration(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.Builder builder) {
        super(builder);
        this.mMarginProvider = builder.mMarginProvider;
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration
    protected android.graphics.Rect getDividerBound(int position, androidx.recyclerview.widget.RecyclerView parent, android.view.View child) {
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, 0, 0);
        int translationX = (int) androidx.core.view.ViewCompat.getTranslationX(child);
        int translationY = (int) androidx.core.view.ViewCompat.getTranslationY(child);
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = child.getLayoutParams();
        rect.left = parent.getPaddingLeft() + this.mMarginProvider.dividerLeftMargin(position, parent) + translationX;
        rect.right = ((parent.getWidth() - parent.getPaddingRight()) - this.mMarginProvider.dividerRightMargin(position, parent)) + translationX;
        int dividerSize = getDividerSize(position, parent);
        boolean isReverseLayout = isReverseLayout(parent);
        if (this.mDividerType != com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType.DRAWABLE) {
            int i = dividerSize / 2;
            if (isReverseLayout) {
                rect.top = ((child.getTop() - layoutParams.topMargin) - i) + translationY;
            } else {
                rect.top = child.getBottom() + layoutParams.bottomMargin + i + translationY;
            }
            rect.bottom = rect.top;
        } else if (isReverseLayout) {
            rect.bottom = (child.getTop() - layoutParams.topMargin) + translationY;
            rect.top = rect.bottom - dividerSize;
        } else {
            rect.top = child.getBottom() + layoutParams.bottomMargin + translationY;
            rect.bottom = rect.top + dividerSize;
        }
        if (this.mPositionInsideItem) {
            if (isReverseLayout) {
                rect.top += dividerSize;
                rect.bottom += dividerSize;
            } else {
                rect.top -= dividerSize;
                rect.bottom -= dividerSize;
            }
        }
        return rect;
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration
    protected void setItemOffsets(android.graphics.Rect outRect, int position, androidx.recyclerview.widget.RecyclerView parent) {
        if (this.mPositionInsideItem) {
            outRect.set(0, 0, 0, 0);
        } else if (isReverseLayout(parent)) {
            outRect.set(0, getDividerSize(position, parent), 0, 0);
        } else {
            outRect.set(0, 0, 0, getDividerSize(position, parent));
        }
    }

    private int getDividerSize(int position, androidx.recyclerview.widget.RecyclerView parent) {
        if (this.mPaintProvider != null) {
            return (int) this.mPaintProvider.dividerPaint(position, parent).getStrokeWidth();
        }
        if (this.mSizeProvider != null) {
            return this.mSizeProvider.dividerSize(position, parent);
        }
        if (this.mDrawableProvider != null) {
            return this.mDrawableProvider.drawableProvider(position, parent).getIntrinsicHeight();
        }
        throw new java.lang.RuntimeException("failed to get size");
    }

    public static class Builder extends com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.Builder<com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.Builder> {
        private com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.MarginProvider mMarginProvider;

        public Builder(android.content.Context context) {
            super(context);
            this.mMarginProvider = new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.MarginProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.Builder.1
                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.MarginProvider
                public int dividerLeftMargin(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return 0;
                }

                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.MarginProvider
                public int dividerRightMargin(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return 0;
                }
            };
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.Builder margin(final int leftMargin, final int rightMargin) {
            return marginProvider(new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.MarginProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.Builder.2
                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.MarginProvider
                public int dividerLeftMargin(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return leftMargin;
                }

                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.MarginProvider
                public int dividerRightMargin(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return rightMargin;
                }
            });
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.Builder margin(int horizontalMargin) {
            return margin(horizontalMargin, horizontalMargin);
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.Builder marginResId(int leftMarginId, int rightMarginId) {
            return margin(this.mResources.getDimensionPixelSize(leftMarginId), this.mResources.getDimensionPixelSize(rightMarginId));
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.Builder marginResId(int horizontalMarginId) {
            return marginResId(horizontalMarginId, horizontalMarginId);
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.Builder marginProvider(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.MarginProvider provider) {
            this.mMarginProvider = provider;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration build() {
            checkBuilderParams();
            return new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration(this);
        }
    }
}
