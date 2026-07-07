package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class DuplicateTaskCompletionException extends java.lang.IllegalStateException {
    private DuplicateTaskCompletionException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public static java.lang.IllegalStateException of(com.google.android.gms.tasks.Task<?> task) {
        java.lang.String str;
        if (!task.isComplete()) {
            return new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        java.lang.Exception exception = task.getException();
        if (exception != null) {
            str = "failure";
        } else if (task.isSuccessful()) {
            java.lang.String valueOf = java.lang.String.valueOf(task.getResult());
            java.lang.String.valueOf(valueOf).length();
            str = "result ".concat(java.lang.String.valueOf(valueOf));
        } else {
            str = task.isCanceled() ? "cancellation" : "unknown issue";
        }
        return new com.google.android.gms.tasks.DuplicateTaskCompletionException(str.length() != 0 ? "Complete with: ".concat(str) : new java.lang.String("Complete with: "), exception);
    }
}
