package io.fotoapparat.preview;

/* compiled from: PreviewStream.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\u0016\u001a\u00020\u00122%\u0010\u0017\u001a!\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rj\u0002`\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u0012H\u0002J1\u0010\"\u001a\u00020\u00122)\u0010#\u001a%\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rj\u0004\u0018\u0001`\u0013J\f\u0010$\u001a\u00020\u0012*\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020\u001b*\u00060&R\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR3\u0010\u000b\u001a'\u0012#\u0012!\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rj\u0002`\u00130\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lio/fotoapparat/preview/PreviewStream;", "", "camera", "Landroid/hardware/Camera;", "(Landroid/hardware/Camera;)V", "frameOrientation", "Lio/fotoapparat/hardware/orientation/Orientation;", "getFrameOrientation", "()Lio/fotoapparat/hardware/orientation/Orientation;", "setFrameOrientation", "(Lio/fotoapparat/hardware/orientation/Orientation;)V", "frameProcessors", "Ljava/util/LinkedHashSet;", "Lkotlin/Function1;", "Lio/fotoapparat/preview/Frame;", "Lkotlin/ParameterName;", "name", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "Lio/fotoapparat/util/FrameProcessor;", "previewResolution", "Lio/fotoapparat/parameter/Resolution;", "addProcessor", "processor", "clearProcessors", "dispatchFrame", com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_IMAGE, "", "dispatchFrameOnBackgroundThread", com.autonavi.base.amap.mapcore.AeUtil.ROOT_DATA_PATH_OLD_NAME, "ensurePreviewSizeAvailable", "returnFrameToBuffer", "start", "stop", "updateProcessorSafely", "frameProcessor", "addFrameToBuffer", "allocateBuffer", "Landroid/hardware/Camera$Parameters;", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class PreviewStream {
    private final android.hardware.Camera camera;
    private io.fotoapparat.hardware.orientation.Orientation frameOrientation;
    private final java.util.LinkedHashSet<kotlin.jvm.functions.Function1<io.fotoapparat.preview.Frame, kotlin.Unit>> frameProcessors;
    private io.fotoapparat.parameter.Resolution previewResolution;

    public PreviewStream(android.hardware.Camera camera) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(camera, "camera");
        this.camera = camera;
        this.frameProcessors = new java.util.LinkedHashSet<>();
        this.frameOrientation = io.fotoapparat.hardware.orientation.Orientation.Vertical.Portrait.INSTANCE;
    }

    public final io.fotoapparat.hardware.orientation.Orientation getFrameOrientation() {
        return this.frameOrientation;
    }

    public final void setFrameOrientation(io.fotoapparat.hardware.orientation.Orientation orientation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(orientation, "<set-?>");
        this.frameOrientation = orientation;
    }

    private final void clearProcessors() {
        synchronized (this.frameProcessors) {
            this.frameProcessors.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void addProcessor(kotlin.jvm.functions.Function1<? super io.fotoapparat.preview.Frame, kotlin.Unit> processor) {
        synchronized (this.frameProcessors) {
            this.frameProcessors.add(processor);
        }
    }

    private final void start() {
        addFrameToBuffer(this.camera);
        this.camera.setPreviewCallbackWithBuffer(new android.hardware.Camera.PreviewCallback() { // from class: io.fotoapparat.preview.PreviewStream$start$1
            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] data, android.hardware.Camera camera) {
                io.fotoapparat.preview.PreviewStream previewStream = io.fotoapparat.preview.PreviewStream.this;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(data, "data");
                previewStream.dispatchFrameOnBackgroundThread(data);
            }
        });
    }

    private final void stop() {
        this.camera.setPreviewCallbackWithBuffer(null);
    }

    public final void updateProcessorSafely(kotlin.jvm.functions.Function1<? super io.fotoapparat.preview.Frame, kotlin.Unit> frameProcessor) {
        clearProcessors();
        if (frameProcessor == null) {
            stop();
        } else {
            addProcessor(frameProcessor);
            start();
        }
    }

    private final void addFrameToBuffer(android.hardware.Camera camera) {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "parameters");
        camera.addCallbackBuffer(allocateBuffer(parameters));
    }

    private final byte[] allocateBuffer(android.hardware.Camera.Parameters parameters) {
        int bytesPerFrame;
        io.fotoapparat.preview.PreviewStreamKt.ensureNv21Format(parameters);
        this.previewResolution = new io.fotoapparat.parameter.Resolution(parameters.getPreviewSize().width, parameters.getPreviewSize().height);
        android.hardware.Camera.Size previewSize = parameters.getPreviewSize();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(previewSize, "previewSize");
        bytesPerFrame = io.fotoapparat.preview.PreviewStreamKt.bytesPerFrame(previewSize);
        return new byte[bytesPerFrame];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchFrameOnBackgroundThread(final byte[] data) {
        io.fotoapparat.hardware.ExecutorKt.getFrameProcessingExecutor().execute(new java.lang.Runnable() { // from class: io.fotoapparat.preview.PreviewStream$dispatchFrameOnBackgroundThread$1
            @Override // java.lang.Runnable
            public final void run() {
                java.util.LinkedHashSet linkedHashSet;
                linkedHashSet = io.fotoapparat.preview.PreviewStream.this.frameProcessors;
                synchronized (linkedHashSet) {
                    io.fotoapparat.preview.PreviewStream.this.dispatchFrame(data);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchFrame(byte[] image) {
        io.fotoapparat.preview.Frame frame = new io.fotoapparat.preview.Frame(ensurePreviewSizeAvailable(), image, this.frameOrientation.getDegrees());
        java.util.Iterator<T> it = this.frameProcessors.iterator();
        while (it.hasNext()) {
            ((kotlin.jvm.functions.Function1) it.next()).invoke(frame);
        }
        returnFrameToBuffer(frame);
    }

    private final io.fotoapparat.parameter.Resolution ensurePreviewSizeAvailable() {
        io.fotoapparat.parameter.Resolution resolution = this.previewResolution;
        if (resolution != null) {
            return resolution;
        }
        throw new java.lang.IllegalStateException("previewSize is null. Frame was not added?");
    }

    private final void returnFrameToBuffer(io.fotoapparat.preview.Frame frame) {
        this.camera.addCallbackBuffer(frame.getImage());
    }
}
