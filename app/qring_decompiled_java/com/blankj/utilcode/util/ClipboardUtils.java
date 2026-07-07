package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class ClipboardUtils {
    private ClipboardUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static void copyText(java.lang.CharSequence charSequence) {
        ((android.content.ClipboardManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText(com.blankj.utilcode.util.Utils.getApp().getPackageName(), charSequence));
    }

    public static void copyText(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        ((android.content.ClipboardManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText(charSequence, charSequence2));
    }

    public static void clear() {
        ((android.content.ClipboardManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText(null, ""));
    }

    public static java.lang.CharSequence getLabel() {
        java.lang.CharSequence label;
        android.content.ClipDescription primaryClipDescription = ((android.content.ClipboardManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("clipboard")).getPrimaryClipDescription();
        return (primaryClipDescription == null || (label = primaryClipDescription.getLabel()) == null) ? "" : label;
    }

    public static java.lang.CharSequence getText() {
        java.lang.CharSequence coerceToText;
        android.content.ClipData primaryClip = ((android.content.ClipboardManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("clipboard")).getPrimaryClip();
        return (primaryClip == null || primaryClip.getItemCount() <= 0 || (coerceToText = primaryClip.getItemAt(0).coerceToText(com.blankj.utilcode.util.Utils.getApp())) == null) ? "" : coerceToText;
    }

    public static void addChangedListener(android.content.ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener) {
        ((android.content.ClipboardManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("clipboard")).addPrimaryClipChangedListener(onPrimaryClipChangedListener);
    }

    public static void removeChangedListener(android.content.ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener) {
        ((android.content.ClipboardManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("clipboard")).removePrimaryClipChangedListener(onPrimaryClipChangedListener);
    }
}
