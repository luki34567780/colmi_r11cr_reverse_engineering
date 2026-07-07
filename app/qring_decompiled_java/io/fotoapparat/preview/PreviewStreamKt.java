package io.fotoapparat.preview;

/* compiled from: PreviewStream.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u0005*\u00060\u0006R\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"bytesPerFrame", "", "Landroid/hardware/Camera$Size;", "Landroid/hardware/Camera;", "ensureNv21Format", "", "Landroid/hardware/Camera$Parameters;", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class PreviewStreamKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int bytesPerFrame(android.hardware.Camera.Size size) {
        return ((size.width * size.height) * android.graphics.ImageFormat.getBitsPerPixel(17)) / 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureNv21Format(android.hardware.Camera.Parameters parameters) {
        if (parameters.getPreviewFormat() != 17) {
            throw new java.lang.UnsupportedOperationException("Only NV21 preview format is supported");
        }
    }
}
