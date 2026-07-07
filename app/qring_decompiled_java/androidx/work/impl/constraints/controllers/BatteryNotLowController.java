package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public class BatteryNotLowController extends androidx.work.impl.constraints.controllers.ConstraintController<java.lang.Boolean> {
    public BatteryNotLowController(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(androidx.work.impl.constraints.trackers.Trackers.getInstance(context, taskExecutor).getBatteryNotLowTracker());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean hasConstraint(androidx.work.impl.model.WorkSpec workSpec) {
        return workSpec.constraints.requiresBatteryNotLow();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(java.lang.Boolean isBatteryNotLow) {
        return !isBatteryNotLow.booleanValue();
    }
}
