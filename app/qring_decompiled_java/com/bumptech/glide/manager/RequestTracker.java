package com.bumptech.glide.manager;

/* loaded from: /tmp/dex/classes2.dex */
public class RequestTracker {
    private static final java.lang.String TAG = "RequestTracker";
    private boolean isPaused;
    private final java.util.Set<com.bumptech.glide.request.Request> requests = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    private final java.util.List<com.bumptech.glide.request.Request> pendingRequests = new java.util.ArrayList();

    public void runRequest(com.bumptech.glide.request.Request request) {
        this.requests.add(request);
        if (!this.isPaused) {
            request.begin();
            return;
        }
        request.clear();
        if (android.util.Log.isLoggable(TAG, 2)) {
            android.util.Log.v(TAG, "Paused, delaying request");
        }
        this.pendingRequests.add(request);
    }

    void addRequest(com.bumptech.glide.request.Request request) {
        this.requests.add(request);
    }

    public boolean clearAndRemove(com.bumptech.glide.request.Request request) {
        boolean z = true;
        if (request == null) {
            return true;
        }
        boolean remove = this.requests.remove(request);
        if (!this.pendingRequests.remove(request) && !remove) {
            z = false;
        }
        if (z) {
            request.clear();
        }
        return z;
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public void pauseRequests() {
        this.isPaused = true;
        for (com.bumptech.glide.request.Request request : com.bumptech.glide.util.Util.getSnapshot(this.requests)) {
            if (request.isRunning()) {
                request.pause();
                this.pendingRequests.add(request);
            }
        }
    }

    public void pauseAllRequests() {
        this.isPaused = true;
        for (com.bumptech.glide.request.Request request : com.bumptech.glide.util.Util.getSnapshot(this.requests)) {
            if (request.isRunning() || request.isComplete()) {
                request.clear();
                this.pendingRequests.add(request);
            }
        }
    }

    public void resumeRequests() {
        this.isPaused = false;
        for (com.bumptech.glide.request.Request request : com.bumptech.glide.util.Util.getSnapshot(this.requests)) {
            if (!request.isComplete() && !request.isRunning()) {
                request.begin();
            }
        }
        this.pendingRequests.clear();
    }

    public void clearRequests() {
        java.util.Iterator it = com.bumptech.glide.util.Util.getSnapshot(this.requests).iterator();
        while (it.hasNext()) {
            clearAndRemove((com.bumptech.glide.request.Request) it.next());
        }
        this.pendingRequests.clear();
    }

    public void restartRequests() {
        for (com.bumptech.glide.request.Request request : com.bumptech.glide.util.Util.getSnapshot(this.requests)) {
            if (!request.isComplete() && !request.isCleared()) {
                request.clear();
                if (!this.isPaused) {
                    request.begin();
                } else {
                    this.pendingRequests.add(request);
                }
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "{numRequests=" + this.requests.size() + ", isPaused=" + this.isPaused + "}";
    }
}
