package androidx.activity.result;

/* loaded from: classes.dex */
public interface ActivityResultCaller {
    <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> contract, androidx.activity.result.ActivityResultCallback<O> callback);

    <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> contract, androidx.activity.result.ActivityResultRegistry registry, androidx.activity.result.ActivityResultCallback<O> callback);
}
