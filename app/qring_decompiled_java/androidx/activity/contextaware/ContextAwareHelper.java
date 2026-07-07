package androidx.activity.contextaware;

/* loaded from: classes.dex */
public final class ContextAwareHelper {
    private volatile android.content.Context mContext;
    private final java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> mListeners = new java.util.concurrent.CopyOnWriteArraySet();

    public android.content.Context peekAvailableContext() {
        return this.mContext;
    }

    public void addOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener listener) {
        if (this.mContext != null) {
            listener.onContextAvailable(this.mContext);
        }
        this.mListeners.add(listener);
    }

    public void removeOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener listener) {
        this.mListeners.remove(listener);
    }

    public void dispatchOnContextAvailable(android.content.Context context) {
        this.mContext = context;
        java.util.Iterator<androidx.activity.contextaware.OnContextAvailableListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onContextAvailable(context);
        }
    }

    public void clearAvailableContext() {
        this.mContext = null;
    }
}
