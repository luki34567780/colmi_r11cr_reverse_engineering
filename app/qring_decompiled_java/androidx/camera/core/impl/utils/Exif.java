package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
public final class Exif {
    public static final long INVALID_TIMESTAMP = -1;
    private static final java.lang.String KILOMETERS_PER_HOUR = "K";
    private static final java.lang.String KNOTS = "N";
    private static final java.lang.String MILES_PER_HOUR = "M";
    private static final java.lang.String TAG = "Exif";
    private final androidx.exifinterface.media.ExifInterface mExifInterface;
    private boolean mRemoveTimestamp = false;
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> DATE_FORMAT = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.1
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy:MM:dd", java.util.Locale.US);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> TIME_FORMAT = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.2
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("HH:mm:ss", java.util.Locale.US);
        }
    };
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> DATETIME_FORMAT = new java.lang.ThreadLocal<java.text.SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.3
        @Override // java.lang.ThreadLocal
        public java.text.SimpleDateFormat initialValue() {
            return new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", java.util.Locale.US);
        }
    };

    private Exif(androidx.exifinterface.media.ExifInterface exifInterface) {
        this.mExifInterface = exifInterface;
    }

    public static androidx.camera.core.impl.utils.Exif createFromFile(java.io.File file) throws java.io.IOException {
        return createFromFileString(file.toString());
    }

    public static androidx.camera.core.impl.utils.Exif createFromFileString(java.lang.String filePath) throws java.io.IOException {
        return new androidx.camera.core.impl.utils.Exif(new androidx.exifinterface.media.ExifInterface(filePath));
    }

    public static androidx.camera.core.impl.utils.Exif createFromInputStream(java.io.InputStream is) throws java.io.IOException {
        return new androidx.camera.core.impl.utils.Exif(new androidx.exifinterface.media.ExifInterface(is));
    }

    private static java.lang.String convertToExifDateTime(long timestamp) {
        return DATETIME_FORMAT.get().format(new java.util.Date(timestamp));
    }

    private static java.util.Date convertFromExifDateTime(java.lang.String dateTime) throws java.text.ParseException {
        return DATETIME_FORMAT.get().parse(dateTime);
    }

    private static java.util.Date convertFromExifDate(java.lang.String date) throws java.text.ParseException {
        return DATE_FORMAT.get().parse(date);
    }

    private static java.util.Date convertFromExifTime(java.lang.String time) throws java.text.ParseException {
        return TIME_FORMAT.get().parse(time);
    }

    public void save() throws java.io.IOException {
        if (!this.mRemoveTimestamp) {
            attachLastModifiedTimestamp();
        }
        this.mExifInterface.saveAttributes();
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", java.lang.Integer.valueOf(getWidth()), java.lang.Integer.valueOf(getHeight()), java.lang.Integer.valueOf(getRotation()), java.lang.Boolean.valueOf(isFlippedVertically()), java.lang.Boolean.valueOf(isFlippedHorizontally()), getLocation(), java.lang.Long.valueOf(getTimestamp()), getDescription());
    }

    public int getOrientation() {
        return this.mExifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
    }

    public void setOrientation(int orientation) {
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(orientation));
    }

    public int getWidth() {
        return this.mExifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, 0);
    }

    public int getHeight() {
        return this.mExifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, 0);
    }

    public java.lang.String getDescription() {
        return this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_DESCRIPTION);
    }

    public void setDescription(java.lang.String description) {
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_DESCRIPTION, description);
    }

    public int getRotation() {
        switch (getOrientation()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public boolean isFlippedVertically() {
        int orientation = getOrientation();
        return orientation == 4 || orientation == 5 || orientation == 7;
    }

    public boolean isFlippedHorizontally() {
        return getOrientation() == 2;
    }

    private void attachLastModifiedTimestamp() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String convertToExifDateTime = convertToExifDateTime(currentTimeMillis);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME, convertToExifDateTime);
        try {
            this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, java.lang.Long.toString(currentTimeMillis - convertFromExifDateTime(convertToExifDateTime).getTime()));
        } catch (java.text.ParseException unused) {
        }
    }

    public long getLastModifiedTimestamp() {
        long parseTimestamp = parseTimestamp(this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME));
        if (parseTimestamp == -1) {
            return -1L;
        }
        java.lang.String attribute = this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME);
        if (attribute == null) {
            return parseTimestamp;
        }
        try {
            long parseLong = java.lang.Long.parseLong(attribute);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return parseTimestamp + parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return parseTimestamp;
        }
    }

    public long getTimestamp() {
        long parseTimestamp = parseTimestamp(this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL));
        if (parseTimestamp == -1) {
            return -1L;
        }
        java.lang.String attribute = this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL);
        if (attribute == null) {
            return parseTimestamp;
        }
        try {
            long parseLong = java.lang.Long.parseLong(attribute);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return parseTimestamp + parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return parseTimestamp;
        }
    }

    public android.location.Location getLocation() {
        double metersPerSecond;
        java.lang.String attribute = this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD);
        double[] latLong = this.mExifInterface.getLatLong();
        double altitude = this.mExifInterface.getAltitude(0.0d);
        double attributeDouble = this.mExifInterface.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED, 0.0d);
        java.lang.String attribute2 = this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF);
        if (attribute2 == null) {
            attribute2 = "K";
        }
        long parseTimestamp = parseTimestamp(this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP), this.mExifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP));
        if (latLong == null) {
            return null;
        }
        if (attribute == null) {
            attribute = TAG;
        }
        android.location.Location location = new android.location.Location(attribute);
        location.setLatitude(latLong[0]);
        location.setLongitude(latLong[1]);
        if (altitude != 0.0d) {
            location.setAltitude(altitude);
        }
        if (attributeDouble != 0.0d) {
            char c = 65535;
            int hashCode = attribute2.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && attribute2.equals("N")) {
                        c = 1;
                    }
                } else if (attribute2.equals("M")) {
                    c = 0;
                }
            } else if (attribute2.equals("K")) {
                c = 2;
            }
            if (c == 0) {
                metersPerSecond = androidx.camera.core.impl.utils.Exif.Speed.fromMilesPerHour(attributeDouble).toMetersPerSecond();
            } else if (c == 1) {
                metersPerSecond = androidx.camera.core.impl.utils.Exif.Speed.fromKnots(attributeDouble).toMetersPerSecond();
            } else {
                metersPerSecond = androidx.camera.core.impl.utils.Exif.Speed.fromKilometersPerHour(attributeDouble).toMetersPerSecond();
            }
            location.setSpeed((float) metersPerSecond);
        }
        if (parseTimestamp != -1) {
            location.setTime(parseTimestamp);
        }
        return location;
    }

    public void rotate(int degrees) {
        if (degrees % 90 != 0) {
            androidx.camera.core.Logger.w(TAG, java.lang.String.format(java.util.Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", java.lang.Integer.valueOf(degrees)));
            this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(0));
            return;
        }
        int i = degrees % com.amap.api.maps.utils.SpatialRelationUtil.A_CIRCLE_DEGREE;
        int orientation = getOrientation();
        while (i < 0) {
            i += 90;
            switch (orientation) {
                case 2:
                    orientation = 5;
                    break;
                case 3:
                case 8:
                    orientation = 6;
                    break;
                case 4:
                    orientation = 7;
                    break;
                case 5:
                    orientation = 4;
                    break;
                case 6:
                    orientation = 1;
                    break;
                case 7:
                    orientation = 2;
                    break;
                default:
                    orientation = 8;
                    break;
            }
        }
        while (i > 0) {
            i -= 90;
            switch (orientation) {
                case 2:
                    orientation = 7;
                    break;
                case 3:
                    orientation = 8;
                    break;
                case 4:
                    orientation = 5;
                    break;
                case 5:
                    orientation = 2;
                    break;
                case 6:
                    orientation = 3;
                    break;
                case 7:
                    orientation = 4;
                    break;
                case 8:
                    orientation = 1;
                    break;
                default:
                    orientation = 6;
                    break;
            }
        }
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(orientation));
    }

    public void flipVertically() {
        int i;
        switch (getOrientation()) {
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 4;
                break;
        }
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i));
    }

    public void flipHorizontally() {
        int i;
        switch (getOrientation()) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 2;
                break;
        }
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.String.valueOf(i));
    }

    public void attachTimestamp() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String convertToExifDateTime = convertToExifDateTime(currentTimeMillis);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, convertToExifDateTime);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, convertToExifDateTime);
        try {
            java.lang.String l = java.lang.Long.toString(currentTimeMillis - convertFromExifDateTime(convertToExifDateTime).getTime());
            this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, l);
            this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, l);
        } catch (java.text.ParseException unused) {
        }
        this.mRemoveTimestamp = false;
    }

    public void removeTimestamp() {
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, null);
        this.mRemoveTimestamp = true;
    }

    public void attachLocation(android.location.Location location) {
        this.mExifInterface.setGpsInfo(location);
    }

    public void removeLocation() {
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP, null);
        this.mExifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, null);
    }

    private long parseTimestamp(java.lang.String date, java.lang.String time) {
        if (date == null && time == null) {
            return -1L;
        }
        if (time == null) {
            try {
                return convertFromExifDate(date).getTime();
            } catch (java.text.ParseException unused) {
                return -1L;
            }
        }
        if (date == null) {
            try {
                return convertFromExifTime(time).getTime();
            } catch (java.text.ParseException unused2) {
                return -1L;
            }
        }
        return parseTimestamp(date + " " + time);
    }

    private long parseTimestamp(java.lang.String datetime) {
        if (datetime == null) {
            return -1L;
        }
        try {
            return convertFromExifDateTime(datetime).getTime();
        } catch (java.text.ParseException unused) {
            return -1L;
        }
    }

    private static final class Speed {
        private Speed() {
        }

        static androidx.camera.core.impl.utils.Exif.Speed.Converter fromKilometersPerHour(double kph) {
            return new androidx.camera.core.impl.utils.Exif.Speed.Converter(kph * 0.621371d);
        }

        static androidx.camera.core.impl.utils.Exif.Speed.Converter fromMetersPerSecond(double mps) {
            return new androidx.camera.core.impl.utils.Exif.Speed.Converter(mps * 2.23694d);
        }

        static androidx.camera.core.impl.utils.Exif.Speed.Converter fromMilesPerHour(double mph) {
            return new androidx.camera.core.impl.utils.Exif.Speed.Converter(mph);
        }

        static androidx.camera.core.impl.utils.Exif.Speed.Converter fromKnots(double knots) {
            return new androidx.camera.core.impl.utils.Exif.Speed.Converter(knots * 1.15078d);
        }

        static final class Converter {
            final double mMph;

            Converter(double mph) {
                this.mMph = mph;
            }

            double toKilometersPerHour() {
                return this.mMph / 0.621371d;
            }

            double toMilesPerHour() {
                return this.mMph;
            }

            double toKnots() {
                return this.mMph / 1.15078d;
            }

            double toMetersPerSecond() {
                return this.mMph / 2.23694d;
            }
        }
    }
}
