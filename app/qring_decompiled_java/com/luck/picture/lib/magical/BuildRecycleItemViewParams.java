package com.luck.picture.lib.magical;

/* loaded from: /tmp/dex/classes2.dex */
public class BuildRecycleItemViewParams {
    private static final java.util.List<com.luck.picture.lib.magical.ViewParams> viewParams = new java.util.ArrayList();

    public static void clear() {
        java.util.List<com.luck.picture.lib.magical.ViewParams> list = viewParams;
        if (list.size() > 0) {
            list.clear();
        }
    }

    public static com.luck.picture.lib.magical.ViewParams getItemViewParams(int i) {
        java.util.List<com.luck.picture.lib.magical.ViewParams> list = viewParams;
        if (list.size() > i) {
            return list.get(i);
        }
        return null;
    }

    public static void generateViewParams(android.view.ViewGroup viewGroup, int i) {
        int childCount;
        int count;
        int firstVisiblePosition;
        int lastVisiblePosition;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = viewGroup instanceof androidx.recyclerview.widget.RecyclerView;
        if (z) {
            childCount = ((androidx.recyclerview.widget.RecyclerView) viewGroup).getChildCount();
        } else if (viewGroup instanceof android.widget.ListView) {
            childCount = ((android.widget.ListView) viewGroup).getChildCount();
        } else {
            throw new java.lang.IllegalArgumentException(viewGroup.getClass().getCanonicalName() + " Must be " + androidx.recyclerview.widget.RecyclerView.class + " or " + android.widget.ListView.class);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = viewGroup.getChildAt(i2);
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        if (z) {
            androidx.recyclerview.widget.GridLayoutManager layoutManager = ((androidx.recyclerview.widget.RecyclerView) viewGroup).getLayoutManager();
            if (layoutManager == null) {
                return;
            }
            count = layoutManager.getItemCount();
            firstVisiblePosition = layoutManager.findFirstVisibleItemPosition();
            lastVisiblePosition = layoutManager.findLastVisibleItemPosition();
        } else {
            android.widget.ListView listView = (android.widget.ListView) viewGroup;
            android.widget.ListAdapter adapter = listView.getAdapter();
            if (adapter == null) {
                return;
            }
            count = adapter.getCount();
            firstVisiblePosition = listView.getFirstVisiblePosition();
            lastVisiblePosition = listView.getLastVisiblePosition();
        }
        if (lastVisiblePosition > count) {
            lastVisiblePosition = count - 1;
        }
        fillPlaceHolder(arrayList, count, firstVisiblePosition, lastVisiblePosition);
        viewParams.clear();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            android.view.View view = (android.view.View) arrayList.get(i3);
            com.luck.picture.lib.magical.ViewParams viewParams2 = new com.luck.picture.lib.magical.ViewParams();
            if (view == null) {
                viewParams2.setLeft(0);
                viewParams2.setTop(0);
                viewParams2.setWidth(0);
                viewParams2.setHeight(0);
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                viewParams2.setLeft(iArr[0]);
                viewParams2.setTop(iArr[1] - i);
                viewParams2.setWidth(view.getWidth());
                viewParams2.setHeight(view.getHeight());
            }
            viewParams.add(viewParams2);
        }
    }

    private static void fillPlaceHolder(java.util.List<android.view.View> list, int i, int i2, int i3) {
        if (i2 > 0) {
            while (i2 >= 1) {
                list.add(0, null);
                i2--;
            }
        }
        if (i3 < i) {
            for (int i4 = (i - 1) - i3; i4 >= 1; i4--) {
                list.add(null);
            }
        }
    }
}
