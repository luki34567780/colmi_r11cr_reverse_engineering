package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface ImageInfoProcessor {
    androidx.camera.core.impl.CaptureStage getCaptureStage();

    boolean process(androidx.camera.core.ImageInfo imageInfo);
}
