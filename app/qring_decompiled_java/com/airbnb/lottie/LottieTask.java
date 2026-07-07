package com.airbnb.lottie;

/* loaded from: classes.dex */
public class LottieTask<T> {
    public static java.util.concurrent.Executor EXECUTOR = java.util.concurrent.Executors.newCachedThreadPool();
    private final java.util.Set<com.airbnb.lottie.LottieListener<java.lang.Throwable>> failureListeners;
    private final android.os.Handler handler;
    private volatile com.airbnb.lottie.LottieResult<T> result;
    private final java.util.Set<com.airbnb.lottie.LottieListener<T>> successListeners;

    public LottieTask(java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<T>> callable) {
        this(callable, false);
    }

    LottieTask(java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<T>> callable, boolean z) {
        this.successListeners = new java.util.LinkedHashSet(1);
        this.failureListeners = new java.util.LinkedHashSet(1);
        this.handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.result = null;
        if (z) {
            try {
                setResult(callable.call());
                return;
            } catch (java.lang.Throwable th) {
                setResult(new com.airbnb.lottie.LottieResult<>(th));
                return;
            }
        }
        EXECUTOR.execute(new com.airbnb.lottie.LottieTask.LottieFutureTask(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(com.airbnb.lottie.LottieResult<T> lottieResult) {
        if (this.result != null) {
            throw new java.lang.IllegalStateException("A task may only be set once.");
        }
        this.result = lottieResult;
        notifyListeners();
    }

    public synchronized com.airbnb.lottie.LottieTask<T> addListener(com.airbnb.lottie.LottieListener<T> lottieListener) {
        if (this.result != null && this.result.getValue() != null) {
            lottieListener.onResult(this.result.getValue());
        }
        this.successListeners.add(lottieListener);
        return this;
    }

    public synchronized com.airbnb.lottie.LottieTask<T> removeListener(com.airbnb.lottie.LottieListener<T> lottieListener) {
        this.successListeners.remove(lottieListener);
        return this;
    }

    public synchronized com.airbnb.lottie.LottieTask<T> addFailureListener(com.airbnb.lottie.LottieListener<java.lang.Throwable> lottieListener) {
        if (this.result != null && this.result.getException() != null) {
            lottieListener.onResult(this.result.getException());
        }
        this.failureListeners.add(lottieListener);
        return this;
    }

    public synchronized com.airbnb.lottie.LottieTask<T> removeFailureListener(com.airbnb.lottie.LottieListener<java.lang.Throwable> lottieListener) {
        this.failureListeners.remove(lottieListener);
        return this;
    }

    private void notifyListeners() {
        this.handler.post(new java.lang.Runnable() { // from class: com.airbnb.lottie.LottieTask.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.airbnb.lottie.LottieTask.this.result == null) {
                    return;
                }
                com.airbnb.lottie.LottieResult lottieResult = com.airbnb.lottie.LottieTask.this.result;
                if (lottieResult.getValue() != null) {
                    com.airbnb.lottie.LottieTask.this.notifySuccessListeners(lottieResult.getValue());
                } else {
                    com.airbnb.lottie.LottieTask.this.notifyFailureListeners(lottieResult.getException());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifySuccessListeners(T t) {
        java.util.Iterator it = new java.util.ArrayList(this.successListeners).iterator();
        while (it.hasNext()) {
            ((com.airbnb.lottie.LottieListener) it.next()).onResult(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyFailureListeners(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.failureListeners);
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.utils.Logger.warning("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.airbnb.lottie.LottieListener) it.next()).onResult(th);
        }
    }

    private class LottieFutureTask extends java.util.concurrent.FutureTask<com.airbnb.lottie.LottieResult<T>> {
        LottieFutureTask(java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                com.airbnb.lottie.LottieTask.this.setResult(get());
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                com.airbnb.lottie.LottieTask.this.setResult(new com.airbnb.lottie.LottieResult(e));
            }
        }
    }
}
