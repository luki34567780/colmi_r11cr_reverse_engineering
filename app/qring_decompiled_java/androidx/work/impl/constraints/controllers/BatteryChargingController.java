package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public class BatteryChargingController extends androidx.work.impl.constraints.controllers.ConstraintController<java.lang.Boolean> {
    public BatteryChargingController(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(androidx.work.impl.constraints.trackers.Trackers.getInstance(context, taskExecutor).getBatteryChargingTracker());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean hasConstraint(androidx.work.impl.model.WorkSpec workSpec) {
        return workSpec.constraints.requiresCharging();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(java.lang.Boolean isBatteryCharging) {
        return !isBatteryCharging.booleanValue();
    }
}
