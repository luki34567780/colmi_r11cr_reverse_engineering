package com.bumptech.glide.load.engine;

/* loaded from: classes.dex */
public interface Resource<Z> {
    Z get();

    java.lang.Class<Z> getResourceClass();

    int getSize();

    void recycle();
}
