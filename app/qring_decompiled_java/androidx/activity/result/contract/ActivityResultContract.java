package androidx.activity.result.contract;

/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {
    public abstract android.content.Intent createIntent(android.content.Context context, I input);

    public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<O> getSynchronousResult(android.content.Context context, I input) {
        return null;
    }

    public abstract O parseResult(int resultCode, android.content.Intent intent);

    public static final class SynchronousResult<T> {
        private final T mValue;

        public SynchronousResult(T value) {
            this.mValue = value;
        }

        public T getValue() {
            return this.mValue;
        }
    }
}
