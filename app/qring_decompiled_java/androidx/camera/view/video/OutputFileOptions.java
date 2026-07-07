package androidx.camera.view.video;

/* loaded from: classes.dex */
public abstract class OutputFileOptions {
    private static final androidx.camera.view.video.Metadata EMPTY_METADATA = androidx.camera.view.video.Metadata.builder().build();

    abstract android.content.ContentResolver getContentResolver();

    abstract android.content.ContentValues getContentValues();

    abstract java.io.File getFile();

    abstract android.os.ParcelFileDescriptor getFileDescriptor();

    public abstract androidx.camera.view.video.Metadata getMetadata();

    abstract android.net.Uri getSaveCollection();

    OutputFileOptions() {
    }

    public static androidx.camera.view.video.OutputFileOptions.Builder builder(java.io.File file) {
        return new androidx.camera.view.video.AutoValue_OutputFileOptions.Builder().setMetadata(EMPTY_METADATA).setFile(file);
    }

    public static androidx.camera.view.video.OutputFileOptions.Builder builder(android.os.ParcelFileDescriptor fileDescriptor) {
        androidx.core.util.Preconditions.checkArgument(android.os.Build.VERSION.SDK_INT >= 26, "Using a ParcelFileDescriptor to record a video is only supported for Android 8.0 or above.");
        return new androidx.camera.view.video.AutoValue_OutputFileOptions.Builder().setMetadata(EMPTY_METADATA).setFileDescriptor(fileDescriptor);
    }

    public static androidx.camera.view.video.OutputFileOptions.Builder builder(android.content.ContentResolver contentResolver, android.net.Uri saveCollection, android.content.ContentValues contentValues) {
        return new androidx.camera.view.video.AutoValue_OutputFileOptions.Builder().setMetadata(EMPTY_METADATA).setContentResolver(contentResolver).setSaveCollection(saveCollection).setContentValues(contentValues);
    }

    private boolean isSavingToMediaStore() {
        return (getSaveCollection() == null || getContentResolver() == null || getContentValues() == null) ? false : true;
    }

    private boolean isSavingToFile() {
        return getFile() != null;
    }

    private boolean isSavingToFileDescriptor() {
        return getFileDescriptor() != null;
    }

    public androidx.camera.core.VideoCapture.OutputFileOptions toVideoCaptureOutputFileOptions() {
        androidx.camera.core.VideoCapture.OutputFileOptions.Builder builder;
        if (isSavingToFile()) {
            builder = new androidx.camera.core.VideoCapture.OutputFileOptions.Builder((java.io.File) androidx.core.util.Preconditions.checkNotNull(getFile()));
        } else if (isSavingToFileDescriptor()) {
            builder = new androidx.camera.core.VideoCapture.OutputFileOptions.Builder(((android.os.ParcelFileDescriptor) androidx.core.util.Preconditions.checkNotNull(getFileDescriptor())).getFileDescriptor());
        } else {
            androidx.core.util.Preconditions.checkState(isSavingToMediaStore());
            builder = new androidx.camera.core.VideoCapture.OutputFileOptions.Builder((android.content.ContentResolver) androidx.core.util.Preconditions.checkNotNull(getContentResolver()), (android.net.Uri) androidx.core.util.Preconditions.checkNotNull(getSaveCollection()), (android.content.ContentValues) androidx.core.util.Preconditions.checkNotNull(getContentValues()));
        }
        androidx.camera.core.VideoCapture.Metadata metadata = new androidx.camera.core.VideoCapture.Metadata();
        metadata.location = getMetadata().getLocation();
        builder.setMetadata(metadata);
        return builder.build();
    }

    public static abstract class Builder {
        public abstract androidx.camera.view.video.OutputFileOptions build();

        abstract androidx.camera.view.video.OutputFileOptions.Builder setContentResolver(android.content.ContentResolver contentResolver);

        abstract androidx.camera.view.video.OutputFileOptions.Builder setContentValues(android.content.ContentValues contentValues);

        abstract androidx.camera.view.video.OutputFileOptions.Builder setFile(java.io.File file);

        abstract androidx.camera.view.video.OutputFileOptions.Builder setFileDescriptor(android.os.ParcelFileDescriptor fileDescriptor);

        public abstract androidx.camera.view.video.OutputFileOptions.Builder setMetadata(androidx.camera.view.video.Metadata metadata);

        abstract androidx.camera.view.video.OutputFileOptions.Builder setSaveCollection(android.net.Uri uri);

        Builder() {
        }
    }
}
