package com.google.android.material.internal;

/* loaded from: /tmp/dex/classes2.dex */
public class NavigationMenuView extends androidx.recyclerview.widget.RecyclerView implements androidx.appcompat.view.menu.MenuView {
    public int getWindowAnimations() {
        return 0;
    }

    public void initialize(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
    }

    public NavigationMenuView(android.content.Context context) {
        this(context, null);
    }

    public NavigationMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
    }
}
