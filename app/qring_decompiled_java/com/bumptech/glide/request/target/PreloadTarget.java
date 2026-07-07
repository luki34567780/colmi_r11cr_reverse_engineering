package com.bumptech.glide.request.target;

/* loaded from: /tmp/dex/classes2.dex */
public final class PreloadTarget<Z> extends com.bumptech.glide.request.target.CustomTarget<Z> {
    private static final android.os.Handler HANDLER = new android.os.Handler(android.os.Looper.getMainLooper(), new android.os.Handler.Callback() { // from class: com.bumptech.glide.request.target.PreloadTarget.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (message.what != 1) {
                return false;
            }
            ((com.bumptech.glide.request.target.PreloadTarget) message.obj).clear();
            return true;
        }
    });
    private static final int MESSAGE_CLEAR = 1;
    private final com.bumptech.glide.RequestManager requestManager;

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(android.graphics.drawable.Drawable drawable) {
    }

    public static <Z> com.bumptech.glide.request.target.PreloadTarget<Z> obtain(com.bumptech.glide.RequestManager requestManager, int i, int i2) {
        return new com.bumptech.glide.request.target.PreloadTarget<>(requestManager, i, i2);
    }

    private PreloadTarget(com.bumptech.glide.RequestManager requestManager, int i, int i2) {
        super(i, i2);
        this.requestManager = requestManager;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(Z z, com.bumptech.glide.request.transition.Transition<? super Z> transition) {
        HANDLER.obtainMessage(1, this).sendToTarget();
    }

    void clear() {
        this.requestManager.clear(this);
    }
}
