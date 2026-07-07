package coil.size;

/* compiled from: Size.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcoil/size/Size;", "", "width", "Lcoil/size/Dimension;", "height", "(Lcoil/size/Dimension;Lcoil/size/Dimension;)V", "getHeight", "()Lcoil/size/Dimension;", "getWidth", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "Companion", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Size {
    public static final coil.size.Size ORIGINAL = new coil.size.Size(coil.size.Dimension.Undefined.INSTANCE, coil.size.Dimension.Undefined.INSTANCE);
    private final coil.size.Dimension height;
    private final coil.size.Dimension width;

    public static /* synthetic */ coil.size.Size copy$default(coil.size.Size size, coil.size.Dimension dimension, coil.size.Dimension dimension2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dimension = size.width;
        }
        if ((i & 2) != 0) {
            dimension2 = size.height;
        }
        return size.copy(dimension, dimension2);
    }

    /* renamed from: component1, reason: from getter */
    public final coil.size.Dimension getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final coil.size.Dimension getHeight() {
        return this.height;
    }

    public final coil.size.Size copy(coil.size.Dimension width, coil.size.Dimension height) {
        return new coil.size.Size(width, height);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil.size.Size)) {
            return false;
        }
        coil.size.Size size = (coil.size.Size) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.width, size.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, size.height);
    }

    public int hashCode() {
        return (this.width.hashCode() * 31) + this.height.hashCode();
    }

    public java.lang.String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ')';
    }

    public Size(coil.size.Dimension dimension, coil.size.Dimension dimension2) {
        this.width = dimension;
        this.height = dimension2;
    }

    public final coil.size.Dimension getWidth() {
        return this.width;
    }

    public final coil.size.Dimension getHeight() {
        return this.height;
    }
}
