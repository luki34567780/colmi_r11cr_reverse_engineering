package io.fotoapparat.exception;

/* compiled from: LevelOutOfRangeException.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/fotoapparat/exception/LevelOutOfRangeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "zoomLevel", "", "(F)V", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class LevelOutOfRangeException extends java.lang.RuntimeException {
    public LevelOutOfRangeException(float f) {
        super(java.lang.String.valueOf(f) + " is out of range [0..1]");
    }
}
