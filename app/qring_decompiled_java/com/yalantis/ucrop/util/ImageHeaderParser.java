package com.yalantis.ucrop.util;

/* loaded from: classes3.dex */
public class ImageHeaderParser {
    private static final int EXIF_MAGIC_NUMBER = 65496;
    private static final int EXIF_SEGMENT_TYPE = 225;
    private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
    private static final int MARKER_EOI = 217;
    private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
    private static final int ORIENTATION_TAG_TYPE = 274;
    private static final int SEGMENT_SOS = 218;
    private static final int SEGMENT_START_ID = 255;
    private static final java.lang.String TAG = "ImageHeaderParser";
    public static final int UNKNOWN_ORIENTATION = -1;
    private final com.yalantis.ucrop.util.ImageHeaderParser.Reader reader;
    private static final java.lang.String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\u0000\u0000";
    private static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = JPEG_EXIF_SEGMENT_PREAMBLE.getBytes(java.nio.charset.Charset.forName(com.bumptech.glide.load.Key.STRING_CHARSET_NAME));
    private static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private interface Reader {
        int getUInt16() throws java.io.IOException;

        short getUInt8() throws java.io.IOException;

        int read(byte[] bArr, int i) throws java.io.IOException;

        long skip(long j) throws java.io.IOException;
    }

    private static int calcTagOffset(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private static boolean handles(int i) {
        return (i & EXIF_MAGIC_NUMBER) == EXIF_MAGIC_NUMBER || i == MOTOROLA_TIFF_MAGIC_NUMBER || i == INTEL_TIFF_MAGIC_NUMBER;
    }

    public ImageHeaderParser(java.io.InputStream inputStream) {
        this.reader = new com.yalantis.ucrop.util.ImageHeaderParser.StreamReader(inputStream);
    }

    public int getOrientation() throws java.io.IOException {
        int uInt16 = this.reader.getUInt16();
        if (!handles(uInt16)) {
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "Parser doesn't handle magic number: " + uInt16);
            }
            return -1;
        }
        int moveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength();
        if (moveToExifSegmentAndGetLength == -1) {
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        return parseExifSegment(new byte[moveToExifSegmentAndGetLength], moveToExifSegmentAndGetLength);
    }

    private int parseExifSegment(byte[] bArr, int i) throws java.io.IOException {
        int read = this.reader.read(bArr, i);
        if (read != i) {
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "Unable to read exif segment data, length: " + i + ", actually read: " + read);
            }
            return -1;
        }
        if (hasJpegExifPreamble(bArr, i)) {
            return parseExifSegment(new com.yalantis.ucrop.util.ImageHeaderParser.RandomAccessReader(bArr, i));
        }
        if (android.util.Log.isLoggable(TAG, 3)) {
            android.util.Log.d(TAG, "Missing jpeg exif preamble");
        }
        return -1;
    }

    private boolean hasJpegExifPreamble(byte[] bArr, int i) {
        boolean z = bArr != null && i > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    private int moveToExifSegmentAndGetLength() throws java.io.IOException {
        short uInt8;
        int uInt16;
        long j;
        long skip;
        do {
            short uInt82 = this.reader.getUInt8();
            if (uInt82 != 255) {
                if (android.util.Log.isLoggable(TAG, 3)) {
                    android.util.Log.d(TAG, "Unknown segmentId=" + ((int) uInt82));
                }
                return -1;
            }
            uInt8 = this.reader.getUInt8();
            if (uInt8 == SEGMENT_SOS) {
                return -1;
            }
            if (uInt8 == MARKER_EOI) {
                if (android.util.Log.isLoggable(TAG, 3)) {
                    android.util.Log.d(TAG, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            uInt16 = this.reader.getUInt16() - 2;
            if (uInt8 == EXIF_SEGMENT_TYPE) {
                return uInt16;
            }
            j = uInt16;
            skip = this.reader.skip(j);
        } while (skip == j);
        if (android.util.Log.isLoggable(TAG, 3)) {
            android.util.Log.d(TAG, "Unable to skip enough data, type: " + ((int) uInt8) + ", wanted to skip: " + uInt16 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    private static int parseExifSegment(com.yalantis.ucrop.util.ImageHeaderParser.RandomAccessReader randomAccessReader) {
        java.nio.ByteOrder byteOrder;
        short int16 = randomAccessReader.getInt16(6);
        if (int16 == MOTOROLA_TIFF_MAGIC_NUMBER) {
            byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        } else if (int16 == INTEL_TIFF_MAGIC_NUMBER) {
            byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
        } else {
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "Unknown endianness = " + ((int) int16));
            }
            byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        }
        randomAccessReader.order(byteOrder);
        int int32 = randomAccessReader.getInt32(10) + 6;
        short int162 = randomAccessReader.getInt16(int32);
        for (int i = 0; i < int162; i++) {
            int calcTagOffset = calcTagOffset(int32, i);
            short int163 = randomAccessReader.getInt16(calcTagOffset);
            if (int163 == ORIENTATION_TAG_TYPE) {
                short int164 = randomAccessReader.getInt16(calcTagOffset + 2);
                if (int164 < 1 || int164 > 12) {
                    if (android.util.Log.isLoggable(TAG, 3)) {
                        android.util.Log.d(TAG, "Got invalid format code = " + ((int) int164));
                    }
                } else {
                    int int322 = randomAccessReader.getInt32(calcTagOffset + 4);
                    if (int322 < 0) {
                        if (android.util.Log.isLoggable(TAG, 3)) {
                            android.util.Log.d(TAG, "Negative tiff component count");
                        }
                    } else {
                        if (android.util.Log.isLoggable(TAG, 3)) {
                            android.util.Log.d(TAG, "Got tagIndex=" + i + " tagType=" + ((int) int163) + " formatCode=" + ((int) int164) + " componentCount=" + int322);
                        }
                        int i2 = int322 + BYTES_PER_FORMAT[int164];
                        if (i2 > 4) {
                            if (android.util.Log.isLoggable(TAG, 3)) {
                                android.util.Log.d(TAG, "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) int164));
                            }
                        } else {
                            int i3 = calcTagOffset + 8;
                            if (i3 < 0 || i3 > randomAccessReader.length()) {
                                if (android.util.Log.isLoggable(TAG, 3)) {
                                    android.util.Log.d(TAG, "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) int163));
                                }
                            } else if (i2 < 0 || i2 + i3 > randomAccessReader.length()) {
                                if (android.util.Log.isLoggable(TAG, 3)) {
                                    android.util.Log.d(TAG, "Illegal number of bytes for TI tag data tagType=" + ((int) int163));
                                }
                            } else {
                                return randomAccessReader.getInt16(i3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private static class RandomAccessReader {
        private final java.nio.ByteBuffer data;

        public RandomAccessReader(byte[] bArr, int i) {
            this.data = (java.nio.ByteBuffer) java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.BIG_ENDIAN).limit(i);
        }

        public void order(java.nio.ByteOrder byteOrder) {
            this.data.order(byteOrder);
        }

        public int length() {
            return this.data.remaining();
        }

        public int getInt32(int i) {
            return this.data.getInt(i);
        }

        public short getInt16(int i) {
            return this.data.getShort(i);
        }
    }

    private static class StreamReader implements com.yalantis.ucrop.util.ImageHeaderParser.Reader {
        private final java.io.InputStream is;

        public StreamReader(java.io.InputStream inputStream) {
            this.is = inputStream;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int getUInt16() throws java.io.IOException {
            return ((this.is.read() << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (this.is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public short getUInt8() throws java.io.IOException {
            return (short) (this.is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public long skip(long j) throws java.io.IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.is.skip(j2);
                if (skip <= 0) {
                    if (this.is.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int read(byte[] bArr, int i) throws java.io.IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.is.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }
    }

    public static void copyExif(androidx.exifinterface.media.ExifInterface exifInterface, int i, int i2, java.lang.String str) {
        try {
            copyExifAttributes(exifInterface, new androidx.exifinterface.media.ExifInterface(str), i, i2);
        } catch (java.io.IOException e) {
            android.util.Log.d(TAG, e.getMessage());
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0037 -> B:11:0x003e). Please report as a decompilation issue!!! */
    public static void copyExif(android.content.Context context, int i, int i2, android.net.Uri uri, java.lang.String str) {
        if (context == null) {
            android.util.Log.d(TAG, "context is null");
            return;
        }
        java.io.InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = context.getContentResolver().openInputStream(uri);
                    copyExifAttributes(new androidx.exifinterface.media.ExifInterface(inputStream), new androidx.exifinterface.media.ExifInterface(str), i, i2);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (java.io.IOException e) {
                    android.util.Log.d(TAG, e.getMessage(), e);
                    if (inputStream == null) {
                    } else {
                        inputStream.close();
                    }
                }
            } catch (java.io.IOException e2) {
                android.util.Log.d(TAG, e2.getMessage(), e2);
            }
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e3) {
                    android.util.Log.d(TAG, e3.getMessage(), e3);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void copyExif(android.content.Context r4, int r5, int r6, android.net.Uri r7, android.net.Uri r8) {
        /*
            java.lang.String r0 = "ImageHeaderParser"
            if (r4 != 0) goto La
            java.lang.String r4 = "context is null"
            android.util.Log.d(r0, r4)
            return
        La:
            r1 = 0
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            java.io.InputStream r7 = r2.openInputStream(r7)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            androidx.exifinterface.media.ExifInterface r2 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            java.lang.String r3 = "rw"
            android.os.ParcelFileDescriptor r1 = r4.openFileDescriptor(r8, r3)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            androidx.exifinterface.media.ExifInterface r4 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            java.io.FileDescriptor r8 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            copyExifAttributes(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            if (r7 == 0) goto L3c
            r7.close()     // Catch: java.io.IOException -> L34
            goto L3c
        L34:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            android.util.Log.d(r0, r5, r4)
        L3c:
            if (r1 == 0) goto L72
            r1.close()     // Catch: java.io.IOException -> L6a
            goto L72
        L42:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L74
        L46:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L4f
        L4a:
            r4 = move-exception
            r5 = r1
            goto L74
        L4d:
            r4 = move-exception
            r5 = r1
        L4f:
            java.lang.String r6 = r4.getMessage()     // Catch: java.lang.Throwable -> L73
            android.util.Log.d(r0, r6, r4)     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L64
            r1.close()     // Catch: java.io.IOException -> L5c
            goto L64
        L5c:
            r4 = move-exception
            java.lang.String r6 = r4.getMessage()
            android.util.Log.d(r0, r6, r4)
        L64:
            if (r5 == 0) goto L72
            r5.close()     // Catch: java.io.IOException -> L6a
            goto L72
        L6a:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            android.util.Log.d(r0, r5, r4)
        L72:
            return
        L73:
            r4 = move-exception
        L74:
            if (r1 == 0) goto L82
            r1.close()     // Catch: java.io.IOException -> L7a
            goto L82
        L7a:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            android.util.Log.d(r0, r7, r6)
        L82:
            if (r5 == 0) goto L90
            r5.close()     // Catch: java.io.IOException -> L88
            goto L90
        L88:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            android.util.Log.d(r0, r6, r5)
        L90:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.util.ImageHeaderParser.copyExif(android.content.Context, int, int, android.net.Uri, android.net.Uri):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0038 -> B:11:0x003f). Please report as a decompilation issue!!! */
    public static void copyExif(android.content.Context context, androidx.exifinterface.media.ExifInterface exifInterface, int i, int i2, android.net.Uri uri) {
        if (context == null) {
            android.util.Log.d(TAG, "context is null");
            return;
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    copyExifAttributes(exifInterface, new androidx.exifinterface.media.ExifInterface(parcelFileDescriptor.getFileDescriptor()), i, i2);
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                } catch (java.io.IOException e) {
                    android.util.Log.d(TAG, e.getMessage());
                    if (parcelFileDescriptor == null) {
                    } else {
                        parcelFileDescriptor.close();
                    }
                }
            } catch (java.io.IOException e2) {
                android.util.Log.d(TAG, e2.getMessage(), e2);
            }
        } catch (java.lang.Throwable th) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (java.io.IOException e3) {
                    android.util.Log.d(TAG, e3.getMessage(), e3);
                }
            }
            throw th;
        }
    }

    private static void copyExifAttributes(androidx.exifinterface.media.ExifInterface exifInterface, androidx.exifinterface.media.ExifInterface exifInterface2, int i, int i2) throws java.io.IOException {
        java.lang.String[] strArr = {androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_DATETIME, androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, androidx.exifinterface.media.ExifInterface.TAG_FLASH, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD, androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, androidx.exifinterface.media.ExifInterface.TAG_MAKE, androidx.exifinterface.media.ExifInterface.TAG_MODEL, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE};
        for (int i3 = 0; i3 < 22; i3++) {
            java.lang.String str = strArr[i3];
            java.lang.String attribute = exifInterface.getAttribute(str);
            if (!android.text.TextUtils.isEmpty(attribute)) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, java.lang.String.valueOf(i));
        exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, java.lang.String.valueOf(i2));
        exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, "0");
        exifInterface2.saveAttributes();
    }
}
