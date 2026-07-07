package com.bumptech.glide.load;

/* loaded from: classes.dex */
public final class ImageHeaderParserUtils {
    private static final int MARK_READ_LIMIT = 5242880;

    private interface OrientationReader {
        int getOrientation(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.io.IOException;
    }

    private interface TypeReader {
        com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.io.IOException;
    }

    private ImageHeaderParserUtils() {
    }

    public static com.bumptech.glide.load.ImageHeaderParser.ImageType getType(java.util.List<com.bumptech.glide.load.ImageHeaderParser> list, final java.io.InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) throws java.io.IOException {
        if (inputStream == null) {
            return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(MARK_READ_LIMIT);
        return getTypeInternal(list, new com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.1
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.io.IOException {
                try {
                    return imageHeaderParser.getType(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static com.bumptech.glide.load.ImageHeaderParser.ImageType getType(java.util.List<com.bumptech.glide.load.ImageHeaderParser> list, final java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (byteBuffer == null) {
            return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
        }
        return getTypeInternal(list, new com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.2
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.io.IOException {
                return imageHeaderParser.getType(byteBuffer);
            }
        });
    }

    public static com.bumptech.glide.load.ImageHeaderParser.ImageType getType(java.util.List<com.bumptech.glide.load.ImageHeaderParser> list, final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) throws java.io.IOException {
        return getTypeInternal(list, new com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.3
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.io.IOException {
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream = null;
                try {
                    com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream2 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(new java.io.FileInputStream(com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.this.rewindAndGet().getFileDescriptor()), arrayPool);
                    try {
                        com.bumptech.glide.load.ImageHeaderParser.ImageType type = imageHeaderParser.getType(recyclableBufferedInputStream2);
                        try {
                            recyclableBufferedInputStream2.close();
                        } catch (java.io.IOException unused) {
                        }
                        com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.this.rewindAndGet();
                        return type;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        recyclableBufferedInputStream = recyclableBufferedInputStream2;
                        if (recyclableBufferedInputStream != null) {
                            try {
                                recyclableBufferedInputStream.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.this.rewindAndGet();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        });
    }

    private static com.bumptech.glide.load.ImageHeaderParser.ImageType getTypeInternal(java.util.List<com.bumptech.glide.load.ImageHeaderParser> list, com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader typeReader) throws java.io.IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.bumptech.glide.load.ImageHeaderParser.ImageType type = typeReader.getType(list.get(i));
            if (type != com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN) {
                return type;
            }
        }
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int getOrientation(java.util.List<com.bumptech.glide.load.ImageHeaderParser> list, final java.io.InputStream inputStream, final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) throws java.io.IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(MARK_READ_LIMIT);
        return getOrientationInternal(list, new com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.4
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public int getOrientation(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.io.IOException {
                try {
                    return imageHeaderParser.getOrientation(inputStream, arrayPool);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static int getOrientation(java.util.List<com.bumptech.glide.load.ImageHeaderParser> list, final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) throws java.io.IOException {
        return getOrientationInternal(list, new com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.5
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public int getOrientation(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.io.IOException {
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream = null;
                try {
                    com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream2 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(new java.io.FileInputStream(com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.this.rewindAndGet().getFileDescriptor()), arrayPool);
                    try {
                        int orientation = imageHeaderParser.getOrientation(recyclableBufferedInputStream2, arrayPool);
                        try {
                            recyclableBufferedInputStream2.close();
                        } catch (java.io.IOException unused) {
                        }
                        com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.this.rewindAndGet();
                        return orientation;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        recyclableBufferedInputStream = recyclableBufferedInputStream2;
                        if (recyclableBufferedInputStream != null) {
                            try {
                                recyclableBufferedInputStream.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.this.rewindAndGet();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        });
    }

    private static int getOrientationInternal(java.util.List<com.bumptech.glide.load.ImageHeaderParser> list, com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader orientationReader) throws java.io.IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int orientation = orientationReader.getOrientation(list.get(i));
            if (orientation != -1) {
                return orientation;
            }
        }
        return -1;
    }
}
