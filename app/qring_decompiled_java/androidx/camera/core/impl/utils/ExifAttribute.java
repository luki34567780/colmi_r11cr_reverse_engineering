package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
final class ExifAttribute {
    public static final long BYTES_OFFSET_UNKNOWN = -1;
    static final int IFD_FORMAT_BYTE = 1;
    static final int IFD_FORMAT_DOUBLE = 12;
    static final int IFD_FORMAT_SBYTE = 6;
    static final int IFD_FORMAT_SINGLE = 11;
    static final int IFD_FORMAT_SLONG = 9;
    static final int IFD_FORMAT_SRATIONAL = 10;
    static final int IFD_FORMAT_SSHORT = 8;
    static final int IFD_FORMAT_STRING = 2;
    static final int IFD_FORMAT_ULONG = 4;
    static final int IFD_FORMAT_UNDEFINED = 7;
    static final int IFD_FORMAT_URATIONAL = 5;
    static final int IFD_FORMAT_USHORT = 3;
    private static final java.lang.String TAG = "ExifAttribute";
    public final byte[] bytes;
    public final long bytesOffset;
    public final int format;
    public final int numberOfComponents;
    static final java.nio.charset.Charset ASCII = java.nio.charset.StandardCharsets.US_ASCII;
    static final java.lang.String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] EXIF_ASCII_PREFIX = {65, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_LINK_LAST_DEVICE, com.oudmon.ble.base.communication.Constants.CMD_GET_STEP_SOMEDAY_DETAIL, 73, 73, 0, 0, 0};

    ExifAttribute(int format, int numberOfComponents, byte[] bytes) {
        this(format, numberOfComponents, -1L, bytes);
    }

    ExifAttribute(int format, int numberOfComponents, long bytesOffset, byte[] bytes) {
        this.format = format;
        this.numberOfComponents = numberOfComponents;
        this.bytesOffset = bytesOffset;
        this.bytes = bytes;
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createUShort(int[] values, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[3] * values.length]);
        wrap.order(byteOrder);
        for (int i : values) {
            wrap.putShort((short) i);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(3, values.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createUShort(int value, java.nio.ByteOrder byteOrder) {
        return createUShort(new int[]{value}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createULong(long[] values, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[4] * values.length]);
        wrap.order(byteOrder);
        for (long j : values) {
            wrap.putInt((int) j);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(4, values.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createULong(long value, java.nio.ByteOrder byteOrder) {
        return createULong(new long[]{value}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createSLong(int[] values, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[9] * values.length]);
        wrap.order(byteOrder);
        for (int i : values) {
            wrap.putInt(i);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(9, values.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createSLong(int value, java.nio.ByteOrder byteOrder) {
        return createSLong(new int[]{value}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createByte(java.lang.String value) {
        if (value.length() == 1 && value.charAt(0) >= '0' && value.charAt(0) <= '1') {
            return new androidx.camera.core.impl.utils.ExifAttribute(1, 1, new byte[]{(byte) (value.charAt(0) - '0')});
        }
        byte[] bytes = value.getBytes(ASCII);
        return new androidx.camera.core.impl.utils.ExifAttribute(1, bytes.length, bytes);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createString(java.lang.String value) {
        byte[] bytes = (value + (char) 0).getBytes(ASCII);
        return new androidx.camera.core.impl.utils.ExifAttribute(2, bytes.length, bytes);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createURational(androidx.camera.core.impl.utils.LongRational[] values, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[5] * values.length]);
        wrap.order(byteOrder);
        for (androidx.camera.core.impl.utils.LongRational longRational : values) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(5, values.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createURational(androidx.camera.core.impl.utils.LongRational value, java.nio.ByteOrder byteOrder) {
        return createURational(new androidx.camera.core.impl.utils.LongRational[]{value}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createSRational(androidx.camera.core.impl.utils.LongRational[] values, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[10] * values.length]);
        wrap.order(byteOrder);
        for (androidx.camera.core.impl.utils.LongRational longRational : values) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(10, values.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createSRational(androidx.camera.core.impl.utils.LongRational value, java.nio.ByteOrder byteOrder) {
        return createSRational(new androidx.camera.core.impl.utils.LongRational[]{value}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createDouble(double[] values, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[12] * values.length]);
        wrap.order(byteOrder);
        for (double d : values) {
            wrap.putDouble(d);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(12, values.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createDouble(double value, java.nio.ByteOrder byteOrder) {
        return createDouble(new double[]{value}, byteOrder);
    }

    public java.lang.String toString() {
        return "(" + IFD_FORMAT_NAMES[this.format] + ", data length:" + this.bytes.length + ")";
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:169:0x019c */
    /* JADX WARN: Removed duplicated region for block: B:172:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.Object getValue(java.nio.ByteOrder r11) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifAttribute.getValue(java.nio.ByteOrder):java.lang.Object");
    }

    public double getDoubleValue(java.nio.ByteOrder byteOrder) {
        java.lang.Object value = getValue(byteOrder);
        if (value == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
        }
        if (value instanceof java.lang.String) {
            return java.lang.Double.parseDouble((java.lang.String) value);
        }
        if (value instanceof long[]) {
            if (((long[]) value).length == 1) {
                return r5[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (value instanceof int[]) {
            if (((int[]) value).length == 1) {
                return r5[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (value instanceof androidx.camera.core.impl.utils.LongRational[]) {
            androidx.camera.core.impl.utils.LongRational[] longRationalArr = (androidx.camera.core.impl.utils.LongRational[]) value;
            if (longRationalArr.length == 1) {
                return longRationalArr[0].toDouble();
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        throw new java.lang.NumberFormatException("Couldn't find a double value");
    }

    public int getIntValue(java.nio.ByteOrder byteOrder) {
        java.lang.Object value = getValue(byteOrder);
        if (value == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
        }
        if (value instanceof java.lang.String) {
            return java.lang.Integer.parseInt((java.lang.String) value);
        }
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        throw new java.lang.NumberFormatException("Couldn't find a integer value");
    }

    public java.lang.String getStringValue(java.nio.ByteOrder byteOrder) {
        java.lang.Object value = getValue(byteOrder);
        if (value == null) {
            return null;
        }
        if (value instanceof java.lang.String) {
            return (java.lang.String) value;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(value instanceof androidx.camera.core.impl.utils.LongRational[])) {
            return null;
        }
        androidx.camera.core.impl.utils.LongRational[] longRationalArr = (androidx.camera.core.impl.utils.LongRational[]) value;
        while (i < longRationalArr.length) {
            sb.append(longRationalArr[i].getNumerator());
            sb.append('/');
            sb.append(longRationalArr[i].getDenominator());
            i++;
            if (i != longRationalArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public int size() {
        return IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
    }
}
