package io.reactivex.internal.disposables;

/* loaded from: classes3.dex */
public final class ListCompositeDisposable implements io.reactivex.disposables.Disposable, io.reactivex.internal.disposables.DisposableContainer {
    volatile boolean disposed;
    java.util.List<io.reactivex.disposables.Disposable> resources;

    public ListCompositeDisposable() {
    }

    public ListCompositeDisposable(io.reactivex.disposables.Disposable... disposableArr) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposableArr, "resources is null");
        this.resources = new java.util.LinkedList();
        for (io.reactivex.disposables.Disposable disposable : disposableArr) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.resources.add(disposable);
        }
    }

    public ListCompositeDisposable(java.lang.Iterable<? extends io.reactivex.disposables.Disposable> iterable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(iterable, "resources is null");
        this.resources = new java.util.LinkedList();
        for (io.reactivex.disposables.Disposable disposable : iterable) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "Disposable item is null");
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
            java.util.List<io.reactivex.disposables.Disposable> list = this.resources;
            this.resources = null;
            dispose(list);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean add(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "d is null");
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    java.util.List list = this.resources;
                    if (list == null) {
                        list = new java.util.LinkedList();
                        this.resources = list;
                    }
                    list.add(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public boolean addAll(io.reactivex.disposables.Disposable... disposableArr) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposableArr, "ds is null");
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    java.util.List list = this.resources;
                    if (list == null) {
                        list = new java.util.LinkedList();
                        this.resources = list;
                    }
                    for (io.reactivex.disposables.Disposable disposable : disposableArr) {
                        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "d is null");
                        list.add(disposable);
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
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "Disposable item is null");
        if (this.disposed) {
            return false;
        }
        synchronized (this) {
            if (this.disposed) {
                return false;
            }
            java.util.List<io.reactivex.disposables.Disposable> list = this.resources;
            if (list != null && list.remove(disposable)) {
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
            java.util.List<io.reactivex.disposables.Disposable> list = this.resources;
            this.resources = null;
            dispose(list);
        }
    }

    void dispose(java.util.List<io.reactivex.disposables.Disposable> list) {
        if (list == null) {
            return;
        }
        java.util.ArrayList arrayList = null;
        java.util.Iterator<io.reactivex.disposables.Disposable> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(th);
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
