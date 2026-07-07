package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
public final class ExifOutputStream extends java.io.FilterOutputStream {
    private static final short BYTE_ALIGN_II = 18761;
    private static final short BYTE_ALIGN_MM = 19789;
    private static final boolean DEBUG = false;
    private static final byte[] IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(androidx.camera.core.impl.utils.ExifAttribute.ASCII);
    private static final int IFD_OFFSET = 8;
    private static final byte START_CODE = 42;
    private static final int STATE_FRAME_HEADER = 1;
    private static final int STATE_JPEG_DATA = 2;
    private static final int STATE_SOI = 0;
    private static final int STREAMBUFFER_SIZE = 65536;
    private static final java.lang.String TAG = "ExifOutputStream";
    private final java.nio.ByteBuffer mBuffer;
    private int mByteToCopy;
    private int mByteToSkip;
    private final androidx.camera.core.impl.utils.ExifData mExifData;
    private final byte[] mSingleByteArray;
    private int mState;

    public ExifOutputStream(java.io.OutputStream ou, androidx.camera.core.impl.utils.ExifData exifData) {
        super(new java.io.BufferedOutputStream(ou, 65536));
        this.mSingleByteArray = new byte[1];
        this.mBuffer = java.nio.ByteBuffer.allocate(4);
        this.mState = 0;
        this.mExifData = exifData;
    }

    private int requestByteToBuffer(int requestByteCount, byte[] buffer, int offset, int length) {
        int min = java.lang.Math.min(length, requestByteCount - this.mBuffer.position());
        this.mBuffer.put(buffer, offset, min);
        return min;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0106, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0108, code lost:
    
        r6.out.write(r7, r8, r9);
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifOutputStream.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int oneByte) throws java.io.IOException {
        byte[] bArr = this.mSingleByteArray;
        bArr[0] = (byte) (oneByte & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) throws java.io.IOException {
        write(buffer, 0, buffer.length);
    }

    private void writeExifSegment(androidx.camera.core.impl.utils.ByteOrderedDataOutputStream dataOutputStream) throws java.io.IOException {
        int[] iArr = new int[androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length];
        int[] iArr2 = new int[androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length];
        for (androidx.camera.core.impl.utils.ExifTag exifTag : androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS) {
            for (int i = 0; i < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length; i++) {
                this.mExifData.getAttributes(i).remove(exifTag.name);
            }
        }
        if (!this.mExifData.getAttributes(1).isEmpty()) {
            this.mExifData.getAttributes(0).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[1].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(2).isEmpty()) {
            this.mExifData.getAttributes(0).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[2].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(3).isEmpty()) {
            this.mExifData.getAttributes(1).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[3].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        for (int i2 = 0; i2 < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length; i2++) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> it = this.mExifData.getAttributes(i2).entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int size = it.next().getValue().size();
                if (size > 4) {
                    i3 += size;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length; i5++) {
            if (!this.mExifData.getAttributes(i5).isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.mExifData.getAttributes(i5).size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        int i6 = i4 + 8;
        if (!this.mExifData.getAttributes(1).isEmpty()) {
            this.mExifData.getAttributes(0).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[1].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(iArr[1], this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(2).isEmpty()) {
            this.mExifData.getAttributes(0).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[2].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(iArr[2], this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(3).isEmpty()) {
            this.mExifData.getAttributes(1).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[3].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(iArr[3], this.mExifData.getByteOrder()));
        }
        dataOutputStream.writeUnsignedShort(i6);
        dataOutputStream.write(IDENTIFIER_EXIF_APP1);
        dataOutputStream.writeShort(this.mExifData.getByteOrder() == java.nio.ByteOrder.BIG_ENDIAN ? BYTE_ALIGN_MM : BYTE_ALIGN_II);
        dataOutputStream.setByteOrder(this.mExifData.getByteOrder());
        dataOutputStream.writeUnsignedShort(42);
        dataOutputStream.writeUnsignedInt(8L);
        for (int i7 = 0; i7 < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length; i7++) {
            if (!this.mExifData.getAttributes(i7).isEmpty()) {
                dataOutputStream.writeUnsignedShort(this.mExifData.getAttributes(i7).size());
                int size2 = iArr[i7] + 2 + (this.mExifData.getAttributes(i7).size() * 12) + 4;
                for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> entry : this.mExifData.getAttributes(i7).entrySet()) {
                    int i8 = ((androidx.camera.core.impl.utils.ExifTag) androidx.core.util.Preconditions.checkNotNull(androidx.camera.core.impl.utils.ExifData.Builder.sExifTagMapsForWriting.get(i7).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).number;
                    androidx.camera.core.impl.utils.ExifAttribute value = entry.getValue();
                    int size3 = value.size();
                    dataOutputStream.writeUnsignedShort(i8);
                    dataOutputStream.writeUnsignedShort(value.format);
                    dataOutputStream.writeInt(value.numberOfComponents);
                    if (size3 > 4) {
                        dataOutputStream.writeUnsignedInt(size2);
                        size2 += size3;
                    } else {
                        dataOutputStream.write(value.bytes);
                        if (size3 < 4) {
                            while (size3 < 4) {
                                dataOutputStream.writeByte(0);
                                size3++;
                            }
                        }
                    }
                }
                dataOutputStream.writeUnsignedInt(0L);
                java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> it2 = this.mExifData.getAttributes(i7).entrySet().iterator();
                while (it2.hasNext()) {
                    androidx.camera.core.impl.utils.ExifAttribute value2 = it2.next().getValue();
                    if (value2.bytes.length > 4) {
                        dataOutputStream.write(value2.bytes, 0, value2.bytes.length);
                    }
                }
            }
        }
        dataOutputStream.setByteOrder(java.nio.ByteOrder.BIG_ENDIAN);
    }

    static final class JpegHeader {
        public static final short APP1 = -31;
        public static final short DAC = -52;
        public static final short DHT = -60;
        public static final short EOI = -39;
        public static final short JPG = -56;
        public static final short SOF0 = -64;
        public static final short SOF15 = -49;
        public static final short SOI = -40;

        public static boolean isSofMarker(short marker) {
            return (marker < -64 || marker > -49 || marker == -60 || marker == -56 || marker == -52) ? false : true;
        }

        private JpegHeader() {
        }
    }
}
