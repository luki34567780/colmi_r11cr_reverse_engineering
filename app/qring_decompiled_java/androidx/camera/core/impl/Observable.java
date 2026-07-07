package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface Observable<T> {

    public interface Observer<T> {
        void onError(java.lang.Throwable t);

        void onNewData(T value);
    }

    void addObserver(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<T> observer);

    com.google.common.util.concurrent.ListenableFuture<T> fetchData();

    void removeObserver(androidx.camera.core.impl.Observable.Observer<T> observer);
}
