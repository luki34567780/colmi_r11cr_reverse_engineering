package com.qcwireless.qcwatch.ui.base.view.pop.rvDivider;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class FlexibleDividerDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private static final int[] ATTRS = {android.R.attr.listDivider};
    private static final int DEFAULT_SIZE = 2;
    protected com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.ColorProvider mColorProvider;
    protected com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType mDividerType;
    protected com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DrawableProvider mDrawableProvider;
    private android.graphics.Paint mPaint;
    protected com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.PaintProvider mPaintProvider;
    protected boolean mPositionInsideItem;
    protected boolean mShowLastDivider;
    protected com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.SizeProvider mSizeProvider;
    protected com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.VisibilityProvider mVisibilityProvider;

    public interface ColorProvider {
        int dividerColor(int position, androidx.recyclerview.widget.RecyclerView parent);
    }

    protected enum DividerType {
        DRAWABLE,
        PAINT,
        COLOR
    }

    public interface DrawableProvider {
        android.graphics.drawable.Drawable drawableProvider(int position, androidx.recyclerview.widget.RecyclerView parent);
    }

    public interface PaintProvider {
        android.graphics.Paint dividerPaint(int position, androidx.recyclerview.widget.RecyclerView parent);
    }

    public interface SizeProvider {
        int dividerSize(int position, androidx.recyclerview.widget.RecyclerView parent);
    }

    public interface VisibilityProvider {
        boolean shouldHideDivider(int position, androidx.recyclerview.widget.RecyclerView parent);
    }

    protected abstract android.graphics.Rect getDividerBound(int position, androidx.recyclerview.widget.RecyclerView parent, android.view.View child);

    protected abstract void setItemOffsets(android.graphics.Rect outRect, int position, androidx.recyclerview.widget.RecyclerView parent);

    protected FlexibleDividerDecoration(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.Builder builder) {
        this.mDividerType = com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType.DRAWABLE;
        if (builder.mPaintProvider != null) {
            this.mDividerType = com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType.PAINT;
            this.mPaintProvider = builder.mPaintProvider;
        } else if (builder.mColorProvider != null) {
            this.mDividerType = com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType.COLOR;
            this.mColorProvider = builder.mColorProvider;
            this.mPaint = new android.graphics.Paint();
            setSizeProvider(builder);
        } else {
            this.mDividerType = com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType.DRAWABLE;
            if (builder.mDrawableProvider == null) {
                android.content.res.TypedArray obtainStyledAttributes = builder.mContext.obtainStyledAttributes(ATTRS);
                final android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
                obtainStyledAttributes.recycle();
                this.mDrawableProvider = new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DrawableProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.1
                    @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DrawableProvider
                    public android.graphics.drawable.Drawable drawableProvider(int position, androidx.recyclerview.widget.RecyclerView parent) {
                        return drawable;
                    }
                };
            } else {
                this.mDrawableProvider = builder.mDrawableProvider;
            }
            this.mSizeProvider = builder.mSizeProvider;
        }
        this.mVisibilityProvider = builder.mVisibilityProvider;
        this.mShowLastDivider = builder.mShowLastDivider;
        this.mPositionInsideItem = builder.mPositionInsideItem;
    }

    private void setSizeProvider(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.Builder builder) {
        com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.SizeProvider sizeProvider = builder.mSizeProvider;
        this.mSizeProvider = sizeProvider;
        if (sizeProvider == null) {
            this.mSizeProvider = new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.SizeProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.2
                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.SizeProvider
                public int dividerSize(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return 2;
                }
            };
        }
    }

    public void onDraw(android.graphics.Canvas c, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.RecyclerView.State state) {
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        int lastDividerOffset = getLastDividerOffset(parent);
        int childCount = parent.getChildCount();
        int i = -1;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = parent.getChildAt(i2);
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= i) {
                if ((this.mShowLastDivider || childAdapterPosition < itemCount - lastDividerOffset) && !wasDividerAlreadyDrawn(childAdapterPosition, parent)) {
                    int groupIndex = getGroupIndex(childAdapterPosition, parent);
                    if (!this.mVisibilityProvider.shouldHideDivider(groupIndex, parent)) {
                        android.graphics.Rect dividerBound = getDividerBound(groupIndex, parent, childAt);
                        int i3 = com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.AnonymousClass3.$SwitchMap$com$qcwireless$qcwatch$ui$base$view$pop$rvDivider$FlexibleDividerDecoration$DividerType[this.mDividerType.ordinal()];
                        if (i3 == 1) {
                            android.graphics.drawable.Drawable drawableProvider = this.mDrawableProvider.drawableProvider(groupIndex, parent);
                            drawableProvider.setBounds(dividerBound);
                            drawableProvider.draw(c);
                        } else if (i3 == 2) {
                            this.mPaint = this.mPaintProvider.dividerPaint(groupIndex, parent);
                            c.drawLine(dividerBound.left, dividerBound.top, dividerBound.right, dividerBound.bottom, this.mPaint);
                        } else if (i3 == 3) {
                            this.mPaint.setColor(this.mColorProvider.dividerColor(groupIndex, parent));
                            this.mPaint.setStrokeWidth(this.mSizeProvider.dividerSize(groupIndex, parent));
                            c.drawLine(dividerBound.left, dividerBound.top, dividerBound.right, dividerBound.bottom, this.mPaint);
                        }
                    }
                }
                i = childAdapterPosition;
            }
        }
    }

    /* renamed from: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$qcwireless$qcwatch$ui$base$view$pop$rvDivider$FlexibleDividerDecoration$DividerType;

        static {
            int[] iArr = new int[com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType.values().length];
            $SwitchMap$com$qcwireless$qcwatch$ui$base$view$pop$rvDivider$FlexibleDividerDecoration$DividerType = iArr;
            try {
                iArr[com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType.DRAWABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$view$pop$rvDivider$FlexibleDividerDecoration$DividerType[com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType.PAINT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$view$pop$rvDivider$FlexibleDividerDecoration$DividerType[com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DividerType.COLOR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public void getItemOffsets(android.graphics.Rect rect, android.view.View v, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.RecyclerView.State state) {
        int childAdapterPosition = parent.getChildAdapterPosition(v);
        int itemCount = parent.getAdapter().getItemCount();
        int lastDividerOffset = getLastDividerOffset(parent);
        if (this.mShowLastDivider || childAdapterPosition < itemCount - lastDividerOffset) {
            int groupIndex = getGroupIndex(childAdapterPosition, parent);
            if (this.mVisibilityProvider.shouldHideDivider(groupIndex, parent)) {
                return;
            }
            setItemOffsets(rect, groupIndex, parent);
        }
    }

    protected boolean isReverseLayout(androidx.recyclerview.widget.RecyclerView parent) {
        androidx.recyclerview.widget.LinearLayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            return layoutManager.getReverseLayout();
        }
        return false;
    }

    private int getLastDividerOffset(androidx.recyclerview.widget.RecyclerView parent) {
        if (!(parent.getLayoutManager() instanceof androidx.recyclerview.widget.GridLayoutManager)) {
            return 1;
        }
        androidx.recyclerview.widget.GridLayoutManager layoutManager = parent.getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup spanSizeLookup = layoutManager.getSpanSizeLookup();
        int spanCount = layoutManager.getSpanCount();
        int itemCount = parent.getAdapter().getItemCount();
        for (int i = itemCount - 1; i >= 0; i--) {
            if (spanSizeLookup.getSpanIndex(i, spanCount) == 0) {
                return itemCount - i;
            }
        }
        return 1;
    }

    private boolean wasDividerAlreadyDrawn(int position, androidx.recyclerview.widget.RecyclerView parent) {
        if (!(parent.getLayoutManager() instanceof androidx.recyclerview.widget.GridLayoutManager)) {
            return false;
        }
        androidx.recyclerview.widget.GridLayoutManager layoutManager = parent.getLayoutManager();
        return layoutManager.getSpanSizeLookup().getSpanIndex(position, layoutManager.getSpanCount()) > 0;
    }

    private int getGroupIndex(int position, androidx.recyclerview.widget.RecyclerView parent) {
        if (!(parent.getLayoutManager() instanceof androidx.recyclerview.widget.GridLayoutManager)) {
            return position;
        }
        androidx.recyclerview.widget.GridLayoutManager layoutManager = parent.getLayoutManager();
        return layoutManager.getSpanSizeLookup().getSpanGroupIndex(position, layoutManager.getSpanCount());
    }

    public static class Builder<T extends com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.Builder> {
        private com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.ColorProvider mColorProvider;
        private android.content.Context mContext;
        private com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DrawableProvider mDrawableProvider;
        private com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.PaintProvider mPaintProvider;
        protected android.content.res.Resources mResources;
        private com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.SizeProvider mSizeProvider;
        private com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.VisibilityProvider mVisibilityProvider = new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.VisibilityProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.Builder.1
            @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.VisibilityProvider
            public boolean shouldHideDivider(int position, androidx.recyclerview.widget.RecyclerView parent) {
                return false;
            }
        };
        private boolean mShowLastDivider = false;
        private boolean mPositionInsideItem = false;

        public Builder(android.content.Context context) {
            this.mContext = context;
            this.mResources = context.getResources();
        }

        public T paint(final android.graphics.Paint paint) {
            return paintProvider(new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.PaintProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.Builder.2
                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.PaintProvider
                public android.graphics.Paint dividerPaint(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return paint;
                }
            });
        }

        public T paintProvider(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.PaintProvider provider) {
            this.mPaintProvider = provider;
            return this;
        }

        public T color(final int color) {
            return colorProvider(new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.ColorProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.Builder.3
                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.ColorProvider
                public int dividerColor(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return color;
                }
            });
        }

        public T colorResId(int colorId) {
            return color(androidx.core.content.ContextCompat.getColor(this.mContext, colorId));
        }

        public T colorProvider(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.ColorProvider provider) {
            this.mColorProvider = provider;
            return this;
        }

        public T drawable(int id) {
            return drawable(androidx.core.content.ContextCompat.getDrawable(this.mContext, id));
        }

        public T drawable(final android.graphics.drawable.Drawable drawable) {
            return drawableProvider(new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DrawableProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.Builder.4
                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DrawableProvider
                public android.graphics.drawable.Drawable drawableProvider(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return drawable;
                }
            });
        }

        public T drawableProvider(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.DrawableProvider provider) {
            this.mDrawableProvider = provider;
            return this;
        }

        public T size(final int size) {
            return sizeProvider(new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.SizeProvider() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.Builder.5
                @Override // com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.SizeProvider
                public int dividerSize(int position, androidx.recyclerview.widget.RecyclerView parent) {
                    return size;
                }
            });
        }

        public T sizeResId(int sizeId) {
            return size(this.mResources.getDimensionPixelSize(sizeId));
        }

        public T sizeProvider(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.SizeProvider provider) {
            this.mSizeProvider = provider;
            return this;
        }

        public T visibilityProvider(com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.FlexibleDividerDecoration.VisibilityProvider provider) {
            this.mVisibilityProvider = provider;
            return this;
        }

        public T showLastDivider() {
            this.mShowLastDivider = true;
            return this;
        }

        public T positionInsideItem(boolean positionInsideItem) {
            this.mPositionInsideItem = positionInsideItem;
            return this;
        }

        protected void checkBuilderParams() {
            if (this.mPaintProvider != null) {
                if (this.mColorProvider != null) {
                    throw new java.lang.IllegalArgumentException("Use setColor method of Paint class to specify line color. Do not provider ColorProvider if you set PaintProvider.");
                }
                if (this.mSizeProvider != null) {
                    throw new java.lang.IllegalArgumentException("Use setStrokeWidth method of Paint class to specify line size. Do not provider SizeProvider if you set PaintProvider.");
                }
            }
        }
    }
}
