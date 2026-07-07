package androidx.lifecycle;

/* loaded from: classes.dex */
public interface LifecycleEventObserver extends androidx.lifecycle.LifecycleObserver {
    void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event);
}
