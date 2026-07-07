package androidx.transition;

/* loaded from: classes.dex */
class PathProperty<T> extends android.util.Property<T, java.lang.Float> {
    private float mCurrentFraction;
    private final float mPathLength;
    private final android.graphics.PathMeasure mPathMeasure;
    private final android.graphics.PointF mPointF;
    private final float[] mPosition;
    private final android.util.Property<T, android.graphics.PointF> mProperty;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Float get(java.lang.Object obj) {
        return get((androidx.transition.PathProperty<T>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Float f) {
        set2((androidx.transition.PathProperty<T>) obj, f);
    }

    PathProperty(android.util.Property<T, android.graphics.PointF> property, android.graphics.Path path) {
        super(java.lang.Float.class, property.getName());
        this.mPosition = new float[2];
        this.mPointF = new android.graphics.PointF();
        this.mProperty = property;
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        this.mPathMeasure = pathMeasure;
        this.mPathLength = pathMeasure.getLength();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public java.lang.Float get(T t) {
        return java.lang.Float.valueOf(this.mCurrentFraction);
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(T t, java.lang.Float f) {
        this.mCurrentFraction = f.floatValue();
        this.mPathMeasure.getPosTan(this.mPathLength * f.floatValue(), this.mPosition, null);
        this.mPointF.x = this.mPosition[0];
        this.mPointF.y = this.mPosition[1];
        this.mProperty.set(t, this.mPointF);
    }
}
