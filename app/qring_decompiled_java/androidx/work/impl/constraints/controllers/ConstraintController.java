package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public abstract class ConstraintController<T> implements androidx.work.impl.constraints.ConstraintListener<T> {
    private androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback mCallback;
    private T mCurrentValue;
    private final java.util.List<java.lang.String> mMatchingWorkSpecIds = new java.util.ArrayList();
    private androidx.work.impl.constraints.trackers.ConstraintTracker<T> mTracker;

    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(java.util.List<java.lang.String> workSpecIds);

        void onConstraintNotMet(java.util.List<java.lang.String> workSpecIds);
    }

    abstract boolean hasConstraint(androidx.work.impl.model.WorkSpec workSpec);

    abstract boolean isConstrained(T currentValue);

    ConstraintController(androidx.work.impl.constraints.trackers.ConstraintTracker<T> tracker) {
        this.mTracker = tracker;
    }

    public void setCallback(androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback callback) {
        if (this.mCallback != callback) {
            this.mCallback = callback;
            updateCallback(callback, this.mCurrentValue);
        }
    }

    public void replace(java.lang.Iterable<androidx.work.impl.model.WorkSpec> workSpecs) {
        this.mMatchingWorkSpecIds.clear();
        for (androidx.work.impl.model.WorkSpec workSpec : workSpecs) {
            if (hasConstraint(workSpec)) {
                this.mMatchingWorkSpecIds.add(workSpec.id);
            }
        }
        if (this.mMatchingWorkSpecIds.isEmpty()) {
            this.mTracker.removeListener(this);
        } else {
            this.mTracker.addListener(this);
        }
        updateCallback(this.mCallback, this.mCurrentValue);
    }

    public void reset() {
        if (this.mMatchingWorkSpecIds.isEmpty()) {
            return;
        }
        this.mMatchingWorkSpecIds.clear();
        this.mTracker.removeListener(this);
    }

    public boolean isWorkSpecConstrained(java.lang.String workSpecId) {
        T t = this.mCurrentValue;
        return t != null && isConstrained(t) && this.mMatchingWorkSpecIds.contains(workSpecId);
    }

    private void updateCallback(androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback callback, T currentValue) {
        if (this.mMatchingWorkSpecIds.isEmpty() || callback == null) {
            return;
        }
        if (currentValue == null || isConstrained(currentValue)) {
            callback.onConstraintNotMet(this.mMatchingWorkSpecIds);
        } else {
            callback.onConstraintMet(this.mMatchingWorkSpecIds);
        }
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public void onConstraintChanged(T newValue) {
        this.mCurrentValue = newValue;
        updateCallback(this.mCallback, newValue);
    }
}
