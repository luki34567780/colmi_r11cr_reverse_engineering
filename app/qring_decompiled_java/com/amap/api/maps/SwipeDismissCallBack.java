package com.amap.api.maps;

/* loaded from: classes.dex */
public class SwipeDismissCallBack implements com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks {
    com.amap.api.maps.SwipeDismissView a;

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public boolean canDismiss(java.lang.Object obj) {
        return true;
    }

    public SwipeDismissCallBack(com.amap.api.maps.SwipeDismissView swipeDismissView) {
        this.a = swipeDismissView;
    }

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public void onDismiss(android.view.View view, java.lang.Object obj) {
        if (this.a.onDismissCallback != null) {
            this.a.onDismissCallback.onDismiss();
        }
    }

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public void onNotifySwipe() {
        if (this.a.onDismissCallback != null) {
            this.a.onDismissCallback.onNotifySwipe();
        }
    }
}
