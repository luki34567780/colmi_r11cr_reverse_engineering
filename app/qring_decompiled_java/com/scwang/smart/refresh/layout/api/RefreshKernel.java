package com.scwang.smart.refresh.layout.api;

/* loaded from: classes3.dex */
public interface RefreshKernel {
    android.animation.ValueAnimator animSpinner(int i);

    com.scwang.smart.refresh.layout.api.RefreshKernel finishTwoLevel();

    com.scwang.smart.refresh.layout.api.RefreshContent getRefreshContent();

    com.scwang.smart.refresh.layout.api.RefreshLayout getRefreshLayout();

    com.scwang.smart.refresh.layout.api.RefreshKernel moveSpinner(int i, boolean z);

    com.scwang.smart.refresh.layout.api.RefreshKernel requestDefaultTranslationContentFor(com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent, boolean z);

    com.scwang.smart.refresh.layout.api.RefreshKernel requestDrawBackgroundFor(com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent, int i);

    com.scwang.smart.refresh.layout.api.RefreshKernel requestFloorBottomPullUpToCloseRate(float f);

    com.scwang.smart.refresh.layout.api.RefreshKernel requestFloorDuration(int i);

    com.scwang.smart.refresh.layout.api.RefreshKernel requestNeedTouchEventFor(com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent, boolean z);

    com.scwang.smart.refresh.layout.api.RefreshKernel requestRemeasureHeightFor(com.scwang.smart.refresh.layout.api.RefreshComponent refreshComponent);

    com.scwang.smart.refresh.layout.api.RefreshKernel setState(com.scwang.smart.refresh.layout.constant.RefreshState refreshState);

    com.scwang.smart.refresh.layout.api.RefreshKernel startTwoLevel(boolean z);
}
