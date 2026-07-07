package com.qcwireless.qcwatch.ui.plate.util;

/* loaded from: /tmp/dex/classes2.dex */
public class ViewPagerUtils {
    public static void setSupportsChangeAnimations(androidx.viewpager2.widget.ViewPager2 viewPager, boolean enable) {
        for (int i = 0; i < viewPager.getChildCount(); i++) {
            androidx.recyclerview.widget.RecyclerView childAt = viewPager.getChildAt(i);
            if (childAt instanceof androidx.recyclerview.widget.RecyclerView) {
                androidx.recyclerview.widget.SimpleItemAnimator itemAnimator = childAt.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.setSupportsChangeAnimations(enable);
                    return;
                }
                return;
            }
        }
    }
}
