package com.google.android.material.bottomnavigation;

/* loaded from: /tmp/dex/classes2.dex */
public final class BottomNavigationMenu extends androidx.appcompat.view.menu.MenuBuilder {
    public static final int MAX_ITEM_COUNT = 5;

    public BottomNavigationMenu(android.content.Context context) {
        super(context);
    }

    public android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        throw new java.lang.UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    protected android.view.MenuItem addInternal(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        if (size() + 1 > 5) {
            throw new java.lang.IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
        }
        stopDispatchingItemsChanged();
        androidx.appcompat.view.menu.MenuItemImpl addInternal = super.addInternal(i, i2, i3, charSequence);
        if (addInternal instanceof androidx.appcompat.view.menu.MenuItemImpl) {
            addInternal.setExclusiveCheckable(true);
        }
        startDispatchingItemsChanged();
        return addInternal;
    }
}
