package com.scwang.smart.refresh.layout.api;

/* loaded from: classes3.dex */
public interface RefreshContent {
    boolean canLoadMore();

    boolean canRefresh();

    android.view.View getScrollableView();

    android.view.View getView();

    void moveSpinner(int i, int i2, int i3);

    void onActionDown(android.view.MotionEvent motionEvent);

    android.animation.ValueAnimator.AnimatorUpdateListener scrollContentWhenFinished(int i);

    void setEnableLoadMoreWhenContentNotFull(boolean z);

    void setScrollBoundaryDecider(com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider scrollBoundaryDecider);

    void setUpComponent(com.scwang.smart.refresh.layout.api.RefreshKernel refreshKernel, android.view.View view, android.view.View view2);
}
