package com.qcwireless.qcwatch.ui.base.view.pop;

/* compiled from: WPopup.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopup;", "Lcom/qcwireless/qcwatch/ui/base/view/pop/BasePopup;", "popParams", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopParams;", "(Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopParams;)V", "commonAdapter", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopupAdapter;", "commonRootLayout", "Landroid/widget/LinearLayout;", "oldDirection", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "triangle", "Landroid/widget/ImageView;", "setTriangle", "", "view", "Landroid/view/View;", "showDirection", "showAtDirectionByView", "direction", "showAtFingerLocation", "showAtView", "Builder", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WPopup extends com.qcwireless.qcwatch.ui.base.view.pop.BasePopup {
    private com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter commonAdapter;
    private final android.widget.LinearLayout commonRootLayout;
    private int oldDirection;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.ImageView triangle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPopup(com.qcwireless.qcwatch.ui.base.view.pop.WPopParams wPopParams) {
        super(wPopParams);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wPopParams, "popParams");
        com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter wPopupAdapter = new com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter(this);
        this.commonAdapter = wPopupAdapter;
        this.oldDirection = -100;
        java.util.List<com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel> mCommonData = wPopParams.getMCommonData();
        kotlin.jvm.internal.Intrinsics.checkNotNull(mCommonData);
        wPopupAdapter.setData(mCommonData);
        if (wPopParams.getMWItemClickListener() != null) {
            com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter wPopupAdapter2 = this.commonAdapter;
            com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener mWItemClickListener = wPopParams.getMWItemClickListener();
            kotlin.jvm.internal.Intrinsics.checkNotNull(mWItemClickListener);
            wPopupAdapter2.setItemClickListener(mWItemClickListener);
        } else {
            android.util.Log.e("WPopup", "No item clickListener.");
        }
        this.commonAdapter.setDirection(wPopParams.getCommonIconDirection());
        this.commonAdapter.setTextColor(wPopParams.getCommonItemTextColor());
        this.commonAdapter.setTextSize(wPopParams.getCommonItemTextSize());
        this.commonAdapter.setDrawablePadding(wPopParams.getCommonDraablePadding());
        androidx.recyclerview.widget.RecyclerView findViewById = getContentView().findViewById(com.qcwireless.qcwatch.R.id.mRvCommon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "getContentView().findViewById(R.id.mRvCommon)");
        this.recyclerView = findViewById;
        android.view.View findViewById2 = getContentView().findViewById(com.qcwireless.qcwatch.R.id.mCommonRootLayout);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "getContentView().findVie…d(R.id.mCommonRootLayout)");
        this.commonRootLayout = (android.widget.LinearLayout) findViewById2;
        this.recyclerView.setAdapter(this.commonAdapter);
        this.recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), wPopParams.getCommonPopupOrientation(), false));
        int commonPopupOrientation = wPopParams.getCommonPopupOrientation();
        if (commonPopupOrientation == 0) {
            this.recyclerView.addItemDecoration(new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.VerticalDividerItemDecoration.Builder(getContext()).margin(wPopParams.getCommonPopupDividerMargin()).size(wPopParams.getCommonPopupDividerSize()).color(wPopParams.getCommonPopupDividerColor()).build());
        } else {
            if (commonPopupOrientation != 1) {
                return;
            }
            this.recyclerView.addItemDecoration(new com.qcwireless.qcwatch.ui.base.view.pop.rvDivider.HorizontalDividerItemDecoration.Builder(getContext()).margin(wPopParams.getCommonPopupDividerMargin()).size(wPopParams.getCommonPopupDividerSize()).color(wPopParams.getCommonPopupDividerColor()).build());
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.pop.BasePopup
    public void showAtView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        getShowDirection(view);
        super.showAtView(view);
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.pop.BasePopup
    public void showAtFingerLocation(int direction) {
        switch (direction) {
            case com.qcwireless.qcwatch.ui.base.view.pop.WPopupDirection.RIGHT_BOTTOM /* -8 */:
            case com.qcwireless.qcwatch.ui.base.view.pop.WPopupDirection.LEFT_BOTTOM /* -6 */:
            case -3:
                android.view.View longClickView = getPopParams().getLongClickView();
                kotlin.jvm.internal.Intrinsics.checkNotNull(longClickView);
                setTriangle(longClickView, -3);
                break;
            case com.qcwireless.qcwatch.ui.base.view.pop.WPopupDirection.RIGHT_TOP /* -7 */:
            case com.qcwireless.qcwatch.ui.base.view.pop.WPopupDirection.LEFT_TOP /* -5 */:
            case com.qcwireless.qcwatch.ui.base.view.pop.WPopupDirection.TOP /* -4 */:
                android.view.View longClickView2 = getPopParams().getLongClickView();
                kotlin.jvm.internal.Intrinsics.checkNotNull(longClickView2);
                setTriangle(longClickView2, -4);
                break;
        }
        super.showAtFingerLocation(direction);
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.pop.BasePopup
    public void showAtDirectionByView(android.view.View view, int direction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        if (direction == -4 || direction == -3) {
            setTriangle(view, direction);
        } else {
            android.widget.ImageView imageView = this.triangle;
            if (imageView != null) {
                this.commonRootLayout.removeView(imageView);
                this.triangle = null;
            }
            this.oldDirection = direction;
        }
        super.showAtDirectionByView(view, direction);
    }

    private final void setTriangle(android.view.View view, int showDirection) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int measuredWidth = ((iArr[0] + (view.getMeasuredWidth() / 2)) - getPopupShowLocation(view)[0]) - getDefaultMargin();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(measuredWidth));
        if (showDirection != this.oldDirection) {
            android.widget.ImageView imageView = this.triangle;
            if (imageView != null) {
                this.commonRootLayout.removeView(imageView);
                this.triangle = null;
            }
            if (this.triangle == null) {
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = measuredWidth;
                android.widget.ImageView imageView2 = new android.widget.ImageView(view.getContext());
                this.triangle = imageView2;
                if (showDirection == -4) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(imageView2);
                    imageView2.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.triangle_down);
                    this.commonRootLayout.addView(this.triangle, 1, layoutParams);
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(imageView2);
                    imageView2.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.triangle_up);
                    this.commonRootLayout.addView(this.triangle, 0, layoutParams);
                }
            }
            this.oldDirection = showDirection;
        } else {
            android.widget.ImageView imageView3 = this.triangle;
            if (imageView3 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(imageView3);
                android.view.ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
                java.util.Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) layoutParams2;
                layoutParams3.leftMargin = measuredWidth;
                android.widget.ImageView imageView4 = this.triangle;
                kotlin.jvm.internal.Intrinsics.checkNotNull(imageView4);
                imageView4.setLayoutParams(layoutParams3);
            }
        }
        android.widget.ImageView imageView5 = this.triangle;
        kotlin.jvm.internal.Intrinsics.checkNotNull(imageView5);
        android.graphics.drawable.Drawable background = imageView5.getBackground();
        java.util.Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        android.graphics.drawable.Drawable drawable = ((android.graphics.drawable.LayerDrawable) background).getDrawable(0);
        java.util.Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.RotateDrawable");
        android.graphics.drawable.Drawable drawable2 = ((android.graphics.drawable.RotateDrawable) drawable).getDrawable();
        java.util.Objects.requireNonNull(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((android.graphics.drawable.GradientDrawable) drawable2).setColor(getPopParams().getCommonPopupBgColor());
        android.graphics.drawable.Drawable background2 = this.recyclerView.getBackground();
        java.util.Objects.requireNonNull(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((android.graphics.drawable.GradientDrawable) background2).setColor(getPopParams().getCommonPopupBgColor());
    }

    /* compiled from: WPopup.kt */
    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0002/0B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000eJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopup$Builder;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "popParams", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopParams;", "create", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopup;", "setAnim", "anim", "", "setCancelable", "cancelable", "", "setClickView", "view", "Landroid/view/View;", "setData", "commonData", "", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopupModel;", "setDimValue", "dimValue", "", "setDividerColor", "color", "setDividerMargin", "margin", "setDividerSize", "size", "setDrawablePadding", "padding", "setIconDirection", "d", "setIsDim", "isDim", "setOnItemClickListener", "itemClickListener", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopup$Builder$OnItemClickListener;", "setPopupBgColor", "setPopupMargin", "setPopupOrientation", "orientation", "", "setTextColor", "setTextSize", "Companion", "OnItemClickListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        public static final java.lang.String HORIZONTAL = "HORIZONTAL";
        public static final java.lang.String VERTICAL = "VERTICAL";
        private final com.qcwireless.qcwatch.ui.base.view.pop.WPopParams popParams;

        /* compiled from: WPopup.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopup$Builder$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public interface OnItemClickListener {
            void onItemClick(android.view.View view, int position);
        }

        public Builder(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.popParams = new com.qcwireless.qcwatch.ui.base.view.pop.WPopParams(com.qcwireless.qcwatch.R.layout.pop_common, activity, false, 0.0f, false, 0, 0, 124, null);
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel> commonData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonData, "commonData");
            this.popParams.setMCommonData(commonData);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setOnItemClickListener(com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener itemClickListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
            this.popParams.setMWItemClickListener(itemClickListener);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setPopupOrientation(java.lang.String orientation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
            if (kotlin.jvm.internal.Intrinsics.areEqual(orientation, VERTICAL)) {
                this.popParams.setCommonPopupOrientation(1);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(orientation, HORIZONTAL)) {
                this.popParams.setCommonPopupOrientation(0);
            }
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setDividerColor(int color) {
            this.popParams.setCommonPopupDividerColor(color);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setDividerSize(int size) {
            this.popParams.setCommonPopupDividerSize(size);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setDividerMargin(int margin) {
            this.popParams.setCommonPopupDividerMargin(margin);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setIsDim(boolean isDim) {
            this.popParams.setDim(isDim);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setDimValue(float dimValue) {
            this.popParams.setDimValue(dimValue);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setPopupBgColor(int color) {
            this.popParams.setCommonPopupBgColor(color);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setPopupMargin(int margin) {
            this.popParams.setCommonPopMargin(margin);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setClickView(android.view.View view) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            this.popParams.setLongClickView(view);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setAnim(int anim) {
            this.popParams.setAnimRes(anim);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setIconDirection(int d) {
            this.popParams.setCommonIconDirection(d);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setCancelable(boolean cancelable) {
            this.popParams.setCancelable(cancelable);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setTextColor(int color) {
            this.popParams.setCommonItemTextColor(color);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setTextSize(int size) {
            this.popParams.setCommonItemTextSize(size);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder setDrawablePadding(int padding) {
            this.popParams.setCommonDraablePadding(padding);
            return this;
        }

        public final com.qcwireless.qcwatch.ui.base.view.pop.WPopup create() {
            return new com.qcwireless.qcwatch.ui.base.view.pop.WPopup(this.popParams);
        }
    }
}
