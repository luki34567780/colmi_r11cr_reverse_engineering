package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult await(com.google.android.gms.tasks.Task<TResult> task) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        com.google.android.gms.tasks.zzad zzadVar = new com.google.android.gms.tasks.zzad(null);
        zzb(task, zzadVar);
        zzadVar.zza();
        return (TResult) zza(task);
    }

    @java.lang.Deprecated
    public static <TResult> com.google.android.gms.tasks.Task<TResult> call(java.util.concurrent.Callable<TResult> callable) {
        return call(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, callable);
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> forCanceled() {
        com.google.android.gms.tasks.zzw zzwVar = new com.google.android.gms.tasks.zzw();
        zzwVar.zzc();
        return zzwVar;
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> forException(java.lang.Exception exc) {
        com.google.android.gms.tasks.zzw zzwVar = new com.google.android.gms.tasks.zzw();
        zzwVar.zza(exc);
        return zzwVar;
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> forResult(TResult tresult) {
        com.google.android.gms.tasks.zzw zzwVar = new com.google.android.gms.tasks.zzw();
        zzwVar.zzb(tresult);
        return zzwVar;
    }

    public static com.google.android.gms.tasks.Task<java.lang.Void> whenAll(java.util.Collection<? extends com.google.android.gms.tasks.Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(null);
        }
        java.util.Iterator<? extends com.google.android.gms.tasks.Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            java.util.Objects.requireNonNull(it.next(), "null tasks are not accepted");
        }
        com.google.android.gms.tasks.zzw zzwVar = new com.google.android.gms.tasks.zzw();
        com.google.android.gms.tasks.zzaf zzafVar = new com.google.android.gms.tasks.zzaf(collection.size(), zzwVar);
        java.util.Iterator<? extends com.google.android.gms.tasks.Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            zzb(it2.next(), zzafVar);
        }
        return zzwVar;
    }

    public static com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>> whenAllComplete(java.util.Collection<? extends com.google.android.gms.tasks.Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(java.util.Collections.emptyList());
        }
        return whenAll(collection).continueWithTask(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, new com.google.android.gms.tasks.zzab(collection));
    }

    public static <TResult> com.google.android.gms.tasks.Task<java.util.List<TResult>> whenAllSuccess(java.util.Collection<? extends com.google.android.gms.tasks.Task> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(java.util.Collections.emptyList());
        }
        return (com.google.android.gms.tasks.Task<java.util.List<TResult>>) whenAll((java.util.Collection<? extends com.google.android.gms.tasks.Task<?>>) collection).continueWith(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, new com.google.android.gms.tasks.zzaa(collection));
    }

    public static <T> com.google.android.gms.tasks.Task<T> withTimeout(com.google.android.gms.tasks.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(task, "Task must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "Timeout must be positive");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        final com.google.android.gms.tasks.zzb zzbVar = new com.google.android.gms.tasks.zzb();
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(zzbVar);
        final com.google.android.gms.internal.tasks.zza zzaVar = new com.google.android.gms.internal.tasks.zza(android.os.Looper.getMainLooper());
        zzaVar.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.tasks.zzy
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.tasks.TaskCompletionSource.this.trySetException(new java.util.concurrent.TimeoutException());
            }
        }, timeUnit.toMillis(j));
        task.addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.tasks.zzx
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task2) {
                com.google.android.gms.internal.tasks.zza zzaVar2 = com.google.android.gms.internal.tasks.zza.this;
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                com.google.android.gms.tasks.zzb zzbVar2 = zzbVar;
                zzaVar2.removeCallbacksAndMessages(null);
                if (task2.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task2.getResult());
                } else {
                    if (task2.isCanceled()) {
                        zzbVar2.zza();
                        return;
                    }
                    java.lang.Exception exception = task2.getException();
                    exception.getClass();
                    taskCompletionSource2.trySetException(exception);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    private static <TResult> TResult zza(com.google.android.gms.tasks.Task<TResult> task) throws java.util.concurrent.ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new java.util.concurrent.CancellationException("Task is already canceled");
        }
        throw new java.util.concurrent.ExecutionException(task.getException());
    }

    private static <T> void zzb(com.google.android.gms.tasks.Task<T> task, com.google.android.gms.tasks.zzae<? super T> zzaeVar) {
        task.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.zza, zzaeVar);
        task.addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.zza, zzaeVar);
        task.addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.zza, zzaeVar);
    }

    @java.lang.Deprecated
    public static <TResult> com.google.android.gms.tasks.Task<TResult> call(java.util.concurrent.Executor executor, java.util.concurrent.Callable<TResult> callable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(executor, "Executor must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(callable, "Callback must not be null");
        com.google.android.gms.tasks.zzw zzwVar = new com.google.android.gms.tasks.zzw();
        executor.execute(new com.google.android.gms.tasks.zzz(zzwVar, callable));
        return zzwVar;
    }

    public static com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>> whenAllComplete(com.google.android.gms.tasks.Task<?>... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return forResult(java.util.Collections.emptyList());
        }
        return whenAllComplete(java.util.Arrays.asList(taskArr));
    }

    public static <TResult> com.google.android.gms.tasks.Task<java.util.List<TResult>> whenAllSuccess(com.google.android.gms.tasks.Task... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return forResult(java.util.Collections.emptyList());
        }
        return whenAllSuccess(java.util.Arrays.asList(taskArr));
    }

    public static <TResult> TResult await(com.google.android.gms.tasks.Task<TResult> task, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(task, "Task must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        com.google.android.gms.tasks.zzad zzadVar = new com.google.android.gms.tasks.zzad(null);
        zzb(task, zzadVar);
        if (!zzadVar.zzb(j, timeUnit)) {
            throw new java.util.concurrent.TimeoutException("Timed out waiting for Task");
        }
        return (TResult) zza(task);
    }

    public static com.google.android.gms.tasks.Task<java.lang.Void> whenAll(com.google.android.gms.tasks.Task<?>... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return forResult(null);
        }
        return whenAll(java.util.Arrays.asList(taskArr));
    }
}
