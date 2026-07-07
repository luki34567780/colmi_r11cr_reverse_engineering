package androidx.core.widget;

/* loaded from: classes.dex */
public final class PopupMenuCompat {
    private PopupMenuCompat() {
    }

    public static android.view.View.OnTouchListener getDragToOpenListener(java.lang.Object obj) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return ((android.widget.PopupMenu) obj).getDragToOpenListener();
        }
        return null;
    }
}
