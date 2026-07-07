package androidx.work.impl.constraints.controllers;

/* loaded from: classes.dex */
public class NetworkMeteredController extends androidx.work.impl.constraints.controllers.ConstraintController<androidx.work.impl.constraints.NetworkState> {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("NetworkMeteredCtrlr");

    public NetworkMeteredController(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(androidx.work.impl.constraints.trackers.Trackers.getInstance(context, taskExecutor).getNetworkStateTracker());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean hasConstraint(androidx.work.impl.model.WorkSpec workSpec) {
        return workSpec.constraints.getRequiredNetworkType() == androidx.work.NetworkType.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(androidx.work.impl.constraints.NetworkState state) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return (state.isConnected() && state.isMetered()) ? false : true;
        }
        androidx.work.Logger.get().debug(TAG, "Metered network constraint is not supported before API 26, only checking for connected state.", new java.lang.Throwable[0]);
        return !state.isConnected();
    }
}
