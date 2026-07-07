package com.scwang.smart.refresh.layout.simple;

/* loaded from: classes3.dex */
public class SimpleBoundaryDecider implements com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider {
    public com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider boundary;
    public android.graphics.PointF mActionEvent;
    public boolean mEnableLoadMoreWhenContentNotFull = true;

    @Override // com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider
    public boolean canRefresh(android.view.View view) {
        com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider scrollBoundaryDecider = this.boundary;
        if (scrollBoundaryDecider != null) {
            return scrollBoundaryDecider.canRefresh(view);
        }
        return com.scwang.smart.refresh.layout.util.SmartUtil.canRefresh(view, this.mActionEvent);
    }

    @Override // com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider
    public boolean canLoadMore(android.view.View view) {
        com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider scrollBoundaryDecider = this.boundary;
        if (scrollBoundaryDecider != null) {
            return scrollBoundaryDecider.canLoadMore(view);
        }
        return com.scwang.smart.refresh.layout.util.SmartUtil.canLoadMore(view, this.mActionEvent, this.mEnableLoadMoreWhenContentNotFull);
    }
}
