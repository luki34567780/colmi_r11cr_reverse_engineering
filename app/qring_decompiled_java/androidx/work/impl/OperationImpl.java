package androidx.work.impl;

/* loaded from: classes.dex */
public class OperationImpl implements androidx.work.Operation {
    private final androidx.lifecycle.MutableLiveData<androidx.work.Operation.State> mOperationState = new androidx.lifecycle.MutableLiveData<>();
    private final androidx.work.impl.utils.futures.SettableFuture<androidx.work.Operation.State.SUCCESS> mOperationFuture = androidx.work.impl.utils.futures.SettableFuture.create();

    public OperationImpl() {
        setState(androidx.work.Operation.IN_PROGRESS);
    }

    @Override // androidx.work.Operation
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> getResult() {
        return this.mOperationFuture;
    }

    @Override // androidx.work.Operation
    public androidx.lifecycle.LiveData<androidx.work.Operation.State> getState() {
        return this.mOperationState;
    }

    public void setState(androidx.work.Operation.State state) {
        this.mOperationState.postValue(state);
        if (state instanceof androidx.work.Operation.State.SUCCESS) {
            this.mOperationFuture.set((androidx.work.Operation.State.SUCCESS) state);
        } else if (state instanceof androidx.work.Operation.State.FAILURE) {
            this.mOperationFuture.setException(((androidx.work.Operation.State.FAILURE) state).getThrowable());
        }
    }
}
