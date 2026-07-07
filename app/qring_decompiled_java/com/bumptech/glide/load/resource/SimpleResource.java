package com.bumptech.glide.load.resource;

/* loaded from: /tmp/dex/classes2.dex */
public class SimpleResource<T> implements com.bumptech.glide.load.engine.Resource<T> {
    protected final T data;

    public final int getSize() {
        return 1;
    }

    public void recycle() {
    }

    public SimpleResource(T t) {
        this.data = (T) com.bumptech.glide.util.Preconditions.checkNotNull(t);
    }

    public java.lang.Class<T> getResourceClass() {
        return (java.lang.Class<T>) this.data.getClass();
    }

    public final T get() {
        return this.data;
    }
}
