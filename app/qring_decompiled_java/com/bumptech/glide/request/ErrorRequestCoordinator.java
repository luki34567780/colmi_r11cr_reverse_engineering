package com.bumptech.glide.request;

/* loaded from: /tmp/dex/classes2.dex */
public final class ErrorRequestCoordinator implements com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request {
    private volatile com.bumptech.glide.request.Request error;
    private final com.bumptech.glide.request.RequestCoordinator parent;
    private volatile com.bumptech.glide.request.Request primary;
    private final java.lang.Object requestLock;
    private com.bumptech.glide.request.RequestCoordinator.RequestState primaryState = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED;
    private com.bumptech.glide.request.RequestCoordinator.RequestState errorState = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED;

    public ErrorRequestCoordinator(java.lang.Object obj, com.bumptech.glide.request.RequestCoordinator requestCoordinator) {
        this.requestLock = obj;
        this.parent = requestCoordinator;
    }

    public void setRequests(com.bumptech.glide.request.Request request, com.bumptech.glide.request.Request request2) {
        this.primary = request;
        this.error = request2;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        synchronized (this.requestLock) {
            if (this.primaryState != com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING) {
                this.primaryState = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING;
                this.primary.begin();
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.requestLock) {
            this.primaryState = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED;
            this.primary.clear();
            if (this.errorState != com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED) {
                this.errorState = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED;
                this.error.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.requestLock) {
            if (this.primaryState == com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING) {
                this.primaryState = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED;
                this.primary.pause();
            }
            if (this.errorState == com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING) {
                this.errorState = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED;
                this.error.pause();
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.primaryState == com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING || this.errorState == com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.primaryState == com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS || this.errorState == com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.primaryState == com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED && this.errorState == com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(com.bumptech.glide.request.Request request) {
        if (!(request instanceof com.bumptech.glide.request.ErrorRequestCoordinator)) {
            return false;
        }
        com.bumptech.glide.request.ErrorRequestCoordinator errorRequestCoordinator = (com.bumptech.glide.request.ErrorRequestCoordinator) request;
        return this.primary.isEquivalentTo(errorRequestCoordinator.primary) && this.error.isEquivalentTo(errorRequestCoordinator.error);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(com.bumptech.glide.request.Request request) {
        boolean z;
        synchronized (this.requestLock) {
            z = parentCanSetImage() && isValidRequest(request);
        }
        return z;
    }

    private boolean parentCanSetImage() {
        com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.parent;
        return requestCoordinator == null || requestCoordinator.canSetImage(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(com.bumptech.glide.request.Request request) {
        boolean z;
        synchronized (this.requestLock) {
            z = parentCanNotifyStatusChanged() && isValidRequest(request);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(com.bumptech.glide.request.Request request) {
        boolean z;
        synchronized (this.requestLock) {
            z = parentCanNotifyCleared() && isValidRequest(request);
        }
        return z;
    }

    private boolean parentCanNotifyCleared() {
        com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.parent;
        return requestCoordinator == null || requestCoordinator.canNotifyCleared(this);
    }

    private boolean parentCanNotifyStatusChanged() {
        com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.parent;
        return requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this);
    }

    private boolean isValidRequest(com.bumptech.glide.request.Request request) {
        return request.equals(this.primary) || (this.primaryState == com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED && request.equals(this.error));
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.primary.isAnyResourceSet() || this.error.isAnyResourceSet();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(com.bumptech.glide.request.Request request) {
        synchronized (this.requestLock) {
            if (request.equals(this.primary)) {
                this.primaryState = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS;
            } else if (request.equals(this.error)) {
                this.errorState = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS;
            }
            com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.parent;
            if (requestCoordinator != null) {
                requestCoordinator.onRequestSuccess(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(com.bumptech.glide.request.Request request) {
        synchronized (this.requestLock) {
            if (!request.equals(this.error)) {
                this.primaryState = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED;
                if (this.errorState != com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING) {
                    this.errorState = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING;
                    this.error.begin();
                }
                return;
            }
            this.errorState = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED;
            com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.parent;
            if (requestCoordinator != null) {
                requestCoordinator.onRequestFailed(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public com.bumptech.glide.request.RequestCoordinator getRoot() {
        com.bumptech.glide.request.RequestCoordinator root;
        synchronized (this.requestLock) {
            com.bumptech.glide.request.RequestCoordinator requestCoordinator = this.parent;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }
}
