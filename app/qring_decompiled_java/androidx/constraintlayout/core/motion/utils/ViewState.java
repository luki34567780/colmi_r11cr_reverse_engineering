package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class ViewState {
    public int bottom;
    public int left;
    public int right;
    public float rotation;

    /* renamed from: top, reason: collision with root package name */
    public int f14top;

    public void getState(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        this.left = motionWidget.getLeft();
        this.f14top = motionWidget.getTop();
        this.right = motionWidget.getRight();
        this.bottom = motionWidget.getBottom();
        this.rotation = (int) motionWidget.getRotationZ();
    }

    public int width() {
        return this.right - this.left;
    }

    public int height() {
        return this.bottom - this.f14top;
    }
}
