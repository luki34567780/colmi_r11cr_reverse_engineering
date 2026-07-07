package io.fotoapparat.hardware;

/* compiled from: CameraDevice.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000*\n\u0010\u0012\"\u00020\u00062\u00020\u0006¨\u0006\u0013"}, d2 = {"AUTOFOCUS_TIMEOUT_SECONDS", "", "canSetFocusingAreas", "", "Lio/fotoapparat/capability/Capabilities;", "getPreviewResolution", "Lio/fotoapparat/parameter/Resolution;", "Landroid/hardware/Camera;", "previewOrientation", "Lio/fotoapparat/hardware/orientation/Orientation;", "setDisplaySurface", "Landroid/view/Surface;", "preview", "Lio/fotoapparat/view/Preview;", "takePhoto", "Lio/fotoapparat/result/Photo;", "imageRotation", "", "PreviewSize", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class CameraDeviceKt {
    private static final long AUTOFOCUS_TIMEOUT_SECONDS = 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.fotoapparat.result.Photo takePhoto(android.hardware.Camera camera, final int i) {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        camera.takePicture(null, null, null, new android.hardware.Camera.PictureCallback() { // from class: io.fotoapparat.hardware.CameraDeviceKt$takePhoto$1
            @Override // android.hardware.Camera.PictureCallback
            public final void onPictureTaken(byte[] data, android.hardware.Camera camera2) {
                java.util.concurrent.atomic.AtomicReference atomicReference2 = atomicReference;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(data, "data");
                atomicReference2.set(new io.fotoapparat.result.Photo(data, i));
                countDownLatch.countDown();
            }
        });
        countDownLatch.await();
        java.lang.Object obj = atomicReference.get();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(obj, "photoReference.get()");
        return (io.fotoapparat.result.Photo) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.Surface setDisplaySurface(android.hardware.Camera camera, io.fotoapparat.view.Preview preview) throws java.io.IOException {
        if (preview instanceof io.fotoapparat.view.Preview.Texture) {
            android.graphics.SurfaceTexture surfaceTexture = ((io.fotoapparat.view.Preview.Texture) preview).getSurfaceTexture();
            camera.setPreviewTexture(surfaceTexture);
            return new android.view.Surface(surfaceTexture);
        }
        if (!(preview instanceof io.fotoapparat.view.Preview.Surface)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        android.view.SurfaceHolder surfaceHolder = ((io.fotoapparat.view.Preview.Surface) preview).getSurfaceHolder();
        camera.setPreviewDisplay(surfaceHolder);
        android.view.Surface surface = surfaceHolder.getSurface();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(surface, "preview.surfaceHolder\n  …lay)\n            .surface");
        return surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.fotoapparat.parameter.Resolution getPreviewResolution(android.hardware.Camera camera, io.fotoapparat.hardware.orientation.Orientation orientation) {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "parameters");
        android.hardware.Camera.Size previewSize = parameters.getPreviewSize();
        io.fotoapparat.parameter.Resolution resolution = new io.fotoapparat.parameter.Resolution(previewSize.width, previewSize.height);
        if (orientation instanceof io.fotoapparat.hardware.orientation.Orientation.Vertical) {
            return resolution;
        }
        if (orientation instanceof io.fotoapparat.hardware.orientation.Orientation.Horizontal) {
            return resolution.flipDimensions();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canSetFocusingAreas(io.fotoapparat.capability.Capabilities capabilities) {
        return capabilities.getMaxMeteringAreas() > 0 || capabilities.getMaxFocusAreas() > 0;
    }
}
