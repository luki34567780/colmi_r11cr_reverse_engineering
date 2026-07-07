package com.qcwireless.qcwatch.ui.home.gps.util;

/* compiled from: GpsUtils.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u001a\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0018\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001\u001a\u0018\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001\u001a+\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\"2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0001¢\u0006\u0002\u0010$\u001a\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)\u001a\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0001\u001a\u001e\u0010-\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001\u001a\u0016\u0010.\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001\u001a\u0016\u0010/\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001\u001a\u0016\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001\u001a\u0016\u00103\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001\u001a\u0016\u00104\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0004\b\b\u0010\u0005\"\u001a\u0010\t\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0003\"\u0004\b\u000b\u0010\u0005¨\u00065"}, d2 = {"a", "", "getA", "()D", "setA", "(D)V", "ee", "getEe", "setEe", "pi", "getPi", "setPi", "bd09_To_Gcj02", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/Gps;", "bd_lat", "bd_lon", "calculatePolyLineLength", "", "polyline", "", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/QcLatLon;", "fromText", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "text", "", "gcj02_To_Bd09", "gg_lat", "gg_lon", "gcj_To_Gps84", "lat", "lon", "getAddress", "", "lnt", "(Landroid/content/Context;DD)[Ljava/lang/String;", "getFormattedStopWatchTIme", "ms", "", "includeMillis", "", "getPaceColor", "", "pace", "outOfChina", "transform1", "transform2", "transformLat", "x", "y", "transformLon", "transformMust", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GpsUtilsKt {
    private static double a = 6378245.0d;
    private static double ee = 0.006693421622965943d;
    private static double pi = 3.141592653589793d;

    public static final double getPi() {
        return pi;
    }

    public static final void setPi(double d) {
        pi = d;
    }

    public static final double getA() {
        return a;
    }

    public static final void setA(double d) {
        a = d;
    }

    public static final double getEe() {
        return ee;
    }

    public static final void setEe(double d) {
        ee = d;
    }

    public static final com.qcwireless.qcwatch.ui.home.gps.bean.Gps gcj_To_Gps84(double d, double d2) {
        com.qcwireless.qcwatch.ui.home.gps.bean.Gps transform1 = transform1(d, d2);
        double d3 = 2;
        return new com.qcwireless.qcwatch.ui.home.gps.bean.Gps((d * d3) - transform1.getWgLat(), (d2 * d3) - transform1.getWgLon());
    }

    public static final com.qcwireless.qcwatch.ui.home.gps.bean.Gps gcj02_To_Bd09(double d, double d2) {
        double sqrt = java.lang.Math.sqrt((d2 * d2) + (d * d)) + (java.lang.Math.sin(pi * d) * 2.0E-5d);
        double atan2 = java.lang.Math.atan2(d, d2) + (java.lang.Math.cos(d2 * pi) * 3.0E-6d);
        return new com.qcwireless.qcwatch.ui.home.gps.bean.Gps((sqrt * java.lang.Math.sin(atan2)) + 0.006d, (java.lang.Math.cos(atan2) * sqrt) + 0.0065d);
    }

    public static final com.qcwireless.qcwatch.ui.home.gps.bean.Gps bd09_To_Gcj02(double d, double d2) {
        double d3 = d2 - 0.0065d;
        double d4 = d - 0.006d;
        double sqrt = java.lang.Math.sqrt((d3 * d3) + (d4 * d4)) - (java.lang.Math.sin(pi * d4) * 2.0E-5d);
        double atan2 = java.lang.Math.atan2(d4, d3) - (java.lang.Math.cos(d3 * pi) * 3.0E-6d);
        return new com.qcwireless.qcwatch.ui.home.gps.bean.Gps(sqrt * java.lang.Math.sin(atan2), java.lang.Math.cos(atan2) * sqrt);
    }

    public static final boolean outOfChina(android.content.Context context, double d, double d2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Locale.getDefault().getLanguage(), "language");
        return !kotlin.text.StringsKt.contains$default(r0, "zh", false, 2, (java.lang.Object) null);
    }

    public static final com.qcwireless.qcwatch.ui.home.gps.bean.Gps transformMust(double d, double d2) {
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double transformLat = transformLat(d3, d4);
        double transformLon = transformLon(d3, d4);
        double d5 = (d / 180.0d) * pi;
        double sin = java.lang.Math.sin(d5);
        double d6 = 1;
        double d7 = d6 - ((ee * sin) * sin);
        double sqrt = java.lang.Math.sqrt(d7);
        double d8 = a;
        return new com.qcwireless.qcwatch.ui.home.gps.bean.Gps(d + ((transformLat * 180.0d) / ((((d6 - ee) * d8) / (d7 * sqrt)) * pi)), d2 + ((transformLon * 180.0d) / (((d8 / sqrt) * java.lang.Math.cos(d5)) * pi)));
    }

    public static final com.qcwireless.qcwatch.ui.home.gps.bean.Gps transform1(double d, double d2) {
        if (outOfChina(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT(), d, d2)) {
            return new com.qcwireless.qcwatch.ui.home.gps.bean.Gps(d, d2);
        }
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double transformLat = transformLat(d3, d4);
        double transformLon = transformLon(d3, d4);
        double d5 = (d / 180.0d) * pi;
        double sin = java.lang.Math.sin(d5);
        double d6 = 1;
        double d7 = d6 - ((ee * sin) * sin);
        double sqrt = java.lang.Math.sqrt(d7);
        double d8 = a;
        return new com.qcwireless.qcwatch.ui.home.gps.bean.Gps(d + ((transformLat * 180.0d) / ((((d6 - ee) * d8) / (d7 * sqrt)) * pi)), d2 + ((transformLon * 180.0d) / (((d8 / sqrt) * java.lang.Math.cos(d5)) * pi)));
    }

    public static final com.qcwireless.qcwatch.ui.home.gps.bean.Gps transform2(double d, double d2) {
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
        if (kotlin.text.StringsKt.contains$default(language, "zh", false, 2, (java.lang.Object) null)) {
            double d3 = d2 - 105.0d;
            double d4 = d - 35.0d;
            double transformLat = transformLat(d3, d4);
            double transformLon = transformLon(d3, d4);
            double d5 = (d / 180.0d) * pi;
            double sin = java.lang.Math.sin(d5);
            double d6 = 1;
            double d7 = d6 - ((ee * sin) * sin);
            double sqrt = java.lang.Math.sqrt(d7);
            double d8 = a;
            return new com.qcwireless.qcwatch.ui.home.gps.bean.Gps(d + ((transformLat * 180.0d) / ((((d6 - ee) * d8) / (d7 * sqrt)) * pi)), d2 + ((transformLon * 180.0d) / (((d8 / sqrt) * java.lang.Math.cos(d5)) * pi)));
        }
        return new com.qcwireless.qcwatch.ui.home.gps.bean.Gps(d, d2);
    }

    public static final double transformLat(double d, double d2) {
        double d3 = d * 2.0d;
        return (-100.0d) + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (java.lang.Math.sqrt(java.lang.Math.abs(d)) * 0.2d) + ((((java.lang.Math.sin((d * 6.0d) * pi) * 20.0d) + (java.lang.Math.sin(d3 * pi) * 20.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin(pi * d2) * 20.0d) + (java.lang.Math.sin((d2 / 3.0d) * pi) * 40.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin((d2 / 12.0d) * pi) * 160.0d) + (320 * java.lang.Math.sin((d2 * pi) / 30.0d))) * 2.0d) / 3.0d);
    }

    public static final double transformLon(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (java.lang.Math.sqrt(java.lang.Math.abs(d)) * 0.1d) + ((((java.lang.Math.sin((6.0d * d) * pi) * 20.0d) + (java.lang.Math.sin((d * 2.0d) * pi) * 20.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin(pi * d) * 20.0d) + (java.lang.Math.sin((d / 3.0d) * pi) * 40.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin((d / 12.0d) * pi) * 150.0d) + (java.lang.Math.sin((d / 30.0d) * pi) * 300.0d)) * 2.0d) / 3.0d);
    }

    public static final java.lang.String[] getAddress(android.content.Context context, double d, double d2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String[] strArr = new java.lang.String[2];
        try {
            android.location.Geocoder geocoder = new android.location.Geocoder(context, java.util.Locale.US);
            android.location.Geocoder.isPresent();
            java.util.List<android.location.Address> fromLocation = geocoder.getFromLocation(d, d2, 4);
            if (fromLocation != null && fromLocation.size() > 0) {
                int size = fromLocation.size();
                for (int i = 0; i < size; i++) {
                    android.location.Address address = fromLocation.get(i);
                    java.lang.String locality = address.getLocality();
                    if (android.text.TextUtils.isEmpty(locality)) {
                        locality = address.getSubAdminArea();
                    }
                    if (android.text.TextUtils.isEmpty(locality)) {
                        java.lang.String addressLine = address.getAddressLine(0);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addressLine, "address.getAddressLine(0)");
                        java.lang.Object[] array = new kotlin.text.Regex(",").split(addressLine, 0).toArray(new java.lang.String[0]);
                        if (array != null) {
                            java.lang.String[] strArr2 = (java.lang.String[]) array;
                            if (strArr2.length >= 4) {
                                locality = strArr2[strArr2.length - 4];
                            }
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                    }
                    if (android.text.TextUtils.isEmpty(locality)) {
                        locality = address.getSubLocality();
                    }
                    strArr[1] = locality;
                    strArr[0] = address.getCountryCode();
                    if (!android.text.TextUtils.isEmpty(locality)) {
                        break;
                    }
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return strArr;
    }

    public static /* synthetic */ java.lang.String getFormattedStopWatchTIme$default(long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getFormattedStopWatchTIme(j, z);
    }

    public static final java.lang.String getFormattedStopWatchTIme(long j, boolean z) {
        long hours = java.util.concurrent.TimeUnit.MILLISECONDS.toHours(j);
        long millis = j - java.util.concurrent.TimeUnit.HOURS.toMillis(hours);
        long minutes = java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(millis);
        long millis2 = millis - java.util.concurrent.TimeUnit.MINUTES.toMillis(minutes);
        long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(millis2);
        if (!z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(hours < 10 ? "0" : "");
            sb.append(hours);
            sb.append(':');
            sb.append(minutes < 10 ? "0" : "");
            sb.append(minutes);
            sb.append(':');
            sb.append(seconds >= 10 ? "" : "0");
            sb.append(seconds);
            return sb.toString();
        }
        long millis3 = (millis2 - java.util.concurrent.TimeUnit.SECONDS.toMillis(seconds)) / 10;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(hours < 10 ? "0" : "");
        sb2.append(hours);
        sb2.append(':');
        sb2.append(minutes < 10 ? "0" : "");
        sb2.append(minutes);
        sb2.append(':');
        sb2.append(seconds < 10 ? "0" : "");
        sb2.append(seconds);
        sb2.append(':');
        sb2.append(millis3 >= 10 ? "" : "0");
        sb2.append(millis3);
        return sb2.toString();
    }

    public static final float calculatePolyLineLength(java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "polyline");
        int size = list.size() - 2;
        float f = 0.0f;
        if (size >= 0) {
            int i = 0;
            while (true) {
                com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon qcLatLon = list.get(i);
                int i2 = i + 1;
                com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon qcLatLon2 = list.get(i2);
                float[] fArr = new float[1];
                android.location.Location.distanceBetween(qcLatLon.getLatitude(), qcLatLon.getLongitude(), qcLatLon2.getLatitude(), qcLatLon2.getLongitude(), fArr);
                f += fArr[0];
                if (i == size) {
                    break;
                }
                i = i2;
            }
        }
        return f;
    }

    public static final int getPaceColor(double d) {
        double d2 = d * 2.5d;
        if (d2 >= 15.0d) {
            return -65536;
        }
        if (d2 < 15.0d && d2 >= 11.0d) {
            return android.graphics.Color.argb(255, 255, 97 - ((int) (97 * ((d2 - 11) / 4))), 0);
        }
        if (d2 >= 11.0d || d2 < 7.0d) {
            return -16711936;
        }
        return android.graphics.Color.argb(255, 255, 255 - ((int) (158 * ((d2 - 7) / 4))), 0);
    }

    public static final android.graphics.Bitmap fromText(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(30.0f);
        paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        paint.setColor(-16777216);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paint.getFontMetricsInt(), "paint.fontMetricsInt");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(100, 100, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.content.res.Resources resources = context.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource(resources, com.qcwireless.qcwatch.R.mipmap.gps_flag);
        canvas.drawBitmap(decodeResource, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), paint);
        canvas.drawText(str, 0.0f, (r1.leading - r1.ascent) * 2, paint);
        canvas.save();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "bitmap");
        return createBitmap;
    }
}
