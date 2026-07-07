package androidx.core.view.accessibility;

/* loaded from: classes.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    private static final int UNDEFINED = -1;
    private java.lang.Object mInfo;

    private static java.lang.String typeToString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    static androidx.core.view.accessibility.AccessibilityWindowInfoCompat wrapNonNullInstance(java.lang.Object obj) {
        if (obj != null) {
            return new androidx.core.view.accessibility.AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    private AccessibilityWindowInfoCompat(java.lang.Object obj) {
        this.mInfo = obj;
    }

    public int getType() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).getType();
        }
        return -1;
    }

    public int getLayer() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).getLayer();
        }
        return -1;
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getRoot() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).getRoot());
        }
        return null;
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getParent() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return wrapNonNullInstance(((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).getParent());
        }
        return null;
    }

    public int getId() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).getId();
        }
        return -1;
    }

    public void getBoundsInScreen(android.graphics.Rect rect) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            ((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).getBoundsInScreen(rect);
        }
    }

    public boolean isActive() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).isActive();
        }
        return true;
    }

    public boolean isFocused() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).isFocused();
        }
        return true;
    }

    public boolean isAccessibilityFocused() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).isAccessibilityFocused();
        }
        return true;
    }

    public int getChildCount() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).getChildCount();
        }
        return 0;
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getChild(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return wrapNonNullInstance(((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).getChild(i));
        }
        return null;
    }

    public java.lang.CharSequence getTitle() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return ((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).getTitle();
        }
        return null;
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getAnchor() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).getAnchor());
        }
        return null;
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return wrapNonNullInstance(android.view.accessibility.AccessibilityWindowInfo.obtain());
        }
        return null;
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain(androidx.core.view.accessibility.AccessibilityWindowInfoCompat accessibilityWindowInfoCompat) {
        if (android.os.Build.VERSION.SDK_INT < 21 || accessibilityWindowInfoCompat == null) {
            return null;
        }
        return wrapNonNullInstance(android.view.accessibility.AccessibilityWindowInfo.obtain((android.view.accessibility.AccessibilityWindowInfo) accessibilityWindowInfoCompat.mInfo));
    }

    public void recycle() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            ((android.view.accessibility.AccessibilityWindowInfo) this.mInfo).recycle();
        }
    }

    public int hashCode() {
        java.lang.Object obj = this.mInfo;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof androidx.core.view.accessibility.AccessibilityWindowInfoCompat)) {
            return false;
        }
        androidx.core.view.accessibility.AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (androidx.core.view.accessibility.AccessibilityWindowInfoCompat) obj;
        java.lang.Object obj2 = this.mInfo;
        if (obj2 == null) {
            if (accessibilityWindowInfoCompat.mInfo != null) {
                return false;
            }
        } else if (!obj2.equals(accessibilityWindowInfoCompat.mInfo)) {
            return false;
        }
        return true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        android.graphics.Rect rect = new android.graphics.Rect();
        getBoundsInScreen(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(getId());
        sb.append(", type=");
        sb.append(typeToString(getType()));
        sb.append(", layer=");
        sb.append(getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(isFocused());
        sb.append(", active=");
        sb.append(isActive());
        sb.append(", hasParent=");
        sb.append(getParent() != null);
        sb.append(", hasChildren=");
        sb.append(getChildCount() > 0);
        sb.append(']');
        return sb.toString();
    }
}
