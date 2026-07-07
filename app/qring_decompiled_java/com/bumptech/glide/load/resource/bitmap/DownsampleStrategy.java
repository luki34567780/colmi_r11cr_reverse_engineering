package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class DownsampleStrategy {
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy CENTER_OUTSIDE;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy DEFAULT;
    static final boolean IS_BITMAP_FACTORY_SCALING_SUPPORTED;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy NONE;
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> OPTION;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy AT_LEAST = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.AtLeast();
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy AT_MOST = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.AtMost();
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy FIT_CENTER = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.FitCenter();
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy CENTER_INSIDE = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CenterInside();

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    public abstract com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int i, int i2, int i3, int i4);

    public abstract float getScaleFactor(int i, int i2, int i3, int i4);

    static {
        com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CenterOutside centerOutside = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CenterOutside();
        CENTER_OUTSIDE = centerOutside;
        NONE = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.None();
        DEFAULT = centerOutside;
        OPTION = com.bumptech.glide.load.Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", centerOutside);
        IS_BITMAP_FACTORY_SCALING_SUPPORTED = android.os.Build.VERSION.SDK_INT >= 19;
    }

    private static class FitCenter extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        FitCenter() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            if (IS_BITMAP_FACTORY_SCALING_SUPPORTED) {
                return java.lang.Math.min(i3 / i, i4 / i2);
            }
            if (java.lang.Math.max(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / java.lang.Integer.highestOneBit(r2);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int i, int i2, int i3, int i4) {
            if (IS_BITMAP_FACTORY_SCALING_SUPPORTED) {
                return com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY;
            }
            return com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY;
        }
    }

    private static class CenterOutside extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        CenterOutside() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            return java.lang.Math.max(i3 / i, i4 / i2);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int i, int i2, int i3, int i4) {
            return com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY;
        }
    }

    private static class AtLeast extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        AtLeast() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            if (java.lang.Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / java.lang.Integer.highestOneBit(r1);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int i, int i2, int i3, int i4) {
            return com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY;
        }
    }

    private static class AtMost extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        AtMost() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            int ceil = (int) java.lang.Math.ceil(java.lang.Math.max(i2 / i4, i / i3));
            return 1.0f / (r2 << (java.lang.Math.max(1, java.lang.Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int i, int i2, int i3, int i4) {
            return com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY;
        }
    }

    private static class None extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        None() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int i, int i2, int i3, int i4) {
            return com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY;
        }
    }

    private static class CenterInside extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        CenterInside() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            return java.lang.Math.min(1.0f, FIT_CENTER.getScaleFactor(i, i2, i3, i4));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int i, int i2, int i3, int i4) {
            if (getScaleFactor(i, i2, i3, i4) == 1.0f) {
                return com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY;
            }
            return FIT_CENTER.getSampleSizeRounding(i, i2, i3, i4);
        }
    }
}
