package com.google.android.material.bottomnavigation;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomNavigationPresenter implements androidx.appcompat.view.menu.MenuPresenter {
    private int id;
    private androidx.appcompat.view.menu.MenuBuilder menu;
    private com.google.android.material.bottomnavigation.BottomNavigationMenuView menuView;
    private boolean updateSuspended = false;

    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
    }

    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
    }

    public void setBottomNavigationMenuView(com.google.android.material.bottomnavigation.BottomNavigationMenuView bottomNavigationMenuView) {
        this.menuView = bottomNavigationMenuView;
    }

    public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this.menu = menuBuilder;
        this.menuView.initialize(menuBuilder);
    }

    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
        return this.menuView;
    }

    public void updateMenuView(boolean z) {
        if (this.updateSuspended) {
            return;
        }
        if (z) {
            this.menuView.buildMenuView();
        } else {
            this.menuView.updateMenuView();
        }
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }

    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState savedState = new com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = com.google.android.material.badge.BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState) {
            com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState savedState = (com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.setBadgeDrawables(com.google.android.material.badge.BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState>() { // from class: com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState[] newArray(int i) {
                return new com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState[i];
            }
        };
        com.google.android.material.internal.ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(android.os.Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (com.google.android.material.internal.ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }
    }
}
