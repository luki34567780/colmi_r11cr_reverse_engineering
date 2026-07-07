package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class NativeOnCompleteListener implements com.google.android.gms.tasks.OnCompleteListener<java.lang.Object> {
    private final long zza;

    public NativeOnCompleteListener(long j) {
        this.zza = j;
    }

    public static void createAndAddCallback(com.google.android.gms.tasks.Task<java.lang.Object> task, long j) {
        task.addOnCompleteListener(new com.google.android.gms.tasks.NativeOnCompleteListener(j));
    }

    public native void nativeOnComplete(long j, java.lang.Object obj, boolean z, boolean z2, java.lang.String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(com.google.android.gms.tasks.Task<java.lang.Object> task) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
