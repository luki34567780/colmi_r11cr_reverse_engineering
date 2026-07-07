package androidx.camera.view.transform;

/* loaded from: classes.dex */
public final class FileTransformFactory {
    private boolean mUsingExifOrientation;

    public void setUsingExifOrientation(boolean usingExifOrientation) {
        this.mUsingExifOrientation = usingExifOrientation;
    }

    public boolean isUsingExifOrientation() {
        return this.mUsingExifOrientation;
    }

    public androidx.camera.view.transform.OutputTransform getOutputTransform(android.content.ContentResolver contentResolver, android.net.Uri uri) throws java.io.IOException {
        java.io.InputStream openInputStream = contentResolver.openInputStream(uri);
        try {
            androidx.camera.view.transform.OutputTransform outputTransform = getOutputTransform(openInputStream);
            if (openInputStream != null) {
                openInputStream.close();
            }
            return outputTransform;
        } catch (java.lang.Throwable th) {
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public androidx.camera.view.transform.OutputTransform getOutputTransform(java.io.File file) throws java.io.IOException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            androidx.camera.view.transform.OutputTransform outputTransform = getOutputTransform(fileInputStream);
            fileInputStream.close();
            return outputTransform;
        } catch (java.lang.Throwable th) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public androidx.camera.view.transform.OutputTransform getOutputTransform(java.io.InputStream inputStream) throws java.io.IOException {
        androidx.camera.core.impl.utils.Exif createFromInputStream = androidx.camera.core.impl.utils.Exif.createFromInputStream(inputStream);
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, createFromInputStream.getWidth(), createFromInputStream.getHeight());
        android.graphics.Matrix normalizedToBuffer = androidx.camera.view.TransformUtils.getNormalizedToBuffer(rect);
        if (this.mUsingExifOrientation) {
            normalizedToBuffer.postConcat(androidx.camera.view.TransformUtils.getExifTransform(createFromInputStream.getOrientation(), createFromInputStream.getWidth(), createFromInputStream.getHeight()));
        }
        return new androidx.camera.view.transform.OutputTransform(normalizedToBuffer, androidx.camera.view.TransformUtils.rectToSize(rect));
    }
}
