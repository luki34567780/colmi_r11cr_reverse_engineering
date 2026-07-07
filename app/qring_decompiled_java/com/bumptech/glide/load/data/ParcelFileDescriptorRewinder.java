package com.bumptech.glide.load.data;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements com.bumptech.glide.load.data.DataRewinder<android.os.ParcelFileDescriptor> {
    private final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.InternalRewinder rewinder;

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }

    public static boolean isSupported() {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public ParcelFileDescriptorRewinder(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.rewinder = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.InternalRewinder(parcelFileDescriptor);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.DataRewinder
    public android.os.ParcelFileDescriptor rewindAndGet() throws java.io.IOException {
        return this.rewinder.rewind();
    }

    public static final class Factory implements com.bumptech.glide.load.data.DataRewinder.Factory<android.os.ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public com.bumptech.glide.load.data.DataRewinder<android.os.ParcelFileDescriptor> build(android.os.ParcelFileDescriptor parcelFileDescriptor) {
            return new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public java.lang.Class<android.os.ParcelFileDescriptor> getDataClass() {
            return android.os.ParcelFileDescriptor.class;
        }
    }

    private static final class InternalRewinder {
        private final android.os.ParcelFileDescriptor parcelFileDescriptor;

        InternalRewinder(android.os.ParcelFileDescriptor parcelFileDescriptor) {
            this.parcelFileDescriptor = parcelFileDescriptor;
        }

        android.os.ParcelFileDescriptor rewind() throws java.io.IOException {
            try {
                android.system.Os.lseek(this.parcelFileDescriptor.getFileDescriptor(), 0L, android.system.OsConstants.SEEK_SET);
                return this.parcelFileDescriptor;
            } catch (android.system.ErrnoException e) {
                throw new java.io.IOException(e);
            }
        }
    }
}
