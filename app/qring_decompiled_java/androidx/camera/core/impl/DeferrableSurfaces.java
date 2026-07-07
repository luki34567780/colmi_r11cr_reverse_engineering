package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    public static com.google.common.util.concurrent.ListenableFuture<java.util.List<android.view.Surface>> surfaceListWithTimeout(java.util.Collection<androidx.camera.core.impl.DeferrableSurface> deferrableSurfaces, final boolean removeNullSurfaces, final long timeout, final java.util.concurrent.Executor executor, final java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = deferrableSurfaces.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSurface());
        }
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.impl.DeferrableSurfaces.lambda$surfaceListWithTimeout$3(arrayList, scheduledExecutorService, executor, timeout, removeNullSurfaces, completer);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$surfaceListWithTimeout$3(java.util.List list, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final java.util.concurrent.Executor executor, final long j, final boolean z, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        final com.google.common.util.concurrent.ListenableFuture successfulAsList = androidx.camera.core.impl.utils.futures.Futures.successfulAsList(list);
        final java.util.concurrent.ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.DeferrableSurfaces.lambda$surfaceListWithTimeout$0(com.google.common.util.concurrent.ListenableFuture.this, r2, r3);
                    }
                });
            }
        }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.ListenableFuture.this.cancel(true);
            }
        }, executor);
        androidx.camera.core.impl.utils.futures.Futures.addCallback(successfulAsList, new androidx.camera.core.impl.utils.futures.FutureCallback<java.util.List<android.view.Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.util.List<android.view.Surface> result) {
                java.util.ArrayList arrayList = new java.util.ArrayList(result);
                if (z) {
                    arrayList.removeAll(java.util.Collections.singleton(null));
                }
                completer.set(arrayList);
                schedule.cancel(true);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable t) {
                completer.set(java.util.Collections.unmodifiableList(java.util.Collections.emptyList()));
                schedule.cancel(true);
            }
        }, executor);
        return "surfaceList";
    }

    static /* synthetic */ void lambda$surfaceListWithTimeout$0(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer, long j) {
        if (listenableFuture.isDone()) {
            return;
        }
        completer.setException(new java.util.concurrent.TimeoutException("Cannot complete surfaceList within " + j));
        listenableFuture.cancel(true);
    }

    public static boolean tryIncrementAll(java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaceList) {
        try {
            incrementAll(surfaceList);
            return true;
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }

    public static void incrementAll(java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaceList) throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
        if (surfaceList.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                surfaceList.get(i).incrementUseCount();
                i++;
            } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    surfaceList.get(i2).decrementUseCount();
                }
                throw e;
            }
        } while (i < surfaceList.size());
    }

    public static void decrementAll(java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaceList) {
        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = surfaceList.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }
}
