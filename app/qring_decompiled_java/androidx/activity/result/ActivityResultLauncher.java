package androidx.activity.result;

/* loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    public abstract androidx.activity.result.contract.ActivityResultContract<I, ?> getContract();

    public abstract void launch(I input, androidx.core.app.ActivityOptionsCompat options);

    public abstract void unregister();

    public void launch(I input) {
        launch(input, null);
    }
}
