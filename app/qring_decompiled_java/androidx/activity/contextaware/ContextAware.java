package androidx.activity.contextaware;

/* loaded from: classes.dex */
public interface ContextAware {
    void addOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener listener);

    android.content.Context peekAvailableContext();

    void removeOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener listener);
}
