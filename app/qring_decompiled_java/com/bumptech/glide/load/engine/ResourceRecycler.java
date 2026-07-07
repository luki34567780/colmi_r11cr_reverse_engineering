package com.bumptech.glide.load.engine;

/* loaded from: classes.dex */
class ResourceRecycler {
    private final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper(), new com.bumptech.glide.load.engine.ResourceRecycler.ResourceRecyclerCallback());
    private boolean isRecycling;

    ResourceRecycler() {
    }

    synchronized void recycle(com.bumptech.glide.load.engine.Resource<?> resource, boolean z) {
        if (!this.isRecycling && !z) {
            this.isRecycling = true;
            resource.recycle();
            this.isRecycling = false;
        }
        this.handler.obtainMessage(1, resource).sendToTarget();
    }

    private static final class ResourceRecyclerCallback implements android.os.Handler.Callback {
        static final int RECYCLE_RESOURCE = 1;

        ResourceRecyclerCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (message.what != 1) {
                return false;
            }
            ((com.bumptech.glide.load.engine.Resource) message.obj).recycle();
            return true;
        }
    }
}
