package com.realsil.sdk.core.base;

/* loaded from: classes3.dex */
public abstract class BaseThread<T> extends java.lang.Thread {
    public volatile boolean a = false;
    public java.util.concurrent.LinkedBlockingDeque<T> b = new java.util.concurrent.LinkedBlockingDeque<>();

    public void addQueue(T t) {
        synchronized (this.b) {
            this.b.add(t);
        }
    }

    public void cancel(boolean z) {
        this.a = z;
    }

    public void clearQueue() {
        synchronized (this.b) {
            this.b.clear();
        }
    }

    public boolean isCanceled() {
        return this.a;
    }

    public T peek() {
        T peek;
        synchronized (this.b) {
            peek = this.b.peek();
        }
        return peek;
    }

    public T poll() {
        T poll;
        synchronized (this.b) {
            poll = this.b.poll();
        }
        return poll;
    }

    public void push(T t) {
        synchronized (this.b) {
            this.b.push(t);
        }
    }

    public T take() {
        try {
            return this.b.take();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
