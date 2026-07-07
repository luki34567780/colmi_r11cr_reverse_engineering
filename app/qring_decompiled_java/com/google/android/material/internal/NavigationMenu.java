package com.google.android.material.internal;

/* loaded from: /tmp/dex/classes2.dex */
public class NavigationMenu extends androidx.appcompat.view.menu.MenuBuilder {
    public NavigationMenu(android.content.Context context) {
        super(context);
    }

    public android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        androidx.appcompat.view.menu.MenuItemImpl addInternal = addInternal(i, i2, i3, charSequence);
        androidx.appcompat.view.menu.SubMenuBuilder navigationSubMenu = new com.google.android.material.internal.NavigationSubMenu(getContext(), this, addInternal);
        addInternal.setSubMenu(navigationSubMenu);
        return navigationSubMenu;
    }
}
