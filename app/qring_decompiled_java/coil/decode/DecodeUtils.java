package coil.decode;

/* compiled from: DecodeUtils.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J8\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J8\u0010\u000b\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0007J8\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000e"}, d2 = {"Lcoil/decode/DecodeUtils;", "", "()V", "calculateInSampleSize", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "scale", "Lcoil/size/Scale;", "computeSizeMultiplier", "", "", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecodeUtils {
    public static final coil.decode.DecodeUtils INSTANCE = new coil.decode.DecodeUtils();

    /* compiled from: DecodeUtils.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[coil.size.Scale.values().length];
            iArr[coil.size.Scale.FILL.ordinal()] = 1;
            iArr[coil.size.Scale.FIT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DecodeUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final int calculateInSampleSize(int srcWidth, int srcHeight, int dstWidth, int dstHeight, coil.size.Scale scale) {
        int min;
        int highestOneBit = java.lang.Integer.highestOneBit(srcWidth / dstWidth);
        int highestOneBit2 = java.lang.Integer.highestOneBit(srcHeight / dstHeight);
        int i = coil.decode.DecodeUtils.WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            min = java.lang.Math.min(highestOneBit, highestOneBit2);
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            min = java.lang.Math.max(highestOneBit, highestOneBit2);
        }
        return kotlin.ranges.RangesKt.coerceAtLeast(min, 1);
    }

    @kotlin.jvm.JvmStatic
    public static final double computeSizeMultiplier(int srcWidth, int srcHeight, int dstWidth, int dstHeight, coil.size.Scale scale) {
        double d = dstWidth / srcWidth;
        double d2 = dstHeight / srcHeight;
        int i = coil.decode.DecodeUtils.WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            return java.lang.Math.max(d, d2);
        }
        if (i == 2) {
            return java.lang.Math.min(d, d2);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.jvm.JvmStatic
    public static final float computeSizeMultiplier(float srcWidth, float srcHeight, float dstWidth, float dstHeight, coil.size.Scale scale) {
        float f = dstWidth / srcWidth;
        float f2 = dstHeight / srcHeight;
        int i = coil.decode.DecodeUtils.WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            return java.lang.Math.max(f, f2);
        }
        if (i == 2) {
            return java.lang.Math.min(f, f2);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.jvm.JvmStatic
    public static final double computeSizeMultiplier(double srcWidth, double srcHeight, double dstWidth, double dstHeight, coil.size.Scale scale) {
        double d = dstWidth / srcWidth;
        double d2 = dstHeight / srcHeight;
        int i = coil.decode.DecodeUtils.WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            return java.lang.Math.max(d, d2);
        }
        if (i == 2) {
            return java.lang.Math.min(d, d2);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
