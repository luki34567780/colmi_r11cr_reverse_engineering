package com.scwang.smart.refresh.layout.api;

/* loaded from: classes3.dex */
public interface RefreshLayout {
    boolean autoLoadMore();

    boolean autoLoadMore(int i);

    boolean autoLoadMore(int i, int i2, float f, boolean z);

    boolean autoLoadMoreAnimationOnly();

    boolean autoRefresh();

    boolean autoRefresh(int i);

    boolean autoRefresh(int i, int i2, float f, boolean z);

    boolean autoRefreshAnimationOnly();

    com.scwang.smart.refresh.layout.api.RefreshLayout closeHeaderOrFooter();

    com.scwang.smart.refresh.layout.api.RefreshLayout finishLoadMore();

    com.scwang.smart.refresh.layout.api.RefreshLayout finishLoadMore(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout finishLoadMore(int i, boolean z, boolean z2);

    com.scwang.smart.refresh.layout.api.RefreshLayout finishLoadMore(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout finishLoadMoreWithNoMoreData();

    com.scwang.smart.refresh.layout.api.RefreshLayout finishRefresh();

    com.scwang.smart.refresh.layout.api.RefreshLayout finishRefresh(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout finishRefresh(int i, boolean z, java.lang.Boolean bool);

    com.scwang.smart.refresh.layout.api.RefreshLayout finishRefresh(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout finishRefreshWithNoMoreData();

    android.view.ViewGroup getLayout();

    com.scwang.smart.refresh.layout.api.RefreshFooter getRefreshFooter();

    com.scwang.smart.refresh.layout.api.RefreshHeader getRefreshHeader();

    com.scwang.smart.refresh.layout.constant.RefreshState getState();

    boolean isLoading();

    boolean isRefreshing();

    com.scwang.smart.refresh.layout.api.RefreshLayout resetNoMoreData();

    com.scwang.smart.refresh.layout.api.RefreshLayout setDisableContentWhenLoading(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setDisableContentWhenRefresh(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setDragRate(float f);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableAutoLoadMore(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableClipFooterWhenFixedBehind(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableClipHeaderWhenFixedBehind(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableFooterFollowWhenNoMoreData(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableFooterTranslationContent(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableHeaderTranslationContent(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableLoadMore(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableLoadMoreWhenContentNotFull(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableNestedScroll(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableOverScrollBounce(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableOverScrollDrag(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnablePureScrollMode(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableRefresh(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableScrollContentWhenLoaded(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setEnableScrollContentWhenRefreshed(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setFixedFooterViewId(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout setFixedHeaderViewId(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout setFooterHeight(float f);

    com.scwang.smart.refresh.layout.api.RefreshLayout setFooterHeightPx(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout setFooterInsetStart(float f);

    com.scwang.smart.refresh.layout.api.RefreshLayout setFooterInsetStartPx(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout setFooterMaxDragRate(float f);

    com.scwang.smart.refresh.layout.api.RefreshLayout setFooterTranslationViewId(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout setFooterTriggerRate(float f);

    com.scwang.smart.refresh.layout.api.RefreshLayout setHeaderHeight(float f);

    com.scwang.smart.refresh.layout.api.RefreshLayout setHeaderHeightPx(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout setHeaderInsetStart(float f);

    com.scwang.smart.refresh.layout.api.RefreshLayout setHeaderInsetStartPx(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout setHeaderMaxDragRate(float f);

    com.scwang.smart.refresh.layout.api.RefreshLayout setHeaderTranslationViewId(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout setHeaderTriggerRate(float f);

    com.scwang.smart.refresh.layout.api.RefreshLayout setNoMoreData(boolean z);

    com.scwang.smart.refresh.layout.api.RefreshLayout setOnLoadMoreListener(com.scwang.smart.refresh.layout.listener.OnLoadMoreListener onLoadMoreListener);

    com.scwang.smart.refresh.layout.api.RefreshLayout setOnMultiListener(com.scwang.smart.refresh.layout.listener.OnMultiListener onMultiListener);

    com.scwang.smart.refresh.layout.api.RefreshLayout setOnRefreshListener(com.scwang.smart.refresh.layout.listener.OnRefreshListener onRefreshListener);

    com.scwang.smart.refresh.layout.api.RefreshLayout setOnRefreshLoadMoreListener(com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener onRefreshLoadMoreListener);

    com.scwang.smart.refresh.layout.api.RefreshLayout setPrimaryColors(int... iArr);

    com.scwang.smart.refresh.layout.api.RefreshLayout setPrimaryColorsId(int... iArr);

    com.scwang.smart.refresh.layout.api.RefreshLayout setReboundDuration(int i);

    com.scwang.smart.refresh.layout.api.RefreshLayout setReboundInterpolator(android.view.animation.Interpolator interpolator);

    com.scwang.smart.refresh.layout.api.RefreshLayout setRefreshContent(android.view.View view);

    com.scwang.smart.refresh.layout.api.RefreshLayout setRefreshContent(android.view.View view, int i, int i2);

    com.scwang.smart.refresh.layout.api.RefreshLayout setRefreshFooter(com.scwang.smart.refresh.layout.api.RefreshFooter refreshFooter);

    com.scwang.smart.refresh.layout.api.RefreshLayout setRefreshFooter(com.scwang.smart.refresh.layout.api.RefreshFooter refreshFooter, int i, int i2);

    com.scwang.smart.refresh.layout.api.RefreshLayout setRefreshHeader(com.scwang.smart.refresh.layout.api.RefreshHeader refreshHeader);

    com.scwang.smart.refresh.layout.api.RefreshLayout setRefreshHeader(com.scwang.smart.refresh.layout.api.RefreshHeader refreshHeader, int i, int i2);

    com.scwang.smart.refresh.layout.api.RefreshLayout setScrollBoundaryDecider(com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider scrollBoundaryDecider);
}
