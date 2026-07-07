package androidx.databinding;

/* loaded from: classes.dex */
public class MapChangeRegistry extends androidx.databinding.CallbackRegistry<androidx.databinding.ObservableMap.OnMapChangedCallback, androidx.databinding.ObservableMap, java.lang.Object> {
    private static androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.ObservableMap.OnMapChangedCallback, androidx.databinding.ObservableMap, java.lang.Object> NOTIFIER_CALLBACK = new androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.ObservableMap.OnMapChangedCallback, androidx.databinding.ObservableMap, java.lang.Object>() { // from class: androidx.databinding.MapChangeRegistry.1
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(androidx.databinding.ObservableMap.OnMapChangedCallback onMapChangedCallback, androidx.databinding.ObservableMap observableMap, int i, java.lang.Object obj) {
            onMapChangedCallback.onMapChanged(observableMap, obj);
        }
    };

    public MapChangeRegistry() {
        super(NOTIFIER_CALLBACK);
    }

    public void notifyChange(androidx.databinding.ObservableMap observableMap, java.lang.Object obj) {
        notifyCallbacks(observableMap, 0, obj);
    }
}
