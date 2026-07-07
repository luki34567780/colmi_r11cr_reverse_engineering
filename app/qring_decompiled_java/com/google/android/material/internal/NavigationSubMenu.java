package com.google.android.material.internal;

/* loaded from: /tmp/dex/classes2.dex */
public class NavigationSubMenu extends androidx.appcompat.view.menu.SubMenuBuilder {
    public NavigationSubMenu(android.content.Context context, com.google.android.material.internal.NavigationMenu navigationMenu, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        super(context, navigationMenu, menuItemImpl);
    }

    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        getParentMenu().onItemsChanged(z);
    }
}
