package io.fotoapparat.result.transformer;

/* compiled from: SaveToFileTransformer.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"saveImage", "", "input", "Lio/fotoapparat/result/Photo;", "outputStream", "Ljava/io/BufferedOutputStream;", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class SaveToFileTransformerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveImage(io.fotoapparat.result.Photo photo, java.io.BufferedOutputStream bufferedOutputStream) throws java.io.IOException {
        java.io.BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
        try {
            java.io.BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream2;
            bufferedOutputStream3.write(photo.encodedImage);
            bufferedOutputStream3.flush();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(bufferedOutputStream2, null);
        } finally {
        }
    }
}
