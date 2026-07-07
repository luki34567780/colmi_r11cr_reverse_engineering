package io.fotoapparat.result.transformer;

/* compiled from: BitmapPhotoTransformer.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0001j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0001j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/fotoapparat/result/transformer/BitmapPhotoTransformer;", "Lkotlin/Function1;", "Lio/fotoapparat/result/Photo;", "Lio/fotoapparat/result/BitmapPhoto;", "sizeTransformer", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/result/transformer/ResolutionTransformer;", "(Lkotlin/jvm/functions/Function1;)V", "invoke", "input", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class BitmapPhotoTransformer implements kotlin.jvm.functions.Function1<io.fotoapparat.result.Photo, io.fotoapparat.result.BitmapPhoto> {
    private final kotlin.jvm.functions.Function1<io.fotoapparat.parameter.Resolution, io.fotoapparat.parameter.Resolution> sizeTransformer;

    /* JADX WARN: Multi-variable type inference failed */
    public BitmapPhotoTransformer(kotlin.jvm.functions.Function1<? super io.fotoapparat.parameter.Resolution, io.fotoapparat.parameter.Resolution> sizeTransformer) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sizeTransformer, "sizeTransformer");
        this.sizeTransformer = sizeTransformer;
    }

    @Override // kotlin.jvm.functions.Function1
    public io.fotoapparat.result.BitmapPhoto invoke(io.fotoapparat.result.Photo input) {
        io.fotoapparat.parameter.Resolution readResolution;
        float computeScaleFactor;
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(input, "input");
        readResolution = io.fotoapparat.result.transformer.BitmapPhotoTransformerKt.readResolution(input);
        io.fotoapparat.parameter.Resolution invoke = this.sizeTransformer.invoke(readResolution);
        computeScaleFactor = io.fotoapparat.result.transformer.BitmapPhotoTransformerKt.computeScaleFactor(readResolution, invoke);
        bitmap = io.fotoapparat.result.transformer.BitmapPhotoTransformerKt.decodeBitmap(input, computeScaleFactor);
        if (bitmap == null) {
            throw new io.fotoapparat.exception.UnableToDecodeBitmapException();
        }
        if (bitmap.getWidth() != invoke.width || bitmap.getHeight() != invoke.height) {
            bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, invoke.width, invoke.height, true);
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bitmap, "bitmap");
        return new io.fotoapparat.result.BitmapPhoto(bitmap, input.rotationDegrees);
    }
}
