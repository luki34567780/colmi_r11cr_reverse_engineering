package androidx.camera.core.impl.utils.futures;

/* loaded from: classes.dex */
public interface FutureCallback<V> {
    void onFailure(java.lang.Throwable t);

    void onSuccess(V result);
}
