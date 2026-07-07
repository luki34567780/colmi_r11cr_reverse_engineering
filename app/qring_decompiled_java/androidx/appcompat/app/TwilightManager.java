package androidx.appcompat.app;

/* loaded from: classes.dex */
class TwilightManager {
    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final java.lang.String TAG = "TwilightManager";
    private static androidx.appcompat.app.TwilightManager sInstance;
    private final android.content.Context mContext;
    private final android.location.LocationManager mLocationManager;
    private final androidx.appcompat.app.TwilightManager.TwilightState mTwilightState = new androidx.appcompat.app.TwilightManager.TwilightState();

    static androidx.appcompat.app.TwilightManager getInstance(android.content.Context context) {
        if (sInstance == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            sInstance = new androidx.appcompat.app.TwilightManager(applicationContext, (android.location.LocationManager) applicationContext.getSystemService("location"));
        }
        return sInstance;
    }

    static void setInstance(androidx.appcompat.app.TwilightManager twilightManager) {
        sInstance = twilightManager;
    }

    TwilightManager(android.content.Context context, android.location.LocationManager locationManager) {
        this.mContext = context;
        this.mLocationManager = locationManager;
    }

    boolean isNight() {
        androidx.appcompat.app.TwilightManager.TwilightState twilightState = this.mTwilightState;
        if (isStateValid()) {
            return twilightState.isNight;
        }
        android.location.Location lastKnownLocation = getLastKnownLocation();
        if (lastKnownLocation != null) {
            updateState(lastKnownLocation);
            return twilightState.isNight;
        }
        android.util.Log.i(TAG, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = java.util.Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private android.location.Location getLastKnownLocation() {
        android.location.Location lastKnownLocationForProvider = androidx.core.content.PermissionChecker.checkSelfPermission(this.mContext, com.hjq.permissions.Permission.ACCESS_COARSE_LOCATION) == 0 ? getLastKnownLocationForProvider("network") : null;
        android.location.Location lastKnownLocationForProvider2 = androidx.core.content.PermissionChecker.checkSelfPermission(this.mContext, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) == 0 ? getLastKnownLocationForProvider(com.amap.api.services.geocoder.GeocodeSearch.GPS) : null;
        return (lastKnownLocationForProvider2 == null || lastKnownLocationForProvider == null) ? lastKnownLocationForProvider2 != null ? lastKnownLocationForProvider2 : lastKnownLocationForProvider : lastKnownLocationForProvider2.getTime() > lastKnownLocationForProvider.getTime() ? lastKnownLocationForProvider2 : lastKnownLocationForProvider;
    }

    private android.location.Location getLastKnownLocationForProvider(java.lang.String str) {
        try {
            if (this.mLocationManager.isProviderEnabled(str)) {
                return this.mLocationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (java.lang.Exception e) {
            android.util.Log.d(TAG, "Failed to get last known location", e);
            return null;
        }
    }

    private boolean isStateValid() {
        return this.mTwilightState.nextUpdate > java.lang.System.currentTimeMillis();
    }

    private void updateState(android.location.Location location) {
        long j;
        androidx.appcompat.app.TwilightManager.TwilightState twilightState = this.mTwilightState;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        androidx.appcompat.app.TwilightCalculator twilightCalculator = androidx.appcompat.app.TwilightCalculator.getInstance();
        twilightCalculator.calculateTwilight(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = twilightCalculator.sunset;
        twilightCalculator.calculateTwilight(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = twilightCalculator.state == 1;
        long j3 = twilightCalculator.sunrise;
        long j4 = twilightCalculator.sunset;
        boolean z2 = z;
        twilightCalculator.calculateTwilight(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = twilightCalculator.sunrise;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        twilightState.isNight = z2;
        twilightState.yesterdaySunset = j2;
        twilightState.todaySunrise = j3;
        twilightState.todaySunset = j4;
        twilightState.tomorrowSunrise = j5;
        twilightState.nextUpdate = j;
    }

    private static class TwilightState {
        boolean isNight;
        long nextUpdate;
        long todaySunrise;
        long todaySunset;
        long tomorrowSunrise;
        long yesterdaySunset;

        TwilightState() {
        }
    }
}
