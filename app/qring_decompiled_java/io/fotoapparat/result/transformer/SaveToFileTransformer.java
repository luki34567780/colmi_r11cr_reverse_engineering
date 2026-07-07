package io.fotoapparat.result.transformer;

/* compiled from: SaveToFileTransformer.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/fotoapparat/result/transformer/SaveToFileTransformer;", "Lkotlin/Function1;", "Lio/fotoapparat/result/Photo;", "", "file", "Ljava/io/File;", "exifOrientationWriter", "Lio/fotoapparat/exif/ExifOrientationWriter;", "(Ljava/io/File;Lio/fotoapparat/exif/ExifOrientationWriter;)V", "invoke", "input", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class SaveToFileTransformer implements kotlin.jvm.functions.Function1<io.fotoapparat.result.Photo, kotlin.Unit> {
    private final io.fotoapparat.exif.ExifOrientationWriter exifOrientationWriter;
    private final java.io.File file;

    public SaveToFileTransformer(java.io.File file, io.fotoapparat.exif.ExifOrientationWriter exifOrientationWriter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(file, "file");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exifOrientationWriter, "exifOrientationWriter");
        this.file = file;
        this.exifOrientationWriter = exifOrientationWriter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(io.fotoapparat.result.Photo photo) {
        invoke2(photo);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(io.fotoapparat.result.Photo input) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(input, "input");
        try {
            java.io.OutputStream fileOutputStream = new java.io.FileOutputStream(this.file);
            try {
                io.fotoapparat.result.transformer.SaveToFileTransformerKt.saveImage(input, fileOutputStream instanceof java.io.BufferedOutputStream ? (java.io.BufferedOutputStream) fileOutputStream : new java.io.BufferedOutputStream(fileOutputStream, 8192));
                this.exifOrientationWriter.writeExifOrientation(this.file, input.rotationDegrees);
            } catch (java.io.IOException e) {
                throw new io.fotoapparat.exception.FileSaveException(e);
            }
        } catch (java.io.FileNotFoundException e2) {
            throw new io.fotoapparat.exception.FileSaveException(e2);
        }
    }
}
