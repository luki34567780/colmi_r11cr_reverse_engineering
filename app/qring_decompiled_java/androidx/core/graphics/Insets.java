package androidx.core.graphics;

/* loaded from: classes.dex */
public final class Insets {
    public static final androidx.core.graphics.Insets NONE = new androidx.core.graphics.Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;

    /* renamed from: top, reason: collision with root package name */
    public final int f21top;

    private Insets(int i, int i2, int i3, int i4) {
        this.left = i;
        this.f21top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public static androidx.core.graphics.Insets of(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return NONE;
        }
        return new androidx.core.graphics.Insets(i, i2, i3, i4);
    }

    public static androidx.core.graphics.Insets of(android.graphics.Rect rect) {
        return of(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static androidx.core.graphics.Insets add(androidx.core.graphics.Insets insets, androidx.core.graphics.Insets insets2) {
        return of(insets.left + insets2.left, insets.f21top + insets2.f21top, insets.right + insets2.right, insets.bottom + insets2.bottom);
    }

    public static androidx.core.graphics.Insets subtract(androidx.core.graphics.Insets insets, androidx.core.graphics.Insets insets2) {
        return of(insets.left - insets2.left, insets.f21top - insets2.f21top, insets.right - insets2.right, insets.bottom - insets2.bottom);
    }

    public static androidx.core.graphics.Insets max(androidx.core.graphics.Insets insets, androidx.core.graphics.Insets insets2) {
        return of(java.lang.Math.max(insets.left, insets2.left), java.lang.Math.max(insets.f21top, insets2.f21top), java.lang.Math.max(insets.right, insets2.right), java.lang.Math.max(insets.bottom, insets2.bottom));
    }

    public static androidx.core.graphics.Insets min(androidx.core.graphics.Insets insets, androidx.core.graphics.Insets insets2) {
        return of(java.lang.Math.min(insets.left, insets2.left), java.lang.Math.min(insets.f21top, insets2.f21top), java.lang.Math.min(insets.right, insets2.right), java.lang.Math.min(insets.bottom, insets2.bottom));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.core.graphics.Insets insets = (androidx.core.graphics.Insets) obj;
        return this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.f21top == insets.f21top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.f21top) * 31) + this.right) * 31) + this.bottom;
    }

    public java.lang.String toString() {
        return "Insets{left=" + this.left + ", top=" + this.f21top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    @java.lang.Deprecated
    public static androidx.core.graphics.Insets wrap(android.graphics.Insets insets) {
        return toCompatInsets(insets);
    }

    public static androidx.core.graphics.Insets toCompatInsets(android.graphics.Insets insets) {
        return of(insets.left, insets.top, insets.right, insets.bottom);
    }

    public android.graphics.Insets toPlatformInsets() {
        return android.graphics.Insets.of(this.left, this.f21top, this.right, this.bottom);
    }
}
