package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class TooltipCompat {
    public static void setTooltipText(android.view.View view, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            androidx.appcompat.widget.TooltipCompatHandler.setTooltipText(view, charSequence);
        }
    }

    private TooltipCompat() {
    }
}
