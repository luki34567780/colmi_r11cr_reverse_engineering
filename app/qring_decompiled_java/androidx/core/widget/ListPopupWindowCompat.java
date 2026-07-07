package androidx.core.widget;

/* loaded from: classes.dex */
public final class ListPopupWindowCompat {
    private ListPopupWindowCompat() {
    }

    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(java.lang.Object obj, android.view.View view) {
        return createDragToOpenListener((android.widget.ListPopupWindow) obj, view);
    }

    public static android.view.View.OnTouchListener createDragToOpenListener(android.widget.ListPopupWindow listPopupWindow, android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return listPopupWindow.createDragToOpenListener(view);
        }
        return null;
    }
}
