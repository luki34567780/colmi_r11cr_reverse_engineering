package androidx.camera.view;

/* loaded from: classes.dex */
final class ForwardingLiveData<T> extends androidx.lifecycle.MediatorLiveData<T> {
    private androidx.lifecycle.LiveData<T> mLiveDataSource;

    ForwardingLiveData() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    void setSource(androidx.lifecycle.LiveData<T> liveData) {
        androidx.lifecycle.LiveData<T> liveData2 = this.mLiveDataSource;
        if (liveData2 != null) {
            super.removeSource(liveData2);
        }
        this.mLiveDataSource = liveData;
        super.addSource(liveData, new androidx.lifecycle.Observer() { // from class: androidx.camera.view.ForwardingLiveData$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                androidx.camera.view.ForwardingLiveData.this.setValue(obj);
            }
        });
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        androidx.lifecycle.LiveData<T> liveData = this.mLiveDataSource;
        if (liveData == null) {
            return null;
        }
        return liveData.getValue();
    }
}
