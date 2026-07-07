package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
public class ExifData {
    private static final boolean DEBUG = false;
    static final androidx.camera.core.impl.utils.ExifTag[] EXIF_POINTER_TAGS;
    static final androidx.camera.core.impl.utils.ExifTag[][] EXIF_TAGS;
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_EXIF_TAGS;
    static final java.lang.String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_GPS_TAGS;
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_INTEROPERABILITY_TAGS;
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_TIFF_TAGS;
    static final int IFD_TYPE_EXIF = 1;
    static final int IFD_TYPE_GPS = 2;
    static final int IFD_TYPE_INTEROPERABILITY = 3;
    static final int IFD_TYPE_PRIMARY = 0;
    private static final int MM_IN_MICRONS = 1000;
    private static final java.lang.String TAG = "ExifData";
    static final java.lang.String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    static final java.lang.String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    static final java.lang.String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    static final java.lang.String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    static final java.util.HashSet<java.lang.String> sTagSetForCompatibility;
    private final java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> mAttributes;
    private final java.nio.ByteOrder mByteOrder;

    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    static {
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, 256, 3, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, 257, 3, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_MAKE, 271, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_MODEL, 272, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 274, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_X_RESOLUTION, 282, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_Y_RESOLUTION, 283, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_RESOLUTION_UNIT, 296, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SOFTWARE, 305, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_DATETIME, 306, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_POSITIONING, 531, 3), new androidx.camera.core.impl.utils.ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4)};
        IFD_TIFF_TAGS = exifTagArr;
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr2 = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, 33434, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, 33437, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_PROGRAM, 34850, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SENSITIVITY_TYPE, 34864, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXIF_VERSION, 36864, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, 36867, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, 36868, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_COMPONENTS_CONFIGURATION, 37121, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SHUTTER_SPEED_VALUE, 37377, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_APERTURE_VALUE, 37378, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_BRIGHTNESS_VALUE, 37379, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_MAX_APERTURE_VALUE, 37381, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_METERING_MODE, 37383, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, 37384, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FLASH, 37385, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, 37386, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, 37520, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FLASHPIX_VERSION, 40960, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_COLOR_SPACE, 40961, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SENSING_METHOD, 41495, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_FILE_SOURCE, 41728, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SCENE_TYPE, 41729, 7), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_CUSTOM_RENDERED, 41985, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_MODE, 41986, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE, 41987, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SCENE_CAPTURE_TYPE, 41990, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_CONTRAST, 41992, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SATURATION, 41993, 3), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_SHARPNESS, 41994, 3)};
        IFD_EXIF_TAGS = exifTagArr2;
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr3 = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_VERSION_ID, 0, 1), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, 1, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, 2, 5, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, 3, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, 4, 5, 10), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, 5, 1), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, 6, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, 7, 5), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, 12, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK_REF, 14, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION_REF, 16, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING_REF, 23, 2), new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE_REF, 25, 2)};
        IFD_GPS_TAGS = exifTagArr3;
        EXIF_POINTER_TAGS = new androidx.camera.core.impl.utils.ExifTag[]{new androidx.camera.core.impl.utils.ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new androidx.camera.core.impl.utils.ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4)};
        androidx.camera.core.impl.utils.ExifTag[] exifTagArr4 = {new androidx.camera.core.impl.utils.ExifTag(androidx.exifinterface.media.ExifInterface.TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = exifTagArr4;
        EXIF_TAGS = new androidx.camera.core.impl.utils.ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4};
        sTagSetForCompatibility = new java.util.HashSet<>(java.util.Arrays.asList(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP));
    }

    ExifData(java.nio.ByteOrder order, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> attributes) {
        androidx.core.util.Preconditions.checkState(attributes.size() == EXIF_TAGS.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.mByteOrder = order;
        this.mAttributes = attributes;
    }

    public java.nio.ByteOrder getByteOrder() {
        return this.mByteOrder;
    }

    java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> getAttributes(int ifdIndex) {
        androidx.core.util.Preconditions.checkArgumentInRange(ifdIndex, 0, EXIF_TAGS.length, "Invalid IFD index: " + ifdIndex + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.mAttributes.get(ifdIndex);
    }

    public java.lang.String getAttribute(java.lang.String tag) {
        androidx.camera.core.impl.utils.ExifAttribute exifAttribute = getExifAttribute(tag);
        if (exifAttribute != null) {
            if (!sTagSetForCompatibility.contains(tag)) {
                return exifAttribute.getStringValue(this.mByteOrder);
            }
            if (tag.equals(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP)) {
                if (exifAttribute.format != 5 && exifAttribute.format != 10) {
                    androidx.camera.core.Logger.w(TAG, "GPS Timestamp format is not rational. format=" + exifAttribute.format);
                    return null;
                }
                androidx.camera.core.impl.utils.LongRational[] longRationalArr = (androidx.camera.core.impl.utils.LongRational[]) exifAttribute.getValue(this.mByteOrder);
                if (longRationalArr == null || longRationalArr.length != 3) {
                    androidx.camera.core.Logger.w(TAG, "Invalid GPS Timestamp array. array=" + java.util.Arrays.toString(longRationalArr));
                    return null;
                }
                return java.lang.String.format(java.util.Locale.US, "%02d:%02d:%02d", java.lang.Integer.valueOf((int) (longRationalArr[0].getNumerator() / longRationalArr[0].getDenominator())), java.lang.Integer.valueOf((int) (longRationalArr[1].getNumerator() / longRationalArr[1].getDenominator())), java.lang.Integer.valueOf((int) (longRationalArr[2].getNumerator() / longRationalArr[2].getDenominator())));
            }
            try {
                return java.lang.Double.toString(exifAttribute.getDoubleValue(this.mByteOrder));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return null;
    }

    private androidx.camera.core.impl.utils.ExifAttribute getExifAttribute(java.lang.String tag) {
        if (androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS.equals(tag)) {
            tag = androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            androidx.camera.core.impl.utils.ExifAttribute exifAttribute = this.mAttributes.get(i).get(tag);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public static androidx.camera.core.impl.utils.ExifData.Builder builderForDevice() {
        return new androidx.camera.core.impl.utils.ExifData.Builder(java.nio.ByteOrder.BIG_ENDIAN).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(1)).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_X_RESOLUTION, "72/1").setAttribute(androidx.exifinterface.media.ExifInterface.TAG_Y_RESOLUTION, "72/1").setAttribute(androidx.exifinterface.media.ExifInterface.TAG_RESOLUTION_UNIT, java.lang.String.valueOf(2)).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_Y_CB_CR_POSITIONING, java.lang.String.valueOf(1)).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_MAKE, android.os.Build.MANUFACTURER).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_MODEL, android.os.Build.MODEL);
    }

    public static final class Builder {
        private static final int DATETIME_VALUE_STRING_LENGTH = 19;
        final java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> mAttributes = java.util.Collections.list(new java.util.Enumeration<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.2
            int mIfdIndex = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> nextElement() {
                this.mIfdIndex++;
                return new java.util.HashMap();
            }
        });
        private final java.nio.ByteOrder mByteOrder;
        private static final java.util.regex.Pattern GPS_TIMESTAMP_PATTERN = java.util.regex.Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final java.util.regex.Pattern DATETIME_PRIMARY_FORMAT_PATTERN = java.util.regex.Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final java.util.regex.Pattern DATETIME_SECONDARY_FORMAT_PATTERN = java.util.regex.Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        static final java.util.List<java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag>> sExifTagMapsForWriting = java.util.Collections.list(new java.util.Enumeration<java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.1
            int mIfdIndex = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag> nextElement() {
                java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag> hashMap = new java.util.HashMap<>();
                for (androidx.camera.core.impl.utils.ExifTag exifTag : androidx.camera.core.impl.utils.ExifData.EXIF_TAGS[this.mIfdIndex]) {
                    hashMap.put(exifTag.name, exifTag);
                }
                this.mIfdIndex++;
                return hashMap;
            }
        });

        Builder(java.nio.ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setImageWidth(int width) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, java.lang.String.valueOf(width));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setImageHeight(int height) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, java.lang.String.valueOf(height));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setOrientationDegrees(int orientationDegrees) {
            int i;
            if (orientationDegrees == 0) {
                i = 1;
            } else if (orientationDegrees == 90) {
                i = 6;
            } else if (orientationDegrees == 180) {
                i = 3;
            } else if (orientationDegrees != 270) {
                androidx.camera.core.Logger.w(androidx.camera.core.impl.utils.ExifData.TAG, "Unexpected orientation value: " + orientationDegrees + ". Must be one of 0, 90, 180, 270.");
                i = 0;
            } else {
                i = 8;
            }
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setFlashState(androidx.camera.core.impl.CameraCaptureMetaData.FlashState flashState) {
            int i;
            if (flashState == androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN) {
                return this;
            }
            int i2 = androidx.camera.core.impl.utils.ExifData.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[flashState.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else {
                if (i2 != 3) {
                    androidx.camera.core.Logger.w(androidx.camera.core.impl.utils.ExifData.TAG, "Unknown flash state: " + flashState);
                    return this;
                }
                i = 1;
            }
            if ((i & 1) == 1) {
                setAttribute(androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, java.lang.String.valueOf(4));
            }
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_FLASH, java.lang.String.valueOf(i));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setExposureTimeNanos(long exposureTimeNs) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, java.lang.String.valueOf(exposureTimeNs / java.util.concurrent.TimeUnit.SECONDS.toNanos(1L)));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setLensFNumber(float fNumber) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, java.lang.String.valueOf(fNumber));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setIso(int iso) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SENSITIVITY_TYPE, java.lang.String.valueOf(3)).setAttribute(androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, java.lang.String.valueOf(java.lang.Math.min(65535, iso)));
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setFocalLength(float focalLength) {
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, new androidx.camera.core.impl.utils.LongRational((long) (focalLength * 1000.0f), 1000L).toString());
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setWhiteBalanceMode(androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode whiteBalanceMode) {
            java.lang.String valueOf;
            int i = androidx.camera.core.impl.utils.ExifData.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode[whiteBalanceMode.ordinal()];
            if (i == 1) {
                valueOf = java.lang.String.valueOf(0);
            } else {
                valueOf = i != 2 ? null : java.lang.String.valueOf(1);
            }
            return setAttribute(androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE, valueOf);
        }

        public androidx.camera.core.impl.utils.ExifData.Builder setAttribute(java.lang.String tag, java.lang.String value) {
            setAttributeInternal(tag, value, this.mAttributes);
            return this;
        }

        public androidx.camera.core.impl.utils.ExifData.Builder removeAttribute(java.lang.String tag) {
            setAttributeInternal(tag, null, this.mAttributes);
            return this;
        }

        private void setAttributeIfMissing(java.lang.String tag, java.lang.String value, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> attributes) {
            java.util.Iterator<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> it = attributes.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(tag)) {
                    return;
                }
            }
            setAttributeInternal(tag, value, attributes);
        }

        private void setAttributeInternal(java.lang.String tag, java.lang.String value, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> attributes) {
            int i;
            int i2;
            androidx.camera.core.impl.utils.ExifData.Builder builder = this;
            java.lang.String str = tag;
            java.lang.String str2 = value;
            if ((androidx.exifinterface.media.ExifInterface.TAG_DATETIME.equals(str) || androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL.equals(str) || androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED.equals(str)) && str2 != null) {
                boolean find = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(str2).find();
                boolean find2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(str2).find();
                if (value.length() != 19 || (!find && !find2)) {
                    androidx.camera.core.Logger.w(androidx.camera.core.impl.utils.ExifData.TAG, "Invalid value for " + str + " : " + str2);
                    return;
                }
                if (find2) {
                    str2 = str2.replaceAll("-", ":");
                }
            }
            if (androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str)) {
                str = androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
            }
            java.lang.String str3 = str;
            int i3 = 2;
            int i4 = 1;
            if (str2 != null && androidx.camera.core.impl.utils.ExifData.sTagSetForCompatibility.contains(str3)) {
                if (str3.equals(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP)) {
                    java.util.regex.Matcher matcher = GPS_TIMESTAMP_PATTERN.matcher(str2);
                    if (!matcher.find()) {
                        androidx.camera.core.Logger.w(androidx.camera.core.impl.utils.ExifData.TAG, "Invalid value for " + str3 + " : " + str2);
                        return;
                    }
                    str2 = java.lang.Integer.parseInt((java.lang.String) androidx.core.util.Preconditions.checkNotNull(matcher.group(1))) + "/1," + java.lang.Integer.parseInt((java.lang.String) androidx.core.util.Preconditions.checkNotNull(matcher.group(2))) + "/1," + java.lang.Integer.parseInt((java.lang.String) androidx.core.util.Preconditions.checkNotNull(matcher.group(3))) + "/1";
                } else {
                    try {
                        str2 = new androidx.camera.core.impl.utils.LongRational(java.lang.Double.parseDouble(str2)).toString();
                    } catch (java.lang.NumberFormatException e) {
                        androidx.camera.core.Logger.w(androidx.camera.core.impl.utils.ExifData.TAG, "Invalid value for " + str3 + " : " + str2, e);
                        return;
                    }
                }
            }
            char c = 0;
            int i5 = 0;
            while (i5 < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length) {
                androidx.camera.core.impl.utils.ExifTag exifTag = sExifTagMapsForWriting.get(i5).get(str3);
                if (exifTag != null) {
                    if (str2 == null) {
                        attributes.get(i5).remove(str3);
                    } else {
                        android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat = guessDataFormat(str2);
                        if (exifTag.primaryFormat == ((java.lang.Integer) guessDataFormat.first).intValue() || exifTag.primaryFormat == ((java.lang.Integer) guessDataFormat.second).intValue()) {
                            i2 = exifTag.primaryFormat;
                        } else if (exifTag.secondaryFormat != -1 && (exifTag.secondaryFormat == ((java.lang.Integer) guessDataFormat.first).intValue() || exifTag.secondaryFormat == ((java.lang.Integer) guessDataFormat.second).intValue())) {
                            i2 = exifTag.secondaryFormat;
                        } else if (exifTag.primaryFormat == i4 || exifTag.primaryFormat == 7 || exifTag.primaryFormat == i3) {
                            i2 = exifTag.primaryFormat;
                        }
                        java.lang.String str4 = "/";
                        switch (i2) {
                            case 1:
                                i = i5;
                                attributes.get(i).put(str3, androidx.camera.core.impl.utils.ExifAttribute.createByte(str2));
                                continue;
                            case 2:
                            case 7:
                                i = i5;
                                attributes.get(i).put(str3, androidx.camera.core.impl.utils.ExifAttribute.createString(str2));
                                continue;
                            case 3:
                                i = i5;
                                java.lang.String[] split = str2.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i6 = 0; i6 < split.length; i6++) {
                                    iArr[i6] = java.lang.Integer.parseInt(split[i6]);
                                }
                                attributes.get(i).put(str3, androidx.camera.core.impl.utils.ExifAttribute.createUShort(iArr, builder.mByteOrder));
                                continue;
                            case 4:
                                i = i5;
                                java.lang.String[] split2 = str2.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i7 = 0; i7 < split2.length; i7++) {
                                    jArr[i7] = java.lang.Long.parseLong(split2[i7]);
                                }
                                attributes.get(i).put(str3, androidx.camera.core.impl.utils.ExifAttribute.createULong(jArr, builder.mByteOrder));
                                continue;
                            case 5:
                                java.lang.String str5 = "/";
                                java.lang.String[] split3 = str2.split(",", -1);
                                androidx.camera.core.impl.utils.LongRational[] longRationalArr = new androidx.camera.core.impl.utils.LongRational[split3.length];
                                int i8 = 0;
                                while (i8 < split3.length) {
                                    java.lang.String str6 = str5;
                                    java.lang.String[] split4 = split3[i8].split(str6, -1);
                                    longRationalArr[i8] = new androidx.camera.core.impl.utils.LongRational((long) java.lang.Double.parseDouble(split4[c]), (long) java.lang.Double.parseDouble(split4[1]));
                                    i8++;
                                    str5 = str6;
                                    i5 = i5;
                                    c = 0;
                                }
                                i = i5;
                                attributes.get(i).put(str3, androidx.camera.core.impl.utils.ExifAttribute.createURational(longRationalArr, builder.mByteOrder));
                                continue;
                            case 9:
                                java.lang.String[] split5 = str2.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i9 = 0; i9 < split5.length; i9++) {
                                    iArr2[i9] = java.lang.Integer.parseInt(split5[i9]);
                                }
                                attributes.get(i5).put(str3, androidx.camera.core.impl.utils.ExifAttribute.createSLong(iArr2, builder.mByteOrder));
                                break;
                            case 10:
                                java.lang.String[] split6 = str2.split(",", -1);
                                androidx.camera.core.impl.utils.LongRational[] longRationalArr2 = new androidx.camera.core.impl.utils.LongRational[split6.length];
                                int i10 = 0;
                                while (i10 < split6.length) {
                                    java.lang.String[] split7 = split6[i10].split(str4, -1);
                                    longRationalArr2[i10] = new androidx.camera.core.impl.utils.LongRational((long) java.lang.Double.parseDouble(split7[c]), (long) java.lang.Double.parseDouble(split7[i4]));
                                    i10++;
                                    str4 = str4;
                                    i4 = 1;
                                }
                                builder = this;
                                attributes.get(i5).put(str3, androidx.camera.core.impl.utils.ExifAttribute.createSRational(longRationalArr2, builder.mByteOrder));
                                break;
                            case 12:
                                java.lang.String[] split8 = str2.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i11 = 0; i11 < split8.length; i11++) {
                                    dArr[i11] = java.lang.Double.parseDouble(split8[i11]);
                                }
                                attributes.get(i5).put(str3, androidx.camera.core.impl.utils.ExifAttribute.createDouble(dArr, builder.mByteOrder));
                                break;
                        }
                    }
                }
                i = i5;
                i5 = i + 1;
                i3 = 2;
                c = 0;
                i4 = 1;
            }
        }

        public androidx.camera.core.impl.utils.ExifData build() {
            java.util.ArrayList list = java.util.Collections.list(new java.util.Enumeration<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.3
                final java.util.Enumeration<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> mMapEnumeration;

                {
                    this.mMapEnumeration = java.util.Collections.enumeration(androidx.camera.core.impl.utils.ExifData.Builder.this.mAttributes);
                }

                @Override // java.util.Enumeration
                public boolean hasMoreElements() {
                    return this.mMapEnumeration.hasMoreElements();
                }

                @Override // java.util.Enumeration
                public java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> nextElement() {
                    return new java.util.HashMap(this.mMapEnumeration.nextElement());
                }
            });
            if (!list.get(1).isEmpty()) {
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_PROGRAM, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_EXIF_VERSION, "0230", list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_COMPONENTS_CONFIGURATION, "1,2,3,0", list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_METERING_MODE, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_FLASHPIX_VERSION, "0100", list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, java.lang.String.valueOf(2), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_FILE_SOURCE, java.lang.String.valueOf(3), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_SCENE_TYPE, java.lang.String.valueOf(1), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_CUSTOM_RENDERED, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_SCENE_CAPTURE_TYPE, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_CONTRAST, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_SATURATION, java.lang.String.valueOf(0), list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_SHARPNESS, java.lang.String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_VERSION_ID, "2300", list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, "K", list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK_REF, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION_REF, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING_REF, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE_REF, "K", list);
            }
            return new androidx.camera.core.impl.utils.ExifData(this.mByteOrder, list);
        }

        private static android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat(java.lang.String entryValue) {
            if (entryValue.contains(",")) {
                java.lang.String[] split = entryValue.split(",", -1);
                android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat = guessDataFormat(split[0]);
                if (((java.lang.Integer) guessDataFormat.first).intValue() == 2) {
                    return guessDataFormat;
                }
                for (int i = 1; i < split.length; i++) {
                    android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat2 = guessDataFormat(split[i]);
                    int intValue = (((java.lang.Integer) guessDataFormat2.first).equals(guessDataFormat.first) || ((java.lang.Integer) guessDataFormat2.second).equals(guessDataFormat.first)) ? ((java.lang.Integer) guessDataFormat.first).intValue() : -1;
                    int intValue2 = (((java.lang.Integer) guessDataFormat.second).intValue() == -1 || !(((java.lang.Integer) guessDataFormat2.first).equals(guessDataFormat.second) || ((java.lang.Integer) guessDataFormat2.second).equals(guessDataFormat.second))) ? -1 : ((java.lang.Integer) guessDataFormat.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new android.util.Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        guessDataFormat = new android.util.Pair<>(java.lang.Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        guessDataFormat = new android.util.Pair<>(java.lang.Integer.valueOf(intValue), -1);
                    }
                }
                return guessDataFormat;
            }
            if (entryValue.contains("/")) {
                java.lang.String[] split2 = entryValue.split("/", -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) java.lang.Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) java.lang.Double.parseDouble(split2[1]);
                        if (parseDouble >= 0 && parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                                return new android.util.Pair<>(10, 5);
                            }
                            return new android.util.Pair<>(5, -1);
                        }
                        return new android.util.Pair<>(10, -1);
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                return new android.util.Pair<>(2, -1);
            }
            try {
                try {
                    long parseLong = java.lang.Long.parseLong(entryValue);
                    if (parseLong >= 0 && parseLong <= okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return new android.util.Pair<>(3, 4);
                    }
                    if (parseLong < 0) {
                        return new android.util.Pair<>(9, -1);
                    }
                    return new android.util.Pair<>(4, -1);
                } catch (java.lang.NumberFormatException unused2) {
                    return new android.util.Pair<>(2, -1);
                }
            } catch (java.lang.NumberFormatException unused3) {
                java.lang.Double.parseDouble(entryValue);
                return new android.util.Pair<>(12, -1);
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.ExifData$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState;
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode;

        static {
            int[] iArr = new int[androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.values().length];
            $SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode = iArr;
            try {
                iArr[androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode[androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.values().length];
            $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState = iArr2;
            try {
                iArr2[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }
}
