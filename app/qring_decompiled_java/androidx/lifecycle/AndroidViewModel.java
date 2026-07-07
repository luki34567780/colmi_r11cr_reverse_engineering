package androidx.lifecycle;

/* loaded from: classes.dex */
public class AndroidViewModel extends androidx.lifecycle.ViewModel {
    private android.app.Application mApplication;

    public AndroidViewModel(android.app.Application application) {
        this.mApplication = application;
    }

    public <T extends android.app.Application> T getApplication() {
        return (T) this.mApplication;
    }
}
