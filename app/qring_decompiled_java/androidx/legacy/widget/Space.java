package androidx.legacy.widget;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class Space extends android.view.View {
    @Override // android.view.View
    @java.lang.Deprecated
    public void draw(android.graphics.Canvas canvas) {
    }

    @java.lang.Deprecated
    public Space(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    @java.lang.Deprecated
    public Space(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @java.lang.Deprecated
    public Space(android.content.Context context) {
        this(context, null);
    }

    private static int getDefaultSize2(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : size;
        }
        return java.lang.Math.min(i, size);
    }

    @Override // android.view.View
    @java.lang.Deprecated
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize2(getSuggestedMinimumWidth(), i), getDefaultSize2(getSuggestedMinimumHeight(), i2));
    }
}
