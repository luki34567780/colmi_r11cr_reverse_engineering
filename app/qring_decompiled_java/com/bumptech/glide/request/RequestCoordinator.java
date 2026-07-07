package com.bumptech.glide.request;

/* loaded from: /tmp/dex/classes2.dex */
public interface RequestCoordinator {
    boolean canNotifyCleared(com.bumptech.glide.request.Request request);

    boolean canNotifyStatusChanged(com.bumptech.glide.request.Request request);

    boolean canSetImage(com.bumptech.glide.request.Request request);

    com.bumptech.glide.request.RequestCoordinator getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(com.bumptech.glide.request.Request request);

    void onRequestSuccess(com.bumptech.glide.request.Request request);

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z) {
            this.isComplete = z;
        }

        boolean isComplete() {
            return this.isComplete;
        }
    }
}
