package androidx.databinding;

/* loaded from: classes.dex */
public class PropertyChangeRegistry extends androidx.databinding.CallbackRegistry<androidx.databinding.Observable.OnPropertyChangedCallback, androidx.databinding.Observable, java.lang.Void> {
    private static final androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.Observable.OnPropertyChangedCallback, androidx.databinding.Observable, java.lang.Void> NOTIFIER_CALLBACK = new androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.Observable.OnPropertyChangedCallback, androidx.databinding.Observable, java.lang.Void>() { // from class: androidx.databinding.PropertyChangeRegistry.1
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(androidx.databinding.Observable.OnPropertyChangedCallback onPropertyChangedCallback, androidx.databinding.Observable observable, int i, java.lang.Void r4) {
            onPropertyChangedCallback.onPropertyChanged(observable, i);
        }
    };

    public PropertyChangeRegistry() {
        super(NOTIFIER_CALLBACK);
    }

    public void notifyChange(androidx.databinding.Observable observable, int i) {
        notifyCallbacks(observable, i, null);
    }
}
