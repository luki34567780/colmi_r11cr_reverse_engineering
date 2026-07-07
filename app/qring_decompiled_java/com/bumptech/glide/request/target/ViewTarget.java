package com.bumptech.glide.request.target;

@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public abstract class ViewTarget<T extends android.view.View, Z> extends com.bumptech.glide.request.target.BaseTarget<Z> {
    private static final java.lang.String TAG = "ViewTarget";
    private static boolean isTagUsedAtLeastOnce;
    private static int tagId = com.bumptech.glide.R.id.glide_custom_view_target_tag;
    private android.view.View.OnAttachStateChangeListener attachStateListener;
    private boolean isAttachStateListenerAdded;
    private boolean isClearedByUs;
    private final com.bumptech.glide.request.target.ViewTarget.SizeDeterminer sizeDeterminer;
    protected final T view;

    public ViewTarget(T t) {
        this.view = (T) com.bumptech.glide.util.Preconditions.checkNotNull(t);
        this.sizeDeterminer = new com.bumptech.glide.request.target.ViewTarget.SizeDeterminer(t);
    }

    @java.lang.Deprecated
    public ViewTarget(T t, boolean z) {
        this(t);
        if (z) {
            waitForLayout();
        }
    }

    public final com.bumptech.glide.request.target.ViewTarget<T, Z> clearOnDetach() {
        if (this.attachStateListener != null) {
            return this;
        }
        this.attachStateListener = new android.view.View.OnAttachStateChangeListener() { // from class: com.bumptech.glide.request.target.ViewTarget.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view) {
                com.bumptech.glide.request.target.ViewTarget.this.resumeMyRequest();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view) {
                com.bumptech.glide.request.target.ViewTarget.this.pauseMyRequest();
            }
        };
        maybeAddAttachStateListener();
        return this;
    }

    void resumeMyRequest() {
        com.bumptech.glide.request.Request request = getRequest();
        if (request == null || !request.isCleared()) {
            return;
        }
        request.begin();
    }

    void pauseMyRequest() {
        com.bumptech.glide.request.Request request = getRequest();
        if (request != null) {
            this.isClearedByUs = true;
            request.clear();
            this.isClearedByUs = false;
        }
    }

    public final com.bumptech.glide.request.target.ViewTarget<T, Z> waitForLayout() {
        this.sizeDeterminer.waitForLayout = true;
        return this;
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadStarted(android.graphics.drawable.Drawable drawable) {
        super.onLoadStarted(drawable);
        maybeAddAttachStateListener();
    }

    private void maybeAddAttachStateListener() {
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener == null || this.isAttachStateListenerAdded) {
            return;
        }
        this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.isAttachStateListenerAdded = true;
    }

    private void maybeRemoveAttachStateListener() {
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener == null || !this.isAttachStateListenerAdded) {
            return;
        }
        this.view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.isAttachStateListenerAdded = false;
    }

    public T getView() {
        return this.view;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void getSize(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
        this.sizeDeterminer.getSize(sizeReadyCallback);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
        this.sizeDeterminer.removeCallback(sizeReadyCallback);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadCleared(android.graphics.drawable.Drawable drawable) {
        super.onLoadCleared(drawable);
        this.sizeDeterminer.clearCallbacksAndListener();
        if (this.isClearedByUs) {
            return;
        }
        maybeRemoveAttachStateListener();
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void setRequest(com.bumptech.glide.request.Request request) {
        setTag(request);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public com.bumptech.glide.request.Request getRequest() {
        java.lang.Object tag = getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof com.bumptech.glide.request.Request) {
            return (com.bumptech.glide.request.Request) tag;
        }
        throw new java.lang.IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public java.lang.String toString() {
        return "Target for: " + this.view;
    }

    private void setTag(java.lang.Object obj) {
        isTagUsedAtLeastOnce = true;
        this.view.setTag(tagId, obj);
    }

    private java.lang.Object getTag() {
        return this.view.getTag(tagId);
    }

    @java.lang.Deprecated
    public static void setTagId(int i) {
        if (isTagUsedAtLeastOnce) {
            throw new java.lang.IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        tagId = i;
    }

    static final class SizeDeterminer {
        private static final int PENDING_SIZE = 0;
        static java.lang.Integer maxDisplayLength;
        private final java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> cbs = new java.util.ArrayList();
        private com.bumptech.glide.request.target.ViewTarget.SizeDeterminer.SizeDeterminerLayoutListener layoutListener;
        private final android.view.View view;
        boolean waitForLayout;

        private boolean isDimensionValid(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        SizeDeterminer(android.view.View view) {
            this.view = view;
        }

        private static int getMaxDisplayLength(android.content.Context context) {
            if (maxDisplayLength == null) {
                android.view.Display defaultDisplay = ((android.view.WindowManager) com.bumptech.glide.util.Preconditions.checkNotNull((android.view.WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                android.graphics.Point point = new android.graphics.Point();
                defaultDisplay.getSize(point);
                maxDisplayLength = java.lang.Integer.valueOf(java.lang.Math.max(point.x, point.y));
            }
            return maxDisplayLength.intValue();
        }

        private void notifyCbs(int i, int i2) {
            java.util.Iterator it = new java.util.ArrayList(this.cbs).iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.request.target.SizeReadyCallback) it.next()).onSizeReady(i, i2);
            }
        }

        void checkCurrentDimens() {
            if (this.cbs.isEmpty()) {
                return;
            }
            int targetWidth = getTargetWidth();
            int targetHeight = getTargetHeight();
            if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
                notifyCbs(targetWidth, targetHeight);
                clearCallbacksAndListener();
            }
        }

        void getSize(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
            int targetWidth = getTargetWidth();
            int targetHeight = getTargetHeight();
            if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
                sizeReadyCallback.onSizeReady(targetWidth, targetHeight);
                return;
            }
            if (!this.cbs.contains(sizeReadyCallback)) {
                this.cbs.add(sizeReadyCallback);
            }
            if (this.layoutListener == null) {
                android.view.ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
                com.bumptech.glide.request.target.ViewTarget.SizeDeterminer.SizeDeterminerLayoutListener sizeDeterminerLayoutListener = new com.bumptech.glide.request.target.ViewTarget.SizeDeterminer.SizeDeterminerLayoutListener(this);
                this.layoutListener = sizeDeterminerLayoutListener;
                viewTreeObserver.addOnPreDrawListener(sizeDeterminerLayoutListener);
            }
        }

        void removeCallback(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
            this.cbs.remove(sizeReadyCallback);
        }

        void clearCallbacksAndListener() {
            android.view.ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.layoutListener);
            }
            this.layoutListener = null;
            this.cbs.clear();
        }

        private boolean isViewStateAndSizeValid(int i, int i2) {
            return isDimensionValid(i) && isDimensionValid(i2);
        }

        private int getTargetHeight() {
            int paddingTop = this.view.getPaddingTop() + this.view.getPaddingBottom();
            android.view.ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            return getTargetDimen(this.view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int getTargetWidth() {
            int paddingLeft = this.view.getPaddingLeft() + this.view.getPaddingRight();
            android.view.ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            return getTargetDimen(this.view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private int getTargetDimen(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.waitForLayout && this.view.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.view.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (android.util.Log.isLoggable(com.bumptech.glide.request.target.ViewTarget.TAG, 4)) {
                android.util.Log.i(com.bumptech.glide.request.target.ViewTarget.TAG, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return getMaxDisplayLength(this.view.getContext());
        }

        private static final class SizeDeterminerLayoutListener implements android.view.ViewTreeObserver.OnPreDrawListener {
            private final java.lang.ref.WeakReference<com.bumptech.glide.request.target.ViewTarget.SizeDeterminer> sizeDeterminerRef;

            SizeDeterminerLayoutListener(com.bumptech.glide.request.target.ViewTarget.SizeDeterminer sizeDeterminer) {
                this.sizeDeterminerRef = new java.lang.ref.WeakReference<>(sizeDeterminer);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (android.util.Log.isLoggable(com.bumptech.glide.request.target.ViewTarget.TAG, 2)) {
                    android.util.Log.v(com.bumptech.glide.request.target.ViewTarget.TAG, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                com.bumptech.glide.request.target.ViewTarget.SizeDeterminer sizeDeterminer = this.sizeDeterminerRef.get();
                if (sizeDeterminer == null) {
                    return true;
                }
                sizeDeterminer.checkCurrentDimens();
                return true;
            }
        }
    }
}
