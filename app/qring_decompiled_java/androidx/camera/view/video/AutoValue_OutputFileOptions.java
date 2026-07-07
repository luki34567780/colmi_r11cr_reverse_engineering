package androidx.camera.view.video;

/* loaded from: classes.dex */
final class AutoValue_OutputFileOptions extends androidx.camera.view.video.OutputFileOptions {
    private final android.content.ContentResolver contentResolver;
    private final android.content.ContentValues contentValues;
    private final java.io.File file;
    private final android.os.ParcelFileDescriptor fileDescriptor;
    private final androidx.camera.view.video.Metadata metadata;
    private final android.net.Uri saveCollection;

    private AutoValue_OutputFileOptions(java.io.File file, android.os.ParcelFileDescriptor fileDescriptor, android.content.ContentResolver contentResolver, android.net.Uri saveCollection, android.content.ContentValues contentValues, androidx.camera.view.video.Metadata metadata) {
        this.file = file;
        this.fileDescriptor = fileDescriptor;
        this.contentResolver = contentResolver;
        this.saveCollection = saveCollection;
        this.contentValues = contentValues;
        this.metadata = metadata;
    }

    @Override // androidx.camera.view.video.OutputFileOptions
    java.io.File getFile() {
        return this.file;
    }

    @Override // androidx.camera.view.video.OutputFileOptions
    android.os.ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    @Override // androidx.camera.view.video.OutputFileOptions
    android.content.ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    @Override // androidx.camera.view.video.OutputFileOptions
    android.net.Uri getSaveCollection() {
        return this.saveCollection;
    }

    @Override // androidx.camera.view.video.OutputFileOptions
    android.content.ContentValues getContentValues() {
        return this.contentValues;
    }

    @Override // androidx.camera.view.video.OutputFileOptions
    public androidx.camera.view.video.Metadata getMetadata() {
        return this.metadata;
    }

    public java.lang.String toString() {
        return "OutputFileOptions{file=" + this.file + ", fileDescriptor=" + this.fileDescriptor + ", contentResolver=" + this.contentResolver + ", saveCollection=" + this.saveCollection + ", contentValues=" + this.contentValues + ", metadata=" + this.metadata + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.view.video.OutputFileOptions)) {
            return false;
        }
        androidx.camera.view.video.OutputFileOptions outputFileOptions = (androidx.camera.view.video.OutputFileOptions) o;
        java.io.File file = this.file;
        if (file != null ? file.equals(outputFileOptions.getFile()) : outputFileOptions.getFile() == null) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = this.fileDescriptor;
            if (parcelFileDescriptor != null ? parcelFileDescriptor.equals(outputFileOptions.getFileDescriptor()) : outputFileOptions.getFileDescriptor() == null) {
                android.content.ContentResolver contentResolver = this.contentResolver;
                if (contentResolver != null ? contentResolver.equals(outputFileOptions.getContentResolver()) : outputFileOptions.getContentResolver() == null) {
                    android.net.Uri uri = this.saveCollection;
                    if (uri != null ? uri.equals(outputFileOptions.getSaveCollection()) : outputFileOptions.getSaveCollection() == null) {
                        android.content.ContentValues contentValues = this.contentValues;
                        if (contentValues != null ? contentValues.equals(outputFileOptions.getContentValues()) : outputFileOptions.getContentValues() == null) {
                            if (this.metadata.equals(outputFileOptions.getMetadata())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        java.io.File file = this.file;
        int hashCode = ((file == null ? 0 : file.hashCode()) ^ 1000003) * 1000003;
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.fileDescriptor;
        int hashCode2 = (hashCode ^ (parcelFileDescriptor == null ? 0 : parcelFileDescriptor.hashCode())) * 1000003;
        android.content.ContentResolver contentResolver = this.contentResolver;
        int hashCode3 = (hashCode2 ^ (contentResolver == null ? 0 : contentResolver.hashCode())) * 1000003;
        android.net.Uri uri = this.saveCollection;
        int hashCode4 = (hashCode3 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        android.content.ContentValues contentValues = this.contentValues;
        return ((hashCode4 ^ (contentValues != null ? contentValues.hashCode() : 0)) * 1000003) ^ this.metadata.hashCode();
    }

    static final class Builder extends androidx.camera.view.video.OutputFileOptions.Builder {
        private android.content.ContentResolver contentResolver;
        private android.content.ContentValues contentValues;
        private java.io.File file;
        private android.os.ParcelFileDescriptor fileDescriptor;
        private androidx.camera.view.video.Metadata metadata;
        private android.net.Uri saveCollection;

        Builder() {
        }

        @Override // androidx.camera.view.video.OutputFileOptions.Builder
        androidx.camera.view.video.OutputFileOptions.Builder setFile(java.io.File file) {
            this.file = file;
            return this;
        }

        @Override // androidx.camera.view.video.OutputFileOptions.Builder
        androidx.camera.view.video.OutputFileOptions.Builder setFileDescriptor(android.os.ParcelFileDescriptor fileDescriptor) {
            this.fileDescriptor = fileDescriptor;
            return this;
        }

        @Override // androidx.camera.view.video.OutputFileOptions.Builder
        androidx.camera.view.video.OutputFileOptions.Builder setContentResolver(android.content.ContentResolver contentResolver) {
            this.contentResolver = contentResolver;
            return this;
        }

        @Override // androidx.camera.view.video.OutputFileOptions.Builder
        androidx.camera.view.video.OutputFileOptions.Builder setSaveCollection(android.net.Uri saveCollection) {
            this.saveCollection = saveCollection;
            return this;
        }

        @Override // androidx.camera.view.video.OutputFileOptions.Builder
        androidx.camera.view.video.OutputFileOptions.Builder setContentValues(android.content.ContentValues contentValues) {
            this.contentValues = contentValues;
            return this;
        }

        @Override // androidx.camera.view.video.OutputFileOptions.Builder
        public androidx.camera.view.video.OutputFileOptions.Builder setMetadata(androidx.camera.view.video.Metadata metadata) {
            java.util.Objects.requireNonNull(metadata, "Null metadata");
            this.metadata = metadata;
            return this;
        }

        @Override // androidx.camera.view.video.OutputFileOptions.Builder
        public androidx.camera.view.video.OutputFileOptions build() {
            java.lang.String str = "";
            if (this.metadata == null) {
                str = " metadata";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new androidx.camera.view.video.AutoValue_OutputFileOptions(this.file, this.fileDescriptor, this.contentResolver, this.saveCollection, this.contentValues, this.metadata);
        }
    }
}
