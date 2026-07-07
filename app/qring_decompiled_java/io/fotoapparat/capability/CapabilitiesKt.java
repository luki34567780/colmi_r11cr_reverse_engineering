package io.fotoapparat.capability;

/* compiled from: Capabilities.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0082\b¨\u0006\u0004"}, d2 = {"ensureNotEmpty", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class CapabilitiesKt {
    private static final <E> void ensureNotEmpty(java.util.Set<? extends E> set) {
        if (set.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Capabilities cannot have an empty Set<");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
            sb.append("Object");
            sb.append(">.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
