package androidx.lifecycle;

/* loaded from: classes.dex */
public class MediatorLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {
    private androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>> mSources = new androidx.arch.core.internal.SafeIterableMap<>();

    public <S> void addSource(androidx.lifecycle.LiveData<S> source, androidx.lifecycle.Observer<? super S> onChanged) {
        androidx.lifecycle.MediatorLiveData.Source<?> source2 = new androidx.lifecycle.MediatorLiveData.Source<>(source, onChanged);
        androidx.lifecycle.MediatorLiveData.Source<?> putIfAbsent = this.mSources.putIfAbsent(source, source2);
        if (putIfAbsent != null && putIfAbsent.mObserver != onChanged) {
            throw new java.lang.IllegalArgumentException("This source was already added with the different observer");
        }
        if (putIfAbsent == null && hasActiveObservers()) {
            source2.plug();
        }
    }

    public <S> void removeSource(androidx.lifecycle.LiveData<S> toRemote) {
        androidx.lifecycle.MediatorLiveData.Source<?> remove = this.mSources.remove(toRemote);
        if (remove != null) {
            remove.unplug();
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        java.util.Iterator<java.util.Map.Entry<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().plug();
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        java.util.Iterator<java.util.Map.Entry<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().unplug();
        }
    }

    private static class Source<V> implements androidx.lifecycle.Observer<V> {
        final androidx.lifecycle.LiveData<V> mLiveData;
        final androidx.lifecycle.Observer<? super V> mObserver;
        int mVersion = -1;

        Source(androidx.lifecycle.LiveData<V> liveData, final androidx.lifecycle.Observer<? super V> observer) {
            this.mLiveData = liveData;
            this.mObserver = observer;
        }

        void plug() {
            this.mLiveData.observeForever(this);
        }

        void unplug() {
            this.mLiveData.removeObserver(this);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(V v) {
            if (this.mVersion != this.mLiveData.getVersion()) {
                this.mVersion = this.mLiveData.getVersion();
                this.mObserver.onChanged(v);
            }
        }
    }
}
