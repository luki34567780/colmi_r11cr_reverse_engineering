package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public class NetworkConnectedController extends androidx.work.impl.constraints.controllers.ConstraintController<androidx.work.impl.constraints.NetworkState> {
    public NetworkConnectedController(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(androidx.work.impl.constraints.trackers.Trackers.getInstance(context, taskExecutor).getNetworkStateTracker());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean hasConstraint(androidx.work.impl.model.WorkSpec workSpec) {
        return workSpec.constraints.getRequiredNetworkType() == androidx.work.NetworkType.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(androidx.work.impl.constraints.NetworkState state) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return (state.isConnected() && state.isValidated()) ? false : true;
        }
        return !state.isConnected();
    }
}
