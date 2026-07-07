package com.bumptech.glide.util.pool;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class StateVerifier {
    private static final boolean DEBUG = false;

    abstract void setRecycled(boolean z);

    public abstract void throwIfRecycled();

    public static com.bumptech.glide.util.pool.StateVerifier newInstance() {
        return new com.bumptech.glide.util.pool.StateVerifier.DefaultStateVerifier();
    }

    private StateVerifier() {
    }

    private static class DefaultStateVerifier extends com.bumptech.glide.util.pool.StateVerifier {
        private volatile boolean isReleased;

        DefaultStateVerifier() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void throwIfRecycled() {
            if (this.isReleased) {
                throw new java.lang.IllegalStateException("Already released");
            }
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void setRecycled(boolean z) {
            this.isReleased = z;
        }
    }

    private static class DebugStateVerifier extends com.bumptech.glide.util.pool.StateVerifier {
        private volatile java.lang.RuntimeException recycledAtStackTraceException;

        DebugStateVerifier() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void throwIfRecycled() {
            if (this.recycledAtStackTraceException != null) {
                throw new java.lang.IllegalStateException("Already released", this.recycledAtStackTraceException);
            }
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        void setRecycled(boolean z) {
            if (z) {
                this.recycledAtStackTraceException = new java.lang.RuntimeException("Released");
            } else {
                this.recycledAtStackTraceException = null;
            }
        }
    }
}
