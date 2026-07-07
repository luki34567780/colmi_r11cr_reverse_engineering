package com.bumptech.glide.request.transition;

/* loaded from: /tmp/dex/classes2.dex */
public class DrawableCrossFadeFactory implements com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> {
    private final int duration;
    private final boolean isCrossFadeEnabled;
    private com.bumptech.glide.request.transition.DrawableCrossFadeTransition resourceTransition;

    protected DrawableCrossFadeFactory(int i, boolean z) {
        this.duration = i;
        this.isCrossFadeEnabled = z;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public com.bumptech.glide.request.transition.Transition<android.graphics.drawable.Drawable> build(com.bumptech.glide.load.DataSource dataSource, boolean z) {
        if (dataSource == com.bumptech.glide.load.DataSource.MEMORY_CACHE) {
            return com.bumptech.glide.request.transition.NoTransition.get();
        }
        return getResourceTransition();
    }

    private com.bumptech.glide.request.transition.Transition<android.graphics.drawable.Drawable> getResourceTransition() {
        if (this.resourceTransition == null) {
            this.resourceTransition = new com.bumptech.glide.request.transition.DrawableCrossFadeTransition(this.duration, this.isCrossFadeEnabled);
        }
        return this.resourceTransition;
    }

    public static class Builder {
        private static final int DEFAULT_DURATION_MS = 300;
        private final int durationMillis;
        private boolean isCrossFadeEnabled;

        public Builder() {
            this(DEFAULT_DURATION_MS);
        }

        public Builder(int i) {
            this.durationMillis = i;
        }

        public com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder setCrossFadeEnabled(boolean z) {
            this.isCrossFadeEnabled = z;
            return this;
        }

        public com.bumptech.glide.request.transition.DrawableCrossFadeFactory build() {
            return new com.bumptech.glide.request.transition.DrawableCrossFadeFactory(this.durationMillis, this.isCrossFadeEnabled);
        }
    }
}
