package com.scwang.smart.refresh.layout.util;

/* loaded from: classes3.dex */
public class SmartUtil implements android.view.animation.Interpolator {
    public static int INTERPOLATOR_DECELERATE = 1;
    public static int INTERPOLATOR_VISCOUS_FLUID = 0;
    private static final float VISCOUS_FLUID_NORMALIZE;
    private static final float VISCOUS_FLUID_OFFSET;
    private static final float VISCOUS_FLUID_SCALE = 8.0f;
    private static float density = android.content.res.Resources.getSystem().getDisplayMetrics().density;
    private int type;

    public SmartUtil(int i) {
        this.type = i;
    }

    public static int measureViewHeight(android.view.View view) {
        int makeMeasureSpec;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        if (layoutParams.height > 0) {
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
        } else {
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
        return view.getMeasuredHeight();
    }

    public static void scrollListBy(android.widget.AbsListView absListView, int i) {
        android.view.View childAt;
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            absListView.scrollListBy(i);
            return;
        }
        if (absListView instanceof android.widget.ListView) {
            int firstVisiblePosition = absListView.getFirstVisiblePosition();
            if (firstVisiblePosition == -1 || (childAt = absListView.getChildAt(0)) == null) {
                return;
            }
            ((android.widget.ListView) absListView).setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
            return;
        }
        absListView.smoothScrollBy(i, 0);
    }

    public static boolean isScrollableView(android.view.View view) {
        if (view instanceof com.scwang.smart.refresh.layout.api.RefreshComponent) {
            return false;
        }
        return (view instanceof android.widget.AbsListView) || (view instanceof android.widget.ScrollView) || (view instanceof androidx.core.view.ScrollingView) || (view instanceof android.webkit.WebView) || (view instanceof androidx.core.view.NestedScrollingChild);
    }

    public static boolean isContentView(android.view.View view) {
        if (view instanceof com.scwang.smart.refresh.layout.api.RefreshComponent) {
            return false;
        }
        return isScrollableView(view) || (view instanceof androidx.viewpager.widget.ViewPager) || (view instanceof androidx.core.view.NestedScrollingParent);
    }

    public static void fling(android.view.View view, int i) {
        if (view instanceof android.widget.ScrollView) {
            ((android.widget.ScrollView) view).fling(i);
            return;
        }
        if (view instanceof android.widget.AbsListView) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                ((android.widget.AbsListView) view).fling(i);
            }
        } else if (view instanceof android.webkit.WebView) {
            ((android.webkit.WebView) view).flingScroll(0, i);
        } else if (view instanceof androidx.core.widget.NestedScrollView) {
            ((androidx.core.widget.NestedScrollView) view).fling(i);
        } else if (view instanceof androidx.recyclerview.widget.RecyclerView) {
            ((androidx.recyclerview.widget.RecyclerView) view).fling(0, i);
        }
    }

    public static boolean canRefresh(android.view.View view, android.graphics.PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof android.view.ViewGroup) || pointF == null) {
            return true;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        android.graphics.PointF pointF2 = new android.graphics.PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            android.view.View childAt = viewGroup.getChildAt(childCount - 1);
            if (isTransformedTouchPointInView(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                java.lang.Object tag = childAt.getTag(com.scwang.smart.refresh.layout.kernel.R.id.srl_tag);
                if ("fixed".equals(tag) || "fixed-bottom".equals(tag)) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean canRefresh = canRefresh(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return canRefresh;
            }
        }
        return true;
    }

    public static boolean canLoadMore(android.view.View view, android.graphics.PointF pointF, boolean z) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof android.view.ViewGroup) && pointF != null && !isScrollableView(view)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            android.graphics.PointF pointF2 = new android.graphics.PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount - 1);
                if (isTransformedTouchPointInView(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    java.lang.Object tag = childAt.getTag(com.scwang.smart.refresh.layout.kernel.R.id.srl_tag);
                    if ("fixed".equals(tag) || "fixed-top".equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean canLoadMore = canLoadMore(childAt, pointF, z);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return canLoadMore;
                }
            }
        }
        return z || view.canScrollVertically(-1);
    }

    public static boolean isTransformedTouchPointInView(android.view.View view, android.view.View view2, float f, float f2, android.graphics.PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = fArr[0] + (view.getScrollX() - view2.getLeft());
        fArr[1] = fArr[1] + (view.getScrollY() - view2.getTop());
        boolean z = fArr[0] >= 0.0f && fArr[1] >= 0.0f && fArr[0] < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z && pointF != null) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return z;
    }

    static {
        float viscousFluid = 1.0f / viscousFluid(1.0f);
        VISCOUS_FLUID_NORMALIZE = viscousFluid;
        VISCOUS_FLUID_OFFSET = 1.0f - (viscousFluid * viscousFluid(1.0f));
    }

    public static int dp2px(float f) {
        return (int) ((f * density) + 0.5f);
    }

    public static float px2dp(int i) {
        return i / density;
    }

    private static float viscousFluid(float f) {
        float f2 = f * VISCOUS_FLUID_SCALE;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) java.lang.Math.exp(-f2)));
        }
        return ((1.0f - ((float) java.lang.Math.exp(1.0f - f2))) * 0.63212055f) + 0.36787945f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (this.type == INTERPOLATOR_DECELERATE) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
        float viscousFluid = VISCOUS_FLUID_NORMALIZE * viscousFluid(f);
        return viscousFluid > 0.0f ? viscousFluid + VISCOUS_FLUID_OFFSET : viscousFluid;
    }
}
