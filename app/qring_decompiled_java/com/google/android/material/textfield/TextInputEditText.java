package com.google.android.material.textfield;

/* loaded from: /tmp/dex/classes2.dex */
public class TextInputEditText extends androidx.appcompat.widget.AppCompatEditText {
    private final android.graphics.Rect parentRect;
    private boolean textInputLayoutFocusedRectEnabled;

    public TextInputEditText(android.content.Context context) {
        this(context, null);
    }

    public TextInputEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.editTextStyle);
    }

    public TextInputEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        this.parentRect = new android.graphics.Rect();
        android.content.res.TypedArray obtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.TextInputEditText, i, com.google.android.material.R.style.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        obtainStyledAttributes.recycle();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint() && super.getHint() == null && com.google.android.material.internal.ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    public java.lang.CharSequence getHint() {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    private com.google.android.material.textfield.TextInputLayout getTextInputLayout() {
        for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            if (parent instanceof com.google.android.material.textfield.TextInputLayout) {
                return (com.google.android.material.textfield.TextInputLayout) parent;
            }
        }
        return null;
    }

    private java.lang.CharSequence getHintFromLayout() {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.textInputLayoutFocusedRectEnabled = z;
    }

    public boolean isTextInputLayoutFocusedRectEnabled() {
        return this.textInputLayoutFocusedRectEnabled;
    }

    public void getFocusedRect(android.graphics.Rect rect) {
        super.getFocusedRect(rect);
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.textInputLayoutFocusedRectEnabled || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.parentRect);
        rect.bottom = this.parentRect.bottom;
    }

    public boolean getGlobalVisibleRect(android.graphics.Rect rect, android.graphics.Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.textInputLayoutFocusedRectEnabled && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.parentRect, point);
            rect.bottom = this.parentRect.bottom;
        }
        return globalVisibleRect;
    }

    public boolean requestRectangleOnScreen(android.graphics.Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.textInputLayoutFocusedRectEnabled) {
            this.parentRect.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.parentRect, true);
        }
        return requestRectangleOnScreen;
    }

    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (android.os.Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        accessibilityNodeInfo.setText(getAccessibilityNodeInfoText(textInputLayout));
    }

    private java.lang.String getAccessibilityNodeInfoText(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        android.text.Editable text = getText();
        java.lang.CharSequence hint = textInputLayout.getHint();
        java.lang.CharSequence helperText = textInputLayout.getHelperText();
        java.lang.CharSequence error = textInputLayout.getError();
        boolean z = !android.text.TextUtils.isEmpty(text);
        boolean z2 = !android.text.TextUtils.isEmpty(hint);
        boolean z3 = !android.text.TextUtils.isEmpty(helperText);
        boolean z4 = !android.text.TextUtils.isEmpty(error);
        java.lang.String str = "";
        java.lang.String charSequence = z2 ? hint.toString() : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence);
        sb.append(((z4 || z3) && !android.text.TextUtils.isEmpty(charSequence)) ? ", " : "");
        java.lang.String sb2 = sb.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(sb2);
        if (z4) {
            helperText = error;
        } else if (!z3) {
            helperText = "";
        }
        sb3.append((java.lang.Object) helperText);
        java.lang.String sb4 = sb3.toString();
        if (!z) {
            return !android.text.TextUtils.isEmpty(sb4) ? sb4 : "";
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append((java.lang.Object) text);
        if (!android.text.TextUtils.isEmpty(sb4)) {
            str = ", " + sb4;
        }
        sb5.append(str);
        return sb5.toString();
    }
}
