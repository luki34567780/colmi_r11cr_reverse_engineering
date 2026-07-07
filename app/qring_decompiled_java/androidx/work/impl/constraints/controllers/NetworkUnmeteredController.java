package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public class NetworkUnmeteredController extends androidx.work.impl.constraints.controllers.ConstraintController<androidx.work.impl.constraints.NetworkState> {
    public NetworkUnmeteredController(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(androidx.work.impl.constraints.trackers.Trackers.getInstance(context, taskExecutor).getNetworkStateTracker());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean hasConstraint(androidx.work.impl.model.WorkSpec workSpec) {
        return workSpec.constraints.getRequiredNetworkType() == androidx.work.NetworkType.UNMETERED || (android.os.Build.VERSION.SDK_INT >= 30 && workSpec.constraints.getRequiredNetworkType() == androidx.work.NetworkType.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(androidx.work.impl.constraints.NetworkState state) {
        return !state.isConnected() || state.isMetered();
    }
}
