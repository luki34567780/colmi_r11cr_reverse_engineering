package com.qcwireless.qcwatch.ui.base.view;

/* compiled from: ConstraintRadioGroup.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J$\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020 H\u0014J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\tH\u0002J\u0016\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020\t2\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020/H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u00061"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/ConstraintRadioGroup;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lskin/support/widget/SkinCompatSupportable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "checkedButton", "Landroid/widget/CompoundButton;", "checkedChangeListener", "Lcom/qcwireless/qcwatch/ui/base/view/ConstraintRadioGroup$OnCheckedChangeListener;", "getCheckedChangeListener", "()Lcom/qcwireless/qcwatch/ui/base/view/ConstraintRadioGroup$OnCheckedChangeListener;", "setCheckedChangeListener", "(Lcom/qcwireless/qcwatch/ui/base/view/ConstraintRadioGroup$OnCheckedChangeListener;)V", "<set-?>", "", "selectedTextColor", "getSelectedTextColor", "()I", "selectedTextColorId", "Landroid/graphics/Typeface;", "selectedTextTypeface", "getSelectedTextTypeface", "()Landroid/graphics/Typeface;", "unSelectedTextColor", "getUnSelectedTextColor", "unSelectedTextColorId", "unSelectedTextTypeface", "getUnSelectedTextTypeface", "addView", "", "child", "Landroid/view/View;", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "applySkin", "onFinishInflate", "setCheckedButton", "compoundButton", "setCheckedStateForView", "checked", "", "setTypedArray", "typedArray", "Landroid/content/res/TypedArray;", "OnCheckedChangeListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ConstraintRadioGroup extends androidx.constraintlayout.widget.ConstraintLayout implements skin.support.widget.SkinCompatSupportable {
    private android.widget.CompoundButton checkedButton;
    private com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup.OnCheckedChangeListener checkedChangeListener;
    private int selectedTextColor;
    private int selectedTextColorId;
    private android.graphics.Typeface selectedTextTypeface;
    private int unSelectedTextColor;
    private int unSelectedTextColorId;
    private android.graphics.Typeface unSelectedTextTypeface;

    /* compiled from: ConstraintRadioGroup.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/ConstraintRadioGroup$OnCheckedChangeListener;", "", "onCheckedChanged", "", "group", "Lcom/qcwireless/qcwatch/ui/base/view/ConstraintRadioGroup;", "checkedButton", "Landroid/widget/CompoundButton;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnCheckedChangeListener {
        void onCheckedChanged(com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup group, android.widget.CompoundButton checkedButton);
    }

    public /* synthetic */ ConstraintRadioGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintRadioGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.selectedTextColor = -16777216;
        this.unSelectedTextColor = -16777216;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.qcwireless.qcwatch.R.styleable.ConstraintRadioGroup);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.ConstraintRadioGroup)");
        setTypedArray(obtainStyledAttributes);
    }

    public final com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup.OnCheckedChangeListener getCheckedChangeListener() {
        return this.checkedChangeListener;
    }

    public final void setCheckedChangeListener(com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.checkedChangeListener = onCheckedChangeListener;
    }

    public final int getSelectedTextColor() {
        return this.selectedTextColor;
    }

    public final int getUnSelectedTextColor() {
        return this.unSelectedTextColor;
    }

    public final android.graphics.Typeface getSelectedTextTypeface() {
        return this.selectedTextTypeface;
    }

    public final android.graphics.Typeface getUnSelectedTextTypeface() {
        return this.unSelectedTextTypeface;
    }

    private final void setTypedArray(android.content.res.TypedArray typedArray) {
        android.graphics.Typeface font;
        android.graphics.Typeface font2;
        this.selectedTextColor = typedArray.getColor(1, -16777216);
        this.unSelectedTextColor = typedArray.getColor(3, -16777216);
        this.unSelectedTextColorId = typedArray.getResourceId(3, 0);
        this.selectedTextColorId = typedArray.getResourceId(1, 0);
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                font = typedArray.getFont(0);
            } else {
                font = androidx.core.content.res.ResourcesCompat.getFont(getContext(), typedArray.getResourceId(0, 0));
            }
            this.selectedTextTypeface = font;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                font2 = typedArray.getFont(2);
            } else {
                font2 = androidx.core.content.res.ResourcesCompat.getFont(getContext(), typedArray.getResourceId(2, 0));
            }
            this.unSelectedTextTypeface = font2;
        } catch (android.content.res.Resources.NotFoundException e) {
            e.printStackTrace();
        }
        typedArray.recycle();
        applySkin();
    }

    public void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) {
        if (child instanceof android.widget.CompoundButton) {
            android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) child;
            if (compoundButton.isChecked()) {
                this.checkedButton = compoundButton;
            }
            setCheckedStateForView(compoundButton, false);
            compoundButton.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup$$ExternalSyntheticLambda0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton2, boolean z) {
                    com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup.m575addView$lambda0(com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup.this, compoundButton2, z);
                }
            });
        }
        super.addView(child, index, params);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addView$lambda-0, reason: not valid java name */
    public static final void m575addView$lambda0(com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup constraintRadioGroup, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintRadioGroup, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compoundButton, "buttonView");
        constraintRadioGroup.setCheckedButton(compoundButton);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        android.widget.CompoundButton compoundButton = this.checkedButton;
        if (compoundButton != null) {
            setCheckedStateForView(compoundButton, true);
        }
    }

    public final void setCheckedStateForView(android.widget.CompoundButton compoundButton, boolean checked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "compoundButton");
        if (checked) {
            compoundButton.setTypeface(this.selectedTextTypeface);
            compoundButton.setTextColor(this.selectedTextColor);
        } else {
            compoundButton.setTypeface(this.unSelectedTextTypeface);
            compoundButton.setTextColor(this.unSelectedTextColor);
        }
        compoundButton.setChecked(checked);
    }

    private final void setCheckedButton(android.widget.CompoundButton compoundButton) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.checkedButton, compoundButton)) {
            com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.checkedChangeListener;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, compoundButton);
            }
            setCheckedStateForView(compoundButton, true);
            android.widget.CompoundButton compoundButton2 = this.checkedButton;
            if (compoundButton2 != null) {
                setCheckedStateForView(compoundButton2, false);
            }
            this.checkedButton = compoundButton;
        }
    }

    public void applySkin() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.selectedTextColorId);
        if (checkResourceId != 0) {
            this.selectedTextColor = skin.support.content.res.SkinCompatResources.getColor(getContext(), checkResourceId);
        }
        int checkResourceId2 = skin.support.widget.SkinCompatHelper.checkResourceId(this.unSelectedTextColorId);
        if (checkResourceId2 != 0) {
            this.unSelectedTextColor = skin.support.content.res.SkinCompatResources.getColor(getContext(), checkResourceId2);
        }
        try {
            android.widget.CompoundButton compoundButton = this.checkedButton;
            if (compoundButton != null) {
                setCheckedButton(compoundButton);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
