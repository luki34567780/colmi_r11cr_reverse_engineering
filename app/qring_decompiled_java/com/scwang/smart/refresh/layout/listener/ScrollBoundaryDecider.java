package com.scwang.smart.refresh.layout.listener;

/* loaded from: classes3.dex */
public interface ScrollBoundaryDecider {
    boolean canLoadMore(android.view.View view);

    boolean canRefresh(android.view.View view);
}
