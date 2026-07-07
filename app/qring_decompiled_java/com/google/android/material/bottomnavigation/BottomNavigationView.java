package com.google.android.material.bottomnavigation;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomNavigationView extends android.widget.FrameLayout {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_BottomNavigationView;
    private static final int MENU_PRESENTER_ID = 1;
    private android.content.res.ColorStateList itemRippleColor;
    private final androidx.appcompat.view.menu.MenuBuilder menu;
    private android.view.MenuInflater menuInflater;
    final com.google.android.material.bottomnavigation.BottomNavigationMenuView menuView;
    private final com.google.android.material.bottomnavigation.BottomNavigationPresenter presenter;
    private com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener reselectedListener;
    private com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener selectedListener;

    public interface OnNavigationItemReselectedListener {
        void onNavigationItemReselected(android.view.MenuItem menuItem);
    }

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(android.view.MenuItem menuItem);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public BottomNavigationView(android.content.Context context) {
        this(context, null);
    }

    public BottomNavigationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        com.google.android.material.bottomnavigation.BottomNavigationPresenter bottomNavigationPresenter = new com.google.android.material.bottomnavigation.BottomNavigationPresenter();
        this.presenter = bottomNavigationPresenter;
        android.content.Context context2 = getContext();
        com.google.android.material.bottomnavigation.BottomNavigationMenu bottomNavigationMenu = new com.google.android.material.bottomnavigation.BottomNavigationMenu(context2);
        this.menu = bottomNavigationMenu;
        com.google.android.material.bottomnavigation.BottomNavigationMenuView bottomNavigationMenuView = new com.google.android.material.bottomnavigation.BottomNavigationMenuView(context2);
        this.menuView = bottomNavigationMenuView;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        bottomNavigationPresenter.setBottomNavigationMenuView(bottomNavigationMenuView);
        bottomNavigationPresenter.setId(1);
        bottomNavigationMenuView.setPresenter(bottomNavigationPresenter);
        bottomNavigationMenu.addMenuPresenter(bottomNavigationPresenter);
        bottomNavigationPresenter.initForMenu(getContext(), bottomNavigationMenu);
        androidx.appcompat.widget.TintTypedArray obtainTintedStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.BottomNavigationView, i, com.google.android.material.R.style.Widget_Design_BottomNavigationView, com.google.android.material.R.styleable.BottomNavigationView_itemTextAppearanceInactive, com.google.android.material.R.styleable.BottomNavigationView_itemTextAppearanceActive);
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomNavigationView_itemIconTint)) {
            bottomNavigationMenuView.setIconTintList(obtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.BottomNavigationView_itemIconTint));
        } else {
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.createDefaultColorStateList(android.R.attr.textColorSecondary));
        }
        setItemIconSize(obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_icon_size)));
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(obtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(obtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomNavigationView_itemTextColor)) {
            setItemTextColor(obtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof android.graphics.drawable.ColorDrawable)) {
            androidx.core.view.ViewCompat.setBackground(this, createMaterialShapeDrawableBackground(context2));
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomNavigationView_elevation)) {
            androidx.core.view.ViewCompat.setElevation(this, obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.BottomNavigationView_elevation, 0));
        }
        androidx.core.graphics.drawable.DrawableCompat.setTintList(getBackground().mutate(), com.google.android.material.resources.MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, com.google.android.material.R.styleable.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(obtainTintedStyledAttributes.getInteger(com.google.android.material.R.styleable.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(obtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int resourceId = obtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.BottomNavigationView_itemBackground, 0);
        if (resourceId != 0) {
            bottomNavigationMenuView.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(com.google.android.material.resources.MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, com.google.android.material.R.styleable.BottomNavigationView_itemRippleColor));
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomNavigationView_menu)) {
            inflateMenu(obtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.BottomNavigationView_menu, 0));
        }
        obtainTintedStyledAttributes.recycle();
        addView(bottomNavigationMenuView, layoutParams);
        if (android.os.Build.VERSION.SDK_INT < 21) {
            addCompatibilityTopDivider(context2);
        }
        bottomNavigationMenu.setCallback(new androidx.appcompat.view.menu.MenuBuilder.Callback() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            }

            public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
                if (com.google.android.material.bottomnavigation.BottomNavigationView.this.reselectedListener == null || menuItem.getItemId() != com.google.android.material.bottomnavigation.BottomNavigationView.this.getSelectedItemId()) {
                    return (com.google.android.material.bottomnavigation.BottomNavigationView.this.selectedListener == null || com.google.android.material.bottomnavigation.BottomNavigationView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
                }
                com.google.android.material.bottomnavigation.BottomNavigationView.this.reselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }
        });
        applyWindowInsets();
    }

    private void applyWindowInsets() {
        com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(this, new com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.2
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom += windowInsetsCompat.getSystemWindowInsetBottom();
                relativePadding.applyToView(view);
                return windowInsetsCompat;
            }
        });
    }

    private com.google.android.material.shape.MaterialShapeDrawable createMaterialShapeDrawableBackground(android.content.Context context) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (background instanceof android.graphics.drawable.ColorDrawable) {
            materialShapeDrawable.setFillColor(android.content.res.ColorStateList.valueOf(((android.graphics.drawable.ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.initializeElevationOverlay(context);
        return materialShapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.shape.MaterialShapeUtils.setElevation(this, f);
    }

    public void setOnNavigationItemSelectedListener(com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.selectedListener = onNavigationItemSelectedListener;
    }

    public void setOnNavigationItemReselectedListener(com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        this.reselectedListener = onNavigationItemReselectedListener;
    }

    public android.view.Menu getMenu() {
        return this.menu;
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public android.content.res.ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    public void setItemIconTintList(android.content.res.ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemIconSize(int i) {
        this.menuView.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    public android.content.res.ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public void setItemTextColor(android.content.res.ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    @java.lang.Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public void setItemBackgroundResource(int i) {
        this.menuView.setItemBackgroundRes(i);
        this.itemRippleColor = null;
    }

    public android.graphics.drawable.Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        this.menuView.setItemBackground(drawable);
        this.itemRippleColor = null;
    }

    public android.content.res.ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    public void setItemRippleColor(android.content.res.ColorStateList colorStateList) {
        if (this.itemRippleColor == colorStateList) {
            if (colorStateList != null || this.menuView.getItemBackground() == null) {
                return;
            }
            this.menuView.setItemBackground(null);
            return;
        }
        this.itemRippleColor = colorStateList;
        if (colorStateList == null) {
            this.menuView.setItemBackground(null);
            return;
        }
        android.content.res.ColorStateList convertToRippleDrawableColor = com.google.android.material.ripple.RippleUtils.convertToRippleDrawableColor(colorStateList);
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.menuView.setItemBackground(new android.graphics.drawable.RippleDrawable(convertToRippleDrawableColor, null, null));
            return;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        android.graphics.drawable.Drawable wrap = androidx.core.graphics.drawable.DrawableCompat.wrap(gradientDrawable);
        androidx.core.graphics.drawable.DrawableCompat.setTintList(wrap, convertToRippleDrawableColor);
        this.menuView.setItemBackground(wrap);
    }

    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void setSelectedItemId(int i) {
        android.view.MenuItem findItem = this.menu.findItem(i);
        if (findItem == null || this.menu.performItemAction(findItem, this.presenter, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.menuView.getLabelVisibilityMode() != i) {
            this.menuView.setLabelVisibilityMode(i);
            this.presenter.updateMenuView(false);
        }
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public void setItemTextAppearanceInactive(int i) {
        this.menuView.setItemTextAppearanceInactive(i);
    }

    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    public void setItemTextAppearanceActive(int i) {
        this.menuView.setItemTextAppearanceActive(i);
    }

    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.menuView.isItemHorizontalTranslationEnabled() != z) {
            this.menuView.setItemHorizontalTranslationEnabled(z);
            this.presenter.updateMenuView(false);
        }
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.menuView.isItemHorizontalTranslationEnabled();
    }

    public com.google.android.material.badge.BadgeDrawable getBadge(int i) {
        return this.menuView.getBadge(i);
    }

    public com.google.android.material.badge.BadgeDrawable getOrCreateBadge(int i) {
        return this.menuView.getOrCreateBadge(i);
    }

    public void removeBadge(int i) {
        this.menuView.removeBadge(i);
    }

    private void addCompatibilityTopDivider(android.content.Context context) {
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(androidx.core.content.ContextCompat.getColor(context, com.google.android.material.R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private android.view.MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new androidx.appcompat.view.SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, com.google.android.material.bottomnavigation.BottomNavigationView$SavedState] */
    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        ?? savedState = new com.google.android.material.bottomnavigation.BottomNavigationView.SavedState(super.onSaveInstanceState());
        savedState.menuPresenterState = new android.os.Bundle();
        this.menu.savePresenterStates(savedState.menuPresenterState);
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.bottomnavigation.BottomNavigationView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.bottomnavigation.BottomNavigationView.SavedState savedState = (com.google.android.material.bottomnavigation.BottomNavigationView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomnavigation.BottomNavigationView.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.bottomnavigation.BottomNavigationView.SavedState>() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.bottomnavigation.BottomNavigationView.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.bottomnavigation.BottomNavigationView.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomnavigation.BottomNavigationView.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.bottomnavigation.BottomNavigationView.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomnavigation.BottomNavigationView.SavedState[] newArray(int i) {
                return new com.google.android.material.bottomnavigation.BottomNavigationView.SavedState[i];
            }
        };
        android.os.Bundle menuPresenterState;

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }

        private void readFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }
    }
}
