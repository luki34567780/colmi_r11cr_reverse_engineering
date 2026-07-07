package androidx.camera.core.impl.utils.futures;

/* loaded from: classes.dex */
class ChainingListenableFuture<I, O> extends androidx.camera.core.impl.utils.futures.FutureChain<O> implements java.lang.Runnable {
    private androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> mFunction;
    private com.google.common.util.concurrent.ListenableFuture<? extends I> mInputFuture;
    private final java.util.concurrent.BlockingQueue<java.lang.Boolean> mMayInterruptIfRunningChannel = new java.util.concurrent.LinkedBlockingQueue(1);
    private final java.util.concurrent.CountDownLatch mOutputCreated = new java.util.concurrent.CountDownLatch(1);
    volatile com.google.common.util.concurrent.ListenableFuture<? extends O> mOutputFuture;

    ChainingListenableFuture(androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> function, com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture) {
        this.mFunction = (androidx.camera.core.impl.utils.futures.AsyncFunction) androidx.core.util.Preconditions.checkNotNull(function);
        this.mInputFuture = (com.google.common.util.concurrent.ListenableFuture) androidx.core.util.Preconditions.checkNotNull(inputFuture);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        if (!isDone()) {
            com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.mOutputCreated.await();
            com.google.common.util.concurrent.ListenableFuture<? extends O> listenableFuture2 = this.mOutputFuture;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return (O) super.get();
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        if (!isDone()) {
            if (timeUnit != java.util.concurrent.TimeUnit.NANOSECONDS) {
                j = java.util.concurrent.TimeUnit.NANOSECONDS.convert(j, timeUnit);
                timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
            }
            com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                long nanoTime = java.lang.System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= java.lang.Math.max(0L, java.lang.System.nanoTime() - nanoTime);
            }
            long nanoTime2 = java.lang.System.nanoTime();
            if (!this.mOutputCreated.await(j, timeUnit)) {
                throw new java.util.concurrent.TimeoutException();
            }
            j -= java.lang.Math.max(0L, java.lang.System.nanoTime() - nanoTime2);
            com.google.common.util.concurrent.ListenableFuture<? extends O> listenableFuture2 = this.mOutputFuture;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j, timeUnit);
            }
        }
        return (O) super.get(j, timeUnit);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        if (!super.cancel(mayInterruptIfRunning)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, java.lang.Boolean.valueOf(mayInterruptIfRunning));
        cancel(this.mInputFuture, mayInterruptIfRunning);
        cancel(this.mOutputFuture, mayInterruptIfRunning);
        return true;
    }

    private void cancel(java.util.concurrent.Future<?> future, boolean mayInterruptIfRunning) {
        if (future != null) {
            future.cancel(mayInterruptIfRunning);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.google.common.util.concurrent.ListenableFuture<? extends O> apply;
        try {
            try {
                try {
                    try {
                        apply = this.mFunction.apply(androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(this.mInputFuture));
                        this.mOutputFuture = apply;
                    } catch (java.lang.Error e) {
                        setException(e);
                    } catch (java.lang.reflect.UndeclaredThrowableException e2) {
                        setException(e2.getCause());
                    }
                } catch (java.lang.Throwable th) {
                    this.mFunction = null;
                    this.mInputFuture = null;
                    this.mOutputCreated.countDown();
                    throw th;
                }
            } catch (java.util.concurrent.CancellationException unused) {
                cancel(false);
            } catch (java.util.concurrent.ExecutionException e3) {
                setException(e3.getCause());
            }
        } catch (java.lang.Exception e4) {
            setException(e4);
        }
        if (isCancelled()) {
            apply.cancel(((java.lang.Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
            this.mOutputFuture = null;
            this.mFunction = null;
            this.mInputFuture = null;
            this.mOutputCreated.countDown();
            return;
        }
        apply.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.set(androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(apply));
                    } catch (java.util.concurrent.CancellationException unused2) {
                        androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.cancel(false);
                        androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.mOutputFuture = null;
                        return;
                    } catch (java.util.concurrent.ExecutionException e5) {
                        androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.setException(e5.getCause());
                    }
                    androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.mOutputFuture = null;
                } catch (java.lang.Throwable th2) {
                    androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.mOutputFuture = null;
                    throw th2;
                }
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        this.mFunction = null;
        this.mInputFuture = null;
        this.mOutputCreated.countDown();
    }

    private <E> E takeUninterruptibly(java.util.concurrent.BlockingQueue<E> queue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = queue.take();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return take;
    }

    private <E> void putUninterruptibly(java.util.concurrent.BlockingQueue<E> queue, E element) {
        boolean z = false;
        while (true) {
            try {
                queue.put(element);
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }
}
