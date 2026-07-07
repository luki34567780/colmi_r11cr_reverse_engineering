package androidx.camera.core;

/* loaded from: classes.dex */
final class ImageReaderFormatRecommender {
    private ImageReaderFormatRecommender() {
    }

    static androidx.camera.core.ImageReaderFormatRecommender.FormatCombo chooseCombo() {
        return androidx.camera.core.ImageReaderFormatRecommender.FormatCombo.create(256, 35);
    }

    static abstract class FormatCombo {
        abstract int imageAnalysisFormat();

        abstract int imageCaptureFormat();

        FormatCombo() {
        }

        static androidx.camera.core.ImageReaderFormatRecommender.FormatCombo create(int imageCaptureFormat, int imageAnalysisFormat) {
            return new androidx.camera.core.AutoValue_ImageReaderFormatRecommender_FormatCombo(imageCaptureFormat, imageAnalysisFormat);
        }
    }
}
