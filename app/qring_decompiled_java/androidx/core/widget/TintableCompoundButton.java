package androidx.core.widget;

/* loaded from: classes.dex */
public interface TintableCompoundButton {
    android.content.res.ColorStateList getSupportButtonTintList();

    android.graphics.PorterDuff.Mode getSupportButtonTintMode();

    void setSupportButtonTintList(android.content.res.ColorStateList colorStateList);

    void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode);
}
