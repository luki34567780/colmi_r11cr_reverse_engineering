package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes.dex */
public class AlignHorizontallyReference extends androidx.constraintlayout.core.state.HelperReference {
    private float mBias;

    public AlignHorizontallyReference(androidx.constraintlayout.core.state.State state) {
        super(state, androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY);
        this.mBias = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        java.util.Iterator<java.lang.Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.ConstraintReference constraints = this.mState.constraints(it.next());
            constraints.clearHorizontal();
            if (this.mStartToStart != null) {
                constraints.startToStart(this.mStartToStart);
            } else if (this.mStartToEnd != null) {
                constraints.startToEnd(this.mStartToEnd);
            } else {
                constraints.startToStart(androidx.constraintlayout.core.state.State.PARENT);
            }
            if (this.mEndToStart != null) {
                constraints.endToStart(this.mEndToStart);
            } else if (this.mEndToEnd != null) {
                constraints.endToEnd(this.mEndToEnd);
            } else {
                constraints.endToEnd(androidx.constraintlayout.core.state.State.PARENT);
            }
            float f = this.mBias;
            if (f != 0.5f) {
                constraints.horizontalBias(f);
            }
        }
    }
}
