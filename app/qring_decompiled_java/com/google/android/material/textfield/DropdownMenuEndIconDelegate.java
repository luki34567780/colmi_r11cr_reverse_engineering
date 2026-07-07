package com.google.android.material.textfield;

/* loaded from: /tmp/dex/classes2.dex */
class DropdownMenuEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final int ANIMATION_FADE_IN_DURATION = 67;
    private static final int ANIMATION_FADE_OUT_DURATION = 50;
    private static final boolean IS_LOLLIPOP;
    private final com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate accessibilityDelegate;
    private android.view.accessibility.AccessibilityManager accessibilityManager;
    private final com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener dropdownMenuOnEditTextAttachedListener;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    private final com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener endIconChangedListener;
    private final android.text.TextWatcher exposedDropdownEndIconTextWatcher;
    private android.animation.ValueAnimator fadeInAnim;
    private android.animation.ValueAnimator fadeOutAnim;
    private android.graphics.drawable.StateListDrawable filledPopupBackground;
    private boolean isEndIconChecked;
    private final android.view.View.OnFocusChangeListener onFocusChangeListener;
    private com.google.android.material.shape.MaterialShapeDrawable outlinedPopupBackground;

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isBoxBackgroundModeSupported(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean shouldTintIconOnError() {
        return true;
    }

    static {
        IS_LOLLIPOP = android.os.Build.VERSION.SDK_INT >= 21;
    }

    DropdownMenuEndIconDelegate(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.exposedDropdownEndIconTextWatcher = new android.text.TextWatcher() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = com.google.android.material.textfield.DropdownMenuEndIconDelegate.this;
                final android.widget.AutoCompleteTextView castAutoCompleteTextViewOrThrow = dropdownMenuEndIconDelegate.castAutoCompleteTextViewOrThrow(dropdownMenuEndIconDelegate.textInputLayout.getEditText());
                castAutoCompleteTextViewOrThrow.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean isPopupShowing = castAutoCompleteTextViewOrThrow.isPopupShowing();
                        com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.setEndIconChecked(isPopupShowing);
                        com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.dropdownPopupDirty = isPopupShowing;
                    }
                });
            }
        };
        this.onFocusChangeListener = new android.view.View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.2
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(android.view.View view, boolean z) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.textInputLayout.setEndIconActivated(z);
                if (z) {
                    return;
                }
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.setEndIconChecked(false);
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.dropdownPopupDirty = false;
            }
        };
        this.accessibilityDelegate = new com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate(this.textInputLayout) { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.3
            @Override // com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.textInputLayout.getEditText().getKeyListener() == null) {
                    accessibilityNodeInfoCompat.setClassName(android.widget.Spinner.class.getName());
                }
                if (accessibilityNodeInfoCompat.isShowingHintText()) {
                    accessibilityNodeInfoCompat.setHintText((java.lang.CharSequence) null);
                }
            }

            public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                com.google.android.material.textfield.DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = com.google.android.material.textfield.DropdownMenuEndIconDelegate.this;
                android.widget.AutoCompleteTextView castAutoCompleteTextViewOrThrow = dropdownMenuEndIconDelegate.castAutoCompleteTextViewOrThrow(dropdownMenuEndIconDelegate.textInputLayout.getEditText());
                if (accessibilityEvent.getEventType() == 1 && com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.accessibilityManager.isTouchExplorationEnabled()) {
                    com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.showHideDropdown(castAutoCompleteTextViewOrThrow);
                }
            }
        };
        this.dropdownMenuOnEditTextAttachedListener = new com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.4
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(com.google.android.material.textfield.TextInputLayout textInputLayout2) {
                android.widget.AutoCompleteTextView castAutoCompleteTextViewOrThrow = com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.castAutoCompleteTextViewOrThrow(textInputLayout2.getEditText());
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.setPopupBackground(castAutoCompleteTextViewOrThrow);
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.addRippleEffect(castAutoCompleteTextViewOrThrow);
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.setUpDropdownShowHideBehavior(castAutoCompleteTextViewOrThrow);
                castAutoCompleteTextViewOrThrow.setThreshold(0);
                castAutoCompleteTextViewOrThrow.removeTextChangedListener(com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.exposedDropdownEndIconTextWatcher);
                castAutoCompleteTextViewOrThrow.addTextChangedListener(com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.exposedDropdownEndIconTextWatcher);
                textInputLayout2.setEndIconCheckable(true);
                textInputLayout2.setErrorIconDrawable((android.graphics.drawable.Drawable) null);
                textInputLayout2.setTextInputAccessibilityDelegate(com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.accessibilityDelegate);
                textInputLayout2.setEndIconVisible(true);
            }
        };
        this.endIconChangedListener = new com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.5
            @Override // com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener
            public void onEndIconChanged(com.google.android.material.textfield.TextInputLayout textInputLayout2, int i) {
                android.widget.AutoCompleteTextView autoCompleteTextView = (android.widget.AutoCompleteTextView) textInputLayout2.getEditText();
                if (autoCompleteTextView == null || i != 3) {
                    return;
                }
                autoCompleteTextView.removeTextChangedListener(com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.exposedDropdownEndIconTextWatcher);
                if (autoCompleteTextView.getOnFocusChangeListener() == com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.onFocusChangeListener) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
        };
        this.dropdownPopupDirty = false;
        this.isEndIconChecked = false;
        this.dropdownPopupActivatedAt = Long.MAX_VALUE;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void initialize() {
        float dimensionPixelOffset = this.context.getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.context.getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.context.getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        com.google.android.material.shape.MaterialShapeDrawable popUpMaterialShapeDrawable = getPopUpMaterialShapeDrawable(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        com.google.android.material.shape.MaterialShapeDrawable popUpMaterialShapeDrawable2 = getPopUpMaterialShapeDrawable(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.outlinedPopupBackground = popUpMaterialShapeDrawable;
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        this.filledPopupBackground = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, popUpMaterialShapeDrawable);
        this.filledPopupBackground.addState(new int[0], popUpMaterialShapeDrawable2);
        this.textInputLayout.setEndIconDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(this.context, IS_LOLLIPOP ? com.google.android.material.R.drawable.mtrl_dropdown_arrow : com.google.android.material.R.drawable.mtrl_ic_arrow_drop_down));
        this.textInputLayout.setEndIconContentDescription(this.textInputLayout.getResources().getText(com.google.android.material.R.string.exposed_dropdown_menu_content_description));
        this.textInputLayout.setEndIconOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.6
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.showHideDropdown((android.widget.AutoCompleteTextView) com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.textInputLayout.getEditText());
            }
        });
        this.textInputLayout.addOnEditTextAttachedListener(this.dropdownMenuOnEditTextAttachedListener);
        this.textInputLayout.addOnEndIconChangedListener(this.endIconChangedListener);
        initAnimators();
        androidx.core.view.ViewCompat.setImportantForAccessibility(this.endIconView, 2);
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) this.context.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showHideDropdown(android.widget.AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (isDropdownPopupActive()) {
            this.dropdownPopupDirty = false;
        }
        if (!this.dropdownPopupDirty) {
            if (IS_LOLLIPOP) {
                setEndIconChecked(!this.isEndIconChecked);
            } else {
                this.isEndIconChecked = !this.isEndIconChecked;
                this.endIconView.toggle();
            }
            if (this.isEndIconChecked) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.dropdownPopupDirty = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupBackground(android.widget.AutoCompleteTextView autoCompleteTextView) {
        if (IS_LOLLIPOP) {
            int boxBackgroundMode = this.textInputLayout.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.outlinedPopupBackground);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.filledPopupBackground);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRippleEffect(android.widget.AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.textInputLayout.getBoxBackgroundMode();
        com.google.android.material.shape.MaterialShapeDrawable boxBackground = this.textInputLayout.getBoxBackground();
        int color = com.google.android.material.color.MaterialColors.getColor(autoCompleteTextView, com.google.android.material.R.attr.colorControlHighlight);
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            addRippleEffectOnOutlinedLayout(autoCompleteTextView, color, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            addRippleEffectOnFilledLayout(autoCompleteTextView, color, iArr, boxBackground);
        }
    }

    private void addRippleEffectOnOutlinedLayout(android.widget.AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable) {
        android.graphics.drawable.LayerDrawable layerDrawable;
        int color = com.google.android.material.color.MaterialColors.getColor(autoCompleteTextView, com.google.android.material.R.attr.colorSurface);
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable2 = new com.google.android.material.shape.MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int layer = com.google.android.material.color.MaterialColors.layer(i, color, 0.1f);
        materialShapeDrawable2.setFillColor(new android.content.res.ColorStateList(iArr, new int[]{layer, 0}));
        if (IS_LOLLIPOP) {
            materialShapeDrawable2.setTint(color);
            android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(iArr, new int[]{layer, color});
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable3 = new com.google.android.material.shape.MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
            materialShapeDrawable3.setTint(-1);
            layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{new android.graphics.drawable.RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
        } else {
            layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{materialShapeDrawable2, materialShapeDrawable});
        }
        androidx.core.view.ViewCompat.setBackground(autoCompleteTextView, layerDrawable);
    }

    private void addRippleEffectOnFilledLayout(android.widget.AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable) {
        int boxBackgroundColor = this.textInputLayout.getBoxBackgroundColor();
        int[] iArr2 = {com.google.android.material.color.MaterialColors.layer(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (IS_LOLLIPOP) {
            androidx.core.view.ViewCompat.setBackground(autoCompleteTextView, new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(iArr, iArr2), materialShapeDrawable, materialShapeDrawable));
            return;
        }
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable2 = new com.google.android.material.shape.MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable2.setFillColor(new android.content.res.ColorStateList(iArr, iArr2));
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{materialShapeDrawable, materialShapeDrawable2});
        int paddingStart = androidx.core.view.ViewCompat.getPaddingStart(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int paddingEnd = androidx.core.view.ViewCompat.getPaddingEnd(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        androidx.core.view.ViewCompat.setBackground(autoCompleteTextView, layerDrawable);
        androidx.core.view.ViewCompat.setPaddingRelative(autoCompleteTextView, paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpDropdownShowHideBehavior(final android.widget.AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.isDropdownPopupActive()) {
                        com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.dropdownPopupDirty = false;
                    }
                    com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.showHideDropdown(autoCompleteTextView);
                }
                return false;
            }
        });
        autoCompleteTextView.setOnFocusChangeListener(this.onFocusChangeListener);
        if (IS_LOLLIPOP) {
            autoCompleteTextView.setOnDismissListener(new android.widget.AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.8
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public void onDismiss() {
                    com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.dropdownPopupDirty = true;
                    com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.dropdownPopupActivatedAt = java.lang.System.currentTimeMillis();
                    com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.setEndIconChecked(false);
                }
            });
        }
    }

    private com.google.android.material.shape.MaterialShapeDrawable getPopUpMaterialShapeDrawable(float f, float f2, float f3, int i) {
        com.google.android.material.shape.ShapeAppearanceModel build = com.google.android.material.shape.ShapeAppearanceModel.builder().setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomLeftCornerSize(f2).setBottomRightCornerSize(f2).build();
        com.google.android.material.shape.MaterialShapeDrawable createWithElevationOverlay = com.google.android.material.shape.MaterialShapeDrawable.createWithElevationOverlay(this.context, f3);
        createWithElevationOverlay.setShapeAppearanceModel(build);
        createWithElevationOverlay.setPadding(0, i, 0, i);
        return createWithElevationOverlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDropdownPopupActive() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.dropdownPopupActivatedAt;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.widget.AutoCompleteTextView castAutoCompleteTextViewOrThrow(android.widget.EditText editText) {
        if (!(editText instanceof android.widget.AutoCompleteTextView)) {
            throw new java.lang.RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        return (android.widget.AutoCompleteTextView) editText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndIconChecked(boolean z) {
        if (this.isEndIconChecked != z) {
            this.isEndIconChecked = z;
            this.fadeInAnim.cancel();
            this.fadeOutAnim.start();
        }
    }

    private void initAnimators() {
        this.fadeInAnim = getAlphaAnimator(67, 0.0f, 1.0f);
        android.animation.ValueAnimator alphaAnimator = getAlphaAnimator(50, 1.0f, 0.0f);
        this.fadeOutAnim = alphaAnimator;
        alphaAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.endIconView.setChecked(com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.isEndIconChecked);
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.fadeInAnim.start();
            }
        });
    }

    private android.animation.ValueAnimator getAlphaAnimator(int i, float... fArr) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.endIconView.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }
}
