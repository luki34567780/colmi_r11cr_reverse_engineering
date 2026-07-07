package androidx.lifecycle;

/* loaded from: classes.dex */
public class Transformations {
    private Transformations() {
    }

    public static <X, Y> androidx.lifecycle.LiveData<Y> map(androidx.lifecycle.LiveData<X> source, final androidx.arch.core.util.Function<X, Y> mapFunction) {
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        mediatorLiveData.addSource(source, new androidx.lifecycle.Observer<X>() { // from class: androidx.lifecycle.Transformations.1
            @Override // androidx.lifecycle.Observer
            public void onChanged(X x) {
                androidx.lifecycle.MediatorLiveData.this.setValue(mapFunction.apply(x));
            }
        });
        return mediatorLiveData;
    }

    public static <X, Y> androidx.lifecycle.LiveData<Y> switchMap(androidx.lifecycle.LiveData<X> source, final androidx.arch.core.util.Function<X, androidx.lifecycle.LiveData<Y>> switchMapFunction) {
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        mediatorLiveData.addSource(source, new androidx.lifecycle.Observer<X>() { // from class: androidx.lifecycle.Transformations.2
            androidx.lifecycle.LiveData<Y> mSource;

            @Override // androidx.lifecycle.Observer
            public void onChanged(X x) {
                androidx.lifecycle.LiveData<Y> liveData = (androidx.lifecycle.LiveData) androidx.arch.core.util.Function.this.apply(x);
                java.lang.Object obj = this.mSource;
                if (obj == liveData) {
                    return;
                }
                if (obj != null) {
                    mediatorLiveData.removeSource(obj);
                }
                this.mSource = liveData;
                if (liveData != 0) {
                    mediatorLiveData.addSource(liveData, new androidx.lifecycle.Observer<Y>() { // from class: androidx.lifecycle.Transformations.2.1
                        @Override // androidx.lifecycle.Observer
                        public void onChanged(Y y) {
                            mediatorLiveData.setValue(y);
                        }
                    });
                }
            }
        });
        return mediatorLiveData;
    }

    public static <X> androidx.lifecycle.LiveData<X> distinctUntilChanged(androidx.lifecycle.LiveData<X> source) {
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        mediatorLiveData.addSource(source, new androidx.lifecycle.Observer<X>() { // from class: androidx.lifecycle.Transformations.3
            boolean mFirstTime = true;

            @Override // androidx.lifecycle.Observer
            public void onChanged(X currentValue) {
                T value = androidx.lifecycle.MediatorLiveData.this.getValue();
                if (this.mFirstTime || ((value == 0 && currentValue != null) || !(value == 0 || value.equals(currentValue)))) {
                    this.mFirstTime = false;
                    androidx.lifecycle.MediatorLiveData.this.setValue(currentValue);
                }
            }
        });
        return mediatorLiveData;
    }
}
