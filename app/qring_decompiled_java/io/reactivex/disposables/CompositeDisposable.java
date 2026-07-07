package io.reactivex.disposables;

/* loaded from: classes3.dex */
public final class CompositeDisposable implements io.reactivex.disposables.Disposable, io.reactivex.internal.disposables.DisposableContainer {
    volatile boolean disposed;
    io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> resources;

    public CompositeDisposable() {
    }

    public CompositeDisposable(io.reactivex.disposables.Disposable... disposableArr) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposableArr, "disposables is null");
        this.resources = new io.reactivex.internal.util.OpenHashSet<>(disposableArr.length + 1);
        for (io.reactivex.disposables.Disposable disposable : disposableArr) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "A Disposable in the disposables array is null");
            this.resources.add(disposable);
        }
    }

    public CompositeDisposable(java.lang.Iterable<? extends io.reactivex.disposables.Disposable> iterable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(iterable, "disposables is null");
        this.resources = new io.reactivex.internal.util.OpenHashSet<>();
        for (io.reactivex.disposables.Disposable disposable : iterable) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "A Disposable item in the disposables sequence is null");
            this.resources.add(disposable);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (this.disposed) {
            return;
        }
        synchronized (this) {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.resources;
            this.resources = null;
            dispose(openHashSet);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean add(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "disposable is null");
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.resources;
                    if (openHashSet == null) {
                        openHashSet = new io.reactivex.internal.util.OpenHashSet<>();
                        this.resources = openHashSet;
                    }
                    openHashSet.add(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public boolean addAll(io.reactivex.disposables.Disposable... disposableArr) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposableArr, "disposables is null");
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.resources;
                    if (openHashSet == null) {
                        openHashSet = new io.reactivex.internal.util.OpenHashSet<>(disposableArr.length + 1);
                        this.resources = openHashSet;
                    }
                    for (io.reactivex.disposables.Disposable disposable : disposableArr) {
                        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "A Disposable in the disposables array is null");
                        openHashSet.add(disposable);
                    }
                    return true;
                }
            }
        }
        for (io.reactivex.disposables.Disposable disposable2 : disposableArr) {
            disposable2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(io.reactivex.disposables.Disposable disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "disposables is null");
        if (this.disposed) {
            return false;
        }
        synchronized (this) {
            if (this.disposed) {
                return false;
            }
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.resources;
            if (openHashSet != null && openHashSet.remove(disposable)) {
                return true;
            }
            return false;
        }
    }

    public void clear() {
        if (this.disposed) {
            return;
        }
        synchronized (this) {
            if (this.disposed) {
                return;
            }
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.resources;
            this.resources = null;
            dispose(openHashSet);
        }
    }

    public int size() {
        if (this.disposed) {
            return 0;
        }
        synchronized (this) {
            if (this.disposed) {
                return 0;
            }
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.resources;
            return openHashSet != null ? openHashSet.size() : 0;
        }
    }

    void dispose(io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet) {
        if (openHashSet == null) {
            return;
        }
        java.util.ArrayList arrayList = null;
        for (java.lang.Object obj : openHashSet.keys()) {
            if (obj instanceof io.reactivex.disposables.Disposable) {
                try {
                    ((io.reactivex.disposables.Disposable) obj).dispose();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow((java.lang.Throwable) arrayList.get(0));
            }
            throw new io.reactivex.exceptions.CompositeException(arrayList);
        }
    }
}
