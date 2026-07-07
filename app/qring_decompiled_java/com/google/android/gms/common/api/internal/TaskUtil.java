package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class TaskUtil {
    public static void setResultOrApiException(com.google.android.gms.common.api.Status status, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        setResultOrApiException(status, null, taskCompletionSource);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.tasks.Task<java.lang.Void> toVoidTaskThatFailsOnFalse(com.google.android.gms.tasks.Task<java.lang.Boolean> task) {
        return task.continueWith(new com.google.android.gms.common.api.internal.zacx());
    }

    public static <ResultT> boolean trySetResultOrApiException(com.google.android.gms.common.api.Status status, ResultT resultt, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource) {
        return status.isSuccess() ? taskCompletionSource.trySetResult(resultt) : taskCompletionSource.trySetException(new com.google.android.gms.common.api.ApiException(status));
    }

    public static <TResult> void setResultOrApiException(com.google.android.gms.common.api.Status status, TResult tresult, com.google.android.gms.tasks.TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(new com.google.android.gms.common.api.ApiException(status));
        }
    }
}
