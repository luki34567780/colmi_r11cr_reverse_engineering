package com.scwang.smart.refresh.layout.listener;

/* loaded from: classes3.dex */
public interface OnMultiListener extends com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener, com.scwang.smart.refresh.layout.listener.OnStateChangedListener {
    void onFooterFinish(com.scwang.smart.refresh.layout.api.RefreshFooter refreshFooter, boolean z);

    void onFooterMoving(com.scwang.smart.refresh.layout.api.RefreshFooter refreshFooter, boolean z, float f, int i, int i2, int i3);

    void onFooterReleased(com.scwang.smart.refresh.layout.api.RefreshFooter refreshFooter, int i, int i2);

    void onFooterStartAnimator(com.scwang.smart.refresh.layout.api.RefreshFooter refreshFooter, int i, int i2);

    void onHeaderFinish(com.scwang.smart.refresh.layout.api.RefreshHeader refreshHeader, boolean z);

    void onHeaderMoving(com.scwang.smart.refresh.layout.api.RefreshHeader refreshHeader, boolean z, float f, int i, int i2, int i3);

    void onHeaderReleased(com.scwang.smart.refresh.layout.api.RefreshHeader refreshHeader, int i, int i2);

    void onHeaderStartAnimator(com.scwang.smart.refresh.layout.api.RefreshHeader refreshHeader, int i, int i2);
}
