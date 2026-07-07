package com.scwang.smart.refresh.layout.simple;

/* loaded from: classes3.dex */
public abstract class SimpleComponent extends android.widget.RelativeLayout implements com.scwang.smart.refresh.layout.api.RefreshComponent {
    protected com.scwang.smart.refresh.layout.constant.SpinnerStyle mSpinnerStyle;
    protected com.scwang.smart.refresh.layout.api.RefreshComponent mWrappedInternal;
    protected android.view.View mWrappedView;

    /* JADX WARN: Multi-variable type inference failed */
    protected SimpleComponent(android.view.View view) {
        this(view, view instanceof com.scwang.smart.refresh.layout.api.RefreshComponent ? (com.scwang.smart.refresh.layout.api.RefreshComponent) view : null);
    }

    protected SimpleComponent(android.view.View view, com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent) {
        super(view.getContext(), null, 0);
        this.mWrappedView = view;
        this.mWrappedInternal = refreshComponent;
        if ((this instanceof com.scwang.smart.refresh.layout.api.RefreshFooter) && (refreshComponent instanceof com.scwang.smart.refresh.layout.api.RefreshHeader) && refreshComponent.getSpinnerStyle() == com.scwang.smart.refresh.layout.constant.SpinnerStyle.MatchLayout) {
            refreshComponent.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof com.scwang.smart.refresh.layout.api.RefreshHeader) {
            com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent2 = this.mWrappedInternal;
            if ((refreshComponent2 instanceof com.scwang.smart.refresh.layout.api.RefreshFooter) && refreshComponent2.getSpinnerStyle() == com.scwang.smart.refresh.layout.constant.SpinnerStyle.MatchLayout) {
                refreshComponent.getView().setScaleY(-1.0f);
            }
        }
    }

    protected SimpleComponent(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        return (obj instanceof com.scwang.smart.refresh.layout.api.RefreshComponent) && getView() == ((com.scwang.smart.refresh.layout.api.RefreshComponent) obj).getView();
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshComponent
    public android.view.View getView() {
        android.view.View view = this.mWrappedView;
        return view == null ? this : view;
    }

    public int onFinish(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, boolean z) {
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        if (refreshComponent == null || refreshComponent == this) {
            return 0;
        }
        return refreshComponent.onFinish(refreshLayout, z);
    }

    public void setPrimaryColors(int... iArr) {
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        refreshComponent.setPrimaryColors(iArr);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshComponent
    public com.scwang.smart.refresh.layout.constant.SpinnerStyle getSpinnerStyle() {
        com.scwang.smart.refresh.layout.constant.SpinnerStyle spinnerStyle = this.mSpinnerStyle;
        if (spinnerStyle != null) {
            return spinnerStyle;
        }
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        if (refreshComponent != null && refreshComponent != this) {
            return refreshComponent.getSpinnerStyle();
        }
        android.view.View view = this.mWrappedView;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof com.scwang.smart.refresh.layout.SmartRefreshLayout.LayoutParams) {
                com.scwang.smart.refresh.layout.constant.SpinnerStyle spinnerStyle2 = ((com.scwang.smart.refresh.layout.SmartRefreshLayout.LayoutParams) layoutParams).spinnerStyle;
                this.mSpinnerStyle = spinnerStyle2;
                if (spinnerStyle2 != null) {
                    return spinnerStyle2;
                }
            }
            if (layoutParams != null && (layoutParams.height == 0 || layoutParams.height == -1)) {
                for (com.scwang.smart.refresh.layout.constant.SpinnerStyle spinnerStyle3 : com.scwang.smart.refresh.layout.constant.SpinnerStyle.values) {
                    if (spinnerStyle3.scale) {
                        this.mSpinnerStyle = spinnerStyle3;
                        return spinnerStyle3;
                    }
                }
            }
        }
        com.scwang.smart.refresh.layout.constant.SpinnerStyle spinnerStyle4 = com.scwang.smart.refresh.layout.constant.SpinnerStyle.Translate;
        this.mSpinnerStyle = spinnerStyle4;
        return spinnerStyle4;
    }

    public void onInitialized(com.scwang.smart.refresh.layout.api.RefreshKernel refreshKernel, int i, int i2) {
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        if (refreshComponent != null && refreshComponent != this) {
            refreshComponent.onInitialized(refreshKernel, i, i2);
            return;
        }
        android.view.View view = this.mWrappedView;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof com.scwang.smart.refresh.layout.SmartRefreshLayout.LayoutParams) {
                refreshKernel.requestDrawBackgroundFor(this, ((com.scwang.smart.refresh.layout.SmartRefreshLayout.LayoutParams) layoutParams).backgroundColor);
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshComponent
    public boolean isSupportHorizontalDrag() {
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        return (refreshComponent == null || refreshComponent == this || !refreshComponent.isSupportHorizontalDrag()) ? false : true;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshComponent
    public void onHorizontalDrag(float f, int i, int i2) {
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        refreshComponent.onHorizontalDrag(f, i, i2);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshComponent
    public void onMoving(boolean z, float f, int i, int i2, int i3) {
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        refreshComponent.onMoving(z, f, i, i2, i3);
    }

    public void onReleased(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, int i, int i2) {
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        refreshComponent.onReleased(refreshLayout, i, i2);
    }

    public void onStartAnimator(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, int i, int i2) {
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        refreshComponent.onStartAnimator(refreshLayout, i, i2);
    }

    public void onStateChanged(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, com.scwang.smart.refresh.layout.constant.RefreshState refreshState, com.scwang.smart.refresh.layout.constant.RefreshState refreshState2) {
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        if ((this instanceof com.scwang.smart.refresh.layout.api.RefreshFooter) && (refreshComponent instanceof com.scwang.smart.refresh.layout.api.RefreshHeader)) {
            if (refreshState.isFooter) {
                refreshState = refreshState.toHeader();
            }
            if (refreshState2.isFooter) {
                refreshState2 = refreshState2.toHeader();
            }
        } else if ((this instanceof com.scwang.smart.refresh.layout.api.RefreshHeader) && (refreshComponent instanceof com.scwang.smart.refresh.layout.api.RefreshFooter)) {
            if (refreshState.isHeader) {
                refreshState = refreshState.toFooter();
            }
            if (refreshState2.isHeader) {
                refreshState2 = refreshState2.toFooter();
            }
        }
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent2 = this.mWrappedInternal;
        if (refreshComponent2 != null) {
            refreshComponent2.onStateChanged(refreshLayout, refreshState, refreshState2);
        }
    }

    public boolean setNoMoreData(boolean z) {
        com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent = this.mWrappedInternal;
        return (refreshComponent instanceof com.scwang.smart.refresh.layout.api.RefreshFooter) && ((com.scwang.smart.refresh.layout.api.RefreshFooter) refreshComponent).setNoMoreData(z);
    }
}
