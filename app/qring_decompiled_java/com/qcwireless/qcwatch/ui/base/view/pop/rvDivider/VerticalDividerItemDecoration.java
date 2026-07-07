package com.qcwireless.qcwatch.ui.base.view.pop.rvDivider;

/* loaded from: /tmp/dex/classes2.dex */
public class VerticalDividerItemDecoration extends com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration {
    private com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.MarginProvider mMarginProvider;

    public interface MarginProvider {
        int dividerBottomMargin(int position, androidx.recyclerview.widget.RecyclerView parent);

        int dividerTopMargin(int position, androidx.recyclerview.widget.RecyclerView parent);
    }

    protected VerticalDividerItemDecoration(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.Builder builder) {
        super(builder);
        this.mMarginProvider = builder.mMarginProvider;
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration
    protected android.graphics.Rect getDividerBound(int position, androidx.recyclerview.widget.RecyclerView parent, android.view.View child) {
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, 0, 0);
        int translationX = (int) androidx.core.view.ViewCompat.getTranslationX(child);
        int translationY = (int) androidx.core.view.ViewCompat.getTranslationY(child);
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = child.getLayoutParams();
        rect.top = parent.getPaddingTop() + this.mMarginProvider.dividerTopMargin(position, parent) + translationY;
        rect.bottom = ((parent.getHeight() - parent.getPaddingBottom()) - this.mMarginProvider.dividerBottomMargin(position, parent)) + translationY;
        int dividerSize = getDividerSize(position, parent);
        boolean isReverseLayout = isReverseLayout(parent);
        if (this.mDividerType != com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType.DRAWABLE) {
            int i = dividerSize / 2;
            if (isReverseLayout) {
                rect.left = ((child.getLeft() - layoutParams.leftMargin) - i) + translationX;
            } else {
                rect.left = child.getRight() + layoutParams.rightMargin + i + translationX;
            }
            rect.right = rect.left;
        } else if (isReverseLayout) {
            rect.right = (child.getLeft() - layoutParams.leftMargin) + translationX;
            rect.left = rect.right - dividerSize;
        } else {
            rect.left = child.getRight() + layoutParams.rightMargin + translationX;
            rect.right = rect.left + dividerSize;
        }
        if (this.mPositionInsideItem) {
            if (isReverseLayout) {
                rect.left += dividerSize;
                rect.right += dividerSize;
            } else {
                rect.left -= dividerSize;
                rect.right -= dividerSize;
            }
        }
        return rect;
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration
    protected void setItemOffsets(android.graphics.Rect outRect, int position, androidx.recyclerview.widget.RecyclerView parent) {
        if (this.mPositionInsideItem) {
            outRect.set(0, 0, 0, 0);
        } else if (isReverseLayout(parent)) {
            outRect.set(getDividerSize(position, parent), 0, 0, 0);
        } else {
            outRect.set(0, 0, getDividerSize(position, parent), 0);
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
            return this.mDrawableProvider.drawableProvider(position, parent).getIntrinsicWidth();
        }
        throw new java.lang.RuntimeException("failed to get size");
    }

    public static class Builder extends com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.Builder<com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.Builder> {
        private com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.MarginProvider mMarginProvider;

        public Builder(android.content.Context context) {
            super(context);
            this.mMarginProvider = new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.MarginProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.Builder.1
                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.MarginProvider
                public int dividerBottomMargin(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return 0;
                }

                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.MarginProvider
                public int dividerTopMargin(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return 0;
                }
            };
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.Builder margin(final int topMargin, final int bottomMargin) {
            return marginProvider(new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.MarginProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.Builder.2
                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.MarginProvider
                public int dividerTopMargin(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return topMargin;
                }

                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.MarginProvider
                public int dividerBottomMargin(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return bottomMargin;
                }
            });
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.Builder margin(int verticalMargin) {
            return margin(verticalMargin, verticalMargin);
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.Builder marginResId(int topMarginId, int bottomMarginId) {
            return margin(this.mResources.getDimensionPixelSize(topMarginId), this.mResources.getDimensionPixelSize(bottomMarginId));
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.Builder marginResId(int verticalMarginId) {
            return marginResId(verticalMarginId, verticalMarginId);
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.Builder marginProvider(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.MarginProvider provider) {
            this.mMarginProvider = provider;
            return this;
        }

        public com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration build() {
            checkBuilderParams();
            return new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration(this);
        }
    }
}
