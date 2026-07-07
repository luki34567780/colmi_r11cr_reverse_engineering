package io.fotoapparat.view;

/* compiled from: CameraView.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a'\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"centerCrop", "", "Lio/fotoapparat/parameter/Resolution;", "view", "Landroid/view/ViewGroup;", "centerInside", "layoutChildrenAt", "rect", "Landroid/graphics/Rect;", "layoutTextureView", "previewResolution", "scaleType", "Lio/fotoapparat/parameter/ScaleType;", "(Landroid/view/ViewGroup;Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/ScaleType;)Lkotlin/Unit;", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class CameraViewKt {

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.fotoapparat.parameter.ScaleType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[io.fotoapparat.parameter.ScaleType.CenterInside.ordinal()] = 1;
            iArr[io.fotoapparat.parameter.ScaleType.CenterCrop.ordinal()] = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit layoutTextureView(android.view.ViewGroup viewGroup, io.fotoapparat.parameter.Resolution resolution, io.fotoapparat.parameter.ScaleType scaleType) {
        if (scaleType == null) {
            return null;
        }
        int i = io.fotoapparat.view.CameraViewKt.WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()];
        if (i == 1) {
            if (resolution == null) {
                return null;
            }
            centerInside(resolution, viewGroup);
            return kotlin.Unit.INSTANCE;
        }
        if (i != 2 || resolution == null) {
            return null;
        }
        centerCrop(resolution, viewGroup);
        return kotlin.Unit.INSTANCE;
    }

    private static final void centerInside(io.fotoapparat.parameter.Resolution resolution, android.view.ViewGroup viewGroup) {
        float min = java.lang.Math.min(viewGroup.getMeasuredWidth() / resolution.width, viewGroup.getMeasuredHeight() / resolution.height);
        int i = (int) (resolution.width * min);
        int i2 = (int) (resolution.height * min);
        int max = java.lang.Math.max(0, viewGroup.getMeasuredWidth() - i) / 2;
        int max2 = java.lang.Math.max(0, viewGroup.getMeasuredHeight() - i2) / 2;
        layoutChildrenAt(viewGroup, new android.graphics.Rect(max, max2, i + max, i2 + max2));
    }

    private static final void centerCrop(io.fotoapparat.parameter.Resolution resolution, android.view.ViewGroup viewGroup) {
        float max = java.lang.Math.max(viewGroup.getMeasuredWidth() / resolution.width, viewGroup.getMeasuredHeight() / resolution.height);
        int i = (int) (resolution.width * max);
        int i2 = (int) (resolution.height * max);
        int max2 = java.lang.Math.max(0, i - viewGroup.getMeasuredWidth());
        int max3 = java.lang.Math.max(0, i2 - viewGroup.getMeasuredHeight());
        layoutChildrenAt(viewGroup, new android.graphics.Rect((-max2) / 2, (-max3) / 2, i - (max2 / 2), i2 - (max3 / 2)));
    }

    private static final void layoutChildrenAt(android.view.ViewGroup viewGroup, android.graphics.Rect rect) {
        java.util.Iterator<java.lang.Integer> it = kotlin.ranges.RangesKt.until(0, viewGroup.getChildCount()).iterator();
        while (it.hasNext()) {
            viewGroup.getChildAt(((kotlin.collections.IntIterator) it).nextInt()).layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }
}
