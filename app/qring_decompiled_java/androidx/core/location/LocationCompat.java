package androidx.core.location;

/* loaded from: classes.dex */
public final class LocationCompat {
    public static final java.lang.String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final java.lang.String EXTRA_IS_MOCK = "mockLocation";
    public static final java.lang.String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final java.lang.String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";
    private static java.lang.reflect.Method sSetIsFromMockProviderMethod;

    private LocationCompat() {
    }

    public static long getElapsedRealtimeNanos(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return androidx.core.location.LocationCompat.Api17Impl.getElapsedRealtimeNanos(location);
        }
        return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(getElapsedRealtimeMillis(location));
    }

    public static long getElapsedRealtimeMillis(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(androidx.core.location.LocationCompat.Api17Impl.getElapsedRealtimeNanos(location));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - location.getTime();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (currentTimeMillis < 0) {
            return elapsedRealtime;
        }
        if (currentTimeMillis > elapsedRealtime) {
            return 0L;
        }
        return elapsedRealtime - currentTimeMillis;
    }

    public static boolean hasVerticalAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.hasVerticalAccuracy(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey("verticalAccuracy");
    }

    public static float getVerticalAccuracyMeters(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.getVerticalAccuracyMeters(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static void setVerticalAccuracyMeters(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.setVerticalAccuracyMeters(location, f);
            return;
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new android.os.Bundle());
            extras = location.getExtras();
        }
        extras.putFloat("verticalAccuracy", f);
    }

    public static boolean hasSpeedAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.hasSpeedAccuracy(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(EXTRA_SPEED_ACCURACY);
    }

    public static float getSpeedAccuracyMetersPerSecond(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.getSpeedAccuracyMetersPerSecond(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_SPEED_ACCURACY, 0.0f);
    }

    public static void setSpeedAccuracyMetersPerSecond(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.setSpeedAccuracyMetersPerSecond(location, f);
            return;
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new android.os.Bundle());
            extras = location.getExtras();
        }
        extras.putFloat(EXTRA_SPEED_ACCURACY, f);
    }

    public static boolean hasBearingAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.hasBearingAccuracy(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(EXTRA_BEARING_ACCURACY);
    }

    public static float getBearingAccuracyDegrees(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.getBearingAccuracyDegrees(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_BEARING_ACCURACY, 0.0f);
    }

    public static void setBearingAccuracyDegrees(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.setBearingAccuracyDegrees(location, f);
            return;
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new android.os.Bundle());
            extras = location.getExtras();
        }
        extras.putFloat(EXTRA_BEARING_ACCURACY, f);
    }

    public static boolean isMock(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            return androidx.core.location.LocationCompat.Api18Impl.isMock(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.getBoolean("mockLocation", false);
    }

    public static void setMock(android.location.Location location, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            try {
                getSetIsFromMockProviderMethod().invoke(location, java.lang.Boolean.valueOf(z));
                return;
            } catch (java.lang.IllegalAccessException e) {
                java.lang.IllegalAccessError illegalAccessError = new java.lang.IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (java.lang.NoSuchMethodException e2) {
                java.lang.NoSuchMethodError noSuchMethodError = new java.lang.NoSuchMethodError();
                noSuchMethodError.initCause(e2);
                throw noSuchMethodError;
            } catch (java.lang.reflect.InvocationTargetException e3) {
                throw new java.lang.RuntimeException(e3);
            }
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            if (z) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("mockLocation", true);
                location.setExtras(bundle);
                return;
            }
            return;
        }
        if (z) {
            extras.putBoolean("mockLocation", true);
            return;
        }
        extras.remove("mockLocation");
        if (extras.isEmpty()) {
            location.setExtras(null);
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
        }

        static boolean hasVerticalAccuracy(android.location.Location location) {
            return location.hasVerticalAccuracy();
        }

        static float getVerticalAccuracyMeters(android.location.Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static void setVerticalAccuracyMeters(android.location.Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }

        static boolean hasSpeedAccuracy(android.location.Location location) {
            return location.hasSpeedAccuracy();
        }

        static float getSpeedAccuracyMetersPerSecond(android.location.Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        static void setSpeedAccuracyMetersPerSecond(android.location.Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        static boolean hasBearingAccuracy(android.location.Location location) {
            return location.hasBearingAccuracy();
        }

        static float getBearingAccuracyDegrees(android.location.Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static void setBearingAccuracyDegrees(android.location.Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }
    }

    private static class Api18Impl {
        private Api18Impl() {
        }

        static boolean isMock(android.location.Location location) {
            return location.isFromMockProvider();
        }
    }

    private static class Api17Impl {
        private Api17Impl() {
        }

        static long getElapsedRealtimeNanos(android.location.Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    private static java.lang.reflect.Method getSetIsFromMockProviderMethod() throws java.lang.NoSuchMethodException {
        if (sSetIsFromMockProviderMethod == null) {
            java.lang.reflect.Method declaredMethod = android.location.Location.class.getDeclaredMethod("setIsFromMockProvider", java.lang.Boolean.TYPE);
            sSetIsFromMockProviderMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return sSetIsFromMockProviderMethod;
    }
}
