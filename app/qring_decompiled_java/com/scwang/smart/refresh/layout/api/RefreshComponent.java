package com.scwang.smart.refresh.layout.api;

/* loaded from: classes3.dex */
public interface RefreshComponent extends com.scwang.smart.refresh.layout.listener.OnStateChangedListener {
    com.scwang.smart.refresh.layout.constant.SpinnerStyle getSpinnerStyle();

    android.view.View getView();

    boolean isSupportHorizontalDrag();

    int onFinish(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, boolean z);

    void onHorizontalDrag(float f, int i, int i2);

    void onInitialized(com.scwang.smart.refresh.layout.api.RefreshKernel refreshKernel, int i, int i2);

    void onMoving(boolean z, float f, int i, int i2, int i3);

    void onReleased(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, int i, int i2);

    void onStartAnimator(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, int i, int i2);

    void setPrimaryColors(int... iArr);
}
