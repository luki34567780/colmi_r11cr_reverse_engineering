package androidx.core.view;

/* loaded from: classes.dex */
public final class DisplayCutoutCompat {
    private final java.lang.Object mDisplayCutout;

    public DisplayCutoutCompat(android.graphics.Rect rect, java.util.List<android.graphics.Rect> list) {
        this(android.os.Build.VERSION.SDK_INT >= 28 ? new android.view.DisplayCutout(rect, list) : null);
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, androidx.core.graphics.Insets insets2) {
        this(constructDisplayCutout(insets, rect, rect2, rect3, rect4, insets2));
    }

    private static android.view.DisplayCutout constructDisplayCutout(androidx.core.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, androidx.core.graphics.Insets insets2) {
        if (androidx.core.os.BuildCompat.isAtLeastR()) {
            return new android.view.DisplayCutout(insets.toPlatformInsets(), rect, rect2, rect3, rect4, insets2.toPlatformInsets());
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return new android.view.DisplayCutout(insets.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return null;
        }
        android.graphics.Rect rect5 = new android.graphics.Rect(insets.left, insets.f21top, insets.right, insets.bottom);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return new android.view.DisplayCutout(rect5, arrayList);
    }

    private DisplayCutoutCompat(java.lang.Object obj) {
        this.mDisplayCutout = obj;
    }

    public int getSafeInsetTop() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return ((android.view.DisplayCutout) this.mDisplayCutout).getSafeInsetTop();
        }
        return 0;
    }

    public int getSafeInsetBottom() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return ((android.view.DisplayCutout) this.mDisplayCutout).getSafeInsetBottom();
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return ((android.view.DisplayCutout) this.mDisplayCutout).getSafeInsetLeft();
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return ((android.view.DisplayCutout) this.mDisplayCutout).getSafeInsetRight();
        }
        return 0;
    }

    public java.util.List<android.graphics.Rect> getBoundingRects() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return ((android.view.DisplayCutout) this.mDisplayCutout).getBoundingRects();
        }
        return java.util.Collections.emptyList();
    }

    public androidx.core.graphics.Insets getWaterfallInsets() {
        if (androidx.core.os.BuildCompat.isAtLeastR()) {
            return androidx.core.graphics.Insets.toCompatInsets(((android.view.DisplayCutout) this.mDisplayCutout).getWaterfallInsets());
        }
        return androidx.core.graphics.Insets.NONE;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return androidx.core.util.ObjectsCompat.equals(this.mDisplayCutout, ((androidx.core.view.DisplayCutoutCompat) obj).mDisplayCutout);
    }

    public int hashCode() {
        java.lang.Object obj = this.mDisplayCutout;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    static androidx.core.view.DisplayCutoutCompat wrap(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new androidx.core.view.DisplayCutoutCompat(obj);
    }

    android.view.DisplayCutout unwrap() {
        return (android.view.DisplayCutout) this.mDisplayCutout;
    }
}
